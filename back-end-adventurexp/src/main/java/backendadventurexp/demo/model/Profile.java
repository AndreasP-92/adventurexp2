package backendadventurexp.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String firstname;
    private String lastname;
    private int phone;
    private String fkuser;

//    @OneToMany
//    @JoinColumn(name = "profile_id")
//    private Set<User> users = new HashSet<>();
//    @ManyToOne
//    @JsonBackReference
//    private User user;

    public Profile() {
    }

    public Profile(String firstname, String lastname, int phone, String fkuser, Users user) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.fkuser = fkuser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFkuser() {
        return fkuser;
    }

    public void setFkuser(String fkuser) {
        this.fkuser = fkuser;
    }


    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone=" + phone +
                ", fkuser='" + fkuser + '\'' +
                '}';
    }
}
