import java.util.*;

// Bogie class with name and capacity
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class Train {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Using a List to store Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Adding passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting: " + bogies);

        // Applying Comparator to sort by capacity in descending order
        // Use .reversed() to see high-capacity bogies first
        bogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("After Sorting (Highest Capacity First):");
        for (Bogie b : bogies) {
            System.out.println("- " + b);
        }
    }
}