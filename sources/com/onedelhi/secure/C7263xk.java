package com.onedelhi.secure;

import com.onedelhi.secure.hq4;
import com.onedelhi.secure.oc2;
import com.onedelhi.secure.ty4;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.onedelhi.secure.xk */
public abstract class C7263xk extends C4589ar implements ty4 {

    /* renamed from: c */
    public static final int f37495c = 4096;

    /* renamed from: d */
    public static final int f37496d = 1;

    /* renamed from: e */
    public static final int f37497e = 2;

    /* renamed from: a */
    public final int f37498a;

    /* renamed from: a */
    public final C6298oo f37499a;

    /* renamed from: a */
    public final ArrayDeque<C7303y4> f37500a;

    /* renamed from: b */
    public int f37501b;

    /* renamed from: com.onedelhi.secure.xk$a */
    public static /* synthetic */ class C7264a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37502a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.wx4$b[] r0 = com.onedelhi.secure.wx4.C7195b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37502a = r0
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT64     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.STRING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FLOAT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BYTES     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f37502a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.ENUM     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7263xk.C7264a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.xk$b */
    public static final class C7265b extends C7263xk {

        /* renamed from: a */
        public ByteBuffer f37503a;

        /* renamed from: f */
        public int f37504f;

        /* renamed from: g */
        public int f37505g;

        public C7265b(C6298oo ooVar, int i) {
            super(ooVar, i, (C7264a) null);
            mo47259Z0();
        }

        /* renamed from: A */
        public void mo38314A(int i, long j) {
            mo47249r0(15);
            mo47241X0(j);
            mo47235R0(i, 0);
        }

        /* renamed from: A0 */
        public void mo47219A0(long j) {
            int i = this.f37505g - 8;
            this.f37505g = i;
            this.f37503a.putLong(i + 1, j);
        }

        /* renamed from: F0 */
        public void mo47224F0(int i) {
            if (i >= 0) {
                mo47240W0(i);
            } else {
                mo47241X0((long) i);
            }
        }

        /* renamed from: H */
        public void mo38321H(int i, Object obj) throws IOException {
            mo47235R0(i, 4);
            p63.m60498a().mo42387k(obj, this);
            mo47235R0(i, 3);
        }

        /* renamed from: K0 */
        public void mo47228K0(int i) {
            mo47240W0(i00.m51420c1(i));
        }

        /* renamed from: N0 */
        public void mo47231N0(long j) {
            mo47241X0(i00.m51422d1(j));
        }

        /* renamed from: Q0 */
        public void mo47234Q0(String str) {
            int i;
            ByteBuffer byteBuffer;
            int i2;
            int i3;
            int i4;
            int i5;
            char charAt;
            mo47249r0(str.length());
            int length = str.length() - 1;
            this.f37505g -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f37503a.put(this.f37505g + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.f37505g--;
                return;
            }
            this.f37505g += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 >= 128 || (i5 = this.f37505g) < 0) {
                    if (charAt2 < 2048 && (i4 = this.f37505g) > 0) {
                        ByteBuffer byteBuffer2 = this.f37503a;
                        this.f37505g = i4 - 1;
                        byteBuffer2.put(i4, (byte) ((charAt2 & '?') | 128));
                        byteBuffer = this.f37503a;
                        i = this.f37505g;
                        this.f37505g = i - 1;
                        i2 = (charAt2 >>> 6) | 960;
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && (i3 = this.f37505g) > 1) {
                        ByteBuffer byteBuffer3 = this.f37503a;
                        this.f37505g = i3 - 1;
                        byteBuffer3.put(i3, (byte) ((charAt2 & '?') | 128));
                        ByteBuffer byteBuffer4 = this.f37503a;
                        int i6 = this.f37505g;
                        this.f37505g = i6 - 1;
                        byteBuffer4.put(i6, (byte) (((charAt2 >>> 6) & 63) | 128));
                        byteBuffer = this.f37503a;
                        i = this.f37505g;
                        this.f37505g = i - 1;
                        i2 = (charAt2 >>> 12) | 480;
                    } else if (this.f37505g > 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                ByteBuffer byteBuffer5 = this.f37503a;
                                int i7 = this.f37505g;
                                this.f37505g = i7 - 1;
                                byteBuffer5.put(i7, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer6 = this.f37503a;
                                int i8 = this.f37505g;
                                this.f37505g = i8 - 1;
                                byteBuffer6.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer7 = this.f37503a;
                                int i9 = this.f37505g;
                                this.f37505g = i9 - 1;
                                byteBuffer7.put(i9, (byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer = this.f37503a;
                                i = this.f37505g;
                                this.f37505g = i - 1;
                                i2 = (codePoint >>> 18) | 240;
                            }
                        }
                        throw new hq4.C5558d(length - 1, length);
                    } else {
                        mo47249r0(length);
                        length++;
                    }
                    byteBuffer.put(i, (byte) i2);
                } else {
                    ByteBuffer byteBuffer8 = this.f37503a;
                    this.f37505g = i5 - 1;
                    byteBuffer8.put(i5, (byte) charAt2);
                }
                length--;
            }
        }

        /* renamed from: R0 */
        public void mo47235R0(int i, int i2) {
            mo47240W0(wx4.m69700c(i, i2));
        }

        /* renamed from: T */
        public void mo31112T(byte b) {
            ByteBuffer byteBuffer = this.f37503a;
            int i = this.f37505g;
            this.f37505g = i - 1;
            byteBuffer.put(i, b);
        }

        /* renamed from: U */
        public void mo31113U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo47262c1() < remaining) {
                mo47260a1(remaining);
            }
            int i = this.f37505g - remaining;
            this.f37505g = i;
            this.f37503a.position(i + 1);
            this.f37503a.put(byteBuffer);
        }

        /* renamed from: V */
        public void mo31114V(byte[] bArr, int i, int i2) {
            if (mo47262c1() < i2) {
                mo47260a1(i2);
            }
            int i3 = this.f37505g - i2;
            this.f37505g = i3;
            this.f37503a.position(i3 + 1);
            this.f37503a.put(bArr, i, i2);
        }

        /* renamed from: W */
        public void mo31115W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo47262c1() < remaining) {
                this.f37501b += remaining;
                this.f37500a.addFirst(C7303y4.m71221j(byteBuffer));
                mo47259Z0();
                return;
            }
            int i = this.f37505g - remaining;
            this.f37505g = i;
            this.f37503a.position(i + 1);
            this.f37503a.put(byteBuffer);
        }

        /* renamed from: W0 */
        public void mo47240W0(int i) {
            if ((i & -128) == 0) {
                mo47265f1(i);
            } else if ((i & -16384) == 0) {
                mo47267h1(i);
            } else if ((-2097152 & i) == 0) {
                mo47266g1(i);
            } else if ((-268435456 & i) == 0) {
                mo47264e1(i);
            } else {
                mo47263d1(i);
            }
        }

        /* renamed from: X */
        public void mo31116X(byte[] bArr, int i, int i2) {
            if (mo47262c1() < i2) {
                this.f37501b += i2;
                this.f37500a.addFirst(C7303y4.m71223l(bArr, i, i2));
                mo47259Z0();
                return;
            }
            int i3 = this.f37505g - i2;
            this.f37505g = i3;
            this.f37503a.position(i3 + 1);
            this.f37503a.put(bArr, i, i2);
        }

        /* renamed from: X0 */
        public void mo47241X0(long j) {
            switch (C7263xk.m70346a0(j)) {
                case 1:
                    mo47273n1(j);
                    return;
                case 2:
                    mo47278s1(j);
                    return;
                case 3:
                    mo47277r1(j);
                    return;
                case 4:
                    mo47271l1(j);
                    return;
                case 5:
                    mo47270k1(j);
                    return;
                case 6:
                    mo47275p1(j);
                    return;
                case 7:
                    mo47274o1(j);
                    return;
                case 8:
                    mo47268i1(j);
                    return;
                case 9:
                    mo47272m1(j);
                    return;
                case 10:
                    mo47276q1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Y0 */
        public final int mo47258Y0() {
            return this.f37504f - this.f37505g;
        }

        /* renamed from: Z0 */
        public final void mo47259Z0() {
            mo47261b1(mo47245f0());
        }

        /* renamed from: a1 */
        public final void mo47260a1(int i) {
            mo47261b1(mo47246g0(i));
        }

        /* renamed from: b */
        public void mo38341b(int i, Object obj, xr3 xr3) throws IOException {
            mo47235R0(i, 4);
            xr3.mo31764d(obj, this);
            mo47235R0(i, 3);
        }

        /* renamed from: b0 */
        public void mo47243b0() {
            if (this.f37503a != null) {
                this.f37501b += mo47258Y0();
                this.f37503a.position(this.f37505g + 1);
                this.f37503a = null;
                this.f37505g = 0;
                this.f37504f = 0;
            }
        }

        /* renamed from: b1 */
        public final void mo47261b1(C7303y4 y4Var) {
            if (y4Var.mo47577d()) {
                ByteBuffer f = y4Var.mo47579f();
                if (f.isDirect()) {
                    mo47243b0();
                    this.f37500a.addFirst(y4Var);
                    this.f37503a = f;
                    f.limit(f.capacity());
                    this.f37503a.position(0);
                    this.f37503a.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.f37503a.limit() - 1;
                    this.f37504f = limit;
                    this.f37505g = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        /* renamed from: c */
        public void mo38342c(int i, boolean z) {
            mo47249r0(6);
            mo31112T(z ? (byte) 1 : 0);
            mo47235R0(i, 0);
        }

        /* renamed from: c0 */
        public int mo47244c0() {
            return this.f37501b + mo47258Y0();
        }

        /* renamed from: c1 */
        public final int mo47262c1() {
            return this.f37505g + 1;
        }

        /* renamed from: d1 */
        public final void mo47263d1(int i) {
            ByteBuffer byteBuffer = this.f37503a;
            int i2 = this.f37505g;
            this.f37505g = i2 - 1;
            byteBuffer.put(i2, (byte) (i >>> 28));
            int i3 = this.f37505g - 4;
            this.f37505g = i3;
            this.f37503a.putInt(i3 + 1, (i & 127) | 128 | ((((i >>> 21) & 127) | 128) << 24) | ((((i >>> 14) & 127) | 128) << 16) | ((((i >>> 7) & 127) | 128) << 8));
        }

        /* renamed from: e */
        public void mo38344e(int i) {
            mo47235R0(i, 4);
        }

        /* renamed from: e1 */
        public final void mo47264e1(int i) {
            int i2 = this.f37505g - 4;
            this.f37505g = i2;
            this.f37503a.putInt(i2 + 1, (i & 127) | 128 | ((266338304 & i) << 3) | (((2080768 & i) | 2097152) << 2) | (((i & 16256) | 16384) << 1));
        }

        /* renamed from: f */
        public void mo38345f(int i, C5173er erVar) {
            try {
                erVar.mo34553x0(this);
                mo47249r0(10);
                mo47240W0(erVar.size());
                mo47235R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: f1 */
        public final void mo47265f1(int i) {
            ByteBuffer byteBuffer = this.f37503a;
            int i2 = this.f37505g;
            this.f37505g = i2 - 1;
            byteBuffer.put(i2, (byte) i);
        }

        /* renamed from: g1 */
        public final void mo47266g1(int i) {
            int i2 = this.f37505g - 3;
            this.f37505g = i2;
            this.f37503a.putInt(i2, (((i & 127) | 128) << 8) | ((2080768 & i) << 10) | (((i & 16256) | 16384) << 9));
        }

        /* renamed from: h1 */
        public final void mo47267h1(int i) {
            int i2 = this.f37505g - 2;
            this.f37505g = i2;
            this.f37503a.putShort(i2 + 1, (short) ((i & 127) | 128 | ((i & 16256) << 1)));
        }

        /* renamed from: i */
        public void mo38348i(int i, int i2) {
            mo47249r0(10);
            mo47228K0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo47268i1(long j) {
            int i = this.f37505g - 8;
            this.f37505g = i;
            this.f37503a.putLong(i + 1, (j & 127) | 128 | ((71494644084506624L & j) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        /* renamed from: j1 */
        public final void mo47269j1(long j) {
            int i = this.f37505g - 8;
            this.f37505g = i;
            this.f37503a.putLong(i + 1, (j & 127) | 128 | (((71494644084506624L & j) | 72057594037927936L) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        /* renamed from: k1 */
        public final void mo47270k1(long j) {
            int i = this.f37505g - 5;
            this.f37505g = i;
            this.f37503a.putLong(i - 2, (((j & 127) | 128) << 24) | ((34091302912L & j) << 28) | (((266338304 & j) | 268435456) << 27) | (((2080768 & j) | 2097152) << 26) | (((16256 & j) | 16384) << 25));
        }

        /* renamed from: l */
        public void mo38351l(int i, int i2) {
            mo47249r0(9);
            mo47255x0(i2);
            mo47235R0(i, 5);
        }

        /* renamed from: l1 */
        public final void mo47271l1(long j) {
            mo47264e1((int) j);
        }

        /* renamed from: m */
        public void mo38352m(int i, Object obj, xr3 xr3) throws IOException {
            int c0 = mo47244c0();
            xr3.mo31764d(obj, this);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: m1 */
        public final void mo47272m1(long j) {
            ByteBuffer byteBuffer = this.f37503a;
            int i = this.f37505g;
            this.f37505g = i - 1;
            byteBuffer.put(i, (byte) ((int) (j >>> 56)));
            mo47269j1(j & 72057594037927935L);
        }

        /* renamed from: n */
        public void mo38353n(int i) {
            mo47235R0(i, 3);
        }

        /* renamed from: n1 */
        public final void mo47273n1(long j) {
            mo47265f1((int) j);
        }

        /* renamed from: o */
        public void mo38354o(int i, int i2) {
            mo47249r0(10);
            mo47240W0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: o1 */
        public final void mo47274o1(long j) {
            int i = this.f37505g - 7;
            this.f37505g = i;
            this.f37503a.putLong(i, (((j & 127) | 128) << 8) | ((558551906910208L & j) << 14) | (((4363686772736L & j) | 4398046511104L) << 13) | (((34091302912L & j) | 34359738368L) << 12) | (((266338304 & j) | 268435456) << 11) | (((2080768 & j) | 2097152) << 10) | (((16256 & j) | 16384) << 9));
        }

        /* renamed from: p */
        public void mo38355p(int i, String str) {
            int c0 = mo47244c0();
            mo47234Q0(str);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: p1 */
        public final void mo47275p1(long j) {
            int i = this.f37505g - 6;
            this.f37505g = i;
            this.f37503a.putLong(i - 1, (((j & 127) | 128) << 16) | ((4363686772736L & j) << 21) | (((34091302912L & j) | 34359738368L) << 20) | (((266338304 & j) | 268435456) << 19) | (((2080768 & j) | 2097152) << 18) | (((16256 & j) | 16384) << 17));
        }

        /* renamed from: q1 */
        public final void mo47276q1(long j) {
            ByteBuffer byteBuffer = this.f37503a;
            int i = this.f37505g;
            this.f37505g = i - 1;
            byteBuffer.put(i, (byte) ((int) (j >>> 63)));
            ByteBuffer byteBuffer2 = this.f37503a;
            int i2 = this.f37505g;
            this.f37505g = i2 - 1;
            byteBuffer2.put(i2, (byte) ((int) (((j >>> 56) & 127) | 128)));
            mo47269j1(j & 72057594037927935L);
        }

        /* renamed from: r0 */
        public void mo47249r0(int i) {
            if (mo47262c1() < i) {
                mo47260a1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo47277r1(long j) {
            mo47266g1((int) j);
        }

        /* renamed from: s */
        public void mo38358s(int i, long j) {
            mo47249r0(15);
            mo47231N0(j);
            mo47235R0(i, 0);
        }

        /* renamed from: s0 */
        public void mo47250s0(boolean z) {
            mo31112T(z ? (byte) 1 : 0);
        }

        /* renamed from: s1 */
        public final void mo47278s1(long j) {
            mo47267h1((int) j);
        }

        /* renamed from: t */
        public void mo38359t(int i, int i2) {
            mo47249r0(15);
            mo47224F0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: v */
        public void mo38361v(int i, Object obj) throws IOException {
            int c0 = mo47244c0();
            p63.m60498a().mo42387k(obj, this);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: w */
        public void mo38362w(int i, long j) {
            mo47249r0(13);
            mo47219A0(j);
            mo47235R0(i, 1);
        }

        /* renamed from: x0 */
        public void mo47255x0(int i) {
            int i2 = this.f37505g - 4;
            this.f37505g = i2;
            this.f37503a.putInt(i2 + 1, i);
        }
    }

    /* renamed from: com.onedelhi.secure.xk$c */
    public static final class C7266c extends C7263xk {

        /* renamed from: a */
        public C7303y4 f37506a;

        /* renamed from: a */
        public byte[] f37507a;

        /* renamed from: f */
        public int f37508f;

        /* renamed from: g */
        public int f37509g;

        /* renamed from: h */
        public int f37510h;

        /* renamed from: i */
        public int f37511i;

        /* renamed from: j */
        public int f37512j;

        public C7266c(C6298oo ooVar, int i) {
            super(ooVar, i, (C7264a) null);
            mo47280Z0();
        }

        /* renamed from: A */
        public void mo38314A(int i, long j) throws IOException {
            mo47249r0(15);
            mo47241X0(j);
            mo47235R0(i, 0);
        }

        /* renamed from: A0 */
        public void mo47219A0(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) (((int) (j >> 56)) & 255);
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) (((int) (j >> 48)) & 255);
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) (((int) (j >> 40)) & 255);
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) (((int) (j >> 32)) & 255);
            int i6 = i5 - 1;
            this.f37512j = i6;
            bArr[i5] = (byte) (((int) (j >> 24)) & 255);
            int i7 = i6 - 1;
            this.f37512j = i7;
            bArr[i6] = (byte) (((int) (j >> 16)) & 255);
            int i8 = i7 - 1;
            this.f37512j = i8;
            bArr[i7] = (byte) (((int) (j >> 8)) & 255);
            this.f37512j = i8 - 1;
            bArr[i8] = (byte) (((int) j) & 255);
        }

        /* renamed from: F0 */
        public void mo47224F0(int i) {
            if (i >= 0) {
                mo47240W0(i);
            } else {
                mo47241X0((long) i);
            }
        }

        /* renamed from: H */
        public void mo38321H(int i, Object obj) throws IOException {
            mo47235R0(i, 4);
            p63.m60498a().mo42387k(obj, this);
            mo47235R0(i, 3);
        }

        /* renamed from: K0 */
        public void mo47228K0(int i) {
            mo47240W0(i00.m51420c1(i));
        }

        /* renamed from: N0 */
        public void mo47231N0(long j) {
            mo47241X0(i00.m51422d1(j));
        }

        /* renamed from: Q0 */
        public void mo47234Q0(String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            mo47249r0(str.length());
            int length = str.length() - 1;
            this.f37512j -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f37507a[this.f37512j + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.f37512j--;
                return;
            }
            this.f37512j += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i3 = this.f37512j) > this.f37510h) {
                    byte[] bArr = this.f37507a;
                    this.f37512j = i3 - 1;
                    bArr[i3] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i2 = this.f37512j) > this.f37508f) {
                    byte[] bArr2 = this.f37507a;
                    int i4 = i2 - 1;
                    this.f37512j = i4;
                    bArr2[i2] = (byte) ((charAt2 & '?') | 128);
                    this.f37512j = i4 - 1;
                    bArr2[i4] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.f37512j) > this.f37508f + 1) {
                    byte[] bArr3 = this.f37507a;
                    int i5 = i - 1;
                    this.f37512j = i5;
                    bArr3[i] = (byte) ((charAt2 & '?') | 128);
                    int i6 = i5 - 1;
                    this.f37512j = i6;
                    bArr3[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.f37512j = i6 - 1;
                    bArr3[i6] = (byte) ((charAt2 >>> 12) | 480);
                } else if (this.f37512j > this.f37508f + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr4 = this.f37507a;
                            int i7 = this.f37512j;
                            int i8 = i7 - 1;
                            this.f37512j = i8;
                            bArr4[i7] = (byte) ((codePoint & 63) | 128);
                            int i9 = i8 - 1;
                            this.f37512j = i9;
                            bArr4[i8] = (byte) (((codePoint >>> 6) & 63) | 128);
                            int i10 = i9 - 1;
                            this.f37512j = i10;
                            bArr4[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                            this.f37512j = i10 - 1;
                            bArr4[i10] = (byte) ((codePoint >>> 18) | 240);
                        }
                    }
                    throw new hq4.C5558d(length - 1, length);
                } else {
                    mo47249r0(length);
                    length++;
                }
                length--;
            }
        }

        /* renamed from: R0 */
        public void mo47235R0(int i, int i2) {
            mo47240W0(wx4.m69700c(i, i2));
        }

        /* renamed from: T */
        public void mo31112T(byte b) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            this.f37512j = i - 1;
            bArr[i] = b;
        }

        /* renamed from: U */
        public void mo31113U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo47283c1() < remaining) {
                mo47281a1(remaining);
            }
            int i = this.f37512j - remaining;
            this.f37512j = i;
            byteBuffer.get(this.f37507a, i + 1, remaining);
        }

        /* renamed from: V */
        public void mo31114V(byte[] bArr, int i, int i2) {
            if (mo47283c1() < i2) {
                mo47281a1(i2);
            }
            int i3 = this.f37512j - i2;
            this.f37512j = i3;
            System.arraycopy(bArr, i, this.f37507a, i3 + 1, i2);
        }

        /* renamed from: W */
        public void mo31115W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo47283c1() < remaining) {
                this.f37501b += remaining;
                this.f37500a.addFirst(C7303y4.m71221j(byteBuffer));
                mo47280Z0();
            }
            int i = this.f37512j - remaining;
            this.f37512j = i;
            byteBuffer.get(this.f37507a, i + 1, remaining);
        }

        /* renamed from: W0 */
        public void mo47240W0(int i) {
            if ((i & -128) == 0) {
                mo47286f1(i);
            } else if ((i & -16384) == 0) {
                mo47288h1(i);
            } else if ((-2097152 & i) == 0) {
                mo47287g1(i);
            } else if ((-268435456 & i) == 0) {
                mo47285e1(i);
            } else {
                mo47284d1(i);
            }
        }

        /* renamed from: X */
        public void mo31116X(byte[] bArr, int i, int i2) {
            if (mo47283c1() < i2) {
                this.f37501b += i2;
                this.f37500a.addFirst(C7303y4.m71223l(bArr, i, i2));
                mo47280Z0();
                return;
            }
            int i3 = this.f37512j - i2;
            this.f37512j = i3;
            System.arraycopy(bArr, i, this.f37507a, i3 + 1, i2);
        }

        /* renamed from: X0 */
        public void mo47241X0(long j) {
            switch (C7263xk.m70346a0(j)) {
                case 1:
                    mo47293m1(j);
                    return;
                case 2:
                    mo47298r1(j);
                    return;
                case 3:
                    mo47297q1(j);
                    return;
                case 4:
                    mo47291k1(j);
                    return;
                case 5:
                    mo47290j1(j);
                    return;
                case 6:
                    mo47295o1(j);
                    return;
                case 7:
                    mo47294n1(j);
                    return;
                case 8:
                    mo47289i1(j);
                    return;
                case 9:
                    mo47292l1(j);
                    return;
                case 10:
                    mo47296p1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Y0 */
        public int mo47279Y0() {
            return this.f37511i - this.f37512j;
        }

        /* renamed from: Z0 */
        public final void mo47280Z0() {
            mo47282b1(mo47247j0());
        }

        /* renamed from: a1 */
        public final void mo47281a1(int i) {
            mo47282b1(mo47248k0(i));
        }

        /* renamed from: b */
        public void mo38341b(int i, Object obj, xr3 xr3) throws IOException {
            mo47235R0(i, 4);
            xr3.mo31764d(obj, this);
            mo47235R0(i, 3);
        }

        /* renamed from: b0 */
        public void mo47243b0() {
            if (this.f37506a != null) {
                this.f37501b += mo47279Y0();
                C7303y4 y4Var = this.f37506a;
                y4Var.mo47581h((this.f37512j - y4Var.mo47575b()) + 1);
                this.f37506a = null;
                this.f37512j = 0;
                this.f37511i = 0;
            }
        }

        /* renamed from: b1 */
        public final void mo47282b1(C7303y4 y4Var) {
            if (y4Var.mo47576c()) {
                mo47243b0();
                this.f37500a.addFirst(y4Var);
                this.f37506a = y4Var;
                this.f37507a = y4Var.mo47574a();
                int b = y4Var.mo47575b();
                this.f37509g = y4Var.mo47578e() + b;
                int g = b + y4Var.mo47580g();
                this.f37508f = g;
                this.f37510h = g - 1;
                int i = this.f37509g - 1;
                this.f37511i = i;
                this.f37512j = i;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        /* renamed from: c */
        public void mo38342c(int i, boolean z) throws IOException {
            mo47249r0(6);
            mo31112T(z ? (byte) 1 : 0);
            mo47235R0(i, 0);
        }

        /* renamed from: c0 */
        public int mo47244c0() {
            return this.f37501b + mo47279Y0();
        }

        /* renamed from: c1 */
        public int mo47283c1() {
            return this.f37512j - this.f37510h;
        }

        /* renamed from: d1 */
        public final void mo47284d1(int i) {
            byte[] bArr = this.f37507a;
            int i2 = this.f37512j;
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) (i >>> 28);
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) (((i >>> 21) & 127) | 128);
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) (((i >>> 14) & 127) | 128);
            int i6 = i5 - 1;
            this.f37512j = i6;
            bArr[i5] = (byte) (((i >>> 7) & 127) | 128);
            this.f37512j = i6 - 1;
            bArr[i6] = (byte) ((i & 127) | 128);
        }

        /* renamed from: e */
        public void mo38344e(int i) {
            mo47235R0(i, 4);
        }

        /* renamed from: e1 */
        public final void mo47285e1(int i) {
            byte[] bArr = this.f37507a;
            int i2 = this.f37512j;
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) (i >>> 21);
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) (((i >>> 14) & 127) | 128);
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) (((i >>> 7) & 127) | 128);
            this.f37512j = i5 - 1;
            bArr[i5] = (byte) ((i & 127) | 128);
        }

        /* renamed from: f */
        public void mo38345f(int i, C5173er erVar) throws IOException {
            try {
                erVar.mo34553x0(this);
                mo47249r0(10);
                mo47240W0(erVar.size());
                mo47235R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: f1 */
        public final void mo47286f1(int i) {
            byte[] bArr = this.f37507a;
            int i2 = this.f37512j;
            this.f37512j = i2 - 1;
            bArr[i2] = (byte) i;
        }

        /* renamed from: g1 */
        public final void mo47287g1(int i) {
            byte[] bArr = this.f37507a;
            int i2 = this.f37512j;
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) (i >>> 14);
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) (((i >>> 7) & 127) | 128);
            this.f37512j = i4 - 1;
            bArr[i4] = (byte) ((i & 127) | 128);
        }

        /* renamed from: h1 */
        public final void mo47288h1(int i) {
            byte[] bArr = this.f37507a;
            int i2 = this.f37512j;
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) (i >>> 7);
            this.f37512j = i3 - 1;
            bArr[i3] = (byte) ((i & 127) | 128);
        }

        /* renamed from: i */
        public void mo38348i(int i, int i2) throws IOException {
            mo47249r0(10);
            mo47228K0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo47289i1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) ((int) (j >>> 49));
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) ((int) (((j >>> 42) & 127) | 128));
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i6 = i5 - 1;
            this.f37512j = i6;
            bArr[i5] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i7 = i6 - 1;
            this.f37512j = i7;
            bArr[i6] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i8 = i7 - 1;
            this.f37512j = i8;
            bArr[i7] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f37512j = i8 - 1;
            bArr[i8] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: j1 */
        public final void mo47290j1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) ((int) (j >>> 28));
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f37512j = i5 - 1;
            bArr[i5] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: k1 */
        public final void mo47291k1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) ((int) (j >>> 21));
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f37512j = i4 - 1;
            bArr[i4] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: l */
        public void mo38351l(int i, int i2) throws IOException {
            mo47249r0(9);
            mo47255x0(i2);
            mo47235R0(i, 5);
        }

        /* renamed from: l1 */
        public final void mo47292l1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) ((int) (j >>> 56));
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) ((int) (((j >>> 49) & 127) | 128));
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) ((int) (((j >>> 42) & 127) | 128));
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i6 = i5 - 1;
            this.f37512j = i6;
            bArr[i5] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i7 = i6 - 1;
            this.f37512j = i7;
            bArr[i6] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i8 = i7 - 1;
            this.f37512j = i8;
            bArr[i7] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i9 = i8 - 1;
            this.f37512j = i9;
            bArr[i8] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f37512j = i9 - 1;
            bArr[i9] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: m */
        public void mo38352m(int i, Object obj, xr3 xr3) throws IOException {
            int c0 = mo47244c0();
            xr3.mo31764d(obj, this);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: m1 */
        public final void mo47293m1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            this.f37512j = i - 1;
            bArr[i] = (byte) ((int) j);
        }

        /* renamed from: n */
        public void mo38353n(int i) {
            mo47235R0(i, 3);
        }

        /* renamed from: n1 */
        public final void mo47294n1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) ((int) (j >>> 42));
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i6 = i5 - 1;
            this.f37512j = i6;
            bArr[i5] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i7 = i6 - 1;
            this.f37512j = i7;
            bArr[i6] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f37512j = i7 - 1;
            bArr[i7] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: o */
        public void mo38354o(int i, int i2) throws IOException {
            mo47249r0(10);
            mo47240W0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: o1 */
        public final void mo47295o1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) ((int) (j >>> 35));
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i6 = i5 - 1;
            this.f37512j = i6;
            bArr[i5] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f37512j = i6 - 1;
            bArr[i6] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: p */
        public void mo38355p(int i, String str) throws IOException {
            int c0 = mo47244c0();
            mo47234Q0(str);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: p1 */
        public final void mo47296p1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) ((int) (j >>> 63));
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) ((int) (((j >>> 56) & 127) | 128));
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) ((int) (((j >>> 49) & 127) | 128));
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) ((int) (((j >>> 42) & 127) | 128));
            int i6 = i5 - 1;
            this.f37512j = i6;
            bArr[i5] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i7 = i6 - 1;
            this.f37512j = i7;
            bArr[i6] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i8 = i7 - 1;
            this.f37512j = i8;
            bArr[i7] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i9 = i8 - 1;
            this.f37512j = i9;
            bArr[i8] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i10 = i9 - 1;
            this.f37512j = i10;
            bArr[i9] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f37512j = i10 - 1;
            bArr[i10] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: q1 */
        public final void mo47297q1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) (((int) j) >>> 14);
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f37512j = i3 - 1;
            bArr[i3] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: r0 */
        public void mo47249r0(int i) {
            if (mo47283c1() < i) {
                mo47281a1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo47298r1(long j) {
            byte[] bArr = this.f37507a;
            int i = this.f37512j;
            int i2 = i - 1;
            this.f37512j = i2;
            bArr[i] = (byte) ((int) (j >>> 7));
            this.f37512j = i2 - 1;
            bArr[i2] = (byte) ((((int) j) & 127) | 128);
        }

        /* renamed from: s */
        public void mo38358s(int i, long j) throws IOException {
            mo47249r0(15);
            mo47231N0(j);
            mo47235R0(i, 0);
        }

        /* renamed from: s0 */
        public void mo47250s0(boolean z) {
            mo31112T(z ? (byte) 1 : 0);
        }

        /* renamed from: t */
        public void mo38359t(int i, int i2) throws IOException {
            mo47249r0(15);
            mo47224F0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: v */
        public void mo38361v(int i, Object obj) throws IOException {
            int c0 = mo47244c0();
            p63.m60498a().mo42387k(obj, this);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: w */
        public void mo38362w(int i, long j) throws IOException {
            mo47249r0(13);
            mo47219A0(j);
            mo47235R0(i, 1);
        }

        /* renamed from: x0 */
        public void mo47255x0(int i) {
            byte[] bArr = this.f37507a;
            int i2 = this.f37512j;
            int i3 = i2 - 1;
            this.f37512j = i3;
            bArr[i2] = (byte) ((i >> 24) & 255);
            int i4 = i3 - 1;
            this.f37512j = i4;
            bArr[i3] = (byte) ((i >> 16) & 255);
            int i5 = i4 - 1;
            this.f37512j = i5;
            bArr[i4] = (byte) ((i >> 8) & 255);
            this.f37512j = i5 - 1;
            bArr[i5] = (byte) (i & 255);
        }
    }

    /* renamed from: com.onedelhi.secure.xk$d */
    public static final class C7267d extends C7263xk {

        /* renamed from: a */
        public long f37513a;

        /* renamed from: a */
        public ByteBuffer f37514a;

        /* renamed from: b */
        public long f37515b;

        /* renamed from: c */
        public long f37516c;

        public C7267d(C6298oo ooVar, int i) {
            super(ooVar, i, (C7264a) null);
            mo47301c1();
        }

        /* renamed from: b1 */
        public static boolean m70535b1() {
            return ko4.m54684V();
        }

        /* renamed from: A */
        public void mo38314A(int i, long j) {
            mo47249r0(15);
            mo47241X0(j);
            mo47235R0(i, 0);
        }

        /* renamed from: A0 */
        public void mo47219A0(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.f37516c;
            this.f37516c = j5 - 1;
            ko4.m54698e0(j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.f37516c;
            this.f37516c = j6 - 1;
            ko4.m54698e0(j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.f37516c;
            this.f37516c = j7 - 1;
            ko4.m54698e0(j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.f37516c;
            this.f37516c = j8 - 1;
            ko4.m54698e0(j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.f37516c;
            this.f37516c = j9 - 1;
            ko4.m54698e0(j9, (byte) (((int) j) & 255));
        }

        /* renamed from: F0 */
        public void mo47224F0(int i) {
            if (i >= 0) {
                mo47240W0(i);
            } else {
                mo47241X0((long) i);
            }
        }

        /* renamed from: H */
        public void mo38321H(int i, Object obj) throws IOException {
            mo47235R0(i, 4);
            p63.m60498a().mo42387k(obj, this);
            mo47235R0(i, 3);
        }

        /* renamed from: K0 */
        public void mo47228K0(int i) {
            mo47240W0(i00.m51420c1(i));
        }

        /* renamed from: N0 */
        public void mo47231N0(long j) {
            mo47241X0(i00.m51422d1(j));
        }

        /* renamed from: Q0 */
        public void mo47234Q0(String str) {
            long j;
            char charAt;
            mo47249r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    long j2 = this.f37516c;
                    this.f37516c = j2 - 1;
                    ko4.m54698e0(j2, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        j = this.f37516c;
                        if (j >= this.f37513a) {
                            this.f37516c = j - 1;
                            ko4.m54698e0(j, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.f37516c;
                        if (j3 > this.f37513a) {
                            this.f37516c = j3 - 1;
                            ko4.m54698e0(j3, (byte) ((charAt2 & '?') | 128));
                            j = this.f37516c;
                            this.f37516c = j - 1;
                            charAt2 = (charAt2 >>> 6) | 960;
                            ko4.m54698e0(j, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j4 = this.f37516c;
                        if (j4 > this.f37513a + 1) {
                            this.f37516c = j4 - 1;
                            ko4.m54698e0(j4, (byte) ((charAt2 & '?') | 128));
                            long j5 = this.f37516c;
                            this.f37516c = j5 - 1;
                            ko4.m54698e0(j5, (byte) (((charAt2 >>> 6) & 63) | 128));
                            j = this.f37516c;
                            this.f37516c = j - 1;
                            charAt2 = (charAt2 >>> 12) | 480;
                            ko4.m54698e0(j, (byte) charAt2);
                            length--;
                        }
                    }
                    if (this.f37516c > this.f37513a + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j6 = this.f37516c;
                                this.f37516c = j6 - 1;
                                ko4.m54698e0(j6, (byte) ((codePoint & 63) | 128));
                                long j7 = this.f37516c;
                                this.f37516c = j7 - 1;
                                ko4.m54698e0(j7, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j8 = this.f37516c;
                                this.f37516c = j8 - 1;
                                ko4.m54698e0(j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                j = this.f37516c;
                                this.f37516c = j - 1;
                                charAt2 = (codePoint >>> 18) | ql1.f34290i;
                                ko4.m54698e0(j, (byte) charAt2);
                                length--;
                            }
                        }
                        throw new hq4.C5558d(length - 1, length);
                    }
                    mo47249r0(length);
                    length++;
                    length--;
                }
            }
        }

        /* renamed from: R0 */
        public void mo47235R0(int i, int i2) {
            mo47240W0(wx4.m69700c(i, i2));
        }

        /* renamed from: T */
        public void mo31112T(byte b) {
            long j = this.f37516c;
            this.f37516c = j - 1;
            ko4.m54698e0(j, b);
        }

        /* renamed from: U */
        public void mo31113U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo47304f1() < remaining) {
                mo47302d1(remaining);
            }
            this.f37516c -= (long) remaining;
            this.f37514a.position(mo47299Z0() + 1);
            this.f37514a.put(byteBuffer);
        }

        /* renamed from: V */
        public void mo31114V(byte[] bArr, int i, int i2) {
            if (mo47304f1() < i2) {
                mo47302d1(i2);
            }
            this.f37516c -= (long) i2;
            this.f37514a.position(mo47299Z0() + 1);
            this.f37514a.put(bArr, i, i2);
        }

        /* renamed from: W */
        public void mo31115W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo47304f1() < remaining) {
                this.f37501b += remaining;
                this.f37500a.addFirst(C7303y4.m71221j(byteBuffer));
                mo47301c1();
                return;
            }
            this.f37516c -= (long) remaining;
            this.f37514a.position(mo47299Z0() + 1);
            this.f37514a.put(byteBuffer);
        }

        /* renamed from: W0 */
        public void mo47240W0(int i) {
            if ((i & -128) == 0) {
                mo47307i1(i);
            } else if ((i & -16384) == 0) {
                mo47309k1(i);
            } else if ((-2097152 & i) == 0) {
                mo47308j1(i);
            } else if ((-268435456 & i) == 0) {
                mo47306h1(i);
            } else {
                mo47305g1(i);
            }
        }

        /* renamed from: X */
        public void mo31116X(byte[] bArr, int i, int i2) {
            if (mo47304f1() < i2) {
                this.f37501b += i2;
                this.f37500a.addFirst(C7303y4.m71223l(bArr, i, i2));
                mo47301c1();
                return;
            }
            this.f37516c -= (long) i2;
            this.f37514a.position(mo47299Z0() + 1);
            this.f37514a.put(bArr, i, i2);
        }

        /* renamed from: X0 */
        public void mo47241X0(long j) {
            switch (C7263xk.m70346a0(j)) {
                case 1:
                    mo47314p1(j);
                    return;
                case 2:
                    mo47319u1(j);
                    return;
                case 3:
                    mo47318t1(j);
                    return;
                case 4:
                    mo47312n1(j);
                    return;
                case 5:
                    mo47311m1(j);
                    return;
                case 6:
                    mo47316r1(j);
                    return;
                case 7:
                    mo47315q1(j);
                    return;
                case 8:
                    mo47310l1(j);
                    return;
                case 9:
                    mo47313o1(j);
                    return;
                case 10:
                    mo47317s1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Z0 */
        public final int mo47299Z0() {
            return (int) (this.f37516c - this.f37513a);
        }

        /* renamed from: a1 */
        public final int mo47300a1() {
            return (int) (this.f37515b - this.f37516c);
        }

        /* renamed from: b */
        public void mo38341b(int i, Object obj, xr3 xr3) throws IOException {
            mo47235R0(i, 4);
            xr3.mo31764d(obj, this);
            mo47235R0(i, 3);
        }

        /* renamed from: b0 */
        public void mo47243b0() {
            if (this.f37514a != null) {
                this.f37501b += mo47300a1();
                this.f37514a.position(mo47299Z0() + 1);
                this.f37514a = null;
                this.f37516c = 0;
                this.f37515b = 0;
            }
        }

        /* renamed from: c */
        public void mo38342c(int i, boolean z) {
            mo47249r0(6);
            mo31112T(z ? (byte) 1 : 0);
            mo47235R0(i, 0);
        }

        /* renamed from: c0 */
        public int mo47244c0() {
            return this.f37501b + mo47300a1();
        }

        /* renamed from: c1 */
        public final void mo47301c1() {
            mo47303e1(mo47245f0());
        }

        /* renamed from: d1 */
        public final void mo47302d1(int i) {
            mo47303e1(mo47246g0(i));
        }

        /* renamed from: e */
        public void mo38344e(int i) {
            mo47235R0(i, 4);
        }

        /* renamed from: e1 */
        public final void mo47303e1(C7303y4 y4Var) {
            if (y4Var.mo47577d()) {
                ByteBuffer f = y4Var.mo47579f();
                if (f.isDirect()) {
                    mo47243b0();
                    this.f37500a.addFirst(y4Var);
                    this.f37514a = f;
                    f.limit(f.capacity());
                    this.f37514a.position(0);
                    long k = ko4.m54709k(this.f37514a);
                    this.f37513a = k;
                    long limit = k + ((long) (this.f37514a.limit() - 1));
                    this.f37515b = limit;
                    this.f37516c = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        /* renamed from: f */
        public void mo38345f(int i, C5173er erVar) {
            try {
                erVar.mo34553x0(this);
                mo47249r0(10);
                mo47240W0(erVar.size());
                mo47235R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: f1 */
        public final int mo47304f1() {
            return mo47299Z0() + 1;
        }

        /* renamed from: g1 */
        public final void mo47305g1(int i) {
            long j = this.f37516c;
            this.f37516c = j - 1;
            ko4.m54698e0(j, (byte) (i >>> 28));
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) (((i >>> 21) & 127) | 128));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) (((i >>> 14) & 127) | 128));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) (((i >>> 7) & 127) | 128));
            long j5 = this.f37516c;
            this.f37516c = j5 - 1;
            ko4.m54698e0(j5, (byte) ((i & 127) | 128));
        }

        /* renamed from: h1 */
        public final void mo47306h1(int i) {
            long j = this.f37516c;
            this.f37516c = j - 1;
            ko4.m54698e0(j, (byte) (i >>> 21));
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) (((i >>> 14) & 127) | 128));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) (((i >>> 7) & 127) | 128));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) ((i & 127) | 128));
        }

        /* renamed from: i */
        public void mo38348i(int i, int i2) {
            mo47249r0(10);
            mo47228K0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo47307i1(int i) {
            long j = this.f37516c;
            this.f37516c = j - 1;
            ko4.m54698e0(j, (byte) i);
        }

        /* renamed from: j1 */
        public final void mo47308j1(int i) {
            long j = this.f37516c;
            this.f37516c = j - 1;
            ko4.m54698e0(j, (byte) (i >>> 14));
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) (((i >>> 7) & 127) | 128));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((i & 127) | 128));
        }

        /* renamed from: k1 */
        public final void mo47309k1(int i) {
            long j = this.f37516c;
            this.f37516c = j - 1;
            ko4.m54698e0(j, (byte) (i >>> 7));
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((i & 127) | 128));
        }

        /* renamed from: l */
        public void mo38351l(int i, int i2) {
            mo47249r0(9);
            mo47255x0(i2);
            mo47235R0(i, 5);
        }

        /* renamed from: l1 */
        public final void mo47310l1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((int) (j >>> 49)));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j5 = this.f37516c;
            this.f37516c = j5 - 1;
            ko4.m54698e0(j5, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j6 = this.f37516c;
            this.f37516c = j6 - 1;
            ko4.m54698e0(j6, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j7 = this.f37516c;
            this.f37516c = j7 - 1;
            ko4.m54698e0(j7, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j8 = this.f37516c;
            this.f37516c = j8 - 1;
            ko4.m54698e0(j8, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j9 = this.f37516c;
            this.f37516c = j9 - 1;
            ko4.m54698e0(j9, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: m */
        public void mo38352m(int i, Object obj, xr3 xr3) throws IOException {
            int c0 = mo47244c0();
            xr3.mo31764d(obj, this);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: m1 */
        public final void mo47311m1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((int) (j >>> 28)));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j5 = this.f37516c;
            this.f37516c = j5 - 1;
            ko4.m54698e0(j5, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j6 = this.f37516c;
            this.f37516c = j6 - 1;
            ko4.m54698e0(j6, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: n */
        public void mo38353n(int i) {
            mo47235R0(i, 3);
        }

        /* renamed from: n1 */
        public final void mo47312n1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((int) (j >>> 21)));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j5 = this.f37516c;
            this.f37516c = j5 - 1;
            ko4.m54698e0(j5, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: o */
        public void mo38354o(int i, int i2) {
            mo47249r0(10);
            mo47240W0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: o1 */
        public final void mo47313o1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((int) (j >>> 56)));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((int) (((j >>> 49) & 127) | 128)));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j5 = this.f37516c;
            this.f37516c = j5 - 1;
            ko4.m54698e0(j5, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j6 = this.f37516c;
            this.f37516c = j6 - 1;
            ko4.m54698e0(j6, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j7 = this.f37516c;
            this.f37516c = j7 - 1;
            ko4.m54698e0(j7, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j8 = this.f37516c;
            this.f37516c = j8 - 1;
            ko4.m54698e0(j8, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j9 = this.f37516c;
            this.f37516c = j9 - 1;
            ko4.m54698e0(j9, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j10 = this.f37516c;
            this.f37516c = j10 - 1;
            ko4.m54698e0(j10, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: p */
        public void mo38355p(int i, String str) {
            int c0 = mo47244c0();
            mo47234Q0(str);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: p1 */
        public final void mo47314p1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((int) j));
        }

        /* renamed from: q1 */
        public final void mo47315q1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((int) (j >>> 42)));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j5 = this.f37516c;
            this.f37516c = j5 - 1;
            ko4.m54698e0(j5, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j6 = this.f37516c;
            this.f37516c = j6 - 1;
            ko4.m54698e0(j6, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j7 = this.f37516c;
            this.f37516c = j7 - 1;
            ko4.m54698e0(j7, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j8 = this.f37516c;
            this.f37516c = j8 - 1;
            ko4.m54698e0(j8, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: r0 */
        public void mo47249r0(int i) {
            if (mo47304f1() < i) {
                mo47302d1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo47316r1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((int) (j >>> 35)));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j5 = this.f37516c;
            this.f37516c = j5 - 1;
            ko4.m54698e0(j5, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j6 = this.f37516c;
            this.f37516c = j6 - 1;
            ko4.m54698e0(j6, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j7 = this.f37516c;
            this.f37516c = j7 - 1;
            ko4.m54698e0(j7, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: s */
        public void mo38358s(int i, long j) {
            mo47249r0(15);
            mo47231N0(j);
            mo47235R0(i, 0);
        }

        /* renamed from: s0 */
        public void mo47250s0(boolean z) {
            mo31112T(z ? (byte) 1 : 0);
        }

        /* renamed from: s1 */
        public final void mo47317s1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((int) (j >>> 63)));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((int) (((j >>> 56) & 127) | 128)));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) ((int) (((j >>> 49) & 127) | 128)));
            long j5 = this.f37516c;
            this.f37516c = j5 - 1;
            ko4.m54698e0(j5, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j6 = this.f37516c;
            this.f37516c = j6 - 1;
            ko4.m54698e0(j6, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j7 = this.f37516c;
            this.f37516c = j7 - 1;
            ko4.m54698e0(j7, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j8 = this.f37516c;
            this.f37516c = j8 - 1;
            ko4.m54698e0(j8, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j9 = this.f37516c;
            this.f37516c = j9 - 1;
            ko4.m54698e0(j9, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j10 = this.f37516c;
            this.f37516c = j10 - 1;
            ko4.m54698e0(j10, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j11 = this.f37516c;
            this.f37516c = j11 - 1;
            ko4.m54698e0(j11, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: t */
        public void mo38359t(int i, int i2) {
            mo47249r0(15);
            mo47224F0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: t1 */
        public final void mo47318t1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) (((int) j) >>> 14));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: u1 */
        public final void mo47319u1(long j) {
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((int) (j >>> 7)));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((((int) j) & 127) | 128));
        }

        /* renamed from: v */
        public void mo38361v(int i, Object obj) throws IOException {
            int c0 = mo47244c0();
            p63.m60498a().mo42387k(obj, this);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: w */
        public void mo38362w(int i, long j) {
            mo47249r0(13);
            mo47219A0(j);
            mo47235R0(i, 1);
        }

        /* renamed from: x0 */
        public void mo47255x0(int i) {
            long j = this.f37516c;
            this.f37516c = j - 1;
            ko4.m54698e0(j, (byte) ((i >> 24) & 255));
            long j2 = this.f37516c;
            this.f37516c = j2 - 1;
            ko4.m54698e0(j2, (byte) ((i >> 16) & 255));
            long j3 = this.f37516c;
            this.f37516c = j3 - 1;
            ko4.m54698e0(j3, (byte) ((i >> 8) & 255));
            long j4 = this.f37516c;
            this.f37516c = j4 - 1;
            ko4.m54698e0(j4, (byte) (i & 255));
        }
    }

    /* renamed from: com.onedelhi.secure.xk$e */
    public static final class C7268e extends C7263xk {

        /* renamed from: a */
        public long f37517a;

        /* renamed from: a */
        public C7303y4 f37518a;

        /* renamed from: a */
        public byte[] f37519a;

        /* renamed from: b */
        public long f37520b;

        /* renamed from: c */
        public long f37521c;

        /* renamed from: d */
        public long f37522d;

        /* renamed from: e */
        public long f37523e;

        public C7268e(C6298oo ooVar, int i) {
            super(ooVar, i, (C7264a) null);
            mo47322b1();
        }

        /* renamed from: a1 */
        public static boolean m70591a1() {
            return ko4.m54683U();
        }

        /* renamed from: A */
        public void mo38314A(int i, long j) {
            mo47249r0(15);
            mo47241X0(j);
            mo47235R0(i, 0);
        }

        /* renamed from: A0 */
        public void mo47219A0(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) (((int) (j >> 56)) & 255));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) (((int) (j >> 48)) & 255));
            byte[] bArr3 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr3, j4, (byte) (((int) (j >> 40)) & 255));
            byte[] bArr4 = this.f37519a;
            long j5 = this.f37523e;
            this.f37523e = j5 - 1;
            ko4.m54702g0(bArr4, j5, (byte) (((int) (j >> 32)) & 255));
            byte[] bArr5 = this.f37519a;
            long j6 = this.f37523e;
            this.f37523e = j6 - 1;
            ko4.m54702g0(bArr5, j6, (byte) (((int) (j >> 24)) & 255));
            byte[] bArr6 = this.f37519a;
            long j7 = this.f37523e;
            this.f37523e = j7 - 1;
            ko4.m54702g0(bArr6, j7, (byte) (((int) (j >> 16)) & 255));
            byte[] bArr7 = this.f37519a;
            long j8 = this.f37523e;
            this.f37523e = j8 - 1;
            ko4.m54702g0(bArr7, j8, (byte) (((int) (j >> 8)) & 255));
            byte[] bArr8 = this.f37519a;
            long j9 = this.f37523e;
            this.f37523e = j9 - 1;
            ko4.m54702g0(bArr8, j9, (byte) (((int) j) & 255));
        }

        /* renamed from: F0 */
        public void mo47224F0(int i) {
            if (i >= 0) {
                mo47240W0(i);
            } else {
                mo47241X0((long) i);
            }
        }

        /* renamed from: H */
        public void mo38321H(int i, Object obj) throws IOException {
            mo47235R0(i, 4);
            p63.m60498a().mo42387k(obj, this);
            mo47235R0(i, 3);
        }

        /* renamed from: K0 */
        public void mo47228K0(int i) {
            mo47240W0(i00.m51420c1(i));
        }

        /* renamed from: N0 */
        public void mo47231N0(long j) {
            mo47241X0(i00.m51422d1(j));
        }

        /* renamed from: Q0 */
        public void mo47234Q0(String str) {
            char charAt;
            mo47249r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    byte[] bArr = this.f37519a;
                    long j = this.f37523e;
                    this.f37523e = j - 1;
                    ko4.m54702g0(bArr, j, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j2 = this.f37523e;
                        if (j2 > this.f37521c) {
                            byte[] bArr2 = this.f37519a;
                            this.f37523e = j2 - 1;
                            ko4.m54702g0(bArr2, j2, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.f37523e;
                        if (j3 > this.f37517a) {
                            byte[] bArr3 = this.f37519a;
                            this.f37523e = j3 - 1;
                            ko4.m54702g0(bArr3, j3, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr4 = this.f37519a;
                            long j4 = this.f37523e;
                            this.f37523e = j4 - 1;
                            ko4.m54702g0(bArr4, j4, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.f37523e;
                        if (j5 > this.f37517a + 1) {
                            byte[] bArr5 = this.f37519a;
                            this.f37523e = j5 - 1;
                            ko4.m54702g0(bArr5, j5, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr6 = this.f37519a;
                            long j6 = this.f37523e;
                            this.f37523e = j6 - 1;
                            ko4.m54702g0(bArr6, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            byte[] bArr7 = this.f37519a;
                            long j7 = this.f37523e;
                            this.f37523e = j7 - 1;
                            ko4.m54702g0(bArr7, j7, (byte) ((charAt2 >>> 12) | 480));
                            length--;
                        }
                    }
                    if (this.f37523e > this.f37517a + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr8 = this.f37519a;
                                long j8 = this.f37523e;
                                this.f37523e = j8 - 1;
                                ko4.m54702g0(bArr8, j8, (byte) ((codePoint & 63) | 128));
                                byte[] bArr9 = this.f37519a;
                                long j9 = this.f37523e;
                                this.f37523e = j9 - 1;
                                ko4.m54702g0(bArr9, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                byte[] bArr10 = this.f37519a;
                                long j10 = this.f37523e;
                                this.f37523e = j10 - 1;
                                ko4.m54702g0(bArr10, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                byte[] bArr11 = this.f37519a;
                                long j11 = this.f37523e;
                                this.f37523e = j11 - 1;
                                ko4.m54702g0(bArr11, j11, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new hq4.C5558d(length - 1, length);
                    }
                    mo47249r0(length);
                    length++;
                    length--;
                }
            }
        }

        /* renamed from: R0 */
        public void mo47235R0(int i, int i2) {
            mo47240W0(wx4.m69700c(i, i2));
        }

        /* renamed from: T */
        public void mo31112T(byte b) {
            byte[] bArr = this.f37519a;
            long j = this.f37523e;
            this.f37523e = j - 1;
            ko4.m54702g0(bArr, j, b);
        }

        /* renamed from: U */
        public void mo31113U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            mo47249r0(remaining);
            this.f37523e -= (long) remaining;
            byteBuffer.get(this.f37519a, mo47320Y0() + 1, remaining);
        }

        /* renamed from: V */
        public void mo31114V(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            mo47249r0(i2);
            this.f37523e -= (long) i2;
            System.arraycopy(bArr, i, this.f37519a, mo47320Y0() + 1, i2);
        }

        /* renamed from: W */
        public void mo31115W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo47325e1() < remaining) {
                this.f37501b += remaining;
                this.f37500a.addFirst(C7303y4.m71221j(byteBuffer));
                mo47322b1();
            }
            this.f37523e -= (long) remaining;
            byteBuffer.get(this.f37519a, mo47320Y0() + 1, remaining);
        }

        /* renamed from: W0 */
        public void mo47240W0(int i) {
            if ((i & -128) == 0) {
                mo47328h1(i);
            } else if ((i & -16384) == 0) {
                mo47330j1(i);
            } else if ((-2097152 & i) == 0) {
                mo47329i1(i);
            } else if ((-268435456 & i) == 0) {
                mo47327g1(i);
            } else {
                mo47326f1(i);
            }
        }

        /* renamed from: X */
        public void mo31116X(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            } else if (mo47325e1() < i2) {
                this.f37501b += i2;
                this.f37500a.addFirst(C7303y4.m71223l(bArr, i, i2));
                mo47322b1();
            } else {
                this.f37523e -= (long) i2;
                System.arraycopy(bArr, i, this.f37519a, mo47320Y0() + 1, i2);
            }
        }

        /* renamed from: X0 */
        public void mo47241X0(long j) {
            switch (C7263xk.m70346a0(j)) {
                case 1:
                    mo47335o1(j);
                    return;
                case 2:
                    mo47340t1(j);
                    return;
                case 3:
                    mo47339s1(j);
                    return;
                case 4:
                    mo47333m1(j);
                    return;
                case 5:
                    mo47332l1(j);
                    return;
                case 6:
                    mo47337q1(j);
                    return;
                case 7:
                    mo47336p1(j);
                    return;
                case 8:
                    mo47331k1(j);
                    return;
                case 9:
                    mo47334n1(j);
                    return;
                case 10:
                    mo47338r1(j);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: Y0 */
        public final int mo47320Y0() {
            return (int) this.f37523e;
        }

        /* renamed from: Z0 */
        public int mo47321Z0() {
            return (int) (this.f37522d - this.f37523e);
        }

        /* renamed from: b */
        public void mo38341b(int i, Object obj, xr3 xr3) throws IOException {
            mo47235R0(i, 4);
            xr3.mo31764d(obj, this);
            mo47235R0(i, 3);
        }

        /* renamed from: b0 */
        public void mo47243b0() {
            if (this.f37518a != null) {
                this.f37501b += mo47321Z0();
                this.f37518a.mo47581h((mo47320Y0() - this.f37518a.mo47575b()) + 1);
                this.f37518a = null;
                this.f37523e = 0;
                this.f37522d = 0;
            }
        }

        /* renamed from: b1 */
        public final void mo47322b1() {
            mo47324d1(mo47247j0());
        }

        /* renamed from: c */
        public void mo38342c(int i, boolean z) {
            mo47249r0(6);
            mo31112T(z ? (byte) 1 : 0);
            mo47235R0(i, 0);
        }

        /* renamed from: c0 */
        public int mo47244c0() {
            return this.f37501b + mo47321Z0();
        }

        /* renamed from: c1 */
        public final void mo47323c1(int i) {
            mo47324d1(mo47248k0(i));
        }

        /* renamed from: d1 */
        public final void mo47324d1(C7303y4 y4Var) {
            if (y4Var.mo47576c()) {
                mo47243b0();
                this.f37500a.addFirst(y4Var);
                this.f37518a = y4Var;
                this.f37519a = y4Var.mo47574a();
                int b = y4Var.mo47575b();
                this.f37520b = (long) (y4Var.mo47578e() + b);
                long g = (long) (b + y4Var.mo47580g());
                this.f37517a = g;
                this.f37521c = g - 1;
                long j = this.f37520b - 1;
                this.f37522d = j;
                this.f37523e = j;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        /* renamed from: e */
        public void mo38344e(int i) {
            mo47235R0(i, 4);
        }

        /* renamed from: e1 */
        public int mo47325e1() {
            return (int) (this.f37523e - this.f37521c);
        }

        /* renamed from: f */
        public void mo38345f(int i, C5173er erVar) {
            try {
                erVar.mo34553x0(this);
                mo47249r0(10);
                mo47240W0(erVar.size());
                mo47235R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: f1 */
        public final void mo47326f1(int i) {
            byte[] bArr = this.f37519a;
            long j = this.f37523e;
            this.f37523e = j - 1;
            ko4.m54702g0(bArr, j, (byte) (i >>> 28));
            byte[] bArr2 = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr2, j2, (byte) (((i >>> 21) & 127) | 128));
            byte[] bArr3 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr3, j3, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr4 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr4, j4, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr5 = this.f37519a;
            long j5 = this.f37523e;
            this.f37523e = j5 - 1;
            ko4.m54702g0(bArr5, j5, (byte) ((i & 127) | 128));
        }

        /* renamed from: g1 */
        public final void mo47327g1(int i) {
            byte[] bArr = this.f37519a;
            long j = this.f37523e;
            this.f37523e = j - 1;
            ko4.m54702g0(bArr, j, (byte) (i >>> 21));
            byte[] bArr2 = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr2, j2, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr3 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr3, j3, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr4 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr4, j4, (byte) ((i & 127) | 128));
        }

        /* renamed from: h1 */
        public final void mo47328h1(int i) {
            byte[] bArr = this.f37519a;
            long j = this.f37523e;
            this.f37523e = j - 1;
            ko4.m54702g0(bArr, j, (byte) i);
        }

        /* renamed from: i */
        public void mo38348i(int i, int i2) {
            mo47249r0(10);
            mo47228K0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: i1 */
        public final void mo47329i1(int i) {
            byte[] bArr = this.f37519a;
            long j = this.f37523e;
            this.f37523e = j - 1;
            ko4.m54702g0(bArr, j, (byte) (i >>> 14));
            byte[] bArr2 = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr2, j2, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr3 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr3, j3, (byte) ((i & 127) | 128));
        }

        /* renamed from: j1 */
        public final void mo47330j1(int i) {
            byte[] bArr = this.f37519a;
            long j = this.f37523e;
            this.f37523e = j - 1;
            ko4.m54702g0(bArr, j, (byte) (i >>> 7));
            byte[] bArr2 = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr2, j2, (byte) ((i & 127) | 128));
        }

        /* renamed from: k1 */
        public final void mo47331k1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) ((int) (j >>> 49)));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr3 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr3, j4, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr4 = this.f37519a;
            long j5 = this.f37523e;
            this.f37523e = j5 - 1;
            ko4.m54702g0(bArr4, j5, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr5 = this.f37519a;
            long j6 = this.f37523e;
            this.f37523e = j6 - 1;
            ko4.m54702g0(bArr5, j6, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr6 = this.f37519a;
            long j7 = this.f37523e;
            this.f37523e = j7 - 1;
            ko4.m54702g0(bArr6, j7, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr7 = this.f37519a;
            long j8 = this.f37523e;
            this.f37523e = j8 - 1;
            ko4.m54702g0(bArr7, j8, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr8 = this.f37519a;
            long j9 = this.f37523e;
            this.f37523e = j9 - 1;
            ko4.m54702g0(bArr8, j9, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: l */
        public void mo38351l(int i, int i2) {
            mo47249r0(9);
            mo47255x0(i2);
            mo47235R0(i, 5);
        }

        /* renamed from: l1 */
        public final void mo47332l1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) ((int) (j >>> 28)));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr3 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr3, j4, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr4 = this.f37519a;
            long j5 = this.f37523e;
            this.f37523e = j5 - 1;
            ko4.m54702g0(bArr4, j5, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr5 = this.f37519a;
            long j6 = this.f37523e;
            this.f37523e = j6 - 1;
            ko4.m54702g0(bArr5, j6, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: m */
        public void mo38352m(int i, Object obj, xr3 xr3) throws IOException {
            int c0 = mo47244c0();
            xr3.mo31764d(obj, this);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: m1 */
        public final void mo47333m1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) ((int) (j >>> 21)));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr3 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr3, j4, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr4 = this.f37519a;
            long j5 = this.f37523e;
            this.f37523e = j5 - 1;
            ko4.m54702g0(bArr4, j5, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: n */
        public void mo38353n(int i) {
            mo47235R0(i, 3);
        }

        /* renamed from: n1 */
        public final void mo47334n1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) ((int) (j >>> 56)));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) ((int) (((j >>> 49) & 127) | 128)));
            byte[] bArr3 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr3, j4, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr4 = this.f37519a;
            long j5 = this.f37523e;
            this.f37523e = j5 - 1;
            ko4.m54702g0(bArr4, j5, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr5 = this.f37519a;
            long j6 = this.f37523e;
            this.f37523e = j6 - 1;
            ko4.m54702g0(bArr5, j6, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr6 = this.f37519a;
            long j7 = this.f37523e;
            this.f37523e = j7 - 1;
            ko4.m54702g0(bArr6, j7, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr7 = this.f37519a;
            long j8 = this.f37523e;
            this.f37523e = j8 - 1;
            ko4.m54702g0(bArr7, j8, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr8 = this.f37519a;
            long j9 = this.f37523e;
            this.f37523e = j9 - 1;
            ko4.m54702g0(bArr8, j9, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr9 = this.f37519a;
            long j10 = this.f37523e;
            this.f37523e = j10 - 1;
            ko4.m54702g0(bArr9, j10, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: o */
        public void mo38354o(int i, int i2) {
            mo47249r0(10);
            mo47240W0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: o1 */
        public final void mo47335o1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) ((int) j));
        }

        /* renamed from: p */
        public void mo38355p(int i, String str) {
            int c0 = mo47244c0();
            mo47234Q0(str);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: p1 */
        public final void mo47336p1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) ((int) (j >>> 42)));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr3 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr3, j4, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr4 = this.f37519a;
            long j5 = this.f37523e;
            this.f37523e = j5 - 1;
            ko4.m54702g0(bArr4, j5, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr5 = this.f37519a;
            long j6 = this.f37523e;
            this.f37523e = j6 - 1;
            ko4.m54702g0(bArr5, j6, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr6 = this.f37519a;
            long j7 = this.f37523e;
            this.f37523e = j7 - 1;
            ko4.m54702g0(bArr6, j7, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr7 = this.f37519a;
            long j8 = this.f37523e;
            this.f37523e = j8 - 1;
            ko4.m54702g0(bArr7, j8, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: q1 */
        public final void mo47337q1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) ((int) (j >>> 35)));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr3 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr3, j4, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr4 = this.f37519a;
            long j5 = this.f37523e;
            this.f37523e = j5 - 1;
            ko4.m54702g0(bArr4, j5, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr5 = this.f37519a;
            long j6 = this.f37523e;
            this.f37523e = j6 - 1;
            ko4.m54702g0(bArr5, j6, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr6 = this.f37519a;
            long j7 = this.f37523e;
            this.f37523e = j7 - 1;
            ko4.m54702g0(bArr6, j7, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: r0 */
        public void mo47249r0(int i) {
            if (mo47325e1() < i) {
                mo47323c1(i);
            }
        }

        /* renamed from: r1 */
        public final void mo47338r1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) ((int) (j >>> 63)));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) ((int) (((j >>> 56) & 127) | 128)));
            byte[] bArr3 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr3, j4, (byte) ((int) (((j >>> 49) & 127) | 128)));
            byte[] bArr4 = this.f37519a;
            long j5 = this.f37523e;
            this.f37523e = j5 - 1;
            ko4.m54702g0(bArr4, j5, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr5 = this.f37519a;
            long j6 = this.f37523e;
            this.f37523e = j6 - 1;
            ko4.m54702g0(bArr5, j6, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr6 = this.f37519a;
            long j7 = this.f37523e;
            this.f37523e = j7 - 1;
            ko4.m54702g0(bArr6, j7, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr7 = this.f37519a;
            long j8 = this.f37523e;
            this.f37523e = j8 - 1;
            ko4.m54702g0(bArr7, j8, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr8 = this.f37519a;
            long j9 = this.f37523e;
            this.f37523e = j9 - 1;
            ko4.m54702g0(bArr8, j9, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr9 = this.f37519a;
            long j10 = this.f37523e;
            this.f37523e = j10 - 1;
            ko4.m54702g0(bArr9, j10, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr10 = this.f37519a;
            long j11 = this.f37523e;
            this.f37523e = j11 - 1;
            ko4.m54702g0(bArr10, j11, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: s */
        public void mo38358s(int i, long j) {
            mo47249r0(15);
            mo47231N0(j);
            mo47235R0(i, 0);
        }

        /* renamed from: s0 */
        public void mo47250s0(boolean z) {
            mo31112T(z ? (byte) 1 : 0);
        }

        /* renamed from: s1 */
        public final void mo47339s1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) (((int) j) >>> 14));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr3 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr3, j4, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: t */
        public void mo38359t(int i, int i2) {
            mo47249r0(15);
            mo47224F0(i2);
            mo47235R0(i, 0);
        }

        /* renamed from: t1 */
        public final void mo47340t1(long j) {
            byte[] bArr = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr, j2, (byte) ((int) (j >>> 7)));
            byte[] bArr2 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr2, j3, (byte) ((((int) j) & 127) | 128));
        }

        /* renamed from: v */
        public void mo38361v(int i, Object obj) throws IOException {
            int c0 = mo47244c0();
            p63.m60498a().mo42387k(obj, this);
            mo47249r0(10);
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }

        /* renamed from: w */
        public void mo38362w(int i, long j) {
            mo47249r0(13);
            mo47219A0(j);
            mo47235R0(i, 1);
        }

        /* renamed from: x0 */
        public void mo47255x0(int i) {
            byte[] bArr = this.f37519a;
            long j = this.f37523e;
            this.f37523e = j - 1;
            ko4.m54702g0(bArr, j, (byte) ((i >> 24) & 255));
            byte[] bArr2 = this.f37519a;
            long j2 = this.f37523e;
            this.f37523e = j2 - 1;
            ko4.m54702g0(bArr2, j2, (byte) ((i >> 16) & 255));
            byte[] bArr3 = this.f37519a;
            long j3 = this.f37523e;
            this.f37523e = j3 - 1;
            ko4.m54702g0(bArr3, j3, (byte) ((i >> 8) & 255));
            byte[] bArr4 = this.f37519a;
            long j4 = this.f37523e;
            this.f37523e = j4 - 1;
            ko4.m54702g0(bArr4, j4, (byte) (i & 255));
        }
    }

    public C7263xk(C6298oo ooVar, int i) {
        this.f37500a = new ArrayDeque<>(4);
        if (i > 0) {
            this.f37499a = (C6298oo) vs1.m68433e(ooVar, "alloc");
            this.f37498a = i;
            return;
        }
        throw new IllegalArgumentException("chunkSize must be > 0");
    }

    public /* synthetic */ C7263xk(C6298oo ooVar, int i, C7264a aVar) {
        this(ooVar, i);
    }

    /* renamed from: J0 */
    public static final void m70344J0(ty4 ty4, int i, wx4.C7195b bVar, Object obj) throws IOException {
        int intValue;
        switch (C7264a.f37502a[bVar.ordinal()]) {
            case 1:
                ty4.mo38342c(i, ((Boolean) obj).booleanValue());
                return;
            case 2:
                ty4.mo38351l(i, ((Integer) obj).intValue());
                return;
            case 3:
                ty4.mo38362w(i, ((Long) obj).longValue());
                return;
            case 4:
                ty4.mo38359t(i, ((Integer) obj).intValue());
                return;
            case 5:
                ty4.mo38347h(i, ((Long) obj).longValue());
                return;
            case 6:
                ty4.mo38325L(i, ((Integer) obj).intValue());
                return;
            case 7:
                ty4.mo38343d(i, ((Long) obj).longValue());
                return;
            case 8:
                ty4.mo38348i(i, ((Integer) obj).intValue());
                return;
            case 9:
                ty4.mo38358s(i, ((Long) obj).longValue());
                return;
            case 10:
                ty4.mo38355p(i, (String) obj);
                return;
            case 11:
                ty4.mo38354o(i, ((Integer) obj).intValue());
                return;
            case 12:
                ty4.mo38314A(i, ((Long) obj).longValue());
                return;
            case 13:
                ty4.mo38317D(i, ((Float) obj).floatValue());
                return;
            case 14:
                ty4.mo38315B(i, ((Double) obj).doubleValue());
                return;
            case 15:
                ty4.mo38361v(i, obj);
                return;
            case 16:
                ty4.mo38345f(i, (C5173er) obj);
                return;
            case 17:
                if (obj instanceof vs1.C7081c) {
                    intValue = ((vs1.C7081c) obj).mo32392j();
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                } else {
                    throw new IllegalArgumentException("Unexpected type for enum in map.");
                }
                ty4.mo38339a(i, intValue);
                return;
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + bVar);
        }
    }

    /* renamed from: a0 */
    public static byte m70346a0(long j) {
        byte b;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            b = (byte) 6;
            j >>>= 28;
        } else {
            b = 2;
        }
        if ((k90.f31137g & j) != 0) {
            b = (byte) (b + 2);
            j >>>= 14;
        }
        return (j & -16384) != 0 ? (byte) (b + 1) : b;
    }

    /* renamed from: d0 */
    public static boolean m70347d0() {
        return C7267d.m70535b1();
    }

    /* renamed from: e0 */
    public static boolean m70348e0() {
        return C7268e.m70591a1();
    }

    /* renamed from: h0 */
    public static C7263xk m70349h0(C6298oo ooVar) {
        return m70350i0(ooVar, 4096);
    }

    /* renamed from: i0 */
    public static C7263xk m70350i0(C6298oo ooVar, int i) {
        return m70347d0() ? m70355p0(ooVar, i) : m70353n0(ooVar, i);
    }

    /* renamed from: l0 */
    public static C7263xk m70351l0(C6298oo ooVar) {
        return m70352m0(ooVar, 4096);
    }

    /* renamed from: m0 */
    public static C7263xk m70352m0(C6298oo ooVar, int i) {
        return m70348e0() ? m70356q0(ooVar, i) : m70354o0(ooVar, i);
    }

    /* renamed from: n0 */
    public static C7263xk m70353n0(C6298oo ooVar, int i) {
        return new C7265b(ooVar, i);
    }

    /* renamed from: o0 */
    public static C7263xk m70354o0(C6298oo ooVar, int i) {
        return new C7266c(ooVar, i);
    }

    /* renamed from: p0 */
    public static C7263xk m70355p0(C6298oo ooVar, int i) {
        if (m70347d0()) {
            return new C7267d(ooVar, i);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    /* renamed from: q0 */
    public static C7263xk m70356q0(C6298oo ooVar, int i) {
        if (m70348e0()) {
            return new C7268e(ooVar, i);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    /* renamed from: A0 */
    public abstract void mo47219A0(long j);

    /* renamed from: B */
    public final void mo38315B(int i, double d) throws IOException {
        mo38362w(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: B0 */
    public final void mo47220B0(int i, v92 v92, boolean z) throws IOException {
        if (z) {
            mo47249r0((v92.size() * 8) + 10);
            int c0 = mo47244c0();
            for (int size = v92.size() - 1; size >= 0; size--) {
                mo47219A0(v92.getLong(size));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = v92.size() - 1; size2 >= 0; size2--) {
            mo38362w(i, v92.getLong(size2));
        }
    }

    /* renamed from: C */
    public final void mo38316C(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof as1) {
            mo47236S0(i, (as1) list, z);
        } else {
            mo47237T0(i, list, z);
        }
    }

    /* renamed from: C0 */
    public final void mo47221C0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo47249r0((list.size() * 8) + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47219A0(list.get(size).longValue());
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38362w(i, list.get(size2).longValue());
        }
    }

    /* renamed from: D */
    public final void mo38317D(int i, float f) throws IOException {
        mo38351l(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: D0 */
    public final void mo47222D0(int i, w71 w71, boolean z) throws IOException {
        if (z) {
            mo47249r0((w71.size() * 4) + 10);
            int c0 = mo47244c0();
            for (int size = w71.size() - 1; size >= 0; size--) {
                mo47255x0(Float.floatToRawIntBits(w71.getFloat(size)));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = w71.size() - 1; size2 >= 0; size2--) {
            mo38317D(i, w71.getFloat(size2));
        }
    }

    /* renamed from: E */
    public final void mo38318E(int i, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo38361v(i, list.get(size));
        }
    }

    /* renamed from: E0 */
    public final void mo47223E0(int i, List<Float> list, boolean z) throws IOException {
        if (z) {
            mo47249r0((list.size() * 4) + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47255x0(Float.floatToRawIntBits(list.get(size).floatValue()));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38317D(i, list.get(size2).floatValue());
        }
    }

    /* renamed from: F */
    public final void mo38319F(int i, List<?> list, xr3 xr3) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo38352m(i, list.get(size), xr3);
        }
    }

    /* renamed from: F0 */
    public abstract void mo47224F0(int i);

    /* renamed from: G */
    public final void mo38320G(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof v92) {
            mo47220B0(i, (v92) list, z);
        } else {
            mo47221C0(i, list, z);
        }
    }

    /* renamed from: G0 */
    public final void mo47225G0(int i, as1 as1, boolean z) throws IOException {
        if (z) {
            mo47249r0((as1.size() * 10) + 10);
            int c0 = mo47244c0();
            for (int size = as1.size() - 1; size >= 0; size--) {
                mo47224F0(as1.getInt(size));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = as1.size() - 1; size2 >= 0; size2--) {
            mo38359t(i, as1.getInt(size2));
        }
    }

    /* renamed from: H0 */
    public final void mo47226H0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo47249r0((list.size() * 10) + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47224F0(list.get(size).intValue());
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38359t(i, list.get(size2).intValue());
        }
    }

    /* renamed from: I */
    public final void mo38322I(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof as1) {
            mo47229L0(i, (as1) list, z);
        } else {
            mo47230M0(i, list, z);
        }
    }

    /* renamed from: I0 */
    public final void mo47227I0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            mo38355p(i, (String) obj);
        } else {
            mo38345f(i, (C5173er) obj);
        }
    }

    /* renamed from: J */
    public final void mo38323J(int i, List<C5173er> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo38345f(i, list.get(size));
        }
    }

    /* renamed from: K */
    public final void mo38324K(int i, List<Integer> list, boolean z) throws IOException {
        mo38332S(i, list, z);
    }

    /* renamed from: K0 */
    public abstract void mo47228K0(int i);

    /* renamed from: L */
    public final void mo38325L(int i, int i2) throws IOException {
        mo38351l(i, i2);
    }

    /* renamed from: L0 */
    public final void mo47229L0(int i, as1 as1, boolean z) throws IOException {
        if (z) {
            mo47249r0((as1.size() * 5) + 10);
            int c0 = mo47244c0();
            for (int size = as1.size() - 1; size >= 0; size--) {
                mo47228K0(as1.getInt(size));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = as1.size() - 1; size2 >= 0; size2--) {
            mo38348i(i, as1.getInt(size2));
        }
    }

    /* renamed from: M */
    public final void mo38326M(int i, List<Integer> list, boolean z) throws IOException {
        mo38346g(i, list, z);
    }

    /* renamed from: M0 */
    public final void mo47230M0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo47249r0((list.size() * 5) + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47228K0(list.get(size).intValue());
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38348i(i, list.get(size2).intValue());
        }
    }

    /* renamed from: N */
    public final void mo38327N(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof v92) {
            mo47232O0(i, (v92) list, z);
        } else {
            mo47233P0(i, list, z);
        }
    }

    /* renamed from: N0 */
    public abstract void mo47231N0(long j);

    /* renamed from: O */
    public final void mo38328O(int i, List<Double> list, boolean z) throws IOException {
        if (list instanceof do0) {
            mo47253v0(i, (do0) list, z);
        } else {
            mo47254w0(i, list, z);
        }
    }

    /* renamed from: O0 */
    public final void mo47232O0(int i, v92 v92, boolean z) throws IOException {
        if (z) {
            mo47249r0((v92.size() * 10) + 10);
            int c0 = mo47244c0();
            for (int size = v92.size() - 1; size >= 0; size--) {
                mo47231N0(v92.getLong(size));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = v92.size() - 1; size2 >= 0; size2--) {
            mo38358s(i, v92.getLong(size2));
        }
    }

    /* renamed from: P */
    public <K, V> void mo38329P(int i, oc2.C6267b<K, V> bVar, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            int c0 = mo47244c0();
            m70344J0(this, 2, bVar.f32992b, next.getValue());
            m70344J0(this, 1, bVar.f32990a, next.getKey());
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
        }
    }

    /* renamed from: P0 */
    public final void mo47233P0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo47249r0((list.size() * 10) + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47231N0(list.get(size).longValue());
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38358s(i, list.get(size2).longValue());
        }
    }

    /* renamed from: Q */
    public final void mo38330Q(int i, List<?> list, xr3 xr3) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo38341b(i, list.get(size), xr3);
        }
    }

    /* renamed from: Q0 */
    public abstract void mo47234Q0(String str);

    /* renamed from: R */
    public final void mo38331R(int i, List<Long> list, boolean z) throws IOException {
        mo38360u(i, list, z);
    }

    /* renamed from: R0 */
    public abstract void mo47235R0(int i, int i2);

    /* renamed from: S */
    public final void mo38332S(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof as1) {
            mo47225G0(i, (as1) list, z);
        } else {
            mo47226H0(i, list, z);
        }
    }

    /* renamed from: S0 */
    public final void mo47236S0(int i, as1 as1, boolean z) throws IOException {
        if (z) {
            mo47249r0((as1.size() * 5) + 10);
            int c0 = mo47244c0();
            for (int size = as1.size() - 1; size >= 0; size--) {
                mo47240W0(as1.getInt(size));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = as1.size() - 1; size2 >= 0; size2--) {
            mo38354o(i, as1.getInt(size2));
        }
    }

    /* renamed from: T0 */
    public final void mo47237T0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo47249r0((list.size() * 5) + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47240W0(list.get(size).intValue());
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38354o(i, list.get(size2).intValue());
        }
    }

    /* renamed from: U0 */
    public final void mo47238U0(int i, v92 v92, boolean z) throws IOException {
        if (z) {
            mo47249r0((v92.size() * 10) + 10);
            int c0 = mo47244c0();
            for (int size = v92.size() - 1; size >= 0; size--) {
                mo47241X0(v92.getLong(size));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = v92.size() - 1; size2 >= 0; size2--) {
            mo38314A(i, v92.getLong(size2));
        }
    }

    /* renamed from: V0 */
    public final void mo47239V0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo47249r0((list.size() * 10) + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47241X0(list.get(size).longValue());
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38314A(i, list.get(size2).longValue());
        }
    }

    /* renamed from: W0 */
    public abstract void mo47240W0(int i);

    /* renamed from: X0 */
    public abstract void mo47241X0(long j);

    /* renamed from: Z */
    public final Queue<C7303y4> mo47242Z() {
        mo47243b0();
        return this.f37500a;
    }

    /* renamed from: a */
    public final void mo38339a(int i, int i2) throws IOException {
        mo38359t(i, i2);
    }

    /* renamed from: b0 */
    public abstract void mo47243b0();

    /* renamed from: c0 */
    public abstract int mo47244c0();

    /* renamed from: d */
    public final void mo38343d(int i, long j) throws IOException {
        mo38362w(i, j);
    }

    /* renamed from: f0 */
    public final C7303y4 mo47245f0() {
        return this.f37499a.mo41922a(this.f37498a);
    }

    /* renamed from: g */
    public final void mo38346g(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof as1) {
            mo47256y0(i, (as1) list, z);
        } else {
            mo47257z0(i, list, z);
        }
    }

    /* renamed from: g0 */
    public final C7303y4 mo47246g0(int i) {
        return this.f37499a.mo41922a(Math.max(i, this.f37498a));
    }

    /* renamed from: h */
    public final void mo38347h(int i, long j) throws IOException {
        mo38314A(i, j);
    }

    /* renamed from: j */
    public final void mo38349j(int i, List<String> list) throws IOException {
        if (list instanceof n22) {
            n22 n22 = (n22) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47227I0(i, n22.mo36162g2(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38355p(i, list.get(size2));
        }
    }

    /* renamed from: j0 */
    public final C7303y4 mo47247j0() {
        return this.f37499a.mo41923b(this.f37498a);
    }

    /* renamed from: k */
    public final void mo38350k(int i, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof C6126mn) {
            mo47251t0(i, (C6126mn) list, z);
        } else {
            mo47252u0(i, list, z);
        }
    }

    /* renamed from: k0 */
    public final C7303y4 mo47248k0(int i) {
        return this.f37499a.mo41923b(Math.max(i, this.f37498a));
    }

    /* renamed from: q */
    public final void mo38356q(int i, Object obj) throws IOException {
        mo47235R0(1, 4);
        if (obj instanceof C5173er) {
            mo38345f(3, (C5173er) obj);
        } else {
            mo38361v(3, obj);
        }
        mo38354o(2, i);
        mo47235R0(1, 3);
    }

    /* renamed from: r */
    public final void mo38357r(int i, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo38321H(i, list.get(size));
        }
    }

    /* renamed from: r0 */
    public abstract void mo47249r0(int i);

    /* renamed from: s0 */
    public abstract void mo47250s0(boolean z);

    /* renamed from: t0 */
    public final void mo47251t0(int i, C6126mn mnVar, boolean z) throws IOException {
        if (z) {
            mo47249r0(mnVar.size() + 10);
            int c0 = mo47244c0();
            for (int size = mnVar.size() - 1; size >= 0; size--) {
                mo47250s0(mnVar.mo40705d(size));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = mnVar.size() - 1; size2 >= 0; size2--) {
            mo38342c(i, mnVar.mo40705d(size2));
        }
    }

    /* renamed from: u */
    public final void mo38360u(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof v92) {
            mo47238U0(i, (v92) list, z);
        } else {
            mo47239V0(i, list, z);
        }
    }

    /* renamed from: u0 */
    public final void mo47252u0(int i, List<Boolean> list, boolean z) throws IOException {
        if (z) {
            mo47249r0(list.size() + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47250s0(list.get(size).booleanValue());
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38342c(i, list.get(size2).booleanValue());
        }
    }

    /* renamed from: v0 */
    public final void mo47253v0(int i, do0 do0, boolean z) throws IOException {
        if (z) {
            mo47249r0((do0.size() * 8) + 10);
            int c0 = mo47244c0();
            for (int size = do0.size() - 1; size >= 0; size--) {
                mo47219A0(Double.doubleToRawLongBits(do0.getDouble(size)));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = do0.size() - 1; size2 >= 0; size2--) {
            mo38315B(i, do0.getDouble(size2));
        }
    }

    /* renamed from: w0 */
    public final void mo47254w0(int i, List<Double> list, boolean z) throws IOException {
        if (z) {
            mo47249r0((list.size() * 8) + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47219A0(Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38315B(i, list.get(size2).doubleValue());
        }
    }

    /* renamed from: x */
    public final void mo38363x(int i, List<Float> list, boolean z) throws IOException {
        if (list instanceof w71) {
            mo47222D0(i, (w71) list, z);
        } else {
            mo47223E0(i, list, z);
        }
    }

    /* renamed from: x0 */
    public abstract void mo47255x0(int i);

    /* renamed from: y */
    public final ty4.C6908a mo38364y() {
        return ty4.C6908a.DESCENDING;
    }

    /* renamed from: y0 */
    public final void mo47256y0(int i, as1 as1, boolean z) throws IOException {
        if (z) {
            mo47249r0((as1.size() * 4) + 10);
            int c0 = mo47244c0();
            for (int size = as1.size() - 1; size >= 0; size--) {
                mo47255x0(as1.getInt(size));
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = as1.size() - 1; size2 >= 0; size2--) {
            mo38351l(i, as1.getInt(size2));
        }
    }

    /* renamed from: z */
    public final void mo38365z(int i, List<Long> list, boolean z) throws IOException {
        mo38320G(i, list, z);
    }

    /* renamed from: z0 */
    public final void mo47257z0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo47249r0((list.size() * 4) + 10);
            int c0 = mo47244c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo47255x0(list.get(size).intValue());
            }
            mo47240W0(mo47244c0() - c0);
            mo47235R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo38351l(i, list.get(size2).intValue());
        }
    }
}
