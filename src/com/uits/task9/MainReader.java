package com.uits.task9;

public class MainReader {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Анна","Гончарова",1234,"Прикладная лингвистика","0683122808","12.08.2001",10,"default","default");
        Reader reader2 = new Reader("Иван", "Петров",3456,"Компьютерные технологии","0685643219", "13.09.2000",3,"default","default");
        Reader reader3 = new Reader ("Мария","Летова", 6789,"Наука технологий", "0661234567","10.01.1999",7,"default","default");
        Reader reader4 = new Reader("Дмитрий","Строков", 8765,"Физическое воспитание","050586432","7.11.1998", 1,"default","default");
        Book book1 = new Book("Джеймс Оливер Кервуд","Бродяги Севера");
        Book book2 = new Book("Селенджер", "Девушка с татуировкой дракона");
        Book book3 = new Book("Крылов","Басни Крылова");
        Book book4 = new Book(" Стивен Кинг", "Зеленая миля");

        reader1.takeBook();
        System.out.println();
        reader2.takeBook();
        System.out.println();
        reader3.takeBook();
        System.out.println();
        reader4.takeBook();
        System.out.println();


       reader1.returnBook(4);
        System.out.println();
        reader2.returnBook(8);
        System.out.println();
        reader3.returnBook(1);
        System.out.println();
        reader4.returnBook(7);
        System.out.println();
    }

}
