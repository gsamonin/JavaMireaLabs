package ru.mirea.lab10;

public class Main {
    public static void main(String[] args) {
        Person user1 = new Person("Самонин", "Георгий", "Максимович");
        Person user2 = new Person("Одиноков"," ","Валерьевич");
        Person user3 = new Person("Тен"," "," ");
        Address addr1 = new Address("Россия , Москва , Москва, Мячковский бульва, 3, 0, 171", false);
        String[] strs = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };
        System.out.println("Задание 1");
        System.out.println(user1.getFullName());
        System.out.println(user2.getFullName());
        System.out.println(user3.getFullName());
        System.out.println("Задание 2");
        System.out.println(addr1);
        System.out.println("Задание 3");
        Shirt[] shirts = new Shirt[strs.length];
        for (int i = 0; i < strs.length; i++) {
            shirts[i] = new Shirt(strs[i]);
            System.out.println(shirts[i]);
        }
    }
}
