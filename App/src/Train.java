import java.util.HashMap;
import java.util.Map;

/**
 * *****************************************************************************
 * MAIN CLASS - UseCase6TrainConsistMapApp
 * *****************************************************************************
 * Use Case 6: Map Bogie to Capacity (HashMap)
 * * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 * * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 * * This caps lookup-based access using HashMap.
 * * Author: Developer
 * Version: 6.0
 * *****************************************************************************
 */
public class Train {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");
        System.out.println(" UC6 : Map Bogie to Capacity (HashMap) ");
        System.out.println("--------------------------------------------------\n");

        // HashMap stores data in key - value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // Insert bogie capacities
        // Using put() method to map bogie names (keys) to capacities (values)
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Rectangular Goods", 100);
        capacityMap.put("Cylindrical Goods", 80);

        System.out.println("Bogie Capacity Details:");
        System.out.println("-----------------------");

        // Iterate over the map using entrySet()
        // Provides a view of the entire map as a set of entries
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram continues...");
    }
}