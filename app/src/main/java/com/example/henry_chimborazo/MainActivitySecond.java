package com.example.henry_chimborazo;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivitySecond extends AppCompatActivity {

    private TextView textViewTitle;

    ActivityResultLauncher<Intent> activityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    //comprobar si la ventana hija(ThisActivity) se cerro correctamente

                    if (result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        textViewTitle.setText(data.getDataString());
                    }
                }
            });


}
