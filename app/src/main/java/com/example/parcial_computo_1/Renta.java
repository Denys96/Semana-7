package com.example.parcial_computo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Renta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renta);
        final EditText Nombre =(EditText)this.findViewById(R.id.txtnombre);
        final EditText Sueldo =(EditText)this.findViewById(R.id.txtsueldo);
        Button btncalcular =(Button)this.findViewById(R.id.btncalcular);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = Nombre.getText().toString();
                String sueldo = Sueldo.getText().toString();

                Bundle pasarDatos = new Bundle();

                pasarDatos.putString("pNombre",nombre);
                pasarDatos.putString("psueldo",sueldo);
                Intent siga = new Intent(Renta.this,Renta2.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);
                finish();
            }
        });

    }
    public void Variables(View View){
        Intent Pantalla6= new Intent (this, Variables.class);
        startActivity(Pantalla6);
        finish();

    }
}