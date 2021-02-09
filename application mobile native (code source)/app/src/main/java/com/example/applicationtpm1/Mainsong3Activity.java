package com.example.applicationtpm1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class Mainsong3Activity extends AppCompatActivity {
    private SoundPool soundPool;
    private MediaPlayer mediaPlayer;
    private int sound1, sound2, sound3, sound4, sound5, sound6;
    private int sound3StreamId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsong3);
        //this.mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.sonnerie);
        //mediaPlayer.start();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(6)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(6, AudioManager.STREAM_MUSIC, 0);
        }
        sound1 = soundPool.load(this, R.raw.sonnerie, 1);
        sound2 = soundPool.load(this, R.raw.sonnerie, 1);
        sound3 = soundPool.load(this, R.raw.sonnerie, 1);
        sound4 = soundPool.load(this, R.raw.cestquoi, 1);
        sound5 = soundPool.load(this, R.raw.sonnerie, 1);
        sound6 = soundPool.load(this, R.raw.sonnerie, 1);

    }


    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button_sound4:
                this.mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.cestquoi);
                mediaPlayer.start();
                break;
            case R.id.button_sound5:
                this.mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.syntome);
                mediaPlayer.start();
                break;
            case R.id.button_sound6:
                this.mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.traitement);
                mediaPlayer.start();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }
}
