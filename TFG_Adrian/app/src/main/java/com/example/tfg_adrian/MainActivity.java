package com.example.tfg_adrian;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tfg_adrian.DB.DBHelper;

public class MainActivity extends AppCompatActivity {

    Button Registrar;
    Button salir;
    Button jugar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Registrar = findViewById(R.id.Registrar);
        salir = findViewById(R.id.salir);
        jugar = findViewById(R.id.jugar);

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IncioActivity.class);
                startActivity(intent);
            }
        });


        //btnCrear.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //  public void onClick(View v) {
        //      DBHelper dbHelper = new DBHelper(MainActivity.this);
        //      SQLiteDatabase db = dbHelper.getWritableDatabase();
        //      if (db != null){
        //          Toast.makeText(MainActivity.this,"BASE DE DATS CREADA", Toast.LENGTH_LONG).show();
        //      } else {
        //          Toast.makeText(MainActivity.this,"ERROR", Toast.LENGTH_LONG).show();
        //              }
        //  }
        // });
        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registro.class);
                startActivity(intent);
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }

    private void mostrarDialogoDeAyuda() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ayuda");
        builder.setMessage("Para jugar crea un usuario pulsando en los tres botones de arriba. \uD83D\uDE0A GRACIAS \uD83D\uDE0A");
        builder.setPositiveButton("\uD83D\uDC4D", null);
        builder.show();

    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() ==R.id.menuNuevo ) {
            nuevoRegistro();
            return true;

        }
        else {
            return super.onOptionsItemSelected(item);

        }
    }

    private void nuevoRegistro(){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }
}