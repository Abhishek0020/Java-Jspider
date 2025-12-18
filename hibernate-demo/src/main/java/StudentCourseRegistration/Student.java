package StudentCourseRegistration;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Student {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    
    private String name;
    private int age;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id") // This creates a foreign key in Subject table
    private List<Subject> subjects = new ArrayList<>();

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public List<Subject> getSubjects() { return subjects; }
    public void setSubjects(List<Subject> subjects) { this.subjects = subjects; }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
}
