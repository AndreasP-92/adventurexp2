package backendadventurexp.demo.model;

import javax.persistence.*;

@Entity
public class Duration {
    @Id
    @GeneratedValue
    private int id;
    private int duration;
    private String activityName;

    public Duration() {
    }

    public Duration(int duration, String activityName) {
        this.duration = duration;
        this.activityName = activityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @Override
    public String toString() {
        return "Duration{" +
                "id=" + id +
                ", duration=" + duration +
                ", activityName='" + activityName + '\'' +
                '}';
    }
}
