package backendadventurexp.demo.model;

import javax.persistence.*;


@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="booking_id")
    private int bookingId;
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
    private int bookingClosed;
    @Column(name="booking_active", columnDefinition = "INT DEFAULT 0")
    private int bookingActive;


    public Booking() {
    }

    public Booking(String activity, String guests, String datetime, String duration, String firstname, String lastname, String paid, String phone, String mail, String context, int bookingClosed, int bookingActive) {
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
        this.bookingClosed = bookingClosed;
        this.bookingActive = bookingActive;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
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

    public int getBookingClosed() {
        return bookingClosed;
    }

    public void setBookingClosed(int bookingClosed) {
        this.bookingClosed = bookingClosed;
    }

    public int getBookingActive() {
        return bookingActive;
    }

    public void setBookingActive(int bookingActive) {
        this.bookingActive = bookingActive;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
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
                ", bookingClosed=" + bookingClosed +
                ", bookingActive=" + bookingActive +
                '}';
    }
}
