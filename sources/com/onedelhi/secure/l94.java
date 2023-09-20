package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

public class l94 {

    /* renamed from: a */
    public int f15238a;

    /* renamed from: a */
    public gq4 f15239a = gq4.m16139d();

    /* renamed from: a */
    public ByteBuffer f15240a;

    /* renamed from: b */
    public int f15241b;

    /* renamed from: c */
    public int f15242c;

    /* renamed from: com.onedelhi.secure.l94$a */
    public class C2706a implements Comparator<Integer> {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f15244a;

        public C2706a(ByteBuffer byteBuffer) {
            this.f15244a = byteBuffer;
        }

        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            return l94.this.mo19357s(num, num2, this.f15244a);
        }
    }

    /* renamed from: a */
    public static boolean m20355a(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i = 0; i < 4; i++) {
                if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    /* renamed from: c */
    public static int m20356c(int i, ByteBuffer byteBuffer) {
        return i + byteBuffer.getInt(i);
    }

    /* renamed from: e */
    public static int m20357e(int i, int i2, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    /* renamed from: i */
    public static String m20358i(int i, ByteBuffer byteBuffer, gq4 gq4) {
        int i2 = i + byteBuffer.getInt(i);
        return gq4.mo16832a(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    /* renamed from: k */
    public static l94 m20359k(l94 l94, int i, ByteBuffer byteBuffer) {
        l94.mo19349g(m20356c(i, byteBuffer), byteBuffer);
        return l94;
    }

    /* renamed from: p */
    public static int m20360p(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = i + byteBuffer.getInt(i);
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int min = Math.min(i5, i6);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    /* renamed from: q */
    public static int m20361q(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int min = Math.min(i3, length);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    /* renamed from: b */
    public int mo19346b(int i) {
        return i + this.f15240a.getInt(i);
    }

    /* renamed from: d */
    public int mo19347d(int i) {
        if (i < this.f15242c) {
            return this.f15240a.getShort(this.f15241b + i);
        }
        return 0;
    }

    /* renamed from: f */
    public void mo19348f() {
        mo19349g(0, (ByteBuffer) null);
    }

    /* renamed from: g */
    public void mo19349g(int i, ByteBuffer byteBuffer) {
        short s;
        this.f15240a = byteBuffer;
        if (byteBuffer != null) {
            this.f15238a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f15241b = i2;
            s = this.f15240a.getShort(i2);
        } else {
            s = 0;
            this.f15238a = 0;
            this.f15241b = 0;
        }
        this.f15242c = s;
    }

    /* renamed from: h */
    public String mo19350h(int i) {
        return m20358i(i, this.f15240a, this.f15239a);
    }

    /* renamed from: j */
    public l94 mo19351j(l94 l94, int i) {
        return m20359k(l94, i, this.f15240a);
    }

    /* renamed from: l */
    public int mo19352l(int i) {
        int i2 = i + this.f15238a;
        return i2 + this.f15240a.getInt(i2) + 4;
    }

    /* renamed from: m */
    public ByteBuffer mo19353m(int i, int i2) {
        int d = mo19347d(i);
        if (d == 0) {
            return null;
        }
        ByteBuffer order = this.f15240a.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int l = mo19352l(d);
        order.position(l);
        order.limit(l + (mo19355o(d) * i2));
        return order;
    }

    /* renamed from: n */
    public ByteBuffer mo19354n(ByteBuffer byteBuffer, int i, int i2) {
        int d = mo19347d(i);
        if (d == 0) {
            return null;
        }
        int l = mo19352l(d);
        byteBuffer.rewind();
        byteBuffer.limit((mo19355o(d) * i2) + l);
        byteBuffer.position(l);
        return byteBuffer;
    }

    /* renamed from: o */
    public int mo19355o(int i) {
        int i2 = i + this.f15238a;
        return this.f15240a.getInt(i2 + this.f15240a.getInt(i2));
    }

    /* renamed from: r */
    public ByteBuffer mo19356r() {
        return this.f15240a;
    }

    /* renamed from: s */
    public int mo19357s(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    /* renamed from: t */
    public void mo19358t(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new C2706a(byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }
}
