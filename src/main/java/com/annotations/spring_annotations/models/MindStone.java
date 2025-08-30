package com.annotations.spring_annotations.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString(callSuper = true)
@Log
public class MindStone extends Stone{

    /*
    private static final String COLOR = "YELLOW";
    private static final String NAME = "Mind";
    private static final String LOCATION = "Center of Loki";
    private static final Integer ENERGYLEVEL = 4;
    */

    public MindStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyLevelProperty
    ) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    @Override
    public void usePower() {
        System.out.println("ability to manipulate the mental reality of others" + super.toString());
    }
}
