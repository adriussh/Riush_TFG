package com.example.riush_tfg;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.riush_tfg.Database.DBHelper;

public class PestanaRegistro extends AppCompatActivity {

    DBHelper db; // Instancia del helper
    EditText editTextUsername, editTextPassword;
    Button buttonRegister, buttonLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar la base de datos y las vistas
        db = new DBHelper(this);
        editTextUsername = findViewById(R.id.usuario);
        editTextPassword = findViewById(R.id.clave);
        buttonRegister = findViewById(R.id.button_Registrar);
        buttonLogin = findViewById(R.id.button_Login);

        // Manejar el evento de registro
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (!username.isEmpty() && !password.isEmpty()) {
                    boolean isInserted = db.insertUser(username, password);
                    if (isInserted) {
                        Toast.makeText(PestanaRegistro.this, "Usuario registrado", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(PestanaRegistro.this, "Error al registrar usuario", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(PestanaRegistro.this, "Llena todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Manejar el evento de inicio de sesión
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (!username.isEmpty() && !password.isEmpty()) {
                    boolean isValidUser = db.checkUser(username, password);
                    if (isValidUser) {
                        Toast.makeText(PestanaRegistro.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(PestanaRegistro.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(PestanaRegistro.this, "Llena todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
