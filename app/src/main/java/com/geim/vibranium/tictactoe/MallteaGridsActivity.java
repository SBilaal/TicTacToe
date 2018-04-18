package com.geim.vibranium.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MallteaGridsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malltea_grids);
    }

    public void openMallteaEasy(View view)
    {
        Intent i = new Intent(this, MallteaGameEasyActivity.class);
        startActivity(i);
    }

    public void openMallteaHard(View view)
    {
        Intent i = new Intent(this, MallteaGameHardActivity.class);
        startActivity(i);
    }
}
