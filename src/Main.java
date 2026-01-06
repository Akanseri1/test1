import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Person> people = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        people.add(new Doctor(1, "Dr. Saken", 45, "Therapist", 15));
        people.add(new Patient(2, "Aruzhan", 22, "Flu", true));

        boolean running = true;

        while (running) {
            System.out.println("""
                    === HOSPITAL SYSTEM ===
                    1. Add Person
                    2. Add Doctor
                    3. Add Patient
                    4. View All (Polymorphism)
                    5. Make Everyone Work
                    6. View Doctors Only
                    0. Exit
                    Enter choice:
                    """);

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addPerson();
                case 2 -> addDoctor();
                case 3 -> addPatient();
                case 4 -> viewAll();
                case 5 -> demonstratePolymorphism();
                case 6 -> viewDoctorsOnly();
                case 0 -> running = false;
            }
        }
    }

    private static void addPerson() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        people.add(new Person(id, name, age, "Person"));
    }

    private static void addDoctor() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Specialization: ");
        String spec = scanner.nextLine();
        System.out.print("Experience: ");
        int exp = scanner.nextInt();
        scanner.nextLine();

        Person doctor = new Doctor(id, name, age, spec, exp);
        people.add(doctor);
    }

    private static void addPatient() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Diagnosis: ");
        String diag = scanner.nextLine();
        System.out.print("Admitted (true/false): ");
        boolean admitted = scanner.nextBoolean();
        scanner.nextLine();

        Person patient = new Patient(id, name, age, diag, admitted);
        people.add(patient);
    }

    private static void viewAll() {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void demonstratePolymorphism() {
        for (Person p : people) {
            p.work();
        }
    }

    private static void viewDoctorsOnly() {
        for (Person p : people) {
            if (p instanceof Doctor) {
                Doctor d = (Doctor) p;
                System.out.println(d.getRole() + ": " + d.name +
                        " | " + d.getSpecialization());
                if (d.isSeniorDoctor()) {
                    System.out.println("Senior doctor");
                }
            }
        }
    }
}