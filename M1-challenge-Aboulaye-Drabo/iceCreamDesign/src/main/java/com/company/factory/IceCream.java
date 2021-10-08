package com.company.factory;

public class IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String[] ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, int productionTime, String[] ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public void replaceIngredient(int index, String ingredient) {
        ingredients[index] = ingredient;
    }

    public void orderFlavor(double quantity) {
        System.out.format("%d gallons of %s ice cream will take %d hours to produce%n", quantity, flavor, productionTime * quantity);
        System.out.format("It will cost %.2f to produce and should be sold at %.2f %n", productionCost * quantity, salePrice * quantity);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice(double quantity) {
        return salePrice * quantity;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost(double quantity) {
        return productionCost * quantity;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime(int quantity) {
        return productionTime * quantity;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}
