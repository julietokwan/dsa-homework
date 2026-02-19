public class InventoryTester {
    public static void main(String[] args) {

        ProductInventory inventory = new ProductInventory();

        inventory.addProduct(new Product("Apple", 1.25, 10));
        inventory.addProduct(new Product("Banana", 0.75, 20));
        inventory.addProduct(new Product("Milk", 4.50, 5));

        System.out.println("Current Inventory:");
        inventory.printInventory();

        System.out.println("\nSearching for 'Milk':");
        Product p = inventory.findProduct("Milk");
        if (p != null) {
            System.out.println("Found: " + p);
        } else {
            System.out.println("Not found.");
        }

        System.out.println("\nRemoving 'Banana'...");
        boolean removed = inventory.removeProduct("Banana");
        System.out.println("Removed? " + removed);

        System.out.println("\nUpdated Inventory:");
        inventory.printInventory();
    }
}