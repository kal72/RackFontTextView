package com.rackspira.kal.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ASUS on 02/12/2016.
 */

public class CustomTextView extends TextView {
    public CustomTextView(Context context) {
        this(context, null);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView, 0, 0);
        String font_path = typedArray.getString(R.styleable.CustomTextView_fontPath);
        typedArray.recycle();
        if (font_path != null){
            setCustomTypeFace(context, font_path);
        }else {
            setCustomTypeFace(context, "fonts/geosans_light.ttf");
        }
    }

    public void setCustomTypeFace(Context context, String path) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), path);
        this.setTypeface(typeface);
    }
}
