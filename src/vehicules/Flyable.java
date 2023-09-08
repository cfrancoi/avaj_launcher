package vehicules;

import weather.WeatherTower;

public abstract class Flyable {
    protected WeatherTower weatherTower = null;

    /**
     * Request WEATHER and update coordinate
     */
    public abstract void updateConditions();

    /**
     * 
     * Send request for register to weatherTower
     * 
     * @param weatherTower
     * 
     */
    public void registerTower(WeatherTower weatherTower) {
        // this.logRegisterToWeatherTower(TYPE);
        setWeatherTower(weatherTower);
        this.weatherTower.register(this);
    }

    public WeatherTower getWeatherTower() {
        return weatherTower;
    }

    public void setWeatherTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }
}
