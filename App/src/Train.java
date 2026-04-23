import java.util.Scanner;
import java.util.Arrays;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precondition: Data must be sorted
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        String[] bogieIds = new String[n];

        System.out.println("Enter " + n + " sorted Bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.next();
        }

        System.out.print("Enter the Bogie ID to search: ");
        String key = scanner.next();

        int resultIndex = binarySearch(bogieIds, key);

        if (resultIndex != -1) {
            System.out.println("Bogie ID " + key + " found at index: " + resultIndex);
        } else {
            System.out.println("Bogie ID " + key + " not found.");
        }

        scanner.close();
    }

    /**
     * Optimized Binary Search for Strings
     * Time Complexity: O(log n)
     */
    public static int binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = key.compareTo(arr[mid]);

            // Check if key is present at mid
            if (comparison == 0) {
                return mid;
            }

            // If key is lexicographically greater, ignore left half
            if (comparison > 0) {
                low = mid + 1;
            } 
            // If key is lexicographically smaller, ignore right half
            else {
                high = mid - 1;
            }
        }
        return -1; // Not found
    }
}