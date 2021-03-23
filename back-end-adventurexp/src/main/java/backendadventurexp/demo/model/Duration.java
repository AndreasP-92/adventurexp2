package backendadventurexp.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Duration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int durationid;
    int duration;

    @ManyToMany
    @JoinTable(
            name = "activity_duration",
            joinColumns = @JoinColumn(name = "duration"),
            inverseJoinColumns = @JoinColumn(name = "activity_id")
    )
    Set<Activity> activityname;

    public Duration() {
    }

    public Duration(int duration, Set<Activity> activityname) {
        this.duration = duration;
        this.activityname = activityname;
    }

    public int getDurationid() {
        return durationid;
    }

    public void setDurationid(int durationid) {
        this.durationid = durationid;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Set<Activity> getActivityname() {
        return activityname;
    }

    public void setActivityname(Set<Activity> activityname) {
        this.activityname = activityname;
    }

    @Override
    public String toString() {
        return "Duration{" +
                "durationid=" + durationid +
                ", duration=" + duration +
                ", activityname=" + activityname +
                '}';
    }
}
