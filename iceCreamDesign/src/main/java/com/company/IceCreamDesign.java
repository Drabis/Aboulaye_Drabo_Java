package com.company;

public class IceCreamDesign {
    public static void main(String[] args) {
        PointOfSale x = new PointOfSale("Rocky Road");
        PointOfSale w = new PointOfSale("Cookie and cream");

        InFactory y = new InFactory("Rocky Road", 5);
        InFactory p = new InFactory("Cookie and cream", 5);
    }
}
