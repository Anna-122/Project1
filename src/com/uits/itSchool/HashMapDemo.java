package com.uits.itSchool;

import java.util.*;


public class HashMapDemo {
    public static void main( String[] args ) {
        Map<String,Product>map= new TreeMap<>();
        //Map<String,Product>map= new HashMap<>();
        map.put("Doll",new Product("Doll",340,"Ukrainian"));
        map.put("Car",new Product("Car",34000,"Ukrainian"));
        map.put("Box",new Product("Box",34,"Ukrainian"));
        Set<String> keys= map.keySet();
        keys.forEach(System.out::println);

        Collection<Product>values =map.values();
        values. forEach(System.out::println);
    }
}
