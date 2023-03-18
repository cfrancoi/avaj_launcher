package weather;

public class WeatherTower extends Tower {

    public String getWeather(Coordinates coordinates)
    {
        double rand;

        rand =Math.random() * 3;

        String[] weathers = EWeather.getNames(EWeather.class);

        return weathers[(int)rand];
    }

    /**
     * For each observer and call update
     */
    public void changeWeather()
    {
        this.conditionsChanged();
    }

}
