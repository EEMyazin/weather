package weather;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class City {
    private final long id;
    private final float lat;
    private final float lon;
}
