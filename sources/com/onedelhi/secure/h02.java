package com.onedelhi.secure;

import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13185a})
public class h02 {

    /* renamed from: a */
    public static final int f12849a = 20;

    /* renamed from: a */
    public static final String f12850a = "LOTTIE";

    /* renamed from: a */
    public static boolean f12851a = false;

    /* renamed from: a */
    public static long[] f12852a = null;

    /* renamed from: a */
    public static String[] f12853a = null;

    /* renamed from: b */
    public static int f12854b = 0;

    /* renamed from: b */
    public static boolean f12855b = false;

    /* renamed from: c */
    public static int f12856c;

    /* renamed from: a */
    public static void m16420a(String str) {
        if (f12855b) {
            int i = f12854b;
            if (i == 20) {
                f12856c++;
                return;
            }
            f12853a[i] = str;
            f12852a[i] = System.nanoTime();
            cg4.m12477b(str);
            f12854b++;
        }
    }

    /* renamed from: b */
    public static float m16421b(String str) {
        int i = f12856c;
        if (i > 0) {
            f12856c = i - 1;
            return 0.0f;
        } else if (!f12855b) {
            return 0.0f;
        } else {
            int i2 = f12854b - 1;
            f12854b = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f12853a[i2])) {
                cg4.m12479d();
                return ((float) (System.nanoTime() - f12852a[f12854b])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f12853a[f12854b] + ".");
            }
        }
    }

    /* renamed from: c */
    public static void m16422c(boolean z) {
        if (f12855b != z) {
            f12855b = z;
            if (z) {
                f12853a = new String[20];
                f12852a = new long[20];
            }
        }
    }
}
