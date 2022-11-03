package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    Button klik;
    TextView ngobrol, kuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ngobrol = findViewById(R.id.ngobrolTxt);
        kuy = findViewById(R.id.kuyTxt);
        klik = findViewById(R.id.next);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(next);
            }
        });
    }
}