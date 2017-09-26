package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDTo {
    public Producent producent;
    public Product product;
    public boolean isOrdered;

    public OrderDTo(Producent producent, Product product, boolean isOrdered) {
        this.producent = producent;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Producent getProducent() {
        return producent;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
