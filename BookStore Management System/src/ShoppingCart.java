public class ShoppingCart {
    private List<Book> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Book item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void addItem(Book book) {
        items.add(book);
    }

    public void removeItem(Book book) {
        items.remove(book);
    }

    public void displayItems() {
        System.out.println("Shopping Cart:");
        for (Book item : items) {
            System.out.println("Title: " + item.getTitle() + ", Author: " + item.getAuthor() + ", Price: $" + item.getPrice());
        }
    }
}