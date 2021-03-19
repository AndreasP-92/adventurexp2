package backendadventurexp.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
    private String activity;
    private String guests;
    private String datetime;
    private String duration;
    private String firstname;
    private String lastname;
    private String paid;
    private String phone;
    private String mail;
    @Column(precision=10, scale=2)
    private String context;

    public Booking() {
    }

    public Booking(String activity, String guests, String datetime, String duration, String firstname, String lastname, String paid, String phone, String mail, String context) {
        this.activity = activity;
        this.guests = guests;
        this.datetime = datetime;
        this.duration = duration;
        this.firstname = firstname;
        this.lastname = lastname;
        this.paid = paid;
        this.phone = phone;
        this.mail = mail;
        this.context = context;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public String getActivity() {
        return activity;
    }

    public String getGuests() {
        return guests;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getDuration() {
        return duration;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPaid() {
        return paid;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getContext() {
        return context;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", activity='" + activity + '\'' +
                ", guests='" + guests + '\'' +
                ", datetime='" + datetime + '\'' +
                ", duration='" + duration + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", paid='" + paid + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
