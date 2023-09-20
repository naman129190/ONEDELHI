package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.databinding.c */
public class C0512c<C, T, A> implements Cloneable {

    /* renamed from: b */
    public static final String f3423b = "CallbackRegistry";

    /* renamed from: a */
    public final C0513a<C, T, A> f3424a;

    /* renamed from: a */
    public List<C> f3425a = new ArrayList();

    /* renamed from: a */
    public long[] f3426a;

    /* renamed from: b */
    public long f3427b = 0;

    /* renamed from: n */
    public int f3428n;

    /* renamed from: androidx.databinding.c$a */
    public static abstract class C0513a<C, T, A> {
        /* renamed from: a */
        public abstract void mo3938a(C c, T t, int i, A a);
    }

    public C0512c(C0513a<C, T, A> aVar) {
        this.f3424a = aVar;
    }

    /* renamed from: a */
    public synchronized void mo3974a(C c) {
        if (c != null) {
            int lastIndexOf = this.f3425a.lastIndexOf(c);
            if (lastIndexOf < 0 || mo3981g(lastIndexOf)) {
                this.f3425a.add(c);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: b */
    public synchronized void mo3975b() {
        if (this.f3428n == 0) {
            this.f3425a.clear();
        } else if (!this.f3425a.isEmpty()) {
            for (int size = this.f3425a.size() - 1; size >= 0; size--) {
                mo3989o(size);
            }
        }
    }

    /* renamed from: c */
    public synchronized C0512c<C, T, A> clone() {
        C0512c<C, T, A> cVar;
        CloneNotSupportedException e;
        try {
            cVar = (C0512c) super.clone();
            try {
                cVar.f3427b = 0;
                cVar.f3426a = null;
                cVar.f3428n = 0;
                cVar.f3425a = new ArrayList();
                int size = this.f3425a.size();
                for (int i = 0; i < size; i++) {
                    if (!mo3981g(i)) {
                        cVar.f3425a.add(this.f3425a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return cVar;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            cVar = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return cVar;
        }
        return cVar;
    }

    /* renamed from: d */
    public synchronized ArrayList<C> mo3978d() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.f3425a.size());
        int size = this.f3425a.size();
        for (int i = 0; i < size; i++) {
            if (!mo3981g(i)) {
                arrayList.add(this.f3425a.get(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo3979e(List<C> list) {
        list.clear();
        int size = this.f3425a.size();
        for (int i = 0; i < size; i++) {
            if (!mo3981g(i)) {
                list.add(this.f3425a.get(i));
            }
        }
    }

    /* renamed from: f */
    public synchronized boolean mo3980f() {
        if (this.f3425a.isEmpty()) {
            return true;
        }
        if (this.f3428n == 0) {
            return false;
        }
        int size = this.f3425a.size();
        for (int i = 0; i < size; i++) {
            if (!mo3981g(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo3981g(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.f3427b) != 0;
        }
        long[] jArr = this.f3426a;
        if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
            return false;
        }
        return ((1 << (i % 64)) & jArr[i2]) != 0;
    }

    /* renamed from: h */
    public synchronized void mo3982h(T t, int i, A a) {
        this.f3428n++;
        mo3985k(t, i, a);
        int i2 = this.f3428n - 1;
        this.f3428n = i2;
        if (i2 == 0) {
            long[] jArr = this.f3426a;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j = this.f3426a[length];
                    if (j != 0) {
                        mo3988n((length + 1) * 64, j);
                        this.f3426a[length] = 0;
                    }
                }
            }
            long j2 = this.f3427b;
            if (j2 != 0) {
                mo3988n(0, j2);
                this.f3427b = 0;
            }
        }
    }

    /* renamed from: i */
    public final void mo3983i(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f3424a.mo3938a(this.f3425a.get(i2), t, i, a);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo3984j(T t, int i, A a) {
        mo3983i(t, i, a, 0, Math.min(64, this.f3425a.size()), this.f3427b);
    }

    /* renamed from: k */
    public final void mo3985k(T t, int i, A a) {
        int size = this.f3425a.size();
        long[] jArr = this.f3426a;
        int length = jArr == null ? -1 : jArr.length - 1;
        mo3986l(t, i, a, length);
        mo3983i(t, i, a, (length + 2) * 64, size, 0);
    }

    /* renamed from: l */
    public final void mo3986l(T t, int i, A a, int i2) {
        if (i2 < 0) {
            mo3984j(t, i, a);
            return;
        }
        long j = this.f3426a[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f3425a.size(), i3 + 64);
        mo3986l(t, i, a, i2 - 1);
        mo3983i(t, i, a, i3, min, j);
    }

    /* renamed from: m */
    public synchronized void mo3987m(C c) {
        if (this.f3428n == 0) {
            this.f3425a.remove(c);
        } else {
            int lastIndexOf = this.f3425a.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                mo3989o(lastIndexOf);
            }
        }
    }

    /* renamed from: n */
    public final void mo3988n(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f3425a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: o */
    public final void mo3989o(int i) {
        if (i < 64) {
            this.f3427b = (1 << i) | this.f3427b;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f3426a;
        if (jArr == null) {
            this.f3426a = new long[(this.f3425a.size() / 64)];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[(this.f3425a.size() / 64)];
            long[] jArr3 = this.f3426a;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f3426a = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f3426a;
        jArr4[i2] = j | jArr4[i2];
    }
}
