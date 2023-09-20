package com.onedelhi.secure;

import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.y4 */
public abstract class C7303y4 {

    /* renamed from: com.onedelhi.secure.y4$a */
    public static class C7304a extends C7303y4 {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f37787a;

        public C7304a(ByteBuffer byteBuffer) {
            this.f37787a = byteBuffer;
        }

        /* renamed from: a */
        public byte[] mo47574a() {
            return this.f37787a.array();
        }

        /* renamed from: b */
        public int mo47575b() {
            return this.f37787a.arrayOffset();
        }

        /* renamed from: c */
        public boolean mo47576c() {
            return this.f37787a.hasArray();
        }

        /* renamed from: d */
        public boolean mo47577d() {
            return true;
        }

        /* renamed from: e */
        public int mo47578e() {
            return this.f37787a.limit();
        }

        /* renamed from: f */
        public ByteBuffer mo47579f() {
            return this.f37787a;
        }

        /* renamed from: g */
        public int mo47580g() {
            return this.f37787a.position();
        }

        /* renamed from: h */
        public C7303y4 mo47581h(int i) {
            this.f37787a.position(i);
            return this;
        }

        /* renamed from: i */
        public int mo47582i() {
            return this.f37787a.remaining();
        }
    }

    /* renamed from: com.onedelhi.secure.y4$b */
    public static class C7305b extends C7303y4 {

        /* renamed from: a */
        public int f37788a;

        /* renamed from: a */
        public final /* synthetic */ byte[] f37789a;

        /* renamed from: b */
        public final /* synthetic */ int f37790b;

        /* renamed from: c */
        public final /* synthetic */ int f37791c;

        public C7305b(byte[] bArr, int i, int i2) {
            this.f37789a = bArr;
            this.f37790b = i;
            this.f37791c = i2;
        }

        /* renamed from: a */
        public byte[] mo47574a() {
            return this.f37789a;
        }

        /* renamed from: b */
        public int mo47575b() {
            return this.f37790b;
        }

        /* renamed from: c */
        public boolean mo47576c() {
            return true;
        }

        /* renamed from: d */
        public boolean mo47577d() {
            return false;
        }

        /* renamed from: e */
        public int mo47578e() {
            return this.f37791c;
        }

        /* renamed from: f */
        public ByteBuffer mo47579f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public int mo47580g() {
            return this.f37788a;
        }

        /* renamed from: h */
        public C7303y4 mo47581h(int i) {
            if (i < 0 || i > this.f37791c) {
                throw new IllegalArgumentException("Invalid position: " + i);
            }
            this.f37788a = i;
            return this;
        }

        /* renamed from: i */
        public int mo47582i() {
            return this.f37791c - this.f37788a;
        }
    }

    /* renamed from: j */
    public static C7303y4 m71221j(ByteBuffer byteBuffer) {
        vs1.m68433e(byteBuffer, "buffer");
        return new C7304a(byteBuffer);
    }

    /* renamed from: k */
    public static C7303y4 m71222k(byte[] bArr) {
        return m71224m(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static C7303y4 m71223l(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            return m71224m(bArr, i, i2);
        }
        throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: m */
    public static C7303y4 m71224m(byte[] bArr, int i, int i2) {
        return new C7305b(bArr, i, i2);
    }

    /* renamed from: a */
    public abstract byte[] mo47574a();

    /* renamed from: b */
    public abstract int mo47575b();

    /* renamed from: c */
    public abstract boolean mo47576c();

    /* renamed from: d */
    public abstract boolean mo47577d();

    /* renamed from: e */
    public abstract int mo47578e();

    /* renamed from: f */
    public abstract ByteBuffer mo47579f();

    /* renamed from: g */
    public abstract int mo47580g();

    /* renamed from: h */
    public abstract C7303y4 mo47581h(int i);

    /* renamed from: i */
    public abstract int mo47582i();
}
