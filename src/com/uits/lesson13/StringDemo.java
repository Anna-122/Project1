package com.uits.lesson13;

public class StringDemo {
    public static void main(String[] args) {
        effortString("I like Java");
        effortString("I like you");
        System.out.println(getLastChar("abc"));

    }
    public static void effortString(String str) {
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I"));
        System.out.println(str.contains("Java"));
    }
    public static char getLastChar(String str){
        char result=str.charAt(str.length()-1);
        return result;
    }
}
