package models;

import exceptions.WishlistException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wishlist {
    private List<Product> items;
    private final int MAX_ITEMS = 50;

    public Wishlist() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) throws WishlistException {
        if (product == null) {
            throw new IllegalArgumentException("Cannot add a null product.");
        }
        if (items.size() >= MAX_ITEMS) {
            throw new WishlistException("Wishlist is full. Maximum " + MAX_ITEMS + " items allowed.");
        }
        
        boolean exists = items.stream().anyMatch(item -> item.getId().equals(product.getId()));
        if (exists) {
            throw new WishlistException("Product '" + product.getName() + "' is already in the wishlist.");
        }
        
        items.add(product);
        System.out.println("Added to wishlist: " + product.getName());
    }

    public void removeItem(String productId) throws WishlistException {
        Optional<Product> productToRemove = items.stream()
                .filter(item -> item.getId().equals(productId))
                .findFirst();

        if (productToRemove.isPresent()) {
            items.remove(productToRemove.get());
            System.out.println("Removed from wishlist: " + productToRemove.get().getName());
        } else {
            throw new WishlistException("Cannot remove: Product ID '" + productId + "' not found.");
        }
    }

    public void displayWishlist() {
        System.out.println("\n--- Current Wishlist ---");
        if (items.isEmpty()) {
            System.out.println("Your wishlist is empty.");
            return;
        }
        for (Product item : items) {
            System.out.println(item.getDisplayDetails());
        }
        System.out.println("Total Estimated Value: $" + calculateTotalValue());
        System.out.println("------------------------\n");
    }

    private double calculateTotalValue() {
        return items.stream().mapToDouble(Product::getCurrentPrice).sum();
    }
}