import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Person> people = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        people.add(new Doctor("Dr. Saken", 45, "Therapist", 15));
        people.add(new Patient("Aruzhan", 22, "Flu", true));

        while (true) {
            System.out.println("""
                    === HOSPITAL MENU ===
                    1. Add Doctor
                    2. Add Patient
                    3. View All
                    4. Make Everyone Work
                    0. Exit
                    """);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> addDoctor();
                case 2 -> addPatient();
                case 3 -> viewAll();
                case 4 -> demonstratePolymorphism();
                case 0 -> { return; }
                default -> System.out.println("Invalid option");
            }
        }
    }

    private static void addDoctor() {
        try {
            System.out.print("Name: "); String name = scanner.nextLine();
            System.out.print("Age: "); int age = scanner.nextInt(); scanner.nextLine();
            System.out.print("Specialization: "); String spec = scanner.nextLine();
            System.out.print("Experience: "); int exp = scanner.nextInt(); scanner.nextLine();
            people.add(new Doctor(name, age, spec, exp));
            System.out.println("Doctor added!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void addPatient() {
        try {
            System.out.print("Name: "); String name = scanner.nextLine();
            System.out.print("Age: "); int age = scanner.nextInt(); scanner.nextLine();
            System.out.print("Diagnosis: "); String diag = scanner.nextLine();
            System.out.print("Admitted (true/false): "); boolean admitted = scanner.nextBoolean(); scanner.nextLine();
            people.add(new Patient(name, age, diag, admitted));
            System.out.println("Patient added!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewAll() {
        for (Person p : people) System.out.println(p);
    }

    private static void demonstratePolymorphism() {
        for (Person p : people) p.work();
    }
}