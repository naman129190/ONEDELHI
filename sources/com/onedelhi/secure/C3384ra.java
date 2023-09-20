package com.onedelhi.secure;

import java.util.Arrays;

/* renamed from: com.onedelhi.secure.ra */
public class C3384ra implements sf3 {

    /* renamed from: a */
    public int f19740a;

    /* renamed from: a */
    public byte[] f19741a;

    public C3384ra() {
        this(10);
    }

    public C3384ra(int i) {
        this(new byte[i]);
    }

    public C3384ra(byte[] bArr) {
        this.f19741a = bArr;
        this.f19740a = 0;
    }

    public C3384ra(byte[] bArr, int i) {
        this.f19741a = bArr;
        this.f19740a = i;
    }

    /* renamed from: a */
    public int mo23150a() {
        return this.f19740a;
    }

    /* renamed from: b */
    public void mo23748b(int i) {
        mo23752i(this.f19740a, i);
        this.f19740a += 4;
    }

    /* renamed from: c */
    public String mo23151c(int i, int i2) {
        return mq4.m21882g(this.f19741a, i, i2);
    }

    /* renamed from: d */
    public boolean mo23152d(int i) {
        return this.f19741a[i] != 0;
    }

    /* renamed from: e */
    public void mo23749e(byte[] bArr, int i, int i2) {
        mo23757n(this.f19740a, bArr, i, i2);
        this.f19740a += i2;
    }

    /* renamed from: f */
    public void mo23750f(int i, short s) {
        mo23765w(i + 2);
        byte[] bArr = this.f19741a;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    /* renamed from: g */
    public void mo23751g(byte b) {
        mo23760q(this.f19740a, b);
        this.f19740a++;
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        byte[] bArr = this.f19741a;
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public long getLong(int i) {
        byte[] bArr = this.f19741a;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((255 & ((long) bArr[i7])) << 48) | (((long) bArr[i7 + 1]) << 56);
    }

    public short getShort(int i) {
        byte[] bArr = this.f19741a;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    /* renamed from: h */
    public byte mo23158h(int i) {
        return this.f19741a[i];
    }

    /* renamed from: i */
    public void mo23752i(int i, int i2) {
        mo23765w(i + 4);
        byte[] bArr = this.f19741a;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        bArr[i4 + 1] = (byte) ((i2 >> 24) & 255);
    }

    /* renamed from: j */
    public void mo23753j(long j) {
        mo23755l(this.f19740a, j);
        this.f19740a += 8;
    }

    /* renamed from: k */
    public void mo23754k(int i, boolean z) {
        mo23760q(i, z ? (byte) 1 : 0);
    }

    /* renamed from: l */
    public void mo23755l(int i, long j) {
        mo23765w(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.f19741a;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >> 24) & 255);
        int i7 = (int) (j >> 32);
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >> 8) & 255);
        bArr[i9] = (byte) ((i7 >> 16) & 255);
        bArr[i9 + 1] = (byte) ((i7 >> 24) & 255);
    }

    /* renamed from: m */
    public void mo23756m(double d) {
        mo23758o(this.f19740a, d);
        this.f19740a += 8;
    }

    /* renamed from: n */
    public void mo23757n(int i, byte[] bArr, int i2, int i3) {
        mo23765w((i3 - i2) + i);
        System.arraycopy(bArr, i2, this.f19741a, i, i3);
    }

    /* renamed from: o */
    public void mo23758o(int i, double d) {
        mo23765w(i + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) doubleToRawLongBits;
        byte[] bArr = this.f19741a;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >> 24) & 255);
        int i7 = (int) (doubleToRawLongBits >> 32);
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >> 8) & 255);
        bArr[i9] = (byte) ((i7 >> 16) & 255);
        bArr[i9 + 1] = (byte) ((i7 >> 24) & 255);
    }

    /* renamed from: p */
    public void mo23759p(boolean z) {
        mo23754k(this.f19740a, z);
        this.f19740a++;
    }

    /* renamed from: q */
    public void mo23760q(int i, byte b) {
        mo23765w(i + 1);
        this.f19741a[i] = b;
    }

    /* renamed from: r */
    public void mo23761r(float f) {
        mo23764v(this.f19740a, f);
        this.f19740a += 4;
    }

    /* renamed from: s */
    public void mo23762s(short s) {
        mo23750f(this.f19740a, s);
        this.f19740a += 2;
    }

    /* renamed from: t */
    public int mo23763t() {
        return this.f19740a;
    }

    /* renamed from: u */
    public byte[] mo23159u() {
        return this.f19741a;
    }

    /* renamed from: v */
    public void mo23764v(int i, float f) {
        mo23765w(i + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.f19741a;
        int i2 = i + 1;
        bArr[i] = (byte) (floatToRawIntBits & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i3] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i3 + 1] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    /* renamed from: w */
    public boolean mo23765w(int i) {
        byte[] bArr = this.f19741a;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.f19741a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }
}
