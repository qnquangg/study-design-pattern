package com.quangng.fanfactory;

import android.widget.TextView;

public class CeilingFan implements IFan {

    private TextView modeTextView;

    @Override
    public void switchOn() {
        modeTextView = modeTextView.findViewById(R.id.mode_ceiling_fan);
        modeTextView.setText("On");
    }

    @Override
    public void switchOff() {
        modeTextView = (TextView) modeTextView.findViewById(R.id.mode_ceiling_fan);
        modeTextView.setText("Off");
    }
}
