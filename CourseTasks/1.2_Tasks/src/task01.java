import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((fahrenheit - 32) / 1.8);

        System.out.printf("In Celsius:%4.1f\n", celsius);
    }


}
