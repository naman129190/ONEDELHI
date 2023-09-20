package com.onedelhi.secure;

public final class o36 extends u36 {

    /* renamed from: a */
    public final byte[] f17692a;

    /* renamed from: c */
    public int f17693c;

    /* renamed from: d */
    public int f17694d;

    /* renamed from: e */
    public int f17695e = Integer.MAX_VALUE;

    public /* synthetic */ o36(byte[] bArr, int i, int i2, boolean z, l36 l36) {
        super((r36) null);
        this.f17692a = bArr;
        this.f17693c = 0;
    }

    /* renamed from: c */
    public final int mo21595c(int i) throws t66 {
        int i2 = this.f17695e;
        this.f17695e = 0;
        int i3 = this.f17693c + this.f17694d;
        this.f17693c = i3;
        if (i3 > 0) {
            this.f17694d = i3;
            this.f17693c = i3 - i3;
        } else {
            this.f17694d = 0;
        }
        return i2;
    }
}
