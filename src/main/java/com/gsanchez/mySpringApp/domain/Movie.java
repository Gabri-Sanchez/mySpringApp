package com.gsanchez.mySpringApp.domain;

import java.util.List;

public class Movie {

    private boolean adult;
    private String backdrop_path;
    private List<Integer> genre_ids;
    private int id;
    private String original_language;
    private String original_title;
    private String overview;
    private double popularity;
    private String poster_path;
    private String release_date;
    private String title;
    private boolean video;
    private double vote_average;
    private int vote_count;

    public Movie(){

    }

    public Movie(boolean adult, String backdrop_path, List<Integer> genre_ids, int id, String original_language, 
                 String original_title, String overview, double popularity, String poster_path, 
                 String release_date, String title, boolean video, double vote_average, int vote_count) {
        this.adult = adult;
        this.backdrop_path = backdrop_path;
        this.genre_ids = genre_ids;
        this.id = id;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.title = title;
        this.video = video;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
    }

    // Getters
    public boolean isAdult() {
        return adult;
    }

    public String getbackdrop_path() {
        return backdrop_path;
    }

    public List<Integer> getgenre_ids() {
        return genre_ids;
    }

    public int getId() {
        return id;
    }

    public String getoriginal_language() {
        return original_language;
    }

    public String getoriginal_title() {
        return original_title;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getposter_path() {
        return poster_path;
    }

    public String getrelease_date() {
        return release_date;
    }

    public String getTitle() {
        return title;
    }

    public boolean isVideo() {
        return video;
    }

    public double getvote_average() {
        return vote_average;
    }

    public int getvote_count() {
        return vote_count;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setbackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public void setgenre_ids(List<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setoriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public void setoriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public void setposter_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public void setrelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public void setvote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public void setvote_count(int vote_count) {
        this.vote_count = vote_count;
    }

}
