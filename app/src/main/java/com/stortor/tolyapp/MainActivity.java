package com.stortor.tolyapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends Activity {
    private Button bottomQuest;
    private Button bottomSettings;
    private Button buttonRating;
    private Button buttonCreators;
    private MediaPlayer mediaPlayer;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dragon);
        mediaPlayer.start();

        bottomQuest = (Button) findViewById(R.id.bottomQuest);
        bottomQuest.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, QuestActivity.class);
            startActivity(intent);
        });
        bottomSettings = (Button) findViewById(R.id.bottomSettings);
        bottomSettings.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this, SettingActivity.class);
//            intent.putExtra("song", String.valueOf(mediaPlayer));
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
}