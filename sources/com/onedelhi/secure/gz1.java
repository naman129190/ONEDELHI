package com.onedelhi.secure;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.lang.ref.WeakReference;

public class gz1 {

    /* renamed from: a */
    public static final float f12844a = 100.0f;

    /* renamed from: a */
    public static final Interpolator f12845a = new LinearInterpolator();

    /* renamed from: a */
    public static k14<WeakReference<Interpolator>> f12846a;

    /* renamed from: a */
    public static wv1.C3876a f12847a = wv1.C3876a.m31144a("t", "s", "e", "o", "i", "h", "to", "ti");

    @ts2
    /* renamed from: a */
    public static WeakReference<Interpolator> m16407a(int i) {
        WeakReference<Interpolator> h;
        synchronized (gz1.class) {
            h = m16411e().mo18849h(i);
        }
        return h;
    }

    /* renamed from: b */
    public static <T> ez1<T> m16408b(wv1 wv1, la2 la2, float f, is4<T> is4, boolean z) throws IOException {
        return z ? m16409c(la2, wv1, f, is4) : m16410d(wv1, f, is4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.view.animation.Interpolator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.onedelhi.secure.ez1<T> m16409c(com.onedelhi.secure.la2 r16, com.onedelhi.secure.wv1 r17, float r18, com.onedelhi.secure.is4<T> r19) throws java.io.IOException {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r17.mo17965c()
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r14 = r10
            r15 = r14
            r6 = 0
            r13 = 0
        L_0x0014:
            boolean r11 = r17.mo17970h()
            if (r11 == 0) goto L_0x0056
            com.onedelhi.secure.wv1$a r11 = f12847a
            int r11 = r0.mo17956M(r11)
            switch(r11) {
                case 0: goto L_0x0050;
                case 1: goto L_0x004b;
                case 2: goto L_0x0046;
                case 3: goto L_0x0041;
                case 4: goto L_0x003c;
                case 5: goto L_0x0031;
                case 6: goto L_0x002c;
                case 7: goto L_0x0027;
                default: goto L_0x0023;
            }
        L_0x0023:
            r17.mo17963Y()
            goto L_0x0014
        L_0x0027:
            android.graphics.PointF r14 = com.onedelhi.secure.jw1.m19225e(r17, r18)
            goto L_0x0014
        L_0x002c:
            android.graphics.PointF r15 = com.onedelhi.secure.jw1.m19225e(r17, r18)
            goto L_0x0014
        L_0x0031:
            int r6 = r17.mo17976p()
            r11 = 1
            if (r6 != r11) goto L_0x003a
            r6 = 1
            goto L_0x0014
        L_0x003a:
            r6 = 0
            goto L_0x0014
        L_0x003c:
            android.graphics.PointF r8 = com.onedelhi.secure.jw1.m19225e(r17, r18)
            goto L_0x0014
        L_0x0041:
            android.graphics.PointF r7 = com.onedelhi.secure.jw1.m19225e(r17, r18)
            goto L_0x0014
        L_0x0046:
            java.lang.Object r9 = r2.mo13530a(r0, r1)
            goto L_0x0014
        L_0x004b:
            java.lang.Object r10 = r2.mo13530a(r0, r1)
            goto L_0x0014
        L_0x0050:
            double r11 = r17.mo17974m()
            float r13 = (float) r11
            goto L_0x0014
        L_0x0056:
            r17.mo17969g()
            if (r6 == 0) goto L_0x0061
            android.view.animation.Interpolator r0 = f12845a
            r12 = r0
            r11 = r10
            goto L_0x00fa
        L_0x0061:
            if (r7 == 0) goto L_0x00f6
            if (r8 == 0) goto L_0x00f6
            float r0 = r7.x
            float r2 = -r1
            float r0 = com.onedelhi.secure.hj2.m16787b(r0, r2, r1)
            r7.x = r0
            float r0 = r7.y
            r3 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r6 = 1120403456(0x42c80000, float:100.0)
            float r0 = com.onedelhi.secure.hj2.m16787b(r0, r3, r6)
            r7.y = r0
            float r0 = r8.x
            float r0 = com.onedelhi.secure.hj2.m16787b(r0, r2, r1)
            r8.x = r0
            float r0 = r8.y
            float r0 = com.onedelhi.secure.hj2.m16787b(r0, r3, r6)
            r8.y = r0
            float r2 = r7.x
            float r3 = r7.y
            float r6 = r8.x
            int r2 = com.onedelhi.secure.yq4.m32606i(r2, r3, r6, r0)
            java.lang.ref.WeakReference r0 = m16407a(r2)
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r3 = r0.get()
            r5 = r3
            android.view.animation.Interpolator r5 = (android.view.animation.Interpolator) r5
        L_0x00a1:
            if (r0 == 0) goto L_0x00a5
            if (r5 != 0) goto L_0x00f4
        L_0x00a5:
            float r0 = r7.x
            float r0 = r0 / r1
            r7.x = r0
            float r0 = r7.y
            float r0 = r0 / r1
            r7.y = r0
            float r0 = r8.x
            float r0 = r0 / r1
            r8.x = r0
            float r3 = r8.y
            float r3 = r3 / r1
            r8.y = r3
            float r1 = r7.x     // Catch:{ IllegalArgumentException -> 0x00c2 }
            float r5 = r7.y     // Catch:{ IllegalArgumentException -> 0x00c2 }
            android.view.animation.Interpolator r0 = com.onedelhi.secure.rz2.m27163b(r1, r5, r0, r3)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            goto L_0x00eb
        L_0x00c2:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "The Path cannot loop back on itself."
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e6
            float r0 = r7.x
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r1)
            float r1 = r7.y
            float r3 = r8.x
            float r3 = java.lang.Math.max(r3, r4)
            float r4 = r8.y
            android.view.animation.Interpolator r0 = com.onedelhi.secure.rz2.m27163b(r0, r1, r3, r4)
            goto L_0x00eb
        L_0x00e6:
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
        L_0x00eb:
            r5 = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00f4 }
            r0.<init>(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00f4 }
            m16412f(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00f4 }
        L_0x00f4:
            r12 = r5
            goto L_0x00f9
        L_0x00f6:
            android.view.animation.Interpolator r0 = f12845a
            r12 = r0
        L_0x00f9:
            r11 = r9
        L_0x00fa:
            com.onedelhi.secure.ez1 r0 = new com.onedelhi.secure.ez1
            r1 = 0
            r8 = r0
            r9 = r16
            r5 = r14
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.f11771a = r15
            r0.f11778b = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gz1.m16409c(com.onedelhi.secure.la2, com.onedelhi.secure.wv1, float, com.onedelhi.secure.is4):com.onedelhi.secure.ez1");
    }

    /* renamed from: d */
    public static <T> ez1<T> m16410d(wv1 wv1, float f, is4<T> is4) throws IOException {
        return new ez1<>(is4.mo13530a(wv1, f));
    }

    /* renamed from: e */
    public static k14<WeakReference<Interpolator>> m16411e() {
        if (f12846a == null) {
            f12846a = new k14<>();
        }
        return f12846a;
    }

    /* renamed from: f */
    public static void m16412f(int i, WeakReference<Interpolator> weakReference) {
        synchronized (gz1.class) {
            f12846a.mo18855n(i, weakReference);
        }
    }
}
