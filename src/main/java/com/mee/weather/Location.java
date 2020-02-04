package com.mee.weather;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@EqualsAndHashCode
@ToString
public class Location {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Coordinates coordinates;

    public Location(String locationName, Coordinates coordinates){
        this.name = locationName;
        this.coordinates = coordinates;
    }

    public Location(String locationName){
        this.name = locationName;
        this.coordinates = new Coordinates(1,2);
    }
}
