package com.company;

public class  Rit extends Stap implements Comparable < Rit> {
    private double km;

    public Rit(String puntA, String puntB, double km) {
        super(puntA, puntB);
        this.km = km;
    }


    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public int compareTo(Rit o) {
        if (this.km == o.getKm()) {
            return 0;
        } else if (this.km < o.getKm()) {
            return -1;
        }
        return 1;
    }



}
