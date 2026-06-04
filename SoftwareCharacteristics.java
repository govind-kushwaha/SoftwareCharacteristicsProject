import java.util.Scanner;

public class SoftwareCharacteristics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Software Characteristics Management System ===");
        System.out.print("Enter Software Name: ");
        String software = sc.nextLine();

        System.out.println("\nSoftware Name: " + software);

        System.out.println("\nOperational Characteristics:");
        System.out.println("1. Usability");
        System.out.println("2. Efficiency");
        System.out.println("3. Correctness");
        System.out.println("4. Reliability");
        System.out.println("5. Integrity");
        System.out.println("6. Security");
        System.out.println("7. Safety");

        System.out.println("\nTransitional Characteristics:");
        System.out.println("1. Portability");
        System.out.println("2. Interoperability");
        System.out.println("3. Reusability");
        System.out.println("4. Adaptability");

        System.out.println("\nMaintenance Characteristics:");
        System.out.println("1. Modularity");
        System.out.println("2. Maintainability");
        System.out.println("3. Flexibility");
        System.out.println("4. Scalability");

        System.out.println("\nProject Completed Successfully!");
    }
}