package task02;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private final HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        if (checkItem(item)) {
            System.out.println("Item [" + item + "] is already in the list.");
        } else { 
            groceryList.put(item, cost); // jos ei oo listassa lisätään
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
        int index = 1;
        for (String item : groceryList.keySet()) {
            System.out.println(index + ". " + item + ": " + groceryList.get(item));
            index++;
        }
        System.out.println();
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public void calculateTotalCost() {
        double totalCost = 0;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            double itemCost = entry.getValue();
            totalCost += itemCost;
        }
        System.out.println("Total cost: " + totalCost);
    }

    public static void main(String[] args) {
        GroceryListManager grocerylist = new GroceryListManager();
        grocerylist.addItem("Jauheliha", 4.38);
        grocerylist.addItem("Makarooni", 0.25);
        grocerylist.addItem("Ketsuppi", 3);
        System.out.println();

        grocerylist.displayList();

        System.out.println("Is item: [Ketsuppi] in the grocerylist? " + grocerylist.checkItem("Ketsuppi") + "\n");
        grocerylist.removeItem("Ketsuppi");

        System.out.println();
        System.out.print("Updated ");
        grocerylist.displayList();

        grocerylist.calculateTotalCost();
    }
}
