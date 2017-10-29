package com.example.user.musicstorehomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 29/10/2017.
 */

public class TestSheetMusic {
     SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic(5, 10);
    }

    @Test
    public void testCalculateMarkup() throws Exception {
        assertEquals(5, sheetMusic.calculateMarkup());
    }
}
