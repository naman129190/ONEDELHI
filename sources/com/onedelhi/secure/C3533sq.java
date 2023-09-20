package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.onedelhi.secure.sq */
public class C3533sq implements sf3 {

    /* renamed from: a */
    public final ByteBuffer f20486a;

    public C3533sq(ByteBuffer byteBuffer) {
        this.f20486a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public int mo23150a() {
        return this.f20486a.limit();
    }

    /* renamed from: b */
    public void mo23748b(int i) {
        this.f20486a.putInt(i);
    }

    /* renamed from: c */
    public String mo23151c(int i, int i2) {
        return mq4.m21883h(this.f20486a, i, i2);
    }

    /* renamed from: d */
    public boolean mo23152d(int i) {
        return mo23158h(i) != 0;
    }

    /* renamed from: e */
    public void mo23749e(byte[] bArr, int i, int i2) {
        this.f20486a.put(bArr, i, i2);
    }

    /* renamed from: f */
    public void mo23750f(int i, short s) {
        mo23765w(i + 2);
        this.f20486a.putShort(i, s);
    }

    /* renamed from: g */
    public void mo23751g(byte b) {
        this.f20486a.put(b);
    }

    public double getDouble(int i) {
        return this.f20486a.getDouble(i);
    }

    public float getFloat(int i) {
        return this.f20486a.getFloat(i);
    }

    public int getInt(int i) {
        return this.f20486a.getInt(i);
    }

    public long getLong(int i) {
        return this.f20486a.getLong(i);
    }

    public short getShort(int i) {
        return this.f20486a.getShort(i);
    }

    /* renamed from: h */
    public byte mo23158h(int i) {
        return this.f20486a.get(i);
    }

    /* renamed from: i */
    public void mo23752i(int i, int i2) {
        mo23765w(i + 4);
        this.f20486a.putInt(i, i2);
    }

    /* renamed from: j */
    public void mo23753j(long j) {
        this.f20486a.putLong(j);
    }

    /* renamed from: k */
    public void mo23754k(int i, boolean z) {
        mo23760q(i, z ? (byte) 1 : 0);
    }

    /* renamed from: l */
    public void mo23755l(int i, long j) {
        mo23765w(i + 8);
        this.f20486a.putLong(i, j);
    }

    /* renamed from: m */
    public void mo23756m(double d) {
        this.f20486a.putDouble(d);
    }

    /* renamed from: n */
    public void mo23757n(int i, byte[] bArr, int i2, int i3) {
        mo23765w((i3 - i2) + i);
        int position = this.f20486a.position();
        this.f20486a.position(i);
        this.f20486a.put(bArr, i2, i3);
        this.f20486a.position(position);
    }

    /* renamed from: o */
    public void mo23758o(int i, double d) {
        mo23765w(i + 8);
        this.f20486a.putDouble(i, d);
    }

    /* renamed from: p */
    public void mo23759p(boolean z) {
        this.f20486a.put(z ? (byte) 1 : 0);
    }

    /* renamed from: q */
    public void mo23760q(int i, byte b) {
        mo23765w(i + 1);
        this.f20486a.put(i, b);
    }

    /* renamed from: r */
    public void mo23761r(float f) {
        this.f20486a.putFloat(f);
    }

    /* renamed from: s */
    public void mo23762s(short s) {
        this.f20486a.putShort(s);
    }

    /* renamed from: t */
    public int mo23763t() {
        return this.f20486a.position();
    }

    /* renamed from: u */
    public byte[] mo23159u() {
        return this.f20486a.array();
    }

    /* renamed from: v */
    public void mo23764v(int i, float f) {
        mo23765w(i + 4);
        this.f20486a.putFloat(i, f);
    }

    /* renamed from: w */
    public boolean mo23765w(int i) {
        return i <= this.f20486a.limit();
    }
}
