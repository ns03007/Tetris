package com.example.tetris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.high_scores_layout);

        Button back = (Button)findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScoreActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        Button playButton = (Button)findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScoreActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
