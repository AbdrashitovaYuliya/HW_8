package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {

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
    void switchNumberRadioStation10() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

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
        radio.setCurrentRadioStation(9);

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
        int expected = 9;

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
    void switchSoundVolumeDegrees0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    void switchSoundVolume11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

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
        radio.setCurrentVolume(10);

        radio.plusButton();

        int actual = radio.getCurrentVolume();
        int expected = 10;

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
