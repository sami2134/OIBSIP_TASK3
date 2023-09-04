package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class StopWatchAct extends AppCompatActivity {
    Button btnstart,btnstop;
    ImageView icanchor;
    Animation rounding_alone;
    Chronometer timeHere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
        btnstart=findViewById(R.id.btnstart);
        icanchor=findViewById(R.id.iconcar);
        btnstop=findViewById(R.id.btnstop);
        timeHere=findViewById(R.id.timeHere);

        btnstop.setAlpha(0);

        rounding_alone= AnimationUtils.loadAnimation(this,R.anim.roundingalone);

        Typeface MMedium =Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");

        btnstart.setTypeface(MMedium);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                icanchor.startAnimation(rounding_alone);
                btnstop.animate().alpha(1).translationY(-80).setDuration(300).start();
                btnstart.animate().alpha(0).setDuration(300).start();
                timeHere.setBase(SystemClock.elapsedRealtime());
                timeHere.start();
            }
        });


    }
}