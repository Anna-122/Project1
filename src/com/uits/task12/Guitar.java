package com.uits.task12;

public  class Guitar implements Instrument {
    int numberOfstrings;
    Guitar( int numberOfstrings ) {
        this.numberOfstrings = numberOfstrings;
    }
    public void play() {
        System.out.println("Играет гитара "+numberOfstrings);
    }
}


