package task02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Fibonakki {

    public static void main(String[] args) {
        
        long num1 = 0;
        long num2 = 1;
        long fibo = num1;

        try (Writer writer = new FileWriter("C:\\Users\\onnik\\Ohjelmointi\\olio-ohjelmointi\\3.4_Module\\src\\task02\\fibonacciValues.csv");
                BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                
                // PUOSKAROINTIA -> 0 -> 1
                bufferedWriter.write(String.valueOf(fibo + 1));
                bufferedWriter.newLine();
                // -------------
                
                // loopataan loput luvut
               for (int i = 1; i < 60; i++) {

                fibo = num1 + num2;
                num1 = num2;
                num2 = fibo;

                bufferedWriter.write(String.valueOf(fibo));
                bufferedWriter.newLine();
            }
   
               bufferedWriter.flush();

               System.out.println("Fibonakkiluvut tungettu csv-tiedostoon!");

           } catch (IOException e) {
            System.out.println("Ei iha toiminu");

           }
    }
}