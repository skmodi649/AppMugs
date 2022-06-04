package com.example.appmugs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    // Defining the editTexts and progress bars used in the login activity
    private EditText editTextEmail , editTextPassword;
    private FirebaseAuth mAuth;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning ids to the view and progress bars

        editTextEmail = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.password);

        progressBar = findViewById(R.id.progressBar);  //initialising the progress bar

        mAuth = FirebaseAuth.getInstance();
    }
}