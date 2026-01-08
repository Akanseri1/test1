public class Doctor extends Person {
    private String specialization;
    private int experience;

    public Doctor(String name, int age, String specialization, int experience) {
        super(name, age);
        setSpecialization(specialization);
        setExperience(experience);
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty())
            throw new IllegalArgumentException("Specialization cannot be empty");
        this.specialization = specialization;
    }

    public void setExperience(int experience) {
        if (experience < 0) throw new IllegalArgumentException("Experience cannot be negative");
        this.experience = experience;
    }

    public boolean isSenior() { return experience >= 10; }

    @Override
    public void work() {
        System.out.println("Doctor " + getName() + " is treating patients.");
    }

    @Override
    public String getRole() { return "Doctor"; }

    public String getSpecialization() { return specialization; }
}