package com.kodilla.good.patterns.challenges.Food2Door;


public class GlutenFreeShop implements Producent {
    private final String producentName = "Gluten Free Shoop";

    @Override
    public void order(OrderRequest orderRequest) {
        System.out.println("Thank you for order from " + producentName + ", your " + orderRequest.getProduct() +
        " will be send soon");
    }
}
