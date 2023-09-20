package com.onedelhi.secure;

import com.onedelhi.secure.C3580ta;
import java.io.PrintStream;
import java.util.Arrays;

public class w04 implements C3580ta.C3581a {

    /* renamed from: a */
    public static float f22003a = 0.001f;

    /* renamed from: a */
    public static final boolean f22004a = false;

    /* renamed from: b */
    public static final boolean f22005b = true;

    /* renamed from: a */
    public final int f22006a = -1;

    /* renamed from: a */
    public final C1990ds f22007a;

    /* renamed from: a */
    public final C3580ta f22008a;

    /* renamed from: a */
    public float[] f22009a = new float[16];

    /* renamed from: a */
    public int[] f22010a = new int[16];

    /* renamed from: b */
    public int f22011b = 16;

    /* renamed from: b */
    public int[] f22012b = new int[16];

    /* renamed from: c */
    public int f22013c = 16;

    /* renamed from: c */
    public int[] f22014c = new int[16];

    /* renamed from: d */
    public int f22015d = 0;

    /* renamed from: d */
    public int[] f22016d = new int[16];

    /* renamed from: e */
    public int f22017e = -1;

    /* renamed from: e */
    public int[] f22018e = new int[16];

    public w04(C3580ta taVar, C1990ds dsVar) {
        this.f22008a = taVar;
        this.f22007a = dsVar;
        clear();
    }

    /* renamed from: a */
    public void mo20208a() {
        int i = this.f22015d;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            v04 d = mo20212d(i2);
            if (d != null) {
                PrintStream printStream = System.out;
                printStream.print(d + " = " + mo20221m(i2) + " ");
            }
        }
        System.out.println(" }");
    }

    /* renamed from: b */
    public int mo20209b() {
        return this.f22015d;
    }

    /* renamed from: c */
    public float mo20210c(v04 v04) {
        int g = mo20215g(v04);
        if (g != -1) {
            return this.f22009a[g];
        }
        return 0.0f;
    }

    public void clear() {
        int i = this.f22015d;
        for (int i2 = 0; i2 < i; i2++) {
            v04 d = mo20212d(i2);
            if (d != null) {
                d.mo25826r(this.f22008a);
            }
        }
        for (int i3 = 0; i3 < this.f22011b; i3++) {
            this.f22014c[i3] = -1;
            this.f22012b[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f22013c; i4++) {
            this.f22010a[i4] = -1;
        }
        this.f22015d = 0;
        this.f22017e = -1;
    }

    /* renamed from: d */
    public v04 mo20212d(int i) {
        int i2 = this.f22015d;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f22017e;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f22007a.f10889a[this.f22014c[i3]];
            }
            i3 = this.f22018e[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo20213e(v04 v04, float f, boolean z) {
        float f2 = f22003a;
        if (f <= (-f2) || f >= f2) {
            int g = mo20215g(v04);
            if (g == -1) {
                mo20219k(v04, f);
                return;
            }
            float[] fArr = this.f22009a;
            fArr[g] = fArr[g] + f;
            float f3 = fArr[g];
            float f4 = f22003a;
            if (f3 > (-f4) && fArr[g] < f4) {
                fArr[g] = 0.0f;
                mo20217i(v04, z);
            }
        }
    }

    /* renamed from: f */
    public float mo20214f(C3580ta taVar, boolean z) {
        float c = mo20210c(taVar.f20719a);
        mo20217i(taVar.f20719a, z);
        w04 w04 = (w04) taVar.f20718a;
        int b = w04.mo20209b();
        int i = 0;
        int i2 = 0;
        while (i < b) {
            int[] iArr = w04.f22014c;
            if (iArr[i2] != -1) {
                mo20213e(this.f22007a.f10889a[iArr[i2]], w04.f22009a[i2] * c, z);
                i++;
            }
            i2++;
        }
        return c;
    }

    /* renamed from: g */
    public int mo20215g(v04 v04) {
        int[] iArr;
        if (!(this.f22015d == 0 || v04 == null)) {
            int i = v04.f21617n;
            int i2 = this.f22010a[i % this.f22013c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f22014c[i2] == i) {
                return i2;
            }
            while (true) {
                iArr = this.f22012b;
                if (iArr[i2] != -1 && this.f22014c[iArr[i2]] != i) {
                    i2 = iArr[i2];
                }
            }
            if (iArr[i2] != -1 && this.f22014c[iArr[i2]] == i) {
                return iArr[i2];
            }
        }
        return -1;
    }

    /* renamed from: h */
    public void mo20216h(float f) {
        int i = this.f22015d;
        int i2 = this.f22017e;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f22009a;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f22018e[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public float mo20217i(v04 v04, boolean z) {
        int g = mo20215g(v04);
        if (g == -1) {
            return 0.0f;
        }
        mo26418u(v04);
        float f = this.f22009a[g];
        if (this.f22017e == g) {
            this.f22017e = this.f22018e[g];
        }
        this.f22014c[g] = -1;
        int[] iArr = this.f22016d;
        if (iArr[g] != -1) {
            int[] iArr2 = this.f22018e;
            iArr2[iArr[g]] = iArr2[g];
        }
        int[] iArr3 = this.f22018e;
        if (iArr3[g] != -1) {
            iArr[iArr3[g]] = iArr[g];
        }
        this.f22015d--;
        v04.f21621r--;
        if (z) {
            v04.mo25826r(this.f22008a);
        }
        return f;
    }

    /* renamed from: j */
    public void mo20218j() {
        int i = this.f22015d;
        int i2 = this.f22017e;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f22009a;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f22018e[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo20219k(v04 v04, float f) {
        float f2 = f22003a;
        if (f <= (-f2) || f >= f2) {
            if (this.f22015d == 0) {
                mo26412p(0, v04, f);
                mo26411o(v04, 0);
                this.f22017e = 0;
                return;
            }
            int g = mo20215g(v04);
            if (g != -1) {
                this.f22009a[g] = f;
                return;
            }
            if (this.f22015d + 1 >= this.f22011b) {
                mo26415s();
            }
            int i = this.f22015d;
            int i2 = this.f22017e;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int[] iArr = this.f22014c;
                int i5 = iArr[i2];
                int i6 = v04.f21617n;
                if (i5 == i6) {
                    this.f22009a[i2] = f;
                    return;
                }
                if (iArr[i2] < i6) {
                    i3 = i2;
                }
                i2 = this.f22018e[i2];
                if (i2 == -1) {
                    break;
                }
            }
            mo26416t(i3, v04, f);
            return;
        }
        mo20217i(v04, true);
    }

    /* renamed from: l */
    public boolean mo20220l(v04 v04) {
        return mo20215g(v04) != -1;
    }

    /* renamed from: m */
    public float mo20221m(int i) {
        int i2 = this.f22015d;
        int i3 = this.f22017e;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f22009a[i3];
            }
            i3 = this.f22018e[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: n */
    public int mo20222n() {
        return 0;
    }

    /* renamed from: o */
    public final void mo26411o(v04 v04, int i) {
        int[] iArr;
        int i2 = v04.f21617n % this.f22013c;
        int[] iArr2 = this.f22010a;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f22012b;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f22012b[i] = -1;
    }

    /* renamed from: p */
    public final void mo26412p(int i, v04 v04, float f) {
        this.f22014c[i] = v04.f21617n;
        this.f22009a[i] = f;
        this.f22016d[i] = -1;
        this.f22018e[i] = -1;
        v04.mo25821a(this.f22008a);
        v04.f21621r++;
        this.f22015d++;
    }

    /* renamed from: q */
    public final void mo26413q() {
        for (int i = 0; i < this.f22013c; i++) {
            if (this.f22010a[i] != -1) {
                String str = hashCode() + " hash [" + i + "] => ";
                int i2 = this.f22010a[i];
                boolean z = false;
                while (!z) {
                    str = str + " " + this.f22014c[i2];
                    int[] iArr = this.f22012b;
                    if (iArr[i2] != -1) {
                        i2 = iArr[i2];
                    } else {
                        z = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    /* renamed from: r */
    public final int mo26414r() {
        for (int i = 0; i < this.f22011b; i++) {
            if (this.f22014c[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: s */
    public final void mo26415s() {
        int i = this.f22011b * 2;
        this.f22014c = Arrays.copyOf(this.f22014c, i);
        this.f22009a = Arrays.copyOf(this.f22009a, i);
        this.f22016d = Arrays.copyOf(this.f22016d, i);
        this.f22018e = Arrays.copyOf(this.f22018e, i);
        this.f22012b = Arrays.copyOf(this.f22012b, i);
        for (int i2 = this.f22011b; i2 < i; i2++) {
            this.f22014c[i2] = -1;
            this.f22012b[i2] = -1;
        }
        this.f22011b = i;
    }

    /* renamed from: t */
    public final void mo26416t(int i, v04 v04, float f) {
        int r = mo26414r();
        mo26412p(r, v04, f);
        if (i != -1) {
            this.f22016d[r] = i;
            int[] iArr = this.f22018e;
            iArr[r] = iArr[i];
            iArr[i] = r;
        } else {
            this.f22016d[r] = -1;
            if (this.f22015d > 0) {
                this.f22018e[r] = this.f22017e;
                this.f22017e = r;
            } else {
                this.f22018e[r] = -1;
            }
        }
        int[] iArr2 = this.f22018e;
        if (iArr2[r] != -1) {
            this.f22016d[iArr2[r]] = r;
        }
        mo26411o(v04, r);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        String str2 = hashCode() + " { ";
        int i = this.f22015d;
        for (int i2 = 0; i2 < i; i2++) {
            v04 d = mo20212d(i2);
            if (d != null) {
                String str3 = str2 + d + " = " + mo20221m(i2) + " ";
                int g = mo20215g(d);
                String str4 = str3 + "[p: ";
                if (this.f22016d[g] != -1) {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(this.f22007a.f10889a[this.f22014c[this.f22016d[g]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(tk0.f20956o);
                }
                String str5 = sb.toString() + ", n: ";
                if (this.f22018e[g] != -1) {
                    str = str5 + this.f22007a.f10889a[this.f22014c[this.f22018e[g]]];
                } else {
                    str = str5 + tk0.f20956o;
                }
                str2 = str + "]";
            }
        }
        return str2 + " }";
    }

    /* renamed from: u */
    public final void mo26418u(v04 v04) {
        int[] iArr;
        int i = v04.f21617n;
        int i2 = i % this.f22013c;
        int[] iArr2 = this.f22010a;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            if (this.f22014c[i3] == i) {
                int[] iArr3 = this.f22012b;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
                return;
            }
            while (true) {
                iArr = this.f22012b;
                if (iArr[i3] == -1 || this.f22014c[iArr[i3]] == i) {
                    int i4 = iArr[i3];
                } else {
                    i3 = iArr[i3];
                }
            }
            int i42 = iArr[i3];
            if (i42 != -1 && this.f22014c[i42] == i) {
                iArr[i3] = iArr[i42];
                iArr[i42] = -1;
            }
        }
    }
}
