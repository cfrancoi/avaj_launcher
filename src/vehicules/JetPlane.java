package vehicules;

import java.util.logging.Logger;

import weather.Coordinates;
import weather.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
    
    private WeatherTower weatherTower = null;
    private static final String TYPE = "Jetplane";
    private Logger log = Logger.getGlobal();

    public JetPlane(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public void updateConditions() {}

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.log.info("[" + TYPE + "] " + this.name + " register to weather tower");
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
    }
}