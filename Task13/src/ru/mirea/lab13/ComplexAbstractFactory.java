package ru.mirea.lab13;

public interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(int real, int image);
}
