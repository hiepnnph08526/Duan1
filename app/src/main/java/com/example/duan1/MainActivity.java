package com.example.duan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playgame(View view) {
        Intent intent= new Intent(this,PlayGameActivity.class);
        startActivity(intent);
    }

    public void xephang(View view) {
        Intent intent= new Intent(this,XepHangActivity.class);
        startActivity(intent);
    }

    public void themcauhoi(View view) {
        Intent intent= new Intent(this,ThemCauHoiActivity.class);
        startActivity(intent);
    }
}
