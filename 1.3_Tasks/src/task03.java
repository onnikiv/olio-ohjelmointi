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

            for (int i = startNumber; i <= endNumber; i++) {
                
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
                
            }

        } else {
            System.out.println("Both numbers must be positive!");
        }

    }

}
