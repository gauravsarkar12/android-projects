package com.example.inter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.RelativeLayout;   // Layout Importer
import android.widget.Button;           // Button Importer
import android.graphics.Color;          // Color Importer
import android.widget.EditText;         // Text Importer
import android.content.res.Resources;   //
import android.util.TypedValue;         //

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Layout
        RelativeLayout gauravsLayout =  new RelativeLayout(this);
        gauravsLayout.setBackgroundColor(Color.YELLOW); // BackgroundColor Changeability

//        Button
        Button blackButton = new Button(this);
        blackButton.setText("Sign Up");
        blackButton.setTextColor(Color.WHITE);          // Text Color Changeability
        blackButton.setBackgroundColor(Color.BLACK);    // Button BackgroundColor Changeability

//        Username Input
        EditText username = new EditText(this);

//        IDs
        blackButton.setId(1);
        username.setId(2);

//        Rules for button & username
        RelativeLayout.LayoutParams buttonDetails =  new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams usernameDetails =  new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );



//        Give rules to username position widgets
        usernameDetails.addRule(RelativeLayout.ABOVE, blackButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

//        Align the button in center of the screen
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

//        Getting information about the screen or the display
//        More info "https://docs.microsoft.com/en-us/dotnet/api/android.util.typedvalue.applydimension?view=xamarin-android-sdk-9"
        Resources info_screen_value = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200, info_screen_value.getDisplayMetrics()); // Method type casting

        username.setWidth(px);

//        Add widgets to layout(button is now child of layout) & username
        gauravsLayout.addView(blackButton, buttonDetails);
        gauravsLayout.addView(username, usernameDetails);

//        Set this activities content/display to view this
        setContentView(gauravsLayout);

    }
}