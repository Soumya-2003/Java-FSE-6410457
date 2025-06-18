import java.util.List;

public class Search {
    public static Product linearSearch(List<Product> products, String productName) {
        for (Product product : products) {
            if (product.getProductName().toLowerCase().equals(productName.toLowerCase())) {
                return product;
            } 
        }
        System.out.println("Product not found!");
        return null;
    }

    public static Product binarySearch(List<Product> products, int productID) {
        products.sort((p1, p2) -> Integer.compare(p1.getProductID(), p2.getProductID()));

        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products.get(mid);

            if (midProduct.getProductID() == productID) {
                return midProduct;
            } else if (midProduct.getProductID() < productID) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Product not found!");
        return null;
    }
}
