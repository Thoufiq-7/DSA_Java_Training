import models.DigitalProduct;
import models.PhysicalProduct;
import models.Product;
import models.User;
import models.Wishlist;
import exceptions.WishlistException;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Initializing Wishlist System ===");
        
        User user = new User("Alice_Shopper");
        Wishlist myWishlist = user.getWishlist();

        Product laptop = new PhysicalProduct("P001", "Gaming Laptop", 1200.00, 1000.00, 2.5);
        Product ebook = new DigitalProduct("D001", "Java Programming Guide", 45.00, 30.00, 15.0);
        Product headphones = new PhysicalProduct("P002", "Noise Cancelling Headphones", 300.00, 250.00, 0.4);

        try {
            System.out.println("\n[Test 1] Adding Items:");
            myWishlist.addItem(laptop);
            myWishlist.addItem(ebook);
            myWishlist.addItem(headphones);
            
            myWishlist.displayWishlist();

            System.out.println("[Test 2] Attempting to add a duplicate item:");
            myWishlist.addItem(ebook); 

        } catch (WishlistException | IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\n[Test 3] Simulating Price Drops:");
            laptop.updatePrice(1150.00); 
            ebook.updatePrice(25.00);    

            System.out.println("\n[Test 4] Removing an item:");
            myWishlist.removeItem("P002");
            myWishlist.displayWishlist();

            System.out.println("[Test 5] Attempting to remove missing item:");
            myWishlist.removeItem("X999"); 

        } catch (WishlistException | IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}