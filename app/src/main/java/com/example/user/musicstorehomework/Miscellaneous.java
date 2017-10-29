package com.example.user.musicstorehomework;

/**
 * Created by user on 29/10/2017.
 */

public class Miscellaneous implements Sellable {
    int priceBought;
    int priceSold;

    public int calculateMarkup(){
        return priceSold - priceBought;
    }
}
