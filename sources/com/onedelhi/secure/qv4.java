package com.onedelhi.secure;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.transition.C1095n;

public class qv4 {

    /* renamed from: a */
    public static final Property<View, Float> f19486a = new C3348a(Float.class, "translationAlpha");

    /* renamed from: a */
    public static final C1095n f19487a;

    /* renamed from: a */
    public static final String f19488a = "ViewUtils";

    /* renamed from: b */
    public static final Property<View, Rect> f19489b = new C3349b(Rect.class, "clipBounds");

    /* renamed from: com.onedelhi.secure.qv4$a */
    public static class C3348a extends Property<View, Float> {
        public C3348a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(qv4.m26198c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            qv4.m26203h(view, f.floatValue());
        }
    }

    /* renamed from: com.onedelhi.secure.qv4$b */
    public static class C3349b extends Property<View, Rect> {
        public C3349b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return jt4.m18898P(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            jt4.m18891M1(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f19487a = i >= 29 ? new wv4() : i >= 23 ? new vv4() : i >= 22 ? new uv4() : new tv4();
    }

    /* renamed from: a */
    public static void m26196a(@mr2 View view) {
        f19487a.mo7058a(view);
    }

    /* renamed from: b */
    public static qu4 m26197b(@mr2 View view) {
        return new ou4(view);
    }

    /* renamed from: c */
    public static float m26198c(@mr2 View view) {
        return f19487a.mo7060c(view);
    }

    /* renamed from: d */
    public static ox4 m26199d(@mr2 View view) {
        return new nx4(view);
    }

    /* renamed from: e */
    public static void m26200e(@mr2 View view) {
        f19487a.mo7061d(view);
    }

    /* renamed from: f */
    public static void m26201f(@mr2 View view, @ts2 Matrix matrix) {
        f19487a.mo7062e(view, matrix);
    }

    /* renamed from: g */
    public static void m26202g(@mr2 View view, int i, int i2, int i3, int i4) {
        f19487a.mo7063f(view, i, i2, i3, i4);
    }

    /* renamed from: h */
    public static void m26203h(@mr2 View view, float f) {
        f19487a.mo7064g(view, f);
    }

    /* renamed from: i */
    public static void m26204i(@mr2 View view, int i) {
        f19487a.mo7065h(view, i);
    }

    /* renamed from: j */
    public static void m26205j(@mr2 View view, @mr2 Matrix matrix) {
        f19487a.mo7066i(view, matrix);
    }

    /* renamed from: k */
    public static void m26206k(@mr2 View view, @mr2 Matrix matrix) {
        f19487a.mo7067j(view, matrix);
    }
}
