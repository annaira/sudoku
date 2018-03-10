import java.util.Set;

public class Sudoku {

    Field s[][];

    Sudoku(String sudokuAsString) {
        s = new Field[9][9];

        sudokuAsString = sudokuAsString.replaceAll("_", "");
        sudokuAsString = sudokuAsString.replaceAll("\\.", "0");

        //       System.out.println(sudokuAsString);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                s[i][j] = new Field(Integer.parseInt(sudokuAsString.substring((i * 9 + j), (i * 9 + j + 1))), i, j);
            }
        }

        // print();
    }

    Sudoku(Sudoku another) {
        s = new Field[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (another.s[i][j].isSet())
                    s[i][j] = new Field(Integer.parseInt(another.s[i][j].toString()), i, j);
                else
                    s[i][j] = new Field(0, i, j);
            }
        }
    }

    public String toURL() {
        StringBuilder builder = new StringBuilder("https://www.surfpoeten.de/sudoku?");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                builder.append("s").append(i * 9 + j).append("=").append(s[i][j]).append("&");
            }
        }

        builder.append("max=10&solve=L%C3%B6sung%28en%29+suchen&id=9#answer");

        return builder.toString();
    }

    public String solve() throws Exception {

        boolean somethingChanged;
        do {
            somethingChanged = setFieldsWithOnlyOneGuess();
            somethingChanged = somethingChanged || setNumbersWithOnlyOnePossibility();
            somethingChanged = somethingChanged || sliceAndDice();
            somethingChanged = somethingChanged || exclusiveGuesses();
            somethingChanged = somethingChanged || suppositionAndContradiction();

            if (!isValid()) throw new SudokuException("not valid");
        } while (!done() && somethingChanged);

//        printGuesses();

        return toString();
    }

    private boolean exclusiveGuesses() {
        boolean somethingChanged = false;

        // Check all the rows
        for (int i = 0; i < 9; i++) {
            Fields row = row(i);
            for (int j = 0; j < 9; j++) {
                Set<Integer> guesses = row.get(j).guesses;
                if (row.containsExclusiveGuesses(guesses)) {
                    somethingChanged = somethingChanged || row.removeGuessesWhereNotEquals(guesses);
                }
            }
        }

        // Check all the columns
        for (int i = 0; i < 9; i++) {
            Fields column = column(i);
            for (int j = 0; j < 9; j++) {
                Set<Integer> guesses = column.get(j).guesses;
                if (column.containsExclusiveGuesses(guesses)) {
                    somethingChanged = somethingChanged || column.removeGuessesWhereNotEquals(guesses);
                }
            }
        }

        // Check all the squares
        for (int i = 0; i < 9; i++) {
            Fields square = square(i);
            for (int j = 0; j < 9; j++) {
                Set<Integer> guesses = square.get(j).guesses;
                if (square.containsExclusiveGuesses(guesses)) {
                    somethingChanged = somethingChanged || square.removeGuessesWhereNotEquals(guesses);
                }
            }
        }


        return somethingChanged;
    }

    private boolean setNumbersWithOnlyOnePossibility() {
        boolean somethingChanged = false;

        // Check all the rows
        for (int i = 0; i < 9; i++) {
            Fields row = row(i);
            for (int number = 1; number <= 9; number++) {
                if (row.doesNotContain(number)) {
                    Field[] possiblePositionsForNumber = row.possiblePositionsForNumber(number);
                    if (possiblePositionsForNumber.length == 1) {
                        possiblePositionsForNumber[0].setValue(number);
                        somethingChanged = true;
                    }
                }
            }
        }
        // Set all the columns
        for (int i = 0; i < 9; i++) {
            Fields column = new Fields(s[0][i], s[1][i], s[2][i], s[3][i], s[4][i], s[5][i], s[6][i], s[7][i], s[8][i]);
            for (int number = 1; number <= 9; number++) {
                if (column.doesNotContain(number)) {
                    Field[] possiblePositionsForNumber = column.possiblePositionsForNumber(number);
                    if (possiblePositionsForNumber.length == 1) {
                        possiblePositionsForNumber[0].setValue(number);
                        somethingChanged = true;
                    }
                }
            }
        }

        // Set all the squares
        for (int i = 0; i < 9; i++) {
            Fields square = new Fields(s[0][i], s[1][i], s[2][i], s[3][i], s[4][i], s[5][i], s[6][i], s[7][i], s[8][i]);
            for (int number = 1; number <= 9; number++) {
                if (square.doesNotContain(number)) {
                    Field[] possiblePositionsForNumber = square.possiblePositionsForNumber(number);
                    if (possiblePositionsForNumber.length == 1) {
                        possiblePositionsForNumber[0].setValue(number);
                        somethingChanged = true;
                    }
                }
            }
        }
        return somethingChanged;
    }

    private boolean setFieldsWithOnlyOneGuess() {
        boolean somethingChanged = false;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Field field = s[i][j];
                if (field.isSet()) {
                    somethingChanged = somethingChanged || row(field).removeGuess(field.getValue());
                    somethingChanged = somethingChanged || column(field).removeGuess(field.getValue());
                    somethingChanged = somethingChanged || square(field).removeGuess(field.getValue());
                }
                // System.out.println(s[i][j].toString() + s[i][j].guesses);
            }
        }
        return somethingChanged;
    }

    private boolean sliceAndDice() {
        boolean somethingChanged = false;

        for (int squareNumber = 0; squareNumber < 9; squareNumber++) {
            Fields square = square(squareNumber);
            for (int number = 1; number <= 9; number++) {
                if (square.doesNotContain(number)) {
                    for (int squareRow = 0; squareRow < 3; squareRow++) {
                        if (square.numberOnlyInGuessesOfSquareRow(number, squareRow)) {
                            somethingChanged = somethingChanged || row(squareRow, squareNumber).rowWithoutSquare(squareNumber).removeGuess(number);
                        }
                    }
                    for (int squareColumn = 0; squareColumn < 3; squareColumn++) {
                        if (square.numberOnlyInGuessesOfSquareColumn(number, squareColumn)) {
                            somethingChanged = somethingChanged || column(squareColumn, squareNumber).columnWithoutSquare(squareNumber).removeGuess(number);
                        }
                    }
                }
            }
        }
        return somethingChanged;
    }


    private Fields row(int squareRow, int squareNumber) {
        switch (squareNumber) {
            case 0:
            case 1:
            case 2:
                switch (squareRow) {
                    case 0:
                        return row(0);
                    case 1:
                        return row(1);
                    case 2:
                        return row(2);
                    default:
                        throw new SudokuException("");
                }
            case 3:
            case 4:
            case 5:
                switch (squareRow) {
                    case 0:
                        return row(3);
                    case 1:
                        return row(4);
                    case 2:
                        return row(5);
                    default:
                        throw new SudokuException("");
                }
            case 6:
            case 7:
            case 8:
                switch (squareRow) {
                    case 0:
                        return row(6);
                    case 1:
                        return row(7);
                    case 2:
                        return row(8);
                    default:
                        throw new SudokuException("");
                }
            default:
                throw new SudokuException("");
        }
    }

    private Fields column(int squareColumn, int squareNumber) {
        switch (squareNumber) {
            case 0:
            case 3:
            case 6:
                switch (squareColumn) {
                    case 0:
                        return column(0);
                    case 1:
                        return column(1);
                    case 2:
                        return column(2);
                    default:
                        throw new SudokuException("");
                }
            case 1:
            case 4:
            case 7:
                switch (squareColumn) {
                    case 0:
                        return column(3);
                    case 1:
                        return column(4);
                    case 2:
                        return column(5);
                    default:
                        throw new SudokuException("");
                }
            case 2:
            case 5:
            case 8:
                switch (squareColumn) {
                    case 0:
                        return column(6);
                    case 1:
                        return column(7);
                    case 2:
                        return column(8);
                    default:
                        throw new SudokuException("");
                }
            default:
                throw new SudokuException("");
        }
    }

    private Fields column(Field field) {
        return column(field.y);
    }

    Fields column(int numberOfColumn) {
        return new Fields(s[0][numberOfColumn], s[1][numberOfColumn], s[2][numberOfColumn], s[3][numberOfColumn], s[4][numberOfColumn], s[5][numberOfColumn], s[6][numberOfColumn],
                s[7][numberOfColumn], s[8][numberOfColumn]);
    }

    private Fields row(Field field) {
        return row(field.x);
    }

    Fields row(int numberOfRow) {
        return new Fields(s[numberOfRow]);
    }

    Fields square(int numberOfSquare) {
        switch (numberOfSquare) {
            case 0:
                return new Fields(s[0][0], s[0][1], s[0][2], s[1][0], s[1][1], s[1][2], s[2][0], s[2][1], s[2][2]);
            case 1:
                return new Fields(s[0][3], s[0][4], s[0][5], s[1][3], s[1][4], s[1][5], s[2][3], s[2][4], s[2][5]);
            case 2:
                return new Fields(s[0][6], s[0][7], s[0][8], s[1][6], s[1][7], s[1][8], s[2][6], s[2][7], s[2][8]);
            case 3:
                return new Fields(s[3][0], s[3][1], s[3][2], s[4][0], s[4][1], s[4][2], s[5][0], s[5][1], s[5][2]);
            case 4:
                return new Fields(s[3][3], s[3][4], s[3][5], s[4][3], s[4][4], s[4][5], s[5][3], s[5][4], s[5][5]);
            case 5:
                return new Fields(s[3][6], s[3][7], s[3][8], s[4][6], s[4][7], s[4][8], s[5][6], s[5][7], s[5][8]);
            case 6:
                return new Fields(s[6][0], s[6][1], s[6][2], s[7][0], s[7][1], s[7][2], s[8][0], s[8][1], s[8][2]);
            case 7:
                return new Fields(s[6][3], s[6][4], s[6][5], s[7][3], s[7][4], s[7][5], s[8][3], s[8][4], s[8][5]);
            case 8:
                return new Fields(s[6][6], s[6][7], s[6][8], s[7][6], s[7][7], s[7][8], s[8][6], s[8][7], s[8][8]);
            default:
                throw new SudokuException("There is no square " + numberOfSquare);
        }
    }


    Fields square(Field field) {
        if (field.x < 3 && field.y < 3) {
            return square(0);
        }
        if (field.x < 3 && field.y < 6) {
            return square(1);
        }
        if (field.x < 3 && field.y < 9) {
            return square(2);
        }
        if (field.x < 6 && field.y < 3) {
            return square(3);
        }
        if (field.x < 6 && field.y < 6) {
            return square(4);
        }
        if (field.x < 6 && field.y < 9) {
            return square(5);
        }
        if (field.x < 9 && field.y < 3) {
            return square(6);
        }
        if (field.x < 9 && field.y < 6) {
            return square(7);
        }
        if (field.x < 9 && field.y < 9) {
            return square(8);
        }
        throw new SudokuException("No square found for field " + field);
    }

    private boolean suppositionAndContradiction() throws Exception {
        for (int i = 0; i < 9; i++) {
            Fields row = row(i);
            for (Field field : row.get()) {

                if (field.isNotSet() && field.guesses.size() == 2) {
                    int[] guesses = field.guesses.stream().mapToInt(Number::intValue).toArray();

                    Sudoku sudoku1 = new Sudoku(this);
                    sudoku1.setField(field, guesses[0]);
                    Sudoku sudoku2 = new Sudoku(this);
                    sudoku2.setField(field, guesses[1]);

                    boolean sudoku1impossible = false;
                    boolean sudoku2impossible = false;

                    try {
                        sudoku1.solve();
                    } catch (Exception e) {
                        sudoku1impossible = true;
                    }

                    try {
                        sudoku2.solve();
                    } catch (Exception e) {
                        sudoku2impossible = true;
                    }

                    if ((sudoku1.done() && sudoku1.isValid()) && (sudoku2.done() && sudoku2.isValid())) {
                        throw new SudokuException("Not eindeutig \n" + sudoku1.solve() + "\n" + sudoku2.solve());
                    }
                    if (sudoku1impossible && sudoku2impossible) {
                        throw new SudokuException("impossible");
                    }
                    if (sudoku1.done() && sudoku1.isValid() && (!sudoku2.isValid() || sudoku2impossible)) {
                        this.s = sudoku1.s;
                        return true;
                    }
                    if (sudoku2.done() && sudoku2.isValid() && (!sudoku2.isValid() || sudoku1impossible)) {
                        this.s = sudoku2.s;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    void setField(Field field, int guess) {
        if (s[field.x][field.y].isSet())
            throw new SudokuException("What are you doing?");
        else s[field.x][field.y].setValue(guess);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Field[] row : s) {
            for (Field field : row) {
                if (field.isSet())
                    builder.append(field.toString());
                else
                    builder.append("_");
            }
        }
        return builder.toString();
    }

    private boolean done() {
        for (Field[] row : s) {
            for (Field field : row) {
                if (field.isNotSet()) {
                    return false;
                }
            }

        }
        return true;
    }

    private void printGuesses() {
        System.out.println("- - - - - - - - - - - - - - - -");

        for (int i = 0; i < 9; i++) {
            System.out.print("||");
            for (int j = 0; j < 9; j++) {
                s[i][j].printGuesses1();
                if (j == 2 || j == 5) {
                    System.out.print("|");
                }
            }
            System.out.print("|");
            System.out.println();
            System.out.print("||");
            for (int j = 0; j < 9; j++) {
                s[i][j].printGuesses2();
                if (j == 2 || j == 5)
                    System.out.print("|");
            }
            System.out.print("|");
            System.out.println();
            System.out.print("||");
            for (int j = 0; j < 9; j++) {
                s[i][j].printGuesses3();
                if (j == 2 || j == 5)
                    System.out.print("|");
            }
            System.out.println("|");
            if (i == 2 || i == 5 || i == 8)
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }

    private boolean isValid() {
        for (int i = 0; i < 9; i++) {
            if (row(i).isNotValid())
                return false;
            if (column(i).isNotValid())
                return false;
            if (square(i).isNotValid())
                return false;
        }
        return true;
    }

}
