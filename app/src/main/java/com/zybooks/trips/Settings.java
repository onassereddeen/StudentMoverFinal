package com.zybooks.trips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button signout = findViewById(R.id.button2);
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the FindTrips class
                Intent intent = new Intent(Settings.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button about = findViewById(R.id.button);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the FindTrips class
                Intent intent = new Intent(Settings.this, About.class);
                startActivity(intent);
            }
        });
        Button feedback = findViewById(R.id.button3);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(feedback.getContext(), "Give Contact Info", Toast.LENGTH_LONG).show();
            }
        });

    }
}