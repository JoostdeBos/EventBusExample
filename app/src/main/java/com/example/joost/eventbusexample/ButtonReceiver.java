package com.example.joost.eventbusexample;

import de.greenrobot.event.EventBus;

public class ButtonReceiver {

    private EventBus bus = EventBus.getDefault();
    private int pressed = 0;
    ButtonEvent event;
    public ButtonReceiver() {}

    public void post() {
        if (pressed == 0) {
            event=new ButtonEvent("pressed.");
            pressed = 1;
        } else {
            pressed = 0;
            event=new ButtonEvent("unpressed.");
        }

        bus.post(event);
    }

}