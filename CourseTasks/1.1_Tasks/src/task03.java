import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int product = first * second * third;

        System.out.println("SUM: " + sum);
        System.out.println("PRODUCT: " + product);
        System.out.println("AVERAGE: " + (((float)sum) / 3));
        // Ei ollut float:tina siksi ei tullut decimaaleja.
    }
}