package com.uits.itSchool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main( String[] args ) {
        List<Integer> list = new ArrayList<>();
        list.add(300);
        list.add(400);
        list.add(30);
        list.add(10);
        list.add(3);

        //  list.remove(element-> element => 300);
        System.out.println(getHeaveBoxes(list));
        System.out.println(list);
    }

    public static List<Integer> getHeaveBoxes( List<Integer> list ) {
        List<Integer> result = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element >= 300) {
                iterator.remove();
                result.add(element);
            }
        }
        return result;
    }
}
