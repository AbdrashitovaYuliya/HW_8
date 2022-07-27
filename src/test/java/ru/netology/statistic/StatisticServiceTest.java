package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {


    @Test
    public void HaveAmountRadiostation() {
       Radio radio = new Radio(5);
       Assertions.assertEquals(5, radio.getAmountRadiostation());

    }

    @Test
    public void HaveNotAmountRadiostation() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getAmountRadiostation());

    }


    @Test
    public void shouldMinRadiostation() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinRadiostation());
    }


    @Test
    public void maxRadiostation() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(10);
        Assertions.assertEquals(10, radio.getMaxRadiostation());
    }


    @Test
    void switchNumberRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        int actual = radio.getCurrentRadioStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void switchNumberRadioStationDegrees0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void moreThanMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    void switchNumberRadioStation8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void IncreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.increaseRadiostation();

        int actual = radio.getCurrentRadioStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    void numberRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        radio.nextRadiostation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void numberRadioStationDegreesMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.nextRadiostation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    void numberRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prevRadiostation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void numberRadioStation8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.prevRadiostation();

        int actual = radio.getCurrentRadioStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void NullNumberRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevRadiostation();

        int actual = radio.getCurrentRadioStation();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    void switchSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void lessThanMinSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void moreThanMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void increaseSoundVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.plusButton();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void minVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.minusButton();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void Volume8() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.minusButton();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void Volume9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.minusButton();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void Volume7() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.plusButton();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

}
