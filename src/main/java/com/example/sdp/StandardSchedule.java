package com.example.sdp;

class StandardSchedule implements MovieSchedule {
    private Movie movie;
    private String time;

    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetails() {
        return "Movie: " + movie.getTitle() + ", Time: " + time;
    }
}