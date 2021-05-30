package com.example.parcial_computo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bienvenidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenidad);

    }
    public void Principal(View View){
        Intent Pantalla2= new Intent (this, Principal.class);
        startActivity(Pantalla2);
        finish();
    }
}