package com.a3amshenanigans.guessagain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class NewGameActivity extends AppCompatActivity {

    private Spinner spinner_teams, spinner_players, spinner_rounds;
    private Button button_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        initSpinners();
        addListenerOnButton();


    }

    private void initSpinners() {
        //find spinners
        spinner_teams = findViewById(R.id.input_num_teams);
        spinner_players = findViewById(R.id.input_num_players);
        spinner_rounds = findViewById(R.id.input_num_rounds);
        //create array adapters
        ArrayAdapter adapter_teams, adapter_players, adapter_rounds;
        adapter_teams = ArrayAdapter.createFromResource(this, R.array.input_teams, android.R.layout.simple_spinner_dropdown_item);
        adapter_players = ArrayAdapter.createFromResource(this, R.array.input_players, android.R.layout.simple_spinner_dropdown_item);
        adapter_rounds = ArrayAdapter.createFromResource(this, R.array.input_rounds, android.R.layout.simple_spinner_dropdown_item);
        //set adapter layout
        adapter_teams.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_players.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_rounds.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //add adapter to spinner
        spinner_teams.setAdapter(adapter_teams);
        spinner_players.setAdapter(adapter_players);
        spinner_rounds.setAdapter(adapter_rounds);
    }

    private void addListenerOnButton() {
        //find spinners
        spinner_teams = findViewById(R.id.input_num_teams);
        spinner_players = findViewById(R.id.input_num_players);
        spinner_rounds = findViewById(R.id.input_num_rounds);
        //find button
        button_submit = findViewById(R.id.button_submit);
        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //store input and pass to new intent
                int teams, players, rounds;
                teams = Integer.parseInt(spinner_teams.getSelectedItem().toString());
                players = Integer.parseInt(spinner_players.getSelectedItem().toString());
                rounds = Integer.parseInt(spinner_rounds.getSelectedItem().toString());

                Intent confirmGameSettings = new Intent(NewGameActivity.this, ConfirmGameSettingsActivity.class);
                confirmGameSettings.putExtra("num_teams", teams);
                confirmGameSettings.putExtra("num_players", players);
                confirmGameSettings.putExtra("num_rounds", rounds);
                startActivity(confirmGameSettings);
            }
        });
    }
}
