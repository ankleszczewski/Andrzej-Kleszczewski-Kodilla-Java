package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {
    public String productName;
    public double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product: " +
                productName + " for " +
                productPrice;
    }
}
