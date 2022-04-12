package HWWeek9;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Map
{
    private List<Road> Roads;

    public Map()
    {
        Roads = new ArrayList<Road>();
    }

    public void AddRoad(Road road)
    {
        Roads.add(road);
    }

    public static Map JsonMapLoad(String path) throws IOException
    {
        String value = new String(Files.readAllBytes(Paths.get(path)));
        Gson gson = new Gson();
        return gson.fromJson(value, Map.class);
    }

    public void JsonMapSave(String path) throws IOException
    {
        Gson gson = new Gson();
        String value = gson.toJson(this);
        Files.write(Paths.get(path), value.getBytes());
    }

    public void Print(IPrintDriver pd, Object o)
    {
        for(Road road : Roads)
        {
            road.Print(pd, o);
        }
    }
}