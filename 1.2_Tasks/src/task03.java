import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double luoti = 13.28;
        double naula = (32 * luoti);
        double leiviska = 20 * naula;

        System.out.println("Anna paino grammoina (g): ");
        double grammat = scanner.nextDouble();
        System.out.println("Leivisköinä: " + Math.floor(grammat/leiviska) + " Naulat: " + Math.floor((grammat%leiviska)/naula) + " luoteina: " + ((grammat%leiviska)%naula)/luoti);
    }
}
