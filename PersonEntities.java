// Interface
interface Displayable {
    void showDetails();
}

// Abstract Class
abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Doctor Class
class Doctor extends Person implements Displayable {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void showDetails() {
        System.out.println("Doctor: " + name + ", Age: " + age + ", Specialization: " + specialization);
    }
}

// Patient Class
class Patient extends Person implements Displayable {
    private String ailment;

    public Patient(String name, int age, String ailment) {
        super(name, age);
        this.ailment = ailment;
    }

    @Override
    public void showDetails() {
        System.out.println("Patient: " + name + ", Age: " + age + ", Ailment: " + ailment);
    }
}
