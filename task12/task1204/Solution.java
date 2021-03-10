package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (o.getClass().equals(new Cat().getClass())) System.out.println("Кошка");
        if (o.getClass().equals(new Dog().getClass())) System.out.println("Собака");
        if (o.getClass().equals(new Bird().getClass())) System.out.println("Птица");
        if (o.getClass().equals(new Lamp().getClass())) System.out.println("Лампа");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
