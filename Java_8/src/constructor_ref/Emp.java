package constructor_ref;

interface GetInt<T> {
    T get(String name, int age, int id);
}

public class Emp {
    String name;
    int age;
    int id;

    public Emp(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String toString() {
        return "Emp [name=" + name + ", age=" + age + ", id=" + id + "]";
    }

    public static void main(String[] args) {
        // Constructor reference
        GetInt<Emp> gi = Emp::new;

        // Create Emp object using constructor reference
        Emp emp = gi.get("Abhishek", 22, 101);
        System.out.println(emp);
    }
}
