import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define Regex Patterns [cite: 1]
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}"; 
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}"; 

        // Compile Patterns [cite: 1]
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Input: Train ID
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();
        
        // Validate Train ID [cite: 1]
        Matcher trainMatcher = trainPattern.matcher(trainId);
        if (trainMatcher.matches()) {
            System.out.println("✔ Valid Train ID: " + trainId);
        } else {
            System.out.println("❌ Invalid Train ID format. Expected format: TRN-1234");
        }

        // Input: Cargo Code
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Validate Cargo Code [cite: 1]
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
        if (cargoMatcher.matches()) {
            System.out.println("✔ Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("❌ Invalid Cargo Code format. Expected format: PET-AB (Uppercase only)");
        }

        scanner.close();
    }
}