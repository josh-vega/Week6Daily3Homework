package com.example.week6daily3homework.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomEditText extends android.support.v7.widget.AppCompatEditText {
    public CustomEditText(Context context) {
        this(context, null);
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //init();
    }

    public void checkColor()
    {
        if(getText().toString().length() < 8)
        {
            setTextColor(Color.RED);
        }
        else
        {
            setTextColor(Color.BLACK);
        }
    }
}
