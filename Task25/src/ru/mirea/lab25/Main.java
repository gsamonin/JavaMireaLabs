package ru.mirea.lab25;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String PATH = "D:\\SomeText.txt";
        Scanner sc = new Scanner(System.in);
        File file = new File(PATH);
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        fw.append(sc.nextLine());
        fw.close();
        }
    }