package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class ap0 {

    /* renamed from: a */
    public static volatile boolean f9431a = true;

    /* renamed from: a */
    public static Drawable m11352a(Context context, @dp0 int i, @ts2 Resources.Theme theme) {
        return m11354c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m11353b(Context context, Context context2, @dp0 int i) {
        return m11354c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    public static Drawable m11354c(Context context, Context context2, @dp0 int i, @ts2 Resources.Theme theme) {
        try {
            if (f9431a) {
                return m11356e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f9431a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return r70.m26356i(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m11355d(context2, i, theme);
    }

    /* renamed from: d */
    public static Drawable m11355d(Context context, @dp0 int i, @ts2 Resources.Theme theme) {
        return zk3.m33204g(context.getResources(), i, theme);
    }

    /* renamed from: e */
    public static Drawable m11356e(Context context, @dp0 int i, @ts2 Resources.Theme theme) {
        if (theme != null) {
            context = new z70(context, theme);
        }
        return C3129p8.m24529b(context, i);
    }
}
