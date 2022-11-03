package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView regis, lupapw;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        regis = findViewById(R.id.regis);
        lupapw = findViewById(R.id.lupapw);
        login = findViewById(R.id.login);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goregis = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(goregis);
            }
        });

        lupapw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent golupa = new Intent(LoginActivity.this, LupaPassActivity.class);
                startActivity(golupa);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(LoginActivity.this, activity_home_chat.class);
                startActivity(next);
            }
        });
    }
}