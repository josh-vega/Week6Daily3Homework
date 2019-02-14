package com.example.week6daily3homework.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.week6daily3homework.R;

public class Rectangle extends View {
    float top, bottom, left, right;
    int fillColor;

//    public Circle(Context context) {
//        super(context);
//    }

    public Rectangle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomRectangle);
        top = typedArray.getInt(R.styleable.CustomRectangle_top, 100);
        left = typedArray.getInt(R.styleable.CustomRectangle_left, 100);
        right = typedArray.getInt(R.styleable.CustomRectangle_right, 300);
        bottom = typedArray.getInt(R.styleable.CustomRectangle_bottom, 500);
        fillColor = typedArray.getInt(R.styleable.CustomRectangle_fillColor, 0);
        typedArray.recycle();
    }

//    public Circle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//    public Circle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(fillColor);

        canvas.drawRect(left, top, right, bottom, paint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int desiredWidth = 600;
        int desiredHeight = 600;

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        System.out.println("WM = " + widthMode);
        System.out.println("WS = " + widthSize);
        System.out.println("HM = " + heightMode);
        System.out.println("HS = " + heightSize);

        int width;
        int height;

        //Measure width
        if (widthMode == MeasureSpec.EXACTLY) {
            //Must be this size
            width = widthSize;
        } else if (widthMode == MeasureSpec.AT_MOST) {
            //Can't be bigger than...
            width = Math.min(desiredWidth, widthSize);
        } else {
            //Be whatever you want
            width = desiredWidth;
        }

        //Measure height
        if(heightMode == MeasureSpec.EXACTLY){
            //Must be this size
            height = heightSize;
        } else if (heightMode == MeasureSpec.AT_MOST){
            //Can't be bigger than...
            height = Math.min(desiredHeight, heightSize);
        } else {
            //Be whatever you want
            height = desiredHeight;
        }

        setMeasuredDimension(width, height);
    }


}
