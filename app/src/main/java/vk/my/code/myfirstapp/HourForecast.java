package vk.my.code.myfirstapp;

public class HourForecast {
    private double temperature;
    private int airPollution;
    private int uvIndex;
    private int windSpeed;
    private int humidity;
    private int rainfallInMM;
    private int visibilityInKM;

    public HourForecast(double temperature, int airPollution, int uvIndex, int windSpeed, int humidity, int rainfallInMM, int visibilityInKM) {
        this.temperature = temperature;
        this.airPollution = airPollution;
        this.uvIndex = uvIndex;
        this.windSpeed = windSpeed;
        this.humidity = humidity;
        this.rainfallInMM = rainfallInMM;
        this.visibilityInKM = visibilityInKM;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getAirPollution() {
        return airPollution;
    }

    public void setAirPollution(int airPollution) {
        this.airPollution = airPollution;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getRainfallInMM() {
        return rainfallInMM;
    }

    public void setRainfallInMM(int rainfallInMM) {
        this.rainfallInMM = rainfallInMM;
    }

    public int getVisibilityInKM() {
        return visibilityInKM;
    }

    public void setVisibilityInKM(int visibilityInKM) {
        this.visibilityInKM = visibilityInKM;
    }
}

