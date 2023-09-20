package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/ks1;", "Lcom/onedelhi/secure/y43;", "", "", "i", "value", "Lcom/onedelhi/secure/un4;", "h", "j", "size", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ks1 extends y43<int[]> {
    @vr2

    /* renamed from: a */
    public final int[] f31417a;

    public ks1(int i) {
        super(i);
        this.f31417a = new int[i];
    }

    /* renamed from: h */
    public final void mo39434h(int i) {
        int[] iArr = this.f31417a;
        int b = mo47584b();
        mo47585e(b + 1);
        iArr[b] = i;
    }

    /* renamed from: i */
    public int mo32014c(@vr2 int[] iArr) {
        jt1.m53777p(iArr, "<this>");
        return iArr.length;
    }

    @vr2
    /* renamed from: j */
    public final int[] mo39436j() {
        return (int[]) mo47587g(this.f31417a, new int[mo47586f()]);
    }
}
