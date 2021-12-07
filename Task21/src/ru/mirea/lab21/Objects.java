package ru.mirea.lab21;

public class Objects implements Nameable {
        String name;
    Objects(String name)
    {
        this.name = name;
    }
    public void getName()
    {
        System.out.printf(name);
    }
}
