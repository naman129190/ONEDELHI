package com.onedelhi.secure;

import com.onedelhi.secure.m10;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.onedelhi.secure.vk */
public abstract class C7055vk implements vf3 {

    /* renamed from: c */
    public static final int f36578c = 3;

    /* renamed from: d */
    public static final int f36579d = 7;

    /* renamed from: com.onedelhi.secure.vk$a */
    public static /* synthetic */ class C7056a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36580a;

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
                f36580a = r0
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f36580a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7055vk.C7056a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.vk$b */
    public static final class C7057b extends C7055vk {

        /* renamed from: a */
        public final boolean f36581a;

        /* renamed from: a */
        public final byte[] f36582a;

        /* renamed from: e */
        public int f36583e;

        /* renamed from: f */
        public final int f36584f;

        /* renamed from: g */
        public int f36585g;

        /* renamed from: h */
        public int f36586h;

        /* renamed from: i */
        public int f36587i;

        public C7057b(ByteBuffer byteBuffer, boolean z) {
            super((C7056a) null);
            this.f36581a = z;
            this.f36582a = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f36583e = arrayOffset;
            this.f36584f = arrayOffset;
            this.f36585g = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public void mo36992A(List<Integer> list) throws IOException {
            int i;
            int i2;
            int i3;
            if (list instanceof as1) {
                as1 as1 = (as1) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 0) {
                    do {
                        as1.mo31124G0(mo36998G());
                        if (!mo46161V()) {
                            i3 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i3;
                    return;
                } else if (b == 2) {
                    i = this.f36583e + mo46172g0();
                    while (this.f36583e < i) {
                        as1.mo31124G0(mo46172g0());
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo36998G()));
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                    return;
                } else if (b2 == 2) {
                    i = this.f36583e + mo46172g0();
                    while (this.f36583e < i) {
                        list.add(Integer.valueOf(mo46172g0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
            mo46176k0(i);
        }

        /* renamed from: B */
        public int mo36993B() throws IOException {
            mo46177l0(0);
            return mo46172g0();
        }

        /* renamed from: C */
        public int mo36994C() throws IOException {
            if (mo46161V()) {
                return Integer.MAX_VALUE;
            }
            int g0 = mo46172g0();
            this.f36586h = g0;
            if (g0 == this.f36587i) {
                return Integer.MAX_VALUE;
            }
            return wx4.m69698a(g0);
        }

        /* renamed from: D */
        public void mo36995D(List<String> list) throws IOException {
            mo46171f0(list, true);
        }

        /* renamed from: E */
        public void mo36996E(List<Long> list) throws IOException {
            int i;
            int i2;
            int i3;
            if (list instanceof v92) {
                v92 v92 = (v92) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 0) {
                    do {
                        v92.mo46036L1(mo37035q());
                        if (!mo46161V()) {
                            i3 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i3;
                    return;
                } else if (b == 2) {
                    i = this.f36583e + mo46172g0();
                    while (this.f36583e < i) {
                        v92.mo46036L1(mo46173h0());
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo37035q()));
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                    return;
                } else if (b2 == 2) {
                    i = this.f36583e + mo46172g0();
                    while (this.f36583e < i) {
                        list.add(Long.valueOf(mo46173h0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
            mo46176k0(i);
        }

        /* renamed from: F */
        public <T> void mo36997F(List<T> list, xr3<T> xr3, zy0 zy0) throws IOException {
            int i;
            if (wx4.m69699b(this.f36586h) == 2) {
                int i2 = this.f36586h;
                do {
                    list.add(mo46169d0(xr3, zy0));
                    if (!mo46161V()) {
                        i = this.f36583e;
                    } else {
                        return;
                    }
                } while (mo46172g0() == i2);
                this.f36583e = i;
                return;
            }
            throw nt1.m58785f();
        }

        /* renamed from: G */
        public int mo36998G() throws IOException {
            mo46177l0(0);
            return mo46172g0();
        }

        /* renamed from: H */
        public void mo36999H(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof as1) {
                as1 as1 = (as1) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 2) {
                    int g0 = mo46172g0();
                    mo46182q0(g0);
                    int i3 = this.f36583e + g0;
                    while (this.f36583e < i3) {
                        as1.mo31124G0(mo46166a0());
                    }
                } else if (b == 5) {
                    do {
                        as1.mo31124G0(mo37010S());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 2) {
                    int g02 = mo46172g0();
                    mo46182q0(g02);
                    int i4 = this.f36583e + g02;
                    while (this.f36583e < i4) {
                        list.add(Integer.valueOf(mo46166a0()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo37010S()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else {
                    throw nt1.m58785f();
                }
            }
        }

        /* renamed from: I */
        public long mo37000I() throws IOException {
            mo46177l0(0);
            return g00.m48669c(mo46173h0());
        }

        /* renamed from: J */
        public void mo37001J(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof as1) {
                as1 as1 = (as1) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 0) {
                    do {
                        as1.mo31124G0(mo36993B());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else if (b == 2) {
                    int g0 = this.f36583e + mo46172g0();
                    while (this.f36583e < g0) {
                        as1.mo31124G0(mo46172g0());
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo36993B()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else if (b2 == 2) {
                    int g02 = this.f36583e + mo46172g0();
                    while (this.f36583e < g02) {
                        list.add(Integer.valueOf(mo46172g0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
        }

        /* renamed from: K */
        public <T> T mo37002K(xr3<T> xr3, zy0 zy0) throws IOException {
            mo46177l0(3);
            return mo46164Y(xr3, zy0);
        }

        /* renamed from: L */
        public <T> void mo37003L(List<T> list, xr3<T> xr3, zy0 zy0) throws IOException {
            int i;
            if (wx4.m69699b(this.f36586h) == 3) {
                int i2 = this.f36586h;
                do {
                    list.add(mo46164Y(xr3, zy0));
                    if (!mo46161V()) {
                        i = this.f36583e;
                    } else {
                        return;
                    }
                } while (mo46172g0() == i2);
                this.f36583e = i;
                return;
            }
            throw nt1.m58785f();
        }

        /* renamed from: M */
        public int mo37004M() throws IOException {
            mo46177l0(0);
            return g00.m48668b(mo46172g0());
        }

        /* renamed from: N */
        public long mo37005N() throws IOException {
            mo46177l0(0);
            return mo46173h0();
        }

        /* renamed from: O */
        public boolean mo37006O() throws IOException {
            mo46177l0(0);
            return mo46172g0() != 0;
        }

        /* renamed from: P */
        public C5173er mo37007P() throws IOException {
            mo46177l0(2);
            int g0 = mo46172g0();
            if (g0 == 0) {
                return C5173er.f28039a;
            }
            mo46175j0(g0);
            C5173er r0 = this.f36581a ? C5173er.m47131r0(this.f36582a, this.f36583e, g0) : C5173er.m47135v(this.f36582a, this.f36583e, g0);
            this.f36583e += g0;
            return r0;
        }

        /* renamed from: Q */
        public String mo37008Q() throws IOException {
            return mo46170e0(true);
        }

        /* renamed from: R */
        public void mo37009R(List<Long> list) throws IOException {
            int i;
            int i2;
            int i3;
            if (list instanceof v92) {
                v92 v92 = (v92) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 0) {
                    do {
                        v92.mo46036L1(mo37005N());
                        if (!mo46161V()) {
                            i3 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i3;
                    return;
                } else if (b == 2) {
                    i = this.f36583e + mo46172g0();
                    while (this.f36583e < i) {
                        v92.mo46036L1(mo46173h0());
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo37005N()));
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                    return;
                } else if (b2 == 2) {
                    i = this.f36583e + mo46172g0();
                    while (this.f36583e < i) {
                        list.add(Long.valueOf(mo46173h0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
            mo46176k0(i);
        }

        /* renamed from: S */
        public int mo37010S() throws IOException {
            mo46177l0(5);
            return mo46165Z();
        }

        /* renamed from: T */
        public int mo46160T() {
            return this.f36583e - this.f36584f;
        }

        /* renamed from: V */
        public final boolean mo46161V() {
            return this.f36583e == this.f36585g;
        }

        /* renamed from: W */
        public final byte mo46162W() throws IOException {
            int i = this.f36583e;
            if (i != this.f36585g) {
                byte[] bArr = this.f36582a;
                this.f36583e = i + 1;
                return bArr[i];
            }
            throw nt1.m58791n();
        }

        /* renamed from: X */
        public final Object mo46163X(wx4.C7195b bVar, Class<?> cls, zy0 zy0) throws IOException {
            switch (C7056a.f36580a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo37006O());
                case 2:
                    return mo37007P();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo36993B());
                case 5:
                    return Integer.valueOf(mo37031m());
                case 6:
                    return Long.valueOf(mo37021c());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo36998G());
                case 9:
                    return Long.valueOf(mo37005N());
                case 10:
                    return mo37028j(cls, zy0);
                case 11:
                    return Integer.valueOf(mo37010S());
                case 12:
                    return Long.valueOf(mo37019b());
                case 13:
                    return Integer.valueOf(mo37004M());
                case 14:
                    return Long.valueOf(mo37000I());
                case 15:
                    return mo37008Q();
                case 16:
                    return Integer.valueOf(mo37032n());
                case 17:
                    return Long.valueOf(mo37035q());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: Y */
        public final <T> T mo46164Y(xr3<T> xr3, zy0 zy0) throws IOException {
            int i = this.f36587i;
            this.f36587i = wx4.m69700c(wx4.m69698a(this.f36586h), 4);
            try {
                T g = xr3.mo31770g();
                xr3.mo31776j(g, this, zy0);
                xr3.mo31774i(g);
                if (this.f36586h == this.f36587i) {
                    return g;
                }
                throw nt1.m58788i();
            } finally {
                this.f36587i = i;
            }
        }

        /* renamed from: Z */
        public final int mo46165Z() throws IOException {
            mo46175j0(4);
            return mo46166a0();
        }

        /* renamed from: a */
        public <T> T mo37017a(Class<T> cls, zy0 zy0) throws IOException {
            mo46177l0(3);
            return mo46164Y(p63.m60498a().mo42385i(cls), zy0);
        }

        /* renamed from: a0 */
        public final int mo46166a0() {
            int i = this.f36583e;
            byte[] bArr = this.f36582a;
            this.f36583e = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: b */
        public long mo37019b() throws IOException {
            mo46177l0(1);
            return mo46167b0();
        }

        /* renamed from: b0 */
        public final long mo46167b0() throws IOException {
            mo46175j0(8);
            return mo46168c0();
        }

        /* renamed from: c */
        public long mo37021c() throws IOException {
            mo46177l0(1);
            return mo46167b0();
        }

        /* renamed from: c0 */
        public final long mo46168c0() {
            int i = this.f36583e;
            byte[] bArr = this.f36582a;
            this.f36583e = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: d0 */
        public final <T> T mo46169d0(xr3<T> xr3, zy0 zy0) throws IOException {
            int g0 = mo46172g0();
            mo46175j0(g0);
            int i = this.f36585g;
            int i2 = this.f36583e + g0;
            this.f36585g = i2;
            try {
                T g = xr3.mo31770g();
                xr3.mo31776j(g, this, zy0);
                xr3.mo31774i(g);
                if (this.f36583e == i2) {
                    return g;
                }
                throw nt1.m58788i();
            } finally {
                this.f36585g = i;
            }
        }

        /* renamed from: e */
        public String mo37023e() throws IOException {
            return mo46170e0(false);
        }

        /* renamed from: e0 */
        public String mo46170e0(boolean z) throws IOException {
            mo46177l0(2);
            int g0 = mo46172g0();
            if (g0 == 0) {
                return "";
            }
            mo46175j0(g0);
            if (z) {
                byte[] bArr = this.f36582a;
                int i = this.f36583e;
                if (!hq4.m50772u(bArr, i, i + g0)) {
                    throw nt1.m58784e();
                }
            }
            String str = new String(this.f36582a, this.f36583e, g0, vs1.f36665a);
            this.f36583e += g0;
            return str;
        }

        /* renamed from: f */
        public void mo37024f(List<String> list) throws IOException {
            mo46171f0(list, false);
        }

        /* renamed from: f0 */
        public void mo46171f0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (wx4.m69699b(this.f36586h) != 2) {
                throw nt1.m58785f();
            } else if (!(list instanceof n22) || z) {
                do {
                    list.add(mo46170e0(z));
                    if (!mo46161V()) {
                        i = this.f36583e;
                    } else {
                        return;
                    }
                } while (mo46172g0() == this.f36586h);
                this.f36583e = i;
            } else {
                n22 n22 = (n22) list;
                do {
                    n22.mo36157M(mo37007P());
                    if (!mo46161V()) {
                        i2 = this.f36583e;
                    } else {
                        return;
                    }
                } while (mo46172g0() == this.f36586h);
                this.f36583e = i2;
            }
        }

        /* renamed from: g */
        public void mo37025g(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof v92) {
                v92 v92 = (v92) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 1) {
                    do {
                        v92.mo46036L1(mo37021c());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else if (b == 2) {
                    int g0 = mo46172g0();
                    mo46183r0(g0);
                    int i3 = this.f36583e + g0;
                    while (this.f36583e < i3) {
                        v92.mo46036L1(mo46168c0());
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo37021c()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else if (b2 == 2) {
                    int g02 = mo46172g0();
                    mo46183r0(g02);
                    int i4 = this.f36583e + g02;
                    while (this.f36583e < i4) {
                        list.add(Long.valueOf(mo46168c0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
        }

        /* renamed from: g0 */
        public final int mo46172g0() throws IOException {
            byte b;
            int i = this.f36583e;
            int i2 = this.f36585g;
            if (i2 != i) {
                byte[] bArr = this.f36582a;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f36583e = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo46174i0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ C7276xq.f37586a;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ C7276xq.f37586a;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ C7276xq.f37586a;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << m10.C2800f.f15783a)) ^ C7276xq.f37586a;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw nt1.m58786g();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f36583e = i4;
                    return b;
                }
            } else {
                throw nt1.m58791n();
            }
        }

        /* renamed from: h */
        public void mo37026h(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof w71) {
                w71 w71 = (w71) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 2) {
                    int g0 = mo46172g0();
                    mo46182q0(g0);
                    int i3 = this.f36583e + g0;
                    while (this.f36583e < i3) {
                        w71.mo46323b2(Float.intBitsToFloat(mo46166a0()));
                    }
                } else if (b == 5) {
                    do {
                        w71.mo46323b2(readFloat());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 2) {
                    int g02 = mo46172g0();
                    mo46182q0(g02);
                    int i4 = this.f36583e + g02;
                    while (this.f36583e < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo46166a0())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else {
                    throw nt1.m58785f();
                }
            }
        }

        /* renamed from: h0 */
        public long mo46173h0() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f36583e;
            int i3 = this.f36585g;
            if (i3 != i2) {
                byte[] bArr = this.f36582a;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f36583e = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo46174i0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ C7276xq.f37586a;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ C7276xq.f37586a);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ C7276xq.f37586a;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw nt1.m58786g();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f36583e = i;
                        return j;
                    }
                    j = (long) b;
                    this.f36583e = i;
                    return j;
                }
            } else {
                throw nt1.m58791n();
            }
        }

        /* renamed from: i */
        public boolean mo37027i() throws IOException {
            int i;
            int i2;
            if (mo46161V() || (i = this.f36586h) == this.f36587i) {
                return false;
            }
            int b = wx4.m69699b(i);
            if (b != 0) {
                if (b == 1) {
                    i2 = 8;
                } else if (b == 2) {
                    i2 = mo46172g0();
                } else if (b == 3) {
                    mo46179n0();
                    return true;
                } else if (b == 5) {
                    i2 = 4;
                } else {
                    throw nt1.m58785f();
                }
                mo46178m0(i2);
                return true;
            }
            mo46180o0();
            return true;
        }

        /* renamed from: i0 */
        public final long mo46174i0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte W = mo46162W();
                j |= ((long) (W & Byte.MAX_VALUE)) << i;
                if ((W & C7276xq.f37586a) == 0) {
                    return j;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: j */
        public <T> T mo37028j(Class<T> cls, zy0 zy0) throws IOException {
            mo46177l0(2);
            return mo46169d0(p63.m60498a().mo42385i(cls), zy0);
        }

        /* renamed from: j0 */
        public final void mo46175j0(int i) throws IOException {
            if (i < 0 || i > this.f36585g - this.f36583e) {
                throw nt1.m58791n();
            }
        }

        /* renamed from: k */
        public void mo37029k(List<Boolean> list) throws IOException {
            int i;
            int i2;
            int i3;
            if (list instanceof C6126mn) {
                C6126mn mnVar = (C6126mn) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 0) {
                    do {
                        mnVar.mo40703S0(mo37006O());
                        if (!mo46161V()) {
                            i3 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i3;
                    return;
                } else if (b == 2) {
                    i = this.f36583e + mo46172g0();
                    while (this.f36583e < i) {
                        mnVar.mo40703S0(mo46172g0() != 0);
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo37006O()));
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                    return;
                } else if (b2 == 2) {
                    i = this.f36583e + mo46172g0();
                    while (this.f36583e < i) {
                        list.add(Boolean.valueOf(mo46172g0() != 0));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
            mo46176k0(i);
        }

        /* renamed from: k0 */
        public final void mo46176k0(int i) throws IOException {
            if (this.f36583e != i) {
                throw nt1.m58791n();
            }
        }

        /* renamed from: l */
        public void mo37030l(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof as1) {
                as1 as1 = (as1) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 2) {
                    int g0 = mo46172g0();
                    mo46182q0(g0);
                    int i3 = this.f36583e + g0;
                    while (this.f36583e < i3) {
                        as1.mo31124G0(mo46166a0());
                    }
                } else if (b == 5) {
                    do {
                        as1.mo31124G0(mo37031m());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 2) {
                    int g02 = mo46172g0();
                    mo46182q0(g02);
                    int i4 = this.f36583e + g02;
                    while (this.f36583e < i4) {
                        list.add(Integer.valueOf(mo46166a0()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo37031m()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else {
                    throw nt1.m58785f();
                }
            }
        }

        /* renamed from: l0 */
        public final void mo46177l0(int i) throws IOException {
            if (wx4.m69699b(this.f36586h) != i) {
                throw nt1.m58785f();
            }
        }

        /* renamed from: m */
        public int mo37031m() throws IOException {
            mo46177l0(5);
            return mo46165Z();
        }

        /* renamed from: m0 */
        public final void mo46178m0(int i) throws IOException {
            mo46175j0(i);
            this.f36583e += i;
        }

        /* renamed from: n */
        public int mo37032n() throws IOException {
            mo46177l0(0);
            return mo46172g0();
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: n0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo46179n0() throws java.io.IOException {
            /*
                r3 = this;
                int r0 = r3.f36587i
                int r1 = r3.f36586h
                int r1 = com.onedelhi.secure.wx4.m69698a(r1)
                r2 = 4
                int r1 = com.onedelhi.secure.wx4.m69700c(r1, r2)
                r3.f36587i = r1
            L_0x000f:
                int r1 = r3.mo36994C()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo37027i()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f36586h
                int r2 = r3.f36587i
                if (r1 != r2) goto L_0x0027
                r3.f36587i = r0
                return
            L_0x0027:
                com.onedelhi.secure.nt1 r0 = com.onedelhi.secure.nt1.m58788i()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7055vk.C7057b.mo46179n0():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (mo37027i() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new com.onedelhi.secure.nt1("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void mo37033o(java.util.Map<K, V> r8, com.onedelhi.secure.oc2.C6267b<K, V> r9, com.onedelhi.secure.zy0 r10) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 2
                r7.mo46177l0(r0)
                int r1 = r7.mo46172g0()
                r7.mo46175j0(r1)
                int r2 = r7.f36585g
                int r3 = r7.f36583e
                int r3 = r3 + r1
                r7.f36585g = r3
                K r1 = r9.f32991a     // Catch:{ all -> 0x005b }
                V r3 = r9.f32993b     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.mo36994C()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f36585g = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.mo37027i()     // Catch:{ a -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                com.onedelhi.secure.nt1 r4 = new com.onedelhi.secure.nt1     // Catch:{ a -> 0x004e }
                r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x004e }
                throw r4     // Catch:{ a -> 0x004e }
            L_0x0039:
                com.onedelhi.secure.wx4$b r4 = r9.f32992b     // Catch:{ a -> 0x004e }
                V r5 = r9.f32993b     // Catch:{ a -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004e }
                java.lang.Object r3 = r7.mo46163X(r4, r5, r10)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x0046:
                com.onedelhi.secure.wx4$b r4 = r9.f32990a     // Catch:{ a -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.mo46163X(r4, r5, r5)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.mo37027i()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                com.onedelhi.secure.nt1 r8 = new com.onedelhi.secure.nt1     // Catch:{ all -> 0x005b }
                r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f36585g = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7055vk.C7057b.mo37033o(java.util.Map, com.onedelhi.secure.oc2$b, com.onedelhi.secure.zy0):void");
        }

        /* renamed from: o0 */
        public final void mo46180o0() throws IOException {
            int i = this.f36585g;
            int i2 = this.f36583e;
            if (i - i2 >= 10) {
                byte[] bArr = this.f36582a;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f36583e = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            mo46181p0();
        }

        /* renamed from: p */
        public <T> T mo37034p(xr3<T> xr3, zy0 zy0) throws IOException {
            mo46177l0(2);
            return mo46169d0(xr3, zy0);
        }

        /* renamed from: p0 */
        public final void mo46181p0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo46162W() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw nt1.m58786g();
        }

        /* renamed from: q */
        public long mo37035q() throws IOException {
            mo46177l0(0);
            return mo46173h0();
        }

        /* renamed from: q0 */
        public final void mo46182q0(int i) throws IOException {
            mo46175j0(i);
            if ((i & 3) != 0) {
                throw nt1.m58788i();
            }
        }

        /* renamed from: r */
        public <T> void mo37036r(List<T> list, Class<T> cls, zy0 zy0) throws IOException {
            mo36997F(list, p63.m60498a().mo42385i(cls), zy0);
        }

        /* renamed from: r0 */
        public final void mo46183r0(int i) throws IOException {
            mo46175j0(i);
            if ((i & 7) != 0) {
                throw nt1.m58788i();
            }
        }

        public double readDouble() throws IOException {
            mo46177l0(1);
            return Double.longBitsToDouble(mo46167b0());
        }

        public float readFloat() throws IOException {
            mo46177l0(5);
            return Float.intBitsToFloat(mo46165Z());
        }

        /* renamed from: s */
        public <T> void mo37039s(List<T> list, Class<T> cls, zy0 zy0) throws IOException {
            mo37003L(list, p63.m60498a().mo42385i(cls), zy0);
        }

        /* renamed from: t */
        public void mo37040t(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof as1) {
                as1 as1 = (as1) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 0) {
                    do {
                        as1.mo31124G0(mo37004M());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else if (b == 2) {
                    int g0 = this.f36583e + mo46172g0();
                    while (this.f36583e < g0) {
                        as1.mo31124G0(g00.m48668b(mo46172g0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37004M()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else if (b2 == 2) {
                    int g02 = this.f36583e + mo46172g0();
                    while (this.f36583e < g02) {
                        list.add(Integer.valueOf(g00.m48668b(mo46172g0())));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
        }

        /* renamed from: u */
        public void mo37041u(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof v92) {
                v92 v92 = (v92) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 0) {
                    do {
                        v92.mo46036L1(mo37000I());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else if (b == 2) {
                    int g0 = this.f36583e + mo46172g0();
                    while (this.f36583e < g0) {
                        v92.mo46036L1(g00.m48669c(mo46173h0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo37000I()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else if (b2 == 2) {
                    int g02 = this.f36583e + mo46172g0();
                    while (this.f36583e < g02) {
                        list.add(Long.valueOf(g00.m48669c(mo46173h0())));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
        }

        /* renamed from: v */
        public void mo37042v(List<C5173er> list) throws IOException {
            int i;
            if (wx4.m69699b(this.f36586h) == 2) {
                do {
                    list.add(mo37007P());
                    if (!mo46161V()) {
                        i = this.f36583e;
                    } else {
                        return;
                    }
                } while (mo46172g0() == this.f36586h);
                this.f36583e = i;
                return;
            }
            throw nt1.m58785f();
        }

        /* renamed from: w */
        public void mo37043w(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof do0) {
                do0 do0 = (do0) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 1) {
                    do {
                        do0.mo34579V0(readDouble());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else if (b == 2) {
                    int g0 = mo46172g0();
                    mo46183r0(g0);
                    int i3 = this.f36583e + g0;
                    while (this.f36583e < i3) {
                        do0.mo34579V0(Double.longBitsToDouble(mo46168c0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else if (b2 == 2) {
                    int g02 = mo46172g0();
                    mo46183r0(g02);
                    int i4 = this.f36583e + g02;
                    while (this.f36583e < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo46168c0())));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
        }

        /* renamed from: x */
        public void mo37044x(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof as1) {
                as1 as1 = (as1) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 0) {
                    do {
                        as1.mo31124G0(mo37032n());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else if (b == 2) {
                    int g0 = this.f36583e + mo46172g0();
                    while (this.f36583e < g0) {
                        as1.mo31124G0(mo46172g0());
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37032n()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else if (b2 == 2) {
                    int g02 = this.f36583e + mo46172g0();
                    while (this.f36583e < g02) {
                        list.add(Integer.valueOf(mo46172g0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
        }

        /* renamed from: y */
        public int mo37045y() {
            return this.f36586h;
        }

        /* renamed from: z */
        public void mo37046z(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof v92) {
                v92 v92 = (v92) list;
                int b = wx4.m69699b(this.f36586h);
                if (b == 1) {
                    do {
                        v92.mo46036L1(mo37019b());
                        if (!mo46161V()) {
                            i2 = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i2;
                } else if (b == 2) {
                    int g0 = mo46172g0();
                    mo46183r0(g0);
                    int i3 = this.f36583e + g0;
                    while (this.f36583e < i3) {
                        v92.mo46036L1(mo46168c0());
                    }
                } else {
                    throw nt1.m58785f();
                }
            } else {
                int b2 = wx4.m69699b(this.f36586h);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo37019b()));
                        if (!mo46161V()) {
                            i = this.f36583e;
                        } else {
                            return;
                        }
                    } while (mo46172g0() == this.f36586h);
                    this.f36583e = i;
                } else if (b2 == 2) {
                    int g02 = mo46172g0();
                    mo46183r0(g02);
                    int i4 = this.f36583e + g02;
                    while (this.f36583e < i4) {
                        list.add(Long.valueOf(mo46168c0()));
                    }
                } else {
                    throw nt1.m58785f();
                }
            }
        }
    }

    public C7055vk() {
    }

    public /* synthetic */ C7055vk(C7056a aVar) {
        this();
    }

    /* renamed from: U */
    public static C7055vk m68101U(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C7057b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    /* renamed from: T */
    public abstract int mo46160T();

    /* renamed from: d */
    public boolean mo37022d() {
        return false;
    }
}
