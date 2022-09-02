package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    //new tests
    @Test
    public void shouldSetDefaultStationNumbers() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getStationNumbers());
    }

    @Test
    public void shouldNotIncludeMaxDefaultStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);

        Assertions.assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldSetConstructor() {
        Radio radio = new Radio(15);
        radio.setCurrentStationNumber(15);
        Assertions.assertEquals(14, radio.getCurrentStationNumber());
    }

    //Radio-station work tests

    @Test
    public void shouldSetStation1() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetStationAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation8() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(11);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(4);
        radio.next();

        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSetNextStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(4);
        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSetPrevStationAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(actual, expected);
    }

    //Volume level tests

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetVolume9() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetVolume10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotDecreaseVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

