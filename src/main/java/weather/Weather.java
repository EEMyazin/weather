package weather;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Builder
@ToString
public class Weather {
    private final long id;
    private final int temperature;
    private final int humidity;
    private final int windSpeed;
    private final LocalDateTime timestamp;
    private final City city;
}
