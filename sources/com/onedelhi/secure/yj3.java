package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public class yj3 extends C4477aa {

    /* renamed from: a */
    public final List<byte[]> f37984a;

    /* renamed from: b */
    public final List<int[]> f37985b;

    /* renamed from: c */
    public final C4477aa f37986c;

    public yj3(C4477aa aaVar) {
        ArrayList arrayList;
        this.f37986c = aaVar;
        if (aaVar == C4477aa.m36108c()) {
            arrayList = null;
            this.f37984a = null;
        } else {
            this.f37984a = new ArrayList();
            arrayList = new ArrayList();
        }
        this.f37985b = arrayList;
    }

    /* renamed from: a */
    public byte[] mo30487a(int i, boolean z) {
        byte[] a = this.f37986c.mo30487a(i, z);
        List<byte[]> list = this.f37984a;
        if (list != null) {
            synchronized (list) {
                this.f37984a.add(a);
            }
        }
        return a;
    }

    /* renamed from: d */
    public int[] mo30488d(int i, boolean z) {
        int[] d = this.f37986c.mo30488d(i, z);
        List<int[]> list = this.f37985b;
        if (list != null) {
            synchronized (list) {
                this.f37985b.add(d);
            }
        }
        return d;
    }

    /* renamed from: e */
    public void mo30489e(byte[] bArr) {
        List<byte[]> list = this.f37984a;
        if (list != null) {
            synchronized (list) {
                int lastIndexOf = this.f37984a.lastIndexOf(bArr);
                if (lastIndexOf != -1) {
                    this.f37984a.remove(lastIndexOf);
                }
            }
            this.f37986c.mo30489e(bArr);
        }
    }

    /* renamed from: f */
    public void mo30490f(int[] iArr) {
        List<int[]> list = this.f37985b;
        if (list != null) {
            synchronized (list) {
                int lastIndexOf = this.f37985b.lastIndexOf(iArr);
                if (lastIndexOf != -1) {
                    this.f37985b.remove(lastIndexOf);
                }
            }
            this.f37986c.mo30490f(iArr);
        }
    }

    /* renamed from: h */
    public void mo47833h() {
        List<byte[]> list = this.f37984a;
        if (list != null) {
            synchronized (list) {
                for (int size = this.f37984a.size() - 1; size >= 0; size--) {
                    this.f37986c.mo30489e(this.f37984a.get(size));
                }
                this.f37984a.clear();
            }
            synchronized (this.f37985b) {
                for (int size2 = this.f37985b.size() - 1; size2 >= 0; size2--) {
                    this.f37986c.mo30490f(this.f37985b.get(size2));
                }
                this.f37985b.clear();
            }
        }
    }
}
