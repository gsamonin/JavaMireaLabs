package ru.mirea.lab14;

public class VictorianChair implements Chair{
    private final String owner;

    public VictorianChair(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public String toString() {
        return "VictorianChair{" +
                "owner='" + owner + '\'' +
                '}';
    }

    public void printChair() {
        System.out.println("Викторианский стул");
    }
}
