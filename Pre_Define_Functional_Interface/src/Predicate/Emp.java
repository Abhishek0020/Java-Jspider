package Predicate;

public class Emp {
    String name;
    int age;
    public double salary;

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[name: " + name + ", age: " + age + ", salary: " + salary + "]";
    }
}
