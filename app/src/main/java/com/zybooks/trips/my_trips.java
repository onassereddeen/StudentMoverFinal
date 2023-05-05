package com.zybooks.trips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class my_trips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_trips);
        Button cancel1 = findViewById(R.id.button4);
        View v = findViewById(R.id.button4);
        cancel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Trip Canceled", Toast.LENGTH_LONG).show();
            }
        });

    }

}