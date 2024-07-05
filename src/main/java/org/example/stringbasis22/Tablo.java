package org.example.stringbasis22;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Tablo {

    private final TicketNumberGenerator ticketNumberGenerator;

    @Autowired
    public Tablo(TicketNumberGenerator ticketNumberGenerator) {
        
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    public Ticket newTicket() {
        
        String number = ticketNumberGenerator.createNewNumber();
        LocalDateTime createdAt = LocalDateTime.now();
        String line = "railway";
        return new Ticket(number, createdAt, line);
    }
}
