package vehicules;

import weather.Coordinates;
import weather.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
    
    private WeatherTower weatherTower = null;

    public JetPlane(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public void updateConditions() {}
    public void registerTower() {}
}