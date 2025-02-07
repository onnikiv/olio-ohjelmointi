package task02;

import java.util.ArrayList;

// SpagettiSoossi

public class ParallelNumSum extends Thread  {

    private static int SIZE;
    private static  int coreCount = Runtime.getRuntime().availableProcessors();
    private static int[] numberArray = new int[SIZE];

    private final int chunkSize = SIZE / coreCount;
    private static int nextStartIndex = 0;
    private final int startIndex;
    private final int endIndex;

    private int threadSum = 0; // yksittäisen threadinSumma
    private static long totalSum = 0;


    public ParallelNumSum() {
        this.startIndex = nextStartIndex;
        this.endIndex = (nextStartIndex + chunkSize) - 1; // -1 koska aloitetaan nollasta
        nextStartIndex += chunkSize;

        System.out.println("UUSI THREAD - palankoko: " + chunkSize + ", välikkö: " + startIndex + "-" + endIndex);

    }

    @Override
    public void run() { //lasketaan jokaisen threadin osio
        for (int i = startIndex; i < endIndex; i++) {
            threadSum += numberArray[i];
        }
        totalSum += threadSum;
        System.out.println(getName() + ", summa: " + threadSum + " -> lisätään kokosummaan.");
    }


    public static void main(String[] args) {
        
        int ALKIOKOKO = 10; // 0-10 väliltä
        SIZE = 1000; // Listan koko
        numberArray = new int[SIZE];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.random() * (ALKIOKOKO+1));
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        
        ArrayList<ParallelNumSum> threads = new ArrayList<>();

        for (int i = 0; i < coreCount; i++) {
            System.out.print(i + ". ");
            threads.add(new ParallelNumSum());
        }
        // jokane threadi käynnistetään
        for (ParallelNumSum thread : threads) {
            thread.start();}

        System.out.println("---------------------------------------");

        // pistetään ukot oottamaan toisiaan.
        for (ParallelNumSum thread : threads) {
            try {
                thread.join();

            } catch (InterruptedException e) {}}

        System.out.println("---------------------------------------");
        System.out.println("Kokonaissumma: " + totalSum);

        long varmistus = 0;
        
        for (int num : numberArray) {
            varmistus += num;
        }
        System.out.println(varmistus);
    }
}
