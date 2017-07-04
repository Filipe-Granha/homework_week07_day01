package com.example.user.homework_week_07_day_01;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */


public class RankingTest {

    Ranking listOfMovies;

    @Before
    public void before(){
        listOfMovies = new Ranking();
    }


    @Test
    public void hasSetUpList(){
        listOfMovies.setUpList();
        assertEquals(10, listOfMovies.numberOfMovies());
    }


    @Test
    public void canGetMovieByRanking() {
        assertEquals(4, getMovieByRanking(5))
    }




}