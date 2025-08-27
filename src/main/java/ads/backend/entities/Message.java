package ads.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// 1 123 "oi" "2025-08-26"
// 2 123 "oii" 

@Entity
@Table(name = "message")
public class Message {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    private Long id;

    @Column(name = "content", nullable = false)
    
    
}
