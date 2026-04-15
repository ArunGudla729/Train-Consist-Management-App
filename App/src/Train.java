import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class Train {
    public static void main(String[] args) {
        // Create List of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 64));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));

        System.out.println("Bogies in Train:");
        bogies.forEach(System.out::println);

        // AGGREGATE USING REDUCE
        // 1. map() extracts capacity field from Bogie object
        // 2. reduce() sums the extracted capacities
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("\n--- Train Statistics ---");
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}