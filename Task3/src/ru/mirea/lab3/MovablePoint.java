package ru.mirea.lab3;
public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public  String toString()
    {
        return "Точка (" + x + ", " + y + ")";
    }
    public void moveUp()
    {
        y++;
    }
    public void moveDown()
    {
        y--;
    }
    public void moveLeft()
    {
        x--;
    }
    public void moveRight()
    {
        x++;
    }
}
