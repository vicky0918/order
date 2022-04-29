package com.fju.order;

public class Order{
    int amount;
    Delivery delivery;
    int total;
    int shipFeed;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        this.shipFeed = delivery.price;
    }
    public int total() {
        total = amount + delivery.price;
        return total;
    }
}
