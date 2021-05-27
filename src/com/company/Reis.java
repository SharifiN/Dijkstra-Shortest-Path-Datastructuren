package com.company;

import java.util.ArrayList;

public class Reis {

    ArrayList stappen = new ArrayList();


    public Reis(String stappen) {
        this.stappen = stappen;
    }

    public String getStappen() {
        return stappen;
    }

    public void setStappen(String stappen) {
        this.stappen = stappen;
    }
}
