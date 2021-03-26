package backendadventurexp.demo.repository;


import backendadventurexp.demo.model.TicketSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketSystemRepository extends JpaRepository<TicketSystem, Integer> {
}