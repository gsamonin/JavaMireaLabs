package com.company;

public class Main {

    public static void main(String[] args) {
        FurnitureShop furniture = new Chair ("Стул ","Лыткарино", 1999, "Осина ");
        System.out.print("Тип мебели: " + furniture.getType());
        System.out.print(" Производитель: " + furniture.getProduction());
        System.out.print(" Цена: " + furniture.getPrice());
        System.out.print(" Материал: " + furniture.getMaterial());
        System.out.println("");
        FurnitureShop shkaf = new Cupboard("Шкаф ","Москва", 12990, "ДСП ");
        System.out.print("Тип мебели: " + shkaf.getType());
        System.out.print(" Производитель: " + shkaf.getProduction());
        System.out.print(" Цена: " + shkaf.getPrice() );
        System.out.print(" Материал: " + shkaf.getMaterial());
    }
}
