package models;

public abstract class Product {
    private String id;
    private String name;
    private double currentPrice;
    private double targetPrice; 

    public Product(String id, String name, double currentPrice, double targetPrice) {
        if (id == null || id.isEmpty() || name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product ID and Name cannot be empty.");
        }
        if (currentPrice < 0 || targetPrice < 0) {
            throw new IllegalArgumentException("Prices cannot be negative.");
        }
        this.id = id;
        this.name = name;
        this.currentPrice = currentPrice;
        this.targetPrice = targetPrice;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getCurrentPrice() { return currentPrice; }
    public double getTargetPrice() { return targetPrice; }

    public void updatePrice(double newPrice) {
        if (newPrice < 0) throw new IllegalArgumentException("Price cannot be negative.");
        this.currentPrice = newPrice;
        if (this.currentPrice <= this.targetPrice) {
            System.out.println("🔔 ALERT: '" + this.name + "' has dropped to $" + 
                               this.currentPrice + "! (Target: $" + this.targetPrice + ")");
        }
    }

    public abstract String getDisplayDetails();
}