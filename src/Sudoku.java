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
            setAllFieldsWithOneGuess();
            guess1();
            setAllFieldsWithOneGuess();
        } while (!done() && timeout(start));


        do {
            eachNumberUniqueInColumnRowSquare();
            sliceAndDice();
            guess();
            setAllFieldsWithOneGuess();
            guess1();
            setAllFieldsWithOneGuess();
            suppositionAndContradiction();
        } while (!done() && timeout(start));

        return toString();
    }


    public String solve2() {

        Instant start = Instant.now();

        try {

            do {
                eachNumberUniqueInColumnRowSquare();
                sliceAndDice();
                guess();
                setAllFieldsWithOneGuess();
                guess1();
                setAllFieldsWithOneGuess();
                // suppositionAndContradiction();
            } while (!done() && timeout(start));
        } catch (Exception e) {
            return toString();
        }

        return toString();
    }

    private void suppositionAndContradiction() throws Exception {
        for (int i = 0; i < 9; i++) {
            Row row = row(i + 1);
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
                        field.setValue(guesses[0]);
                        return;
                    }
                    if (sudoku2.done() && sudoku2.isValid() && (!sudoku2.isValid() || sudoku1impossible)) {
                        field.setValue(guesses[1]);
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
                SudokuColumn column = column(i);
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
                    SudokuColumn column = column(i);
                    for (int j = 0; j < 9; j++) {
                        Set<Integer> guesses = column.c[j].guesses;
                        if (column.containsGuessesXTimes(guesses)) {
                            foundSomething = column.cleanUpGuesses(guesses);
                        }
                    }

                }
            }


            for (int number = 1; number <= 9; number++) {
                for (int i = 1; i <= 9; i++) {
                    Row row = row(i);
                    for (int j = 0; j < 9; j++) {
                        Set<Integer> guesses = row.r[j].guesses;
                        if (row.containsGuessesXTimes(guesses)) {
                            foundSomething = row.cleanUpGuesses(guesses);
                        }
                    }

                }
            }


            for (int number = 1; number <= 9; number++) {
                for (int i = 1; i <= 9; i++) {
                    Quadrant quadrant = quadrant(i);
                    for (int j = 0; j < 9; j++) {
                        Set<Integer> guesses = quadrant.q[j].guesses;
                        if (quadrant.containsGuessesXTimes(guesses)) {
                            foundSomething = quadrant.cleanUpGuesses(guesses);
                        }
                    }

                }
            }

            for (int number = 1; number <= 9; number++) {
                for (int i = 1; i <= 9; i++) {
                    Quadrant quadrant = quadrant(i);
                    for (int j = 0; j < 9; j++) {
                        Set<Integer> guesses = quadrant.q[j].guesses;
                        if (quadrant.containsGuessesXTimes1(guesses)) {
                            foundSomething = quadrant.cleanUpGuesses1(guesses);
                        }
                    }

                }
            }


            for (int number = 1; number <= 9; number++) {
                for (int i = 1; i <= 9; i++) {
                    Row row = row(i);
                    for (int j = 0; j < 9; j++) {
                        Set<Integer> guesses = row.r[j].guesses;
                        if (row.containsGuessesXTimes1(guesses)) {
                            foundSomething = row.cleanUpGuesses1(guesses);
                        }
                    }

                }
            }


            for (int number = 1; number <= 9; number++) {
                for (int i = 1; i <= 9; i++) {
                    SudokuColumn column = column(i);
                    for (int j = 0; j < 9; j++) {
                        Set<Integer> guesses = column.c[j].guesses;
                        if (column.containsGuessesXTimes1(guesses)) {
                            foundSomething = column.cleanUpGuesses1(guesses);
                        }
                    }
                }
            }


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
                        foundSomething = foundSomething || square.removeFromGuessesInRowXWithoutSquare(1, number);
                    }
                    if (square.containsOnlyInSecondRow(number)) {
                        foundSomething = foundSomething || square.removeFromGuessesInRowXWithoutSquare(2, number);
                    }
                    if (square.containsOnlyInThirdRow(number)) {
                        foundSomething = foundSomething || square.removeFromGuessesInRowXWithoutSquare(3, number);
                    }
                    if (square.containsOnlyInFirstColumn(number)) {
                        foundSomething = foundSomething || square.removeFromGuessesInColumnXWithoutSquare(1, number);
                    }
                    if (square.containsOnlyInSecondColumn(number)) {
                        foundSomething = foundSomething || square.removeFromGuessesInColumnXWithoutSquare(2, number);
                    }
                    if (square.containsOnlyInThridColumn(number)) {
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
                    SudokuColumn column = column(i);
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
        return new Row(numberOfRow);
    }

    protected SudokuColumn column(int numberOfColumn) {
        return new SudokuColumn(numberOfColumn);
    }

    protected Quadrant quadrant(int numberOfColumn, int numberOfRow) throws Exception {
        return new Quadrant(numberOfColumn, numberOfRow);
    }

    protected Quadrant quadrant(int numberOfQuadrant) throws Exception {
        return new Quadrant(numberOfQuadrant);
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

    public class SudokuColumn extends Element {

        Field[] c;
        int numberOfColumn;

        public SudokuColumn(int numberOfColumn) {
            this.numberOfColumn = numberOfColumn;
            c = new Field[]{
                    s[0][numberOfColumn - 1], s[1][numberOfColumn - 1], s[2][numberOfColumn - 1],
                    s[3][numberOfColumn - 1], s[4][numberOfColumn - 1], s[5][numberOfColumn - 1],
                    s[6][numberOfColumn - 1], s[7][numberOfColumn - 1], s[8][numberOfColumn - 1]};
        }

        public boolean hasOnlyOnePossiblePositionFor(int number) throws Exception {
            if (contains(number))
                return false;
            int numberOfPossiblePositions = 0;
            for (int i = 0; i < 9; i++) {
                Row row = row(i + 1);
                Quadrant quadrant = quadrant(numberOfColumn, i + 1);
                if (c[i].isNotSet() && !row.contains(number) && !quadrant.contains(number))
                    numberOfPossiblePositions++;
            }
            return numberOfPossiblePositions == 1;
        }

        public int getPossiblePositionFor(int number) throws Exception {
            for (int i = 0; i < 9; i++) {
                Row row = row(i + 1);
                Quadrant quadrant = quadrant(numberOfColumn, i + 1);
                if (c[i].isNotSet() && !row.contains(number) && !quadrant.contains(number))
                    return i + 1;
            }
            throw new Exception("No position possible.");
        }

        @Override
        protected Field[] fields() {
            return c;
        }

        @Override
        protected int number() {
            return numberOfColumn;
        }

    }

    public class Quadrant extends Element {

        Field[] q;
        int quadrantNumber;

        public Quadrant(int numberOfColumn, int numberOfRow) throws Exception {

            this.quadrantNumber = determineQuadrantNumber(numberOfColumn, numberOfRow);

            getQuadrantByNumber(quadrantNumber);
        }

        public Quadrant(int quadrantNumber) throws Exception {
            this.quadrantNumber = quadrantNumber;

            getQuadrantByNumber(quadrantNumber);

        }

        private void getQuadrantByNumber(int quadrantNumber) {
            switch (quadrantNumber) {
                case 1:
                    q = new Field[]{
                            s[0][0], s[0][1], s[0][2],
                            s[1][0], s[1][1], s[1][2],
                            s[2][0], s[2][1], s[2][2]};
                    break;
                case 2:
                    q = new Field[]{
                            s[0][3], s[0][4], s[0][5],
                            s[1][3], s[1][4], s[1][5],
                            s[2][3], s[2][4], s[2][5]};
                    break;
                case 3:
                    q = new Field[]{
                            s[0][6], s[0][7], s[0][8],
                            s[1][6], s[1][7], s[1][8],
                            s[2][6], s[2][7], s[2][8]};
                    break;
                case 4:
                    q = new Field[]{
                            s[3][0], s[3][1], s[3][2],
                            s[4][0], s[4][1], s[4][2],
                            s[5][0], s[5][1], s[5][2]};
                    break;
                case 5:
                    q = new Field[]{
                            s[3][3], s[3][4], s[3][5],
                            s[4][3], s[4][4], s[4][5],
                            s[5][3], s[5][4], s[5][5]};
                    break;
                case 6:
                    q = new Field[]{
                            s[3][6], s[3][7], s[3][8],
                            s[4][6], s[4][7], s[4][8],
                            s[5][6], s[5][7], s[5][8]};
                    break;
                case 7:
                    q = new Field[]{
                            s[6][0], s[6][1], s[6][2],
                            s[7][0], s[7][1], s[7][2],
                            s[8][0], s[8][1], s[8][2]};
                    break;
                case 8:
                    q = new Field[]{
                            s[6][3], s[6][4], s[6][5],
                            s[7][3], s[7][4], s[7][5],
                            s[8][3], s[8][4], s[8][5]};
                    break;
                case 9:
                    q = new Field[]{
                            s[6][6], s[6][7], s[6][8],
                            s[7][6], s[7][7], s[7][8],
                            s[8][6], s[8][7], s[8][8]};
                    break;

            }
        }


        private int determineQuadrantNumber(int numberOfColumn, int numberOfRow) throws Exception {
            if (numberOfColumn < 1 || numberOfRow < 1) {
                throw new Exception("Ooopsie, no quadrant for " + numberOfColumn + " and " + numberOfRow + " found.");
            }
            if (numberOfColumn <= 3) {
                if (numberOfRow <= 3) return 1;
                if (numberOfRow <= 6) return 4;
                if (numberOfRow <= 9) return 7;
            }
            if (numberOfColumn <= 6) {
                if (numberOfRow <= 3) return 2;
                if (numberOfRow <= 6) return 5;
                if (numberOfRow <= 9) return 8;
            }
            if (numberOfColumn <= 9) {
                if (numberOfRow <= 3) return 3;
                if (numberOfRow <= 6) return 6;
                if (numberOfRow <= 9) return 9;
            }
            throw new Exception("No quadrant for column " + numberOfColumn + " and row" + numberOfRow + " found.");
        }

        public boolean containsOnlyInFirstRow(int number) {
            return (q[0].guesses.contains(number) || q[1].guesses.contains(number) || q[2].guesses.contains(number)) &&
                    (!q[3].guesses.contains(number) && !q[4].guesses.contains(number) && !q[5].guesses.contains(number) &&
                            !q[6].guesses.contains(number) && !q[7].guesses.contains(number) && !q[8].guesses.contains(number));
        }

        public boolean containsOnlyInSecondRow(int number) {
            return (q[3].guesses.contains(number) || q[4].guesses.contains(number) || q[5].guesses.contains(number)) &&
                    (!q[0].guesses.contains(number) && !q[1].guesses.contains(number) && !q[2].guesses.contains(number) &&
                            !q[6].guesses.contains(number) && !q[7].guesses.contains(number) && !q[8].guesses.contains(number));
        }

        public boolean containsOnlyInThirdRow(int number) {
            return (q[6].guesses.contains(number) || q[7].guesses.contains(number) || q[8].guesses.contains(number)) &&
                    (!q[0].guesses.contains(number) && !q[1].guesses.contains(number) && !q[2].guesses.contains(number) &&
                            !q[3].guesses.contains(number) && !q[4].guesses.contains(number) && !q[5].guesses.contains(number));
        }

        public boolean containsOnlyInFirstColumn(int number) {
            return (q[0].guesses.contains(number) || q[3].guesses.contains(number) || q[6].guesses.contains(number)) &&
                    (!q[1].guesses.contains(number) && !q[2].guesses.contains(number) && !q[4].guesses.contains(number) &&
                            !q[5].guesses.contains(number) && !q[7].guesses.contains(number) && !q[8].guesses.contains(number));
        }

        public boolean containsOnlyInSecondColumn(int number) {
            return (q[1].guesses.contains(number) || q[4].guesses.contains(number) || q[7].guesses.contains(number)) &&
                    (!q[0].guesses.contains(number) && !q[2].guesses.contains(number) && !q[3].guesses.contains(number) &&
                            !q[5].guesses.contains(number) && !q[6].guesses.contains(number) && !q[8].guesses.contains(number));
        }

        public boolean containsOnlyInThridColumn(int number) {
            return (q[2].guesses.contains(number) || q[5].guesses.contains(number) || q[8].guesses.contains(number)) &&
                    (!q[0].guesses.contains(number) && !q[1].guesses.contains(number) && !q[3].guesses.contains(number) &&
                            !q[4].guesses.contains(number) && !q[6].guesses.contains(number) && !q[7].guesses.contains(number));
        }

        @Override
        protected Field[] fields() {
            return q;
        }

        @Override
        protected int number() {
            return quadrantNumber;
        }

        public boolean hasOnlyOnePossiblePositionFor(int number) throws Exception {
            if (contains(number))
                return false;
            int numberOfPossiblePositions = 0;
            Row[] rows = rows();
            SudokuColumn[] columns = columns();
            if (q[0].isNotSet() && !columns[0].contains(number) && !rows[0].contains(number))
                numberOfPossiblePositions++;
            if (q[1].isNotSet() && !columns[1].contains(number) && !rows[0].contains(number))
                numberOfPossiblePositions++;
            if (q[2].isNotSet() && !columns[2].contains(number) && !rows[0].contains(number))
                numberOfPossiblePositions++;
            if (q[3].isNotSet() && !columns[0].contains(number) && !rows[1].contains(number))
                numberOfPossiblePositions++;
            if (q[4].isNotSet() && !columns[1].contains(number) && !rows[1].contains(number))
                numberOfPossiblePositions++;
            if (q[5].isNotSet() && !columns[2].contains(number) && !rows[1].contains(number))
                numberOfPossiblePositions++;
            if (q[6].isNotSet() && !columns[0].contains(number) && !rows[2].contains(number))
                numberOfPossiblePositions++;
            if (q[7].isNotSet() && !columns[1].contains(number) && !rows[2].contains(number))
                numberOfPossiblePositions++;
            if (q[8].isNotSet() && !columns[2].contains(number) && !rows[2].contains(number))
                numberOfPossiblePositions++;
            return numberOfPossiblePositions == 1;
        }

        private Row[] rows() throws Exception {
            switch (quadrantNumber) {
                case 1:
                case 2:
                case 3:
                    return new Row[]{row(1), row(2), row(3)};
                case 4:
                case 5:
                case 6:
                    return new Row[]{row(4), row(5), row(6)};
                case 7:
                case 8:
                case 9:
                    return new Row[]{row(7), row(8), row(9)};
            }
            throw new Exception("No quadrant for row " + quadrantNumber + " found.");
        }


        private SudokuColumn[] columns() throws Exception {
            switch (quadrantNumber) {
                case 1:
                case 4:
                case 7:
                    return new SudokuColumn[]{column(1), column(2), column(3)};
                case 2:
                case 5:
                case 8:
                    return new SudokuColumn[]{column(4), column(5), column(6)};
                case 3:
                case 6:
                case 9:
                    return new SudokuColumn[]{column(7), column(8), column(9)};
            }
            throw new Exception("No quadrant for row " + quadrantNumber + " found.");
        }

        public int[] getPossiblePositionFor(int number) throws Exception {
            Row[] rows = rows();
            SudokuColumn[] columns = columns();
            if (q[0].isNotSet() && !columns[0].contains(number) && !rows[0].contains(number))
                return new int[]{columns[0].numberOfColumn - 1, rows[0].numberOfRow - 1};
            if (q[1].isNotSet() && !columns[1].contains(number) && !rows[0].contains(number))
                return new int[]{columns[1].numberOfColumn - 1, rows[0].numberOfRow - 1};
            if (q[2].isNotSet() && !columns[2].contains(number) && !rows[0].contains(number))
                return new int[]{columns[2].numberOfColumn - 1, rows[0].numberOfRow - 1};
            if (q[3].isNotSet() && !columns[0].contains(number) && !rows[1].contains(number))
                return new int[]{columns[0].numberOfColumn - 1, rows[1].numberOfRow - 1};
            if (q[4].isNotSet() && !columns[1].contains(number) && !rows[1].contains(number))
                return new int[]{columns[1].numberOfColumn - 1, rows[1].numberOfRow - 1};
            if (q[5].isNotSet() && !columns[2].contains(number) && !rows[1].contains(number))
                return new int[]{columns[2].numberOfColumn - 1, rows[1].numberOfRow - 1};
            if (q[6].isNotSet() && !columns[0].contains(number) && !rows[2].contains(number))
                return new int[]{columns[0].numberOfColumn - 1, rows[2].numberOfRow - 1};
            if (q[7].isNotSet() && !columns[1].contains(number) && !rows[2].contains(number))
                return new int[]{columns[1].numberOfColumn - 1, rows[2].numberOfRow - 1};
            if (q[8].isNotSet() && !columns[2].contains(number) && !rows[2].contains(number))
                return new int[]{columns[2].numberOfColumn - 1, rows[2].numberOfRow - 1};
            throw new Exception("No position possible.");
        }

        public boolean removeFromGuessesInRowXWithoutSquare(int rowNumber, int number) throws Exception {
            if (rowNumber < 1 || rowNumber > 3)
                throw new SudokuException("Invalid rownumber " + rowNumber);
            Field[] fieldsInRowX = rows()[rowNumber - 1].fields();
            switch (quadrantNumber) {
                case 1:
                case 4:
                case 7:
                    return fieldsInRowX[3].removeFromGuesses(number) ||
                            fieldsInRowX[4].removeFromGuesses(number) ||
                            fieldsInRowX[5].removeFromGuesses(number) ||
                            fieldsInRowX[6].removeFromGuesses(number) ||
                            fieldsInRowX[7].removeFromGuesses(number) ||
                            fieldsInRowX[8].removeFromGuesses(number);
                case 2:
                case 5:
                case 8:
                    return fieldsInRowX[0].removeFromGuesses(number) ||
                            fieldsInRowX[1].removeFromGuesses(number) ||
                            fieldsInRowX[2].removeFromGuesses(number) ||
                            fieldsInRowX[6].removeFromGuesses(number) ||
                            fieldsInRowX[7].removeFromGuesses(number) ||
                            fieldsInRowX[8].removeFromGuesses(number);
                case 3:
                case 6:
                case 9:
                    return fieldsInRowX[0].removeFromGuesses(number) ||
                            fieldsInRowX[1].removeFromGuesses(number) ||
                            fieldsInRowX[2].removeFromGuesses(number) ||
                            fieldsInRowX[3].removeFromGuesses(number) ||
                            fieldsInRowX[4].removeFromGuesses(number) ||
                            fieldsInRowX[5].removeFromGuesses(number);
                default:
                    throw new SudokuException("There's no square " + quadrantNumber);
            }
        }

        public boolean removeFromGuessesInColumnXWithoutSquare(int columnNumber, int number) throws Exception {
            if (columnNumber < 1 || columnNumber > 3)
                throw new SudokuException("Invalid columnNumber " + columnNumber);
            Field[] fieldsInColumnX = columns()[columnNumber - 1].fields();
            switch (quadrantNumber) {
                case 1:
                case 4:
                case 7:
                    return fieldsInColumnX[3].removeFromGuesses(number) ||
                            fieldsInColumnX[4].removeFromGuesses(number) ||
                            fieldsInColumnX[5].removeFromGuesses(number) ||
                            fieldsInColumnX[6].removeFromGuesses(number) ||
                            fieldsInColumnX[7].removeFromGuesses(number) ||
                            fieldsInColumnX[8].removeFromGuesses(number);
                case 2:
                case 5:
                case 8:
                    return fieldsInColumnX[0].removeFromGuesses(number) ||
                            fieldsInColumnX[1].removeFromGuesses(number) ||
                            fieldsInColumnX[2].removeFromGuesses(number) ||
                            fieldsInColumnX[6].removeFromGuesses(number) ||
                            fieldsInColumnX[7].removeFromGuesses(number) ||
                            fieldsInColumnX[8].removeFromGuesses(number);
                case 3:
                case 6:
                case 9:
                    return fieldsInColumnX[0].removeFromGuesses(number) ||
                            fieldsInColumnX[1].removeFromGuesses(number) ||
                            fieldsInColumnX[2].removeFromGuesses(number) ||
                            fieldsInColumnX[3].removeFromGuesses(number) ||
                            fieldsInColumnX[4].removeFromGuesses(number) ||
                            fieldsInColumnX[5].removeFromGuesses(number);
                default:
                    throw new SudokuException("There's no square " + quadrantNumber);
            }
        }


    }

    public class Row extends Element {

        Field[] r;
        int numberOfRow;

        public Row(int numberOfRow) {
            this.numberOfRow = numberOfRow;
            r = s[numberOfRow - 1];
        }

        @Override
        protected Field[] fields() {
            return r;
        }

        @Override
        protected int number() {
            return numberOfRow;
        }

        public boolean hasOnlyOnePossiblePositionFor(int number) throws Exception {
            if (contains(number))
                return false;
            int numberOfPossiblePositions = 0;
            for (int i = 0; i < 9; i++) {
                Sudoku.SudokuColumn column = column(i + 1);
                Sudoku.Quadrant quadrant = quadrant(i + 1, number());
                if (fields()[i].isNotSet() && !column.contains(number) && !quadrant.contains(number))
                    numberOfPossiblePositions++;
            }
            return numberOfPossiblePositions == 1;
        }

        public int getPossiblePositionFor(int number) throws Exception {
            for (int i = 0; i < 9; i++) {
                Sudoku.SudokuColumn column = column(i + 1);
                Sudoku.Quadrant quadrant = quadrant(i + 1, numberOfRow);
                if (r[i].isNotSet() && !column.contains(number) && !quadrant.contains(number))
                    return i + 1;
            }
            throw new Exception("No position possible.");
        }
    }


}
