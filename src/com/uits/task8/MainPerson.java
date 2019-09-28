/*Создать класс Person, который содержит:
        a) поля fullName, age.
        б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
        в) Добавьте два конструктора  - Person() и Person(fullName, age).
        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).

*/
package com.uits.task8;

public class MainPerson {
    public static void main( String[] args ) {
        Person person1 = new Person();
        Person person2 = new Person(18,"Anna");

        person1.PersonMove();
        person1.PersonMove();
        person2.PersonTalk();
        person2.PersonTalk();
    }
}
