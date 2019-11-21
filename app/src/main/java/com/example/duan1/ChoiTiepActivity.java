package com.example.duan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChoiTiepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choi_tiep);
    }

    public void choitiep(View view) {
        Intent intent= new Intent(this,PlayGameActivity.class);
        startActivity(intent);
    }
}
