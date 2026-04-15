import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase2TrainConsistAgent
 * Use Case 2: Add Passenger Bogies to Train
 * Description: Demonstrates how passenger bogies can be managed
 * dynamically using ArrayList operations.
 */
public class Train {
    public static void main(String[] args) {
        // Output Header
        System.out.println("==============================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==============================================\n");

        // 1. Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. CREATE: Add bogies (Sleeper, AC Chair, First Class)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 3. DELETE: Remove "AC Chair"
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing \"AC Chair\":");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 4. READ/CHECK: Check if "Sleeper" exists
        System.out.println("Checking if \"Sleeper\" exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper") + "\n");

        // 5. Final Train Consist Output
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}
