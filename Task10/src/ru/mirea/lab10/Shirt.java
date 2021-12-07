package ru.mirea.lab10;

public class Shirt {
    private  String article, fullName, color, size;
    public Shirt(String stringToParse)
    {
        String[] s = stringToParse.split(",");
        article = s[0];
        fullName = s[1];
        color = s[2];
        size = s[3];
    }
    public String toString()
    {
    return "Футболка:\n" +
            "\tАрктикул = " + article +
            "\n\tНазвание = " + fullName +
            "\n\tЦвет = " + color +
            "\n\tРазмер = " + size;
    }
}
