package com.example.parcial_computo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView = (VideoView)findViewById(R.id.videoView);
        String path = "android.resource://"+ getPackageName() + "/" + R.raw.f5;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();

    }
    public void Variables(View View){
        Intent Pantalla3= new Intent (this, Variables.class);
        startActivity(Pantalla3);
        finish();
    }
}