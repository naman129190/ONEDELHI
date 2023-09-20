package com.onedelhi.secure;

@sj3(21)
public class qz0 {

    /* renamed from: a */
    public static final nz0 f34400a = new C6623a();

    /* renamed from: b */
    public static final nz0 f34401b = new C6624b();

    /* renamed from: c */
    public static final nz0 f34402c = new C6625c();

    /* renamed from: d */
    public static final nz0 f34403d = new C6626d();

    /* renamed from: com.onedelhi.secure.qz0$a */
    public class C6623a implements nz0 {
        /* renamed from: a */
        public rz0 mo41499a(float f, float f2, float f3, float f4) {
            return rz0.m64022a(255, rh4.m63623n(0, 255, f2, f3, f));
        }
    }

    /* renamed from: com.onedelhi.secure.qz0$b */
    public class C6624b implements nz0 {
        /* renamed from: a */
        public rz0 mo41499a(float f, float f2, float f3, float f4) {
            return rz0.m64023b(rh4.m63623n(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: com.onedelhi.secure.qz0$c */
    public class C6625c implements nz0 {
        /* renamed from: a */
        public rz0 mo41499a(float f, float f2, float f3, float f4) {
            return rz0.m64023b(rh4.m63623n(255, 0, f2, f3, f), rh4.m63623n(0, 255, f2, f3, f));
        }
    }

    /* renamed from: com.onedelhi.secure.qz0$d */
    public class C6626d implements nz0 {
        /* renamed from: a */
        public rz0 mo41499a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return rz0.m64023b(rh4.m63623n(255, 0, f2, f5, f), rh4.m63623n(0, 255, f5, f3, f));
        }
    }

    /* renamed from: a */
    public static nz0 m63277a(int i, boolean z) {
        if (i == 0) {
            return z ? f34400a : f34401b;
        }
        if (i == 1) {
            return z ? f34401b : f34400a;
        }
        if (i == 2) {
            return f34402c;
        }
        if (i == 3) {
            return f34403d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i);
    }
}
