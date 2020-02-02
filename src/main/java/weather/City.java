package weather;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class City {
    private final long id;
    private final String name;
    private final Point coordinates;

    public City(String cityName){
        this.id = 0;
        this.name = cityName;
        this.coordinates = new Point(1,2);
    }
}
