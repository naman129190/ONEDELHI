package com.onedelhi.secure;

import java.util.Arrays;
import java.util.HashSet;

public class v04 implements Comparable<v04> {

    /* renamed from: A */
    public static final int f21589A = 7;

    /* renamed from: B */
    public static final int f21590B = 8;

    /* renamed from: C */
    public static int f21591C = 1;

    /* renamed from: D */
    public static int f21592D = 1;

    /* renamed from: E */
    public static int f21593E = 1;

    /* renamed from: F */
    public static int f21594F = 1;

    /* renamed from: G */
    public static int f21595G = 1;

    /* renamed from: H */
    public static final int f21596H = 9;

    /* renamed from: e */
    public static final boolean f21597e = false;

    /* renamed from: f */
    public static final boolean f21598f = false;

    /* renamed from: t */
    public static final int f21599t = 0;

    /* renamed from: u */
    public static final int f21600u = 1;

    /* renamed from: v */
    public static final int f21601v = 2;

    /* renamed from: w */
    public static final int f21602w = 3;

    /* renamed from: x */
    public static final int f21603x = 4;

    /* renamed from: y */
    public static final int f21604y = 5;

    /* renamed from: z */
    public static final int f21605z = 6;

    /* renamed from: a */
    public float f21606a;

    /* renamed from: a */
    public C3759b f21607a;

    /* renamed from: a */
    public HashSet<C3580ta> f21608a = null;

    /* renamed from: a */
    public float[] f21609a = new float[9];

    /* renamed from: a */
    public C3580ta[] f21610a = new C3580ta[16];

    /* renamed from: b */
    public float f21611b = 0.0f;

    /* renamed from: b */
    public String f21612b;

    /* renamed from: b */
    public boolean f21613b;

    /* renamed from: b */
    public float[] f21614b = new float[9];

    /* renamed from: c */
    public boolean f21615c = false;

    /* renamed from: d */
    public boolean f21616d = false;

    /* renamed from: n */
    public int f21617n = -1;

    /* renamed from: o */
    public int f21618o = -1;

    /* renamed from: p */
    public int f21619p = 0;

    /* renamed from: q */
    public int f21620q = 0;

    /* renamed from: r */
    public int f21621r = 0;

    /* renamed from: s */
    public int f21622s = -1;

    /* renamed from: com.onedelhi.secure.v04$a */
    public static /* synthetic */ class C3758a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21623a;

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
                com.onedelhi.secure.v04$b[] r0 = com.onedelhi.secure.v04.C3759b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21623a = r0
                com.onedelhi.secure.v04$b r1 = com.onedelhi.secure.v04.C3759b.UNRESTRICTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21623a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.v04$b r1 = com.onedelhi.secure.v04.C3759b.CONSTANT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21623a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.v04$b r1 = com.onedelhi.secure.v04.C3759b.SLACK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21623a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.v04$b r1 = com.onedelhi.secure.v04.C3759b.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21623a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.v04$b r1 = com.onedelhi.secure.v04.C3759b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.v04.C3758a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.v04$b */
    public enum C3759b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public v04(C3759b bVar, String str) {
        this.f21607a = bVar;
    }

    public v04(String str, C3759b bVar) {
        this.f21612b = str;
        this.f21607a = bVar;
    }

    /* renamed from: l */
    public static String m29753l(C3759b bVar, String str) {
        StringBuilder sb;
        int i;
        if (str != null) {
            sb = new StringBuilder();
            sb.append(str);
            i = f21592D;
        } else {
            int i2 = C3758a.f21623a[bVar.ordinal()];
            if (i2 == 1) {
                sb = new StringBuilder();
                sb.append("U");
                i = f21593E + 1;
                f21593E = i;
            } else if (i2 == 2) {
                sb = new StringBuilder();
                sb.append("C");
                i = f21594F + 1;
                f21594F = i;
            } else if (i2 == 3) {
                sb = new StringBuilder();
                sb.append(mx0.f16693i2);
                i = f21591C + 1;
                f21591C = i;
            } else if (i2 == 4) {
                sb = new StringBuilder();
                sb.append("e");
                i = f21592D + 1;
                f21592D = i;
            } else if (i2 == 5) {
                sb = new StringBuilder();
                sb.append(mx0.f16734m2);
                i = f21595G + 1;
                f21595G = i;
            } else {
                throw new AssertionError(bVar.name());
            }
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: q */
    public static void m29754q() {
        f21592D++;
    }

    /* renamed from: a */
    public final void mo25821a(C3580ta taVar) {
        int i = 0;
        while (true) {
            int i2 = this.f21620q;
            if (i >= i2) {
                C3580ta[] taVarArr = this.f21610a;
                if (i2 >= taVarArr.length) {
                    this.f21610a = (C3580ta[]) Arrays.copyOf(taVarArr, taVarArr.length * 2);
                }
                C3580ta[] taVarArr2 = this.f21610a;
                int i3 = this.f21620q;
                taVarArr2[i3] = taVar;
                this.f21620q = i3 + 1;
                return;
            } else if (this.f21610a[i] != taVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo25822b() {
        for (int i = 0; i < 9; i++) {
            this.f21609a[i] = 0.0f;
        }
    }

    /* renamed from: e */
    public int compareTo(v04 v04) {
        return this.f21617n - v04.f21617n;
    }

    /* renamed from: g */
    public String mo25825g() {
        return this.f21612b;
    }

    /* renamed from: r */
    public final void mo25826r(C3580ta taVar) {
        int i = this.f21620q;
        int i2 = 0;
        while (i2 < i) {
            if (this.f21610a[i2] == taVar) {
                while (i2 < i - 1) {
                    C3580ta[] taVarArr = this.f21610a;
                    int i3 = i2 + 1;
                    taVarArr[i2] = taVarArr[i3];
                    i2 = i3;
                }
                this.f21620q--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: s */
    public void mo25827s() {
        this.f21612b = null;
        this.f21607a = C3759b.UNKNOWN;
        this.f21619p = 0;
        this.f21617n = -1;
        this.f21618o = -1;
        this.f21606a = 0.0f;
        this.f21615c = false;
        this.f21616d = false;
        this.f21622s = -1;
        this.f21611b = 0.0f;
        int i = this.f21620q;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21610a[i2] = null;
        }
        this.f21620q = 0;
        this.f21621r = 0;
        this.f21613b = false;
        Arrays.fill(this.f21614b, 0.0f);
    }

    /* renamed from: t */
    public void mo25828t(p32 p32, float f) {
        this.f21606a = f;
        this.f21615c = true;
        this.f21616d = false;
        this.f21622s = -1;
        this.f21611b = 0.0f;
        int i = this.f21620q;
        this.f21618o = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21610a[i2].mo22296a(p32, this, false);
        }
        this.f21620q = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f21612b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f21612b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f21617n);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo25830u(String str) {
        this.f21612b = str;
    }

    /* renamed from: v */
    public void mo25831v(p32 p32, v04 v04, float f) {
        this.f21616d = true;
        this.f21622s = v04.f21617n;
        this.f21611b = f;
        int i = this.f21620q;
        this.f21618o = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21610a[i2].mo24796H(p32, this, false);
        }
        this.f21620q = 0;
        p32.mo22295z();
    }

    /* renamed from: w */
    public void mo25832w(C3759b bVar, String str) {
        this.f21607a = bVar;
    }

    /* renamed from: x */
    public String mo25833x() {
        StringBuilder sb;
        String str;
        String str2 = this + "[";
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.f21609a.length; i++) {
            String str3 = str2 + this.f21609a[i];
            float[] fArr = this.f21609a;
            if (fArr[i] > 0.0f) {
                z = false;
            } else if (fArr[i] < 0.0f) {
                z = true;
            }
            if (fArr[i] != 0.0f) {
                z2 = false;
            }
            if (i < fArr.length - 1) {
                sb = new StringBuilder();
                sb.append(str3);
                str = ", ";
            } else {
                sb = new StringBuilder();
                sb.append(str3);
                str = "] ";
            }
            sb.append(str);
            str2 = sb.toString();
        }
        if (z) {
            str2 = str2 + " (-)";
        }
        if (!z2) {
            return str2;
        }
        return str2 + " (*)";
    }

    /* renamed from: y */
    public final void mo25834y(p32 p32, C3580ta taVar) {
        int i = this.f21620q;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21610a[i2].mo16345f(p32, taVar, false);
        }
        this.f21620q = 0;
    }
}
