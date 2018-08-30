package cn.tsou.hxgfont.view;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.util.AttributeSet;

import cn.tsou.hxgfont.FontUtils;

/**
 * Created by Administrator on 2018/8/30 0030.
 */

public class FonMultitAutoCompleteTextView extends AppCompatMultiAutoCompleteTextView {

    public FonMultitAutoCompleteTextView(Context context) {
        super(context);
        replaceCustomFont();
    }

    public FonMultitAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        replaceCustomFont();
    }

    public FonMultitAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        replaceCustomFont();
    }


    private void replaceCustomFont() {
        Typeface typeface = getTypeface();
        int style = Typeface.NORMAL;
        if (typeface != null) {
            style = typeface.getStyle();
        }
        Typeface newTypeFace = null;
        if (FontUtils.mFontType == 0) {
            //在assets目录下
            newTypeFace = Typeface.createFromAsset(getContext().getAssets(), FontUtils.mPath);
        } else {
            //在其他位置
            newTypeFace = Typeface.createFromFile(FontUtils.mPath);
        }
        setTypeface(newTypeFace, style);
    }
}
