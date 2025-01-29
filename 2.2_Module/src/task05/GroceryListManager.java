package task05;

import java.util.HashMap;
import java.util.Map;

// yksittäinen tuote
class GroceryItem {
    private final String category;
    private final double cost;
    int quantity;
        
        public GroceryItem(double cost, String category, int quantity) {
            this.cost = cost;
            this.category = category;
            this.quantity = quantity;
        }

        public String getCategory() {
            return category;
        }
    
        public double getCost() {
            return cost;
        }
    
        public int getQuantity() {
            return quantity;
        }
    
    }
    
    public class GroceryListManager {
        private final HashMap<String, GroceryItem> groceryList = new HashMap<>();
    
        public void addItem(String item, double cost, String category, int quantity) {
            if (checkItem(item)) {
                System.out.println("Item [" + item + "] is already in the list.");
            } else { 
                groceryList.put(item, new GroceryItem(cost, category, quantity)); // Lisätään uusi tuote listaan
                System.out.println("\nAdding [" + item + "], ["+quantity+" kpl] to the list...");
            }
        }
    
        public void removeItem(String item, int quantity) {
            if (checkItem(item)) {
                GroceryItem groceryItem = groceryList.get(item);
                if (groceryItem.getQuantity() > quantity) {
                    groceryItem.quantity -= quantity;
                    System.out.println("Decreased quantity of [" + item + "] by " + quantity);
                } else {
                    groceryList.remove(item);
                    System.out.println("Removing [" + item + "] from the list...");
                }
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
                System.out.println(index + ". " + item + ": "+ details.getCost() + " (" + details.getCategory() + "),  " + details.getQuantity() + " kpl.");
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
                int itemQuantity = entry.getValue().getQuantity();
                double quantityAndCost = itemCost *  itemQuantity;
                totalCost += quantityAndCost;
            }
            System.out.println("Total cost: " + totalCost);
        }
    
        public void displayByCategory(String category) {
            System.out.println("\nAll items in category: " + category);
            for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
                GroceryItem item = entry.getValue();
                if (item.getCategory().equals(category)) {
                    System.out.println(entry.getKey() + ": " + item.getCost());
                }
            }
            System.out.println();
        }
    
        public void updateQuantity(String item, int newQuantity) {
            if (checkItem(item)) {
                GroceryItem groceryItem = groceryList.get(item);
                groceryItem.quantity = newQuantity;
            System.out.println("Updated quantity of [" + item + "] to " + newQuantity);
        } else {
            System.out.println("Item [" + item + "] not found in the list.");
        }
    }


    public void displayAvailableItems() {
        System.out.println("\nAvailable items: ");
        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            GroceryItem item = entry.getValue();
            if (item.getQuantity() > 0) {
                System.out.println(entry.getKey() + ": " + item.getQuantity() + " kpl");
            }
        }

    }
    


    public static void main(String[] args) {
        GroceryListManager grocerylist = new GroceryListManager();
        
        System.out.println(); // visual
        
        grocerylist.addItem("Jauheliha", 4.38,"Liha", 2);
        grocerylist.addItem("Makarooni", 0.25, "Kuivatuotteet", 3);
        grocerylist.addItem("Ketsuppi",3, "Mausteet", 1);

        System.out.println(); // visual

        grocerylist.displayList();

        System.out.println("Is item: [Ketsuppi] in the grocerylist? " + grocerylist.checkItem("Ketsuppi") + "\n");
        grocerylist.removeItem("Ketsuppi", 1);

        System.out.print("Updated ");
        grocerylist.displayList();

        grocerylist.calculateTotalCost();

        grocerylist.displayByCategory("Liha");


        grocerylist.updateQuantity("Makarooni", 6);

        grocerylist.displayAvailableItems();

        grocerylist.addItem("Makkara", 10,"Liha", 5);

        grocerylist.displayAvailableItems();

        grocerylist.displayByCategory("Liha");
        System.out.print("Updated ");
        grocerylist.displayList();

        grocerylist.calculateTotalCost();

        grocerylist.removeItem("Makkara", 4);

        System.out.println("Is item: [Makkara] in the grocerylist? " + grocerylist.checkItem("Makkara") + "\n");

        System.out.print("Updated ");
        grocerylist.displayList();

        grocerylist.calculateTotalCost();
    }
}
