package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.razerdp.widget.animatedpieview.AnimatedPieView;
import com.razerdp.widget.animatedpieview.AnimatedPieViewConfig;
import com.razerdp.widget.animatedpieview.data.SimplePieInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawPie();
    }

    public void drawPie()
    {
        AnimatedPieView mAnimatedPieView = findViewById(R.id.animatedPieView);
        AnimatedPieViewConfig config = new AnimatedPieViewConfig();
        config.startAngle(-90)// 起始角度偏移
                .addData(new SimplePieInfo(30, Color.parseColor("#004E89"), "Title1"))
                .addData(new SimplePieInfo(18.0f, Color.parseColor("#72ddf7"), "Title2")).drawText(true)
            .duration(2000).textSize(60);// 持续时间

// 以下两句可以直接用 mAnimatedPieView.start(config); 解决，功能一致
        mAnimatedPieView.applyConfig(config);
        mAnimatedPieView.start();
    }
}