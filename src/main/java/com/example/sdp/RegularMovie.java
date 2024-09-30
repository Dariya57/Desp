package com.example.sdp;

public class RegularMovie implements Movie{
    private String title;

    public RegularMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return "Regular";
    }
}
