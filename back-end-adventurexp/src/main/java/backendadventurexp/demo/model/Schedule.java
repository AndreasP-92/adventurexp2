package backendadventurexp.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mail;
    private String activity;
    @JsonFormat(pattern = "yyyy M dd")
    private Date starts;
    @JsonFormat(pattern = "yyyy M dd")
    private Date ends;

    public Schedule() {
    }

    public Schedule(String mail, String activity, Date starts, Date ends) {
        this.mail = mail;
        this.activity = activity;
        this.starts = starts;
        this.ends = ends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Date getStarts() {
        return starts;
    }

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public Date getEnds() {
        return ends;
    }

    public void setEnds(Date ends) {
        this.ends = ends;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", mail='" + mail + '\'' +
                ", activity='" + activity + '\'' +
                ", starts=" + starts +
                ", ends=" + ends +
                '}';
    }
}
