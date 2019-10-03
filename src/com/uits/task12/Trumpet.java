package com.uits.task12;

public  class Trumpet implements Instrument {
    int size ;
    Trumpet( int size ) {
         this.size = size;
     }
    public void play() {
        System.out.println("Играет труба с размером "+ size);
    }
}
