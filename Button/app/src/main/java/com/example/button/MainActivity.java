package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;           // View the layouts in AVD
import android.widget.TextView;     // Importing the TextView Layout
import android.widget.Button;       // Importing the Button Layout


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Reference to the button
        Button gButton =  (Button)findViewById(R.id.gButton); // gButton is the ID

//        Event listener & Interface
        gButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView gText = (TextView)findViewById(R.id.gText);
                gText.setText("See I have changed!");
            }
        });

        gButton.setOnLongClickListener(new Button.OnLongClickListener() {
            public boolean onLongClick(View v) {
                TextView gText = (TextView)findViewById(R.id.gText);
                gText.setText("Hey! You have pressed me for a long time. Just take off your finger.");
                return true;
            }
        });

    }
}