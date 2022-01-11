package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BottomPictureFragment extends Fragment {

    private static TextView topMemeText;
    private static TextView bottomMemeText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topMemeText = (TextView) view.findViewById(R.id.topTextInput);              // Referencing the top TextView in bottom_picture_fragment.xml
        bottomMemeText = (TextView) view.findViewById(R.id.bottomTextInput);        // Referencing the bottom TextView in bottom_picture_fragment.xml
        return view;
    }

    //We have referenced cause to change both of the text in the image
    public void setMemeText(String top, String bottom) {
        topMemeText.setText(top);
        bottomMemeText .setText(bottom);
    }
}