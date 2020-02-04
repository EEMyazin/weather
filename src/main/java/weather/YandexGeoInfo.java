package weather;

import com.jayway.jsonpath.JsonPath;
import com.mee.weather.Coordinates;
import org.springframework.web.reactive.function.client.WebClient;

public class YandexGeoInfo implements GeoInfo{
    private final String apikey;
    private WebClient webClient;

    public YandexGeoInfo(String apiKey) {
        this.apikey = apiKey;
        webClient = WebClient.create("https://geocode-maps.yandex.ru/1.x/");
    }

    @Override
    public Coordinates byCoordinates(String cityName) {
        String response = webClient.get().uri(uriBuilder -> uriBuilder
                .queryParam("apikey", apikey)
                .queryParam("results", 1L)
                .queryParam("format", "json")
                .queryParam("geocode", cityName)
                .build()).retrieve()
                .bodyToMono(String.class).block();
        String[] coords = JsonPath.parse(response).read("response.GeoObjectCollection.featureMember[-1].GeoObject.Point.pos").toString().split(" ");
        return new Coordinates(Double.parseDouble(coords[0]), Double.parseDouble(coords[1]));
    }
}
