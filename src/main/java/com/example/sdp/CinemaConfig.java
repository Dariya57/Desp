package com.example.sdp;

public class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;
    // Other settings...

    private CinemaConfig() {}

    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public void setCinemaName(String name) {
        this.cinemaName = name;
    }

    public String getCinemaName() {
        return this.cinemaName;
    }
}
