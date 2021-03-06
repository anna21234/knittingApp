package com.example.businessapplicationdevelopment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Additional_Materials_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){

            setTheme(R.style.darkTheme);
        }
        else{ setTheme(R.style.AppTheme);}

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional__materials__screen);
    }

    public void yarnCollectionScreen (View view){
        Intent myIntent = new Intent(getBaseContext(),   Yarn_Collection_Screen.class);
        startActivity(myIntent);
    }

    public void patternAbbvKeyScreen (View view){
        Intent myIntent = new Intent(getBaseContext(),   Pattern_AbbKey_Screen.class);
        startActivity(myIntent);
    }
}
