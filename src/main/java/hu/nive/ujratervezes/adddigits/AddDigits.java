package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public static int addDigits(String input) {
        if(input == null || input.equals("")) {
            return -1;
        }
        char[] inputArray = input.toCharArray();
        int sum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (Character.isDigit(inputArray[i])) {
                sum += Integer.parseInt(String.valueOf(inputArray[i]));
            }
        }
        return sum;
    }
}
