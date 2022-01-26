package com.stortor.tolyapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity3 extends Activity {


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        MediaPlayer mediaPlayer;
        SeekBar volumeControl = null;
        AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
        volumeControl.findViewById(R.id.seekBar);
        new SeekBar.OnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
          int i=0;
            public void onProgressChanged(SeekBar seekBar , boolean b) {
                i=0;  b=false;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}