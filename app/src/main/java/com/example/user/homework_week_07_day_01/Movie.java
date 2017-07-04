package com.example.user.homework_week_07_day_01;

/**
 * Created by user on 03/07/2017.
 */

public class Movie {


    private String name;
    private String genre;
    private int ranking;


    public Movie (String name, String genre, int ranking) {
        this.name = name;
        this.genre = genre;
        this.ranking = ranking;
    }




    public String getName(){
        return this.name;
    }


    public int getRanking(){
        return this.ranking;
    }


    public String getGenre(){
        return this.genre;
    }





    public void setGenre(String genre) {
        this.genre = genre;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setRanking(int ranking) {
        this.ranking = ranking;
    }





    public String toString() {
        return "Title: '" + this.name + "', Genre: '" + this.genre + "', Ranking: '" + this.ranking + "'";
    }



}
