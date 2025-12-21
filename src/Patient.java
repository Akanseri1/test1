public class Patient {
    private int patientId;
    private String fullName;
    private int age;
    private String bloodType;

    public Patient(int patientId, String fullName, int age, String bloodType) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.age = age;
        this.bloodType = bloodType;
    }

    public boolean isMinor() {
        return age < 18;
    }

    public String getAgeCategory() {
        if (age < 18) {
            return "Minor";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public int getPatientId() {
        return patientId;
    }

    public String getFullName() {
        return fullName;
    }
}
