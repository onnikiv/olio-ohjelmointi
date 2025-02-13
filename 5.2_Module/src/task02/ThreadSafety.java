package task02;

import java.util.ArrayList;

public class ThreadSafety {

    private final ArrayList<String> elements;

    public ThreadSafety() {
        this.elements = new ArrayList<>();
    
    }

    public void addElement(String item) {
        elements.add(item);

    }

    public void removeElement(String item) {
        if (elements.contains(item)) {
            elements.remove(item);
        }
    }

    public int getCollectionSize() {
        return elements.size();
    }


    public static void main(String[] args) {
        
    }
}
