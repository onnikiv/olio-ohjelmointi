public class task02 {
    public static void main(String[] args) {
        /*
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        */

        // Some overkill
        for (int i = 0; i <= 3; i++) {
            System.out.println(" ".repeat((4 - i)) + "*".repeat(1 + i) + "*".repeat(i));
        
        }
    }
}

