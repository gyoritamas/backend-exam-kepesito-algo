package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }

        String[] characters = input.split("");

        int total = 0;

        for (String c : characters) {
            try {
                total += Integer.parseInt(c);
            } catch (NumberFormatException ignored) {

            }
        }

        return total;
    }

}
