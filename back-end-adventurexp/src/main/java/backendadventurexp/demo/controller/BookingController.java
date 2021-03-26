package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Booking;
import backendadventurexp.demo.repository.BookingRepository;
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

    @GetMapping("/select/closed/booking")
    public List removeBooking() {
        List<Booking> bookingRemove = bookingRepository.findAllByBookingClosed(1);

        return bookingRemove;
    }

//    =======  SELECT ALL ACTIVE BOOKINGS =====

    @GetMapping("/select/active/booking")
    public List findAllBookingsActive() {
        List<Booking> bookingActive = bookingRepository.findAllByBookingActive(0);

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

    //     === UPDATE ONE BOOKING ===
    @PostMapping(value = "/update/booking", consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateBooking(@RequestBody Booking booking) {
        System.out.println("BOOKING ===" + booking);
        Booking oneBooking = bookingRepository.findByBookingId(booking.getBookingId());
//        oneBooking.setBookingClosed(booking.getBookingActive());
        if(oneBooking.getBookingActive() == 0){
            oneBooking.setBookingActive(1);
        }else{
            System.out.println("FEJL");
        }
        bookingRepository.save(oneBooking);
        }

    }
