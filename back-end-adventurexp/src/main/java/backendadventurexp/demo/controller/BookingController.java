package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Booking;
import backendadventurexp.demo.repository.BookingRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

//    ==================================================== GET BOOKING ================================================

//    ====== SELECT ALL BOOKINGS =====

    @GetMapping("/select/bookings")
    public List<Booking> findAllBookings() {
        List<Booking> bookings = bookingRepository.findAll();
        return bookings;
    }

    //    ====== SELECT ALL BOOKINGS WITH ACTIVITIES=====

    @GetMapping("/search/booking/{activity}/{mail}")
    public List<Booking> searchAllBookingsWActivities(@PathVariable("activity")String activity, @PathVariable("mail")String mail) {
        System.out.println(mail);
        System.out.println(activity);
        List<Booking> bookings = bookingRepository.findAllByMailAndActivity(mail, activity);
        return bookings;
    }

    //======== SELECT BOOKINGS WITH MAIL=====

    @GetMapping("/search/booking/{activity}")
    public List searchAllBookingsWActivity(@PathVariable String activity) {
        List<Booking> bookingList = bookingRepository.findAllByActivity(activity);

        return bookingList;
    }

    //======== SELECT BOOKINGS WITH MAIL=====

    @GetMapping("/select/booking/{mail}")
    public List findAllBookingsWMail(@PathVariable String mail) {
        List<Booking> bookingList = bookingRepository.findByMail(mail);

        return bookingList;
    }

    //    =======  SELECT ALL CLOSED BOOKINGS WITH MAIL =====

    @GetMapping("/select/closed/booking/activity/{activity}")
    public List searchClosedBookingWActivity(@PathVariable String activity) {
        System.out.println(activity);
        List<Booking> bookingRemove = bookingRepository.findAllByActivity(activity);

        return bookingRemove;
    }

//    =======  SELECT ALL CLOSED BOOKINGS WITH MAIL =====

    @GetMapping("/select/closed/booking/{mail}")
    public List searchClosedBookingWMail(@PathVariable String mail) {
        List<Booking> bookingRemove = bookingRepository.findAllByMail(mail);

        return bookingRemove;
    }

    //    =======  SELECT ALL CLOSED BOOKINGS WITH ACTIVITY AND MAIL =====

    @GetMapping("/select/closed/booking/{activity}/{mail}")
    public List searchClosedBookingWActivityAndMail(@PathVariable("activity") String activity, @PathVariable("mail") String mail) {
        List<Booking> bookingRemove = bookingRepository.findAllByActivityAndMail(activity, mail);

        return bookingRemove;
    }


//    ==================================================== POST BOOKING ================================================

//    =======  INSERT BOOKING =====

    @PostMapping(value = "/insert/booking", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Booking insertBooking(@RequestBody Booking booking) {
        System.out.println(booking);

        return bookingRepository.save(booking);
    }

    @ResponseStatus(code=HttpStatus.OK)
    @PostMapping("/close/booking/{id}")
    public void deleteProfile(@PathVariable int id){
        System.out.println("BOOKING ==="+id);
        Booking oneBooking = bookingRepository.findByBookingId(id);
        System.out.println(oneBooking);
        oneBooking.setBookingClosed(1);

        bookingRepository.save(oneBooking);
    }

    @ResponseStatus(code=HttpStatus.OK)
    @PostMapping("/delete/booking/{id}")
    public void deleteTicket(@PathVariable int id){
        System.out.println("ID================"+id);
        try {
            bookingRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("FEJL i DELETE =" + ex.getMessage());
        }
    }
}