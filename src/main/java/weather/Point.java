package weather;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Point {
    private final double latitude;
    private final double longitude;

    public Point(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
