import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] numberArray = new int[arraySize];

        for (int i = 0; i < arraySize; i ++) {
            System.out.println("Enter integer " + (i+1) + ":");
            numberArray[i] = scanner.nextInt();

            
        }

        scanner.close();
}
}
