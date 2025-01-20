import java.util.Random;
import java.util.Scanner;

public class task04 {

    public static void main(String[] args) {
        Random random = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            int pisteet = 0; 
            
            while (true) {
                
                for (int i = 1; i<= 10; i++) {
                    int kerrottava = random.nextInt(10) + 1;
                    int kerroin = random.nextInt(10) + 1;
                    
                    System.out.println(i+")  " + "Pisteet: [" + pisteet + "]");
                    System.out.print("   "+kerrottava + " · " + kerroin + " = ");
                    
                    int vastaus = scanner.nextInt();
                    
                    if (kerrottava * kerroin == vastaus) {
                        System.out.println("   Oikein!\n");
                        pisteet++;}
                    
                    else {
                        pisteet = 0;
                        System.out.println("   Väärin!\n");
                        System.out.println("-".repeat(20));
                        System.out.println("Aloitetaan alusta :)");
                        break;}}
                
                if (pisteet == 10) {
                    System.out.println("Pisteet: [" + pisteet + "]");
                    System.out.println("Vau! Sinä osaat! Sait kaikki (10) oikein!");
                    break;
                }
            }
        }
    }
}