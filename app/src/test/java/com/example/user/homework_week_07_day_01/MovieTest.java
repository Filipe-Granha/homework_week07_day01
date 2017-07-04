package com.example.user.homework_week_07_day_01;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class MovieTest {



    public Movie movie;



    @Before
    public void before() {
        movie = new Movie("The Matrix", "Sci-fi", 1);
    }




    @Test
    public void hasGenre() {
        assertEquals("Sci-fi", movie.getGenre());
    }


    @Test
    public void hasName() {
        assertEquals("The Matrix", movie.getName());
    }


    @Test
    public void hasRanking() {
        assertEquals(1, movie.getRanking());
    }




    @Test
    public void hasToString() {
        assertEquals("Title: 'The Matrix', Genre: 'Sci-fi', Ranking: '1'", movie.toString());
    }





}
