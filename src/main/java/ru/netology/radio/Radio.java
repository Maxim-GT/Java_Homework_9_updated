package ru.netology.radio;

public class Radio {
    //work with radio-stations
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int currentStationNumber = minStationNumber;
    private int stationNumbers;

    public Radio() {
        this.stationNumbers = 10;
    }

    public int getStationNumbers () {
        return stationNumbers;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) { //1, 4
        if (newCurrentStationNumber == stationNumbers) {
            newCurrentStationNumber = stationNumbers - 1;
            currentStationNumber = newCurrentStationNumber;
        }
        if (newCurrentStationNumber > maxStationNumber) {
            return;
        }
        if (newCurrentStationNumber < minStationNumber) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void next() { //2
        if (currentStationNumber >= maxStationNumber) {
            currentStationNumber = minStationNumber;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }
    }

    public void prev() { //3
        if (currentStationNumber <= minStationNumber) {
            currentStationNumber = maxStationNumber;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
    }


    //work with volume

    private int maxVolume = 100;
    private int minVolume = 0;
    public int currentVolume = minVolume;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { //1
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() { //2
        if (currentVolume >= maxVolume)
            return;
        else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() { //3
        if (currentVolume == minVolume) {
            return;
        }
        else {
            currentVolume = currentVolume - 1;
        }
    }
}

