package com.geim.vibranium.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClassicGameEasyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_game_easy);
    }

    String player = "X";
    public void btn01(View view)
    {
        if(player.equals("X"))
        {
            Button t = findViewById(R.id.btnk3_0_0);
            t.setText("O");
            player = "O";
            t.setEnabled(false);
        }
    }
}
