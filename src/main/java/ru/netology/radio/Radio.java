package ru.netology.radio;

public class Radio {
    private int currentRadStation;
    private int stationAmount;

    private int maxVolume;
    private int minVolume;
    private int currentVolume;


    public Radio() {
        stationAmount = 10;
        maxVolume = 100;
        minVolume = 0;
    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentRadStation() {
        return currentRadStation;
    }

    public void setCurrentRadStation(int newCurrentRadStation) {
        if (newCurrentRadStation < 0) {
            return;
        }
        if (newCurrentRadStation > stationAmount - 1) {
            return;
        }
        currentRadStation = newCurrentRadStation;
    }

    public void increaseRadStation() {

        int target = currentRadStation + 1;
        {
            if (currentRadStation == stationAmount - 1) {
                currentRadStation = 0;
            }
        }
        setCurrentRadStation(target);
    }

    public void decreaseRadStation() {

        int target = currentRadStation - 1;
        {
            if (currentRadStation == 0) {
                currentRadStation = stationAmount - 1;
            }
        }
        setCurrentRadStation(target);
    }

    public void setToMaxRadStation() {
        currentRadStation = 9;
    }



    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxCurrentVolume() {
        currentVolume = maxVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        }
    }
}
