package com.example.riush_tfg;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PestanaJuego extends AppCompatActivity{


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pestana_juego);
        ImageButton mono = findViewById(R.id.mono);
        mono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( );
                startActivity(intent);
                finish();
            }
        });
        ImageButton tresenraya = findViewById(R.id.tresenraya);
        tresenraya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PestanaJuego.this, Tres_en_Raya.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
