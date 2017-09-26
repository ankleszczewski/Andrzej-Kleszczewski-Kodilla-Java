package com.kodilla.good.patterns.challenges.Food2Door;


public class ExtraFoodShop implements Producent {
    private final String producentName = "Extra Food Shop";

    @Override
    public void order(OrderRequest orderRequest) {
        System.out.println("Thank you for order from " + producentName);
    }
}
