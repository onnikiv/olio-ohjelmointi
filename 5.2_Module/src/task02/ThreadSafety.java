package task02;

import java.util.ArrayList;


class ThreadClass extends Thread {

    private final int threadId;
    private static int threadCount = 0;
    private final ThreadSafety threadSafety;

    public ThreadClass(ThreadSafety threadSafety) {
        threadCount++;
        this.threadId = threadCount;
        this.threadSafety = threadSafety;
    }

    @Override
    public synchronized void run() {
        threadSafety.addElement("Element " + threadId); System.out.print(", by THREAD: " + threadId +"\n");
        threadSafety.removeElement("Element " + threadId); System.out.print(", by THREAD: " + threadId +"\n");
        System.out.println("Collection size: " + threadSafety.getCollectionSize());
    }
}

public class ThreadSafety {

    private final ArrayList<String> elements;

    public ThreadSafety() {
        this.elements = new ArrayList<>();
    }

    public synchronized void addElement(String item) {
        elements.add(item);
        System.out.print(item + " added");
    }

    public synchronized void removeElement(String item) {
        if (elements.contains(item)) {
            elements.remove(item);
            System.out.print(item + " removed");
        } else {
            System.out.println(item + " couldn't be removed");
        }
    }

    public synchronized int getCollectionSize() {
        return elements.size();
    }

    public static void main(String[] args) {
        int THREADS = 10;
        ThreadSafety testings = new ThreadSafety();

        System.out.println(testings.getCollectionSize());

        for (int i = 0; i < THREADS; i++) {
            Thread thread = new ThreadClass(testings);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
            }
            
        }




        
    }
}