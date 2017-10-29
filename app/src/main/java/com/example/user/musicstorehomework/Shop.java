package com.example.user.musicstorehomework;

import java.util.ArrayList;

import static android.R.attr.name;

/**
 * Created by user on 29/10/2017.
 */

public class Shop {

    ArrayList<Sellable> stock;

    public Shop() {
        stock = new ArrayList<>();
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void generateStock(){
        //loops through sellable items and adds them to stock

    }

    public void addGuitarToStock(Guitar guitar) {
        stock.add(guitar);
    }

    public void addTrumpetToStock(Trumpet trumpet) {
        stock.add(trumpet);
    }

    public void addSheetMusicToStock(SheetMusic sheetMusic){
        stock.add(sheetMusic);
    }

    public void addPlectrumToStock(Plectrum plectrum) {
        stock.add(plectrum);
    }

    public Sellable remove(){
        return stock.remove(0);
    }
//
//    public int totalProfit(){
//        //loops through all items in stock
//        //calls calculate markup on each and adds them to a variable tally
//        //returns tally
//    }

}
