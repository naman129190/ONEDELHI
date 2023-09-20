package com.onedelhi.secure;

import com.onedelhi.secure.C3580ta;
import java.util.Arrays;
import java.util.Comparator;

public class g53 extends C3580ta {

    /* renamed from: b */
    public static final float f12430b = 1.0E-4f;

    /* renamed from: c */
    public static final int f12431c = -1;

    /* renamed from: e */
    public static final boolean f12432e = false;

    /* renamed from: a */
    public int f12433a = 128;

    /* renamed from: a */
    public C1990ds f12434a;

    /* renamed from: a */
    public C2217b f12435a = new C2217b(this);

    /* renamed from: a */
    public v04[] f12436a = new v04[128];

    /* renamed from: b */
    public int f12437b = 0;

    /* renamed from: b */
    public v04[] f12438b = new v04[128];

    /* renamed from: com.onedelhi.secure.g53$a */
    public class C2216a implements Comparator<v04> {
        public C2216a() {
        }

        /* renamed from: a */
        public int compare(v04 v04, v04 v042) {
            return v04.f21617n - v042.f21617n;
        }
    }

    /* renamed from: com.onedelhi.secure.g53$b */
    public class C2217b {

        /* renamed from: a */
        public g53 f12440a;

        /* renamed from: a */
        public v04 f12441a;

        public C2217b(g53 g53) {
            this.f12440a = g53;
        }

        /* renamed from: a */
        public void mo16351a(v04 v04) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f12441a.f21614b;
                fArr[i] = fArr[i] + v04.f21614b[i];
                if (Math.abs(fArr[i]) < 1.0E-4f) {
                    this.f12441a.f21614b[i] = 0.0f;
                }
            }
        }

        /* renamed from: b */
        public boolean mo16352b(v04 v04, float f) {
            boolean z = true;
            if (this.f12441a.f21613b) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f12441a.f21614b;
                    fArr[i] = fArr[i] + (v04.f21614b[i] * f);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.f12441a.f21614b[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    g53.this.mo16342K(this.f12441a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = v04.f21614b[i2];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.f12441a.f21614b[i2] = f3;
                } else {
                    this.f12441a.f21614b[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: c */
        public void mo16353c(v04 v04) {
            this.f12441a = v04;
        }

        /* renamed from: d */
        public final boolean mo16354d() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f12441a.f21614b[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo16355e() {
            for (int i = 0; i < 9; i++) {
                if (this.f12441a.f21614b[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo16356f(v04 v04) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = v04.f21614b[i];
                float f2 = this.f12441a.f21614b[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public void mo16357g() {
            Arrays.fill(this.f12441a.f21614b, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f12441a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f12441a.f21614b[i] + " ";
                }
            }
            return str + "] " + this.f12441a;
        }
    }

    public g53(C1990ds dsVar) {
        super(dsVar);
        this.f12434a = dsVar;
    }

    /* renamed from: J */
    public final void mo16341J(v04 v04) {
        int i;
        int i2 = this.f12437b + 1;
        v04[] v04Arr = this.f12436a;
        if (i2 > v04Arr.length) {
            v04[] v04Arr2 = (v04[]) Arrays.copyOf(v04Arr, v04Arr.length * 2);
            this.f12436a = v04Arr2;
            this.f12438b = (v04[]) Arrays.copyOf(v04Arr2, v04Arr2.length * 2);
        }
        v04[] v04Arr3 = this.f12436a;
        int i3 = this.f12437b;
        v04Arr3[i3] = v04;
        int i4 = i3 + 1;
        this.f12437b = i4;
        if (i4 > 1 && v04Arr3[i4 - 1].f21617n > v04.f21617n) {
            int i5 = 0;
            while (true) {
                i = this.f12437b;
                if (i5 >= i) {
                    break;
                }
                this.f12438b[i5] = this.f12436a[i5];
                i5++;
            }
            Arrays.sort(this.f12438b, 0, i, new C2216a());
            for (int i6 = 0; i6 < this.f12437b; i6++) {
                this.f12436a[i6] = this.f12438b[i6];
            }
        }
        v04.f21613b = true;
        v04.mo25821a(this);
    }

    /* renamed from: K */
    public final void mo16342K(v04 v04) {
        int i = 0;
        while (i < this.f12437b) {
            if (this.f12436a[i] == v04) {
                while (true) {
                    int i2 = this.f12437b;
                    if (i < i2 - 1) {
                        v04[] v04Arr = this.f12436a;
                        int i3 = i + 1;
                        v04Arr[i] = v04Arr[i3];
                        i = i3;
                    } else {
                        this.f12437b = i2 - 1;
                        v04.f21613b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: c */
    public void mo16343c(v04 v04) {
        this.f12435a.mo16353c(v04);
        this.f12435a.mo16357g();
        v04.f21614b[v04.f21619p] = 1.0f;
        mo16341J(v04);
    }

    public void clear() {
        this.f12437b = 0;
        this.f20717a = 0.0f;
    }

    /* renamed from: f */
    public void mo16345f(p32 p32, C3580ta taVar, boolean z) {
        v04 v04 = taVar.f20719a;
        if (v04 != null) {
            C3580ta.C3581a aVar = taVar.f20718a;
            int b = aVar.mo20209b();
            for (int i = 0; i < b; i++) {
                v04 d = aVar.mo20212d(i);
                float m = aVar.mo20221m(i);
                this.f12435a.mo16353c(d);
                if (this.f12435a.mo16352b(v04, m)) {
                    mo16341J(d);
                }
                this.f20717a += taVar.f20717a * m;
            }
            mo16342K(v04);
        }
    }

    /* renamed from: g */
    public v04 mo16346g(p32 p32, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f12437b; i2++) {
            v04 v04 = this.f12436a[i2];
            if (!zArr[v04.f21617n]) {
                this.f12435a.mo16353c(v04);
                C2217b bVar = this.f12435a;
                if (i == -1) {
                    if (!bVar.mo16354d()) {
                    }
                } else if (!bVar.mo16356f(this.f12436a[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f12436a[i];
    }

    public boolean isEmpty() {
        return this.f12437b == 0;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f20717a + ") : ";
        for (int i = 0; i < this.f12437b; i++) {
            this.f12435a.mo16353c(this.f12436a[i]);
            str = str + this.f12435a + " ";
        }
        return str;
    }
}
