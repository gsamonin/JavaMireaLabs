package ru.mirea.lab14;

public class MagicChair implements Chair{
    private final String material;

    public MagicChair(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    public void someMagic(){
        System.out.println("Magic");
    }
    public String toString() {
        return "MagicChair{" +
                "material='" + material + '\'' +
                '}';
    }
    public void printChair() {
        System.out.println("Магический стул");
    }
}