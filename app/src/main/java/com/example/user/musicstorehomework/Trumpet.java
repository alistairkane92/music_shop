package com.example.user.musicstorehomework;

/**
 * Created by user on 29/10/2017.
 */

public class Trumpet extends Instrument {
    private int numberOfValves;

    public Trumpet(int numberOfValves, String brand, int priceBought, int priceSold){
        this.numberOfValves = numberOfValves;
        this.brand = brand;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String play() {
        return super.play() + "toot";
    }


}
