package com.example.week6daily3homework.view;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.week6daily3homework.R;

public class CompoundView extends LinearLayout {
    TextView tvCounter;
    TextView tvCounter2;

    public CompoundView(Context context) {
        this(context, null);
    }

    public CompoundView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CompoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CompoundView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init(){
        inflate(getContext(), R.layout.compound, this);
        tvCounter = findViewById(R.id.tvCounter);
    }

    public void setCounter(int i){
        tvCounter.setText(String.valueOf(i));
    }

}
