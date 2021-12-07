package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String Janr, Name, Avtor;
        int Year, Price;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите жанр - ");
        Janr = sc.nextLine();
        System.out.print("Введите название книги - ");
        Name = sc.nextLine();
        System.out.print("Введите Автора книги - ");
        Avtor = sc.nextLine();
        System.out.print("Введите год издания - ");
        Year = sc.nextInt();
        System.out.print("Введите Цену - ");
        Price = sc.nextInt();
        Book Kniga = new Book(Janr,Name, Avtor, Year, Price);
        System.out.println("Жанр = "  +  Kniga.getJanr() + " Название - " + Kniga.getName() + " Автор - " + Kniga.getAuthor() + " Год издания - " + Kniga.getYear() + " Цена - " + Kniga.getPrice()+ " Руб.");
    }
}
