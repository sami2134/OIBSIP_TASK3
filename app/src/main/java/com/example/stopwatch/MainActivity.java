package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvSplach,tvSubSpalsh;
    Button btnget ;
    Animation atp;
    ImageView ivsplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSplach=findViewById(R.id.tvHead);
        tvSubSpalsh=findViewById(R.id.tvSubHead);
        btnget=findViewById(R.id.btnget);
        ivsplash=findViewById(R.id.ivSplash);

        atp= AnimationUtils.loadAnimation(this,R.anim.atp);
        ivsplash.startAnimation(atp);


        Typeface MLight =Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
        Typeface MMedium =Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");
        Typeface MRegular =Typeface.createFromAsset(getAssets(),"fonts/MRegular.ttf");

        tvSplach.setTypeface(MRegular);
        tvSubSpalsh.setTypeface(MLight);
        btnget.setTypeface(MMedium);

        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,StopWatchAct.class);
                in.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(in);
            }
        });





    }
}