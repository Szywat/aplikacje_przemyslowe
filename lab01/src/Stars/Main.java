package Stars;

import java.util.Scanner;

public class Main {
    public static final String STAR = "*";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scannerInt = scanner.nextInt();
        starsGenerator(scannerInt);
    }

    public static void starsGenerator(int n) {
        for (int i = 0; i < n; i++) {
//            StringBuilder lineInit = new StringBuilder();
            for (int j = 0; j <= i; j++) {
//                lineInit.append(STAR);
                System.out.print(STAR);
            }
//            System.out.println(lineInit);
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
//            StringBuilder lineInit = new StringBuilder();
            for (int j = 0; j < i; j++) {
//                lineInit.append(STAR);
                System.out.print(STAR);
            }
//            System.out.println(lineInit);
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
//            StringBuilder lineInit = new StringBuilder();
            for (int j = 0; j < n - i; j++) {
//                lineInit.append(" ");
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
//                lineInit.append(STAR);
                System.out.print(STAR);
            }
//            System.out.println(lineInit);
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
//            StringBuilder lineInit = new StringBuilder();
            for (int j = 0; j < n - i; j++) {
//                lineInit.append(" ");
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
//                lineInit.append(STAR);
                System.out.print(STAR);
            }
//            System.out.println(lineInit);
            System.out.println();
        }
    }
}
