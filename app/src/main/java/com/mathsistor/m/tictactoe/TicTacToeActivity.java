package com.mathsistor.m.tictactoe;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TicTacToeActivity extends AppCompatActivity {
    private TicTacToe game = new TicTacToe();

    @BindView(R.id.game_feedback)
    TextView gameFeedback;

    private HashMap<Integer, Tuple> buttons = new HashMap<>();

    @NonNull
    private Button getButtonById(int id) {
        return (Button) findViewById(id);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        ButterKnife.bind(this);
        gameFeedback.setVisibility(View.INVISIBLE);

        buttons.put(R.id.cell_00, new Tuple(1, 1));
        buttons.put(R.id.cell_01, new Tuple(1, 2));
        buttons.put(R.id.cell_02, new Tuple(1, 3));
        buttons.put(R.id.cell_10, new Tuple(2, 1));
        buttons.put(R.id.cell_11, new Tuple(2, 2));
        buttons.put(R.id.cell_12, new Tuple(2, 3));
        buttons.put(R.id.cell_20, new Tuple(3, 1));
        buttons.put(R.id.cell_21, new Tuple(3, 2));
        buttons.put(R.id.cell_22, new Tuple(3, 3));
    }

            }
        }
    }
}
