package com.stortor.tolyapp;

import androidx.annotation.RequiresApi;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class SettingActivity extends Activity{

    private TextView textVolumeSong;
    private AudioManager audioManager1;
    private AudioManager audioManager;
    private SeekBar volumeControl;
    private SeekBar songControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curValue = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        textVolumeSong = findViewById(R.id.textVolumeSong);

        volumeControl = findViewById(R.id.seekBar);
        volumeControl.setMax(maxVolume);
        volumeControl.setProgress(curValue);
        textVolumeSong.setText(String.valueOf(volumeControl.getProgress()));
        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
                textVolumeSong.setText(String.valueOf(volumeControl.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        audioManager1 = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int maxVolume1 = audioManager1.getStreamMaxVolume(AudioManager.STREAM_ALARM);
        int curValue1 = audioManager1.getStreamVolume(AudioManager.STREAM_ALARM);


        songControl = findViewById(R.id.seekBar2);
        songControl.setMax(maxVolume1);
        songControl.setProgress(curValue1);
        textVolumeSong.setText(String.valueOf(songControl.getProgress()));
        songControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar2, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_ALARM, progress, 0);
                textVolumeSong.setText(String.valueOf(songControl.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar2) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar2) {

            }
        });


    }


}
