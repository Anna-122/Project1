package com.uits.task12;

public  abstract class Trumpet implements Instrument {
    int size ;

     Trumpet( int size ) {
         this.size = size;
     }

    public void play() {
        System.out.println("Играет труба "+ size);
    }
}
