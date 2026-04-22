import java.util.ArrayList;
import java.util.List;

// Abstract Base Class
abstract class Bogie {
    protected String id;

    public Bogie(String id) {
        this.id = id;
    }

    public abstract boolean isSafetyCompliant();
}

// Goods Bogie specialized class
class GoodsBogie extends Bogie {

    public enum CargoType { PETROLEUM, COAL, GRAIN, EXPLOSIVE }
    public enum Shape { CYLINDRICAL, OPEN, BOX }

    private CargoType cargoType;
    private Shape shape;

    public GoodsBogie(String id, CargoType cargoType, Shape shape) {
        super(id);
        this.cargoType = cargoType;
        this.shape = shape;
    }

    // Safety Rule (UC12)
    @Override
    public boolean isSafetyCompliant() {
        // EXPLOSIVE must be in CYLINDRICAL
        if (cargoType == CargoType.EXPLOSIVE && shape != Shape.CYLINDRICAL) {
            return false;
        }
        return true;
    }

    // For formatted output
    @Override
    public String toString() {
        return capitalize(shape.name()) + " -> " + capitalize(cargoType.name());
    }

    private String capitalize(String text) {
        return text.charAt(0) + text.substring(1).toLowerCase();
    }
}

// Train Management Class
class TrainManager {
    private List<Bogie> bogies = new ArrayList<>();

    public void addBogie(Bogie bogie) {
        bogies.add(bogie);
    }

    public void checkTotalSafety() {

        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("================================================");

        System.out.println("\nGoods Bogies in Train:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        boolean isSafe = true;

        for (Bogie b : bogies) {
            if (!b.isSafetyCompliant()) {
                isSafe = false;
            }
        }

        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}

// Main Class
public class Train {
    public static void main(String[] args) {

        TrainManager myTrain = new TrainManager();

        // Matching your expected output style
        myTrain.addBogie(new GoodsBogie("G001", GoodsBogie.CargoType.PETROLEUM, GoodsBogie.Shape.CYLINDRICAL));
        myTrain.addBogie(new GoodsBogie("G002", GoodsBogie.CargoType.COAL, GoodsBogie.Shape.OPEN));
        myTrain.addBogie(new GoodsBogie("G003", GoodsBogie.CargoType.GRAIN, GoodsBogie.Shape.BOX));
        myTrain.addBogie(new GoodsBogie("G004", GoodsBogie.CargoType.EXPLOSIVE, GoodsBogie.Shape.BOX)); // invalid

        myTrain.checkTotalSafety();
    }
}