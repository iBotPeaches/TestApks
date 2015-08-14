package com.ibotpeaches.issue1019;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

public class MyCustomElement extends Button {

    private float example;

    public MyCustomElement(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.customAttr, 0, 0);
        try {
            example = ta.getDimension(R.styleable.customAttr_foo, 100.0f);
        } finally {
            ta.recycle();
        }
    }
}
