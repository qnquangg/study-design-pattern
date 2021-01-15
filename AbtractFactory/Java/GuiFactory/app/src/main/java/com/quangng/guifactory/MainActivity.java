package com.quangng.guifactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String OS = "Windows";

    private GuiFactory ApplicationConstructor(String os) {
        if (os == "Windows") {
             return new WinFactory();
        }
        else if (os == "Mac") {
            return new MacFactory();
        }
        else
            return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Check OS */
        GuiFactory gui = ApplicationConstructor("Windows");
        gui.createButton();
        gui.createCheckbox();
    }

}