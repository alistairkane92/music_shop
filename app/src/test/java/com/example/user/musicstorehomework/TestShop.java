package com.example.user.musicstorehomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 29/10/2017.
 */

public class TestShop {
    Shop shop;
    Guitar guitar;
    Trumpet trumpet;
    Plectrum plectrum;
    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        guitar = new Guitar("Fender", 500, 250, 6);
        trumpet = new Trumpet(5, "Yamaha", 250, 500);
        plectrum = new Plectrum(1, 5);
        sheetMusic = new SheetMusic(5, 20);
    }

    @Test
    public void testAddGuitarToStock() throws Exception {
        shop.addGuitarToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void testAddTrumpetToStock() throws Exception {
        shop.addTrumpetToStock(trumpet);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void testAddSheetMusicToStock() throws Exception {
        shop.addSheetMusicToStock(sheetMusic);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void testAddPlectrumToStock() throws Exception {
        shop.addPlectrumToStock(plectrum);
        assertEquals(1, shop.getStock().size());

    }
}


