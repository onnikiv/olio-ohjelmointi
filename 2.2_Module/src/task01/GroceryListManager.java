package task01;
import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        System.out.println("Removing >" + item + "< from the list...");
    }

    public void displayList() {
        System.out.println("Grocery List: ");
        
        for (int i = 0; i < groceryList.size(); i++)
            System.out.println((i+1) +". " + groceryList.get(i));
        
        System.out.println();
    }

    public boolean checkItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println("Grocerylist has item: >" + item + "<");
            return true;
        } else {
            System.out.println("Grocerylist doesn't have item: >" + item + "<");
            return false;
        }
    }

        public static void main(String[] args) {
        GroceryListManager grocerylist = new GroceryListManager();
        
        System.out.println();
        grocerylist.addItem("Jauheliha");
        grocerylist.addItem("Makarooni");
        grocerylist.addItem("Ketsuppi");

        grocerylist.displayList();
        
        grocerylist.checkItem("Ketsuppi");
        grocerylist.removeItem("Ketsuppi");

        grocerylist.displayList();

    }
}
