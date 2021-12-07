package ru.mirea.lab3;
public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0,0,1,1);
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println(point);
        MovableCircle circle = new MovableCircle(0,0,2,2,6);
        System.out.println(circle);
        circle.moveRight();
        circle.moveDown();
        System.out.println(circle);
    }
}
