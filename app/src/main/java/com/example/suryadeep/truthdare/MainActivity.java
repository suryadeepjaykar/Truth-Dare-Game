package com.example.suryadeep.truthdare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private Random random=new Random();
    private int lastDirectioon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView2);
    }

    public void spin(View view){
        int newDirection=random.nextInt(5000);
        float pivotX=imageView.getWidth()/2;
        float pivotY=imageView.getHeight()/2;
        Animation rotate=new RotateAnimation(lastDirectioon,newDirection,pivotX,pivotY);

        rotate.setDuration(4000);
        rotate.setFillAfter(true);
        lastDirectioon=newDirection;

        imageView.startAnimation(rotate);
        button.setEnabled(false);


    }
}
