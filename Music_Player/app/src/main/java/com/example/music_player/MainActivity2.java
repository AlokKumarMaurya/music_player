package com.example.music_player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity2 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button button;
    private SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=findViewById(R.id.button);
        seekBar=findViewById(R.id.seekBar);
        mediaPlayer=new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://pagalworld.com.se/files/download/id/6591");
        } catch (IOException e) {
            e.printStackTrace();
        }

    mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
//
                mediaPlayer.start();
                seekBar.setMax(mediaPlayer.getDuration());
                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {if(b)
                        mediaPlayer.seekTo(i);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });



            }
        });
        mediaPlayer.prepareAsync();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });


    }








//
//    private Button button;
//
//    private  MediaPlayer mediaPlayer;
//    private SeekBar seekBar;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        button=findViewById(R.id.button);
//        //button2=findViewById(R.id.button2);
//        seekBar=findViewById(R.id.seekBar);
//        // mediaPlayer= MediaPlayer.create(this, R.raw.music);
////        button2.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////
////            }
////        });
//
//
//
//        mediaPlayer
//                =new MediaPlayer();
//        try {
//            mediaPlayer.setDataSource("https://pagalworld.com.se/files/download/id/6591");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mediaPlayer) {
//                mediaPlayer.start();
//                seekBar.setMax(mediaPlayer.getDuration());
//                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//                    @Override
//                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                        if(b)
//                            mediaPlayer.seekTo(i);
//                    }
//
//                    @Override
//                    public void onStartTrackingTouch(SeekBar seekBar) {
//
//                    }
//
//                    @Override
//                    public void onStopTrackingTouch(SeekBar seekBar) {
//
//                    }
//                });
//            }
//        });
//        mediaPlayer.prepareAsync();
//
//        button.setOnClickListener(new View.OnClickListener() {
//                                      @Override
//                                      public void onClick(View view) {
//
//                                          mediaPlayer.start();
//
//
////                String url = "https://pagalworld.com.se/files/download/id/6591"; // your URL here
////                MediaPlayer mediaPlayer = new MediaPlayer();
////                mediaPlayer.setAudioAttributes(
////                        new AudioAttributes.Builder()
////                                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
////                                .setUsage(AudioAttributes.USAGE_MEDIA)
////                                .build()
////                );
////                try {
////                    mediaPlayer.setDataSource(url);
////                } catch (IOException e) {
////                    e.printStackTrace();
////                }
////                try {
////                    mediaPlayer.prepare(); // might take long! (for buffering, etc)
////                } catch (IOException e) {
////                    e.printStackTrace();
////                }
////                mediaPlayer.start();
//                                      }
//
//
//                                      //////////////////
//
//
//                                  }
//
//        );}
//
//




















}