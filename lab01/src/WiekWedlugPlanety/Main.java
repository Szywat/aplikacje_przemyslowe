package WiekWedlugPlanety;

import java.util.Scanner;

public class Main {
    public static final double lataZiemskieWSekundach = 31557600.0;
    public static final double lataMerkuryWSekundach = lataZiemskieWSekundach * 0.2408467;
    public static final double lataWenusWSekundach = lataZiemskieWSekundach * 0.61519726;
    public static final double lataMarsWSekundach = lataZiemskieWSekundach * 1.8808158;
    public static final double lataJowiszWSekundach = lataZiemskieWSekundach * 11.862615;
    public static final double lataSaturnWSekundach = lataZiemskieWSekundach * 29.447498;
    public static final double lataUranWSekundach = lataZiemskieWSekundach * 84.016846;
    public static final double lataNeptunWSekundach = lataZiemskieWSekundach * 164.79132;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long argToNumber = scanner.nextInt();
        scanner.nextLine();
        String argToString = scanner.nextLine().trim();

        double result = ageByPlanet(argToNumber, argToString);
        System.out.println(result);
    }

    public static double ageByPlanet(long age, String planet) {
        switch (planet) {
            case "Ziemia":
                return (double) Math.round((age / lataZiemskieWSekundach) * 100) /100;
            case "Merkury":
                return (double) Math.round((age / lataMerkuryWSekundach) * 100) /100;
            case "Wenus":
                return (double) Math.round((age / lataWenusWSekundach) * 100) /100;
            case "Mars":
                return (double) Math.round((age / lataMarsWSekundach) * 100) /100;
            case "Jowisz":
                return (double) Math.round((age / lataJowiszWSekundach) * 100) /100;
            case "Saturn":
                return (double) Math.round((age / lataSaturnWSekundach) * 100) /100;
            case "Uran":
                return (double) Math.round((age / lataUranWSekundach) * 100) /100;
            case "Neptun":
                return (double) Math.round((age / lataNeptunWSekundach) * 100) /100;
            default:
                return 0.0;
        }
    }
}
