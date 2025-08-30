package com.annotations.spring_annotations.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@Log
@ToString(callSuper = true)
public class PowerStone extends Stone{
    /*
    private static final String COLOR = "Yellow";
    private static final String NAME = "power";
    private static final String LOCATION = "Found within the battle arena during a match";
    private static final Integer ENERGYLEVEL = 10;
     */

    public PowerStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyLevelProperty
    ){
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    @Override
    public void usePower(){
        System.out.println("Energy Maximized: " + super.toString());
    }
}