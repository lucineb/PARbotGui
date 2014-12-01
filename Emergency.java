package com.example.parbot.parbotgui2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Emergency extends Activity {

    MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        Button emergency=(Button)findViewById(R.id.button8);

//        setupEmergencybuttonsound();

        emergency.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                player=MediaPlayer.create(Emergency.this,R.raw.emergency);
                player.start();



            }

        });
//        emergency.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                player.pause();
//
//            }
//        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_emergency, menu);
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
