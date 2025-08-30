package com.annotations.spring_annotations.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString(callSuper = true)
@Log
public class SpaceStone extends Stone{
    /*
    private static final String COLOR = "Blue";
    private static final String NAME = "Space";
    private static final String LOCATION = "Odin's Vault on Asgard";
    private static final Integer ENERGYLEVERL = 8;
     */

    public SpaceStone(
            String colorProperty,
            String nameProperty,
            String locationProperty,
            Integer energyProperty

    ){
        super(colorProperty, nameProperty, locationProperty, energyProperty);
    }

    @Override
    public void usePower(){
        System.out.println("Use SpaceSton: " + super.toString());
    }
}
