package com.company;

import java.util.Objects;

public class PointOfSale {

    private String iceCreamName;
    private String iceCreamFlavor;
    private String iceCreamPrice;

    public PointOfSale(String iceCreamName) {
        System.out.println("POINT OF SALE TRANSACTION");
        this.iceCreamName = iceCreamName;
        this.iceCreamFlavor = flavorDetails(iceCreamName);
        this.iceCreamPrice = pricingDetails(iceCreamName);
        System.out.println("**Name: " + iceCreamName);
        System.out.println("**iceCreamFlavor: " + iceCreamFlavor);
        System.out.println("**iceCreamPrice: " + iceCreamPrice);
    }

    public String flavorDetails(String name){
        if(name == "Rocky Road") {
            iceCreamFlavor = "Chocolate ice cream, nuts, diced marshmallows.";
        } else if(name == "Rainbow") {
            iceCreamFlavor = "Vanilla ice cream, sprinkles.";
        }else if(name == "Tropical Madness") {
            iceCreamFlavor = "Orange sorbet, mango, pineapple.";
        }else  {
            iceCreamFlavor = "Please enter valid ice cream flavor.";
        }

        return iceCreamFlavor;
    }

    public String pricingDetails(String name){
        if(name == "Rocky Road") {
            iceCreamPrice = "$6.99";
        } else if(name == "Rainbow") {
            iceCreamPrice = "$6.50";
        }else if(name == "Tropical Madness") {
            iceCreamPrice = "$5.99";
        }else  {
            iceCreamPrice = "Please enter valid ice cream flavor.";
        }

        return iceCreamPrice;
    }

    public String getIceCreamName() {
        return iceCreamName;
    }

    public void setIceCreamName(String iceCreamName) {
        this.iceCreamName = iceCreamName;
    }

    public String getIceCreamFlavor() {
        return iceCreamFlavor;
    }

    public void setIceCreamFlavor(String iceCreamFlavor) {
        this.iceCreamFlavor = iceCreamFlavor;
    }

    public String getIceCreamPrice() {
        return iceCreamPrice;
    }

    public void setIceCreamPrice(String iceCreamPrice) {
        this.iceCreamPrice = iceCreamPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointOfSale that = (PointOfSale) o;
        return Objects.equals(iceCreamName, that.iceCreamName) && Objects.equals(iceCreamFlavor, that.iceCreamFlavor) && Objects.equals(iceCreamPrice, that.iceCreamPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iceCreamName, iceCreamFlavor, iceCreamPrice);
    }

    @Override
    public String toString() {
        return "PointOfSale{" +
                "iceCreamName='" + iceCreamName + '\'' +
                ", iceCreamFlavor='" + iceCreamFlavor + '\'' +
                ", iceCreamPrice='" + iceCreamPrice + '\'' +
                '}';
    }
}
