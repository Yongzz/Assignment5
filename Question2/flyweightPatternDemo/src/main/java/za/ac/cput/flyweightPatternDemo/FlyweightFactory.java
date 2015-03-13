package za.ac.cput.flyweightPatternDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/10.
 */
public class FlyweightFactory {
    private static FlyweightFactory ourInstance;
    private Map<String, Flyweight> flyweightPool = new HashMap<String,Flyweight>();
    private FlyweightFactory() {

    }

    public static FlyweightFactory getInstance() {
        if (ourInstance == null)
            return new FlyweightFactory();
        else
            return ourInstance;
    }

    public Flyweight getFlyweight(String key)
    {
        if (flyweightPool.containsValue(key))
            return flyweightPool.get(key);
        else
        {
            Flyweight flyweight;
            if ("Area".equals(key)) {
                flyweight = new AreaFlyweight();
            } else {
                flyweight = new DiameterFlyweight();
            }
            flyweightPool.put(key, flyweight);
            return flyweight;
        }
    }
}
