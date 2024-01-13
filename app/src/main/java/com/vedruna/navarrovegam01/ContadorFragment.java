package com.vedruna.navarrovegam01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ContadorFragment extends Fragment {

    private int contadorValue = 0;
    private TextView contadorTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contador, container, false);

        // Inicializar vistas
        contadorTextView = view.findViewById(R.id.textView7);
        Button buttonSumar = view.findViewById(R.id.button);
        Button buttonReset = view.findViewById(R.id.button2);
        Button buttonRestar = view.findViewById(R.id.button3);

        // Configurar clics en los botones
        buttonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumar();
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetear();
            }
        });

        buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restar();
            }
        });

        return view;
    }

    private void sumar() {
        contadorValue++;
        actualizarContador();
    }

    private void resetear() {
        contadorValue = 0;
        actualizarContador();
    }

    private void restar() {
        if (contadorValue > 0) {
            contadorValue--;
            actualizarContador();
        }
    }

    private void actualizarContador() {
        contadorTextView.setText(String.valueOf(contadorValue));
    }
}
