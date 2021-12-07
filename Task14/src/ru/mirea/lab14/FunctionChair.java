package ru.mirea.lab14;

public class FunctionChair implements Chair{
    public FunctionChair() {
    }
    public void func(int a, int b){
        System.out.println(a * b);
    }
    public void printChair() {
        System.out.println("Функцианальный стул");
    }
}
