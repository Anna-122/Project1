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
    public void PersonTalk(){
        System.out.println("Меня зовут " + FullName);
    }
    public void PersonMove(){
        System.out.println(" Сегодня я собираюсь на курсы " );
    }


}