package com.stortor.tolyapp;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
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

    final int MAX_STREAMS=100;
    public SoundPool sp;
    public SoundPool sp2;
    int dragon;
    int list;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        sp2 = new SoundPool(MAX_STREAMS, AudioManager.STREAM_ALARM,0);

        dragon = sp.load(this,R.raw.dragon,1);
        sp.play(1,1,15,1,1,1);
        list = sp2.load(this,R.raw.listanie,2);


        bottomQuest = (Button) findViewById(R.id.bottomQuest);
        bottomQuest.setOnClickListener(view -> {
            sp2.play(1,1,15,1,1,2);
            Intent intent = new Intent(MainActivity.this, QuestActivity.class);
            startActivity(intent);
        });
        bottomSettings = (Button) findViewById(R.id.bottomSettings);
        bottomSettings.setOnClickListener(view ->{
            sp2.play(1,1,15,1,1,2);
            Intent intent = new Intent(MainActivity.this, SettingActivity.class);
            startActivity(intent);
        } );
        buttonRating = (Button) findViewById(R.id.buttonRating);
        buttonRating.setOnClickListener(view ->{
            sp2.play(1,1,15,1,1,2);
            Intent intent = new Intent(MainActivity.this, RatingActivity.class);
            startActivity(intent);
        } );
        buttonCreators = (Button) findViewById(R.id.buttonCreators);
        buttonCreators.setOnClickListener(view ->{
            sp2.play(1,1,15,1,1,2);
            Intent intent = new Intent(MainActivity.this,CreatorsActivity.class);
            startActivity(intent);
        } );
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int i, int i1) {
    }

}