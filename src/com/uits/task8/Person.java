package com.uits.task8;

public class Person {
    String FullName;
    int Age;

    Person(int age, String name) {
        System.out.println("Конструирование объекта с двумя аргументами");
        Age = age;
        FullName = name;    }
    Person() {
        System.out.println("Конструирование объекта без аргументов");
        FullName = null;
        Age = 0;
    }
    void talk() {
        System.out.println("Меня зовут" + FullName);
    }
    /*void move() {
        System.out.println("Меня зовут"+FullName);
    }*/

    public static void main( int[] args ) {
        Person a = new Person();
    }


}