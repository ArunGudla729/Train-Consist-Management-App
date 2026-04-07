import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 *
 * Concepts Covered:
 * - Java Class & Main Method (Entry Point)
 * - List Interface & ArrayList (Dynamic Collections)
 * - Console Output (System.out.println)
 */
public class Train {

    public static void main(String[] args) {

        // 1. Application Welcome Message
        System.out.println("==========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==========================================");

        // 2. Initialize an empty List using ArrayList (Dynamic Initialization)
        // We use String to represent Bogie IDs or types for this initial stage
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initialization success and summary
        System.out.println("\nTrain initialized successfully...");

        // 4. Display the initial bogie count using size()
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // 5. Display the current train consist (empty state)
        System.out.println("Current Train Consist : " + trainConsist);

        // 6. Final readiness message
        System.out.println("\nSystem ready for operations...");
    }
}

