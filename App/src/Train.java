import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UC13: Performance Comparison (Loops vs Streams)
 * This class compares execution time of loop-based filtering 
 * versus stream-based filtering using System.nanoTime().
 */
public class Train {

    // Bogie model representing a train carriage
    static class Bogie {
        String id;
        int capacity;

        Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {
        // 1. Prepare a collection of bogies (Large dataset for benchmarking)
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("B" + i, (int) (Math.random() * 100)));
        }

        System.out.println("Starting Performance Benchmark...\n");

        // --- Loop-Based Filtering ---
        long startTimeLoop = System.nanoTime(); // Record start time
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long endTimeLoop = System.nanoTime(); // Record end time
        long durationLoop = endTimeLoop - startTimeLoop; // Calculate elapsed time

        // --- Stream-Based Filtering ---
        long startTimeStream = System.nanoTime(); // Record start time
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endTimeStream = System.nanoTime(); // Record end time
        long durationStream = endTimeStream - startTimeStream; // Calculate elapsed time

        // 2. Display Performance Results
        System.out.println("Loop-Based Results:");
        System.out.println("- Bogies Found: " + loopFiltered.size());
        System.out.println("- Execution Time: " + durationLoop + " ns");

        System.out.println("\nStream-Based Results:");
        System.out.println("- Bogies Found: " + streamFiltered.size());
        System.out.println("- Execution Time: " + durationStream + " ns");

        // Comparison Logic
        System.out.println("\n--- Summary ---");
        if (durationLoop < durationStream) {
            System.out.println("Result: Loop-based filtering was faster by " + (durationStream - durationLoop) + " ns.");
        } else {
            System.out.println("Result: Stream-based filtering was faster by " + (durationLoop - durationStream) + " ns.");
        }
    }
}