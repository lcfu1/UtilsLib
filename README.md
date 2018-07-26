# UtilsLib

目录：

- [设置](#设置)
- [ToastUtil](#toastutil)
- [LogUtil](#logutil)
- [Sample](#sample)
- [参考](#参考)

封装给自己使用的一些Util。

## 设置

在根目录下的`build.gradle` 文件中加上:

```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

添加以下依赖：

```
dependencies {
	...
	implementation 'com.github.lcfu1:UtilsLib:1.0.0'
}
```

## ToastUtil

使用如下：

```
//success Toast
ToastUtil.success(this, "success!").show();
//error Toast
ToastUtil.error(this, "error!").show();
//info Toast
ToastUtil.info(this, "info!").show();
//warning Toast
ToastUtil.warning(this, "warning!").show();
//normal Toast
ToastUtil.normal(this, "normal!", 0, R.drawable.check).show();
//custom Toast
ToastUtil.custom(this, "custom!", R.drawable.check, Color.RED, 1000, true,true).show();
```

可以自定义配置，如下：

```
ToastUtil.Config.getInstance()
	.setSuccessColor(Color.parseColor("#FFAA91"))
	.setErrorColor(Color.parseColor("#FF545D"))
	.setInfoColor(Color.parseColor("#B99FFF"))
	.setWarningColor(Color.parseColor("#FEFF82"))
	.setTextColor(Color.parseColor("#4CFF79"))//设置文本的颜色
	.tintIcon(true)//设置Icon是否与文本颜色一致
	.setToastTypeface(Typeface.DEFAULT)//设置文本的字体样式
	.setTextSize(18)//设置文本的字体大小
	.apply();
```

想要恢复默认配置，可使用以下方法：

```
ToastUtil.Config.reset();//重置配置
```

## LogUtil

使用如下：

```
//verbose Log
LogUtil.v("------v-----","verbose");
//debug Log
LogUtil.d("------d-----","debug");
//info Log
LogUtil.i("------i-----","info");
//warn Log
LogUtil.w("------w-----","warn");
//error Log
LogUtil.e("------e-----","error");
```

如果不想执行文件中打印日志的代码时，可在打印前使用以下方法：

```
//屏蔽日志
LogUtil.close();
```

## Sample

使用可参考[sample](https://github.com/lcfu1/UtilsLib/tree/master/sample)。

效果：

**ToastUtil**

![ToastUtil](https://raw.githubusercontent.com/lcfu1/UtilsLib/master/images/ToastUtil.gif)

**LogUtil**

![LogUtil](https://raw.githubusercontent.com/lcfu1/UtilsLib/master/images/LogUtil.PNG)

## 参考

- [Toasty](https://github.com/GrenderG/Toasty)：The usual Toast, but with steroids 💪 。
- 第一行代码：定制自己的日志工具

