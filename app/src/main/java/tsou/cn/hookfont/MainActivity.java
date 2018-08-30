package tsou.cn.hookfont;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import java.io.File;

import cn.tsou.hxgfont.FontUtils;

public class MainActivity extends AppCompatActivity {

    private String path= Environment.getExternalStorageDirectory().getAbsolutePath()+
            File.separator+"yuehei1.otf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        beforeContentView();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void beforeContentView() {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        LayoutInflaterCompat.setFactory2(layoutInflater, this);
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
//        View view = FontUtils.createAssetsView(parent, name, context, attrs,"fonts/yuwei.ttf");
        View view = FontUtils.createPathView(parent, name, context, attrs,path);
        if (view != null) {
            return view;
        }
        return super.onCreateView(parent, name, context, attrs);
    }
}
