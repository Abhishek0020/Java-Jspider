package StudentCourseRegistration;

import jakarta.persistence.*;

public class Driver {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("abhishek");
        EntityManager manager = factory.createEntityManager();

        Subject s1 = new Subject();
        s1.setSname("Java");
        s1.setDays(360);

        Subject s2 = new Subject();
        s2.setSname("AI");
        s2.setDays(60);

        Student student = new Student();
        student.setId(102); // OK if no duplicate in DB, otherwise also make this generated
        student.setName("Abhishek");
        student.setAge(24);

        student.addSubject(s1);
        student.addSubject(s2);

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(student);
        transaction.commit();

        manager.close();
        factory.close();

        System.out.println("✅ Student and Subjects saved successfully.");
    }
}
