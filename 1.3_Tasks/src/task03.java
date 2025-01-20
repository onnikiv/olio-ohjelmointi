import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Starting number: ");
        int startNumber = scanner.nextInt();

        System.out.println("Enter the End number: ");
        int endNumber = scanner.nextInt();

        if (startNumber >= 0 && endNumber > 0) {
            System.out.println("Prime numbers: ");

            for (int i = startNumber; i <= endNumber; i++) {
                if (isPrime(i)) {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.println("Both numbers must be positive!");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
