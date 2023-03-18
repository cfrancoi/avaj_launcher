package vehicules;

import weather.WeatherTower;

public interface Flyable {

    /**
     * Request WEATHER and update coordinate
     */
    public void updateConditions();

    /**
     * 
     * @param weatherTower
     * 
     * Send request for register to weatherTower
     */
    public void registerTower(WeatherTower weatherTower);

}
