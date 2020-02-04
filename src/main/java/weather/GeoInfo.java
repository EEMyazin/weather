package weather;

import com.mee.weather.Coordinates;

interface GeoInfo {
    Coordinates byCoordinates(String cityName);
}
