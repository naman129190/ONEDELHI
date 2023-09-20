package com.onedelhi.secure;

import java.util.concurrent.TimeUnit;

public class ef3 {

    /* renamed from: a */
    public static final /* synthetic */ boolean f27887a = false;

    /* renamed from: a */
    public long f27888a;

    /* renamed from: a */
    public TimeUnit f27889a;

    /* renamed from: b */
    public long f27890b;

    /* renamed from: com.onedelhi.secure.ef3$a */
    public static /* synthetic */ class C5134a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27891a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27891a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27891a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27891a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ef3.C5134a.<clinit>():void");
        }
    }

    public ef3(long j, long j2, TimeUnit timeUnit) {
        this.f27888a = j;
        this.f27890b = j2;
        this.f27889a = timeUnit;
    }

    /* renamed from: a */
    public double mo35225a() {
        int i = C5134a.f27891a[this.f27889a.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? ((double) this.f27888a) / ((double) this.f27889a.toSeconds(this.f27890b)) : (((double) this.f27888a) / ((double) this.f27890b)) * ((double) TimeUnit.SECONDS.toMillis(1)) : (((double) this.f27888a) / ((double) this.f27890b)) * ((double) TimeUnit.SECONDS.toMicros(1)) : (((double) this.f27888a) / ((double) this.f27890b)) * ((double) TimeUnit.SECONDS.toNanos(1));
    }
}
