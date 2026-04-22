import java.util.ArrayList;
import java.util.List;

// Custom Runtime Exception for safety violations 
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Base class for Bogies
abstract class Bogie {
    protected String id;
    public Bogie(String id) { this.id = id; }
    public abstract String getDetails();
}

// Goods Bogie class with safety validation [cite: 1]
class GoodsBogie extends Bogie {
    private String shape; // "Rectangular" or "Cylindrical"
    private String cargo;

    public GoodsBogie(String id, String shape) {
        super(id);
        this.shape = shape;
        this.cargo = "Empty";
    }

    // Method to assign cargo with safety checks [cite: 1]
    public void assignCargo(String cargoType) {
        System.out.println("\n--- Attempting to assign [" + cargoType + "] to " + shape + " Bogie (" + id + ") ---");
        
        try {
            // Safety Rule: Petroleum cannot be in Rectangular bogies [cite: 1]
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("SAFETY VIOLATION: Petroleum cannot be assigned to a Rectangular bogie.");
            }
            this.cargo = cargoType;
            System.out.println("SUCCESS: Cargo assigned successfully.");
        } 
        catch (CargoSafetyException e) {
            // Catching the exception to prevent program crash [cite: 1]
            System.err.println("HANDLED EXCEPTION: " + e.getMessage());
        } 
        finally {
            // Mandatory logic that always runs [cite: 1]
            System.out.println("FINALLY: Cargo validation process completed for Bogie " + id + ".");
        }
    }

    @Override
    public String getDetails() {
        return "Goods Bogie [" + id + "] | Shape: " + shape + " | Cargo: " + cargo;
    }
}

// Main Class: Train
public class Train {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC15 ===");

        // Creating bogies
        GoodsBogie g1 = new GoodsBogie("G001", "Cylindrical");
        GoodsBogie g2 = new GoodsBogie("G002", "Rectangular");

        // Case 1: Safe Assignment [cite: 1]
        g1.assignCargo("Petroleum");

        // Case 2: Unsafe Assignment (Handled) [cite: 1]
        g2.assignCargo("Petroleum");

        // Case 3: Program continues after exception [cite: 1]
        g2.assignCargo("Grains");

        System.out.println("\n=== Final Train Consist Status ===");
        System.out.println(g1.getDetails());
        System.out.println(g2.getDetails());
        System.out.println("\nApplication terminated safely.");
    }
}