package task02;

public class ParallelNumSum extends Thread{


    public static void main(String[] args) {

        int SIZE = 100;
        int[] numberArray = new int[SIZE];

        // luodaan luvut listaan 0-1000 väliltä
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.random() * 1001);
            System.out.print(numberArray[i] + ", "); // debug
        }

        
        int amoutOfCores = Runtime.getRuntime().availableProcessors();

        for (int i = 0; i < amoutOfCores; i++) {
            ParallelNumSum thread = new ParallelNumSum();
            thread.setName("thread" + (i + 1)); // oijjoi

            System.out.println(thread.getName()); // debug
            
        }

        int threadOsio = (int)numberArray.length / amoutOfCores;
        System.out.println(threadOsio);

        
    }

}
