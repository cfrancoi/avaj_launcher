package weather;
import java.util.List;

import vehicules.Flyable;

public class Tower {
    private List<Flyable> observers = null; //check

    public void register(Flyable flyable)
    {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable)
    {
        observers.remove(flyable);
    }

    protected void conditionsChanged() {}
}
