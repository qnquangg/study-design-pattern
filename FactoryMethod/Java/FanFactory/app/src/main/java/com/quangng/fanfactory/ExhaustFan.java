package com.quangng.fanfactory;

import android.widget.TextView;

public class ExhaustFan implements IFan {

    private TextView modeTextView;

    @Override
    public void switchOn() {
        modeTextView = (TextView) modeTextView.findViewById(R.id.mode_exhaust_fan);
        modeTextView.setText("On");
    }

    @Override
    public void switchOff() {
        modeTextView = (TextView) modeTextView.findViewById(R.id.mode_exhaust_fan);
        modeTextView.setText("Off");
    }
}
