package com.example.jag43.blindhatapp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Set;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //plays audio that's available as a local raw resource (saved in your application's res/raw/ directory)
    MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound_file_1);
    mediaPlayer.start(); // no need to call prepare(); create() does that for you
}
