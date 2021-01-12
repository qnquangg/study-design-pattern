package com.quangng.fanfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String FAN_TYPE = "Table Fan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FanFactory factory = chooseFactory(FAN_TYPE);
        IFan fan = factory.createFan();
        fan.switchOn();
    }

    public FanFactory chooseFactory(String type){
        FanFactory factory;
        if (type == "Table Fan") {
            factory = new TableFanFactory();
        }
        else if (type == "Ceiling Fan") {
            factory = new CeilingFanFactory();
        }
        else if (type == "Exhaust Fan") {
            factory = new ExhaustFanFactory();
        }
        else
            factory = null;
        return factory;
    }
}