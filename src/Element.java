import java.util.HashSet;
import java.util.Set;

public abstract class Element {

    protected boolean isValid() {
        Set<Integer> values = new HashSet<>();
        int counter = 0;
        for (Field field : fields()) {
            if (field.isSet()) {
                values.add(field.getValue());
            }
            counter++;
        }
        return values.size() == counter;
    }

    protected abstract Field[] fields();

    protected abstract int number();

    @Override
    public String toString() {
        Field[] fields = fields();
        return "" + fields[0] + fields[1] + fields[2] + "_" + fields[3] + fields[4] + fields[5] + "_" + fields[6] + fields[7] + fields[8];
    }

    public boolean containsGuessesXTimes(Set<Integer> guesses) throws Exception {
        int numberOfGuesses = 0;
        for (Field field : fields()) {
            if (field.isNotSet() && guesses.equals(field.guesses)) {
                numberOfGuesses++;
            }
        }
        if (numberOfGuesses > guesses.size()) {
            throw new Exception("Guesses " + guesses.toString() + " found " + numberOfGuesses + " times. Row " + number());
        }
        return numberOfGuesses == guesses.size();
    }

    public boolean containsGuessesXTimes1(Set<Integer> guesses) throws Exception {
        int numberOfGuesses = 0;
        for (Field field : fields()) {
            if (field.isNotSet() && guesses.containsAll(field.guesses)) {
                numberOfGuesses++;
            }
        }
        if (numberOfGuesses > guesses.size()) {
            throw new Exception("Guesses " + guesses.toString() + " found " + numberOfGuesses + " times. Element " + number());
        }
        return numberOfGuesses == guesses.size();
    }

    public boolean cleanUpGuesses(Set<Integer> guesses) {
        boolean cleanedUp = false;
        for (Field field : fields()) {
            if (!field.guesses.equals(guesses)) {
                if (field.guesses.removeAll(guesses))
                    cleanedUp = true;
            }
        }
        return cleanedUp;
    }

    public boolean cleanUpGuesses1(Set<Integer> guesses) {
        boolean cleanedUp = false;
        for (Field field : fields()) {
            if (!guesses.containsAll(field.guesses)) {
                if (field.guesses.removeAll(guesses))
                    cleanedUp = true;
            }
        }
        return cleanedUp;
    }

    protected boolean contains(int number) {
        if (number == 0)
            return false;
        for (Field field : fields())
            if (field.hasValue(number))
                return true;
        return false;
    }

}
