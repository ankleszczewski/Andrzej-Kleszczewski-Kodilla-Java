package com.kodilla.good.patterns.challenges.service;

public class OrderDTo {

    public User user;
    public Product product;
    public boolean isOrdered;

    public OrderDTo(User user, Product product, boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
