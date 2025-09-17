package Armstrong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int argToNumber = scanner.nextInt();
        boolean response = armstrong(argToNumber);
        System.out.println(response);

    }

    public static boolean armstrong(int arg) {
        String number = Integer.toString(arg);
        char[] arr = number.toCharArray();
        int arrLength = arr.length;
        int result = 0;
        for (char c : arr) {
            int y = Character.getNumericValue(c);
            result += (int) Math.pow(y, arrLength);

        }
        return result == arg;
    }
}
