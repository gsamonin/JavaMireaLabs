package com.company;

public class FurnitureShop
{
    private String production;
    private int price;
    private String material;
    private String type;

    public FurnitureShop(String type, String production, int price, String material)
    {
        this.production = production;
        this.price = price;
        this.material = material;
        this.type = type;
    }

    public String getProduction()
    {
        return production;
    }
    public int getPrice()
    {
        return price;
    }
    public String getMaterial()
    {
        return material;
    }
    public String getType()
    {
        return type;
    }
}
