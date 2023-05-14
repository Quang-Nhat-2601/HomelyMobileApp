package com.example.homely;

public class Product {
    private String name;
    private double price;
    private String description;
    private int resourceImage;

    public Product(String name, double price, String description, int resourceImage) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.resourceImage = resourceImage;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResourceImage() {
        return resourceImage;
    }

    public void setResourceImage(int resourceImage) {
        this.resourceImage = resourceImage;
    }
}
