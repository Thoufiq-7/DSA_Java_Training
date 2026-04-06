package models;

public class DigitalProduct extends Product {
    private double fileSizeMB;

    public DigitalProduct(String id, String name, double currentPrice, double targetPrice, double fileSizeMB) {
        super(id, name, currentPrice, targetPrice);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getDisplayDetails() {
        return "[Digital] " + getName() + " | Price: $" + getCurrentPrice() + " | Size: " + fileSizeMB + "MB";
    }
}