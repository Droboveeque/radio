public class Radio {
    private int currentStation;
    private int lastStation;
    private int firstStation = 0;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int maxStation) {
        this.lastStation = maxStation - 1;
    }

    public Radio() {
        this.lastStation = 9;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {
        if (currentStation == lastStation) {
            currentStation = firstStation;
        } else {
            ++currentStation;
        }
    }

    public void prev() {
        if (currentStation == firstStation) {
            currentStation = lastStation;
        } else {
            --currentStation;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > lastStation) {
            return;
        }
        if (newCurrentStation < firstStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            ++currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            --currentVolume;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}
