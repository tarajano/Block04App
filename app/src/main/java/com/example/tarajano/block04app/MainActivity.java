package com.example.tarajano.block04app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        song = MediaPlayer.create(this, R.raw.calabria);
    }

    public void playMusic(View v){
        song.start();
    }

    public void pauseMusic(View v){
        if(song.isPlaying()){
            song.pause();
        }
    }

    public void loopMusic(View v){
        song.setLooping(true);
    }

}
