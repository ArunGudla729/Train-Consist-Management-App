import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. User provides passenger bogie capacities 
        System.out.println("Enter the number of passenger bogies:");
        int n = scanner.nextInt();
        int[] capacities = new int[n];

        System.out.println("Enter the capacities for " + n + " bogies:");
        for (int i = 0; i < n; i++) {
            capacities[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Capacities:");
        displayArray(capacities);

        // 2. Perform Bubble Sort Algorithm 
        bubbleSort(capacities);

        // 6. Sorted result is displayed 
        System.out.println("\nSorted Capacities (by Capacity - Ascending):");
        displayArray(capacities);

        scanner.close();
    }

    /**
     * Implements Bubble Sort logic to sort bogie capacities.
     * Uses nested loops and swapping logic[cite: 1].
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop for multiple passes [cite: 1]
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent values [cite: 1]
            for (int j = 0; j < n - i - 1; j++) {
                // 3. Adjacent values are compared [cite: 1]
                if (arr[j] > arr[j + 1]) {
                    // 4. Swap values if out of order [cite: 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}