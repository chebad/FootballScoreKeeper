package com.example.android.footballscorekeeper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {
    /**
     * Value for store a goals from Team A.
     */
    int goalsTeamA = 0;
    /**
     * Value for store a goals from Team B.
     */
    int goalsTeamB = 0;
    /**
     * Value for store a fouls from Team A.
     */
    int foulsTeamA = 0;
    /**
     * Value for store a fouls from Team B.
     */
    int foulsTeamB = 0;
    /**
     * Value for store a fail shots from Team A.
     */
    int failShotA = 0;
    /**
     * Value for store a fail shots from Team A.
     */
    int failShotB = 0;
    /**
     * Value for store a offsides from Team A.
     */
    int offsideTeamA = 0;
    /**
     * Value for store a offsides from Team B.
     */
    int offsideTeamB = 0;
    /**
     * Value for store a yellow cards from Team A.
     */
    int yellowCardTeamA = 0;
    /**
     * Value for store a yellow cards from Team B.
     */
    int yellowCardTeamB = 0;
    /**
     * Value for store a red cards from Team A.
     */
    int redCardTeamA = 0;
    /**
     * Value for store a red cards from Team B.
     */
    int redCardTeamB = 0;



    //==============================================================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
    //==============================================================================================

    /**
     * Increment a score goals for team A and display it on TextView.
     */
    public void teamAScore(View v){
        goalsTeamA++;
        TextView scoreView = (TextView) findViewById(R.id.score_team_A);
        scoreView.setText(String.valueOf(goalsTeamA));
    }
    /**
     * Increment a score goals for team A and display it on TextView.
     */
    public void teamBScore(View v){
        goalsTeamB++;
        TextView scoreView = (TextView) findViewById(R.id.score_team_B);
        scoreView.setText(String.valueOf(goalsTeamB));
    }
    /**
     * Increment a fouls for team A and display it on TextView.
     */
    public void teamAFoul(View v){
        foulsTeamA++;
        TextView scoreView = (TextView) findViewById(R.id.fouls_teamA_view);
        scoreView.setText(String.valueOf(foulsTeamA));
    }
    /**
     * Increment a fouls for team B and display it on TextView.
     */
    public void teamBFoul(View v){
        foulsTeamB++;
        TextView scoreView = (TextView) findViewById(R.id.fouls_teamB_view);
        scoreView.setText(String.valueOf(foulsTeamB));
    }
    /**
     * Increment a fail shots for team A and display it on TextView.
     */
    public void teamAShotFailed(View v){
        failShotA++;
        TextView scoreView = (TextView) findViewById(R.id.shot_failed_A);
        scoreView.setText(String.valueOf(failShotA));
    }
    /**
     * Increment a fail shots for team B and display it on TextView.
     */
    public void teamBShotFailed(View v){
        failShotB++;
        TextView scoreView = (TextView) findViewById(R.id.shot_failed_B);
        scoreView.setText(String.valueOf(failShotB));
    }
    /**
     * Increment a offsides for team A and display on TextView.
     * @param v The view.
     */
    public void teamAOffside(View v){
        offsideTeamA++;
        TextView scoreView = (TextView) findViewById(R.id.offside_A);
        scoreView.setText(String.valueOf(offsideTeamA));
    }
    /**
     * Increment a offsides for team A and display on TextView.
     * @param v The view.
     */
    public void teamBOffside(View v){
        offsideTeamB++;
        TextView scoreView = (TextView) findViewById(R.id.offside_B);
        scoreView.setText(String.valueOf(offsideTeamB));
    }
    /**
     * Increment a yellow cards for team A and display value on TextView.
     * @param v The view.
     */
    public void teamAYellowCard(View v){
        yellowCardTeamA++;
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_A);
        scoreView.setText(String.valueOf(yellowCardTeamA));
    }
    /**
     * Increment a yellow cards for team B and display value on TextView.
     * @param v The view.
     */
    public void teamBYellowCard(View v){
        yellowCardTeamB++;
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_B);
        scoreView.setText(String.valueOf(yellowCardTeamB));
    }
    /**
     * Increment value of red cards for team A and display value on TeamView.
     * @param v The view.
     */
    public void teamARedCard(View v){
        redCardTeamA++;
        TextView scoreView = (TextView) findViewById(R.id.red_card_A);
        scoreView.setText(String.valueOf(redCardTeamA));
    }
    /**
     * Increment value of red cards for team B and display value on TeamView.
     * @param v The view.
     */
    public void teamBRedCard(View v){
        redCardTeamB++;
        TextView scoreView = (TextView) findViewById(R.id.red_card_B);
        scoreView.setText(String.valueOf(redCardTeamB));
    }

    /**
     * Reset all values to start values(= 0).
     * @param v The view.
     */
    public void resetAll(View v){
        /*
        Reset all values to 0.
        */
        goalsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        failShotA = 0;
        failShotB = 0;
        offsideTeamA = 0;
        offsideTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        /*
        Display all values when reset button is clicked.
         */
        TextView scoreView1 = (TextView) findViewById(R.id.score_team_A);
        scoreView1.setText(String.valueOf(goalsTeamA));
        TextView scoreView2 = (TextView) findViewById(R.id.score_team_B);
        scoreView2.setText(String.valueOf(goalsTeamB));
        TextView scoreView3 = (TextView) findViewById(R.id.fouls_teamA_view);
        scoreView3.setText(String.valueOf(foulsTeamA));
        TextView scoreView4 = (TextView) findViewById(R.id.fouls_teamB_view);
        scoreView4.setText(String.valueOf(foulsTeamB));
        TextView scoreView5 = (TextView) findViewById(R.id.shot_failed_A);
        scoreView5.setText(String.valueOf(failShotA));
        TextView scoreView6 = (TextView) findViewById(R.id.shot_failed_B);
        scoreView6.setText(String.valueOf(failShotB));
        TextView scoreView7 = (TextView) findViewById(R.id.offside_A);
        scoreView7.setText(String.valueOf(offsideTeamA));
        TextView scoreView8 = (TextView) findViewById(R.id.offside_B);
        scoreView8.setText(String.valueOf(offsideTeamB));
        TextView scoreView9 = (TextView) findViewById(R.id.yellow_card_A);
        scoreView9.setText(String.valueOf(yellowCardTeamA));
        TextView scoreView10 = (TextView) findViewById(R.id.yellow_card_B);
        scoreView10.setText(String.valueOf(yellowCardTeamB));
        TextView scoreView11 = (TextView) findViewById(R.id.red_card_A);
        scoreView11.setText(String.valueOf(redCardTeamA));
        TextView scoreView12 = (TextView) findViewById(R.id.red_card_B);
        scoreView12.setText(String.valueOf(redCardTeamB));
    }
}
