
import java.util.Scanner;


public class task01 {

    public static String[] firstNames = {"Juhani", "Johanna", "Mikko", "Liisa", "Kari", "Sari", "Pekka", "Marja", "Timo", "Anna"};
    public static String[] lastNames = {"Virtanen", "Korhonen", "Nieminen", "Mäkinen", "Hämäläinen", "Laine", "Heikkinen", "Koskinen", "Järvinen", "Lehtonen"};

    public static int firstNamePicker() {
        return (int) Math.round(Math.random() * (firstNames.length - 1));}

    public static int lastNamePicker() {
        return (int) Math.round(Math.random() * (lastNames.length - 1));}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the amount of names to generate: ");
        int namesToGenerate = scanner.nextInt();

        for (int i = namesToGenerate; i > 0; i--) {
            String firstName = firstNames[firstNamePicker()];
            String lastName = lastNames[lastNamePicker()];
            System.out.println(firstName + " " + lastName);
        }
        scanner.close();
    }
}


