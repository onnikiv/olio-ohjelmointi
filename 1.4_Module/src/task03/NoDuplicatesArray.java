package task03;

import java.util.Scanner;

public class NoDuplicatesArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        // molemmat listat saman kokoisia
        int[] numberArray = new int[arraySize];
        int[] noDuplicatesArray = new int[arraySize];
        int noDuplicatesSize = 0;

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter integer " + (i+1) + ":");
            numberArray[i] = scanner.nextInt();
        }
        // 
        for (int i = 0; i < arraySize; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < noDuplicatesSize; j++) {
                if (numberArray[i] == noDuplicatesArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                noDuplicatesArray[noDuplicatesSize] = numberArray[i];
                noDuplicatesSize++;
            }
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < noDuplicatesSize; i++) {
            System.out.print(noDuplicatesArray[i] + " ");
        }

        scanner.close();
    }
}