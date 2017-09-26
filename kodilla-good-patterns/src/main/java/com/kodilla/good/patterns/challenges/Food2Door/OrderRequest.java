package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequest {
    public Producent producent;
    public Product product;
    public int quantity;

    public OrderRequest(Producent producent, Product product, int quantity) {
        this.producent = producent;
        this.product = product;
        this.quantity = quantity;
    }

    public Producent getProducent() {
        return producent;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "producent=" + producent +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
