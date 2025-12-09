package com.pluralsight.northwindtradersspringboot;

public class Product {
    private int productId;
    private String name;
    private String category;
    private double price;

    public Product(int productId, String name, String category, double price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("""
                ID:       %d
                Name:     %s
                Category: %s
                Price:    %.2f""",
                productId, name, category, price);
    }
}
