package vehicules;
import weather.Coordinates;

public class Aircraft {
    protected   long        id;
    protected   String      name;
    protected   Coordinates coordinates;

    private     long        idCounter = 0;
    
    protected Aircraft(String name, Coordinates coordinates)
    {
        this.id = nextId();
        this.name = name;
        this.coordinates = coordinates;
    }

    private long nextId() { return (idCounter++); }
}
