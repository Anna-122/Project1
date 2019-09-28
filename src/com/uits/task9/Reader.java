/*Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
 ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
   - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
   - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
   - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
                */
package com.uits.task9;

public class Reader {
    String name;
    String secondName;
    int ticketNumber;
    String faculty;
    String phoneNumber;
    String bornDate;
    int countBook;
    String nameBook;
    String authorName;



    Reader( String name, String secondName, int ticketNumber, String faculty, String phoneNumber, String bornDate, int CountBook, String nameBook, String authorName) {
        this(name, secondName, ticketNumber, CountBook,nameBook,authorName);
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.bornDate = bornDate;
    }
    Reader( String name, String secondName, int ticketNumber, int CountBook, String nameBook, String authorName ) {
         this(name, secondName, CountBook);
        this.name = name;
        this.secondName = secondName;
        this.ticketNumber = ticketNumber;
        this. nameBook=nameBook;
        this.authorName=authorName;

    }
    Reader( String name, String secondName, int CountBook ) {
        this();
        this.name = name;
        this.secondName = secondName;
        this.countBook = CountBook;
    }

    Reader(){
        System.out.println(" конструктор по умолчанию");
    }


    public void takeBook( int countBook ) {
        System.out.println(name + secondName + "взял" + countBook + "книг");
        countBook = countBook;
    }

    public void takeBook( String[] bookTitles) {
        System.out.println(name+ secondName + "взял:");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println(bookTitles[i]);
        }
    }

    public void takeBook(){
        System.out.println(name+ secondName + "взял книги:"+ nameBook + authorName);
    }

    public void returnBook(int countBook){
        System.out.println(name+ secondName + "вернул"+countBook + "книг" + nameBook + authorName);
    }

    /*public void returnBook(String[] bookTitles){
        System.out.println(name+ secondName + "вернул"+countBook + "книг" + nameBook + authorName);
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println(bookTitles[i]);
        }
    }*/


}
