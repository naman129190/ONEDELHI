package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/zw;", "Lcom/onedelhi/secure/y43;", "", "", "i", "", "value", "Lcom/onedelhi/secure/un4;", "h", "j", "size", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.zw */
public final class C7520zw extends y43<char[]> {
    @vr2

    /* renamed from: a */
    public final char[] f38471a;

    public C7520zw(int i) {
        super(i);
        this.f38471a = new char[i];
    }

    /* renamed from: h */
    public final void mo48447h(char c) {
        char[] cArr = this.f38471a;
        int b = mo47584b();
        mo47585e(b + 1);
        cArr[b] = c;
    }

    /* renamed from: i */
    public int mo32014c(@vr2 char[] cArr) {
        jt1.m53777p(cArr, "<this>");
        return cArr.length;
    }

    @vr2
    /* renamed from: j */
    public final char[] mo48449j() {
        return (char[]) mo47587g(this.f38471a, new char[mo47586f()]);
    }
}
