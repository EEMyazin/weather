package weather;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import weather.data.LocationRepository;

@RestController
@RequestMapping("/coords")
public class GeoInfoController {
    private final LocationRepository locationRepository;

    @GetMapping("/{cityName}")
    public Mono<Point> point(@PathVariable String cityName){
        return new YandexGeoInfo("1248c9ea-4b67-47b9-8b10-df0f0f648695").byCoordinates(cityName);
    }
}
