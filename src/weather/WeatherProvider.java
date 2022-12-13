package weather;

public class WeatherProvider {
    
    private WeatherProvider() {};

    private static WeatherProvider weatherProvider = null;

    private static String[] weather = {
        EWeather.SUN.toString(),
        EWeather.RAIN.toString(),
        EWeather.FOG.toString(),
        EWeather.SNOW.toString(),
    };

    public static WeatherProvider getProvider(){
        if (weatherProvider == null)
            weatherProvider = new WeatherProvider();
        return weatherProvider;
    }
    
    public String getCurrentWeather(Coordinates coordinates) { return "todo"; }
}
