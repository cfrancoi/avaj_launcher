import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vehicules.AircraftFactory;
import vehicules.Flyable;
import weather.WeatherTower;




public class Simulator {
    private static WeatherTower weatherTower = new WeatherTower();
    private static List<Flyable> flyables = new ArrayList<Flyable>();

    private static void parsScenario(Scanner reader)
    {
        int lineNumber = 1;
        int repetionTime = 0;

        if(reader.hasNextLine())
            repetionTime = Integer.parseInt(reader.nextLine());

        while (reader.hasNextLine())
        {
            lineNumber++;

            String line = reader.nextLine();
            String[] data = line.split(" ");
            if (data.length != 5)
                System.err.println(lineNumber + ": Bad format");
            else
            {
                System.out.println("New aircraft : " + data[0]);
                int longitude = Integer.parseInt(data[2]);
                int latitude = Integer.parseInt(data[3]);
                int height = Integer.parseInt(data[4]);

                System.out.println(data[2] + " " + data[3] + " " + data[4]);
                Flyable nextAircraft = AircraftFactory.newAircraft(data[0], data[1], longitude, latitude, height);

                if (nextAircraft != null)
                    (flyables).add(nextAircraft);

            }
        }

        for (Flyable flyable: flyables) {
            flyable.registerTower(weatherTower);
        }
    }

    private static void startSimulation()
    {

    }
    public static void main(String[] args)
    {
        new Simulator();
        try
        {
            if (args.length < 1)
                System.out.println("No entry !");
        
            File scenario = new File(args[0]);
            Scanner myReader = new Scanner(scenario);
            parsScenario(myReader);

           
        }
        catch (FileNotFoundException e)
        {
            System.err.println("An error occured.");
            e.printStackTrace();
        }
    }
}
