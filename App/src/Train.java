import java.util.Scanner;

public class Train {

    /**
     * Performs a Linear Search to find a Bogie ID in an array.
     * Key Concept: Sequential Traversal and Early Termination[cite: 1].
     */
    public static boolean findBogie(String[] bogieIds, String searchKey) {
        // Traverse the array sequentially [cite: 1]
        for (String id : bogieIds) {
            // Compare each element with the search key using equals() [cite: 1]
            if (id.equals(searchKey)) {
                // Early Termination: Stop searching once a match is found [cite: 1]
                return true;
            }
        }
        // Entire list traversed, no match found [cite: 1]
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Requirement: Create an array of bogie IDs [cite: 1]
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("--- Train Consist Management: Bogie Search ---");
        System.out.print("Enter Bogie ID to search: ");
        
        // Requirement: Accept a bogie ID to search [cite: 1]
        String searchKey = scanner.nextLine().trim();

        boolean found = findBogie(bogieIds, searchKey);

        // Result is displayed to the user [cite: 1]
        if (found) {
            System.out.println("Success: Bogie " + searchKey + " found in the consist.");
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found.");
        }

        scanner.close();
    }
}