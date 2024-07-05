package org.example.stringbasis22;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TicketController {

    private final Tablo tablo;

    @Autowired
    public TicketController(Tablo tablo) {
        
        this.tablo = tablo;
    }

    
    // http://localhost:8080/ticket
    @GetMapping("/ticket")
    public Ticket getTicket() {
        
        return tablo.newTicket();
    }
}
