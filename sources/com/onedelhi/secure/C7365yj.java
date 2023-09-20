package com.onedelhi.secure;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.onedelhi.secure.yj */
public class C7365yj extends C4477aa {

    /* renamed from: a */
    public static final int f37975a = 32768;

    /* renamed from: b */
    public static final int f37976b = 32;

    /* renamed from: c */
    public static final int f37977c = 512;

    /* renamed from: a */
    public final C7367b<byte[]> f37978a = new C7367b<>();

    /* renamed from: b */
    public final C7367b<int[]> f37979b = new C7367b<>();

    /* renamed from: com.onedelhi.secure.yj$b */
    public static class C7367b<T> extends LinkedHashMap<Integer, C7368c<Reference<T>>> {

        /* renamed from: b */
        public static final long f37980b = 1;

        public C7367b() {
            super(64, 0.75f, true);
        }

        public boolean removeEldestEntry(Map.Entry<Integer, C7368c<Reference<T>>> entry) {
            return size() > 32;
        }
    }

    /* renamed from: com.onedelhi.secure.yj$c */
    public static class C7368c<T> {

        /* renamed from: a */
        public int f37981a;

        /* renamed from: a */
        public final T[] f37982a;

        public C7368c() {
            this.f37982a = new Object[512];
            this.f37981a = 0;
        }

        /* renamed from: a */
        public synchronized T mo47831a() {
            T t;
            T[] tArr = this.f37982a;
            int i = this.f37981a;
            t = tArr[i];
            tArr[i] = null;
            this.f37981a = (i - 1) & 511;
            return t;
        }

        /* renamed from: b */
        public synchronized void mo47832b(T t) {
            int i = (this.f37981a + 1) & 511;
            this.f37981a = i;
            this.f37982a[i] = t;
        }
    }

    /* renamed from: com.onedelhi.secure.yj$d */
    public static final class C7369d {

        /* renamed from: a */
        public static final C7365yj f37983a = new C7365yj();
    }

    /* renamed from: h */
    public static <T> T m71800h(C7367b<T> bVar, int i) {
        C7368c cVar;
        T t;
        if (i < 32768) {
            return null;
        }
        synchronized (bVar) {
            cVar = (C7368c) bVar.get(Integer.valueOf(i));
        }
        if (cVar == null) {
            return null;
        }
        do {
            Reference reference = (Reference) cVar.mo47831a();
            if (reference == null) {
                return null;
            }
            t = reference.get();
        } while (t == null);
        return t;
    }

    /* renamed from: i */
    public static C7365yj m71801i() {
        return C7369d.f37983a;
    }

    /* renamed from: j */
    public static <T> void m71802j(C7367b<T> bVar, T t, int i) {
        C7368c cVar;
        if (i >= 32768) {
            synchronized (bVar) {
                cVar = (C7368c) bVar.get(Integer.valueOf(i));
                if (cVar == null) {
                    cVar = new C7368c();
                    bVar.put(Integer.valueOf(i), cVar);
                }
            }
            cVar.mo47832b(new SoftReference(t));
        }
    }

    /* renamed from: a */
    public byte[] mo30487a(int i, boolean z) {
        byte[] bArr = (byte[]) m71800h(this.f37978a, i);
        if (bArr == null) {
            return new byte[i];
        }
        if (!z) {
            return bArr;
        }
        Arrays.fill(bArr, (byte) 0);
        return bArr;
    }

    /* renamed from: d */
    public int[] mo30488d(int i, boolean z) {
        int[] iArr = (int[]) m71800h(this.f37979b, i);
        if (iArr == null) {
            return new int[i];
        }
        if (!z) {
            return iArr;
        }
        Arrays.fill(iArr, 0);
        return iArr;
    }

    /* renamed from: e */
    public void mo30489e(byte[] bArr) {
        m71802j(this.f37978a, bArr, bArr.length);
    }

    /* renamed from: f */
    public void mo30490f(int[] iArr) {
        m71802j(this.f37979b, iArr, iArr.length);
    }
}
