package weather;

import com.jayway.jsonpath.JsonPath;
import org.springframework.web.reactive.function.client.WebClient;

public class YandexGeoInfo implements GeoInfo{
    private final String apikey;
    private WebClient webClient;

    public YandexGeoInfo(String apiKey) {
        this.apikey = apiKey;
        webClient = WebClient.create("https://geocode-maps.yandex.ru/1.x/");
    }

    @Override
    public Point byCoordinates(String cityName) {
        String response = webClient.get().uri(uriBuilder -> uriBuilder
                .queryParam("apikey", apikey)
                .queryParam("results", 1L)
                .queryParam("format", "json")
                .queryParam("geocode", cityName)
                .build()).retrieve()
                .bodyToMono(String.class).block();
        String[] coords = JsonPath.parse(response).read("response.GeoObjectCollection.featureMember[-1].GeoObject.Point.pos").toString().split(" ");
        return new Point(Double.parseDouble(coords[0]), Double.parseDouble(coords[1]));
    }
}
