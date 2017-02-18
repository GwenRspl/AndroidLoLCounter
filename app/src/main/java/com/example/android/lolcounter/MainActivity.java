package com.example.android.lolcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int blueKillScore = 0;
    int redKillScore = 0;
    int blueBaronScore = 0;
    int redBaronScore = 0;
    int blueDragonScore = 0;
    int redDragonScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayKillsBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_kill_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayKillsRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_kill_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBaronsBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_baron_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBaronsRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_baron_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayDragonsBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_dragon_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayDragonsRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_dragon_score);
        scoreView.setText(String.valueOf(score));
    }

    public void blueKill(View view) {
        blueKillScore = blueKillScore + 1;
        displayKillsBlue(blueKillScore);
    }

    public void blueBaron(View view) {
        blueBaronScore = blueBaronScore + 1;
        displayBaronsBlue(blueBaronScore);
    }

    public void blueDragon(View view) {
        blueDragonScore = blueDragonScore + 1;
        displayDragonsBlue(blueDragonScore);
    }

    public void redKill(View view) {
        redKillScore = redKillScore + 1;
        displayKillsRed(redKillScore);
    }

    public void redBaron(View view) {
        redBaronScore = redBaronScore + 1;
        displayBaronsRed(redBaronScore);
    }

    public void redDragon(View view) {
        redDragonScore = redDragonScore + 1;
        displayDragonsRed(redDragonScore);
    }

    public void resetScores(View view) {
        blueKillScore = 0;
        blueBaronScore = 0;
        blueDragonScore = 0;
        redKillScore = 0;
        redBaronScore = 0;
        redDragonScore = 0;
        displayKillsBlue(blueKillScore);
        displayKillsRed(redKillScore);
        displayBaronsBlue(blueBaronScore);
        displayBaronsRed(redBaronScore);
        displayDragonsBlue(blueDragonScore);
        displayDragonsRed(redDragonScore);
    }
}
