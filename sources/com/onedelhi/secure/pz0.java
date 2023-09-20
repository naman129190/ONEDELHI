package com.onedelhi.secure;

public class pz0 {

    /* renamed from: a */
    public static final oz0 f33845a = new C6486a();

    /* renamed from: b */
    public static final oz0 f33846b = new C6487b();

    /* renamed from: c */
    public static final oz0 f33847c = new C6488c();

    /* renamed from: d */
    public static final oz0 f33848d = new C6489d();

    /* renamed from: com.onedelhi.secure.pz0$a */
    public class C6486a implements oz0 {
        /* renamed from: a */
        public sz0 mo42309a(float f, float f2, float f3, float f4) {
            return sz0.m65050a(255, sh4.m64588n(0, 255, f2, f3, f));
        }
    }

    /* renamed from: com.onedelhi.secure.pz0$b */
    public class C6487b implements oz0 {
        /* renamed from: a */
        public sz0 mo42309a(float f, float f2, float f3, float f4) {
            return sz0.m65051b(sh4.m64588n(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: com.onedelhi.secure.pz0$c */
    public class C6488c implements oz0 {
        /* renamed from: a */
        public sz0 mo42309a(float f, float f2, float f3, float f4) {
            return sz0.m65051b(sh4.m64588n(255, 0, f2, f3, f), sh4.m64588n(0, 255, f2, f3, f));
        }
    }

    /* renamed from: com.onedelhi.secure.pz0$d */
    public class C6489d implements oz0 {
        /* renamed from: a */
        public sz0 mo42309a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return sz0.m65051b(sh4.m64588n(255, 0, f2, f5, f), sh4.m64588n(0, 255, f5, f3, f));
        }
    }

    /* renamed from: a */
    public static oz0 m61767a(int i, boolean z) {
        if (i == 0) {
            return z ? f33845a : f33846b;
        }
        if (i == 1) {
            return z ? f33846b : f33845a;
        }
        if (i == 2) {
            return f33847c;
        }
        if (i == 3) {
            return f33848d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i);
    }
}
