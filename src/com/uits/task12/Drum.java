package com.uits.task12;

public class Drum implements Instrument {
    int diameter;
    Drum( int diameter ) {
       this.diameter= diameter;
    }
    public void play() {
        System.out.println("Играет барабан с диаметром "+ diameter);
    }
}
