package backendadventurexp.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "activity_name")
    public String name;
    public String starts;
    public String ends;
    public String age;
    public String size;
    public String description;
    public String pic;
    public String price;
    public String practicalinfo;

    public Activity() {
    }

    public Activity(String name, String starts, String ends, String age, String size, String description, String pic, String price, String practicalinfo) {
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

    public String getStarts() {
        return starts;
    }

    public void setStarts(String starts) {
        this.starts = starts;
    }

    public String getEnds() {
        return ends;
    }

    public void setEnds(String ends) {
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

    public void setPracticalinfo(String practicalInfo) {
        this.practicalinfo = practicalInfo;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", starts='" + starts + '\'' +
                ", ends='" + ends + '\'' +
                ", age='" + age + '\'' +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                ", pic='" + pic + '\'' +
                ", price='" + price + '\'' +
                ", practicalInfo='" + practicalinfo + '\'' +
                '}';
    }
}
