package vehicules;
import weather.Coordinates;
import weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {
    
    private WeatherTower weatherTower = null;

    public Helicopter(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public void updateConditions() {}
    public void registerTower() {}
}