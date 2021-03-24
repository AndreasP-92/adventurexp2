package backendadventurexp.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;
//import java.util.Date;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    @JsonFormat(pattern = "yyyy M dd")
//    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "dd-MM-yyyy")
    public Date starts;
    @JsonFormat(pattern = "yyyy M dd")
//    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern = "dd-MM-yyyy")
    public Date ends;
    public String age;
    public String size;
    public String description;
    public String pic;
    public String price;
    public String practicalinfo;

    public Activity() {
    }

    public Activity(String name, Date starts, Date ends, String age, String size, String description, String pic, String price, String practicalinfo) {
        this.name = name;
        this.starts = starts;
        this.ends = ends;
        this.age = age;
        this.size = size;
        this.description = description;
        this.pic = pic;
        this.price = price;
        this.practicalinfo = practicalinfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPracticalinfo() {
        return practicalinfo;
    }

    public void setPracticalinfo(String practicalinfo) {
        this.practicalinfo = practicalinfo;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", starts=" + starts +
                ", ends=" + ends +
                ", age='" + age + '\'' +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                ", pic='" + pic + '\'' +
                ", price='" + price + '\'' +
                ", practicalinfo='" + practicalinfo + '\'' +
                '}';
    }
}
