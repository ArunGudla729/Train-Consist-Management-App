import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =========================================================================
 * MAIN CLASS - UseCase5TrainConsistAgent
 * =========================================================================
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * Flow:
 * 1. User adds bogies.
 * 2. LinkedHashSet stores them.
 * 3. Formation is printed in original order.
 *
 * Author: Arun
 * Version: 2.0
 */
public class Train {
    public static void main(String[] args) {
        // Output Header
        System.out.println("----------------------------------------------");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("----------------------------------------------\n");

        // Requirement: Create a LinkedHashSet<String> to represent train formation
        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Requirement: Attach bogies such as: Engine, Sleeper, Cargo, Guard
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Requirement: Attempt to attach a duplicate bogie intentionally
        formation.add("Sleeper");

        // Requirement: Display final formation using System.out.println()
        System.out.println("Final Train Formation:");
        System.out.println(formation + "\n");

        // Requirement: Observe that duplicates do not appear in the output
        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.\n");

        System.out.println("UC5 formation setup completed...");
    }
}
