package com.quangng.animalfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZooCreator zoo = new ZooCreator("Land");

        Animal cat = zoo.getAnimal("Cat");
        cat.speak();

        Animal dog = zoo.getAnimal("Dog");
        dog.speak();
    }
}