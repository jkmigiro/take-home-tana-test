import java.util.*;

public class Question2_FirstUniqueProduct {
    public static String firstUniqueProduct(String[] products) {
        if (products == null || products.length == 0) {
            return null;
        }

        Map<String, Integer> productCount = new LinkedHashMap<>();

        for (String product : products) {
            productCount.put(product, productCount.getOrDefault(product, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : productCount.entrySet()) {
            //Return first product with count = 1
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String[] products1 = { "Apple", "Computer", "Apple", "Bag" };
        var result = Question2_FirstUniqueProduct.firstUniqueProduct(products1);
        System.out.println("First unique product is: " + result);
    }
}
