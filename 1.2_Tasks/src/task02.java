import java.util.Scanner;

public class task02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna A sivun pituus:");
        double A = scanner.nextDouble();
        
        System.out.println("Anna B sivun pituus:");
        double B = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        System.out.println("Hypotenuusan pituus: " + hypotenuse);

        scanner.close();
    }
}
