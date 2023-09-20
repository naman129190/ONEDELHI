package com.onedelhi.secure;

import java.util.LinkedList;

public final class a34 {

    /* renamed from: a */
    public static final a34 f25748a = new a34(if4.f30302b, 0, 0, 0);

    /* renamed from: a */
    public final int f25749a;

    /* renamed from: a */
    public final if4 f25750a;

    /* renamed from: b */
    public final int f25751b;

    /* renamed from: c */
    public final int f25752c;

    public a34(if4 if4, int i, int i2, int i3) {
        this.f25750a = if4;
        this.f25749a = i;
        this.f25751b = i2;
        this.f25752c = i3;
    }

    /* renamed from: b */
    public static int m36060b(a34 a34) {
        int i = a34.f25751b;
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }

    /* renamed from: a */
    public a34 mo30452a(int i) {
        if4 if4 = this.f25750a;
        int i2 = this.f25749a;
        int i3 = this.f25752c;
        if (i2 == 4 || i2 == 2) {
            int i4 = pl1.f33715a[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            if4 = if4.mo38061a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.f25751b;
        a34 a34 = new a34(if4, i2, i7 + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return a34.f25751b == 2078 ? a34.mo30453c(i + 1) : a34;
    }

    /* renamed from: c */
    public a34 mo30453c(int i) {
        int i2 = this.f25751b;
        return i2 == 0 ? this : new a34(this.f25750a.mo38062b(i - i2, i2), this.f25749a, 0, this.f25752c);
    }

    /* renamed from: d */
    public int mo30454d() {
        return this.f25751b;
    }

    /* renamed from: e */
    public int mo30455e() {
        return this.f25752c;
    }

    /* renamed from: f */
    public int mo30456f() {
        return this.f25749a;
    }

    /* renamed from: g */
    public if4 mo30457g() {
        return this.f25750a;
    }

    /* renamed from: h */
    public boolean mo30458h(a34 a34) {
        int i = this.f25752c + (pl1.f33715a[this.f25749a][a34.f25749a] >> 16);
        int i2 = this.f25751b;
        int i3 = a34.f25751b;
        if (i2 < i3) {
            i += m36060b(a34) - m36060b(this);
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        return i <= a34.f25752c;
    }

    /* renamed from: i */
    public a34 mo30459i(int i, int i2) {
        int i3 = this.f25752c;
        if4 if4 = this.f25750a;
        int i4 = this.f25749a;
        if (i != i4) {
            int i5 = pl1.f33715a[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            if4 = if4.mo38061a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new a34(if4.mo38061a(i2, i8), i, 0, i3 + i8);
    }

    /* renamed from: j */
    public a34 mo30460j(int i, int i2) {
        if4 if4 = this.f25750a;
        int i3 = this.f25749a;
        int i4 = i3 == 2 ? 4 : 5;
        return new a34(if4.mo38061a(pl1.f33719c[i3][i], i4).mo38061a(i2, 5), this.f25749a, 0, this.f25752c + i4 + 5);
    }

    /* renamed from: k */
    public C6014ll mo30461k(byte[] bArr) {
        LinkedList<if4> linkedList = new LinkedList<>();
        for (if4 if4 = mo30453c(bArr.length).f25750a; if4 != null; if4 = if4.mo38063d()) {
            linkedList.addFirst(if4);
        }
        C6014ll llVar = new C6014ll();
        for (if4 c : linkedList) {
            c.mo35678c(llVar, bArr);
        }
        return llVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{pl1.f33714a[this.f25749a], Integer.valueOf(this.f25752c), Integer.valueOf(this.f25751b)});
    }
}
