package com.a3amshenanigans.guessagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ConfirmGameSettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_game_settings);

        int team, players, rounds;
        team = getIntent().getExtras().getInt("num_teams");
        players = getIntent().getExtras().getInt("num_players");
        rounds = getIntent().getExtras().getInt("num_rounds");

        if(team%2==0){

        }else{

        }

    }
}
