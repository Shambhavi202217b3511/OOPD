import java.util.HashMap;
import java.util.Map;
 
public class ProductDetails {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Apple", 10.0);
        products.put("Banana", 5.0);
        products.put("Milk", 20.0);
 
        // ... more products
 
        // Display products and prices
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": ₹" + entry.getValue());
        }
    }
}
