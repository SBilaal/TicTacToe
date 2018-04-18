package com.geim.vibranium.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MallteaGameEasyActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malltea_game_easy);

        btn00 = findViewById(R.id.btnm3_0_0);
        btn01 = findViewById(R.id.btnm3_0_1);
        btn02 = findViewById(R.id.btnm3_0_2);
        btn10 = findViewById(R.id.btnm3_1_0);
        btn11 = findViewById(R.id.btnm3_1_1);
        btn12 = findViewById(R.id.btnm3_1_2);
        btn20 = findViewById(R.id.btnm3_2_0);
        btn21 = findViewById(R.id.btnm3_2_1);
        btn22 = findViewById(R.id.btnm3_2_2);

        disableButton();
    }

    String player;

    Button btn00;
    Button btn01;
    Button btn02;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn20;
    Button btn21;
    Button btn22;



    public void disableButton()
    {
        btn00.setEnabled(false);
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
    }

    public void enableButton()
    {
        btn00.setEnabled(true);
        btn01.setEnabled(true);
        btn02.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
    }

    public void choosePlayerTic(View view)
    {
        Button btn = findViewById(R.id.tic_button);
        Button btn2 = findViewById(R.id.toe_button);
        btn.setEnabled(false);
        btn2.setEnabled(false);
        player = "X";

        enableButton();
    }

    public void choosePlayerToe(View view)
    {
        Button btn = findViewById(R.id.tic_button);
        Button btn2 = findViewById(R.id.toe_button);
        btn.setEnabled(false);
        btn2.setEnabled(false);
        player = "O";

        enableButton();
    }

    public void selectBtn00(View view)
    {
        if(player.equals("X"))
        {
            btn00.setText("X");
            player = "O";
        }
        else if(player.equals("O"))
        {
            btn00.setText("O");
            player = "X";
        }

        btn00.setEnabled(false);
    }

}
