package com.company;

public class Vlucht extends Stap implements Comparable < Vlucht>{
    private int geld;
    private double kans;

    public Vlucht(String puntA, String puntB, int geld, double kans) {
        super(puntA, puntB);
        this.geld = geld;
        this.kans = kans;
    }

    public int getGeld() {
        return geld;
    }

    public void setGeld(int geld) {
        this.geld = geld;
    }

    public double getKans() {
        return kans;
    }

    public void setKans(double kans) {
        this.kans = kans;
    }

    @Override
    public int compareTo(Vlucht o) {
       if (this.geld == o.getGeld()
         & this.kans == o.getKans()){
           return 0 ;
       }

       else if (this.geld < o.getGeld()
               & this.kans < o.getKans()){
           return -1 ;
       }
       else if (this.geld > o.getGeld()
               & this.kans > o.getKans()){
           return 1 ;
       }

    }
}
