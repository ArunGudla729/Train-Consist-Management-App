import java.util.Scanner;

public class BogieSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter number of bogies: ");
            int n = scanner.nextInt();
            
            String[] bogieIds = new String[n];
            if (n > 0) {
                System.out.println("Enter " + n + " sorted Bogie IDs:");
                for (int i = 0; i < n; i++) {
                    bogieIds[i] = scanner.next();
                }
            }

            System.out.print("Enter the Bogie ID to search: ");
            String key = scanner.next();

            // Perform search with state validation
            int resultIndex = searchWithValidation(bogieIds, key);

            if (resultIndex != -1) {
                System.out.println("Bogie ID " + key + " found at index: " + resultIndex);
            } else {
                System.out.println("Bogie ID " + key + " not found.");
            }

        } catch (IllegalStateException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }

    /**
     * UC20: Search with State Validation
     * Throws IllegalStateException if the array is empty.
     */
    public static int searchWithValidation(String[] arr, String key) {
        // Defensive Programming: Check if collection is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Search failed: No bogies available in the train.");
        }

        // Binary Search Logic
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) return mid;
            if (comparison > 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}