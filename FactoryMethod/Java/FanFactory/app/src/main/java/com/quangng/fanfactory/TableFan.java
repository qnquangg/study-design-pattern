package com.quangng.fanfactory;

import android.widget.TextView;

public class TableFan implements IFan {

    private TextView modeTextView;

    @Override
    public void switchOn() {
//        modeTextView = (TextView) modeTextView.findViewById(R.id.mode_table_fan);
//        modeTextView.setText("On");
    }

    @Override
    public void switchOff() {
        modeTextView = (TextView) modeTextView.findViewById(R.id.mode_table_fan);
        modeTextView.setText("Off");
    }
}
