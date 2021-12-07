package com.company;

public class Chair extends FurnitureShop {
    private int backHeight;

    public Chair (String type, String production, int price, String material)
    {
        super(type, production, price, material);
    }
    public Chair (String type, String production, int price, String material, int backHeight)
    {
        super(type, production, price, material);
        this.backHeight = backHeight;
    }
    public Chair (String type, int price, String material, int backHeight)
    {
        super(type, material, price, material);
        this.backHeight = backHeight;
    }
    public int getBackHeight()
    {
        return backHeight;
    }
}
