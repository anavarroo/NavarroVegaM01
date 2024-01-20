package com.vedruna.navarrovegam01;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vedruna.navarrovegam01.interfaces.CRUDInterface;
import com.vedruna.navarrovegam01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ContenedorFragmentActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenedorfragmentactivity);



/*
        String username = getIntent().getStringExtra("usuario");

        TextView nombre = findViewById(R.id.ByUser);

        nombre.setText("Bienvenido, " + username);

 */



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();

        bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.navigation_home) {
                navController.navigate(R.id.homeFragment);
            } else if (item.getItemId() == R.id.navigation_contador) {
                navController.navigate(R.id.contadorFragment);
            } else if (item.getItemId() == R.id.navigation_info){
                navController.navigate(R.id.infoFragment);
            }else if (item.getItemId() == R.id.navigation_API){
                navController.navigate(R.id.apiFragment);
            } else if (item.getItemId() == R.id.navigation_salir){
                navController.navigate(R.id.salirFragment);
            }
            return true;
        });


    }

}