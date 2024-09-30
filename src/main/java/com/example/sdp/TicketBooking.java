package com.example.sdp;
class TicketBooking {
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    public TicketBooking(String movieTitle, String seatNumber, String snackCombo) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.snackCombo = snackCombo;
    }

    public String getDetails() {
        return "Movie: " + movieTitle + ", Seat: " + seatNumber + ", Snack: " + snackCombo;
    }
}
