import java.util.Arrays;

/**
 * Use Case 17: Sorting Bogie Names using the optimized Arrays.sort() method.
 * This replaces manual sorting logic with Java's built-in utility.
 */
public class Train {

    public static void main(String[] args) {
        // 1. Define the array of bogie names in a random order
        String[] bogieNames = {"S2", "A1", "B1", "S1", "H1", "B2"};

        System.out.println("Original Bogie Order:");
        printArray(bogieNames);

        // 2. Use the built-in Arrays.sort() method
        // This handles the sorting logic efficiently in O(n log n) time.
        Arrays.sort(bogieNames);

        System.out.println("\nSorted Bogie Order (Lexicographical):");
        printArray(bogieNames);
    }

    /**
     * Helper method to print array elements
     */
    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}