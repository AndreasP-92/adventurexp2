package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
//    public Booking findBy(String activity);
//    public Booking findByActivity(String activity);

    public Booking findByMail(String mail);
}