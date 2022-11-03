package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView regis,akun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regis = findViewById(R.id.regis);
        akun = findViewById(R.id.akun);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gologin = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(gologin);
            }
        });

        akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gologin = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(gologin);
            }
        });
    }
}