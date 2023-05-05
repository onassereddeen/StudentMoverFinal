package com.zybooks.trips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Button date = findViewById(R.id.button8);
        Button loc = findViewById(R.id.button9);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(date.getContext(), "Sort by soonest on", Toast.LENGTH_LONG).show();
            }
        });
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(date.getContext(), "Display by Popular Locations", Toast.LENGTH_LONG).show();
            }
        });
    }
}