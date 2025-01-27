package task02;

import java.util.Scanner;

public class MaxSubArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] numberArray = new int[arraySize];

        for (int i = 0; i < arraySize; i ++) {
            System.out.println("Enter integer " + (i+1) + ":");
            numberArray[i] = scanner.nextInt();

            
        }
        int maxSum = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arraySize; i++) {
            int currentSum = 0;
            for (int j = i; j < arraySize; j++) {
                currentSum += numberArray[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (start + 1) + " to " + (end + 1));

        scanner.close();
}
}
