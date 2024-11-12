package com.example.riush_tfg;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;
public class Tres_en_Raya extends AppCompatActivity {
    TextView maintext;

    Integer [] mapa;

    int [] tablero = new int [] {
            0, 0, 0,
            0, 0, 0,
            0, 0, 0
    };

    int turno;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        maintext = (TextView) findViewById(R.id.maintext);

        mapa = new Integer [] {
                R.id.button2, R.id.button3, R.id.button4,
                R.id.button5, R.id.button6, R.id.button7,
                R.id.button8, R.id.button9, R.id.button10
        };
    }

    public void ponerficha(View v){
        int seleccionado = Arrays.asList(mapa).indexOf(v.getId());

        if (tablero[seleccionado] == 0){
            return;
        }
        tablero[seleccionado] = turno;

        if (turno == 0){
            v.setBackgroundResource(R.drawable.monkey_face);
        }
        else{
            v.setBackgroundResource(R.drawable.monkey_face);
        }

    }
}
