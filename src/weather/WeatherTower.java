package weather;

public class WeatherTower extends Tower {

    public String getWeather(Coordinates coordinates)
    {
        return "weater"; //todo
    }

    /**
     * For each observer and call update
     */
    public void changeWeather()
    {
        this.conditionsChanged();
    }

}
