package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger(); // Base class'dan gelen fiyatı alır

        if (this.healthyExtra1Name != null) {
            System.out.println("Healthy Addition1: " + this.healthyExtra1Name);
            totalPrice += this.healthyExtra1Price;
        }

        System.out.println("Total Price: " + totalPrice);
        return totalPrice;
    }
}
