package com.company;

import java.util.Objects;

public class InFactory {
    private String name;
    private Boolean seasonal;
    private boolean dairyFree;
    private String costToMake;
    private int month;

    public InFactory(String name, int month) {
        System.out.println("IN FACTORY TRANSACTION");
        this.name = name;
        this.month = month;
        this.dairyFree = isItDairyFree(name);
        this.costToMake = costDetails(name);
        String inStock = isItInStock(name, month);
        if (inStock == "In Season!"){
            this.seasonal = true;
        }else this.seasonal = false;

        System.out.println("**Name: " + name);
        System.out.println("**Is it currently in season?:  " + seasonal);
        System.out.println("**Is it Dairy Free?:  " + dairyFree);
        System.out.println("**costToMake: " + costToMake);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(Boolean seasonal) {
        this.seasonal = seasonal;
    }

    public boolean isDairyFree() {
        return dairyFree;
    }

    public void setDairyFree(boolean dairyFree) {
        this.dairyFree = dairyFree;
    }

    public String getCostToMake() {
        return costToMake;
    }

    public void setCostToMake(String costToMake) {
        this.costToMake = costToMake;
    }
    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String costDetails(String name){
        if(name == "Rocky Road") {
            costToMake = "$3.00";
        } else if(name == "Rainbow") {
            costToMake = "$1.75";
        }else if(name == "Tropical Madness") {
            costToMake = "$2.50";
        }else  {
            costToMake = "Please enter valid ice cream flavor.";
        }

        return costToMake;
    }

    public Boolean isItDairyFree(String name){
        if(name == "Rocky Road") {
            dairyFree = false;
        } else if(name == "Rainbow") {
            dairyFree = false;
        }else if(name == "Tropical Madness") {
            dairyFree = true;
        }else  {
            costToMake = "Please enter valid ice cream flavor.";
        }

        return dairyFree;
    }

    public String isItInStock(String name, int month){
        Boolean inStock = false;
        String inStockResponse = "";

        if(name == "Rocky Road") {
            if(month > 0 && month < 13) {
                inStock = true;
            }else inStock = false;
        } else if(name == "Rainbow") {
            if(month > 6 && month < 13) {
                inStock = true;
            }else inStock = false;
        }else if(name == "Tropical Madness") {
            if(month > 0 && month < 5) {
                inStock = true;
            }else inStock = false;
        }else  {
            inStock = false;
            inStockResponse = "Please enter a valid month number";
        }

        if(inStock == true){
            inStockResponse = "In Season!";
        }else if (inStockResponse.length() > 2){
        }
        else{
            inStockResponse = "Not in Season!";
        }

        return inStockResponse;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InFactory inFactory = (InFactory) o;
        return dairyFree == inFactory.dairyFree && costToMake == inFactory.costToMake && Objects.equals(seasonal, inFactory.seasonal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seasonal, dairyFree, costToMake);
    }

    @Override
    public String toString() {
        return "InFactory{" +
                "seasonal='" + seasonal + '\'' +
                ", dairyFree=" + dairyFree +
                ", costToMake=" + costToMake +
                '}';
    }
}
