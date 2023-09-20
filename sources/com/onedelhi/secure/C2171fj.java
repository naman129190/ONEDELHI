package com.onedelhi.secure;

import com.onedelhi.secure.z24;

/* renamed from: com.onedelhi.secure.fj */
public class C2171fj extends kl1 {

    /* renamed from: a */
    public C2063ej f12074a;

    /* renamed from: a */
    public z24.C4042d f12075a;

    /* renamed from: r */
    public int f12076r;

    /* renamed from: com.onedelhi.secure.fj$a */
    public static /* synthetic */ class C2172a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12077a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.z24$d[] r0 = com.onedelhi.secure.z24.C4042d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12077a = r0
                com.onedelhi.secure.z24$d r1 = com.onedelhi.secure.z24.C4042d.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12077a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.z24$d r1 = com.onedelhi.secure.z24.C4042d.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12077a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.z24$d r1 = com.onedelhi.secure.z24.C4042d.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12077a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.z24$d r1 = com.onedelhi.secure.z24.C4042d.END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12077a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.z24$d r1 = com.onedelhi.secure.z24.C4042d.TOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12077a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.z24$d r1 = com.onedelhi.secure.z24.C4042d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2171fj.C2172a.<clinit>():void");
        }
    }

    public C2171fj(z24 z24) {
        super(z24, z24.C4043e.BARRIER);
    }

    /* renamed from: M0 */
    public ml1 mo15961M0() {
        if (this.f12074a == null) {
            this.f12074a = new C2063ej();
        }
        return this.f12074a;
    }

    /* renamed from: P0 */
    public void mo15962P0(z24.C4042d dVar) {
        this.f12075a = dVar;
    }

    public void apply() {
        mo15961M0();
        int i = C2172a.f12077a[this.f12075a.ordinal()];
        int i2 = 3;
        if (i == 3 || i == 4) {
            i2 = 1;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        this.f12074a.mo15211u2(i2);
        this.f12074a.mo15212v2(this.f12076r);
    }

    /* renamed from: b0 */
    public n60 mo15963b0(int i) {
        this.f12076r = i;
        return this;
    }

    /* renamed from: c0 */
    public n60 mo15964c0(Object obj) {
        mo15963b0(this.f14964b.mo27767f(obj));
        return this;
    }
}
