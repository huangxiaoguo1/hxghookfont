# hxghookfont
插件式插入字体库

### 引入方式

```
allprojects {
    repositories {
            ...
            maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.huangxiaoguo1:hxghookfont:1.0.0'
}
```
### 拦截view

    在onCreate方法的super.onCreate(savedInstanceState);之前

```
 private void beforeContentView() {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        LayoutInflaterCompat.setFactory2(layoutInflater, this);
 }
```

###重写onCreateView

```
   @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View view = FontUtils.createAssetsView(parent, name, context, attrs,"fonts/yuwei.ttf");
//        View view = FontUtils.createPathView(parent, name, context, attrs,path);
        if (view != null) {
            return view;
        }
        return super.onCreateView(parent, name, context, attrs);
    }
```
```
字体库放在assets目录下

View view = FontUtils.createAssetsView(parent, name, context, attrs,"fonts/yuwei.ttf");
```
```
放在手机其他目录中
private String path= Environment.getExternalStorageDirectory().getAbsolutePath()+
            File.separator+"yuehei1.otf";

View view = FontUtils.createPathView(parent, name, context, attrs,path);
```

### 如果放在SD卡中记得权限

```
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>

```

### 分享一个字体库，包含android使用的各种字体

```
https://pan.baidu.com/s/10Lo7-UXK8Par-Ett_sEicQ
```