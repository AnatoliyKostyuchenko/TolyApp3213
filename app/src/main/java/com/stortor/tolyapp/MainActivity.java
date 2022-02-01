package com.stortor.tolyapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends Activity implements SoundPool.OnLoadCompleteListener {
    public Button bottomQuest;
    public Button bottomSettings;
    public Button buttonRating;
    public Button buttonCreators;
    private MediaPlayer mediaPlayer;
    public MediaPlayer mediaPlayer1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dragon);
        mediaPlayer.start();
        mediaPlayer1 = MediaPlayer.create(getApplicationContext(),R.raw.listanie);

        bottomQuest = (Button) findViewById(R.id.bottomQuest);
        bottomQuest.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, QuestActivity.class);
            startActivity(intent);
        });
        bottomSettings = (Button) findViewById(R.id.bottomSettings);
        bottomSettings.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this, SettingActivity.class);
            startActivity(intent);
        } );
        buttonRating = (Button) findViewById(R.id.buttonRating);
        buttonRating.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this, RatingActivity.class);
            startActivity(intent);
        } );
        buttonCreators = (Button) findViewById(R.id.buttonCreators);
        buttonCreators.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,CreatorsActivity.class);
            startActivity(intent);
        } );
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int i, int i1) {

    }
}