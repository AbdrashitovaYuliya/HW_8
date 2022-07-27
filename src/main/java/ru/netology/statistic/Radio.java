package ru.netology.statistic;

public class Radio {

    private static final int DEFAULT_AMOUNT_RADIOSTATION = 10;


    private int currentVolume;
    private int maxRadiostation = 10;
    private int minRadiostation;
    private int amountRadiostation;
    private int currentRadiostation = minRadiostation;


    public Radio(int amountRadiostation) {
        this.amountRadiostation = amountRadiostation;
    }

    public int getAmountRadiostation() {
        return amountRadiostation;
    }

    public Radio() {
        this.amountRadiostation = DEFAULT_AMOUNT_RADIOSTATION;
    }


    public void setCurrentRadioStation(int currentRadiostation) {
        if (currentRadiostation < minRadiostation) {
            return;
        }
        if (currentRadiostation > maxRadiostation) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public int getCurrentRadioStation() {
        return currentRadiostation;
    }

    public int getMaxRadiostation() {
        return maxRadiostation;
    }

    public int getMinRadiostation() {
        return minRadiostation;
    }


    public void increaseRadiostation() {
        int newCurrentRadiostation = currentRadiostation + 1;
        setCurrentRadioStation(newCurrentRadiostation);
    }


    public void nextRadiostation() {
        int newCurrentRadiostation = currentRadiostation + 1;
        if (currentRadiostation == maxRadiostation) {
            currentRadiostation = minRadiostation;
        } else {
            setCurrentRadioStation(newCurrentRadiostation);
        }
    }


    public void prevRadiostation() {
        int newCurrentRadiostation = currentRadiostation - 1;
        if (currentRadiostation == minRadiostation) {
            currentRadiostation = maxRadiostation;
        } else {
            setCurrentRadioStation(newCurrentRadiostation);
        }
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
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
        if (currentVolume == 100) {
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

    public void setMinRadiostation(int minRadiostation) {
        this.minRadiostation = minRadiostation;
    }

    public void setMaxRadiostation(int maxRadiostation) {
        this.maxRadiostation = maxRadiostation;
    }


}




