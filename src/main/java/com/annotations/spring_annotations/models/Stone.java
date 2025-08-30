package com.annotations.spring_annotations.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString(callSuper = true)
public abstract class Stone implements Serializable {
    protected String color;
    protected String name;
    protected String location;
    protected Integer energyLevel;
    protected Integer numberOfSides;

    private static final int number_sides = 6;

    public Stone(String color, String name, String location, Integer energyLevel){
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLevel = energyLevel;
        this.numberOfSides = number_sides;
    }
    public abstract void usePower();
}
