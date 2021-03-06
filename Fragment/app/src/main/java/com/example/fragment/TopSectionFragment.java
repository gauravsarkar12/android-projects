package com.example.fragment;

import android.os.Bundle;


import androidx.fragment.app.Fragment;  // Add this importer instead of this [import android.app.Fragment;]

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

// import java.util.zip.Inflater;

public class TopSectionFragment extends Fragment {

    public static EditText topTextInput;
    public static EditText bottomTextInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void creteMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander= (TopSectionListener) activity;
        }catch(ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_layout, container, false);

        topTextInput = (EditText) view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butttonClicked(v);
            }
        });

        return view;
    }

//    Call this when the buttom is clicked
    public void butttonClicked(View view){
        activityCommander.creteMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }

}
