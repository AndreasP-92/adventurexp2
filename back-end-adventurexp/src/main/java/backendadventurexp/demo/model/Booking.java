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

    @Column(name="booking_closed", nullable = false, columnDefinition = "INT NOT NULL DEFAULT 1")
    private int booking_closed;
    @Column(name="booking_active", columnDefinition = "INT DEFAULT 0")
    private int booking_active;


    public Booking() {
    }

    public Booking(String activity, String guests, String datetime, String duration, String firstname, String lastname, String paid, String phone, String mail, String context, int booking_closed, int booking_active) {
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
        this.booking_closed = booking_closed;
        this.booking_active = booking_active;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getGuests() {
        return guests;
    }

    public void setGuests(String guests) {
        this.guests = guests;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getBooking_closed() {
        return booking_closed;
    }

    public void setBooking_closed(int booking_closed) {
        this.booking_closed = booking_closed;
    }

    public int getBooking_active() {
        return booking_active;
    }

    public void setBooking_active(int booking_active) {
        this.booking_active = booking_active;
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
                ", booking_closed=" + booking_closed +
                ", booking_active=" + booking_active +
                '}';
    }
}
