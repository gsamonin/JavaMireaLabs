package ru.mirea.lab6;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Student[] stud = new Student[5];
        stud[0] = new Student(25, 60);
        stud[1] = new Student(6, 75);
        stud[2] = new Student(8, 45);
        stud[3] = new Student(14, 30);
        stud[4] = new Student(17, 95);

        for(int i = 0; i < stud.length; i++){
            Student value = stud[i];
            int j = i-1;
            for( ; j >=0; j--){
                if(value.getId() < stud[j].getId()){
                    stud[j+1] = stud[j];
                }
                else {
                    break;
                }

            }
            stud[j+1] = value;
        }
        System.out.println("Задание 1");
        System.out.println(Arrays.toString(stud));
        System.out.println("Задание 2");
        Student[] stud1 = new Student[5];
        stud1[0] = new Student(25, 50);
        stud1[1] = new Student(6, 60);
        stud1[2] = new Student(8, 30);
        stud1[3] = new Student(14, 85);
        stud1[4] = new Student(13, 65);
        SortingClass ssbg = new SortingClass();
        stud1 = ssbg.quickSort(stud1, 0, 4);
        System.out.println(Arrays.toString(stud1));
        System.out.println("Задание 3");
        Student[] stud2 = new Student[6];
        stud2[0] = new Student(25, 75);
        stud2[1] = new Student(24, 45);
        stud2[2] = new Student(14, 50);
        stud2[3] = new Student(13, 45);
        stud2[4] = new Student(7, 25);
        stud2[5] = new Student(9, 65);
        stud2 = ssbg.SortUnsorted(stud2, 0, 5);
        System.out.println(Arrays.toString(stud2));
    }
}
