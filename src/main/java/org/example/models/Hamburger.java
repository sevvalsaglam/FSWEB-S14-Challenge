package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private Souces souces;

    public String additionName( String number){
        return "addition"+ number + "Name";
    }

    public String additionPrice( String number){
        return "addition"+ number + "Price";
    }

}
