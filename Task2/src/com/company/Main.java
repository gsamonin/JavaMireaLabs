package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = "";
        System.out.print("Введите ваш email - ");
        email = sc.nextLine();
        Author Avtor = new Author("George", email, 'M' );
        System.out.print(Avtor.toString());
    }
}
