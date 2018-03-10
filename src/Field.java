import java.util.HashSet;
import java.util.Set;

public class Field {
    public final int x;
    public final int y;
    Set<Integer> guesses = new HashSet<>();
    private int value;

    Field(int value, int x, int y) {
        if (value != 0) {
            this.value = value;
        } else {
            guesses.add(1);
            guesses.add(2);
            guesses.add(3);
            guesses.add(4);
            guesses.add(5);
            guesses.add(6);
            guesses.add(7);
            guesses.add(8);
            guesses.add(9);
        }
        this.x = x;
        this.y = y;
    }

    public boolean isSet() {
        return value != 0;
    }

    public boolean isNotSet() {
        return !isSet();
    }

    public boolean hasValue(int number) {
        return value == number;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public void printGuesses1() {
        if (isNotSet())
            System.out.print("" + (guesses.contains(1) ? "1" : " ") + " " + (guesses.contains(2) ? "2" : " ") + " " + (guesses.contains(3) ? "3" : " ") + "|");
        else
            System.out.print("-----|");
    }

    public void printGuesses2() {
        if (isNotSet())
            System.out.print("" + (guesses.contains(4) ? "4" : " ") + " " + (guesses.contains(5) ? "5" : " ") + " " + (guesses.contains(6) ? "6" : " ") + "|");
        else
            System.out.print("- " + value + " -|");
    }

    public void printGuesses3() {
        if (isNotSet())
            System.out.print("" + (guesses.contains(7) ? "7" : " ") + " " + (guesses.contains(8) ? "8" : " ") + " " + (guesses.contains(9) ? "9" : " ") + "|");
        else
            System.out.print("-----|");
    }

    public boolean removeFromGuesses(int number) {
        boolean result = guesses.remove(number);
        if (isNotSet()) {
            if (guesses.size() == 0) {
                throw new SudokuException("No number possible. " + (x + 1) + ", " + (y + 1));
            }
            if (guesses.size() == 1) {
               int lastGuess = guesses.iterator().next();
                setValue(lastGuess);
            }
        }
        return result;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (isSet())
            throw new SudokuException("Field already set.");
        this.value = value;
    }
}