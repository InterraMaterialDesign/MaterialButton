package com.example.buse2.button;

import android.content.Intent;
import android.nfc.Tag;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button materialButton = findViewById(R.id.basicButton);
        Button textButton = findViewById(R.id.textButton);
        Button textAppearance = findViewById(R.id.textAppearance);
        Button fab = findViewById(R.id.fab);
        Button unelevated = findViewById(R.id.unelevatedButton);
        Button explore1 =  findViewById(R.id.explore1);

        explore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ButtonFeatures.class);
                startActivity(intent);
            }
        });

        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BasicButton.class);
                startActivity(intent);
            }
        });

        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TextButton.class);
                startActivity(intent);
            }
        });

        textAppearance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TextAppearance.class);
                startActivity(intent);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FAB.class);
                startActivity(intent);
            }
        });

        unelevated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), UnelevatedButton.class);
                startActivity(intent);
            }
        });
    }
}





 /*button = (Button) findViewById(R.id.button1);
        myConstraint = (ConstraintLayout) findViewById(R.id.constraint);

        int styleButton = R.style.CustomMaterialButton;

        int drawableButton = R.drawable.rounded_shape;

        final ArrayList<Integer> colorPalette = new ArrayList<Integer>();
        colorPalette.add(R.color.black);
        colorPalette.add(R.color.blue);
        colorPalette.add(R.color.brown);
        colorPalette.add(R.color.green);
        colorPalette.add(R.color.orange);
        colorPalette.add(R.color.pink);
        colorPalette.add(R.color.red);
        colorPalette.add(R.color.purple);
        colorPalette.add(R.color.yellow);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                button.setBackgroundColor(getResources().getColor(colorPalette.get(7), getTheme()));
            }


        });

        button.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                button.setBackgroundColor(getResources().getColor(colorPalette.get(1), getTheme()));
            }
        });


        Random generator = new Random();
        //newButton.getBottom() <= (myConstraint.getHeight() - (newButton.getHeight()*i))
        //View v = newButton.getRootView();
        for(int i = 0; i<10; i++) {
            Button newButton = new Button(this);
            myConstraint.addView(newButton);
            newButton.setY(i*100);
            int rand = generator.nextInt(9);
            newButton.setBackgroundColor(getResources().getColor(colorPalette.get(rand), getTheme()));

          if(newButton.getLayout() == null) {
                newButton.setX(i*100);
            }*/
