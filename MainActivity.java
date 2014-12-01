package com.example.parbot.parbotgui2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupCalendarButton();
        setupVitalsButton();
        setupFollowButton();
        setupArmButton();
        setupEmergencybutton();
    }



    private void setupCalendarButton(){
        Button calendarButton= (Button) findViewById(R.id.button);
        calendarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Log.i("OpenCal", "Here is your calendar");
                Toast.makeText(MainActivity.this, "you clicked calendar", Toast.LENGTH_LONG)
                        .show();
                Button calbtn = (Button) v;
                startActivity(new Intent(getApplicationContext(), Calendar.class));

            }
        });
    }

    private void setupVitalsButton(){
        Button vitalsButton= (Button) findViewById(R.id.button2);
        vitalsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Log.i("Openvitals", "Here are your Vitals");
                Toast.makeText(MainActivity.this, "you clicked vitals", Toast.LENGTH_LONG)
                        .show();
                Button vitals = (Button) v;
                startActivity(new Intent(getApplicationContext(), Vitals.class));

            }
        });
    }

    private void setupFollowButton(){
        Button followButton= (Button) findViewById(R.id.button3);
        followButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Log.i("Openfollow", "PARbot is following you");
                Toast.makeText(MainActivity.this, "you clicked follow", Toast.LENGTH_LONG)
                        .show();
                Button follow = (Button) v;
                startActivity(new Intent(getApplicationContext(), Follow.class));

            }
        });
    }


    private void setupArmButton() {
        Button armButton= (Button) findViewById(R.id.button4);
        armButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Log.i("Openarm", "The arm is activated");
                Toast.makeText(MainActivity.this, "you clicked robot arm", Toast.LENGTH_LONG)
                        .show();
                Button arm = (Button) v;
                startActivity(new Intent(getApplicationContext(), Arm.class));

            }
        });

    }


    private void setupEmergencybutton() {
        Button emergencyButton= (Button) findViewById(R.id.button5);
        emergencyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Log.i("Openarm", "The arm is activated");
                Toast.makeText(MainActivity.this, "Emergency!", Toast.LENGTH_LONG)
                        .show();
                Button emergency = (Button) v;
                startActivity(new Intent(getApplicationContext(), Emergency.class));

            }
        });
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
