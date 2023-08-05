package com.uzaif.bottlespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

     ImageView Imagebottle;
     int currentpoint ;
     int nextpoint ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Imagebottle = findViewById(R.id.bottle);
        Imagebottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinTheBottle();

            }
        });
    }
    void spinTheBottle()
    {
        nextpoint = new Random().nextInt(5000);

        int px = Imagebottle.getWidth()/2;
        int py = Imagebottle.getHeight()/2;

        Animation rotate = new RotateAnimation(currentpoint,nextpoint,px,py);

        rotate.setDuration(3000);
        rotate.setFillAfter(true);

        currentpoint = nextpoint ;

        Imagebottle.startAnimation(rotate);
    }
}