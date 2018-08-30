package cn.tsou.hxgfont;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

import cn.tsou.hxgfont.view.FonMultitAutoCompleteTextView;
import cn.tsou.hxgfont.view.FontAutoCompleteTextView;
import cn.tsou.hxgfont.view.FontButton;
import cn.tsou.hxgfont.view.FontCheckedTextView;
import cn.tsou.hxgfont.view.FontEditText;
import cn.tsou.hxgfont.view.FontTextView;

/**
 * Created by 黄家三少 on 2018/8/30.
 */

public class FontUtils {
    /**
     * 判断字体库的位置，0：在assets目录下
     * 1：在其他位置
     */
    public static int mFontType = 0;
    /**
     * 字体文件地址
     */
    public static String mPath = "";

    /**
     * 拦截view
     *
     * @param parent
     * @param name
     * @param context
     * @param attrs
     * @param path
     */
    public static View createAssetsView(View parent, String name, Context context, AttributeSet attrs, String path) {
        mPath = path;
        mFontType = 0;
        if (TextUtils.isEmpty(mPath)) {
            return null;
        }
        switch (name) {
            case "TextView":
                return new FontTextView(context, attrs);
            case "Button":
                return new FontButton(context, attrs);
            case "EditText":
                return new FontEditText(context, attrs);
            case "CheckedTextView":
                return new FontCheckedTextView(context, attrs);
            case "AutoCompleteTextView":
                return new FontAutoCompleteTextView(context, attrs);
            case "MultiAutoCompleteTextView":
                return new FonMultitAutoCompleteTextView(context, attrs);
        }
        return null;
    }

    public static View createPathView(View parent, String name, Context context, AttributeSet attrs, String path) {
        mPath = path;
        mFontType = 1;
        if (TextUtils.isEmpty(mPath)) {
            return null;
        }
        switch (name) {
            case "TextView":
                return new FontTextView(context, attrs);
            case "Button":
                return new FontButton(context, attrs);
            case "EditText":
                return new FontEditText(context, attrs);
            case "CheckedTextView":
                return new FontCheckedTextView(context, attrs);
            case "AutoCompleteTextView":
                return new FontAutoCompleteTextView(context, attrs);
            case "MultiAutoCompleteTextView":
                return new FonMultitAutoCompleteTextView(context, attrs);
        }
        return null;
    }
}
