package com.example.user.musicstorehomework;

/**
 * Created by user on 29/10/2017.
 */

public class Instrument implements Sellable, Playable {
    int priceBought;
    int priceSold;
    String brand;

    public String play(){
        return "The sound I make is ";
    }

    public int calculateMarkup(){
        return priceSold - priceBought;
    }


}
