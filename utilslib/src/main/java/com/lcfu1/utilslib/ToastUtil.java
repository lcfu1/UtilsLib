package com.lcfu1.utilslib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.CheckResult;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("InflateParams")
public class ToastUtil {
    @ColorInt
    private static int DEFAULT_TEXT_COLOR = Color.WHITE;
    @ColorInt
    private static int SUCCESS_COLOR = Color.GREEN;
    @ColorInt
    private static int ERROR_COLOR = Color.RED;
    @ColorInt
    private static int INFO_COLOR = Color.BLUE;
    @ColorInt
    private static int WARNING_COLOR = Color.YELLOW;
    @ColorInt
    private static int NORMAL_COLOR = Color.parseColor("#c8000000");

    private static final Typeface LOADED_TOAST_TYPEFACE = Typeface.create("sans-serif-condensed", Typeface.NORMAL);
    private static Typeface currentTypeface = LOADED_TOAST_TYPEFACE;
    private static int textSize = 16;

    private static boolean tintIcon = true;
    private static Toast currentToast;

    private ToastUtil() {
        // avoiding instantiation
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @StringRes int message) {
        return success(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence message) {
        return success(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @StringRes int message, boolean withIcon) {
        return success(context, context.getString(message), Toast.LENGTH_SHORT, withIcon);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence message, boolean withIcon) {
        return success(context, message, Toast.LENGTH_SHORT, withIcon);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @StringRes int message, int duration) {
        return success(context, context.getString(message), duration, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return success(context, message, duration, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return custom(context, context.getString(message), Toasty.getDrawable(context, R.drawable.check),
                SUCCESS_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return custom(context, message, Toasty.getDrawable(context, R.drawable.check),
                SUCCESS_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @StringRes int message) {
        return error(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence message) {
        return error(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @StringRes int message, boolean withIcon) {
        return error(context, context.getString(message), Toast.LENGTH_SHORT, withIcon);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence message, boolean withIcon) {
        return error(context, message, Toast.LENGTH_SHORT, withIcon);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @StringRes int message, int duration) {
        return error(context, context.getString(message), duration, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return error(context, message, duration, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return custom(context, context.getString(message), Toasty.getDrawable(context, R.drawable.clear),
                ERROR_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return custom(context, message, Toasty.getDrawable(context, R.drawable.clear),
                ERROR_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @StringRes int message) {
        return info(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence message) {
        return info(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @StringRes int message, boolean withIcon) {
        return info(context, context.getString(message), Toast.LENGTH_SHORT, withIcon);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence message, boolean withIcon) {
        return info(context, message, Toast.LENGTH_SHORT, withIcon);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @StringRes int message, int duration) {
        return info(context, context.getString(message), duration, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return info(context, message, duration, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return custom(context, context.getString(message), Toasty.getDrawable(context, R.drawable.info),
                INFO_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return custom(context, message, Toasty.getDrawable(context, R.drawable.info),
                INFO_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @StringRes int message) {
        return warning(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence message) {
        return warning(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @StringRes int message, boolean withIcon) {
        return warning(context, context.getString(message), Toast.LENGTH_SHORT, withIcon);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence message, boolean withIcon) {
        return warning(context, message, Toast.LENGTH_SHORT, withIcon);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @StringRes int message, int duration) {
        return warning(context, context.getString(message), duration, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return warning(context, message, duration, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return custom(context, context.getString(message), Toasty.getDrawable(context, R.drawable.warning),
                WARNING_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return custom(context, message, Toasty.getDrawable(context, R.drawable.warning),
                WARNING_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message) {
        return normal(context, context.getString(message), Toast.LENGTH_SHORT, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message) {
        return normal(context, message, Toast.LENGTH_SHORT, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, Drawable icon) {
        return normal(context, context.getString(message), Toast.LENGTH_SHORT, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, Drawable icon) {
        return normal(context, message, Toast.LENGTH_SHORT, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration) {
        return normal(context, context.getString(message), duration, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return normal(context, message, duration, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration,
                               Drawable icon) {
        return normal(context, context.getString(message), duration, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration,
                               Drawable icon) {
        return normal(context, message, duration, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration,
                               @DrawableRes int iconRes) {
        return normal(context, context.getString(message), duration, iconRes, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration,
                               @DrawableRes int iconRes) {
        return normal(context, message, duration, iconRes, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration,
                               @DrawableRes int iconRes, boolean withIcon) {
        return custom(context, context.getString(message), iconRes, NORMAL_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration,
                               @DrawableRes int iconRes, boolean withIcon) {
        return custom(context, message, iconRes, NORMAL_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration,
                               Drawable icon, boolean withIcon) {
        return custom(context, context.getString(message), icon, NORMAL_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration,
                               Drawable icon, boolean withIcon) {
        return custom(context, message, icon, NORMAL_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @StringRes int message, Drawable icon,
                               int duration, boolean withIcon) {
        return custom(context, context.getString(message), icon, -1, duration, withIcon, false);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @NonNull CharSequence message, Drawable icon,
                               int duration, boolean withIcon) {
        return custom(context, message, icon, -1, duration, withIcon, false);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @StringRes int message,  @DrawableRes int iconRes,
                               int duration, boolean withIcon) {
        return custom(context, context.getString(message), iconRes, -1, duration, withIcon, false);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @NonNull CharSequence message,  @DrawableRes int iconRes,
                               int duration, boolean withIcon) {
        return custom(context, message, iconRes, -1, duration, withIcon, false);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @StringRes int message, @DrawableRes int iconRes,
                               @ColorInt int tintColor, int duration,
                               boolean withIcon, boolean shouldTint) {
        return custom(context, context.getString(message), Toasty.getDrawable(context, iconRes),
                tintColor, duration, withIcon, shouldTint);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @NonNull CharSequence message, @DrawableRes int iconRes,
                               @ColorInt int tintColor, int duration,
                               boolean withIcon, boolean shouldTint) {
        return custom(context, message, Toasty.getDrawable(context, iconRes),
                tintColor, duration, withIcon, shouldTint);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @StringRes int message, Drawable icon,
                               @ColorInt int tintColor, int duration,
                               boolean withIcon, boolean shouldTint) {
        return custom(context, context.getString(message), icon, tintColor, duration,
                withIcon, shouldTint);
    }

    @SuppressLint("ShowToast")
    @CheckResult
    public static Toast custom(@NonNull Context context, @NonNull CharSequence message, Drawable icon,
                               @ColorInt int tintColor, int duration,
                               boolean withIcon, boolean shouldTint) {
        //currentToast = Toast.makeText(context, "", duration);
        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.toast_layout, null);
        final ImageView toastIcon = toastLayout.findViewById(R.id.toast_icon);
        final TextView toastText = toastLayout.findViewById(R.id.toast_text);
        Drawable drawableFrame;

        if (shouldTint) {
            drawableFrame = Toasty.DrawableFrame(context, tintColor);
        } else {
            drawableFrame = Toasty.getDrawable(context, R.drawable.background);
        }
        Toasty.setBackground(toastLayout, drawableFrame);

        if (withIcon) {
            if (icon == null)
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            if (tintIcon)
                icon = Toasty.tintIcon(icon, DEFAULT_TEXT_COLOR);
            Toasty.setBackground(toastIcon, icon);
        } else {
            toastIcon.setVisibility(View.GONE);
        }

        toastText.setText(message);
        toastText.setTextColor(DEFAULT_TEXT_COLOR);
        toastText.setTypeface(currentTypeface);
        toastText.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);

        if (currentToast == null) {
            currentToast = Toast.makeText(context, "", duration);
        } else {
            toastText.setText(message);
        }
        currentToast.setView(toastLayout);
        return currentToast;
    }

    public static class Config {
        @ColorInt
        private int DEFAULT_TEXT_COLOR = ToastUtil.DEFAULT_TEXT_COLOR;
        @ColorInt
        private int ERROR_COLOR = ToastUtil.ERROR_COLOR;
        @ColorInt
        private int INFO_COLOR = ToastUtil.INFO_COLOR;
        @ColorInt
        private int SUCCESS_COLOR = ToastUtil.SUCCESS_COLOR;
        @ColorInt
        private int WARNING_COLOR = ToastUtil.WARNING_COLOR;

        private Typeface typeface = ToastUtil.currentTypeface;
        private int textSize = ToastUtil.textSize;
        private boolean tintIcon = ToastUtil.tintIcon;

        private Config() {
            // avoiding instantiation
        }

        @CheckResult
        public static Config getInstance() {
            return new Config();
        }

        public static void reset() {
            ToastUtil.DEFAULT_TEXT_COLOR = Color.WHITE;
            ToastUtil.SUCCESS_COLOR = Color.GREEN;
            ToastUtil.ERROR_COLOR = Color.RED;
            ToastUtil.INFO_COLOR = Color.BLUE;
            ToastUtil.WARNING_COLOR = Color.YELLOW;
            ToastUtil.NORMAL_COLOR = Color.parseColor("#c8000000");
            ToastUtil.currentTypeface = LOADED_TOAST_TYPEFACE;
            ToastUtil.textSize = 16;
            ToastUtil.tintIcon = true;
        }

        @CheckResult
        public Config setTextColor(@ColorInt int textColor) {
            DEFAULT_TEXT_COLOR = textColor;
            return this;
        }

        @CheckResult
        public Config setErrorColor(@ColorInt int errorColor) {
            ERROR_COLOR = errorColor;
            return this;
        }

        @CheckResult
        public Config setInfoColor(@ColorInt int infoColor) {
            INFO_COLOR = infoColor;
            return this;
        }

        @CheckResult
        public Config setSuccessColor(@ColorInt int successColor) {
            SUCCESS_COLOR = successColor;
            return this;
        }

        @CheckResult
        public Config setWarningColor(@ColorInt int warningColor) {
            WARNING_COLOR = warningColor;
            return this;
        }

        @CheckResult
        public Config setToastTypeface(@NonNull Typeface typeface) {
            this.typeface = typeface;
            return this;
        }

        @CheckResult
        public Config setTextSize(int sizeInSp) {
            this.textSize = sizeInSp;
            return this;
        }

        @CheckResult
        public Config tintIcon(boolean tintIcon) {
            this.tintIcon = tintIcon;
            return this;
        }

        public void apply() {
            ToastUtil.DEFAULT_TEXT_COLOR = DEFAULT_TEXT_COLOR;
            ToastUtil.ERROR_COLOR = ERROR_COLOR;
            ToastUtil.INFO_COLOR = INFO_COLOR;
            ToastUtil.SUCCESS_COLOR = SUCCESS_COLOR;
            ToastUtil.WARNING_COLOR = WARNING_COLOR;
            ToastUtil.currentTypeface = typeface;
            ToastUtil.textSize = textSize;
            ToastUtil.tintIcon = tintIcon;
        }
    }
}
