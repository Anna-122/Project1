package com.uits.task13;

import java.util.Scanner;

public class Order implements  Goods {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print(" You can choose :");



        System.out.print(" putToCart: ");
        String putToCart = in.nextLine();



        System.out.print("Enter the name of the item : ");
        String item = in.nextLine();


        System.out.print("Enter the quantity : ");
        String quantity= in.nextLine();


        in.close();

    }

    @Override
    public void putToCart() {

    }
}