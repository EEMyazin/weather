package com.mee.weather;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@EqualsAndHashCode
@ToString
public class Weather {
    @Id
    @GeneratedValue
    private final Long id;
    private final int temperature;
    private final int humidity;
    private final int windSpeed;
    private final Location location;

    private Weather(Long id, int temperature, int humidity, int windSpeed, Location location){
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.location = location;
    };
}
