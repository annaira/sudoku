import java.time.Duration;
import java.time.Instant;
import java.util.Set;

public class Sudoku {

    Field s[][];

    public Sudoku(String sudokuAsString) {
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

    public Sudoku(Sudoku another) {
        s = new Field[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (another.s[i][j].isSet())
                    s[i][j] = new Field(Integer.parseInt(another.s[i][j].toString()), i, j);
                else
                    s[i][j] = new Field(0, i, j);
            }
        }
//        this.s = another.s.clone();
    }

    public static void main(String[] args) throws Exception {
        Sudoku sudoku = new Sudoku("000_870_000_000_000_080_920_000_004_050_030_006_000_000_000_004_601_003_030_052_040_600_009_500_009_006_020");

        do {

            sudoku.eachNumberUniqueInColumnRowSquare();
            sudoku.guess();
            sudoku.setAllFieldsWithOneGuess();
            sudoku.guess1();
            sudoku.setAllFieldsWithOneGuess();
        } while (!sudoku.done());
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

        Instant start = Instant.now();

        do {
            eachNumberUniqueInColumnRowSquare();
            sliceAndDice();
            guess();
            guess1();
            //      setAllFieldsWithOneGuess();
        } while (!done() && timeout(start));


        //do {
        //  eachNumberUniqueInColumnRowSquare();
        // sliceAndDice();
        // guess();
        // setAllFieldsWithOneGuess();
        // guess1();
        // setAllFieldsWithOneGuess();
        //       suppositionAndContradiction();
        //   } while (!done() && timeout(start));

        return toString();
    }


    public String solve2() {

        Instant start = Instant.now();

        try {

            do {
                eachNumberUniqueInColumnRowSquare();
                sliceAndDice();
                guess();
                guess1();
                // suppositionAndContradiction();
            } while (!done() && timeout(start));
        } catch (Exception e) {
            return toString();
        }

        return toString();
    }

    private void suppositionAndContradiction() throws Exception {
        for (int i = 1; i <= 9; i++) {
            Row row = row(i);
            for (Field field : row.fields()) {

                //System.out.println("Checking " + field.x + ", " + field.y);

                if (field.isNotSet() && field.guesses.size() == 2) {
                    int[] guesses = field.guesses.stream().mapToInt(Number::intValue).toArray();

                    Sudoku sudoku1 = new Sudoku(this);
                    sudoku1.setField(field, guesses[0]);
                    Sudoku sudoku2 = new Sudoku(this);
                    sudoku2.setField(field, guesses[1]);

                    boolean sudoku1impossible = false, sudoku2impossible = false;

                    try {
                        sudoku1.solve2();
                    } catch (Exception e) {
                        sudoku1impossible = true;
                    }

                    try {
                        sudoku2.solve2();
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
                        return;
                    }
                    if (sudoku2.done() && sudoku2.isValid() && (!sudoku2.isValid() || sudoku1impossible)) {
                        this.s = sudoku2.s;
                        return;
                    }
                }
            }
        }
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

    private boolean timeout(Instant start) {
        return (Duration.between(start, Instant.now()).compareTo(Duration.ofMillis(100)) < 0);
    }

    public boolean done() {
        for (Field[] row : s) {
            for (Field field : row) {
                if (field.isNotSet()) {
                    return false;
                }
            }

        }
        return true;
    }

    private void print() {
        System.out.println("- - - - - - - - - - - - - - - -");

        for (int i = 0; i < 9; i++) {
            System.out.print("|");
            for (int j = 0; j < 9; j++) {
                if (s[i][j].isNotSet())
                    System.out.print("   ");
                else
                    System.out.print(" " + s[i][j] + " ");
                if (j == 2 || j == 5)
                    System.out.print("|");
            }
            System.out.println("|");
            if (i == 2 || i == 5 || i == 8)
                System.out.println("- - - - - - - - - - - - - - - -");
        }
    }

    private void printGuesses() {
        System.out.println("- - - - - - - - - - - - - - - -");

        for (int i = 0; i < 9; i++) {
            System.out.print("||");
            for (int j = 0; j < 9; j++) {
                s[i][j].printGuesses1();
                //System.out.print("|");
                if (j == 2 || j == 5) {
                    System.out.print("|");
                }
            }
            System.out.print("|");
            System.out.println();
            System.out.print("||");
            for (int j = 0; j < 9; j++) {
                s[i][j].printGuesses2();
                // System.out.print(" ");
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
                //  System.out.print(" ");
            }
            System.out.println("|");
            if (i == 2 || i == 5 || i == 8)
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }

    public void guess() throws Exception {

        for (int number = 1; number <= 9; number++) {
            for (int i = 1; i <= 9; i++) {
                Column column = column(i);
                if (column.contains(number)) {
                    for (Field field : column.c) {
                        field.removeFromGuesses(number);
                    }
                }
                Row row = row(i);
                if (row.contains(number)) {
                    for (Field field : row.r) {
                        field.removeFromGuesses(number);
                    }
                }
                Quadrant quadrant = quadrant(i);
                if (quadrant.contains(number)) {
                    for (Field field : quadrant.q) {
                        field.removeFromGuesses(number);
                    }
                }
            }
        }
        //  printGuesses();
    }

    public void guess1() throws Exception {

        boolean foundSomething = false;

        do {

            for (int number = 1; number <= 9; number++) {
                for (int i = 1; i <= 9; i++) {
                    Column column = column(i);
                    for (int j = 0; j < 9; j++) {
                        if (column.c[j].isNotSet()) {
                            Set<Integer> guesses = column.c[j].guesses;
                            if (column.containsGuessesXTimes(guesses)) {
                                foundSomething = column.cleanUpGuesses(guesses);
                            }
                        }
                    }
                }
            }


            for (int number = 1; number <= 9; number++) {
                for (int i = 1; i <= 9; i++) {
                    Row row = row(i);
                    for (int j = 0; j < 9; j++) {
                        if (row.r[j].isNotSet()) {
                            Set<Integer> guesses = row.r[j].guesses;
                            if (row.containsGuessesXTimes(guesses)) {
                                foundSomething = row.cleanUpGuesses(guesses);
                            }
                        }
                    }

                }
            }


            for (int number = 1; number <= 9; number++) {
                for (int i = 1; i <= 9; i++) {
                    Quadrant quadrant = quadrant(i);
                    for (int j = 0; j < 9; j++) {
                        if (quadrant.q[j].isNotSet()) {
                            Set<Integer> guesses = quadrant.q[j].guesses;
                            if (quadrant.containsGuessesXTimes(guesses)) {
                                foundSomething = quadrant.cleanUpGuesses(guesses);
                            }
                        }
                    }

                }
            }
//
            //      for (int number = 1; number <= 9; number++) {
            //          for (int i = 1; i <= 9; i++) {
            //              Quadrant quadrant = quadrant(i);
            //              for (int j = 0; j < 9; j++) {
            //                  if (quadrant.q[j].isNotSet()) {
            //                      Set<Integer> guesses = quadrant.q[j].guesses;
            //                      if (quadrant.containsGuessesXTimes1(guesses)) {
            //                          foundSomething = quadrant.cleanUpGuesses1(guesses);
            //                      }
            //                  }
            //              }
//
            //          }
            //      }


            //       for (int number = 1; number <= 9; number++) {
            //          for (int i = 1; i <= 9; i++) {
            //              Row row = row(i);
            //              for (int j = 0; j < 9; j++) {
            //                  if (row.r[j].isNotSet()) {
            //                      Set<Integer> guesses = row.r[j].guesses;
            //                      if (row.containsGuessesXTimes1(guesses)) {
            //                          foundSomething = row.cleanUpGuesses1(guesses);
            //                      }
            //                  }
            //              }

            //          }
            //      }


            //    for (int number = 1; number <= 9; number++) {
            //        for (int i = 1; i <= 9; i++) {
            //            Column column = column(i);
            //            for (Field field : column.fields()) {
            //                if (field.isNotSet()) {
            //                    Set<Integer> guesses = field.guesses;
            //                    if (column.containsGuessesXTimes1(guesses)) {
            //                        foundSomething = column.cleanUpGuesses1(guesses);
            //                    }
            //                }
            //            }
            //        }
            //    }


        } while (foundSomething);

        //  printGuesses();
    }

    private void setAllFieldsWithOneGuess() {
        for (Field[] row : s) {
            for (Field field : row) {
                if (field.isNotSet() && field.guesses.size() == 1) {
                    field.setValue(field.guesses.iterator().next());
                }
            }
        }
    }

    public void sliceAndDice() throws Exception {

        setAllFieldsWithOneGuess();

        boolean foundSomething;
        int counter = 0;

        do {
            foundSomething = false;

            for (int i = 1; i <= 9; i++) {
                Quadrant square = quadrant(i);
                for (int number = 1; number <= 9; number++) {
                    if (square.containsOnlyInFirstRow(number)) {
                        System.out.println(square.toString() + " containsOnlyInFirstRow " + number);
                        foundSomething = foundSomething || square.removeFromGuessesInRowXWithoutSquare(1, number);
                    }
                    if (square.containsOnlyInSecondRow(number)) {
                        System.out.println(square.toString() + " containsOnlyInSecondRow " + number);

                        foundSomething = foundSomething || square.removeFromGuessesInRowXWithoutSquare(2, number);
                    }
                    if (square.containsOnlyInThirdRow(number)) {
                        System.out.println(square.toString() + " containsOnlyInThirdRow " + number);

                        foundSomething = foundSomething || square.removeFromGuessesInRowXWithoutSquare(3, number);
                    }
                    if (square.containsOnlyInFirstColumn(number)) {
                        System.out.println(square.toString() + " containsOnlyInFirstColumn " + number);

                        foundSomething = foundSomething || square.removeFromGuessesInColumnXWithoutSquare(1, number);
                    }
                    if (square.containsOnlyInSecondColumn(number)) {
                        System.out.println(square.toString() + " containsOnlyInSecondColumn " + number);

                        foundSomething = foundSomething || square.removeFromGuessesInColumnXWithoutSquare(2, number);
                    }
                    if (square.containsOnlyInThridColumn(number)) {
                        System.out.println(square.toString() + " containsOnlyInThridColumn " + number);

                        foundSomething = foundSomething || square.removeFromGuessesInColumnXWithoutSquare(3, number);
                    }
                }
            }
            setAllFieldsWithOneGuess();
            //} while (false);
        } while (foundSomething);// && counter++ < 3);
    }

    public void eachNumberUniqueInColumnRowSquare() throws Exception {

        setAllFieldsWithOneGuess();
        boolean foundSomething;
        do {
            foundSomething = false;
            for (int number = 1; number <= 9; number++) {


                for (int i = 1; i <= 9; i++) {
                    Column column = column(i);
                    if (column.hasOnlyOnePossiblePositionFor(number)) {
                        //   System.out.println("Column " + i + " Number: " + number);
                        s[column.getPossiblePositionFor(number) - 1][i - 1].setValue(number);
                        foundSomething = true;
                        // print();
                    }
                }

                for (int i = 1; i <= 9; i++) {
                    Quadrant quadrant = quadrant(i);
                    if (quadrant.hasOnlyOnePossiblePositionFor(number)) {
                        int[] position = quadrant.getPossiblePositionFor(number);
                        // System.out.println("Quadrant: " + i + " Number: " + number + "  (" + position[0] + ", " + position[1] + ")");
                        s[position[1]][position[0]].setValue(number);
                        foundSomething = true;
                        //print();
                    }
                }

                for (int i = 1; i <= 9; i++) {
                    Row row = row(i);
                    if (row.hasOnlyOnePossiblePositionFor(number)) {
                        //  System.out.println("Row " + i + " Number: " + number);
                        s[i - 1][row.getPossiblePositionFor(number) - 1].setValue(number);
                        foundSomething = true;
                        // print();
                    }
                }
            }
            setAllFieldsWithOneGuess();
            //  print();
        } while (foundSomething);
        //    } while (false);
        //   print();
    }

    protected Row row(int numberOfRow) {
        return new Row(this, numberOfRow);
    }

    protected Column column(int numberOfColumn) {
        return new Column(this, numberOfColumn);
    }

    protected Quadrant quadrant(int numberOfColumn, int numberOfRow) throws Exception {
        return new Quadrant(this, numberOfColumn, numberOfRow);
    }

    protected Quadrant quadrant(int numberOfQuadrant) throws Exception {
        return new Quadrant(this, numberOfQuadrant);
    }

    public boolean isValid() throws Exception {
        for (int i = 1; i <= 9; i++) {
            if (!row(i).isValid())
                return false;
            if (!column(i).isValid())
                return false;
            if (!quadrant(i).isValid())
                return false;
        }
        return true;
    }

}
