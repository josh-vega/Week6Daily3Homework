package com.example.week6daily3homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;

import com.example.week6daily3homework.view.CompoundView;
import com.example.week6daily3homework.view.CustomEditText;
import com.example.week6daily3homework.view.Rectangle;

public class MainActivity extends AppCompatActivity {
    CompoundView compound;
    Rectangle rectangle;
    CustomEditText etCustom;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compound = findViewById(R.id.compound);
        compound.setCounter(counter);
        rectangle = findViewById(R.id.rectangle);
        etCustom = findViewById(R.id.etCustom);
        etCustom.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                etCustom.checkColor();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                etCustom.checkColor();
            }

            @Override
            public void afterTextChanged(Editable s) {
                etCustom.checkColor();
            }
        });
    }


    public void onClick(View view) {
        counter++;
        compound.setCounter(counter);
    }

    public void onRectClick(View view) {
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);
        rectangle.startAnimation(animation1);
    }
}
