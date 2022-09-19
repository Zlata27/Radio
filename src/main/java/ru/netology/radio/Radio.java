package ru.netology.radio;

public class Radio {
    private int currentRadStation;

    public int getCurrentRadStation() {
        return currentRadStation;
    }

    public void setCurrentRadStation(int newCurrentRadStation) {
        if (newCurrentRadStation < 0) {
            return;
        }
        if (newCurrentRadStation > 9) {
            return;
        }
        currentRadStation = newCurrentRadStation;
    }

    public void increaseRadStation() {

        int target = currentRadStation + 1;
        {
            if (currentRadStation == 9) {
                currentRadStation = 0;
            }
        }
        setCurrentRadStation(target);
    }

    public void decreaseRadStation() {

        int target = currentRadStation - 1;
        {
            if (currentRadStation == 0) {
                currentRadStation = 9;
            }
        }
        setCurrentRadStation(target);
    }

    public void setToMaxRadStation() {
        currentRadStation = 9;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxCurrentVolume() {
        currentVolume = 10;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
    }
}
