package com.onedelhi.secure;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.onedelhi.secure.gc4;
import com.onedelhi.secure.ld4;

/* renamed from: com.onedelhi.secure.nb */
public class C2949nb<T> {

    /* renamed from: a */
    public static final String f17261a = "AsyncListUtil";

    /* renamed from: b */
    public static final boolean f17262b = false;

    /* renamed from: a */
    public final int f17263a;

    /* renamed from: a */
    public final SparseIntArray f17264a = new SparseIntArray();

    /* renamed from: a */
    public final gc4.C2241a<T> f17265a;

    /* renamed from: a */
    public final gc4.C2242b<T> f17266a;

    /* renamed from: a */
    public final ld4<T> f17267a;

    /* renamed from: a */
    public final C2952c<T> f17268a;

    /* renamed from: a */
    public final C2953d f17269a;

    /* renamed from: a */
    public final Class<T> f17270a;

    /* renamed from: a */
    public boolean f17271a;

    /* renamed from: a */
    public final int[] f17272a = new int[2];

    /* renamed from: b */
    public int f17273b = 0;

    /* renamed from: b */
    public final gc4.C2241a<T> f17274b;

    /* renamed from: b */
    public final gc4.C2242b<T> f17275b;

    /* renamed from: b */
    public final int[] f17276b = new int[2];

    /* renamed from: c */
    public int f17277c = 0;

    /* renamed from: c */
    public final int[] f17278c = new int[2];

    /* renamed from: d */
    public int f17279d = 0;

    /* renamed from: e */
    public int f17280e = 0;

    /* renamed from: com.onedelhi.secure.nb$a */
    public class C2950a implements gc4.C2242b<T> {
        public C2950a() {
        }

        /* renamed from: a */
        public void mo14675a(int i, int i2) {
            if (mo21035d(i)) {
                ld4.C2732a<T> e = C2949nb.this.f17267a.mo19447e(i2);
                if (e == null) {
                    Log.e(C2949nb.f17261a, "tile not found @" + i2);
                    return;
                }
                C2949nb.this.f17265a.mo14683d(e);
            }
        }

        /* renamed from: b */
        public void mo14676b(int i, ld4.C2732a<T> aVar) {
            if (!mo21035d(i)) {
                C2949nb.this.f17265a.mo14683d(aVar);
                return;
            }
            ld4.C2732a<T> a = C2949nb.this.f17267a.mo19443a(aVar);
            if (a != null) {
                Log.e(C2949nb.f17261a, "duplicate tile @" + a.f15299a);
                C2949nb.this.f17265a.mo14683d(a);
            }
            int i2 = aVar.f15299a + aVar.f15302b;
            int i3 = 0;
            while (i3 < C2949nb.this.f17264a.size()) {
                int keyAt = C2949nb.this.f17264a.keyAt(i3);
                if (aVar.f15299a > keyAt || keyAt >= i2) {
                    i3++;
                } else {
                    C2949nb.this.f17264a.removeAt(i3);
                    C2949nb.this.f17269a.mo21052d(keyAt);
                }
            }
        }

        /* renamed from: c */
        public void mo14677c(int i, int i2) {
            if (mo21035d(i)) {
                C2949nb nbVar = C2949nb.this;
                nbVar.f17277c = i2;
                nbVar.f17269a.mo21051c();
                C2949nb nbVar2 = C2949nb.this;
                nbVar2.f17279d = nbVar2.f17280e;
                mo21036e();
                C2949nb nbVar3 = C2949nb.this;
                nbVar3.f17271a = false;
                nbVar3.mo21034g();
            }
        }

        /* renamed from: d */
        public final boolean mo21035d(int i) {
            return i == C2949nb.this.f17280e;
        }

        /* renamed from: e */
        public final void mo21036e() {
            for (int i = 0; i < C2949nb.this.f17267a.mo19448f(); i++) {
                C2949nb nbVar = C2949nb.this;
                nbVar.f17265a.mo14683d(nbVar.f17267a.mo19445c(i));
            }
            C2949nb.this.f17267a.mo19444b();
        }
    }

    /* renamed from: com.onedelhi.secure.nb$b */
    public class C2951b implements gc4.C2241a<T> {

        /* renamed from: a */
        public int f17282a;

        /* renamed from: a */
        public final SparseBooleanArray f17283a = new SparseBooleanArray();

        /* renamed from: a */
        public ld4.C2732a<T> f17284a;

        /* renamed from: b */
        public int f17286b;

        /* renamed from: c */
        public int f17287c;

        /* renamed from: d */
        public int f17288d;

        public C2951b() {
        }

        /* renamed from: a */
        public void mo14680a(int i, int i2) {
            if (!mo21041i(i)) {
                ld4.C2732a e = mo21037e();
                e.f15299a = i;
                int min = Math.min(C2949nb.this.f17263a, this.f17286b - i);
                e.f15302b = min;
                C2949nb.this.f17268a.mo21045a(e.f15301a, e.f15299a, min);
                mo21039g(i2);
                mo21038f(e);
            }
        }

        /* renamed from: b */
        public void mo14681b(int i) {
            this.f17282a = i;
            this.f17283a.clear();
            int d = C2949nb.this.f17268a.mo21048d();
            this.f17286b = d;
            C2949nb.this.f17266a.mo14677c(this.f17282a, d);
        }

        /* renamed from: c */
        public void mo14682c(int i, int i2, int i3, int i4, int i5) {
            if (i <= i2) {
                int h = mo21040h(i);
                int h2 = mo21040h(i2);
                this.f17287c = mo21040h(i3);
                int h3 = mo21040h(i4);
                this.f17288d = h3;
                if (i5 == 1) {
                    mo21044l(this.f17287c, h2, i5, true);
                    mo21044l(h2 + C2949nb.this.f17263a, this.f17288d, i5, false);
                    return;
                }
                mo21044l(h, h3, i5, false);
                mo21044l(this.f17287c, h - C2949nb.this.f17263a, i5, true);
            }
        }

        /* renamed from: d */
        public void mo14683d(ld4.C2732a<T> aVar) {
            C2949nb.this.f17268a.mo21047c(aVar.f15301a, aVar.f15302b);
            aVar.f15300a = this.f17284a;
            this.f17284a = aVar;
        }

        /* renamed from: e */
        public final ld4.C2732a<T> mo21037e() {
            ld4.C2732a<T> aVar = this.f17284a;
            if (aVar != null) {
                this.f17284a = aVar.f15300a;
                return aVar;
            }
            C2949nb nbVar = C2949nb.this;
            return new ld4.C2732a<>(nbVar.f17270a, nbVar.f17263a);
        }

        /* renamed from: f */
        public final void mo21038f(ld4.C2732a<T> aVar) {
            this.f17283a.put(aVar.f15299a, true);
            C2949nb.this.f17266a.mo14676b(this.f17282a, aVar);
        }

        /* renamed from: g */
        public final void mo21039g(int i) {
            int b = C2949nb.this.f17268a.mo21046b();
            while (this.f17283a.size() >= b) {
                int keyAt = this.f17283a.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f17283a;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.f17287c - keyAt;
                int i3 = keyAt2 - this.f17288d;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    mo21043k(keyAt);
                } else if (i3 <= 0) {
                    return;
                } else {
                    if (i2 < i3 || i == 1) {
                        mo21043k(keyAt2);
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: h */
        public final int mo21040h(int i) {
            return i - (i % C2949nb.this.f17263a);
        }

        /* renamed from: i */
        public final boolean mo21041i(int i) {
            return this.f17283a.get(i);
        }

        /* renamed from: j */
        public final void mo21042j(String str, Object... objArr) {
            Log.d(C2949nb.f17261a, "[BKGR] " + String.format(str, objArr));
        }

        /* renamed from: k */
        public final void mo21043k(int i) {
            this.f17283a.delete(i);
            C2949nb.this.f17266a.mo14675a(this.f17282a, i);
        }

        /* renamed from: l */
        public final void mo21044l(int i, int i2, int i3, boolean z) {
            int i4 = i;
            while (i4 <= i2) {
                C2949nb.this.f17265a.mo14680a(z ? (i2 + i) - i4 : i4, i3);
                i4 += C2949nb.this.f17263a;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.nb$c */
    public static abstract class C2952c<T> {
        @ly4
        /* renamed from: a */
        public abstract void mo21045a(@mr2 T[] tArr, int i, int i2);

        @ly4
        /* renamed from: b */
        public int mo21046b() {
            return 10;
        }

        @ly4
        /* renamed from: c */
        public void mo21047c(@mr2 T[] tArr, int i) {
        }

        @ly4
        /* renamed from: d */
        public abstract int mo21048d();
    }

    /* renamed from: com.onedelhi.secure.nb$d */
    public static abstract class C2953d {

        /* renamed from: a */
        public static final int f17289a = 0;

        /* renamed from: b */
        public static final int f17290b = 1;

        /* renamed from: c */
        public static final int f17291c = 2;

        @hn4
        /* renamed from: a */
        public void mo21049a(@mr2 int[] iArr, @mr2 int[] iArr2, int i) {
            int i2 = (iArr[1] - iArr[0]) + 1;
            int i3 = i2 / 2;
            iArr2[0] = iArr[0] - (i == 1 ? i2 : i3);
            int i4 = iArr[1];
            if (i != 2) {
                i2 = i3;
            }
            iArr2[1] = i4 + i2;
        }

        @hn4
        /* renamed from: b */
        public abstract void mo21050b(@mr2 int[] iArr);

        @hn4
        /* renamed from: c */
        public abstract void mo21051c();

        @hn4
        /* renamed from: d */
        public abstract void mo21052d(int i);
    }

    public C2949nb(@mr2 Class<T> cls, int i, @mr2 C2952c<T> cVar, @mr2 C2953d dVar) {
        C2950a aVar = new C2950a();
        this.f17275b = aVar;
        C2951b bVar = new C2951b();
        this.f17274b = bVar;
        this.f17270a = cls;
        this.f17263a = i;
        this.f17268a = cVar;
        this.f17269a = dVar;
        this.f17267a = new ld4<>(i);
        di2 di2 = new di2();
        this.f17266a = di2.mo14673a(aVar);
        this.f17265a = di2.mo14674b(bVar);
        mo21033f();
    }

    @ts2
    /* renamed from: a */
    public T mo21028a(int i) {
        if (i < 0 || i >= this.f17277c) {
            throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.f17277c);
        }
        T d = this.f17267a.mo19446d(i);
        if (d == null && !mo21030c()) {
            this.f17264a.put(i, 0);
        }
        return d;
    }

    /* renamed from: b */
    public int mo21029b() {
        return this.f17277c;
    }

    /* renamed from: c */
    public final boolean mo21030c() {
        return this.f17280e != this.f17279d;
    }

    /* renamed from: d */
    public void mo21031d(String str, Object... objArr) {
        Log.d(f17261a, "[MAIN] " + String.format(str, objArr));
    }

    /* renamed from: e */
    public void mo21032e() {
        if (!mo21030c()) {
            mo21034g();
            this.f17271a = true;
        }
    }

    /* renamed from: f */
    public void mo21033f() {
        this.f17264a.clear();
        gc4.C2241a<T> aVar = this.f17265a;
        int i = this.f17280e + 1;
        this.f17280e = i;
        aVar.mo14681b(i);
    }

    /* renamed from: g */
    public void mo21034g() {
        this.f17269a.mo21050b(this.f17272a);
        int[] iArr = this.f17272a;
        if (iArr[0] <= iArr[1] && iArr[0] >= 0 && iArr[1] < this.f17277c) {
            if (this.f17271a) {
                int i = iArr[0];
                int[] iArr2 = this.f17276b;
                if (i <= iArr2[1] && iArr2[0] <= iArr[1]) {
                    if (iArr[0] < iArr2[0]) {
                        this.f17273b = 1;
                    } else if (iArr[0] > iArr2[0]) {
                        this.f17273b = 2;
                    }
                    int[] iArr3 = this.f17276b;
                    iArr3[0] = iArr[0];
                    iArr3[1] = iArr[1];
                    this.f17269a.mo21049a(iArr, this.f17278c, this.f17273b);
                    int[] iArr4 = this.f17278c;
                    iArr4[0] = Math.min(this.f17272a[0], Math.max(iArr4[0], 0));
                    int[] iArr5 = this.f17278c;
                    iArr5[1] = Math.max(this.f17272a[1], Math.min(iArr5[1], this.f17277c - 1));
                    gc4.C2241a<T> aVar = this.f17265a;
                    int[] iArr6 = this.f17272a;
                    int i2 = iArr6[0];
                    int i3 = iArr6[1];
                    int[] iArr7 = this.f17278c;
                    aVar.mo14682c(i2, i3, iArr7[0], iArr7[1], this.f17273b);
                }
            }
            this.f17273b = 0;
            int[] iArr32 = this.f17276b;
            iArr32[0] = iArr[0];
            iArr32[1] = iArr[1];
            this.f17269a.mo21049a(iArr, this.f17278c, this.f17273b);
            int[] iArr42 = this.f17278c;
            iArr42[0] = Math.min(this.f17272a[0], Math.max(iArr42[0], 0));
            int[] iArr52 = this.f17278c;
            iArr52[1] = Math.max(this.f17272a[1], Math.min(iArr52[1], this.f17277c - 1));
            gc4.C2241a<T> aVar2 = this.f17265a;
            int[] iArr62 = this.f17272a;
            int i22 = iArr62[0];
            int i32 = iArr62[1];
            int[] iArr72 = this.f17278c;
            aVar2.mo14682c(i22, i32, iArr72[0], iArr72[1], this.f17273b);
        }
    }
}
