package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        int [] Array = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Изначальный массив: ");
        for (int i =0; i < Array.length; i++){
            Array[i] = (int) Math.round((Math.random()* 30) - 15);
        }
        for (int i =0; i < 10; i++){
            System.out.print("A[" + (i+1) + "] = ");
            System.out.println(Array[i]);
        }
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < Array.length - 1; i++) {
                if (Array[i] > Array[i + 1]) {
                    temp = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int i =0; i < 10; i++) {
            System.out.print("A[" + (i + 1) + "] = ");
            System.out.println(Array[i]);
        }
    }
}

