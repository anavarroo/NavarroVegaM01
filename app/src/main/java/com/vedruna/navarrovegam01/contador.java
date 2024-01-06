package com.vedruna.navarrovegam01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.vedruna.navarrovegam01.R;

public class contador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contador);

        String username = getIntent().getStringExtra("usuario");

        TextView nombre = findViewById(R.id.ByUser);

        nombre.setText("Bienvenido, " + username);

    }
}