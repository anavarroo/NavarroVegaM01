package com.vedruna.navarrovegam01;

import static androidx.core.app.ActivityCompat.finishAffinity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SalirFragment extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_salir); // Reemplaza "tu_layout_xml" con el nombre real de tu archivo XML

        Button salirButton = findViewById(R.id.salirButton);

        salirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cierra la aplicación completamente
                finishAffinity();
            }
        });
    }


}
