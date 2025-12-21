import java.time.LocalDate;

public class Appointment {
    private int appointmentId;
    private String patientName;
    private String doctorName;
    private LocalDate date;

    public Appointment(int appointmentId, String patientName, String doctorName, LocalDate date) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    public void reschedule(LocalDate newDate) {
        this.date = newDate;
    }

    public void cancel() {
        this.date = null;
    }

    public LocalDate getDate() {
        return date;
    }
}
