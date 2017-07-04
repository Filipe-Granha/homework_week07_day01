package com.example.user.homework_week_07_day_01;

/**
 * Created by user on 03/07/2017.
 */


public class Ranking {




    private Movie[] listOfMovies; //array that can only hold Movie, called listOfMovies




    public Ranking() { // constructor
        this.listOfMovies = new Movie[10];// we need to specify how many
        this.setUpList();
    }


    public void setUpList() {
        // declare each movie, and assign it to a variable
        Movie movie1 = new Movie("Matrix", "Sci-fi", 1);
        Movie movie2 = new Movie("The Shawshank Redemption", "Drama", 2);
        Movie movie3 = new Movie("Apocalypse Now", "War", 3);
        Movie movie4 = new Movie("Forrest Gump", "Drama", 4);
        Movie movie5 = new Movie("Fight Club", "Action", 5);
        Movie movie6 = new Movie("Terminator 2", "Action", 6);
        Movie movie7 = new Movie("Back to the Future I", "Sci-fi", 7);
        Movie movie8 = new Movie("Back to the Future II", "Sci-fi", 8);
        Movie movie9 = new Movie("Inception", "Sci-fi", 9);
        Movie movie10 = new Movie("Commando", "Action", 10);

        // create an array of those variables
        Movie[] listOfMovies = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};

        for (Movie movie : listOfMovies) {
            this.getMovieByRanking();
        }
    }


    public int getMovieByRanking(){
        Movie.getRanking() - 1 = newMovie;
        return newMovie;
    }



    public int getLength() {
        return this.listOfMovies.size();
    }










}