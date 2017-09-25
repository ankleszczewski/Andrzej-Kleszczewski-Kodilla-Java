package com.kodilla.good.patterns.challenges.service;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Piotruś", "Pieczarka", "Świerzak");
        Product product = new Product("Klapki Kubota", 15.99);

        return new OrderRequest( user, product);

    }
}
