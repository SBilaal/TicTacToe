package com.geim.vibranium.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewGridsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_grids);
    }

    public void openClassicEasy(View view)
    {
        Intent i = new Intent(this, ClassicGameEasyActivity.class);
        startActivity(i);
    }

    public void openClassicHard(View view)
    {
        Intent i = new Intent(this, ClassicGameHardActivity.class);
        startActivity(i);
    }
}
