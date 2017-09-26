package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Producent glutenFreeShop = new GlutenFreeShop();

        Product product = new Product("Chipsy bezglutenowe", 7.99);

        return new OrderRequest(glutenFreeShop, product, 2);
    }
}
