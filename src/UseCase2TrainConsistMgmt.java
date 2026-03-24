import java.util.*;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   UC2 - Add Passenger Bogies to Train");
        System.out.println("======================================\n");

        // Create ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // -------- CREATE (Add bogies) --------
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // -------- DELETE (Remove bogie) --------
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // -------- READ (Check existence) --------
        System.out.println("Checking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists + "\n");

        // -------- FINAL STATE --------
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}