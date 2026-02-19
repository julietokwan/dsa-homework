Week 3 – Product Inventory System (Java)
Overview
This project was completed for my Week 3 Data Structures & Algorithms assignment.
The goal was to design a simple inventory management system using Object‑Oriented Programming and Java Collections.
The project demonstrates:
- Class design and interaction
- Use of Vector<Product> to store objects
- Searching, adding, removing, and printing data
- Writing a tester class to verify functionality
  Project Structure
1. Product.java
   Represents a single product with:
- name
- price
- quantity
  Includes:
- Constructor
- Getters & setters
- toString() for clean output formatting
2. ProductInventory.java
   Manages a collection of Product objects using a Vector.
   Methods implemented:
- addProduct(Product product)
- removeProduct(String name)
- findProduct(String name)
- printInventory()
  This class handles all inventory operations.

3. InventoryTester.java
   Contains the main method used to test the system.
   The tester:
- Creates a ProductInventory
- Adds sample products
- Prints the inventory
- Searches for a product
- Removes a product
- Prints the updated inventory

Sample Output
Running the tester produces:
Current Inventory:
Apple - $1.25 (10 in stock)
Banana - $0.75 (20 in stock)
Milk - $4.5 (5 in stock)

Searching for 'Milk':
Found: Milk - $4.5 (5 in stock)

Removing 'Banana'...
Removed? true

Updated Inventory:
Apple - $1.25 (10 in stock)
Milk - $4.5 (5 in stock)
How to Run
- Open the project in IntelliJ IDEA
- Navigate to InventoryTester.java
- Click the green Run button next to the main method
- View the output in the console

Reflection
This assignment helped me strengthen my understanding of:
- How classes interact in Java
- How to manage objects using collections
- How to design methods that work together to form a complete system
- How to test functionality using a dedicated tester class
  It also improved my confidence in writing clean, organized code.


