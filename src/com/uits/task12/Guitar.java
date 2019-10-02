package com.uits.task12;

public  abstract class Guitar implements Instrument {
    int numberOfstrings;

    Guitar( int num ) {
        numberOfstrings = num;
    }

    public void play() {
        System.out.println("Играет гитара "+numberOfstrings);
    }
}


