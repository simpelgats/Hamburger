package com.example.efendi.hamburger;

import android.graphics.drawable.Drawable;

/**
 * Created by Efendi on 17/12/2014.
 */
public class NavigationItem {
    private String mText;
    private Drawable mDrawable;

    public NavigationItem(String text, Drawable drawable){
        mText = text;
        mDrawable = drawable;
    }


    public String getText() {
        return mText;
    }

    public void setmText(String text) {
        mText = text;
    }

    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }
}
