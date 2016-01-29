package com.example.joost.eventbusexample;
import de.greenrobot.event.EventBus;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends Activity {

    private EventBus bus = EventBus.getDefault();

    private TextView view;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        final ButtonReceiver receiver = new ButtonReceiver();

        view = (TextView) findViewById(R.id.TextViewMessage);

        // Register as a subscriber
        bus.register(this);

        button = (Button) findViewById(R.id.submitButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                receiver.post();
            }
        });
    }

    public void onEvent(ButtonEvent event){
        view.setText(view.getText() + "\n" + event.getData());
    }

    @Override
    protected void onDestroy() {
        // Unregister
        bus.unregister(this);
        super.onDestroy();
    }

}