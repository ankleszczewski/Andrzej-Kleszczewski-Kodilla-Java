package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {

    public OrderDTo process(OrderRequest orderRequest) {
       Producent producent = orderRequest.getProducent();
       producent.order(orderRequest);
       return new OrderDTo(orderRequest.getProducent(), orderRequest.getProduct(), true);
    }
}
