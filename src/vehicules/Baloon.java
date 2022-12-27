package vehicules;
import weather.Coordinates;
import weather.EWeather;
import weather.WeatherTower;
import java.util.logging.Logger;


public class Baloon extends Aircraft implements Flyable {
    
    private WeatherTower weatherTower = null;
    private static final String TYPE = "Baloon";
    private Logger log = Logger.getGlobal();
    private static final Coordinates sunMove = new Coordinates(2, 0, 4);
    private static final Coordinates rainMove = new Coordinates(0, 0, 5);
    private static final Coordinates fogMove = new Coordinates(0, 0, 3);
    private static final Coordinates snowMove = new Coordinates(0, 0, 15);
    private static final int maxHeight = 100;
    private static final int minHeight = 0;

    public Baloon(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }


    @Override
    public void updateConditions() {
        if (this.weatherTower != null)
        {
            String weather = weatherTower.getWeather(this.coordinates);
            
            if (weather.equals(EWeather.SUN.toString())) {
                this.coordinates = Coordinates.add(this.coordinates, sunMove);
            }
            else
            if (weather.equals(EWeather.FOG.toString())) {
                this.coordinates = Coordinates.add(this.coordinates, fogMove);
            }
            else
            if (weather.equals(EWeather.RAIN.toString())) {
                this.coordinates = Coordinates.add(this.coordinates, rainMove);
            }
            else
            if (weather.equals(EWeather.SNOW.toString())) {
                this.coordinates = Coordinates.add(this.coordinates, snowMove);
            }
            else{
                //TODO error
            }
           
            if (this.coordinates.getHeight() <= minHeight)
            {
                this.weatherTower.unregister(this);
                this.weatherTower = null;
                //TODO print error
            }
            else if (this.coordinates.getHeight() > maxHeight)
            {
                this.coordinates.setHeight(maxHeight);
            }
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        log.info("[" + TYPE + "] " + this.name + " register to weather tower");
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
    }
}
