package com.onedelhi.secure;

public final class yf0 extends zf0 {

    /* renamed from: d */
    public static final int f37880d = 10;

    /* renamed from: b */
    public final int f37881b;

    /* renamed from: c */
    public final int f37882c;

    public yf0(int i, int i2, int i3) throws ha1 {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw ha1.m50341a();
        }
        this.f37881b = i2;
        this.f37882c = i3;
    }

    /* renamed from: b */
    public int mo47780b() {
        return this.f37881b;
    }

    /* renamed from: c */
    public int mo47781c() {
        return this.f37882c;
    }

    /* renamed from: d */
    public int mo47782d() {
        return (this.f37881b * 10) + this.f37882c;
    }

    /* renamed from: e */
    public boolean mo47783e() {
        return this.f37881b == 10;
    }

    /* renamed from: f */
    public boolean mo47784f() {
        return this.f37882c == 10;
    }
}
