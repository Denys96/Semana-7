package com.example.parcial_computo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
public void Bienvenidad(View View){
    Intent Bienvenida1= new Intent (this, Bienvenidad.class);
    startActivity(Bienvenida1);
    finish();
        }
    public void variables(View View){
        Intent Pantalla3= new Intent (this, Variables.class);
        startActivity(Pantalla3);
        finish();
    }
    public void Salir(View View){
        finish();
    }
}
