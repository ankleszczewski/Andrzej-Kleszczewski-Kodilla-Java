package com.kodilla.good.patterns.challenges.service;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product) {
        return false;
    }
}
