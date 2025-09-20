import java.util.*;

public class Question2_firstUniqueProduct {
    public static String firstUniqueProduct(String[] products) {
        if (products == null || products.length == 0) {
            return null;
        }
    
        LinkedHashMap<String, Integer> productCount = new LinkedHashMap<>();
 
        for (String product : products) {
            productCount.put(product, productCount.getOrDefault(product, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : productCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return null; 
    }
}
