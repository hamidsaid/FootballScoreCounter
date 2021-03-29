package com.example.android.footballscorecounter;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {
   // tracks the score for team A
    int scoreTeamA = 0;

    // tracks the score for team B
    int scoreTeamB =0;

    // tracks the fouls for team A
    int foulA =0;

    // tracks the fouls for team B
    int foulB = 0;
    // tracks the yellow cards for teamA

    int yellowCardsA = 0;

    // tracks the red cards for teamA

    int redCardsA = 0;
    // tracks the yellow cards for team B

    int yellowCardsB = 0;

    // tracks the red cards for team  B

    int redCardsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goalTeamA(View view){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);


    }

    public void goalTeamB(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);

    }

    public void foulTeamA(View view){
        foulA++;
        displayfoulForTeamA(foulA);
    }

    public void foulTeamB(View view){
        foulB++;
        displayfoulForTeamB(foulB);
    }
    public void yellowCardsTeamA(View view) {
        yellowCardsA++;
        displayYellowCardTeamA(yellowCardsA);

    }
    public void yellowCardsTeamB(View v){
        yellowCardsB++;
        displayYellowCardTeamB(yellowCardsB);

    }
    public void redCardTeamA(View view){
        redCardsA++;
        displayRedCardTeamA(redCardsA);

    }
    public void redCardTeamB(View view) {
        redCardsB++;
        displayRedCardTeamB(redCardsB);
    }

    //This method resets all the variables to zero

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCardsB =0;
        yellowCardsA  = 0;
        redCardsA = 0;
        redCardsB= 0;
        foulA = 0;
        foulB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayfoulForTeamA(foulA);
        displayfoulForTeamB(foulB);
        displayYellowCardTeamA(yellowCardsA);
        displayYellowCardTeamB(yellowCardsB);
        displayRedCardTeamA(redCardsA);
        displayRedCardTeamB(redCardsB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


   //This method displays fouls committed by team A

    public void displayfoulForTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    //This method displays fouls committed by team B

    public void displayfoulForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    //This method displays the yellow cards of team A
    public void displayYellowCardTeamA(int yellowCards){
        TextView foulView = (TextView) findViewById(R.id.team_a_cardY);
        foulView.setText(String.valueOf(yellowCards));

    }

    //This method displays the yellow cards of team B
    public void displayYellowCardTeamB(int yellowCards){
        TextView foulView = (TextView) findViewById(R.id.team_b_cardY);
        foulView.setText(String.valueOf(yellowCards));

    }
    //This method displays the Red cards of team A
    public void displayRedCardTeamA(int yellowCards){
        TextView foulView = (TextView) findViewById(R.id.team_a_cardR);
        foulView.setText(String.valueOf(yellowCards));

    }
    //This method displays the red cards of team B
    public void displayRedCardTeamB(int yellowCards){
        TextView foulView = (TextView) findViewById(R.id.team_b_cardR);
        foulView.setText(String.valueOf(yellowCards));

    }



}
