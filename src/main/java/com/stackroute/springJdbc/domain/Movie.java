package com.stackroute.springJdbc.domain;




public class Movie {
    private int movieId;
    private String movieName;
    private int releasedYear;
    private float ratings;

    public Movie() {}

    public Movie(int movieId, String movieName, int releasedYear, float ratings) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releasedYear = releasedYear;
        this.ratings = ratings;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", releasedYear=" + releasedYear +
                ", ratings=" + ratings +
                '}';
    }
}
