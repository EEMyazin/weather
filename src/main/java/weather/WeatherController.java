package weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public Weather weather(@RequestParam(value = "city") String cityName) {
        return new Weather.WeatherBuilder().id(id).humidity(60).temperature(15).windSpeed(70).build();
    }
}
