import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Starting number: ");
        int startNumber = scanner.nextInt();
        
        System.out.println("Enter the End number: ");
        int endNumber = scanner.nextInt();
        
        if (startNumber >= 0 && endNumber > 0) {
            System.out.println("good job");

            for (int i = endNumber; i >= startNumber; i--) {
                
                System.out.println(i);
                if (i % i==0) {
                    System.out.println(i + " is a prime number");
                }
                
            }

        } else {
            System.out.println("Both numbers must be positive!");
        }

    }

}
