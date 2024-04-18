import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product
{
		private String productName;
		private int productId; 
        private double price;
        private int quantityInStock;
        
        public Product(String productName, int productId, double price, int quantityInStock) {  
            this.productName = productName;
            this.productId = productId;
            this.price = price;
            this.quantityInStock = quantityInStock;
        }
        
        public String getName() {
            return productName;
        }
 
        public int getId() {
            return productId;
        }
 
        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantityInStock;
        }

        public void setQuantity(int quantityInStock) {
            this.quantityInStock = quantityInStock;
        }
        
        public void displayDetails() {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productId);
            System.out.println("Price: $" + price);
            System.out.println("Quantity in Stock: " + quantityInStock);
        }
}

 class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(String productName, int productId, double price, int quantityInStock, String brand, int warrantyPeriod) {
        super(productName, productId, price, quantityInStock);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}

class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String productName, int productId, double price, int quantityInStock, String size, String material) {
        super(productName, productId, price, quantityInStock);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Shopping Cart Contents:-");
            for (Product product : items) {
                product.displayDetails();
                System.out.println("------------------------");
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        try {
            System.out.println("Adding electronics to the cart!");
            Electronics laptop = new Electronics("Tab", 1, 700, 5, "Dell", 2);
            cart.addItem(laptop);

            System.out.println("Adding clothing to the cart!");
            Clothing shirt = new Clothing("Shirt", 2, 25, 10, "XL", "Cotton");
            cart.addItem(shirt);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        cart.displayCart();
        System.out.println("Total Price: $" + cart.calculateTotal());

        scanner.close();
    }
}