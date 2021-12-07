package ru.mirea.lab5;
import java.util.Scanner;

public class Main {
    public static int NumberNine(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return NumberNine(a, b - 1) + NumberNine(a - 1, b - 1);
    }
    public static int NumberTen(int n, int a) {
        class NumberTen {
            int n = 123456789;
            int a = 0;
        }
        if (n == 0) {
            return a;
        } else {
            return NumberTen(n / 10, 10 * a + n % 10);
        }
    }
        public static void NumberTwelve ()
        {
            java.util.Scanner in = new java.util.Scanner(System.in);
            int n = in.nextInt();
            if (n > 0) {
                if (n % 2 == 1) {
                    System.out.println(n);
                    NumberTwelve();
                } else {
                    NumberTwelve();
                }
            }
        }
        public static void main (String[]args){
            int a, b;
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите первое число a:");
            a = sc.nextInt();
            System.out.print("Введите второе число b:");
            b = sc.nextInt();
            System.out.print("Первое задание: ");
            System.out.println(NumberNine(a, b));
            System.out.print("Второе задание: ");
            System.out.println(NumberTen(123456789, 0));
            System.out.println("Третье задание: ");
            System.out.println("Чтобы закрыть программу введите '0'");
            NumberTwelve();
        }
    }
