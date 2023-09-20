package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class oq4 {

    /* renamed from: a */
    public static final int f18073a = 31;
    @ts2

    /* renamed from: a */
    public static volatile Handler f18074a = null;

    /* renamed from: a */
    public static final char[] f18075a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final int f18076b = 17;

    /* renamed from: b */
    public static final char[] f18077b = new char[64];

    /* renamed from: com.onedelhi.secure.oq4$a */
    public static /* synthetic */ class C3085a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18078a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18078a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18078a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18078a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18078a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18078a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.oq4.C3085a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m24013a() {
        if (!m24032t()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m24014b() {
        if (!m24033u()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static boolean m24015c(@ts2 Object obj, @ts2 Object obj2) {
        return obj == null ? obj2 == null : obj instanceof pj2 ? ((pj2) obj).mo22465a(obj2) : obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m24016d(@ts2 Object obj, @ts2 Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @mr2
    /* renamed from: e */
    public static String m24017e(@mr2 byte[] bArr, @mr2 char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f18075a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @mr2
    /* renamed from: f */
    public static <T> Queue<T> m24018f(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: g */
    public static int m24019g(int i, int i2, @ts2 Bitmap.Config config) {
        return i * i2 * m24021i(config);
    }

    @TargetApi(19)
    /* renamed from: h */
    public static int m24020h(@mr2 Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    /* renamed from: i */
    public static int m24021i(@ts2 Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C3085a.f18078a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    @Deprecated
    /* renamed from: j */
    public static int m24022j(@mr2 Bitmap bitmap) {
        return m24020h(bitmap);
    }

    @mr2
    /* renamed from: k */
    public static <T> List<T> m24023k(@mr2 Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public static Handler m24024l() {
        if (f18074a == null) {
            synchronized (oq4.class) {
                if (f18074a == null) {
                    f18074a = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f18074a;
    }

    /* renamed from: m */
    public static int m24025m(float f) {
        return m24026n(f, 17);
    }

    /* renamed from: n */
    public static int m24026n(float f, int i) {
        return m24028p(Float.floatToIntBits(f), i);
    }

    /* renamed from: o */
    public static int m24027o(int i) {
        return m24028p(i, 17);
    }

    /* renamed from: p */
    public static int m24028p(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: q */
    public static int m24029q(@ts2 Object obj, int i) {
        return m24028p(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: r */
    public static int m24030r(boolean z) {
        return m24031s(z, 17);
    }

    /* renamed from: s */
    public static int m24031s(boolean z, int i) {
        return m24028p(z ? 1 : 0, i);
    }

    /* renamed from: t */
    public static boolean m24032t() {
        return !m24033u();
    }

    /* renamed from: u */
    public static boolean m24033u() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: v */
    public static boolean m24034v(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: w */
    public static boolean m24035w(int i, int i2) {
        return m24034v(i) && m24034v(i2);
    }

    /* renamed from: x */
    public static void m24036x(Runnable runnable) {
        m24024l().post(runnable);
    }

    /* renamed from: y */
    public static void m24037y(Runnable runnable) {
        m24024l().removeCallbacks(runnable);
    }

    @mr2
    /* renamed from: z */
    public static String m24038z(@mr2 byte[] bArr) {
        String e;
        char[] cArr = f18077b;
        synchronized (cArr) {
            e = m24017e(bArr, cArr);
        }
        return e;
    }
}
