package com.example.duan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlayGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
    }

    public void choitiep(View view) {
        Intent intent = new Intent(this,ChoiTiepActivity.class);
        startActivity(intent);
    }

    public void gameover(View view) {
        Intent intent = new Intent(this,GameOverActivity.class);
        startActivity(intent);
    }
}
