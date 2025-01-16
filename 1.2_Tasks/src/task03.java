import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double luoti = 13.28;
        double naula = (32 * luoti);
        double leiviska = 20 * naula;

        System.out.println("Anna paino grammoina (g): ");
        double grammat = scanner.nextDouble();
        int leiviskat = (int) Math.floor(grammat / leiviska);
        int naulat = (int) Math.floor((grammat % leiviska) / naula);
        double luodit = (int) Math.floor(((grammat % leiviska) % naula) / luoti);

        System.out.println("Leivisköinä: " + leiviskat + " Naulat: " + naulat + " luoteina: " + luodit);
    }
}
