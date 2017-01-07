package com.mindtheapps.testingonly0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by amir on 12/20/16.
 */

public class MyView extends View {

    protected final float TEXT_HEIGHT = 100f;
    protected final float TEXT_WIDTH = 320f;
    protected Paint bluePaint = new Paint();
    protected RectF rectF = new RectF(270, 0, 320, 100);
    protected Paint yellowPaint = new Paint();

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        bluePaint.setColor(0xff_00_00_ff); //blue
        yellowPaint.setColor(0xff_ff_ff_00); // yellow
        bluePaint.setAntiAlias(true);
        yellowPaint.setAntiAlias(true);
        bluePaint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(0xffffffff);
        canvas.rotate(-15, getWidth() / 2f, getHeight() / 2f);
        canvas.scale(getWidth() / TEXT_WIDTH, getHeight() / TEXT_HEIGHT);
        canvas.scale(0.7f, 0.7f, TEXT_WIDTH / 2f, TEXT_HEIGHT / 2f);
        drawHello(canvas);
    }

    protected void drawHello(Canvas canvas) {

        canvas.drawLine(0, 0, 0, 100, bluePaint);
        canvas.drawLine(0, 50, 50, 50, bluePaint);
        canvas.drawLine(50, 0, 50, 100, bluePaint); // H

        canvas.drawLine(70, 0, 70, 100, bluePaint);
        canvas.drawLine(70, 0, 120, 0, bluePaint);
        canvas.drawLine(70, 50, 120, 50, bluePaint);
        canvas.drawLine(70, 100, 120, 100, bluePaint); // E

        canvas.drawLine(140, 0, 140, 100, bluePaint);
        canvas.drawLine(140, 100, 190, 100, bluePaint); // L

        canvas.drawLine(210, 0, 210, 100, bluePaint);
        canvas.drawLine(210, 100, 260, 100, bluePaint); // L

        // draw oval with rectangle
        canvas.drawOval(rectF, yellowPaint); // yellow O
        canvas.drawOval(rectF, bluePaint); // blue STROKE for the O
    }

}
