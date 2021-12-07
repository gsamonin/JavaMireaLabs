package com.company;
import java.lang.*;
import java.util.Scanner;
public class Book {
    String Name, Genre, Author;
    int Price, Year;
    Scanner sc = new Scanner(System.in);
    public Book(String gnr, String word, String auth, int prc, int yer) {
        Genre = gnr;
        Name = word;
        Author = auth;
        Price = prc;
        Year = yer;
    }
    public int getYear() {
        return Year;
    }
    public int getPrice() {
        return Price;
    }
    public String getAuthor() {
        return Author;
    }
    public String getName() {
        return Name;
    }
    public String getJanr() {
        return Genre;
    }
    public void setJanrName ( String gnr) {
        Genre = gnr;
    }
    public void setName (String word){
        Name = word;
    }
    public void setAuthor (String auth)
    {
        Author = auth;
    }
    public  void  setPrice (int prc)
    {
        Price = prc;
    }
    public  void setYear (int yer)
    {
        Year = yer;
    }
}