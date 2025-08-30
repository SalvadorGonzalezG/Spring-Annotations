package com.annotations.spring_annotations.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.awt.*;
import java.io.*;

@ToString(callSuper = true)
@Log
public class SoulStone extends Stone{
    /*
    private static final String COLOR = "Anaranjado";
    private static final String NAME = "Soul";
    private static final String LOCATION = "Hidden on vomir";
    private static final Integer ENERGYLEVEL = 5;
     */

    public SoulStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyProperty
    ) {
        super( colorProperty, nameProperty, locationProperty, energyProperty);
    }

    @Override
    public void usePower() {
        System.out.println("Back to life: " + super.toString());
    }
}
