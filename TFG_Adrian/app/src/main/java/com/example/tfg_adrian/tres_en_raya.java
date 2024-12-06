package com.example.tfg_adrian;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;

public class tres_en_raya extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    TextView maintext;

    Integer [] botones;

    int [] tablero = new int [] {
            2, 2, 2,
            2, 2, 2,
            2, 2, 2
    };

    int turno = 0;
    int ganador = 2;
    TextView image;
    int fichas_puestas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tres_en_raya);
        maintext = findViewById(R.id.maintext);

        image = findViewById(R.id.image_turn);

        image.setBackgroundResource(R.drawable.monkey_face);


        botones = new Integer [] {
                R.id.button1, R.id.button2, R.id.button3,
                R.id.button4, R.id.button5, R.id.button6,
                R.id.button7, R.id.button8, R.id.button9
        };
    }

    public void ponerficha(View v){

        int seleccionado = Arrays.asList(botones).indexOf(v.getId());

        if (tablero[seleccionado] != 2 || ganador != 2){
            return;
        }
        tablero[seleccionado] = turno;
        //Log.i(TAG, "AQUI");
        if (turno == 0){
            //v.setBackgroundColor(Color.GREEN);

            v.setBackgroundResource(R.drawable.monkey_face);

            image.setBackgroundResource(R.drawable.bananas);
        }
        else{
            v.setBackgroundResource(R.drawable.bananas);
            image.setBackgroundResource(R.drawable.monkey_face);
        }

        turno = turno ^ 1;
        fichas_puestas += 1;


        Log.i(TAG, Arrays.toString(tablero));

        comprobar_ganador();

    }

    @SuppressLint("SetTextI18n")
    public void comprobar_ganador(){
        if (tablero[0] != 2 && tablero[0] == tablero[1] && tablero[0] == tablero[2]){ // Horizontal 1
            ganador = tablero[0];
            findViewById(R.id.horizontal_victory_1).setVisibility(View.VISIBLE);
        }
        else if(tablero[3] != 2 && tablero[3] == tablero[4] && tablero[3] == tablero[5]){ // Horizontal 2
            ganador = tablero[3];
            findViewById(R.id.horizontal_victory_2).setVisibility(View.VISIBLE);
        }
        else if(tablero[6] != 2 && tablero[6] == tablero[7] && tablero[8] == tablero[6]){ // Horizontal 3
            ganador = tablero[6];
            findViewById(R.id.horizontal_victory_3).setVisibility(View.VISIBLE);
        }
        else if(tablero[0] != 2 && tablero[0] == tablero[3] && tablero[0] == tablero[6]){ // Vertical 1
            ganador = tablero[0];
            findViewById(R.id.vertical_victory_1).setVisibility(View.VISIBLE);
        }
        else if(tablero[1] != 2 && tablero[1] == tablero[4] && tablero[1] == tablero[7]){ // Vertical 2
            ganador = tablero[1];
            findViewById(R.id.vertical_victory_2).setVisibility(View.VISIBLE);
        }
        else if(tablero[2] != 2 && tablero[2] == tablero[5] && tablero[2] == tablero[8]){ // Vertical 3
            ganador = tablero[2];
            findViewById(R.id.vertical_victory_3).setVisibility(View.VISIBLE);
        }
        else if(tablero[0] != 2 && tablero[0] == tablero[4] && tablero[0] == tablero[8]){ // Diagonal 1
            ganador = tablero[0];
            findViewById(R.id.diagonal_victory_1).setVisibility(View.VISIBLE);
        }
        else if(tablero[2] != 2 && tablero[2] == tablero[4] && tablero[2] == tablero[6]){ // Diagonal 2
            ganador = tablero[2];
            findViewById(R.id.diagonal_victory_2).setVisibility(View.VISIBLE);
        }
        else{
            if (fichas_puestas == 9) {
                ganador = 3;
            }
        }

        if (ganador != 2) {
            if (ganador == 3) {
                maintext.setText("Empate :/");
                findViewById(R.id.image_turn).setVisibility(View.INVISIBLE);
            }
            else {
                maintext.setText("Felicidades: ");
                maintext.setTextColor(Color.GREEN);
                if (ganador == 0) {
                    image.setBackgroundResource(R.drawable.monkey_face);
                } else {
                    image.setBackgroundResource(R.drawable.bananas);
                }
            }
            Button reiniciar = findViewById(R.id.reiniciar);
            reiniciar.setVisibility(View.VISIBLE);
            reiniciar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(tres_en_raya.this, IncioActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
}
