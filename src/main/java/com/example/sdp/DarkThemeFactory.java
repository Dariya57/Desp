package com.example.sdp;

class DarkThemeFactory extends UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }
}