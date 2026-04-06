package models;

public class PhysicalProduct extends Product {
    private double shippingWeightKg;

    public PhysicalProduct(String id, String name, double currentPrice, double targetPrice, double shippingWeightKg) {
        super(id, name, currentPrice, targetPrice);
        this.shippingWeightKg = shippingWeightKg;
    }

    @Override
    public String getDisplayDetails() {
        return "[Physical] " + getName() + " | Price: $" + getCurrentPrice() + " | Weight: " + shippingWeightKg + "kg";
    }
}