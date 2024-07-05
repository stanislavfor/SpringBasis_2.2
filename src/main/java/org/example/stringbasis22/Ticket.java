package org.example.stringbasis22;



import java.time.LocalDateTime;

public class Ticket {
    
    private String number;
    private LocalDateTime createdAt;
    private String line;
    

    public Ticket(String number, LocalDateTime createdAt, String line) {
        
        this.number = number;
        this.createdAt = createdAt;
        this.line = line;
    }

    public String getNumber() {
        
        return number;
    }

    public void setNumber(String number) {
        
        this.number = number;
    }

    public LocalDateTime getCreatedAt() {
        
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        
        this.createdAt = createdAt;
    }
    
    public String getLine() {
        
        return line;
    }

    public void setLine (String line) {
        
        this.line = line;
    }
    
}
