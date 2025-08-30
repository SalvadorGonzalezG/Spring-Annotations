package com.annotations.spring_annotations.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString(callSuper = true)
@Log
public class TimeStone extends Stone{
    /*
    private static final String COLOR = "Green";
    private static final String NAME = "Time";
    private static final String LOCATION = "Sanctum Sanctorum in Kamar-Taj";
    private static final Integer ENERGYLEVEL = 9;
     */

    public TimeStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyProperty
    ){
        super(colorProperty, nameProperty, locationProperty, energyProperty);
    }

    @Override
    public void usePower(){
        System.out.println("Use Power TimeStone: " + super.toString());
    }
}
