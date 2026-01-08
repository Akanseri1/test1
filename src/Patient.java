public class Patient extends Person {
    private String diagnosis;
    private boolean admitted;

    public Patient(String name, int age, String diagnosis, boolean admitted) {
        super(name, age);
        setDiagnosis(diagnosis);
        this.admitted = admitted;
    }

    public void setDiagnosis(String diagnosis) {
        if (diagnosis == null || diagnosis.trim().isEmpty())
            throw new IllegalArgumentException("Diagnosis cannot be empty");
        this.diagnosis = diagnosis;
    }

    public boolean isAdmitted() { return admitted; }

    @Override
    public void work() {
        System.out.println("Patient " + getName() + " is receiving treatment.");
    }

    @Override
    public String getRole() { return "Patient"; }
}