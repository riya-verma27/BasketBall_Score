package com.example.basketballcourt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0,scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display_scoreA(0);
    }
    public void display_scoreA(int score)
    {
        TextView value=(TextView)findViewById(R.id.team_A_score);
        value.setText(String.valueOf(score));
    }
    public void submit_threeA(View view)
    {
        scoreA=scoreA+3;
        display_scoreA(scoreA);
    }
    public void submit_twoA(View view)
    {
        scoreA=scoreA+2;
        display_scoreA(scoreA);
    }
    public void submit_oneA(View view)
    {
        scoreA=scoreA+1;
        display_scoreA(scoreA);
    }
    public void display_scoreB(int score)
    {
        TextView value=(TextView)findViewById(R.id.team_B_score);
        value.setText(String.valueOf(score));
    }
    public void submit_threeB(View view)
    {
        scoreB=scoreB+3;
        display_scoreB(scoreB);
    }
    public void submit_twoB(View view)
    {
        scoreB=scoreB+2;
        display_scoreB(scoreB);
    }
    public void submit_oneB(View view)
    {
        scoreB=scoreB+1;
        display_scoreB(scoreB);
    }
    public void reset_score(View view)
    {
        scoreA=0;
        scoreB=0;
        display_scoreA(scoreA);
        display_scoreB(scoreB);
    }
}