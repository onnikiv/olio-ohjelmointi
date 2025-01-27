package task03;

import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double luoti = 13.28;
        double naula = (32 * luoti);
        double leiviska = 20 * naula;

        System.out.print("Weight (g): ");

        double grammat = scanner.nextDouble();
        int leiviskat = (int) Math.floor(grammat / leiviska);
        int naulat = (int) Math.floor((grammat % leiviska) / naula);
        double luodit = (((grammat % leiviska) % naula) / luoti);

        scanner.close();
        luodit = Math.round(luodit * 100.0) / 100.0;

        System.out.println((int)grammat + " grams is " + leiviskat + " leiviskä, " + naulat + " naula, and " + luodit + " luoti.");
    }
}
