package com.dasra.dasralatest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_3);

        TextView btn=findViewById(R.id.alreadyHaveAccount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity3.this,MainActivity.class));
            }
        });

        Button btn2=findViewById(R.id.btnRegister);
        btn2.setOnClickListener(v -> startActivity(new Intent(RegisterActivity3.this, MainActivity.class)));
    }
}
