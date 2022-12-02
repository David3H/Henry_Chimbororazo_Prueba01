package com.example.henry_chimborazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonCerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCerrar = findViewById(R.id.buttonCerrar);

        buttonCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // mostrar una segunda pantalla
                Intent sigiente = new Intent(MainActivity.this, MainActivitySecond.class);

                startActivity(sigiente);
            }
        });
    }
}