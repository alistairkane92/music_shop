package com.example.user.musicstorehomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 29/10/2017.
 */

public class TestTrumpet {
    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet(6, "Yamaha", 500, 1000);
    }

    @Test
    public void testSound() throws Exception {
        assertEquals("The sound I make is toot", trumpet.play());
    }

    @Test
    public void testCalculateMarkup() throws Exception {
        assertEquals(500, trumpet.calculateMarkup());
    }
}
