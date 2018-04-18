package com.geim.vibranium.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNewGrid(View view)
    {
        Intent i = new Intent(this, NewGridsActivity.class);
        startActivity(i);

    }

    public void openMallteaGrid(View view)
    {
        Intent i = new Intent(this, MallteaGridsActivity.class);
        startActivity(i);

    }

    public void openStats(View view)
    {
        Intent i = new Intent(this, StatsActivity.class);
        startActivity(i);

    }
}
