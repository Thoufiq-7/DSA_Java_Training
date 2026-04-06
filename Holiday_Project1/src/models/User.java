package models;

public class User {
    private String username;
    private Wishlist wishlist;

    public User(String username) {
        this.username = username;
        this.wishlist = new Wishlist();
    }

    public String getUsername() { return username; }
    public Wishlist getWishlist() { return wishlist; }
}