package com.uits.task9;

public class test {
    int Age;
    String Name;

    test(int age, String name) {
        System.out.println("Конструирование объекта с двумя аргументами");
        Age = age;
        Name = name;
    }

    test(String name) {
        System.out.println("Конструирование объекта с одним аргументом name");
        Name = name;
        Age=0;
    }
    test() {
        System.out.println("Конструирование объекта без аргументов");
        Name = null;
        Age = 0;
    }

}