package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u0003*\u00028\u0000H$¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0004J\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/y43;", "", "T", "", "c", "(Ljava/lang/Object;)I", "spreadArgument", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/Object;)V", "f", "values", "result", "g", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "position", "I", "b", "()I", "e", "(I)V", "size", "<init>", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class y43<T> {

    /* renamed from: a */
    public final int f37797a;
    @vr2

    /* renamed from: a */
    public final T[] f37798a;

    /* renamed from: b */
    public int f37799b;

    public y43(int i) {
        this.f37797a = i;
        this.f37798a = new Object[i];
    }

    /* renamed from: d */
    public static /* synthetic */ void m71253d() {
    }

    /* renamed from: a */
    public final void mo47583a(@vr2 T t) {
        jt1.m53777p(t, "spreadArgument");
        T[] tArr = this.f37798a;
        int i = this.f37799b;
        this.f37799b = i + 1;
        tArr[i] = t;
    }

    /* renamed from: b */
    public final int mo47584b() {
        return this.f37799b;
    }

    /* renamed from: c */
    public abstract int mo32014c(@vr2 T t);

    /* renamed from: e */
    public final void mo47585e(int i) {
        this.f37799b = i;
    }

    /* renamed from: f */
    public final int mo47586f() {
        int i = 0;
        ds1 o = new is1(0, this.f37797a - 1).iterator();
        while (o.hasNext()) {
            T t = this.f37798a[o.mo19249b()];
            i += t != null ? mo32014c(t) : 1;
        }
        return i;
    }

    @vr2
    /* renamed from: g */
    public final T mo47587g(@vr2 T t, @vr2 T t2) {
        jt1.m53777p(t, wq3.f22243a);
        jt1.m53777p(t2, "result");
        ds1 o = new is1(0, this.f37797a - 1).iterator();
        int i = 0;
        int i2 = 0;
        while (o.hasNext()) {
            int b = o.mo19249b();
            T t3 = this.f37798a[b];
            if (t3 != null) {
                if (i < b) {
                    int i3 = b - i;
                    System.arraycopy(t, i, t2, i2, i3);
                    i2 += i3;
                }
                int c = mo32014c(t3);
                System.arraycopy(t3, 0, t2, i2, c);
                i2 += c;
                i = b + 1;
            }
        }
        int i4 = this.f37797a;
        if (i < i4) {
            System.arraycopy(t, i, t2, i2, i4 - i);
        }
        return t2;
    }
}
