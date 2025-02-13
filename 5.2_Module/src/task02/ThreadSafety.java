package task02;

import java.util.ArrayList;

class ThreadClass extends Thread {

    private final int threadId;
    private static int threadCount = 0;

    public ThreadClass() {
        threadCount++;
        this.threadId = threadCount;
        System.out.println(threadId + " thread");
    }

    

}


public class ThreadSafety {

    private final ArrayList<String> elements;

    public ThreadSafety() {
        this.elements = new ArrayList<>();
    
    }

    public synchronized void addElement(String item) {
        elements.add(item);

    }

    public synchronized void removeElement(String item) {
        if (elements.contains(item)) {
            elements.remove(item);
            System.out.println(item + " removed");
        }
        System.out.println(item + "couldn't be removed");
    }

    public int getCollectionSize() {
        return elements.size();
    }


    public static void main(String[] args) {

        ThreadSafety testings = new ThreadSafety();

        System.out.println(testings.getCollectionSize());

        ThreadClass thread1 = new ThreadClass();
        
        ThreadClass thread2 = new ThreadClass();


        
    }
}
