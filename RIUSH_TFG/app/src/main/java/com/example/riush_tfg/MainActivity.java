package com.example.riush_tfg;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.riush_tfg.Database.DBHelper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button REGISTRAR = findViewById(R.id.REGISTRAR);
        REGISTRAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PestanaRegistro.class);
                startActivity(intent);
            }
        });
        REGISTRAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(MainActivity.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

            }
        });
        Button PLAY = findViewById(R.id.PLAY);
        PLAY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PestanaJuego.class);
                startActivity(intent);
            }
        });
        Button EXIT = findViewById(R.id.EXIT);
        EXIT.setOnClickListener(v -> finishAffinity());

    }
}