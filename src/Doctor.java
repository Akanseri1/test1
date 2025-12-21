public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    private int experienceYears;

    public Doctor(int doctorId, String name, String specialization, int experienceYears) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    public boolean isExperienced() {
        return experienceYears >= 5;
    }

    public boolean canPerformSurgery() {
        return experienceYears >= 10;
    }

    
    public String getName() {
        return name;
    }
}
