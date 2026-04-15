import java.util.LinkedList;

/**
 * =========================================================================
 * MAIN CLASS - UseCase4TrainConsistAgent
 * =========================================================================
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using a LinkedList for efficient ordered operations.
 *
 * Author: Developer
 * Version: 4.0
 */
public class Train {
    public static void main(String[] args) {
        // Output Header
        System.out.println("----------------------------------------------");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("----------------------------------------------\n");

        // Requirement: Create a LinkedList<String> for the consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Requirement: Add bogies: Engine, Sleeper, AC, Cargo, Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // Requirement: Insert a Pantry Car at position 2
        // Uses the add(index, element) method
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // Requirement: Remove the first and last bogie
        // Uses removeFirst() and removeLast() for efficient head/tail deletion
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist + "\n");

        // Requirement: Final confirmation message
        System.out.println("UC4 ordered consist operations completed...");
    }
}
