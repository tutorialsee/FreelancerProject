package com.tutorialsee.freelancerproject;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class MyVerticalSeekBar extends SeekBar {

    public Progress progress;


    public MyVerticalSeekBar(Context context) {
        super(context);
    }

    public MyVerticalSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public MyVerticalSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(h, w, oldh, oldw);
    }

    @Override
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(heightMeasureSpec, widthMeasureSpec);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    protected void onDraw(Canvas c) {
        c.rotate(270);
        c.translate(-getHeight(),0);

        super.onDraw(c);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!isEnabled()) {
            return false;
        }

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                int j=0;
                j=getMax() - (int) (getMax() * event.getY() / getHeight());
                setProgress(j);
                onSizeChanged(getWidth(), getHeight(), 0, 0);
                break;
            case MotionEvent.ACTION_UP:

                if(getProgress() >= 0 && getProgress() <=30) {
                    this.setProgress(0);
                    this.refreshDrawableState();
                    progress.getProgress(getProgress());
                } else if(getProgress() > 30 && getProgress() <= 60) {
                    this.setProgress(50);
                    progress.getProgress(getProgress());
                    this.refreshDrawableState();
                } else if(getProgress() > 60 && getProgress() <= 100) {
                    this.setProgress(100);
                    progress.getProgress(getProgress());
                    this.refreshDrawableState();
                }

                break;

            case MotionEvent.ACTION_CANCEL:
                break;
        }
        return true;
    }

    @Override
    public synchronized void setProgress(int progress)
    {
        super.setProgress(progress);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    public interface Progress {
        public void getProgress(int progress);
    }

}