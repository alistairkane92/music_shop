package com.example.user.musicstorehomework;

/**
 * Created by user on 29/10/2017.
 */

public class Guitar extends Instrument{
    private int numberOfStrings;


    public Guitar(String brand, int priceBought, int priceSold, int numberOfStrings){
        this.brand = brand;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
        this.numberOfStrings = numberOfStrings;
    }

    public String play(){
        return super.play() + "dung";
    }


}
