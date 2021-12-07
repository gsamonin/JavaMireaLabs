package ru.mirea.lab7;
import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> player1 = new Stack<Integer>();
        Stack<Integer> player2 = new Stack<Integer>();
        Stack<Integer> buffer = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int t = sc.nextInt();
            player1.add(t);
        }
        for (int i = 0; i < 5; i++) {
            int t = sc.nextInt();
            player2.add(t);
        }
        int counter = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && (counter <= 106)) {
            counter++;
            int p1 = player1.pop();
            int p2 = player2.pop();
            if ((p1 > p2) | (p1 == 0) && (p2 == 9)) {
                while (!player1.isEmpty()) buffer.add(player1.pop());
                player1.add(p1);
                player1.add(p2);
                while (!buffer.isEmpty()) player1.add(buffer.pop());
            } else if ((p1 < p2) | (p2 == 0) && (p1 == 9)) {
                while (!player2.isEmpty()) buffer.add(player2.pop());
                player2.add(p2);
                player2.add(p1);
                while (!buffer.isEmpty()) player2.add(buffer.pop());
            }
        }
        if (player1.isEmpty()) {
            System.out.print("Second " + counter);
        } else if (player2.isEmpty()) {
            System.out.print("First " + counter);
        } else System.out.print("Botva");
    }
}
