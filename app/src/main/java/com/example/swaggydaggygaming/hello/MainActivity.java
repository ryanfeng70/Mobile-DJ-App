package com.example.swaggydaggygaming.hello;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.media.MediaPlayer;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Context context = this;
    MediaPlayer mpBass;
    MediaPlayer mpSnare;
    MediaPlayer mpHats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Listeners for Bass buttons and sounds
        mpBass = MediaPlayer.create(context, R.raw.basskick);
        final Button bass = findViewById(R.id.bass);
        bass.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {

                    if (mpBass.isPlaying()) {
                        mpBass.stop();
                        mpBass.release();
                        mpBass = MediaPlayer.create(context, R.raw.basskick);  
                    } 
                    
                    mpBass.start();

                } catch(Exception e) { e.printStackTrace(); }
            }
        });

        //Listeners for Snare buttons and sounds
        mpSnare = MediaPlayer.create(context, R.raw.snare);
        final Button snare = findViewById(R.id.snare);
        snare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    if (mpSnare.isPlaying()) {
                        mpSnare.stop();
                        mpSnare.release();
                        mpSnare = MediaPlayer.create(context, R.raw.snare);
                    } 
                    
                    mpSnare.start();

                } catch(Exception e) { e.printStackTrace(); }
            }
        });

        //Listeners for Hats buttons and sounds
        mpHats = MediaPlayer.create(context, R.raw.hats);
        final Button hats = findViewById(R.id.hats);
        hats.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    if (mpHats.isPlaying()) {
                        mpHats.stop();
                        mpHats.release();
                        mpHats = MediaPlayer.create(context, R.raw.hats);
                    } 
                    
                    mpHats.start();
                    
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
