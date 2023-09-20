package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import com.onedelhi.secure.hl3;

public final class b33 {

    /* renamed from: a */
    public static final int f9629a = 0;

    /* renamed from: b */
    public static final int f9630b = 1000;

    /* renamed from: c */
    public static final int f9631c = 1001;

    /* renamed from: d */
    public static final int f9632d = 1002;

    /* renamed from: e */
    public static final int f9633e = 1003;

    /* renamed from: f */
    public static final int f9634f = 1004;

    /* renamed from: g */
    public static final int f9635g = 1006;

    /* renamed from: h */
    public static final int f9636h = 1007;

    /* renamed from: i */
    public static final int f9637i = 1008;

    /* renamed from: j */
    public static final int f9638j = 1009;

    /* renamed from: k */
    public static final int f9639k = 1010;

    /* renamed from: l */
    public static final int f9640l = 1011;

    /* renamed from: m */
    public static final int f9641m = 1012;

    /* renamed from: n */
    public static final int f9642n = 1013;

    /* renamed from: o */
    public static final int f9643o = 1014;

    /* renamed from: p */
    public static final int f9644p = 1015;

    /* renamed from: q */
    public static final int f9645q = 1016;

    /* renamed from: r */
    public static final int f9646r = 1017;

    /* renamed from: s */
    public static final int f9647s = 1018;

    /* renamed from: t */
    public static final int f9648t = 1019;

    /* renamed from: u */
    public static final int f9649u = 1020;

    /* renamed from: v */
    public static final int f9650v = 1021;

    /* renamed from: w */
    public static final int f9651w = 1000;

    /* renamed from: a */
    public final PointerIcon f9652a;

    @sj3(24)
    /* renamed from: com.onedelhi.secure.b33$a */
    public static class C1745a {
        @pn0
        /* renamed from: a */
        public static PointerIcon m11547a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        @pn0
        /* renamed from: b */
        public static PointerIcon m11548b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        @pn0
        /* renamed from: c */
        public static PointerIcon m11549c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public b33(PointerIcon pointerIcon) {
        this.f9652a = pointerIcon;
    }

    @mr2
    /* renamed from: a */
    public static b33 m11543a(@mr2 Bitmap bitmap, float f, float f2) {
        return Build.VERSION.SDK_INT >= 24 ? new b33(C1745a.m11547a(bitmap, f, f2)) : new b33((PointerIcon) null);
    }

    @mr2
    /* renamed from: c */
    public static b33 m11544c(@mr2 Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new b33(C1745a.m11548b(context, i)) : new b33((PointerIcon) null);
    }

    @mr2
    /* renamed from: d */
    public static b33 m11545d(@mr2 Resources resources, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new b33(C1745a.m11549c(resources, i)) : new b33((PointerIcon) null);
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: b */
    public Object mo13395b() {
        return this.f9652a;
    }
}
