package vehicules;
import weather.Coordinates;

public class AircraftFactory {


    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
    {
        Coordinates coor = new Coordinates(longitude, latitude, height);

        if (type.equalsIgnoreCase("BALOON"))
            return new Baloon(name, coor);
        else if (type.equalsIgnoreCase("HELICOPTER"))
            return new Helicopter(name, coor);
        else if (type.equalsIgnoreCase("JETPLANE"))
            return new JetPlane(name, coor);

        return null;        
    }
}
