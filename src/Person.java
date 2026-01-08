public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    public void work() {
        System.out.println(name + " is in the hospital.");
    }

    public String getRole() { return "Person"; }

    @Override
    public String toString() {
        return "[" + getRole() + "] " + name + ", age " + age;
    }
}