package com.example.parcial_computo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Proximidad extends AppCompatActivity {
    SensorManager sensorManager;
    android.hardware.Sensor sensor;
    SensorEventListener sensorEventListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximidad);
        final TextView texto = (TextView)findViewById(R.id.tvSensor);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(android.hardware.Sensor.TYPE_PROXIMITY);
        if(sensor==null)finish();
        sensorEventListener = new SensorEventListener() {
            @Override public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[0] < sensor.getMaximumRange()){
                    getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
                    texto.setText("     CAMBIANDO A COLOR GRIS " +"             -"+
                            "             DENYS HERNANDEZ" +"                       -"+
                            "               BRANDYN GOMEZ");

                }else{
                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);

                    texto.setText("SENSOR DE PROXIMIDAD");
                }
            }
            @Override public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {

            }
        };
        start();
    }
    private void start() {
        sensorManager.registerListener(sensorEventListener,sensor,2000*1000);
    }
    public void stop(){
        sensorManager.unregisterListener(sensorEventListener);
    }

    @Override
    protected void onPause() {
        stop();
        super.onPause();
    }
    @Override
    protected void onResume() {
        start();
        super.onResume();
    }
    public void Variables(View View){
        Intent Pantalla5= new Intent (this, Variables.class);
        startActivity(Pantalla5);
        finish();
    }
}