package weather;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Weather {
    private final long id;
    private int temperature;
    private int humidity;
    private int windSpeed;

    @Override
    public String toString() {
        return "weather.Weather{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
