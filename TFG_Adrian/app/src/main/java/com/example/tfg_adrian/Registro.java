package com.example.tfg_adrian;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tfg_adrian.DB.DbUsuarios;

public class Registro extends AppCompatActivity {

    EditText usuario, contrasena;
    Button button_guardar, button_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);

        usuario = findViewById(R.id.usuario);
        contrasena = findViewById(R.id.contrasena);
        button_guardar = findViewById(R.id.button_guardar);
        button_salir = findViewById(R.id.button_salir);

        button_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbUsuarios dbUsuarios = new DbUsuarios(Registro.this);
                long id = dbUsuarios.insertarUsuario(usuario.getText().toString(),contrasena.getText().toString());
                if (id > 0){
                    Toast.makeText(Registro.this,"Registro Guardado", Toast.LENGTH_LONG).show();
                    limpiar();
                } else {
                    Toast.makeText(Registro.this,"Error al guardar registro ", Toast.LENGTH_LONG).show();
                }

            }
        });

        button_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void limpiar(){
        usuario.setText("");
        contrasena.setText("");
    }

}