public class Product{
    private int produtID;
    private  String productName;
    private String category;

    public Product(int productID, String productName, String category) {
        this.produtID = productID;
        this.productName = productName;
        this.category = category;
    }

    public int getProductID() {
        return produtID;
    }

    public String getProductName() {
        return productName;
    }

    public String toString() {
        return  "{produtID = " + produtID +
                ", productName = " + productName +
                ", category = " + category + '}';
    }
}