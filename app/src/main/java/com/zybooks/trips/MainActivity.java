/*
Group Members: Omar Nassereddeen, Christian Cassell, Jack Filapanits
Project: StudentMover
 */
package com.zybooks.trips;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    // Declare Variables
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Initialize UI
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the button reference
        signIn = findViewById(R.id.signInButton);

        // Perform setOnClickListener event on sign in button
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the Dashboard Activity
                Intent intent = new Intent(MainActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });

    }

}