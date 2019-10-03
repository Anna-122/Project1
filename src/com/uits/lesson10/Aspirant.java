package com.uits.lesson10;

public class Aspirant extends Student {
    private   String sciencework;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String sciencework) {
        super(firstName, lastName, group, avgMark);
        this.sciencework = sciencework;
    }

    public Aspirant(String sciencework) {
        this.sciencework = sciencework;
    }
    public int getScholarship(){
        return  getAvgMark()==5? 200:180;
    }
}