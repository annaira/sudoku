import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Fields {
    private final Field[] fields;

    Fields(Field... fields) {
        this.fields = fields;
    }

    public boolean removeGuess(int value) {

        boolean removedSomething = false;
        for (Field field : fields) {
            removedSomething = removedSomething || field.removeFromGuesses(value);
        }
        return removedSomething;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            builder.append(field.getValue());
            if ((i + 1) % 3 == 0) builder.append("_");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    public boolean doesNotContain(int number) {
        for (Field field : fields) {
            if (field.hasValue(number)) return false;
        }
        return true;
    }

    public Field[] possiblePositionsForNumber(int number) {
        List<Field> possiblePositions = new ArrayList<>();
        for (Field field : fields) {
            if (field.isNotSet() && field.guesses.contains(number))
                possiblePositions.add(field);
        }
        return possiblePositions.toArray(new Field[possiblePositions.size()]);
    }

    public boolean numberOnlyInGuessesOfSquareRow(int number, int squareRow) {
        switch (squareRow) {
            case 0:
                return squareRow(0).guessesContain(number) && !squareRow(1).guessesContain(number) && !squareRow(2).guessesContain(number);
            case 1:
                return squareRow(1).guessesContain(number) && !squareRow(0).guessesContain(number) && !squareRow(2).guessesContain(number);
            case 2:
                return squareRow(2).guessesContain(number) && !squareRow(0).guessesContain(number) && !squareRow(1).guessesContain(number);
            default:
                throw new SudokuException("OOps");
        }
    }

    public boolean numberOnlyInGuessesOfSquareColumn(int number, int squareColumn) {
        switch (squareColumn) {
            case 0:
                return squareColumn(0).guessesContain(number) && !squareColumn(1).guessesContain(number) && !squareColumn(2).guessesContain(number);
            case 1:
                return squareColumn(1).guessesContain(number) && !squareColumn(0).guessesContain(number) && !squareColumn(2).guessesContain(number);
            case 2:
                return squareColumn(2).guessesContain(number) && !squareColumn(0).guessesContain(number) && !squareColumn(1).guessesContain(number);
            default:
                throw new SudokuException("OOps");
        }
    }

    private boolean guessesContain(int number) {
        for (Field field : fields) {
            if (field.isNotSet() && field.guesses.contains(number)) return true;
        }
        return false;
    }

    private Fields squareRow(int i) {
        switch (i) {
            case 0:
                return new Fields(fields[0], fields[1], fields[2]);
            case 1:
                return new Fields(fields[3], fields[4], fields[5]);
            case 2:
                return new Fields(fields[6], fields[7], fields[8]);
            default:
                throw new SudokuException("OOps");
        }
    }

    private Fields squareColumn(int i) {
        switch (i) {
            case 0:
                return new Fields(fields[0], fields[3], fields[6]);
            case 1:
                return new Fields(fields[1], fields[4], fields[7]);
            case 2:
                return new Fields(fields[2], fields[5], fields[8]);
            default:
                throw new SudokuException("OOps");
        }
    }


    public Fields rowWithoutSquare(int squareNumber) {
        switch (squareNumber) {
            case 0:
            case 3:
            case 6:
                return new Fields(fields[3], fields[4], fields[5], fields[6], fields[7], fields[8]);
            case 1:
            case 4:
            case 7:
                return new Fields(fields[0], fields[1], fields[2], fields[6], fields[7], fields[8]);
            case 2:
            case 5:
            case 8:
                return new Fields(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
            default:
                throw new SudokuException("OOps");
        }
    }

    public Fields columnWithoutSquare(int squareNumber) {
        switch (squareNumber) {
            case 0:
            case 1:
            case 2:
                return new Fields(fields[3], fields[4], fields[5], fields[6], fields[7], fields[8]);
            case 3:
            case 4:
            case 5:
                return new Fields(fields[0], fields[1], fields[2], fields[6], fields[7], fields[8]);
            case 6:
            case 7:
            case 8:
                return new Fields(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
            default:
                throw new SudokuException("OOps");
        }
    }

    public Field get(int j) {
        return fields[j];
    }

    public boolean containsExclusiveGuesses(Set<Integer> guesses) {
        int guessesFound = 0;
        for (Field field : fields) {
            if (field.isNotSet() && field.guesses.equals(guesses)) {
                guessesFound++;
            }
        }
        return guesses.size() == guessesFound;
    }

    public boolean removeGuessesWhereNotEquals(Set<Integer> guesses) {
        boolean somethingChanged = false;
        for (Field field : fields) {
            if (field.isNotSet() && !field.guesses.equals(guesses)) {
                somethingChanged = somethingChanged || field.guesses.removeAll(guesses);
            }
        }
        return somethingChanged;
    }

    public Field[] get() {
        return fields;
    }

    protected boolean isNotValid() {
        Set<Integer> values = new HashSet<>();
        int counter = 0;
        for (Field field : fields) {
            if (field.isSet()) {
                values.add(field.getValue());
                counter++;
            }
        }
        return values.size() != counter;
    }
}
