package ru.mirea.lab3;

public class MovableCircle implements Movable {
    public int radius;
    public MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }
    public String toString()
    {
        return "Окружность (" + center.x + ", " + center.y + ") " + "Радиус = " + radius;
    }
    public void moveUp()
    {
        center.moveUp();
    }
    public void moveDown()
    {
        center.moveDown();
    }
    public void moveRight()
    {
        center.moveRight();
    }
    public void moveLeft()
    {
        center.moveLeft();
    }
}
