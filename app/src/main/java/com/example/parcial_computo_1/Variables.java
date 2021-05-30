package com.example.parcial_computo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class Variables extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variables);
    }
    public void Principal(View View){
        Intent Pantalla2= new Intent (this, Principal.class);
        startActivity(Pantalla2);
        finish();
    }
    public void Video(View View){
        Intent Pantalla5= new Intent (this, Video.class);
        startActivity(Pantalla5);
        finish();
    }
    public void Proximidad(View View){
        Intent Pantalla6= new Intent (this, Proximidad.class);
        startActivity(Pantalla6);
        finish();
    }
    public void Renta(View View){
        Intent Pantalla7= new Intent (this, Renta.class);
        startActivity(Pantalla7);
        finish();
}
}