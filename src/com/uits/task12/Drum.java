package com.uits.task12;

public abstract class Drum implements Instrument {
    int diameter;
    Drum( int diam ) {
       diameter= diam;
    }
    public void play() {
        System.out.println("Играет барабан "+ diameter);
    }
}
