package com.company;

public class Treinrit extends Stap implements Comparable < Treinrit>{
    private int min;


    public Treinrit(String puntA, String puntB, int min) {
        super(puntA, puntB);
        this.min = min;
    }
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public int compareTo(Treinrit o) {
        if (this.min == o.getMin()){
            return 0 ; }
        else if (this.min < o.getMin()){
            return -1 ; }
        else if (this.min > o.getMin()){
            return 1 ; }
    }
}


