import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient(1, "Yernur", 16, "2");
        Doctor doctor = new Doctor(101, "Doctor", "Surgeon", 12);
        Appointment appointment = new Appointment(
                5001,
                patient.getFullName(),
                doctor.getName(),
                LocalDate.of(2025, 1, 10)
        );

        System.out.println(patient.isMinor());
        System.out.println(patient.getAgeCategory());
        System.out.println(doctor.isExperienced());
        System.out.println(doctor.canPerformSurgery());

        appointment.reschedule(LocalDate.of(2025, 1, 20));
        System.out.println(appointment.getDate());

        appointment.cancel();
        System.out.println(appointment.getDate());
    }
}
