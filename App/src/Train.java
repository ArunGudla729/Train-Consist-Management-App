// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Base Bogie Class
abstract class Bogie {
    protected String type;
    protected int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public abstract void displayDetails();
}

// PassengerBogie Class with validation logic
class PassengerBogie extends Bogie {
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        super(type, capacity);
        // Fail-Fast Validation: Validate capacity inside the constructor 
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Passenger Bogie [" + type + "] - Capacity: " + capacity);
    }
}

// Main Class named Train
public class Train {
    public static void main(String[] args) {
        System.out.println("--- Train Consist Management: UC14 Custom Exception Handling ---");

        // Test Case 1: Valid Capacity Handling 
        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.print("Success: ");
            sleeper.displayDetails();
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test Case 2: Zero Capacity Detection 
        try {
            System.out.println("\nAttempting to create bogie with 0 capacity...");
            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        // Test Case 3: Negative Capacity Detection [cite: 1]
        try {
            System.out.println("\nAttempting to create bogie with -10 capacity...");
            PassengerBogie invalidBogie = new PassengerBogie("First Class", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }
    }
}