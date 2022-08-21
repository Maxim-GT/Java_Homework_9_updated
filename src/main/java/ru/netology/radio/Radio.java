package ru.netology.radio;

public class Radio {
    //work with radio-stations
    public int currentStationNumber;

    public int getCurrentStationNumber() {

        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) { //1, 4
        if (newCurrentStationNumber > 9) {
            return;
        }
        if (newCurrentStationNumber < 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void next() { //2
        if (currentStationNumber >= 9) {
            currentStationNumber = 0;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }
    }

    public void prev() { //3
        if (currentStationNumber <= 0) {
            currentStationNumber = 9;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
    }


    //work with volume
    public int currentVolume;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { //1
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() { //2
        if (currentVolume >= 10)
            return;
        else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() { //3
        if (currentVolume == 0) {
            return;
        }
        else {
            currentVolume = currentVolume - 1;
        }
    }
}

