package com.example.gesture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
//import android.support.v4.view.GestureDetectorCompact; // As Importer 'android.support.v4' is deprecated.
import androidx.core.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {

    private TextView message;
    private GestureDetectorCompat gestureDetector; // Detect the gesture from the object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (TextView)findViewById(R.id.message); // Giving the Id
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this); // Allow us to detect double tap
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        message.setText("onSingleTapConfirmed"); // Message to the Screen
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        message.setText("onDoubleTap"); // Message to the Screen
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        message.setText("onDoubleTapEvent"); // Message to the Screen
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        message.setText("onDown"); // Message to the Screen
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        message.setText("onShowPress"); // Message to the Screen

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        message.setText("onSingleTapUp"); // Message to the Screen
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        message.setText("onScroll"); // Message to the Screen
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        message.setText("onLongPress"); // Message to the Screen

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        message.setText("onFling"); // Message to the Screen
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) { //Default functionality event whenever a user touched the screen
        this.gestureDetector.onTouchEvent(event);  // Passing the event
        return super.onTouchEvent(event);
    }
}