package vehicules;
import weather.Coordinates;
import weather.EWeather;
import weather.WeatherTower;
import java.util.logging.Logger;


public class Baloon extends Aircraft implements Flyable {
    
    private WeatherTower weatherTower = null;
    private static final String TYPE = "Baloon";
    private Logger log = Logger.getGlobal();

    public Baloon(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    /**
     * Request WEATHER and apdate coordinate
     */
    public void updateConditions() {
        if (weatherTower != null)
        {
            String weather = weatherTower.getWeather(this.coordinates);
            
            log.info("Weater " + weather);
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        log.info("[" + TYPE + "] " + this.name + " register to weather tower");
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
    }
}
