package vehicules;

import weather.Coordinates;

public class Aircraft extends Flyable {
    protected long id;
    protected String name;
    protected Coordinates coordinates;

    public static final int MAX_HEIGHT = 100;
    public static final int MIN_HEIGHT = 0;

    private long idCounter = 0;

    protected Aircraft(String name, Coordinates coordinates) {
        this.id = nextId();
        this.name = name;
        this.coordinates = coordinates;
    }

    private long nextId() {
        return (idCounter++);
    }

    protected void logRegisterToWeatherTower(String type) {
        System.out.println("[" + type + "] " + this.name + " register to weather tower");
    };

    protected void logConditionChanged(String type, String weather) {
        System.out.println("[" + type + "] " + this.name +
                " (" + weather.toLowerCase() + ") " +
                " [" + this.coordinates.getHeight() + "," + this.coordinates.getLatitude() + ","
                + this.coordinates.getLongitude() + "]");
    }

    @Override
    public void updateConditions() {
        // TODO chose a behavior
        return;
    }

}
