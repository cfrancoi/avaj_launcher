package weather;

public class WeatherProvider {
    
    private WeatherProvider() {};

    private static WeatherProvider weatherProvider = null;

    private static String[] weather = {
        Weather.SUN.toString(),
        Weather.RAIN.toString(),
        Weather.FOG.toString(),
        Weather.SNOW.toString(),
    };

    public WeatherProvider getProvider(){
        if (weatherProvider == null)
            weatherProvider = new WeatherProvider();
        return weatherProvider;
    }
    
    public String getCurrentWeather(Coordinates coordinates) { return "todo"; }
}
