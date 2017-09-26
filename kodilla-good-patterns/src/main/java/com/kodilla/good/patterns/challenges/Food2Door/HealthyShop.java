package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Producent {
    public final String producentName = "Healthy Shop";


    @Override
    public void order(OrderRequest orderRequest) {
        System.out.println("Thank you for order from " + producentName);
    }
}
