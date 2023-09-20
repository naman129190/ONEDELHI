package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.text.Editable;

public final class ts0 extends Editable.Factory {
    @mj1("INSTANCE_LOCK")

    /* renamed from: a */
    public static volatile Editable.Factory f21118a;
    @ts2

    /* renamed from: a */
    public static Class<?> f21119a;

    /* renamed from: a */
    public static final Object f21120a = new Object();

    @SuppressLint({"PrivateApi"})
    public ts0() {
        try {
            f21119a = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ts0.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f21118a == null) {
            synchronized (f21120a) {
                if (f21118a == null) {
                    f21118a = new ts0();
                }
            }
        }
        return f21118a;
    }

    public Editable newEditable(@mr2 CharSequence charSequence) {
        Class<?> cls = f21119a;
        return cls != null ? g14.m15436c(cls, charSequence) : super.newEditable(charSequence);
    }
}
