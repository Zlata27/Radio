package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadStation() {
        Radio radio = new Radio();

        radio.setCurrentRadStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadStation(15);

        int expected = 0;
        int actual = radio.getCurrentRadStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadStationAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentRadStation(-5);

        int expected = 0;
        int actual = radio.getCurrentRadStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadStation() {
        Radio radio = new Radio();

        radio.setToMaxRadStation();

        int expected = 9;
        int actual = radio.getCurrentRadStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadStation() {
        Radio radio = new Radio();
        radio.setCurrentRadStation(9);

        radio.increaseRadStation();

        int expected = 0;
        int actual = radio.getCurrentRadStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadStation() {
        Radio radio = new Radio();
        radio.setCurrentRadStation(0);

        radio.decreaseRadStation();

        int expected = 9;
        int actual = radio.getCurrentRadStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(20);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxCurrentVolume() {
        Radio radio = new Radio();

        radio.setToMaxCurrentVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        radio.increaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        radio.decreaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
