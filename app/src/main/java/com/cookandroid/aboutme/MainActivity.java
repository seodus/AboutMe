package com.cookandroid.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView drinkImage, videoImage,weatherImage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinkImage = (ImageView)findViewById(R.id.drinkImage);
        videoImage = (ImageView)findViewById(R.id.videoImage);
        weatherImage = (ImageView)findViewById(R.id.weatherImage);

        drinkImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"버블티",Toast.LENGTH_SHORT).show();
            }
        });

        videoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"유튜브나 넥플릭스 보기",Toast.LENGTH_SHORT).show();
            }
        });

        weatherImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"따뜻한 날씨",Toast.LENGTH_SHORT).show();
            }
        });
    }
}