package StudentCourseRegistration;

import jakarta.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    private String sname;
    private int days;

    // ✅ Getter and Setter for sid
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    // ✅ Getter and Setter for sname
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    // ✅ Getter and Setter for days
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
