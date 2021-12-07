package com.company;

public class Cupboard extends FurnitureShop {
    private int numberOfBoxes;

    public Cupboard (String type, String production, int price, String material)
    {
        super(type, production,price,material);
    }
    public Cupboard(String type, String production, int price, String material, int numberOfBoxes)
    {
        super(type, production, price, material);
        this.numberOfBoxes = numberOfBoxes;
    }
    public int getNumberOfBoxes()
    {
        return  numberOfBoxes;
    }
}
