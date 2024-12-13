package com.example.tfg_adrian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class IncioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_incio);
        Button startGameButton = findViewById(R.id.startGameButton);
        Button volver = findViewById(R.id.volver);
        Button startGameButton2 = findViewById(R.id.startGameButton2);
        startGameButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IncioActivity.this, tres_en_raya.class);
                startActivity(intent);
                finish();
            }
        });
        startGameButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IncioActivity.this, flappybird.class);
                startActivity(intent);
                finish();
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IncioActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}