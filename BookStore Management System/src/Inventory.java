public class Inventory {
    private List<Book> book;

    public Inventory() {
        book = new ArrayList<>();
    }

    public void addBook(Book book) {
        book.add(book);
    }

    public void removeBook(Book book) {
        book.remove(book);
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Book book : book) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: $" + book.getPrice());
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : book) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : book) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> findBooksByPriceRange(double minPrice, double maxPrice) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : book) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
