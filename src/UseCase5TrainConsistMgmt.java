import java.util.*;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   UC5 - Preserve Insertion Order of Bogies");
        System.out.println("======================================\n");

        // LinkedHashSet preserves order + removes duplicates
        Set<String> formation = new LinkedHashSet<>();

        // -------- ADD BOGIES --------
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate (will be ignored)
        formation.add("Sleeper");

        // -------- DISPLAY FINAL FORMATION --------
        System.out.println("Final Train Formation:");
        System.out.println(formation + "\n");

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}