import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product(202, "Smart TV", "Electronics"));
        products.add(new Product(303, "Water Bottle", "Accessories"));  
        products.add(new Product(205, "Earbuds", "Accessories"));  
        products.add(new Product(192, "Speaker", "Electronics"));
        products.add(new Product(301, "Shoes", "Clothing"));
        products.add(new Product(50, "Laptop", "Electronics"));
        products.add(new Product(150, "Books", "Accessories"));  
        products.add(new Product(200, "Tablet", "Electronics"));

        System.out.println("\nSearching for product by name using Linear Search...");
        System.out.print("Enter the product name to search: ");
        String productName = sc.nextLine();

        Product product = Search.linearSearch(products, productName);
        if(product != null){
            System.out.println("Product found: " + product);
        }

        System.out.println("\nSearching for product by name using Binary Search...");
        System.out.print("Enter the product ID to search: ");
        int productID = sc.nextInt();
        product = Search.binarySearch(products, productID);
        if(product != null){
            System.out.println("Product found: " + product);
        }
        
        sc.close();
    }
}