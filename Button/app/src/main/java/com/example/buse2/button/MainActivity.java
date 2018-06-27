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

    private ConstraintLayout myConstraint;
    private TextView basicButton;
    private TextView fab;
    private TextView unelevatedButton;
    private TextView textAppearance;
    private TextView textButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        basicButton = (TextView) findViewById(R.id.basicButton);
        fab = (TextView) findViewById(R.id.fab);
        unelevatedButton = (TextView)findViewById(R.id.unelevatedButton);
        textAppearance = (TextView) findViewById(R.id.textAppearence);
        textButton = (TextView) findViewById(R.id.textButton);


        basicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BasicButton.class);
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

        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),  TextButton.class);
                startActivity(intent);
            }
        });
        unelevatedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = höylöylöy  new Intent(view.getContext(), UnelevatedButton.class);
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

        String s1 = new String("ahmet");
        String s2 = "ahmet";
        String s3 = "ahmet";

        if(s1 == s2) {
            Log.v(s1,"s1 eşittir s2");
        }
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
