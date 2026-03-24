import java.util.*;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   UC4 - Maintain Ordered Bogie Consist");
        System.out.println("======================================\n");

        // Create LinkedList (maintains order)
        List<String> trainConsist = new LinkedList<>();

        // -------- ADD BOGIES --------
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // -------- INSERT AT POSITION --------
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // -------- REMOVE FIRST & LAST --------
        trainConsist.remove(0); // first
        trainConsist.remove(trainConsist.size() - 1); // last

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }
}