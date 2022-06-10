package ru.netology.statistic;


public class Radio {

    private int currentRadioStation;
    private int currentVolume;


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }

        this.currentRadioStation = currentRadioStation;

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void increaseRadiostation() {
        int newCurrentRadiostation = currentRadioStation + 1;
        setCurrentRadioStation(newCurrentRadiostation);
    }


    public void nextRadiostation() {
        int newCurrentRadiostation = currentRadioStation + 1;
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            setCurrentRadioStation(newCurrentRadiostation);
        }
    }


    public void prevRadiostation() {
        int newCurrentRadiostation = currentRadioStation - 1;
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            setCurrentRadioStation(newCurrentRadiostation);
        }
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }

        this.currentVolume = currentVolume;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        int newCurrentVolume = currentVolume + 1;
        setCurrentVolume(newCurrentVolume);
    }

    public void plusButton() {

        int newCurrentVolume = currentVolume + 1;
        if (currentVolume == 10) {
            return;
        } else {
            setCurrentVolume(newCurrentVolume);

        }
    }

    public void minusButton() {
        int newCurrentVolume = currentVolume - 1;
        if (currentVolume == 0) {
            return;
        } else {
            setCurrentVolume(newCurrentVolume);
        }
    }
}




