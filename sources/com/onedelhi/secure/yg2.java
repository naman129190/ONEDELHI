package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.appcompat.widget.C0358b;

public final class yg2 {

    /* renamed from: a */
    public static final String f23087a = "MemorySizeCalculator";
    @hw4

    /* renamed from: d */
    public static final int f23088d = 4;

    /* renamed from: e */
    public static final int f23089e = 2;

    /* renamed from: a */
    public final int f23090a;

    /* renamed from: a */
    public final Context f23091a;

    /* renamed from: b */
    public final int f23092b;

    /* renamed from: c */
    public final int f23093c;

    /* renamed from: com.onedelhi.secure.yg2$a */
    public static final class C4000a {
        @hw4

        /* renamed from: b */
        public static final int f23094b = 2;

        /* renamed from: c */
        public static final int f23095c = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: d */
        public static final int f23096d = 4194304;

        /* renamed from: e */
        public static final float f23097e = 0.4f;

        /* renamed from: f */
        public static final float f23098f = 0.33f;

        /* renamed from: a */
        public float f23099a = 2.0f;

        /* renamed from: a */
        public int f23100a = 4194304;

        /* renamed from: a */
        public ActivityManager f23101a;

        /* renamed from: a */
        public final Context f23102a;

        /* renamed from: a */
        public C4002c f23103a;

        /* renamed from: b */
        public float f23104b = ((float) f23095c);

        /* renamed from: c */
        public float f23105c = 0.4f;

        /* renamed from: d */
        public float f23106d = 0.33f;

        public C4000a(Context context) {
            this.f23102a = context;
            this.f23101a = (ActivityManager) context.getSystemService(C0358b.f1779e);
            this.f23103a = new C4001b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && yg2.m32356e(this.f23101a)) {
                this.f23104b = 0.0f;
            }
        }

        /* renamed from: a */
        public yg2 mo27480a() {
            return new yg2(this);
        }

        @hw4
        /* renamed from: b */
        public C4000a mo27481b(ActivityManager activityManager) {
            this.f23101a = activityManager;
            return this;
        }

        /* renamed from: c */
        public C4000a mo27482c(int i) {
            this.f23100a = i;
            return this;
        }

        /* renamed from: d */
        public C4000a mo27483d(float f) {
            g43.m15506a(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f23104b = f;
            return this;
        }

        /* renamed from: e */
        public C4000a mo27484e(float f) {
            g43.m15506a(f >= 0.0f && f <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f23106d = f;
            return this;
        }

        /* renamed from: f */
        public C4000a mo27485f(float f) {
            g43.m15506a(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f23105c = f;
            return this;
        }

        /* renamed from: g */
        public C4000a mo27486g(float f) {
            g43.m15506a(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.f23099a = f;
            return this;
        }

        @hw4
        /* renamed from: h */
        public C4000a mo27487h(C4002c cVar) {
            this.f23103a = cVar;
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.yg2$b */
    public static final class C4001b implements C4002c {

        /* renamed from: a */
        public final DisplayMetrics f23107a;

        public C4001b(DisplayMetrics displayMetrics) {
            this.f23107a = displayMetrics;
        }

        /* renamed from: a */
        public int mo27488a() {
            return this.f23107a.widthPixels;
        }

        /* renamed from: b */
        public int mo27489b() {
            return this.f23107a.heightPixels;
        }
    }

    /* renamed from: com.onedelhi.secure.yg2$c */
    public interface C4002c {
        /* renamed from: a */
        int mo27488a();

        /* renamed from: b */
        int mo27489b();
    }

    public yg2(C4000a aVar) {
        this.f23091a = aVar.f23102a;
        int i = m32356e(aVar.f23101a) ? aVar.f23100a / 2 : aVar.f23100a;
        this.f23093c = i;
        int c = m32355c(aVar.f23101a, aVar.f23105c, aVar.f23106d);
        float a = (float) (aVar.f23103a.mo27488a() * aVar.f23103a.mo27489b() * 4);
        int round = Math.round(aVar.f23104b * a);
        int round2 = Math.round(a * aVar.f23099a);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f23092b = round2;
            this.f23090a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f23104b;
            float f3 = aVar.f23099a;
            float f4 = f / (f2 + f3);
            this.f23092b = Math.round(f3 * f4);
            this.f23090a = Math.round(f4 * aVar.f23104b);
        }
        if (Log.isLoggable(f23087a, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(mo27479f(this.f23092b));
            sb.append(", pool size: ");
            sb.append(mo27479f(this.f23090a));
            sb.append(", byte array size: ");
            sb.append(mo27479f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > c);
            sb.append(", max size: ");
            sb.append(mo27479f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f23101a.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m32356e(aVar.f23101a));
            Log.d(f23087a, sb.toString());
        }
    }

    /* renamed from: c */
    public static int m32355c(ActivityManager activityManager, float f, float f2) {
        boolean e = m32356e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    public static boolean m32356e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int mo27476a() {
        return this.f23093c;
    }

    /* renamed from: b */
    public int mo27477b() {
        return this.f23090a;
    }

    /* renamed from: d */
    public int mo27478d() {
        return this.f23092b;
    }

    /* renamed from: f */
    public final String mo27479f(int i) {
        return Formatter.formatFileSize(this.f23091a, (long) i);
    }
}
