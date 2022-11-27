package vehicules;
import weather.Coordinates;
import weather.WeatherTower;


public class Baloon extends Aircraft implements Flyable {
    
    private WeatherTower weatherTower = null;

    public Baloon(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public void updateConditions() {}
    public void registerTower() {}
}
