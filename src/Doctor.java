public class Doctor extends Person {
    private String specialization;
    private int experience;

    public Doctor(int id, String name, int age, String specialization, int experience) {
        super(id, name, age, "Doctor");
        this.specialization = specialization;
        this.experience = experience >= 0 ? experience : 0;
    }

    @Override
    public void work() {
        System.out.println("Doctor " + name + " is treating patients.");
    }

    @Override
    public String getRole() {
        return "Doctor";
    }

    public boolean isSeniorDoctor() {
        return experience >= 10;
    }

    public String getSpecialization() {
        return specialization;
    }
}