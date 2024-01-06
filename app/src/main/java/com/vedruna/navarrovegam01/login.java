package com.vedruna.navarrovegam01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.vedruna.navarrovegam01.R;

public class login extends AppCompatActivity {

    private TextView mensaje;
    private EditText user;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mensaje = findViewById(R.id.ComprobacionLogin);

        user = findViewById(R.id.inputUser);
        password = findViewById(R.id.inputPassword);

    }

    public void onClick(View view){
        String username = user.getText().toString();
        String contraseña = password.getText().toString();

        if (username.equals("admin") && contraseña.equals("admin")){
            String usuario = username;
            Intent intent = new Intent(login.this,contador.class);
            intent.putExtra("usuario",usuario);
            startActivity(intent);

        } else {
            mensaje.setText("Usuario o contraseña incorrecta");
        }

    }
}

