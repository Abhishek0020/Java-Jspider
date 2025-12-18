package Employee_Management;


public class Entity {
    private int id;
    private String name;
    private int age;
    private int sal;

    public Entity(int id, String name, int age, int sal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    // Getters and Setters (if needed)
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getSal() { return sal; }
}
