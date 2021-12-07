package com.company;
public abstract class Furniture extends FurnitureShop {
    private int width;
    private int height;
    private int depth;
    public Furniture(String type, String production, int price, String material) {
        super(type, production, price, material);
    }
    public Furniture(String type, String production, int price, String material, int width, int height, int depth) {
        super(type, production, price, material);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Furniture(String type, String production, int price, String material, int width, int height) {
        super(type, production, price, material);
        this.width = width;
        this.height = height;
    }
    public  int getWidth()
    {
        return width;
    }
    public  int getHeight()
    {
        return height;
    }
    public int getDepth()
    {
        return depth;
    }
}
