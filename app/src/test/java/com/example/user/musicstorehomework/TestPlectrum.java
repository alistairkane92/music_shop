package com.example.user.musicstorehomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 29/10/2017.
 */

public class TestPlectrum {
    Plectrum plectrum;

    @Before
    public void setUp() throws Exception {
        plectrum = new Plectrum(1, 5);
    }

    @Test
    public void calculateMarkup() throws Exception {
        assertEquals(4, plectrum.calculateMarkup());
    }

}
