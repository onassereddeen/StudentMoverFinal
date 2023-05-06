/*
Group Members: Omar Nassereddeen, Christian Cassell, Jack Filapanits
Project: StudentMover
 */
package com.zybooks.trips;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    // Declare Variables
    Button signIn;
    boolean validLog = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Initialize UI
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Sign-In");

        // Get the button reference
        signIn = findViewById(R.id.signInButton);
        EditText passText = findViewById(R.id.passwordEditText);
        EditText userText = findViewById(R.id.emailEditText);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get text in the edit text inputs
                String text1 = userText.getText().toString();
                String text2 = passText.getText().toString();
                // Run search file methods and make sure the credentials are correct
                // If the login is incorrect print a message prompting the user to enter valid input
                if (searchFile("credentials.txt", text1) && !text1.equals("")) {
                    if (searchFile("passwords.txt", text2) && !text2.equals("")) {
                        Intent intent = new Intent(MainActivity.this, Dashboard.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Enter Valid Credentials", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Enter Valid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
        }
    private boolean searchFile(String fileName, String searchQuery) {
        // Use try and catch blocks when opening files
        try {
            // Accesses asset manager files and creates a reader.
            AssetManager assetManager = getAssets();
            InputStream inputStream = assetManager.open(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            // Reads all lines in the text file until the credentials are found.
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchQuery)) {
                    return true;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // If the correct user input is not found return false.
        return false;
    }

}