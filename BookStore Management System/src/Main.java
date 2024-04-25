import java.util.ArrayList;
import java.util.List;

// Bookstore class representing the main application
public class Main {
    public static void main(String[] args) {
        // Create instances of Book, Inventory, and ShoppingCart
        Book book1 = new Book("Java Programming", "John Doe", 39.99);
        Book book2 = new Book("Python Basics", "Jane Smith", 29.99);

        Inventory inventory = new Inventory();
        ShoppingCart cart = new ShoppingCart();

        // Add books to inventory
        inventory.addBook(book1);
        inventory.addBook(book2);

        // Add books to shopping cart
        cart.addItem(book1);
        cart.addItem(book2);

        // Display inventory and total price of items in shopping cart
        inventory.displayInventory();
        System.out.println("Total Price in Shopping Cart: $" + cart.calculateTotalPrice());
        cart.displayItems();
    }
}
