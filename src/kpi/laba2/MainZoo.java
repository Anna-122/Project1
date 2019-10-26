package kpi.laba2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MainZoo {
    public static void main( String[] args ) {
        ArrayList<Zoo> ar = new ArrayList<Zoo>();

        ar.add(new Zoo("Васька", "собака", "23"));
        ar.add(new Zoo("Маркиз", "дикий кот", "5"));
        ar.add(new Zoo("Тошка", "белка", "7"));


        System.out.println(" Какую сортировку Вы хотите осуществить");
        System.out.println(" Сортировка по имени введите 1");
        System.out.println(" Сортировка по виду  введите 2");
        System.out.println(" Сортировка по номеру клетки введите 3");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру с соответсвии с поиском,который Вы хотите осуществить");
        int number = sc.nextInt();

        System.out.println("Спасибо! Вы ввели число " + number);

        switch (number) {
            case 1:
                Collections.sort(ar, new SortByName());
                for (Zoo a : ar)
                    System.out.println("Имя животного:"+ a.getName() + " " +" Порода:"+ a.getAnimalBreed() + " " +"Номер клетки:"+ a.cellNumber);
                break;
            case 2:
                Collections.sort(ar, new SortByAnimalBreed());
                for (Zoo a : ar)
                    System.out.println("Имя животного:"+ a.getName() + " " +" Порода:"+ a.getAnimalBreed() + " " +"Номер клетки: "+ a.cellNumber);
                break;
            case 3:
                Collections.sort(ar, new SortByCellNumber());
                for (Zoo a : ar)
                    System.out.println("Имя животного:"+ a.getName() + " " +" Порода:"+ a.getAnimalBreed() + " " +"Номер клетки:"+ a.cellNumber);
            default:
                System.out.print("Вы ввели не правильное значениею. Повторите попытку!");

                break;


        }
    }
}
