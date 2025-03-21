package task03;

import java.util.HashMap;
import java.util.Map;

// yksittäinen tuote
class GroceryItem {
    private final String category;
    private final double cost;

    public GroceryItem(double cost, String category) {
        this.cost = cost;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }
}

public class GroceryListManager {
    private final HashMap<String, GroceryItem> groceryList = new HashMap<>();

    public void addItem(String item, double cost, String category) {
        if (checkItem(item)) {
            System.out.println("Item [" + item + "] is already in the list.");
        } else { 
            groceryList.put(item, new GroceryItem(cost, category)); // Lisätään uusi tuote listaan
            System.out.println("Adding [" + item + "] to the list...");
        }
    }

    public void removeItem(String item) {
        if (checkItem(item)) {
            groceryList.remove(item); // Poistetaan tuote listasta
            System.out.println("Removing [" + item + "] from the list...");
        } else {
            System.out.println("Can't remove [" + item + "], since it's not on the list.");
        }
    }

    public void displayList() {
        System.out.println("Grocery List: ");
        int index = 1;
        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            GroceryItem details = entry.getValue();
            System.out.println(index + ". " + item + " (" + details.getCategory() + "): " + details.getCost());
            index++;
        }
        System.out.println();
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public void calculateTotalCost() {
        double totalCost = 0;
        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            double itemCost = entry.getValue().getCost();
            totalCost += itemCost;
        }
        System.out.println("Total cost: " + totalCost);
    }

    public void displayByCategory(String category) {
        System.out.println("All items in category: " + category);
        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            GroceryItem item = entry.getValue();
            if (item.getCategory().equals(category)) {
                System.out.println(entry.getKey() + ": " + item.getCost());
            }
        }
    }

    public static void main(String[] args) {
        GroceryListManager grocerylist = new GroceryListManager();
        grocerylist.addItem("Jauheliha", 4.38,"Liha");
        grocerylist.addItem("Makarooni", 0.25, "Kuivatuotteet");
        grocerylist.addItem("Ketsuppi",3, "Mausteet");
        // grocerylist.addItem("Makkara", 10,"Liha");
        System.out.println();

        grocerylist.displayList();

        System.out.println("Is item: [Ketsuppi] in the grocerylist? " + grocerylist.checkItem("Ketsuppi") + "\n");
        grocerylist.removeItem("Ketsuppi");

        System.out.println();
        System.out.print("Updated ");
        grocerylist.displayList();

        grocerylist.calculateTotalCost();

        grocerylist.displayByCategory("Liha");
    }
}
