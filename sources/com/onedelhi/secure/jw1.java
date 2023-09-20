package com.onedelhi.secure;

import android.graphics.Color;
import android.graphics.PointF;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class jw1 {

    /* renamed from: a */
    public static final wv1.C3876a f14580a = wv1.C3876a.m31144a("x", "y");

    /* renamed from: com.onedelhi.secure.jw1$a */
    public static /* synthetic */ class C2578a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14581a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.wv1$b[] r0 = com.onedelhi.secure.wv1.C3877b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14581a = r0
                com.onedelhi.secure.wv1$b r1 = com.onedelhi.secure.wv1.C3877b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14581a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wv1$b r1 = com.onedelhi.secure.wv1.C3877b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14581a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.wv1$b r1 = com.onedelhi.secure.wv1.C3877b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jw1.C2578a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static PointF m19221a(wv1 wv1, float f) throws IOException {
        wv1.mo17964b();
        float m = (float) wv1.mo17974m();
        float m2 = (float) wv1.mo17974m();
        while (wv1.mo17955H() != wv1.C3877b.END_ARRAY) {
            wv1.mo17963Y();
        }
        wv1.mo17967d();
        return new PointF(m * f, m2 * f);
    }

    /* renamed from: b */
    public static PointF m19222b(wv1 wv1, float f) throws IOException {
        float m = (float) wv1.mo17974m();
        float m2 = (float) wv1.mo17974m();
        while (wv1.mo17970h()) {
            wv1.mo17963Y();
        }
        return new PointF(m * f, m2 * f);
    }

    /* renamed from: c */
    public static PointF m19223c(wv1 wv1, float f) throws IOException {
        wv1.mo17965c();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f14580a);
            if (M == 0) {
                f2 = m19227g(wv1);
            } else if (M != 1) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                f3 = m19227g(wv1);
            }
        }
        wv1.mo17969g();
        return new PointF(f2 * f, f3 * f);
    }

    @d10
    /* renamed from: d */
    public static int m19224d(wv1 wv1) throws IOException {
        wv1.mo17964b();
        int m = (int) (wv1.mo17974m() * 255.0d);
        int m2 = (int) (wv1.mo17974m() * 255.0d);
        int m3 = (int) (wv1.mo17974m() * 255.0d);
        while (wv1.mo17970h()) {
            wv1.mo17963Y();
        }
        wv1.mo17967d();
        return Color.argb(255, m, m2, m3);
    }

    /* renamed from: e */
    public static PointF m19225e(wv1 wv1, float f) throws IOException {
        int i = C2578a.f14581a[wv1.mo17955H().ordinal()];
        if (i == 1) {
            return m19222b(wv1, f);
        }
        if (i == 2) {
            return m19221a(wv1, f);
        }
        if (i == 3) {
            return m19223c(wv1, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + wv1.mo17955H());
    }

    /* renamed from: f */
    public static List<PointF> m19226f(wv1 wv1, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        wv1.mo17964b();
        while (wv1.mo17955H() == wv1.C3877b.BEGIN_ARRAY) {
            wv1.mo17964b();
            arrayList.add(m19225e(wv1, f));
            wv1.mo17967d();
        }
        wv1.mo17967d();
        return arrayList;
    }

    /* renamed from: g */
    public static float m19227g(wv1 wv1) throws IOException {
        wv1.C3877b H = wv1.mo17955H();
        int i = C2578a.f14581a[H.ordinal()];
        if (i == 1) {
            return (float) wv1.mo17974m();
        }
        if (i == 2) {
            wv1.mo17964b();
            float m = (float) wv1.mo17974m();
            while (wv1.mo17970h()) {
                wv1.mo17963Y();
            }
            wv1.mo17967d();
            return m;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + H);
    }
}
