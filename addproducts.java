import java.util.ArrayList;
public class addproducts {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<String>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Headphones");
        System.out.println("Shopping Cart:");
        for(String product : products) {
            System.out.println(product);
        }
    }
}
