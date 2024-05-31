package misc.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest
{
    public static void main(String[] args)
    {
        Map<String,Double> gpaMap = new HashMap<>(); // K is String, V is Double
        gpaMap.put("Breanna", 3.6);
        gpaMap.put("Douglas", 1.87);
        gpaMap.put("Amir", 3.8);
        gpaMap.put("Tayo", 3.4);
        gpaMap.put("Daiyron", 3.7);
        gpaMap.put("Megan", 2.9);
        gpaMap.put("Coty", 1.6);

        dump(gpaMap);
        System.out.println();

        System.out.println("Breanna's gpa was: " + gpaMap.get("Breanna"));
        System.out.println();

        // print all gpa's that are 3.5 or greater
        Collection<Double> gpaValues = gpaMap.values();

        for(Double gpaValue : gpaValues)
        {
            if(gpaValue >= 3.5)
            {
                System.out.println(gpaValue);
            }
        }

        // print the names of those with a gpa >= 2.0
        for(var entry : gpaMap.entrySet())
        {
            if(entry.getValue() >= 2.0)
            {
                System.out.println(entry.getKey()+ " | " + entry.getValue());
            }
        }
    }

    private static void dump(Map<String,Double> map)
    {
        for(var entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}
