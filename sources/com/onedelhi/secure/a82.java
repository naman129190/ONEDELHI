package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a82 {

    /* renamed from: c */
    public static final int f8876c = 100;

    /* renamed from: d */
    public static final int f8877d = 102;

    /* renamed from: e */
    public static final int f8878e = 104;

    /* renamed from: e */
    public static final long f8879e = Long.MAX_VALUE;

    /* renamed from: f */
    public static final long f8880f = -1;

    /* renamed from: a */
    public final float f8881a;

    /* renamed from: a */
    public final int f8882a;

    /* renamed from: a */
    public final long f8883a;

    /* renamed from: b */
    public final int f8884b;

    /* renamed from: b */
    public final long f8885b;

    /* renamed from: c */
    public final long f8886c;

    /* renamed from: d */
    public final long f8887d;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.a82$a */
    public static class C1666a {

        /* renamed from: a */
        public static Class<?> f8888a;

        /* renamed from: a */
        public static Method f8889a;

        /* renamed from: b */
        public static Method f8890b;

        /* renamed from: c */
        public static Method f8891c;

        /* renamed from: d */
        public static Method f8892d;

        /* renamed from: e */
        public static Method f8893e;

        /* renamed from: a */
        public static Object m10920a(a82 a82, String str) {
            try {
                if (f8888a == null) {
                    f8888a = Class.forName("android.location.LocationRequest");
                }
                if (f8889a == null) {
                    Method declaredMethod = f8888a.getDeclaredMethod("createFromDeprecatedProvider", new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE});
                    f8889a = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f8889a.invoke((Object) null, new Object[]{str, Long.valueOf(a82.mo12824b()), Float.valueOf(a82.mo12827e()), Boolean.FALSE});
                if (invoke == null) {
                    return null;
                }
                if (f8890b == null) {
                    Method declaredMethod2 = f8888a.getDeclaredMethod("setQuality", new Class[]{Integer.TYPE});
                    f8890b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f8890b.invoke(invoke, new Object[]{Integer.valueOf(a82.mo12830g())});
                if (f8891c == null) {
                    Method declaredMethod3 = f8888a.getDeclaredMethod("setFastestInterval", new Class[]{Long.TYPE});
                    f8891c = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f8891c.invoke(invoke, new Object[]{Long.valueOf(a82.mo12829f())});
                if (a82.mo12826d() < Integer.MAX_VALUE) {
                    if (f8892d == null) {
                        Method declaredMethod4 = f8888a.getDeclaredMethod("setNumUpdates", new Class[]{Integer.TYPE});
                        f8892d = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f8892d.invoke(invoke, new Object[]{Integer.valueOf(a82.mo12826d())});
                }
                if (a82.mo12823a() < Long.MAX_VALUE) {
                    if (f8893e == null) {
                        Method declaredMethod5 = f8888a.getDeclaredMethod("setExpireIn", new Class[]{Long.TYPE});
                        f8893e = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f8893e.invoke(invoke, new Object[]{Long.valueOf(a82.mo12823a())});
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    @sj3(31)
    /* renamed from: com.onedelhi.secure.a82$b */
    public static class C1667b {
        @pn0
        /* renamed from: a */
        public static LocationRequest m10921a(a82 a82) {
            return new LocationRequest.Builder(a82.mo12824b()).setQuality(a82.mo12830g()).setMinUpdateIntervalMillis(a82.mo12829f()).setDurationMillis(a82.mo12823a()).setMaxUpdates(a82.mo12826d()).setMinUpdateDistanceMeters(a82.mo12827e()).setMaxUpdateDelayMillis(a82.mo12825c()).build();
        }
    }

    /* renamed from: com.onedelhi.secure.a82$c */
    public static final class C1668c {

        /* renamed from: a */
        public float f8894a;

        /* renamed from: a */
        public int f8895a;

        /* renamed from: a */
        public long f8896a;

        /* renamed from: b */
        public int f8897b;

        /* renamed from: b */
        public long f8898b;

        /* renamed from: c */
        public long f8899c;

        /* renamed from: d */
        public long f8900d;

        public C1668c(long j) {
            mo12838d(j);
            this.f8895a = 102;
            this.f8898b = Long.MAX_VALUE;
            this.f8897b = Integer.MAX_VALUE;
            this.f8899c = -1;
            this.f8894a = 0.0f;
            this.f8900d = 0;
        }

        public C1668c(@mr2 a82 a82) {
            this.f8896a = a82.f8883a;
            this.f8895a = a82.f8882a;
            this.f8898b = a82.f8886c;
            this.f8897b = a82.f8884b;
            this.f8899c = a82.f8885b;
            this.f8894a = a82.f8881a;
            this.f8900d = a82.f8887d;
        }

        @mr2
        /* renamed from: a */
        public a82 mo12835a() {
            k43.m19458o((this.f8896a == Long.MAX_VALUE && this.f8899c == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j = this.f8896a;
            return new a82(j, this.f8895a, this.f8898b, this.f8897b, Math.min(this.f8899c, j), this.f8894a, this.f8900d);
        }

        @mr2
        /* renamed from: b */
        public C1668c mo12836b() {
            this.f8899c = -1;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C1668c mo12837c(@js1(from = 1) long j) {
            this.f8898b = k43.m19451h(j, 1, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @mr2
        /* renamed from: d */
        public C1668c mo12838d(@js1(from = 0) long j) {
            this.f8896a = k43.m19451h(j, 0, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @mr2
        /* renamed from: e */
        public C1668c mo12839e(@js1(from = 0) long j) {
            this.f8900d = j;
            this.f8900d = k43.m19451h(j, 0, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @mr2
        /* renamed from: f */
        public C1668c mo12840f(@js1(from = 1, mo18580to = 2147483647L) int i) {
            this.f8897b = k43.m19450g(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @mr2
        /* renamed from: g */
        public C1668c mo12841g(@d81(from = 0.0d, mo14561to = 3.4028234663852886E38d) float f) {
            this.f8894a = f;
            this.f8894a = k43.m19449f(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1668c mo12842h(@js1(from = 0) long j) {
            this.f8899c = k43.m19451h(j, 0, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @mr2
        /* renamed from: i */
        public C1668c mo12843i(int i) {
            k43.m19446c(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.f8895a = i;
            return this;
        }
    }

    @hl3({hl3.C2354a.f13185a})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.a82$d */
    public @interface C1669d {
    }

    public a82(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.f8883a = j;
        this.f8882a = i;
        this.f8885b = j3;
        this.f8886c = j2;
        this.f8884b = i2;
        this.f8881a = f;
        this.f8887d = j4;
    }

    @js1(from = 1)
    /* renamed from: a */
    public long mo12823a() {
        return this.f8886c;
    }

    @js1(from = 0)
    /* renamed from: b */
    public long mo12824b() {
        return this.f8883a;
    }

    @js1(from = 0)
    /* renamed from: c */
    public long mo12825c() {
        return this.f8887d;
    }

    @js1(from = 1, mo18580to = 2147483647L)
    /* renamed from: d */
    public int mo12826d() {
        return this.f8884b;
    }

    @d81(from = 0.0d, mo14561to = 3.4028234663852886E38d)
    /* renamed from: e */
    public float mo12827e() {
        return this.f8881a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a82)) {
            return false;
        }
        a82 a82 = (a82) obj;
        return this.f8882a == a82.f8882a && this.f8883a == a82.f8883a && this.f8885b == a82.f8885b && this.f8886c == a82.f8886c && this.f8884b == a82.f8884b && Float.compare(a82.f8881a, this.f8881a) == 0 && this.f8887d == a82.f8887d;
    }

    @js1(from = 0)
    /* renamed from: f */
    public long mo12829f() {
        long j = this.f8885b;
        return j == -1 ? this.f8883a : j;
    }

    /* renamed from: g */
    public int mo12830g() {
        return this.f8882a;
    }

    @mr2
    @sj3(31)
    /* renamed from: h */
    public LocationRequest mo12831h() {
        return C1667b.m10921a(this);
    }

    public int hashCode() {
        long j = this.f8883a;
        long j2 = this.f8885b;
        return (((this.f8882a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @sj3(19)
    @SuppressLint({"NewApi"})
    @ts2
    /* renamed from: i */
    public LocationRequest mo12833i(@mr2 String str) {
        return Build.VERSION.SDK_INT >= 31 ? mo12831h() : (LocationRequest) C1666a.m10920a(this, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    @com.onedelhi.secure.mr2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Request["
            r0.append(r1)
            long r1 = r6.f8883a
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0037
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r6.f8883a
            com.onedelhi.secure.ge4.m15799e(r1, r0)
            int r1 = r6.f8882a
            r2 = 100
            if (r1 == r2) goto L_0x0034
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0031
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L_0x002e
            goto L_0x003c
        L_0x002e:
            java.lang.String r1 = " LOW_POWER"
            goto L_0x0039
        L_0x0031:
            java.lang.String r1 = " BALANCED"
            goto L_0x0039
        L_0x0034:
            java.lang.String r1 = " HIGH_ACCURACY"
            goto L_0x0039
        L_0x0037:
            java.lang.String r1 = "PASSIVE"
        L_0x0039:
            r0.append(r1)
        L_0x003c:
            long r1 = r6.f8886c
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x004c
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r6.f8886c
            com.onedelhi.secure.ge4.m15799e(r1, r0)
        L_0x004c:
            int r1 = r6.f8884b
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L_0x005d
            java.lang.String r1 = ", maxUpdates="
            r0.append(r1)
            int r1 = r6.f8884b
            r0.append(r1)
        L_0x005d:
            long r1 = r6.f8885b
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0075
            long r3 = r6.f8883a
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0075
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r6.f8885b
            com.onedelhi.secure.ge4.m15799e(r1, r0)
        L_0x0075:
            float r1 = r6.f8881a
            double r1 = (double) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0088
            java.lang.String r1 = ", minUpdateDistance="
            r0.append(r1)
            float r1 = r6.f8881a
            r0.append(r1)
        L_0x0088:
            long r1 = r6.f8887d
            r3 = 2
            long r1 = r1 / r3
            long r3 = r6.f8883a
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x009d
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r6.f8887d
            com.onedelhi.secure.ge4.m15799e(r1, r0)
        L_0x009d:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.a82.toString():java.lang.String");
    }
}
