package com.rnperformancetester;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;


public class YellowBrick extends LinearLayout {

    private List<Button> buttons = new ArrayList<>();

    public YellowBrick(Context context) {
        super(context);
        init();
    }

    public YellowBrick(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public YellowBrick(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public YellowBrick(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private Button createButton(int i) {
        final Button button = new Button(getContext());
        button.setText(i + "");
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button b : buttons) {
                    b.setBackgroundColor(Color.YELLOW);
                    button.setBackgroundColor(Color.RED);
                }
            }
        });
        button.setBackgroundColor(Color.YELLOW);
        button.setLayoutParams(new TableLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1));
        buttons.add(button);
        return button;
    }

    private void init() {
        this.addView(createButton(1));
        this.addView(createButton(2));
        this.addView(createButton(3));
        this.addView(createButton(4));
    }
}
