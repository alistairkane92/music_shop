package com.example.user.musicstorehomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 29/10/2017.
 */

public class TestGuitar {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Fender", 250, 500, 6);
    }

    @Test
    public void testGuitarSound() throws Exception {
        assertEquals("The sound I make is twang", guitar.play());
    }

    @Test
    public void testCalculateMarkup() throws Exception {
        assertEquals(250, guitar.calculateMarkup());
    }
}
