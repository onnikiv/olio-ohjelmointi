package task01;
import java.util.ArrayList;

public class GroceryListManager {
    private final ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        if (checkItem(item)) {
            System.out.println("Item [" + item + "] is already in the list.");
        } else { 
            groceryList.add(item); // jos ei oo listassa lisätään
            System.out.println("Adding [" + item + "] to the list...");
        }
    }

    public void removeItem(String item) {
        if (checkItem(item)) {
            groceryList.remove(item); // jos on listassa poistetaan
            System.out.println("Removing [" + item + "] from the list...");
        } else {
            System.out.println("Can't remove [" + item + "], since it's not on the list.");
        }
    }

    public void displayList() {
        System.out.println("Grocery List: ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
        System.out.println();
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager grocerylist = new GroceryListManager();
        grocerylist.addItem("Jauheliha");
        grocerylist.addItem("Makarooni");
        grocerylist.addItem("Ketsuppi");

        grocerylist.displayList();

        System.out.println("Is item: [Ketsuppi] in the grocerylist? " + grocerylist.checkItem("Ketsuppi") + "\n");

        grocerylist.removeItem("Ketsuppi");
        System.out.println();
        System.out.print("Updated ");
        grocerylist.displayList();
    }
}
