package backendadventurexp.demo.model;

import javax.persistence.*;

@Entity
public class TicketSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticket_id;

    private String owner;
    private String context;
    private String timeStamp;
    private String firstname;
    private String lastname;
    private String mail;

    @Column(name="ticket_active", nullable = false, columnDefinition="INT NOT NULL DEFAULT 1")
    private int ticket_active;
    @Column(name="ticket_taken", columnDefinition="INT default 0")
    private int ticket_taken ;



    public TicketSystem() {
    }

    public TicketSystem(String owner, String context, String timeStamp, String firstname, String lastname, String mail, int ticket_active, int ticket_taken) {
        this.owner = owner;
        this.context = context;
        this.timeStamp = timeStamp;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.ticket_active = ticket_active;
        this.ticket_taken = ticket_taken;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTicket_active() {
        return ticket_active;
    }

    public void setTicket_active(int ticket_active) {
        this.ticket_active = ticket_active;
    }

    public int getTicket_taken() {
        return ticket_taken;
    }

    public void setTicket_taken(int ticket_taken) {
        this.ticket_taken = ticket_taken;
    }

    @Override
    public String toString() {
        return "TicketSystem{" +
                "ticket_id=" + ticket_id +
                ", owner='" + owner + '\'' +
                ", context='" + context + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mail='" + mail + '\'' +
                ", ticket_active=" + ticket_active +
                ", ticket_taken=" + ticket_taken +
                '}';
    }
}
