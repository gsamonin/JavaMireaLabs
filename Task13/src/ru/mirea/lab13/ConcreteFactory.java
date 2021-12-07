package ru.mirea.lab13;

import java.util.Random;

public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        Random rand = new Random();
        return new Complex(rand.nextInt(), rand.nextInt());
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex num = factory.createComplex();
        System.out.println(num);
    }
}

