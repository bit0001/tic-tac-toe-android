package com.mathsistor.m.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TicTacToeActivity extends AppCompatActivity {

    private static final int SIZE = 3;

    @BindView(R.id.game_feedback)
    TextView gameFeedback;

    private Button[][] grid = new Button[SIZE][SIZE];
    private int[][] cell_ids = {
            {R.id.cell_00, R.id.cell_01, R.id.cell_02},
            {R.id.cell_10, R.id.cell_11, R.id.cell_12},
            {R.id.cell_20, R.id.cell_21, R.id.cell_22}
    };

    private Button getButtonById(int id) {
        return (Button) findViewById(id);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        ButterKnife.bind(this);
        gameFeedback.setVisibility(View.INVISIBLE);
        loadGridButtons();
    }

    private void loadGridButtons() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][i] = getButtonById(cell_ids[i][j]);
            }
        }
    }
}
