package com.example.joost.eventbusexample;

import android.util.Log;

/**
 * Created by Joost on 29-1-2016.
 */
public class ButtonEvent {


    public ButtonEvent(String data){
        DeviceManager deviceManager = DeviceManager.getInstance();
        DeviceManager.getHub().setId(data);
    }

    public String getData(){
        DeviceManager deviceManager = DeviceManager.getInstance();
        String id = DeviceManager.getHub().getId();
        return id;
    }
}