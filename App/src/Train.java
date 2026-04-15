import java.util.HashSet;
import java.util.Set;

/**
 * =========================================================================
 * MAIN CLASS - UseCase3TrainConsistAgent
 * =========================================================================
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate Bogie IDs are not added into
 * the train formation using HashSet.
 *
 * Flow:
 * 1. User adds bogie IDs.
 * 2. System inserts into HashSet.
 * 3. Duplicates are ignored automatically.
 * 4. Unique IDs are displayed.
 *
 * Author: Developer
 * Version: 2.0
 */
public class Train {
    public static void main(String[] args) {
        // Output Header per Screenshot 1 & 3
        System.out.println("----------------------------------------------");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("----------------------------------------------\n");

        // Requirement: Create a HashSet<String> for bogie IDs
        Set<String> bogies = new HashSet<>();

        // Requirement: Add IDs including intentional duplicates
        bogies.add("B8101");
        bogies.add("B8102");
        bogies.add("B8103");
        bogies.add("B8104");

        // Duplicate entries will be ignored internally by HashSet
        bogies.add("B8101"); // Duplicate entry
        bogies.add("B8102"); // Duplicate entry

        // Requirement: Print the final set after insertion
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies + "\n");

        // Requirement: Observe that duplicates are removed automatically
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}
