package task02;

public class ParallelNumSum extends Thread{
    private final int amoutOfCores = Runtime.getRuntime().availableProcessors();
    private final int SIZE = 1000;
    private final int[] numberArray = new int[SIZE];

    private int threadSumPartSize;

    


    public ParallelNumSum() {
        this.threadSumPartSize = SIZE / amoutOfCores;
        System.out.println("Thread: " + this.getName() + " osio: " + this.threadSumPartSize);
    }

    


    public void run() {

    }


    public static void main(String[] args) {

        

        // luodaan luvut listaan 0-1000 väliltä
        /*
         *     for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.random() * 1001);
            System.out.print(numberArray[i] + ", "); // debug
        }
         */
        int amoutOfCores = Runtime.getRuntime().availableProcessors();

        for (int i = 0; i < amoutOfCores; i++) {
            ParallelNumSum thread = new ParallelNumSum();
            thread.setName("thread" + (i + 1)); // oijjoi
            
        }



    }

}
