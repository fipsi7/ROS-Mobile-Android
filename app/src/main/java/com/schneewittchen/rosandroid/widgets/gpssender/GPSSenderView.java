package com.schneewittchen.rosandroid.widgets.gpssender;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.Nullable;

import com.schneewittchen.rosandroid.R;
import com.schneewittchen.rosandroid.ui.views.widgets.PublisherWidgetView;
import com.schneewittchen.rosandroid.utility.Utils;
import com.schneewittchen.rosandroid.widgets.joystick.JoystickData;

public class GPSSenderView extends PublisherWidgetView {

    public GPSSenderView(Context context) {
        super(context);
    }

    public GPSSenderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        this.publishViewData(new GPSSenderData(0, 0, 0));
        return true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint outerPaint = new Paint();
        outerPaint.setColor(getResources().getColor(R.color.colorPrimary));
        outerPaint.setStyle(Paint.Style.STROKE);
        outerPaint.setStrokeWidth(Utils.dpToPx(getContext(), 3));

        float width = getWidth();
        float height = getHeight();

        // Outer ring
        canvas.drawCircle(width/2, height/2, width/2-2, outerPaint);
    }
}