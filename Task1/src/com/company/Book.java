package com.company;

import java.lang.*;
public class Book {
    String name, Genre, Author;
    int Price, Year;
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public void setAuthor (String Author)
    {
        this.Author = Author;
    }
    public void setYear (int Year)
    {
        this.Year = Year;
    }
    public void setPrice (int Price)
    {
        this.Price = Price;
    }
    public String getGenre(String Genre){
        return Genre;
    }
    public String getName(String name){
        return name;
    }
    public String getAuthor(String Author){
        return Author;
    }
    public int getYear(int Year) {
        return Year;
    }
    public int getPrice (int Price)
    {
        return Price;
    }
    public String toString() {
        return "Жанр - " + this.Genre + ", Название - " + this.name + ", Автор - "+ this.Author + ", Год выпуска -"+ this.Year + ", Цена - "+ this.Price + " Рублей";
    }
}