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

    public void addItemToStock(Sellable sellable) {stock.add(sellable);}

    public void removeItemFromStock(Sellable item){
        stock.remove(item);
    }

    public int totalProfit(){
        int margin = 0;
        for (Sellable item : stock){
            margin += item.calculateMarkup();
        }
        return margin;
    }

}
