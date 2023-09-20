package com.onedelhi.secure;

import com.onedelhi.secure.C3580ta;
import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: com.onedelhi.secure.ma */
public class C2842ma implements C3580ta.C3581a {

    /* renamed from: a */
    public static float f15985a = 0.001f;

    /* renamed from: b */
    public static final boolean f15986b = false;

    /* renamed from: c */
    public static final boolean f15987c = false;

    /* renamed from: e */
    public static final int f15988e = -1;

    /* renamed from: a */
    public int f15989a = 0;

    /* renamed from: a */
    public final C1990ds f15990a;

    /* renamed from: a */
    public final C3580ta f15991a;

    /* renamed from: a */
    public v04 f15992a = null;

    /* renamed from: a */
    public boolean f15993a = false;

    /* renamed from: a */
    public float[] f15994a = new float[8];

    /* renamed from: a */
    public int[] f15995a = new int[8];

    /* renamed from: b */
    public int f15996b = 8;

    /* renamed from: b */
    public int[] f15997b = new int[8];

    /* renamed from: c */
    public int f15998c = -1;

    /* renamed from: d */
    public int f15999d = -1;

    public C2842ma(C3580ta taVar, C1990ds dsVar) {
        this.f15991a = taVar;
        this.f15990a = dsVar;
    }

    /* renamed from: a */
    public void mo20208a() {
        int i = this.f15989a;
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
        return this.f15989a;
    }

    /* renamed from: c */
    public final float mo20210c(v04 v04) {
        int i = this.f15998c;
        int i2 = 0;
        while (i != -1 && i2 < this.f15989a) {
            if (this.f15995a[i] == v04.f21617n) {
                return this.f15994a[i];
            }
            i = this.f15997b[i];
            i2++;
        }
        return 0.0f;
    }

    public final void clear() {
        int i = this.f15998c;
        int i2 = 0;
        while (i != -1 && i2 < this.f15989a) {
            v04 v04 = this.f15990a.f10889a[this.f15995a[i]];
            if (v04 != null) {
                v04.mo25826r(this.f15991a);
            }
            i = this.f15997b[i];
            i2++;
        }
        this.f15998c = -1;
        this.f15999d = -1;
        this.f15993a = false;
        this.f15989a = 0;
    }

    /* renamed from: d */
    public v04 mo20212d(int i) {
        int i2 = this.f15998c;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f15989a) {
            if (i3 == i) {
                return this.f15990a.f10889a[this.f15995a[i2]];
            }
            i2 = this.f15997b[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: e */
    public void mo20213e(v04 v04, float f, boolean z) {
        float f2 = f15985a;
        if (f <= (-f2) || f >= f2) {
            int i = this.f15998c;
            if (i == -1) {
                this.f15998c = 0;
                this.f15994a[0] = f;
                this.f15995a[0] = v04.f21617n;
                this.f15997b[0] = -1;
                v04.f21621r++;
                v04.mo25821a(this.f15991a);
                this.f15989a++;
                if (!this.f15993a) {
                    int i2 = this.f15999d + 1;
                    this.f15999d = i2;
                    int[] iArr = this.f15995a;
                    if (i2 >= iArr.length) {
                        this.f15993a = true;
                        this.f15999d = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f15989a) {
                int[] iArr2 = this.f15995a;
                int i5 = iArr2[i];
                int i6 = v04.f21617n;
                if (i5 == i6) {
                    float[] fArr = this.f15994a;
                    float f3 = fArr[i] + f;
                    float f4 = f15985a;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f15998c) {
                            this.f15998c = this.f15997b[i];
                        } else {
                            int[] iArr3 = this.f15997b;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            v04.mo25826r(this.f15991a);
                        }
                        if (this.f15993a) {
                            this.f15999d = i;
                        }
                        v04.f21621r--;
                        this.f15989a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f15997b[i];
                i3++;
            }
            int i7 = this.f15999d;
            int i8 = i7 + 1;
            if (this.f15993a) {
                int[] iArr4 = this.f15995a;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f15995a;
            if (i7 >= iArr5.length && this.f15989a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f15995a;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f15995a;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f15996b * 2;
                this.f15996b = i10;
                this.f15993a = false;
                this.f15999d = i7 - 1;
                this.f15994a = Arrays.copyOf(this.f15994a, i10);
                this.f15995a = Arrays.copyOf(this.f15995a, this.f15996b);
                this.f15997b = Arrays.copyOf(this.f15997b, this.f15996b);
            }
            this.f15995a[i7] = v04.f21617n;
            this.f15994a[i7] = f;
            int[] iArr8 = this.f15997b;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f15998c;
                this.f15998c = i7;
            }
            v04.f21621r++;
            v04.mo25821a(this.f15991a);
            this.f15989a++;
            if (!this.f15993a) {
                this.f15999d++;
            }
            int i11 = this.f15999d;
            int[] iArr9 = this.f15995a;
            if (i11 >= iArr9.length) {
                this.f15993a = true;
                this.f15999d = iArr9.length - 1;
            }
        }
    }

    /* renamed from: f */
    public float mo20214f(C3580ta taVar, boolean z) {
        float c = mo20210c(taVar.f20719a);
        mo20217i(taVar.f20719a, z);
        C3580ta.C3581a aVar = taVar.f20718a;
        int b = aVar.mo20209b();
        for (int i = 0; i < b; i++) {
            v04 d = aVar.mo20212d(i);
            mo20213e(d, aVar.mo20210c(d) * c, z);
        }
        return c;
    }

    /* renamed from: g */
    public int mo20215g(v04 v04) {
        int i = this.f15998c;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f15989a) {
            if (this.f15995a[i] == v04.f21617n) {
                return i;
            }
            i = this.f15997b[i];
            i2++;
        }
        return -1;
    }

    /* renamed from: h */
    public void mo20216h(float f) {
        int i = this.f15998c;
        int i2 = 0;
        while (i != -1 && i2 < this.f15989a) {
            float[] fArr = this.f15994a;
            fArr[i] = fArr[i] / f;
            i = this.f15997b[i];
            i2++;
        }
    }

    /* renamed from: i */
    public final float mo20217i(v04 v04, boolean z) {
        if (this.f15992a == v04) {
            this.f15992a = null;
        }
        int i = this.f15998c;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f15989a) {
            if (this.f15995a[i] == v04.f21617n) {
                if (i == this.f15998c) {
                    this.f15998c = this.f15997b[i];
                } else {
                    int[] iArr = this.f15997b;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    v04.mo25826r(this.f15991a);
                }
                v04.f21621r--;
                this.f15989a--;
                this.f15995a[i] = -1;
                if (this.f15993a) {
                    this.f15999d = i;
                }
                return this.f15994a[i];
            }
            i2++;
            i3 = i;
            i = this.f15997b[i];
        }
        return 0.0f;
    }

    /* renamed from: j */
    public void mo20218j() {
        int i = this.f15998c;
        int i2 = 0;
        while (i != -1 && i2 < this.f15989a) {
            float[] fArr = this.f15994a;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f15997b[i];
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo20219k(v04 v04, float f) {
        if (f == 0.0f) {
            mo20217i(v04, true);
            return;
        }
        int i = this.f15998c;
        if (i == -1) {
            this.f15998c = 0;
            this.f15994a[0] = f;
            this.f15995a[0] = v04.f21617n;
            this.f15997b[0] = -1;
            v04.f21621r++;
            v04.mo25821a(this.f15991a);
            this.f15989a++;
            if (!this.f15993a) {
                int i2 = this.f15999d + 1;
                this.f15999d = i2;
                int[] iArr = this.f15995a;
                if (i2 >= iArr.length) {
                    this.f15993a = true;
                    this.f15999d = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f15989a) {
            int[] iArr2 = this.f15995a;
            int i5 = iArr2[i];
            int i6 = v04.f21617n;
            if (i5 == i6) {
                this.f15994a[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f15997b[i];
            i3++;
        }
        int i7 = this.f15999d;
        int i8 = i7 + 1;
        if (this.f15993a) {
            int[] iArr3 = this.f15995a;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f15995a;
        if (i7 >= iArr4.length && this.f15989a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f15995a;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f15995a;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f15996b * 2;
            this.f15996b = i10;
            this.f15993a = false;
            this.f15999d = i7 - 1;
            this.f15994a = Arrays.copyOf(this.f15994a, i10);
            this.f15995a = Arrays.copyOf(this.f15995a, this.f15996b);
            this.f15997b = Arrays.copyOf(this.f15997b, this.f15996b);
        }
        this.f15995a[i7] = v04.f21617n;
        this.f15994a[i7] = f;
        int[] iArr7 = this.f15997b;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f15998c;
            this.f15998c = i7;
        }
        v04.f21621r++;
        v04.mo25821a(this.f15991a);
        int i11 = this.f15989a + 1;
        this.f15989a = i11;
        if (!this.f15993a) {
            this.f15999d++;
        }
        int[] iArr8 = this.f15995a;
        if (i11 >= iArr8.length) {
            this.f15993a = true;
        }
        if (this.f15999d >= iArr8.length) {
            this.f15993a = true;
            this.f15999d = iArr8.length - 1;
        }
    }

    /* renamed from: l */
    public boolean mo20220l(v04 v04) {
        int i = this.f15998c;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f15989a) {
            if (this.f15995a[i] == v04.f21617n) {
                return true;
            }
            i = this.f15997b[i];
            i2++;
        }
        return false;
    }

    /* renamed from: m */
    public float mo20221m(int i) {
        int i2 = this.f15998c;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f15989a) {
            if (i3 == i) {
                return this.f15994a[i2];
            }
            i2 = this.f15997b[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: n */
    public int mo20222n() {
        return (this.f15995a.length * 4 * 3) + 0 + 36;
    }

    /* renamed from: o */
    public int mo20223o() {
        return this.f15998c;
    }

    /* renamed from: p */
    public final int mo20224p(int i) {
        return this.f15995a[i];
    }

    /* renamed from: q */
    public final int mo20225q(int i) {
        return this.f15997b[i];
    }

    /* renamed from: r */
    public v04 mo20226r() {
        v04 v04 = this.f15992a;
        if (v04 != null) {
            return v04;
        }
        int i = this.f15998c;
        int i2 = 0;
        v04 v042 = null;
        while (i != -1 && i2 < this.f15989a) {
            if (this.f15994a[i] < 0.0f) {
                v04 v043 = this.f15990a.f10889a[this.f15995a[i]];
                if (v042 == null || v042.f21619p < v043.f21619p) {
                    v042 = v043;
                }
            }
            i = this.f15997b[i];
            i2++;
        }
        return v042;
    }

    /* renamed from: s */
    public final float mo20227s(int i) {
        return this.f15994a[i];
    }

    /* renamed from: t */
    public boolean mo20228t() {
        int i = this.f15998c;
        int i2 = 0;
        while (i != -1 && i2 < this.f15989a) {
            if (this.f15994a[i] > 0.0f) {
                return true;
            }
            i = this.f15997b[i];
            i2++;
        }
        return false;
    }

    public String toString() {
        int i = this.f15998c;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f15989a) {
            str = ((str + " -> ") + this.f15994a[i] + " : ") + this.f15990a.f10889a[this.f15995a[i]];
            i = this.f15997b[i];
            i2++;
        }
        return str;
    }
}
