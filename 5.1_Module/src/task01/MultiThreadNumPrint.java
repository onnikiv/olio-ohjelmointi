package task01;

public class MultiThreadNumPrint extends Thread {
    private final int targetNumber;
    private final String method;

    public MultiThreadNumPrint(int target, String method) {
        this.targetNumber = target;
        this.method = method.toLowerCase();}

    @Override
    public void run() {
        try {
            switch (method) {
                case "odd" -> {
                    for (int i = 1; i < targetNumber; i++) {
                        if (i % 2 != 0) {
                            System.out.println("Odd Thread: " + i);
                        }}}

                case "even" -> {
                    for (int i = 1; i < targetNumber; i++) {
                        if (i % 2 == 0) {
                            System.out.println("Even Thread: " + i);
                        }}}

                default -> {
                    System.err.println("Väärä metodi: " + method + ". Syötä Odd/Even.");
                }}

        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        int TARGETLUKU = 20;

        MultiThreadNumPrint thread1 = new MultiThreadNumPrint(TARGETLUKU,"Odd");
        MultiThreadNumPrint thread2 = new MultiThreadNumPrint(TARGETLUKU,"Even");

        thread1.start();
        thread2.start();
        
        try { // Odotetaan
            thread1.join();
            thread2.join();
            System.out.println("Printing complete.");

        } catch (InterruptedException e) {
        }
    }
}
