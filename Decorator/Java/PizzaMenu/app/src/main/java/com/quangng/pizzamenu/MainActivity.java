package com.quangng.pizzamenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pizza ChickenFiesta = new ChickenFiesta();
        Pizza freshTomatoChickenFiesta = new FreshTomato(ChickenFiesta);
        Pizza barbequeFreshTomatoChickenFiesta = new Barbeque(freshTomatoChickenFiesta);

        // Print output
        final TextView resultTextView = (TextView) findViewById(R.id.result);
        resultTextView.setText(barbequeFreshTomatoChickenFiesta.getName() + ": " + barbequeFreshTomatoChickenFiesta.getCost());
    }

}