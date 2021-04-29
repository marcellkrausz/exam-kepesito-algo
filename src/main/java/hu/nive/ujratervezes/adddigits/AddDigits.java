package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public static int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return sum;
    }
}
