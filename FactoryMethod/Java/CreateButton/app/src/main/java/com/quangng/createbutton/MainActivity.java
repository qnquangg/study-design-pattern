package com.quangng.createbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String configOS = "Windows";

    Dialog createDialog(String os) {
        if (configOS == "Windows") {
            return new WindowsDialog();
        }
        else if (configOS == "Web") {
            return new WebDialog();
        }
        else return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dialog dialog = createDialog(configOS);
        if (dialog != null) {
            // Print output
            final TextView resultTextView = (TextView) findViewById(R.id.result);
            resultTextView.setText(dialog.render());
        }
    }




}