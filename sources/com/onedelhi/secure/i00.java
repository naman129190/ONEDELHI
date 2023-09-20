package com.onedelhi.secure;

import com.onedelhi.secure.hq4;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class i00 extends C4589ar {
    @Deprecated

    /* renamed from: a */
    public static final int f30015a = 4;

    /* renamed from: a */
    public static final Logger f30016a = Logger.getLogger(i00.class.getName());

    /* renamed from: b */
    public static final int f30017b = 4096;

    /* renamed from: b */
    public static final boolean f30018b = ko4.m54683U();

    /* renamed from: a */
    public j00 f30019a;

    /* renamed from: a */
    public boolean f30020a;

    /* renamed from: com.onedelhi.secure.i00$b */
    public static abstract class C5645b extends i00 {

        /* renamed from: a */
        public final byte[] f30021a;

        /* renamed from: c */
        public final int f30022c;

        /* renamed from: d */
        public int f30023d;

        /* renamed from: e */
        public int f30024e;

        public C5645b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f30021a = bArr;
                this.f30022c = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: f1 */
        public final int mo37773f1() {
            return this.f30024e;
        }

        /* renamed from: j2 */
        public final void mo37797j2(byte b) {
            byte[] bArr = this.f30021a;
            int i = this.f30023d;
            this.f30023d = i + 1;
            bArr[i] = b;
            this.f30024e++;
        }

        /* renamed from: k2 */
        public final void mo37798k2(int i) {
            byte[] bArr = this.f30021a;
            int i2 = this.f30023d;
            int i3 = i2 + 1;
            this.f30023d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f30023d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f30023d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f30023d = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f30024e += 4;
        }

        /* renamed from: l2 */
        public final void mo37799l2(long j) {
            byte[] bArr = this.f30021a;
            int i = this.f30023d;
            int i2 = i + 1;
            this.f30023d = i2;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            this.f30023d = i3;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            this.f30023d = i4;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            this.f30023d = i5;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            this.f30023d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f30023d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f30023d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f30023d = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f30024e += 8;
        }

        /* renamed from: m2 */
        public final void mo37800m2(int i) {
            if (i >= 0) {
                mo37802o2(i);
            } else {
                mo37803p2((long) i);
            }
        }

        /* renamed from: n2 */
        public final void mo37801n2(int i, int i2) {
            mo37802o2(wx4.m69700c(i, i2));
        }

        /* renamed from: o2 */
        public final void mo37802o2(int i) {
            if (i00.f30018b) {
                long j = (long) this.f30023d;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f30021a;
                    int i2 = this.f30023d;
                    this.f30023d = i2 + 1;
                    ko4.m54702g0(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f30021a;
                int i3 = this.f30023d;
                this.f30023d = i3 + 1;
                ko4.m54702g0(bArr2, (long) i3, (byte) i);
                this.f30024e += (int) (((long) this.f30023d) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f30021a;
                int i4 = this.f30023d;
                this.f30023d = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f30024e++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f30021a;
            int i5 = this.f30023d;
            this.f30023d = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f30024e++;
        }

        /* renamed from: p2 */
        public final void mo37803p2(long j) {
            if (i00.f30018b) {
                long j2 = (long) this.f30023d;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f30021a;
                    int i = this.f30023d;
                    this.f30023d = i + 1;
                    ko4.m54702g0(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f30021a;
                int i2 = this.f30023d;
                this.f30023d = i2 + 1;
                ko4.m54702g0(bArr2, (long) i2, (byte) ((int) j));
                this.f30024e += (int) (((long) this.f30023d) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f30021a;
                int i3 = this.f30023d;
                this.f30023d = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f30024e++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f30021a;
            int i4 = this.f30023d;
            this.f30023d = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f30024e++;
        }

        /* renamed from: r1 */
        public final int mo37785r1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: com.onedelhi.secure.i00$c */
    public static class C5646c extends i00 {

        /* renamed from: a */
        public final byte[] f30025a;

        /* renamed from: c */
        public final int f30026c;

        /* renamed from: d */
        public final int f30027d;

        /* renamed from: e */
        public int f30028e;

        public C5646c(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) >= 0) {
                this.f30025a = bArr;
                this.f30026c = i;
                this.f30028e = i;
                this.f30027d = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: A */
        public final void mo37732A(int i, long j) throws IOException {
            mo37776g2(i, 0);
            mo37781i2(j);
        }

        /* renamed from: C1 */
        public final void mo37736C1(int i) throws IOException {
            try {
                byte[] bArr = this.f30025a;
                int i2 = this.f30028e;
                int i3 = i2 + 1;
                this.f30028e = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                this.f30028e = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                this.f30028e = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f30028e = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f30028e), Integer.valueOf(this.f30027d), 1}), e);
            }
        }

        /* renamed from: D1 */
        public final void mo37738D1(long j) throws IOException {
            try {
                byte[] bArr = this.f30025a;
                int i = this.f30028e;
                int i2 = i + 1;
                this.f30028e = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                this.f30028e = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                this.f30028e = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                this.f30028e = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                this.f30028e = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                this.f30028e = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                this.f30028e = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f30028e = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f30028e), Integer.valueOf(this.f30027d), 1}), e);
            }
        }

        /* renamed from: J1 */
        public final void mo37744J1(int i) throws IOException {
            if (i >= 0) {
                mo37779h2(i);
            } else {
                mo37781i2((long) i);
            }
        }

        /* renamed from: L1 */
        public final void mo37747L1(int i, yh2 yh2) throws IOException {
            mo37776g2(i, 2);
            mo37749N1(yh2);
        }

        /* renamed from: M1 */
        public final void mo37748M1(int i, yh2 yh2, xr3 xr3) throws IOException {
            mo37776g2(i, 2);
            mo37779h2(((C7403z0) yh2).mo48080Yb(xr3));
            xr3.mo31764d(yh2, this.f30019a);
        }

        /* renamed from: N1 */
        public final void mo37749N1(yh2 yh2) throws IOException {
            mo37779h2(yh2.mo43354ed());
            yh2.mo43346Ia(this);
        }

        /* renamed from: O1 */
        public final void mo37750O1(yh2 yh2, xr3 xr3) throws IOException {
            mo37779h2(((C7403z0) yh2).mo48080Yb(xr3));
            xr3.mo31764d(yh2, this.f30019a);
        }

        /* renamed from: P1 */
        public final void mo37751P1(int i, yh2 yh2) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37747L1(3, yh2);
            mo37776g2(1, 4);
        }

        /* renamed from: T */
        public final void mo31112T(byte b) throws IOException {
            try {
                byte[] bArr = this.f30025a;
                int i = this.f30028e;
                this.f30028e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f30028e), Integer.valueOf(this.f30027d), 1}), e);
            }
        }

        /* renamed from: T1 */
        public final void mo37755T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo31114V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo31113U(duplicate);
        }

        /* renamed from: U */
        public final void mo31113U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f30025a, this.f30028e, remaining);
                this.f30028e += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f30028e), Integer.valueOf(this.f30027d), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: V */
        public final void mo31114V(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f30025a, this.f30028e, i2);
                this.f30028e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f30028e), Integer.valueOf(this.f30027d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: W */
        public final void mo31115W(ByteBuffer byteBuffer) throws IOException {
            mo31113U(byteBuffer);
        }

        /* renamed from: X */
        public final void mo31116X(byte[] bArr, int i, int i2) throws IOException {
            mo31114V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public final void mo37760Y1(int i, C5173er erVar) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37772f(3, erVar);
            mo37776g2(1, 4);
        }

        /* renamed from: c */
        public final void mo37766c(int i, boolean z) throws IOException {
            mo37776g2(i, 0);
            mo31112T(z ? (byte) 1 : 0);
        }

        /* renamed from: e1 */
        public void mo37770e1() {
        }

        /* renamed from: f */
        public final void mo37772f(int i, C5173er erVar) throws IOException {
            mo37776g2(i, 2);
            mo37796z1(erVar);
        }

        /* renamed from: f1 */
        public final int mo37773f1() {
            return this.f30028e - this.f30026c;
        }

        /* renamed from: f2 */
        public final void mo37774f2(String str) throws IOException {
            int i;
            int i2 = this.f30028e;
            try {
                int Z0 = i00.m51414Z0(str.length() * 3);
                int Z02 = i00.m51414Z0(str.length());
                if (Z02 == Z0) {
                    int i3 = i2 + Z02;
                    this.f30028e = i3;
                    i = hq4.m50760i(str, this.f30025a, i3, mo37785r1());
                    this.f30028e = i2;
                    mo37779h2((i - i2) - Z02);
                } else {
                    mo37779h2(hq4.m50762k(str));
                    i = hq4.m50760i(str, this.f30025a, this.f30028e, mo37785r1());
                }
                this.f30028e = i;
            } catch (hq4.C5558d e) {
                this.f30028e = i2;
                mo37775g1(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C5649f((Throwable) e2);
            }
        }

        /* renamed from: g2 */
        public final void mo37776g2(int i, int i2) throws IOException {
            mo37779h2(wx4.m69700c(i, i2));
        }

        /* renamed from: h2 */
        public final void mo37779h2(int i) throws IOException {
            if (!i00.f30018b || C6172n5.m57901c() || mo37785r1() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f30025a;
                    int i2 = this.f30028e;
                    this.f30028e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f30025a;
                    int i3 = this.f30028e;
                    this.f30028e = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f30028e), Integer.valueOf(this.f30027d), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f30025a;
                int i4 = this.f30028e;
                this.f30028e = i4 + 1;
                ko4.m54702g0(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f30025a;
                int i5 = this.f30028e;
                this.f30028e = i5 + 1;
                ko4.m54702g0(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f30025a;
                    int i7 = this.f30028e;
                    this.f30028e = i7 + 1;
                    ko4.m54702g0(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f30025a;
                int i8 = this.f30028e;
                this.f30028e = i8 + 1;
                ko4.m54702g0(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f30025a;
                    int i10 = this.f30028e;
                    this.f30028e = i10 + 1;
                    ko4.m54702g0(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f30025a;
                int i11 = this.f30028e;
                this.f30028e = i11 + 1;
                ko4.m54702g0(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f30025a;
                    int i13 = this.f30028e;
                    this.f30028e = i13 + 1;
                    ko4.m54702g0(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f30025a;
                int i14 = this.f30028e;
                this.f30028e = i14 + 1;
                ko4.m54702g0(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f30025a;
                int i15 = this.f30028e;
                this.f30028e = i15 + 1;
                ko4.m54702g0(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: i2 */
        public final void mo37781i2(long j) throws IOException {
            if (!i00.f30018b || mo37785r1() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f30025a;
                    int i = this.f30028e;
                    this.f30028e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f30025a;
                    int i2 = this.f30028e;
                    this.f30028e = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f30028e), Integer.valueOf(this.f30027d), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f30025a;
                    int i3 = this.f30028e;
                    this.f30028e = i3 + 1;
                    ko4.m54702g0(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f30025a;
                int i4 = this.f30028e;
                this.f30028e = i4 + 1;
                ko4.m54702g0(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: l */
        public final void mo37782l(int i, int i2) throws IOException {
            mo37776g2(i, 5);
            mo37736C1(i2);
        }

        /* renamed from: o */
        public final void mo37783o(int i, int i2) throws IOException {
            mo37776g2(i, 0);
            mo37779h2(i2);
        }

        /* renamed from: p */
        public final void mo37784p(int i, String str) throws IOException {
            mo37776g2(i, 2);
            mo37774f2(str);
        }

        /* renamed from: r1 */
        public final int mo37785r1() {
            return this.f30027d - this.f30028e;
        }

        /* renamed from: t */
        public final void mo37788t(int i, int i2) throws IOException {
            mo37776g2(i, 0);
            mo37744J1(i2);
        }

        /* renamed from: u1 */
        public final void mo37790u1(int i, byte[] bArr) throws IOException {
            mo37791v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public final void mo37791v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo37776g2(i, 2);
            mo37794x1(bArr, i2, i3);
        }

        /* renamed from: w */
        public final void mo37792w(int i, long j) throws IOException {
            mo37776g2(i, 1);
            mo37738D1(j);
        }

        /* renamed from: x1 */
        public final void mo37794x1(byte[] bArr, int i, int i2) throws IOException {
            mo37779h2(i2);
            mo31114V(bArr, i, i2);
        }

        /* renamed from: y1 */
        public final void mo37795y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo37776g2(i, 2);
            mo37779h2(byteBuffer.capacity());
            mo37755T1(byteBuffer);
        }

        /* renamed from: z1 */
        public final void mo37796z1(C5173er erVar) throws IOException {
            mo37779h2(erVar.size());
            erVar.mo34548s0(this);
        }
    }

    /* renamed from: com.onedelhi.secure.i00$d */
    public static final class C5647d extends C5645b {

        /* renamed from: a */
        public final C4589ar f30029a;

        public C5647d(C4589ar arVar, int i) {
            super(i);
            Objects.requireNonNull(arVar, "out");
            this.f30029a = arVar;
        }

        /* renamed from: A */
        public void mo37732A(int i, long j) throws IOException {
            mo37805r2(20);
            mo37801n2(i, 0);
            mo37803p2(j);
        }

        /* renamed from: C1 */
        public void mo37736C1(int i) throws IOException {
            mo37805r2(4);
            mo37798k2(i);
        }

        /* renamed from: D1 */
        public void mo37738D1(long j) throws IOException {
            mo37805r2(8);
            mo37799l2(j);
        }

        /* renamed from: J1 */
        public void mo37744J1(int i) throws IOException {
            if (i >= 0) {
                mo37779h2(i);
            } else {
                mo37781i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo37747L1(int i, yh2 yh2) throws IOException {
            mo37776g2(i, 2);
            mo37749N1(yh2);
        }

        /* renamed from: M1 */
        public void mo37748M1(int i, yh2 yh2, xr3 xr3) throws IOException {
            mo37776g2(i, 2);
            mo37750O1(yh2, xr3);
        }

        /* renamed from: N1 */
        public void mo37749N1(yh2 yh2) throws IOException {
            mo37779h2(yh2.mo43354ed());
            yh2.mo43346Ia(this);
        }

        /* renamed from: O1 */
        public void mo37750O1(yh2 yh2, xr3 xr3) throws IOException {
            mo37779h2(((C7403z0) yh2).mo48080Yb(xr3));
            xr3.mo31764d(yh2, this.f30019a);
        }

        /* renamed from: P1 */
        public void mo37751P1(int i, yh2 yh2) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37747L1(3, yh2);
            mo37776g2(1, 4);
        }

        /* renamed from: T */
        public void mo31112T(byte b) throws IOException {
            if (this.f30023d == this.f30022c) {
                mo37804q2();
            }
            mo37797j2(b);
        }

        /* renamed from: T1 */
        public void mo37755T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo31114V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo31113U(duplicate);
        }

        /* renamed from: U */
        public void mo31113U(ByteBuffer byteBuffer) throws IOException {
            mo37770e1();
            int remaining = byteBuffer.remaining();
            this.f30029a.mo31113U(byteBuffer);
            this.f30024e += remaining;
        }

        /* renamed from: V */
        public void mo31114V(byte[] bArr, int i, int i2) throws IOException {
            mo37770e1();
            this.f30029a.mo31114V(bArr, i, i2);
            this.f30024e += i2;
        }

        /* renamed from: W */
        public void mo31115W(ByteBuffer byteBuffer) throws IOException {
            mo37770e1();
            int remaining = byteBuffer.remaining();
            this.f30029a.mo31115W(byteBuffer);
            this.f30024e += remaining;
        }

        /* renamed from: X */
        public void mo31116X(byte[] bArr, int i, int i2) throws IOException {
            mo37770e1();
            this.f30029a.mo31116X(bArr, i, i2);
            this.f30024e += i2;
        }

        /* renamed from: Y1 */
        public void mo37760Y1(int i, C5173er erVar) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37772f(3, erVar);
            mo37776g2(1, 4);
        }

        /* renamed from: c */
        public void mo37766c(int i, boolean z) throws IOException {
            mo37805r2(11);
            mo37801n2(i, 0);
            mo37797j2(z ? (byte) 1 : 0);
        }

        /* renamed from: e1 */
        public void mo37770e1() throws IOException {
            if (this.f30023d > 0) {
                mo37804q2();
            }
        }

        /* renamed from: f */
        public void mo37772f(int i, C5173er erVar) throws IOException {
            mo37776g2(i, 2);
            mo37796z1(erVar);
        }

        /* renamed from: f2 */
        public void mo37774f2(String str) throws IOException {
            int length = str.length() * 3;
            int Z0 = i00.m51414Z0(length);
            int i = Z0 + length;
            int i2 = this.f30022c;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int i3 = hq4.m50760i(str, bArr, 0, length);
                mo37779h2(i3);
                mo31116X(bArr, 0, i3);
                return;
            }
            if (i > i2 - this.f30023d) {
                mo37804q2();
            }
            int i4 = this.f30023d;
            try {
                int Z02 = i00.m51414Z0(str.length());
                if (Z02 == Z0) {
                    int i5 = i4 + Z02;
                    this.f30023d = i5;
                    int i6 = hq4.m50760i(str, this.f30021a, i5, this.f30022c - i5);
                    this.f30023d = i4;
                    int i7 = (i6 - i4) - Z02;
                    mo37802o2(i7);
                    this.f30023d = i6;
                    this.f30024e += i7;
                    return;
                }
                int k = hq4.m50762k(str);
                mo37802o2(k);
                this.f30023d = hq4.m50760i(str, this.f30021a, this.f30023d, k);
                this.f30024e += k;
            } catch (hq4.C5558d e) {
                this.f30024e -= this.f30023d - i4;
                this.f30023d = i4;
                mo37775g1(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C5649f((Throwable) e2);
            }
        }

        /* renamed from: g2 */
        public void mo37776g2(int i, int i2) throws IOException {
            mo37779h2(wx4.m69700c(i, i2));
        }

        /* renamed from: h2 */
        public void mo37779h2(int i) throws IOException {
            mo37805r2(5);
            mo37802o2(i);
        }

        /* renamed from: i2 */
        public void mo37781i2(long j) throws IOException {
            mo37805r2(10);
            mo37803p2(j);
        }

        /* renamed from: l */
        public void mo37782l(int i, int i2) throws IOException {
            mo37805r2(14);
            mo37801n2(i, 5);
            mo37798k2(i2);
        }

        /* renamed from: o */
        public void mo37783o(int i, int i2) throws IOException {
            mo37805r2(20);
            mo37801n2(i, 0);
            mo37802o2(i2);
        }

        /* renamed from: p */
        public void mo37784p(int i, String str) throws IOException {
            mo37776g2(i, 2);
            mo37774f2(str);
        }

        /* renamed from: q2 */
        public final void mo37804q2() throws IOException {
            this.f30029a.mo31114V(this.f30021a, 0, this.f30023d);
            this.f30023d = 0;
        }

        /* renamed from: r2 */
        public final void mo37805r2(int i) throws IOException {
            if (this.f30022c - this.f30023d < i) {
                mo37804q2();
            }
        }

        /* renamed from: t */
        public void mo37788t(int i, int i2) throws IOException {
            mo37805r2(20);
            mo37801n2(i, 0);
            mo37800m2(i2);
        }

        /* renamed from: u1 */
        public void mo37790u1(int i, byte[] bArr) throws IOException {
            mo37791v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo37791v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo37776g2(i, 2);
            mo37794x1(bArr, i2, i3);
        }

        /* renamed from: w */
        public void mo37792w(int i, long j) throws IOException {
            mo37805r2(18);
            mo37801n2(i, 1);
            mo37799l2(j);
        }

        /* renamed from: x1 */
        public void mo37794x1(byte[] bArr, int i, int i2) throws IOException {
            mo37779h2(i2);
            mo31114V(bArr, i, i2);
        }

        /* renamed from: y1 */
        public void mo37795y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo37776g2(i, 2);
            mo37779h2(byteBuffer.capacity());
            mo37755T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo37796z1(C5173er erVar) throws IOException {
            mo37779h2(erVar.size());
            erVar.mo34548s0(this);
        }
    }

    /* renamed from: com.onedelhi.secure.i00$e */
    public static final class C5648e extends C5646c {

        /* renamed from: a */
        public final ByteBuffer f30030a;

        /* renamed from: f */
        public int f30031f;

        public C5648e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f30030a = byteBuffer;
            this.f30031f = byteBuffer.position();
        }

        /* renamed from: e1 */
        public void mo37770e1() {
            this.f30030a.position(this.f30031f + mo37773f1());
        }
    }

    /* renamed from: com.onedelhi.secure.i00$f */
    public static class C5649f extends IOException {

        /* renamed from: b */
        public static final long f30032b = -6947486886997889499L;

        /* renamed from: b */
        public static final String f30033b = "CodedOutputStream was writing to a flat byte array and ran out of space.";

        public C5649f() {
            super(f30033b);
        }

        public C5649f(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public C5649f(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public C5649f(Throwable th) {
            super(f30033b, th);
        }
    }

    /* renamed from: com.onedelhi.secure.i00$g */
    public static final class C5650g extends C5645b {

        /* renamed from: a */
        public final OutputStream f30034a;

        public C5650g(OutputStream outputStream, int i) {
            super(i);
            Objects.requireNonNull(outputStream, "out");
            this.f30034a = outputStream;
        }

        /* renamed from: A */
        public void mo37732A(int i, long j) throws IOException {
            mo37807r2(20);
            mo37801n2(i, 0);
            mo37803p2(j);
        }

        /* renamed from: C1 */
        public void mo37736C1(int i) throws IOException {
            mo37807r2(4);
            mo37798k2(i);
        }

        /* renamed from: D1 */
        public void mo37738D1(long j) throws IOException {
            mo37807r2(8);
            mo37799l2(j);
        }

        /* renamed from: J1 */
        public void mo37744J1(int i) throws IOException {
            if (i >= 0) {
                mo37779h2(i);
            } else {
                mo37781i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo37747L1(int i, yh2 yh2) throws IOException {
            mo37776g2(i, 2);
            mo37749N1(yh2);
        }

        /* renamed from: M1 */
        public void mo37748M1(int i, yh2 yh2, xr3 xr3) throws IOException {
            mo37776g2(i, 2);
            mo37750O1(yh2, xr3);
        }

        /* renamed from: N1 */
        public void mo37749N1(yh2 yh2) throws IOException {
            mo37779h2(yh2.mo43354ed());
            yh2.mo43346Ia(this);
        }

        /* renamed from: O1 */
        public void mo37750O1(yh2 yh2, xr3 xr3) throws IOException {
            mo37779h2(((C7403z0) yh2).mo48080Yb(xr3));
            xr3.mo31764d(yh2, this.f30019a);
        }

        /* renamed from: P1 */
        public void mo37751P1(int i, yh2 yh2) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37747L1(3, yh2);
            mo37776g2(1, 4);
        }

        /* renamed from: T */
        public void mo31112T(byte b) throws IOException {
            if (this.f30023d == this.f30022c) {
                mo37806q2();
            }
            mo37797j2(b);
        }

        /* renamed from: T1 */
        public void mo37755T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo31114V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo31113U(duplicate);
        }

        /* renamed from: U */
        public void mo31113U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.f30022c;
            int i2 = this.f30023d;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f30021a, i2, remaining);
                this.f30023d += remaining;
            } else {
                int i3 = i - i2;
                byteBuffer.get(this.f30021a, i2, i3);
                remaining -= i3;
                this.f30023d = this.f30022c;
                this.f30024e += i3;
                mo37806q2();
                while (true) {
                    int i4 = this.f30022c;
                    if (remaining <= i4) {
                        break;
                    }
                    byteBuffer.get(this.f30021a, 0, i4);
                    this.f30034a.write(this.f30021a, 0, this.f30022c);
                    int i5 = this.f30022c;
                    remaining -= i5;
                    this.f30024e += i5;
                }
                byteBuffer.get(this.f30021a, 0, remaining);
                this.f30023d = remaining;
            }
            this.f30024e += remaining;
        }

        /* renamed from: V */
        public void mo31114V(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f30022c;
            int i4 = this.f30023d;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f30021a, i4, i2);
                this.f30023d += i2;
            } else {
                int i5 = i3 - i4;
                System.arraycopy(bArr, i, this.f30021a, i4, i5);
                int i6 = i + i5;
                i2 -= i5;
                this.f30023d = this.f30022c;
                this.f30024e += i5;
                mo37806q2();
                if (i2 <= this.f30022c) {
                    System.arraycopy(bArr, i6, this.f30021a, 0, i2);
                    this.f30023d = i2;
                } else {
                    this.f30034a.write(bArr, i6, i2);
                }
            }
            this.f30024e += i2;
        }

        /* renamed from: W */
        public void mo31115W(ByteBuffer byteBuffer) throws IOException {
            mo31113U(byteBuffer);
        }

        /* renamed from: X */
        public void mo31116X(byte[] bArr, int i, int i2) throws IOException {
            mo31114V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public void mo37760Y1(int i, C5173er erVar) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37772f(3, erVar);
            mo37776g2(1, 4);
        }

        /* renamed from: c */
        public void mo37766c(int i, boolean z) throws IOException {
            mo37807r2(11);
            mo37801n2(i, 0);
            mo37797j2(z ? (byte) 1 : 0);
        }

        /* renamed from: e1 */
        public void mo37770e1() throws IOException {
            if (this.f30023d > 0) {
                mo37806q2();
            }
        }

        /* renamed from: f */
        public void mo37772f(int i, C5173er erVar) throws IOException {
            mo37776g2(i, 2);
            mo37796z1(erVar);
        }

        /* renamed from: f2 */
        public void mo37774f2(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int Z0 = i00.m51414Z0(length);
                int i3 = Z0 + length;
                int i4 = this.f30022c;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int i5 = hq4.m50760i(str, bArr, 0, length);
                    mo37779h2(i5);
                    mo31116X(bArr, 0, i5);
                    return;
                }
                if (i3 > i4 - this.f30023d) {
                    mo37806q2();
                }
                int Z02 = i00.m51414Z0(str.length());
                i = this.f30023d;
                if (Z02 == Z0) {
                    int i6 = i + Z02;
                    this.f30023d = i6;
                    int i7 = hq4.m50760i(str, this.f30021a, i6, this.f30022c - i6);
                    this.f30023d = i;
                    i2 = (i7 - i) - Z02;
                    mo37802o2(i2);
                    this.f30023d = i7;
                } else {
                    i2 = hq4.m50762k(str);
                    mo37802o2(i2);
                    this.f30023d = hq4.m50760i(str, this.f30021a, this.f30023d, i2);
                }
                this.f30024e += i2;
            } catch (hq4.C5558d e) {
                this.f30024e -= this.f30023d - i;
                this.f30023d = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C5649f((Throwable) e2);
            } catch (hq4.C5558d e3) {
                mo37775g1(str, e3);
            }
        }

        /* renamed from: g2 */
        public void mo37776g2(int i, int i2) throws IOException {
            mo37779h2(wx4.m69700c(i, i2));
        }

        /* renamed from: h2 */
        public void mo37779h2(int i) throws IOException {
            mo37807r2(5);
            mo37802o2(i);
        }

        /* renamed from: i2 */
        public void mo37781i2(long j) throws IOException {
            mo37807r2(10);
            mo37803p2(j);
        }

        /* renamed from: l */
        public void mo37782l(int i, int i2) throws IOException {
            mo37807r2(14);
            mo37801n2(i, 5);
            mo37798k2(i2);
        }

        /* renamed from: o */
        public void mo37783o(int i, int i2) throws IOException {
            mo37807r2(20);
            mo37801n2(i, 0);
            mo37802o2(i2);
        }

        /* renamed from: p */
        public void mo37784p(int i, String str) throws IOException {
            mo37776g2(i, 2);
            mo37774f2(str);
        }

        /* renamed from: q2 */
        public final void mo37806q2() throws IOException {
            this.f30034a.write(this.f30021a, 0, this.f30023d);
            this.f30023d = 0;
        }

        /* renamed from: r2 */
        public final void mo37807r2(int i) throws IOException {
            if (this.f30022c - this.f30023d < i) {
                mo37806q2();
            }
        }

        /* renamed from: t */
        public void mo37788t(int i, int i2) throws IOException {
            mo37807r2(20);
            mo37801n2(i, 0);
            mo37800m2(i2);
        }

        /* renamed from: u1 */
        public void mo37790u1(int i, byte[] bArr) throws IOException {
            mo37791v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo37791v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo37776g2(i, 2);
            mo37794x1(bArr, i2, i3);
        }

        /* renamed from: w */
        public void mo37792w(int i, long j) throws IOException {
            mo37807r2(18);
            mo37801n2(i, 1);
            mo37799l2(j);
        }

        /* renamed from: x1 */
        public void mo37794x1(byte[] bArr, int i, int i2) throws IOException {
            mo37779h2(i2);
            mo31114V(bArr, i, i2);
        }

        /* renamed from: y1 */
        public void mo37795y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo37776g2(i, 2);
            mo37779h2(byteBuffer.capacity());
            mo37755T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo37796z1(C5173er erVar) throws IOException {
            mo37779h2(erVar.size());
            erVar.mo34548s0(this);
        }
    }

    /* renamed from: com.onedelhi.secure.i00$h */
    public static final class C5651h extends i00 {

        /* renamed from: a */
        public final ByteBuffer f30035a;

        /* renamed from: b */
        public final ByteBuffer f30036b;

        /* renamed from: c */
        public final int f30037c;

        public C5651h(ByteBuffer byteBuffer) {
            super();
            this.f30035a = byteBuffer;
            this.f30036b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f30037c = byteBuffer.position();
        }

        /* renamed from: A */
        public void mo37732A(int i, long j) throws IOException {
            mo37776g2(i, 0);
            mo37781i2(j);
        }

        /* renamed from: C1 */
        public void mo37736C1(int i) throws IOException {
            try {
                this.f30036b.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C5649f((Throwable) e);
            }
        }

        /* renamed from: D1 */
        public void mo37738D1(long j) throws IOException {
            try {
                this.f30036b.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C5649f((Throwable) e);
            }
        }

        /* renamed from: J1 */
        public void mo37744J1(int i) throws IOException {
            if (i >= 0) {
                mo37779h2(i);
            } else {
                mo37781i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo37747L1(int i, yh2 yh2) throws IOException {
            mo37776g2(i, 2);
            mo37749N1(yh2);
        }

        /* renamed from: M1 */
        public void mo37748M1(int i, yh2 yh2, xr3 xr3) throws IOException {
            mo37776g2(i, 2);
            mo37750O1(yh2, xr3);
        }

        /* renamed from: N1 */
        public void mo37749N1(yh2 yh2) throws IOException {
            mo37779h2(yh2.mo43354ed());
            yh2.mo43346Ia(this);
        }

        /* renamed from: O1 */
        public void mo37750O1(yh2 yh2, xr3 xr3) throws IOException {
            mo37779h2(((C7403z0) yh2).mo48080Yb(xr3));
            xr3.mo31764d(yh2, this.f30019a);
        }

        /* renamed from: P1 */
        public void mo37751P1(int i, yh2 yh2) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37747L1(3, yh2);
            mo37776g2(1, 4);
        }

        /* renamed from: T */
        public void mo31112T(byte b) throws IOException {
            try {
                this.f30036b.put(b);
            } catch (BufferOverflowException e) {
                throw new C5649f((Throwable) e);
            }
        }

        /* renamed from: T1 */
        public void mo37755T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo31114V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo31113U(duplicate);
        }

        /* renamed from: U */
        public void mo31113U(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f30036b.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new C5649f((Throwable) e);
            }
        }

        /* renamed from: V */
        public void mo31114V(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f30036b.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C5649f((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C5649f((Throwable) e2);
            }
        }

        /* renamed from: W */
        public void mo31115W(ByteBuffer byteBuffer) throws IOException {
            mo31113U(byteBuffer);
        }

        /* renamed from: X */
        public void mo31116X(byte[] bArr, int i, int i2) throws IOException {
            mo31114V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public void mo37760Y1(int i, C5173er erVar) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37772f(3, erVar);
            mo37776g2(1, 4);
        }

        /* renamed from: c */
        public void mo37766c(int i, boolean z) throws IOException {
            mo37776g2(i, 0);
            mo31112T(z ? (byte) 1 : 0);
        }

        /* renamed from: e1 */
        public void mo37770e1() {
            this.f30035a.position(this.f30036b.position());
        }

        /* renamed from: f */
        public void mo37772f(int i, C5173er erVar) throws IOException {
            mo37776g2(i, 2);
            mo37796z1(erVar);
        }

        /* renamed from: f1 */
        public int mo37773f1() {
            return this.f30036b.position() - this.f30037c;
        }

        /* renamed from: f2 */
        public void mo37774f2(String str) throws IOException {
            int position = this.f30036b.position();
            try {
                int Z0 = i00.m51414Z0(str.length() * 3);
                int Z02 = i00.m51414Z0(str.length());
                if (Z02 == Z0) {
                    int position2 = this.f30036b.position() + Z02;
                    this.f30036b.position(position2);
                    mo37808j2(str);
                    int position3 = this.f30036b.position();
                    this.f30036b.position(position);
                    mo37779h2(position3 - position2);
                    this.f30036b.position(position3);
                    return;
                }
                mo37779h2(hq4.m50762k(str));
                mo37808j2(str);
            } catch (hq4.C5558d e) {
                this.f30036b.position(position);
                mo37775g1(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C5649f((Throwable) e2);
            }
        }

        /* renamed from: g2 */
        public void mo37776g2(int i, int i2) throws IOException {
            mo37779h2(wx4.m69700c(i, i2));
        }

        /* renamed from: h2 */
        public void mo37779h2(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f30036b.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f30036b.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new C5649f((Throwable) e);
            }
        }

        /* renamed from: i2 */
        public void mo37781i2(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f30036b.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f30036b.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new C5649f((Throwable) e);
            }
        }

        /* renamed from: j2 */
        public final void mo37808j2(String str) throws IOException {
            try {
                hq4.m50761j(str, this.f30036b);
            } catch (IndexOutOfBoundsException e) {
                throw new C5649f((Throwable) e);
            }
        }

        /* renamed from: l */
        public void mo37782l(int i, int i2) throws IOException {
            mo37776g2(i, 5);
            mo37736C1(i2);
        }

        /* renamed from: o */
        public void mo37783o(int i, int i2) throws IOException {
            mo37776g2(i, 0);
            mo37779h2(i2);
        }

        /* renamed from: p */
        public void mo37784p(int i, String str) throws IOException {
            mo37776g2(i, 2);
            mo37774f2(str);
        }

        /* renamed from: r1 */
        public int mo37785r1() {
            return this.f30036b.remaining();
        }

        /* renamed from: t */
        public void mo37788t(int i, int i2) throws IOException {
            mo37776g2(i, 0);
            mo37744J1(i2);
        }

        /* renamed from: u1 */
        public void mo37790u1(int i, byte[] bArr) throws IOException {
            mo37791v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo37791v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo37776g2(i, 2);
            mo37794x1(bArr, i2, i3);
        }

        /* renamed from: w */
        public void mo37792w(int i, long j) throws IOException {
            mo37776g2(i, 1);
            mo37738D1(j);
        }

        /* renamed from: x1 */
        public void mo37794x1(byte[] bArr, int i, int i2) throws IOException {
            mo37779h2(i2);
            mo31114V(bArr, i, i2);
        }

        /* renamed from: y1 */
        public void mo37795y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo37776g2(i, 2);
            mo37779h2(byteBuffer.capacity());
            mo37755T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo37796z1(C5173er erVar) throws IOException {
            mo37779h2(erVar.size());
            erVar.mo34548s0(this);
        }
    }

    /* renamed from: com.onedelhi.secure.i00$i */
    public static final class C5652i extends i00 {

        /* renamed from: a */
        public final long f30038a;

        /* renamed from: a */
        public final ByteBuffer f30039a;

        /* renamed from: b */
        public final long f30040b;

        /* renamed from: b */
        public final ByteBuffer f30041b;

        /* renamed from: c */
        public final long f30042c;

        /* renamed from: d */
        public final long f30043d;

        /* renamed from: e */
        public long f30044e;

        public C5652i(ByteBuffer byteBuffer) {
            super();
            this.f30039a = byteBuffer;
            this.f30041b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long k = ko4.m54709k(byteBuffer);
            this.f30038a = k;
            long position = ((long) byteBuffer.position()) + k;
            this.f30040b = position;
            long limit = k + ((long) byteBuffer.limit());
            this.f30042c = limit;
            this.f30043d = limit - 10;
            this.f30044e = position;
        }

        /* renamed from: k2 */
        public static boolean m51675k2() {
            return ko4.m54684V();
        }

        /* renamed from: A */
        public void mo37732A(int i, long j) throws IOException {
            mo37776g2(i, 0);
            mo37781i2(j);
        }

        /* renamed from: C1 */
        public void mo37736C1(int i) throws IOException {
            this.f30041b.putInt(mo37809j2(this.f30044e), i);
            this.f30044e += 4;
        }

        /* renamed from: D1 */
        public void mo37738D1(long j) throws IOException {
            this.f30041b.putLong(mo37809j2(this.f30044e), j);
            this.f30044e += 8;
        }

        /* renamed from: J1 */
        public void mo37744J1(int i) throws IOException {
            if (i >= 0) {
                mo37779h2(i);
            } else {
                mo37781i2((long) i);
            }
        }

        /* renamed from: L1 */
        public void mo37747L1(int i, yh2 yh2) throws IOException {
            mo37776g2(i, 2);
            mo37749N1(yh2);
        }

        /* renamed from: M1 */
        public void mo37748M1(int i, yh2 yh2, xr3 xr3) throws IOException {
            mo37776g2(i, 2);
            mo37750O1(yh2, xr3);
        }

        /* renamed from: N1 */
        public void mo37749N1(yh2 yh2) throws IOException {
            mo37779h2(yh2.mo43354ed());
            yh2.mo43346Ia(this);
        }

        /* renamed from: O1 */
        public void mo37750O1(yh2 yh2, xr3 xr3) throws IOException {
            mo37779h2(((C7403z0) yh2).mo48080Yb(xr3));
            xr3.mo31764d(yh2, this.f30019a);
        }

        /* renamed from: P1 */
        public void mo37751P1(int i, yh2 yh2) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37747L1(3, yh2);
            mo37776g2(1, 4);
        }

        /* renamed from: T */
        public void mo31112T(byte b) throws IOException {
            long j = this.f30044e;
            if (j < this.f30042c) {
                this.f30044e = 1 + j;
                ko4.m54698e0(j, b);
                return;
            }
            throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f30044e), Long.valueOf(this.f30042c), 1}));
        }

        /* renamed from: T1 */
        public void mo37755T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                mo31114V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            mo31113U(duplicate);
        }

        /* renamed from: U */
        public void mo31113U(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                mo37810l2(this.f30044e);
                this.f30041b.put(byteBuffer);
                this.f30044e += (long) remaining;
            } catch (BufferOverflowException e) {
                throw new C5649f((Throwable) e);
            }
        }

        /* renamed from: V */
        public void mo31114V(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.f30044e;
                if (this.f30042c - j >= j2) {
                    ko4.m54721q(bArr, (long) i, j2, j);
                    this.f30044e += j;
                    return;
                }
            }
            Objects.requireNonNull(bArr, "value");
            throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f30044e), Long.valueOf(this.f30042c), Integer.valueOf(i2)}));
        }

        /* renamed from: W */
        public void mo31115W(ByteBuffer byteBuffer) throws IOException {
            mo31113U(byteBuffer);
        }

        /* renamed from: X */
        public void mo31116X(byte[] bArr, int i, int i2) throws IOException {
            mo31114V(bArr, i, i2);
        }

        /* renamed from: Y1 */
        public void mo37760Y1(int i, C5173er erVar) throws IOException {
            mo37776g2(1, 3);
            mo37783o(2, i);
            mo37772f(3, erVar);
            mo37776g2(1, 4);
        }

        /* renamed from: c */
        public void mo37766c(int i, boolean z) throws IOException {
            mo37776g2(i, 0);
            mo31112T(z ? (byte) 1 : 0);
        }

        /* renamed from: e1 */
        public void mo37770e1() {
            this.f30039a.position(mo37809j2(this.f30044e));
        }

        /* renamed from: f */
        public void mo37772f(int i, C5173er erVar) throws IOException {
            mo37776g2(i, 2);
            mo37796z1(erVar);
        }

        /* renamed from: f1 */
        public int mo37773f1() {
            return (int) (this.f30044e - this.f30040b);
        }

        /* renamed from: f2 */
        public void mo37774f2(String str) throws IOException {
            long j = this.f30044e;
            try {
                int Z0 = i00.m51414Z0(str.length() * 3);
                int Z02 = i00.m51414Z0(str.length());
                if (Z02 == Z0) {
                    int j2 = mo37809j2(this.f30044e) + Z02;
                    this.f30041b.position(j2);
                    hq4.m50761j(str, this.f30041b);
                    int position = this.f30041b.position() - j2;
                    mo37779h2(position);
                    this.f30044e += (long) position;
                    return;
                }
                int k = hq4.m50762k(str);
                mo37779h2(k);
                mo37810l2(this.f30044e);
                hq4.m50761j(str, this.f30041b);
                this.f30044e += (long) k;
            } catch (hq4.C5558d e) {
                this.f30044e = j;
                mo37810l2(j);
                mo37775g1(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C5649f((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C5649f((Throwable) e3);
            }
        }

        /* renamed from: g2 */
        public void mo37776g2(int i, int i2) throws IOException {
            mo37779h2(wx4.m69700c(i, i2));
        }

        /* renamed from: h2 */
        public void mo37779h2(int i) throws IOException {
            long j;
            if (this.f30044e <= this.f30043d) {
                while ((i & -128) != 0) {
                    long j2 = this.f30044e;
                    this.f30044e = j2 + 1;
                    ko4.m54698e0(j2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                j = this.f30044e;
            } else {
                while (true) {
                    j = this.f30044e;
                    if (j >= this.f30042c) {
                        throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f30044e), Long.valueOf(this.f30042c), 1}));
                    } else if ((i & -128) == 0) {
                        break;
                    } else {
                        this.f30044e = j + 1;
                        ko4.m54698e0(j, (byte) ((i & 127) | 128));
                        i >>>= 7;
                    }
                }
            }
            this.f30044e = 1 + j;
            ko4.m54698e0(j, (byte) i);
        }

        /* renamed from: i2 */
        public void mo37781i2(long j) throws IOException {
            long j2;
            if (this.f30044e <= this.f30043d) {
                while (true) {
                    int i = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                    j2 = this.f30044e;
                    if (i == 0) {
                        break;
                    }
                    this.f30044e = j2 + 1;
                    ko4.m54698e0(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                while (true) {
                    j2 = this.f30044e;
                    if (j2 >= this.f30042c) {
                        throw new C5649f(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f30044e), Long.valueOf(this.f30042c), 1}));
                    } else if ((j & -128) == 0) {
                        break;
                    } else {
                        this.f30044e = j2 + 1;
                        ko4.m54698e0(j2, (byte) ((((int) j) & 127) | 128));
                        j >>>= 7;
                    }
                }
            }
            this.f30044e = 1 + j2;
            ko4.m54698e0(j2, (byte) ((int) j));
        }

        /* renamed from: j2 */
        public final int mo37809j2(long j) {
            return (int) (j - this.f30038a);
        }

        /* renamed from: l */
        public void mo37782l(int i, int i2) throws IOException {
            mo37776g2(i, 5);
            mo37736C1(i2);
        }

        /* renamed from: l2 */
        public final void mo37810l2(long j) {
            this.f30041b.position(mo37809j2(j));
        }

        /* renamed from: o */
        public void mo37783o(int i, int i2) throws IOException {
            mo37776g2(i, 0);
            mo37779h2(i2);
        }

        /* renamed from: p */
        public void mo37784p(int i, String str) throws IOException {
            mo37776g2(i, 2);
            mo37774f2(str);
        }

        /* renamed from: r1 */
        public int mo37785r1() {
            return (int) (this.f30042c - this.f30044e);
        }

        /* renamed from: t */
        public void mo37788t(int i, int i2) throws IOException {
            mo37776g2(i, 0);
            mo37744J1(i2);
        }

        /* renamed from: u1 */
        public void mo37790u1(int i, byte[] bArr) throws IOException {
            mo37791v1(i, bArr, 0, bArr.length);
        }

        /* renamed from: v1 */
        public void mo37791v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            mo37776g2(i, 2);
            mo37794x1(bArr, i2, i3);
        }

        /* renamed from: w */
        public void mo37792w(int i, long j) throws IOException {
            mo37776g2(i, 1);
            mo37738D1(j);
        }

        /* renamed from: x1 */
        public void mo37794x1(byte[] bArr, int i, int i2) throws IOException {
            mo37779h2(i2);
            mo31114V(bArr, i, i2);
        }

        /* renamed from: y1 */
        public void mo37795y1(int i, ByteBuffer byteBuffer) throws IOException {
            mo37776g2(i, 2);
            mo37779h2(byteBuffer.capacity());
            mo37755T1(byteBuffer);
        }

        /* renamed from: z1 */
        public void mo37796z1(C5173er erVar) throws IOException {
            mo37779h2(erVar.size());
            erVar.mo34548s0(this);
        }
    }

    public i00() {
    }

    /* renamed from: A0 */
    public static int m51388A0(int i, d22 d22) {
        return (m51411X0(1) * 2) + m51413Y0(2, i) + m51389B0(3, d22);
    }

    /* renamed from: B0 */
    public static int m51389B0(int i, d22 d22) {
        return m51411X0(i) + m51390C0(d22);
    }

    /* renamed from: C0 */
    public static int m51390C0(d22 d22) {
        return m51391D0(d22.mo34152f());
    }

    /* renamed from: D0 */
    public static int m51391D0(int i) {
        return m51414Z0(i) + i;
    }

    /* renamed from: E0 */
    public static int m51392E0(int i, yh2 yh2) {
        return (m51411X0(1) * 2) + m51413Y0(2, i) + m51393F0(3, yh2);
    }

    /* renamed from: F0 */
    public static int m51393F0(int i, yh2 yh2) {
        return m51411X0(i) + m51395H0(yh2);
    }

    /* renamed from: G0 */
    public static int m51394G0(int i, yh2 yh2, xr3 xr3) {
        return m51411X0(i) + m51396I0(yh2, xr3);
    }

    /* renamed from: H0 */
    public static int m51395H0(yh2 yh2) {
        return m51391D0(yh2.mo43354ed());
    }

    /* renamed from: I0 */
    public static int m51396I0(yh2 yh2, xr3 xr3) {
        return m51391D0(((C7403z0) yh2).mo48080Yb(xr3));
    }

    /* renamed from: J0 */
    public static int m51397J0(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: K0 */
    public static int m51398K0(int i, C5173er erVar) {
        return (m51411X0(1) * 2) + m51413Y0(2, i) + m51425g0(3, erVar);
    }

    @Deprecated
    /* renamed from: L0 */
    public static int m51399L0(int i) {
        return m51414Z0(i);
    }

    @Deprecated
    /* renamed from: M0 */
    public static int m51400M0(long j) {
        return m51418b1(j);
    }

    /* renamed from: N0 */
    public static int m51401N0(int i, int i2) {
        return m51411X0(i) + m51402O0(i2);
    }

    /* renamed from: O0 */
    public static int m51402O0(int i) {
        return 4;
    }

    /* renamed from: P0 */
    public static int m51403P0(int i, long j) {
        return m51411X0(i) + m51404Q0(j);
    }

    /* renamed from: Q0 */
    public static int m51404Q0(long j) {
        return 8;
    }

    /* renamed from: R0 */
    public static int m51405R0(int i, int i2) {
        return m51411X0(i) + m51406S0(i2);
    }

    /* renamed from: S0 */
    public static int m51406S0(int i) {
        return m51414Z0(m51420c1(i));
    }

    /* renamed from: T0 */
    public static int m51407T0(int i, long j) {
        return m51411X0(i) + m51408U0(j);
    }

    /* renamed from: U0 */
    public static int m51408U0(long j) {
        return m51418b1(m51422d1(j));
    }

    /* renamed from: V0 */
    public static int m51409V0(int i, String str) {
        return m51411X0(i) + m51410W0(str);
    }

    /* renamed from: W0 */
    public static int m51410W0(String str) {
        int i;
        try {
            i = hq4.m50762k(str);
        } catch (hq4.C5558d unused) {
            i = str.getBytes(vs1.f36665a).length;
        }
        return m51391D0(i);
    }

    /* renamed from: X0 */
    public static int m51411X0(int i) {
        return m51414Z0(wx4.m69700c(i, 0));
    }

    /* renamed from: Y0 */
    public static int m51413Y0(int i, int i2) {
        return m51411X0(i) + m51414Z0(i2);
    }

    /* renamed from: Z0 */
    public static int m51414Z0(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: a0 */
    public static int m51415a0(int i, boolean z) {
        return m51411X0(i) + m51417b0(z);
    }

    /* renamed from: a1 */
    public static int m51416a1(int i, long j) {
        return m51411X0(i) + m51418b1(j);
    }

    /* renamed from: b0 */
    public static int m51417b0(boolean z) {
        return 1;
    }

    /* renamed from: b1 */
    public static int m51418b1(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((k90.f31137g & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: c0 */
    public static int m51419c0(int i, byte[] bArr) {
        return m51411X0(i) + m51421d0(bArr);
    }

    /* renamed from: c1 */
    public static int m51420c1(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: d0 */
    public static int m51421d0(byte[] bArr) {
        return m51391D0(bArr.length);
    }

    /* renamed from: d1 */
    public static long m51422d1(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e0 */
    public static int m51423e0(int i, ByteBuffer byteBuffer) {
        return m51411X0(i) + m51424f0(byteBuffer);
    }

    /* renamed from: f0 */
    public static int m51424f0(ByteBuffer byteBuffer) {
        return m51391D0(byteBuffer.capacity());
    }

    /* renamed from: g0 */
    public static int m51425g0(int i, C5173er erVar) {
        return m51411X0(i) + m51426h0(erVar);
    }

    /* renamed from: h0 */
    public static int m51426h0(C5173er erVar) {
        return m51391D0(erVar.size());
    }

    /* renamed from: i0 */
    public static int m51427i0(int i, double d) {
        return m51411X0(i) + m51429j0(d);
    }

    /* renamed from: i1 */
    public static i00 m51428i1(C4589ar arVar, int i) {
        if (i >= 0) {
            return new C5647d(arVar, i);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    /* renamed from: j0 */
    public static int m51429j0(double d) {
        return 8;
    }

    /* renamed from: j1 */
    public static i00 m51430j1(OutputStream outputStream) {
        return m51432k1(outputStream, 4096);
    }

    /* renamed from: k0 */
    public static int m51431k0(int i, int i2) {
        return m51411X0(i) + m51433l0(i2);
    }

    /* renamed from: k1 */
    public static i00 m51432k1(OutputStream outputStream, int i) {
        return new C5650g(outputStream, i);
    }

    /* renamed from: l0 */
    public static int m51433l0(int i) {
        return m51451x0(i);
    }

    /* renamed from: l1 */
    public static i00 m51434l1(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C5648e(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return C5652i.m51675k2() ? m51444q1(byteBuffer) : m51442p1(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    /* renamed from: m0 */
    public static int m51435m0(int i, int i2) {
        return m51411X0(i) + m51437n0(i2);
    }

    @Deprecated
    /* renamed from: m1 */
    public static i00 m51436m1(ByteBuffer byteBuffer, int i) {
        return m51434l1(byteBuffer);
    }

    /* renamed from: n0 */
    public static int m51437n0(int i) {
        return 4;
    }

    /* renamed from: n1 */
    public static i00 m51438n1(byte[] bArr) {
        return m51440o1(bArr, 0, bArr.length);
    }

    /* renamed from: o0 */
    public static int m51439o0(int i, long j) {
        return m51411X0(i) + m51441p0(j);
    }

    /* renamed from: o1 */
    public static i00 m51440o1(byte[] bArr, int i, int i2) {
        return new C5646c(bArr, i, i2);
    }

    /* renamed from: p0 */
    public static int m51441p0(long j) {
        return 8;
    }

    /* renamed from: p1 */
    public static i00 m51442p1(ByteBuffer byteBuffer) {
        return new C5651h(byteBuffer);
    }

    /* renamed from: q0 */
    public static int m51443q0(int i, float f) {
        return m51411X0(i) + m51445r0(f);
    }

    /* renamed from: q1 */
    public static i00 m51444q1(ByteBuffer byteBuffer) {
        return new C5652i(byteBuffer);
    }

    /* renamed from: r0 */
    public static int m51445r0(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: s0 */
    public static int m51446s0(int i, yh2 yh2) {
        return (m51411X0(i) * 2) + m51448u0(yh2);
    }

    @Deprecated
    /* renamed from: t0 */
    public static int m51447t0(int i, yh2 yh2, xr3 xr3) {
        return (m51411X0(i) * 2) + m51449v0(yh2, xr3);
    }

    @Deprecated
    /* renamed from: u0 */
    public static int m51448u0(yh2 yh2) {
        return yh2.mo43354ed();
    }

    @Deprecated
    /* renamed from: v0 */
    public static int m51449v0(yh2 yh2, xr3 xr3) {
        return ((C7403z0) yh2).mo48080Yb(xr3);
    }

    /* renamed from: w0 */
    public static int m51450w0(int i, int i2) {
        return m51411X0(i) + m51451x0(i2);
    }

    /* renamed from: x0 */
    public static int m51451x0(int i) {
        if (i >= 0) {
            return m51414Z0(i);
        }
        return 10;
    }

    /* renamed from: y0 */
    public static int m51452y0(int i, long j) {
        return m51411X0(i) + m51453z0(j);
    }

    /* renamed from: z0 */
    public static int m51453z0(long j) {
        return m51418b1(j);
    }

    /* renamed from: A */
    public abstract void mo37732A(int i, long j) throws IOException;

    /* renamed from: A1 */
    public final void mo37733A1(double d) throws IOException {
        mo37738D1(Double.doubleToRawLongBits(d));
    }

    /* renamed from: B */
    public final void mo37734B(int i, double d) throws IOException {
        mo37792w(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: B1 */
    public final void mo37735B1(int i) throws IOException {
        mo37744J1(i);
    }

    /* renamed from: C1 */
    public abstract void mo37736C1(int i) throws IOException;

    /* renamed from: D */
    public final void mo37737D(int i, float f) throws IOException {
        mo37782l(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: D1 */
    public abstract void mo37738D1(long j) throws IOException;

    /* renamed from: E1 */
    public final void mo37739E1(float f) throws IOException {
        mo37736C1(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: F1 */
    public final void mo37740F1(int i, yh2 yh2) throws IOException {
        mo37776g2(i, 3);
        mo37742H1(yh2);
        mo37776g2(i, 4);
    }

    @Deprecated
    /* renamed from: G1 */
    public final void mo37741G1(int i, yh2 yh2, xr3 xr3) throws IOException {
        mo37776g2(i, 3);
        mo37743I1(yh2, xr3);
        mo37776g2(i, 4);
    }

    @Deprecated
    /* renamed from: H1 */
    public final void mo37742H1(yh2 yh2) throws IOException {
        yh2.mo43346Ia(this);
    }

    @Deprecated
    /* renamed from: I1 */
    public final void mo37743I1(yh2 yh2, xr3 xr3) throws IOException {
        xr3.mo31764d(yh2, this.f30019a);
    }

    /* renamed from: J1 */
    public abstract void mo37744J1(int i) throws IOException;

    /* renamed from: K1 */
    public final void mo37745K1(long j) throws IOException {
        mo37781i2(j);
    }

    /* renamed from: L */
    public final void mo37746L(int i, int i2) throws IOException {
        mo37782l(i, i2);
    }

    /* renamed from: L1 */
    public abstract void mo37747L1(int i, yh2 yh2) throws IOException;

    /* renamed from: M1 */
    public abstract void mo37748M1(int i, yh2 yh2, xr3 xr3) throws IOException;

    /* renamed from: N1 */
    public abstract void mo37749N1(yh2 yh2) throws IOException;

    /* renamed from: O1 */
    public abstract void mo37750O1(yh2 yh2, xr3 xr3) throws IOException;

    /* renamed from: P1 */
    public abstract void mo37751P1(int i, yh2 yh2) throws IOException;

    /* renamed from: Q1 */
    public final void mo37752Q1(byte b) throws IOException {
        mo31112T(b);
    }

    /* renamed from: R1 */
    public final void mo37753R1(int i) throws IOException {
        mo31112T((byte) i);
    }

    /* renamed from: S1 */
    public final void mo37754S1(C5173er erVar) throws IOException {
        erVar.mo34548s0(this);
    }

    /* renamed from: T */
    public abstract void mo31112T(byte b) throws IOException;

    /* renamed from: T1 */
    public abstract void mo37755T1(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: U */
    public abstract void mo31113U(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: U1 */
    public final void mo37756U1(byte[] bArr) throws IOException {
        mo31114V(bArr, 0, bArr.length);
    }

    /* renamed from: V */
    public abstract void mo31114V(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: V1 */
    public final void mo37757V1(byte[] bArr, int i, int i2) throws IOException {
        mo31114V(bArr, i, i2);
    }

    /* renamed from: W */
    public abstract void mo31115W(ByteBuffer byteBuffer) throws IOException;

    @Deprecated
    /* renamed from: W1 */
    public final void mo37758W1(int i) throws IOException {
        mo37736C1(i);
    }

    /* renamed from: X */
    public abstract void mo31116X(byte[] bArr, int i, int i2) throws IOException;

    @Deprecated
    /* renamed from: X1 */
    public final void mo37759X1(long j) throws IOException {
        mo37738D1(j);
    }

    /* renamed from: Y1 */
    public abstract void mo37760Y1(int i, C5173er erVar) throws IOException;

    /* renamed from: Z */
    public final void mo37761Z() {
        if (mo37785r1() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    /* renamed from: Z1 */
    public final void mo37762Z1(int i) throws IOException {
        mo37779h2(i);
    }

    /* renamed from: a */
    public final void mo37763a(int i, int i2) throws IOException {
        mo37788t(i, i2);
    }

    @Deprecated
    /* renamed from: a2 */
    public final void mo37764a2(long j) throws IOException {
        mo37781i2(j);
    }

    /* renamed from: b2 */
    public final void mo37765b2(int i) throws IOException {
        mo37736C1(i);
    }

    /* renamed from: c */
    public abstract void mo37766c(int i, boolean z) throws IOException;

    /* renamed from: c2 */
    public final void mo37767c2(long j) throws IOException {
        mo37738D1(j);
    }

    /* renamed from: d */
    public final void mo37768d(int i, long j) throws IOException {
        mo37792w(i, j);
    }

    /* renamed from: d2 */
    public final void mo37769d2(int i) throws IOException {
        mo37779h2(m51420c1(i));
    }

    /* renamed from: e1 */
    public abstract void mo37770e1() throws IOException;

    /* renamed from: e2 */
    public final void mo37771e2(long j) throws IOException {
        mo37781i2(m51422d1(j));
    }

    /* renamed from: f */
    public abstract void mo37772f(int i, C5173er erVar) throws IOException;

    /* renamed from: f1 */
    public abstract int mo37773f1();

    /* renamed from: f2 */
    public abstract void mo37774f2(String str) throws IOException;

    /* renamed from: g1 */
    public final void mo37775g1(String str, hq4.C5558d dVar) throws IOException {
        f30016a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(vs1.f36665a);
        try {
            mo37779h2(bytes.length);
            mo31116X(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C5649f((Throwable) e);
        } catch (C5649f e2) {
            throw e2;
        }
    }

    /* renamed from: g2 */
    public abstract void mo37776g2(int i, int i2) throws IOException;

    /* renamed from: h */
    public final void mo37777h(int i, long j) throws IOException {
        mo37732A(i, j);
    }

    /* renamed from: h1 */
    public boolean mo37778h1() {
        return this.f30020a;
    }

    /* renamed from: h2 */
    public abstract void mo37779h2(int i) throws IOException;

    /* renamed from: i */
    public final void mo37780i(int i, int i2) throws IOException {
        mo37783o(i, m51420c1(i2));
    }

    /* renamed from: i2 */
    public abstract void mo37781i2(long j) throws IOException;

    /* renamed from: l */
    public abstract void mo37782l(int i, int i2) throws IOException;

    /* renamed from: o */
    public abstract void mo37783o(int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo37784p(int i, String str) throws IOException;

    /* renamed from: r1 */
    public abstract int mo37785r1();

    /* renamed from: s */
    public final void mo37786s(int i, long j) throws IOException {
        mo37732A(i, m51422d1(j));
    }

    /* renamed from: s1 */
    public void mo37787s1() {
        this.f30020a = true;
    }

    /* renamed from: t */
    public abstract void mo37788t(int i, int i2) throws IOException;

    /* renamed from: t1 */
    public final void mo37789t1(boolean z) throws IOException {
        mo31112T(z ? (byte) 1 : 0);
    }

    /* renamed from: u1 */
    public abstract void mo37790u1(int i, byte[] bArr) throws IOException;

    /* renamed from: v1 */
    public abstract void mo37791v1(int i, byte[] bArr, int i2, int i3) throws IOException;

    /* renamed from: w */
    public abstract void mo37792w(int i, long j) throws IOException;

    /* renamed from: w1 */
    public final void mo37793w1(byte[] bArr) throws IOException {
        mo37794x1(bArr, 0, bArr.length);
    }

    /* renamed from: x1 */
    public abstract void mo37794x1(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: y1 */
    public abstract void mo37795y1(int i, ByteBuffer byteBuffer) throws IOException;

    /* renamed from: z1 */
    public abstract void mo37796z1(C5173er erVar) throws IOException;
}
