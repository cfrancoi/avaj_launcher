package weather;


public class Coordinates {
    private int longitude = 0;
    private int latitude = 0;
    private int height = 0;

    public int getLongitude() {
        return this.longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static Coordinates add(Coordinates left, Coordinates right)
    {
        int longitude = left.getLongitude() + right.getLongitude();
        int latitude = left.getLatitude() + right.getLatitude();
        int height = left.getHeight() + right.getHeight();

        return  new Coordinates(longitude, latitude, height);
    }


    public Coordinates(int longitude, int latitude, int height)
    {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

}
