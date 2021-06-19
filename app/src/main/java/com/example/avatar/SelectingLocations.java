package com.example.avatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SelectingLocations extends AppCompatActivity {

    private TextView textViewWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecting_locations);
        textViewWelcome = findViewById(R.id.textViewWelcome);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textViewWelcome.setText("Добро пожаловать "+name+", c какого место хотел бы начать свое путешествие");
    }

    public void go_water(View view) {
        Intent intentwater = new Intent(this, WaterLand.class);
        startActivity(intentwater);
    }

    public void go_earth(View view) {
        Intent intentwater = new Intent(this, EarthLand.class);
        startActivity(intentwater);
    }

    public void go_air(View view) {
        Intent intentwater = new Intent(this, AirLand.class);
        startActivity(intentwater);
    }

    public void go_fire(View view) {
        Intent intentwater = new Intent(this, FireLand.class);
        startActivity(intentwater);
    }
}