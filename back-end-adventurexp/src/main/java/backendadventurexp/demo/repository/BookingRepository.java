package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
//    public Booking findBy(String activity);
//    public Booking findByActivity(String activity);

    public List<Booking> findByMail(String mail);
}