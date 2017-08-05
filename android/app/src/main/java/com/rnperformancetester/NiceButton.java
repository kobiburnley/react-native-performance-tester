package com.rnperformancetester;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;


public class NiceButton extends AppCompatButton {

    private long clicked;

    public NiceButton(Context context) {
        super(context);
    }

    public NiceButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NiceButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public void setOnClickListener(@Nullable final OnClickListener l) {
        super.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked = System.currentTimeMillis();
                l.onClick(v);
            }
        });
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    public void setBackgroundColor(@ColorInt int color) {
        super.setBackgroundColor(color);
        if (color == Color.RED) {
            long colored = System.currentTimeMillis();
            String time = Long.toString(colored - clicked);
            Log.d("NiceButton", time);
            this.setText(time);
        }
    }
}
