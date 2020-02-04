package com.mee.weather;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@ToString
public class Coordinates {
    @Id
    @GeneratedValue
    private Long id;
    private double latitude;
    private double longitude;

    public Coordinates(){};

    public Coordinates(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
