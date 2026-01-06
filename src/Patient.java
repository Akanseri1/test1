public class Patient extends Person {
    private String diagnosis;
    private boolean admitted;

    public Patient(int id, String name, int age, String diagnosis, boolean admitted) {
        super(id, name, age, "Patient");
        this.diagnosis = diagnosis;
        this.admitted = admitted;
    }

    @Override
    public void work() {
        System.out.println("Patient " + name + " is receiving treatment.");
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    public boolean isAdmitted() {
        return admitted;
    }
}