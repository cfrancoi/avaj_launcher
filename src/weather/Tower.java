package weather;
import java.util.ArrayList;
import java.util.List;

import vehicules.Flyable;

public class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable)
    {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable)
    {
        observers.remove(flyable);
    }

    protected void conditionsChanged() {
        for (Flyable flyable: observers) {
            flyable.updateConditions();
        }
    }
}
