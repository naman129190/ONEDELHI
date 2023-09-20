package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class o71 {

    /* renamed from: d */
    public static final /* synthetic */ boolean f17844d = false;

    /* renamed from: a */
    public int f17845a;

    /* renamed from: a */
    public final gq4 f17846a;

    /* renamed from: a */
    public C3034b f17847a;

    /* renamed from: a */
    public ByteBuffer f17848a;

    /* renamed from: a */
    public boolean f17849a;

    /* renamed from: a */
    public int[] f17850a;

    /* renamed from: b */
    public int f17851b;

    /* renamed from: b */
    public boolean f17852b;

    /* renamed from: b */
    public int[] f17853b;

    /* renamed from: c */
    public int f17854c;

    /* renamed from: c */
    public boolean f17855c;

    /* renamed from: d */
    public int f17856d;

    /* renamed from: e */
    public int f17857e;

    /* renamed from: f */
    public int f17858f;

    /* renamed from: com.onedelhi.secure.o71$a */
    public static class C3033a extends InputStream {

        /* renamed from: a */
        public ByteBuffer f17859a;

        public C3033a(ByteBuffer byteBuffer) {
            this.f17859a = byteBuffer;
        }

        public int read() throws IOException {
            try {
                return this.f17859a.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.o71$b */
    public static abstract class C3034b {
        /* renamed from: a */
        public abstract ByteBuffer mo21821a(int i);

        /* renamed from: b */
        public void mo21822b(ByteBuffer byteBuffer) {
        }
    }

    /* renamed from: com.onedelhi.secure.o71$c */
    public static final class C3035c extends C3034b {

        /* renamed from: a */
        public static final C3035c f17860a = new C3035c();

        /* renamed from: a */
        public ByteBuffer mo21821a(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public o71() {
        this(1024);
    }

    public o71(int i) {
        this(i, C3035c.f17860a, (ByteBuffer) null, gq4.m16139d());
    }

    public o71(int i, C3034b bVar) {
        this(i, bVar, (ByteBuffer) null, gq4.m16139d());
    }

    public o71(int i, C3034b bVar, ByteBuffer byteBuffer, gq4 gq4) {
        this.f17851b = 1;
        this.f17850a = null;
        this.f17854c = 0;
        this.f17849a = false;
        this.f17852b = false;
        this.f17853b = new int[16];
        this.f17857e = 0;
        this.f17858f = 0;
        this.f17855c = false;
        i = i <= 0 ? 1 : i;
        this.f17847a = bVar;
        if (byteBuffer != null) {
            this.f17848a = byteBuffer;
            byteBuffer.clear();
            this.f17848a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f17848a = bVar.mo21821a(i);
        }
        this.f17846a = gq4;
        this.f17845a = this.f17848a.capacity();
    }

    public o71(ByteBuffer byteBuffer) {
        this(byteBuffer, (C3034b) new C3035c());
    }

    public o71(ByteBuffer byteBuffer, C3034b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, gq4.m16139d());
    }

    /* renamed from: N */
    public static ByteBuffer m23522N(ByteBuffer byteBuffer, C3034b bVar) {
        int capacity = byteBuffer.capacity();
        if ((-1073741824 & capacity) == 0) {
            int i = capacity == 0 ? 1 : capacity << 1;
            byteBuffer.position(0);
            ByteBuffer a = bVar.mo21821a(i);
            a.position(a.clear().capacity() - capacity);
            a.put(byteBuffer);
            return a;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    /* renamed from: P */
    public static boolean m23523P(l94 l94, int i) {
        return l94.mo19347d(i) != 0;
    }

    /* renamed from: A */
    public int mo21762A(int[] iArr) {
        mo21776Q();
        mo21801h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            mo21807n(iArr[length]);
        }
        return mo21766E();
    }

    /* renamed from: B */
    public ByteBuffer mo21763B() {
        mo21773L();
        return this.f17848a;
    }

    @Deprecated
    /* renamed from: C */
    public final int mo21764C() {
        mo21773L();
        return this.f17845a;
    }

    /* renamed from: D */
    public int mo21765D() {
        int i;
        if (this.f17850a == null || !this.f17849a) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        mo21803j(0);
        int R = mo21777R();
        int i2 = this.f17854c - 1;
        while (i2 >= 0 && this.f17850a[i2] == 0) {
            i2--;
        }
        int i3 = i2 + 1;
        while (i2 >= 0) {
            int[] iArr = this.f17850a;
            mo21810q((short) (iArr[i2] != 0 ? R - iArr[i2] : 0));
            i2--;
        }
        mo21810q((short) (R - this.f17856d));
        mo21810q((short) ((i3 + 2) * 2));
        int i4 = 0;
        loop2:
        while (true) {
            if (i4 >= this.f17857e) {
                i = 0;
                break;
            }
            int capacity = this.f17848a.capacity() - this.f17853b[i4];
            int i5 = this.f17845a;
            short s = this.f17848a.getShort(capacity);
            if (s == this.f17848a.getShort(i5)) {
                int i6 = 2;
                while (i6 < s) {
                    if (this.f17848a.getShort(capacity + i6) == this.f17848a.getShort(i5 + i6)) {
                        i6 += 2;
                    }
                }
                i = this.f17853b[i4];
                break loop2;
            }
            i4++;
        }
        if (i != 0) {
            int capacity2 = this.f17848a.capacity() - R;
            this.f17845a = capacity2;
            this.f17848a.putInt(capacity2, i - R);
        } else {
            int i7 = this.f17857e;
            int[] iArr2 = this.f17853b;
            if (i7 == iArr2.length) {
                this.f17853b = Arrays.copyOf(iArr2, i7 * 2);
            }
            int[] iArr3 = this.f17853b;
            int i8 = this.f17857e;
            this.f17857e = i8 + 1;
            iArr3[i8] = mo21777R();
            ByteBuffer byteBuffer = this.f17848a;
            byteBuffer.putInt(byteBuffer.capacity() - R, mo21777R() - R);
        }
        this.f17849a = false;
        return R;
    }

    /* renamed from: E */
    public int mo21766E() {
        if (this.f17849a) {
            this.f17849a = false;
            mo21784Y(this.f17858f);
            return mo21777R();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    /* renamed from: F */
    public void mo21767F(int i) {
        mo21770I(i, false);
    }

    /* renamed from: G */
    public void mo21768G(int i, String str) {
        mo21769H(i, str, false);
    }

    /* renamed from: H */
    public void mo21769H(int i, String str, boolean z) {
        mo21779T(this.f17851b, (z ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i2 = 3; i2 >= 0; i2--) {
                mo21792d((byte) str.charAt(i2));
            }
            mo21770I(i, z);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    /* renamed from: I */
    public void mo21770I(int i, boolean z) {
        mo21779T(this.f17851b, (z ? 4 : 0) + 4);
        mo21807n(i);
        if (z) {
            mo21803j(this.f17848a.capacity() - this.f17845a);
        }
        this.f17848a.position(this.f17845a);
        this.f17852b = true;
    }

    /* renamed from: J */
    public void mo21771J(int i) {
        mo21770I(i, true);
    }

    /* renamed from: K */
    public void mo21772K(int i, String str) {
        mo21769H(i, str, true);
    }

    /* renamed from: L */
    public void mo21773L() {
        if (!this.f17852b) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    /* renamed from: M */
    public o71 mo21774M(boolean z) {
        this.f17855c = z;
        return this;
    }

    /* renamed from: O */
    public o71 mo21775O(ByteBuffer byteBuffer, C3034b bVar) {
        this.f17847a = bVar;
        this.f17848a = byteBuffer;
        byteBuffer.clear();
        this.f17848a.order(ByteOrder.LITTLE_ENDIAN);
        this.f17851b = 1;
        this.f17845a = this.f17848a.capacity();
        this.f17854c = 0;
        this.f17849a = false;
        this.f17852b = false;
        this.f17856d = 0;
        this.f17857e = 0;
        this.f17858f = 0;
        return this;
    }

    /* renamed from: Q */
    public void mo21776Q() {
        if (this.f17849a) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    /* renamed from: R */
    public int mo21777R() {
        return this.f17848a.capacity() - this.f17845a;
    }

    /* renamed from: S */
    public void mo21778S(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f17848a;
            int i3 = this.f17845a - 1;
            this.f17845a = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    /* renamed from: T */
    public void mo21779T(int i, int i2) {
        if (i > this.f17851b) {
            this.f17851b = i;
        }
        int i3 = ((~((this.f17848a.capacity() - this.f17845a) + i2)) + 1) & (i - 1);
        while (this.f17845a < i3 + i + i2) {
            int capacity = this.f17848a.capacity();
            ByteBuffer byteBuffer = this.f17848a;
            ByteBuffer N = m23522N(byteBuffer, this.f17847a);
            this.f17848a = N;
            if (byteBuffer != N) {
                this.f17847a.mo21822b(byteBuffer);
            }
            this.f17845a += this.f17848a.capacity() - capacity;
        }
        mo21778S(i3);
    }

    /* renamed from: U */
    public void mo21780U(boolean z) {
        ByteBuffer byteBuffer = this.f17848a;
        int i = this.f17845a - 1;
        this.f17845a = i;
        byteBuffer.put(i, z ? (byte) 1 : 0);
    }

    /* renamed from: V */
    public void mo21781V(byte b) {
        ByteBuffer byteBuffer = this.f17848a;
        int i = this.f17845a - 1;
        this.f17845a = i;
        byteBuffer.put(i, b);
    }

    /* renamed from: W */
    public void mo21782W(double d) {
        ByteBuffer byteBuffer = this.f17848a;
        int i = this.f17845a - 8;
        this.f17845a = i;
        byteBuffer.putDouble(i, d);
    }

    /* renamed from: X */
    public void mo21783X(float f) {
        ByteBuffer byteBuffer = this.f17848a;
        int i = this.f17845a - 4;
        this.f17845a = i;
        byteBuffer.putFloat(i, f);
    }

    /* renamed from: Y */
    public void mo21784Y(int i) {
        ByteBuffer byteBuffer = this.f17848a;
        int i2 = this.f17845a - 4;
        this.f17845a = i2;
        byteBuffer.putInt(i2, i);
    }

    /* renamed from: Z */
    public void mo21785Z(long j) {
        ByteBuffer byteBuffer = this.f17848a;
        int i = this.f17845a - 8;
        this.f17845a = i;
        byteBuffer.putLong(i, j);
    }

    /* renamed from: a */
    public void mo21786a(int i) {
        if (i != mo21777R()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    /* renamed from: a0 */
    public void mo21787a0(short s) {
        ByteBuffer byteBuffer = this.f17848a;
        int i = this.f17845a - 2;
        this.f17845a = i;
        byteBuffer.putShort(i, s);
    }

    /* renamed from: b */
    public void mo21788b(int i, boolean z, boolean z2) {
        if (this.f17855c || z != z2) {
            mo21790c(z);
            mo21797f0(i);
        }
    }

    /* renamed from: b0 */
    public void mo21789b0(int i, int i2) {
        int capacity = this.f17848a.capacity() - i;
        if (!(this.f17848a.getShort((capacity - this.f17848a.getInt(capacity)) + i2) != 0)) {
            throw new AssertionError("FlatBuffers: field " + i2 + " must be set");
        }
    }

    /* renamed from: c */
    public void mo21790c(boolean z) {
        mo21779T(1, 0);
        mo21780U(z);
    }

    /* renamed from: c0 */
    public byte[] mo21791c0() {
        return mo21793d0(this.f17845a, this.f17848a.capacity() - this.f17845a);
    }

    /* renamed from: d */
    public void mo21792d(byte b) {
        mo21779T(1, 0);
        mo21781V(b);
    }

    /* renamed from: d0 */
    public byte[] mo21793d0(int i, int i2) {
        mo21773L();
        byte[] bArr = new byte[i2];
        this.f17848a.position(i);
        this.f17848a.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    public void mo21794e(int i, byte b, int i2) {
        if (this.f17855c || b != i2) {
            mo21792d(b);
            mo21797f0(i);
        }
    }

    /* renamed from: e0 */
    public InputStream mo21795e0() {
        mo21773L();
        ByteBuffer duplicate = this.f17848a.duplicate();
        duplicate.position(this.f17845a);
        duplicate.limit(this.f17848a.capacity());
        return new C3033a(duplicate);
    }

    /* renamed from: f */
    public void mo21796f(double d) {
        mo21779T(8, 0);
        mo21782W(d);
    }

    /* renamed from: f0 */
    public void mo21797f0(int i) {
        this.f17850a[i] = mo21777R();
    }

    /* renamed from: g */
    public void mo21798g(int i, double d, double d2) {
        if (this.f17855c || d != d2) {
            mo21796f(d);
            mo21797f0(i);
        }
    }

    /* renamed from: g0 */
    public void mo21799g0(int i) {
        mo21776Q();
        int[] iArr = this.f17850a;
        if (iArr == null || iArr.length < i) {
            this.f17850a = new int[i];
        }
        this.f17854c = i;
        Arrays.fill(this.f17850a, 0, i, 0);
        this.f17849a = true;
        this.f17856d = mo21777R();
    }

    /* renamed from: h */
    public void mo21800h(float f) {
        mo21779T(4, 0);
        mo21783X(f);
    }

    /* renamed from: h0 */
    public void mo21801h0(int i, int i2, int i3) {
        mo21776Q();
        this.f17858f = i2;
        int i4 = i * i2;
        mo21779T(4, i4);
        mo21779T(i3, i4);
        this.f17849a = true;
    }

    /* renamed from: i */
    public void mo21802i(int i, float f, double d) {
        if (this.f17855c || ((double) f) != d) {
            mo21800h(f);
            mo21797f0(i);
        }
    }

    /* renamed from: j */
    public void mo21803j(int i) {
        mo21779T(4, 0);
        mo21784Y(i);
    }

    /* renamed from: k */
    public void mo21804k(int i, int i2, int i3) {
        if (this.f17855c || i2 != i3) {
            mo21803j(i2);
            mo21797f0(i);
        }
    }

    /* renamed from: l */
    public void mo21805l(int i, long j, long j2) {
        if (this.f17855c || j != j2) {
            mo21806m(j);
            mo21797f0(i);
        }
    }

    /* renamed from: m */
    public void mo21806m(long j) {
        mo21779T(8, 0);
        mo21785Z(j);
    }

    /* renamed from: n */
    public void mo21807n(int i) {
        mo21779T(4, 0);
        mo21784Y((mo21777R() - i) + 4);
    }

    /* renamed from: o */
    public void mo21808o(int i, int i2, int i3) {
        if (this.f17855c || i2 != i3) {
            mo21807n(i2);
            mo21797f0(i);
        }
    }

    /* renamed from: p */
    public void mo21809p(int i, short s, int i2) {
        if (this.f17855c || s != i2) {
            mo21810q(s);
            mo21797f0(i);
        }
    }

    /* renamed from: q */
    public void mo21810q(short s) {
        mo21779T(2, 0);
        mo21787a0(s);
    }

    /* renamed from: r */
    public void mo21811r(int i, int i2, int i3) {
        if (i2 != i3) {
            mo21786a(i2);
            mo21797f0(i);
        }
    }

    /* renamed from: s */
    public void mo21812s() {
        this.f17845a = this.f17848a.capacity();
        this.f17848a.clear();
        this.f17851b = 1;
        while (true) {
            int i = this.f17854c;
            if (i > 0) {
                int[] iArr = this.f17850a;
                int i2 = i - 1;
                this.f17854c = i2;
                iArr[i2] = 0;
            } else {
                this.f17854c = 0;
                this.f17849a = false;
                this.f17852b = false;
                this.f17856d = 0;
                this.f17857e = 0;
                this.f17858f = 0;
                return;
            }
        }
    }

    /* renamed from: t */
    public int mo21813t(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo21801h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f17848a;
        int i = this.f17845a - remaining;
        this.f17845a = i;
        byteBuffer2.position(i);
        this.f17848a.put(byteBuffer);
        return mo21766E();
    }

    /* renamed from: u */
    public int mo21814u(byte[] bArr) {
        int length = bArr.length;
        mo21801h0(1, length, 1);
        ByteBuffer byteBuffer = this.f17848a;
        int i = this.f17845a - length;
        this.f17845a = i;
        byteBuffer.position(i);
        this.f17848a.put(bArr);
        return mo21766E();
    }

    /* renamed from: v */
    public int mo21815v(byte[] bArr, int i, int i2) {
        mo21801h0(1, i2, 1);
        ByteBuffer byteBuffer = this.f17848a;
        int i3 = this.f17845a - i2;
        this.f17845a = i3;
        byteBuffer.position(i3);
        this.f17848a.put(bArr, i, i2);
        return mo21766E();
    }

    /* renamed from: w */
    public <T extends l94> int mo21816w(T t, int[] iArr) {
        t.mo19358t(iArr, this.f17848a);
        return mo21762A(iArr);
    }

    /* renamed from: x */
    public int mo21817x(CharSequence charSequence) {
        int c = this.f17846a.mo16834c(charSequence);
        mo21792d((byte) 0);
        mo21801h0(1, c, 1);
        ByteBuffer byteBuffer = this.f17848a;
        int i = this.f17845a - c;
        this.f17845a = i;
        byteBuffer.position(i);
        this.f17846a.mo16833b(charSequence, this.f17848a);
        return mo21766E();
    }

    /* renamed from: y */
    public int mo21818y(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo21792d((byte) 0);
        mo21801h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f17848a;
        int i = this.f17845a - remaining;
        this.f17845a = i;
        byteBuffer2.position(i);
        this.f17848a.put(byteBuffer);
        return mo21766E();
    }

    /* renamed from: z */
    public ByteBuffer mo21819z(int i, int i2, int i3) {
        int i4 = i * i2;
        mo21801h0(i, i2, i3);
        ByteBuffer byteBuffer = this.f17848a;
        int i5 = this.f17845a - i4;
        this.f17845a = i5;
        byteBuffer.position(i5);
        ByteBuffer order = this.f17848a.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i4);
        return order;
    }
}
