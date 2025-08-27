package ads.backend.dtos;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EventDTO {
    private Long id;
    private String name;
    private LocalDateTime event_start;
    private LocalDateTime event_end;
    private 
}
