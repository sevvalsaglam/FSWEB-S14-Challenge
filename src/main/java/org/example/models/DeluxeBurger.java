package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger(String name, String meat, String breadRollType, String cips, String drink) {
        super(name, meat, 19.10, breadRollType);
        this.cips=cips;
        this.drink=drink;
    }

    @Override
    public double getPrice() {
        return 19.10;
    }

    public DeluxeBurger() {
        super();
    }


    public String getCips() {
        return "CURVY";
    }

    public String getDrink() {
        return "COKE";
    }


    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger(); // Base class'dan gelen fiyatı alır
        totalPrice+= getPrice();
        System.out.println("Total Price: " + totalPrice);
        return totalPrice;
    }
}
