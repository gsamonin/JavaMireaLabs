package ru.mirea.lab6;

public class Student {
    private int id;
    private double point;
    public Student(int id, double point){
        this.id = id;
        this.point = point;
    }
    public int getId() {
        return id;
    }
    public double getPoint() {
        return point;
    }
    public String toString(){
        String s = "";
        s = s + this.id + " - " + this.point;
        return s;
    }
}
