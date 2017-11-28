package com.a3amshenanigans.guessagain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void startRules(View view){
        //open rules activity
        Intent intent = new Intent(MainActivity.this, RulesActivity.class);
        startActivity(intent);
    }

    protected void startNewGame(View view){
        //open newGame activity
        Intent intent = new Intent(MainActivity.this, NewGameActivity.class);
        startActivity(intent);
    }
    protected void startSettings(View view){
        //open settings activity
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }
}
