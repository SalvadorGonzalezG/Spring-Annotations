package com.annotations.spring_annotations.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@Log
@ToString(callSuper = true)
public class RealityStone extends Stone {
    /*
    private static final String COLOR = "Red";
    private static final String NAME = "Reality";
    private static final String LOCATION = "Collector's museum on Knowhere";
    private static final Integer ENERGYLEVEL = 5;
     */

    public RealityStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyProperty
    ) {
        super(colorProperty, nameProperty, locationProperty, energyProperty);
    }

    @Override
    public void usePower(){
        System.out.println("Use RealityStone: " + super.toString());
    }
}
