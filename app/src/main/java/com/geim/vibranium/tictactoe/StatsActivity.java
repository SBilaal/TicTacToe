package com.geim.vibranium.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
    }

    public void openStatsClassicEasy(View view)
    {
        Intent i = new Intent(this, ClassicStatsEasyActivity.class);
        startActivity(i);
    }

    public void openStatsClassicHard(View view)
    {
        Intent i = new Intent(this, ClassicStatsHardActivity.class);
        startActivity(i);
    }

    public void openStatsMallteaEasy(View view)
    {
        Intent i = new Intent(this, MallteaStatsEasyActivity.class);
        startActivity(i);
    }

    public void openStatsMallteaHard(View view)
    {
        Intent i = new Intent(this, MallteaStatsHardActivity.class);
        startActivity(i);
    }
}
