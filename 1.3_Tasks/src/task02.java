
import java.util.Scanner;


public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a binarynumber: ");
        String binaryNumber = scanner.nextLine();

        int bitAmount = binaryNumber.length();

        System.out.println("Number of bits: "+ bitAmount);
    }

}
