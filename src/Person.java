public class Person {
    protected int id;
    protected String name;
    protected int age;
    protected String role;

    public Person(int id, String name, int age, String role) {
        this.id = id;
        this.name = name;
        this.age = age >= 0 ? age : 0;
        this.role = role;
    }

    public void work() {
        System.out.println(name + " is in the hospital.");
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String getRole() {
        return "Person";
    }

    @Override
    public String toString() {
        return "[" + getRole() + "] " + name + ", age " + age;
    }
}
