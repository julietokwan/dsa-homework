import java.util.Vector;

public class ProductInventory {

    private Vector<Product> products;

    public ProductInventory() {
        products = new Vector<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean removeProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                products.remove(p);
                return true;
            }
        }
        return false;
    }

    public Product findProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public void printInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (Product p : products) {
            System.out.println(p);
        }
    }
}