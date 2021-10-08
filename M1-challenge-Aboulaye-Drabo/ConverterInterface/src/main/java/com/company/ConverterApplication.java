package com.company;

public class ConverterApplication {

    public static void main(String[] args) {

        Converter convertIf = new ConverterIf();
        Converter convertSwitch = new ConverterSwitch();

        System.out.format("The 3rd month is %s%n", convertIf.convertMonth(3));
        System.out.format("The 4th day is %s%n", convertIf.convertDay(4));
        System.out.format("The 2nd month is %s%n", convertSwitch.convertMonth(2));
        System.out.format("The 6th day is %s%n", convertSwitch.convertDay(6));

    }
}
