package com.uits.task13;

public class Furniture extends Store implements Goods{
    String color;
    String disign;
    Furniture(  String col, String dis ) {
        color=col;
        disign=dis;
    }
    Furniture(){
        color="default";
        disign="default";
    }
    public void putToCart(){

        System.out.println("Товар "+title+" положим в корзину");
    }
}
