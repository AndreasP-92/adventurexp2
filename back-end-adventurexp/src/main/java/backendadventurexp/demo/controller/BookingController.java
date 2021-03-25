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

    //======== SELECT BOOKINGS WITH MAIL=====

    @GetMapping("/select/booking/{mail}")
    public List findAllBookingsWMail(@PathVariable String mail) {
        List<Booking> bookingList = bookingRepository.findByMail(mail);

        return bookingList;
    }

//    =======  SELECT ALL CLOSED BOOKINGS =====

    @GetMapping("/select/remove/booking/{booking_closed}")
    public List removeBooking(@PathVariable int booking_closed) {
        List<Booking> bookingRemove = bookingRepository.findAllByBookingClosed(booking_closed);

        return bookingRemove;
    }

//    =======  SELECT ALL ACTIVE BOOKINGS =====

    @GetMapping("/select/active/booking/{booking_active}")
    public List findAllBookingsActive(@PathVariable int booking_active) {
        List<Booking> bookingActive = bookingRepository.findAllByBookingActive(booking_active);

        return bookingActive;
    }

//    ==================================================== POST BOOKING ================================================

//    =======  INSERT BOOKING =====

    @PostMapping(value = "/insert/booking", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Booking insertBooking(@RequestBody Booking booking) {
        System.out.println(booking);

        return bookingRepository.save(booking);
    }

//    =======  DISABLE/ENABLE BOOKING =====


}