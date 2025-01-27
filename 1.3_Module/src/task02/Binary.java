package task02;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter a task02.Binary number: ");

        String binaryNumber = scanner.nextLine();
        int bitAmount = binaryNumber.length();
        int decimalNumber = 0;

        for (int i = 0; i < bitAmount; i++) {
            int arvo = binaryNumber.charAt((bitAmount - 1) - i) - '0'; // ASCII-taulussa; charAt 0 = 48, charAt 1 = 49, siksi vähennetään char 0.
            decimalNumber += arvo * Math.pow(2, i);}
        
        System.out.println("\ntask02.Binary number: " + binaryNumber + " , Bits: " + bitAmount + "\nDecimal number: " + decimalNumber+ "\n");
        scanner.close();
    } 
}
