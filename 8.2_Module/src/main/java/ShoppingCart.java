
import java.util.HashMap;

public class ShoppingCart {
    private final HashMap<String, Double> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void addItem(String item, double cost) {
        shoppingCart.put(item, cost);

    }

    public int getItemCount() {
        return shoppingCart.size();
    }

    public void removeItem(String item) {
        shoppingCart.remove(item);
    }

    public double calculateTotal() {
        
        double totalCost = 0;

        for (double cost : shoppingCart.values()) {
            totalCost += cost;
        }

        return totalCost;
    } 
}
