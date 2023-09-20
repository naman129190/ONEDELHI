package com.onedelhi.secure;

import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.util.List;

public final class h00 implements vf3 {

    /* renamed from: f */
    public static final int f29348f = 3;

    /* renamed from: g */
    public static final int f29349g = 7;

    /* renamed from: h */
    public static final int f29350h = 0;

    /* renamed from: a */
    public final g00 f29351a;

    /* renamed from: c */
    public int f29352c;

    /* renamed from: d */
    public int f29353d;

    /* renamed from: e */
    public int f29354e = 0;

    /* renamed from: com.onedelhi.secure.h00$a */
    public static /* synthetic */ class C5460a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29355a;

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
                f29355a = r0
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f29355a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h00.C5460a.<clinit>():void");
        }
    }

    public h00(g00 g00) {
        g00 g002 = (g00) vs1.m68433e(g00, "input");
        this.f29351a = g002;
        g002.f28786a = this;
    }

    /* renamed from: T */
    public static h00 m50006T(g00 g00) {
        h00 h00 = g00.f28786a;
        return h00 != null ? h00 : new h00(g00);
    }

    /* renamed from: A */
    public void mo36992A(List<Integer> list) throws IOException {
        int i;
        int Y;
        int Y2;
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 0) {
                do {
                    as1.mo31124G0(this.f29351a.mo36416F());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
                return;
            } else if (b == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    as1.mo31124G0(this.f29351a.mo36416F());
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36416F()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
                return;
            } else if (b2 == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36416F()));
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        }
        mo37015Y(i);
    }

    /* renamed from: B */
    public int mo36993B() throws IOException {
        mo37016Z(0);
        return this.f29351a.mo36461z();
    }

    /* renamed from: C */
    public int mo36994C() throws IOException {
        int i = this.f29354e;
        if (i != 0) {
            this.f29352c = i;
            this.f29354e = 0;
        } else {
            this.f29352c = this.f29351a.mo36433Y();
        }
        int i2 = this.f29352c;
        if (i2 == 0 || i2 == this.f29353d) {
            return Integer.MAX_VALUE;
        }
        return wx4.m69698a(i2);
    }

    /* renamed from: D */
    public void mo36995D(List<String> list) throws IOException {
        mo37014X(list, true);
    }

    /* renamed from: E */
    public void mo36996E(List<Long> list) throws IOException {
        int i;
        int Y;
        int Y2;
        if (list instanceof v92) {
            v92 v92 = (v92) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 0) {
                do {
                    v92.mo46036L1(this.f29351a.mo36436a0());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
                return;
            } else if (b == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    v92.mo46036L1(this.f29351a.mo36436a0());
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f29351a.mo36436a0()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
                return;
            } else if (b2 == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    list.add(Long.valueOf(this.f29351a.mo36436a0()));
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        }
        mo37015Y(i);
    }

    /* renamed from: F */
    public <T> void mo36997F(List<T> list, xr3<T> xr3, zy0 zy0) throws IOException {
        int Y;
        if (wx4.m69699b(this.f29352c) == 2) {
            int i = this.f29352c;
            do {
                list.add(mo37013W(xr3, zy0));
                if (!this.f29351a.mo36449i() && this.f29354e == 0) {
                    Y = this.f29351a.mo36433Y();
                } else {
                    return;
                }
            } while (Y == i);
            this.f29354e = Y;
            return;
        }
        throw nt1.m58785f();
    }

    /* renamed from: G */
    public int mo36998G() throws IOException {
        mo37016Z(0);
        return this.f29351a.mo36416F();
    }

    /* renamed from: H */
    public void mo36999H(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 2) {
                int Z = this.f29351a.mo36434Z();
                mo37018a0(Z);
                int h = this.f29351a.mo36447h() + Z;
                do {
                    as1.mo31124G0(this.f29351a.mo36427S());
                } while (this.f29351a.mo36447h() < h);
            } else if (b == 5) {
                do {
                    as1.mo31124G0(this.f29351a.mo36427S());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 2) {
                int Z2 = this.f29351a.mo36434Z();
                mo37018a0(Z2);
                int h2 = this.f29351a.mo36447h() + Z2;
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36427S()));
                } while (this.f29351a.mo36447h() < h2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36427S()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
            } else {
                throw nt1.m58785f();
            }
        }
    }

    /* renamed from: I */
    public long mo37000I() throws IOException {
        mo37016Z(0);
        return this.f29351a.mo36430V();
    }

    /* renamed from: J */
    public void mo37001J(List<Integer> list) throws IOException {
        int i;
        int Y;
        int Y2;
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 0) {
                do {
                    as1.mo31124G0(this.f29351a.mo36461z());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
                return;
            } else if (b == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    as1.mo31124G0(this.f29351a.mo36461z());
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36461z()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
                return;
            } else if (b2 == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36461z()));
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        }
        mo37015Y(i);
    }

    /* renamed from: K */
    public <T> T mo37002K(xr3<T> xr3, zy0 zy0) throws IOException {
        mo37016Z(3);
        return mo37012V(xr3, zy0);
    }

    /* renamed from: L */
    public <T> void mo37003L(List<T> list, xr3<T> xr3, zy0 zy0) throws IOException {
        int Y;
        if (wx4.m69699b(this.f29352c) == 3) {
            int i = this.f29352c;
            do {
                list.add(mo37012V(xr3, zy0));
                if (!this.f29351a.mo36449i() && this.f29354e == 0) {
                    Y = this.f29351a.mo36433Y();
                } else {
                    return;
                }
            } while (Y == i);
            this.f29354e = Y;
            return;
        }
        throw nt1.m58785f();
    }

    /* renamed from: M */
    public int mo37004M() throws IOException {
        mo37016Z(0);
        return this.f29351a.mo36429U();
    }

    /* renamed from: N */
    public long mo37005N() throws IOException {
        mo37016Z(0);
        return this.f29351a.mo36417G();
    }

    /* renamed from: O */
    public boolean mo37006O() throws IOException {
        mo37016Z(0);
        return this.f29351a.mo36456u();
    }

    /* renamed from: P */
    public C5173er mo37007P() throws IOException {
        mo37016Z(2);
        return this.f29351a.mo36459x();
    }

    /* renamed from: Q */
    public String mo37008Q() throws IOException {
        mo37016Z(2);
        return this.f29351a.mo36432X();
    }

    /* renamed from: R */
    public void mo37009R(List<Long> list) throws IOException {
        int i;
        int Y;
        int Y2;
        if (list instanceof v92) {
            v92 v92 = (v92) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 0) {
                do {
                    v92.mo46036L1(this.f29351a.mo36417G());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
                return;
            } else if (b == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    v92.mo46036L1(this.f29351a.mo36417G());
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f29351a.mo36417G()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
                return;
            } else if (b2 == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    list.add(Long.valueOf(this.f29351a.mo36417G()));
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        }
        mo37015Y(i);
    }

    /* renamed from: S */
    public int mo37010S() throws IOException {
        mo37016Z(5);
        return this.f29351a.mo36427S();
    }

    /* renamed from: U */
    public final Object mo37011U(wx4.C7195b bVar, Class<?> cls, zy0 zy0) throws IOException {
        switch (C5460a.f29355a[bVar.ordinal()]) {
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

    /* renamed from: V */
    public final <T> T mo37012V(xr3<T> xr3, zy0 zy0) throws IOException {
        int i = this.f29353d;
        this.f29353d = wx4.m69700c(wx4.m69698a(this.f29352c), 4);
        try {
            T g = xr3.mo31770g();
            xr3.mo31776j(g, this, zy0);
            xr3.mo31774i(g);
            if (this.f29352c == this.f29353d) {
                return g;
            }
            throw nt1.m58788i();
        } finally {
            this.f29353d = i;
        }
    }

    /* renamed from: W */
    public final <T> T mo37013W(xr3<T> xr3, zy0 zy0) throws IOException {
        int Z = this.f29351a.mo36434Z();
        g00 g00 = this.f29351a;
        if (g00.f28785a < g00.f28788b) {
            int t = g00.mo36455t(Z);
            T g = xr3.mo31770g();
            this.f29351a.f28785a++;
            xr3.mo31776j(g, this, zy0);
            xr3.mo31774i(g);
            this.f29351a.mo36435a(0);
            g00 g002 = this.f29351a;
            g002.f28785a--;
            g002.mo36454s(t);
            return g;
        }
        throw nt1.m58789j();
    }

    /* renamed from: X */
    public void mo37014X(List<String> list, boolean z) throws IOException {
        int Y;
        int Y2;
        if (wx4.m69699b(this.f29352c) != 2) {
            throw nt1.m58785f();
        } else if (!(list instanceof n22) || z) {
            do {
                list.add(z ? mo37008Q() : mo37023e());
                if (!this.f29351a.mo36449i()) {
                    Y = this.f29351a.mo36433Y();
                } else {
                    return;
                }
            } while (Y == this.f29352c);
            this.f29354e = Y;
        } else {
            n22 n22 = (n22) list;
            do {
                n22.mo36157M(mo37007P());
                if (!this.f29351a.mo36449i()) {
                    Y2 = this.f29351a.mo36433Y();
                } else {
                    return;
                }
            } while (Y2 == this.f29352c);
            this.f29354e = Y2;
        }
    }

    /* renamed from: Y */
    public final void mo37015Y(int i) throws IOException {
        if (this.f29351a.mo36447h() != i) {
            throw nt1.m58791n();
        }
    }

    /* renamed from: Z */
    public final void mo37016Z(int i) throws IOException {
        if (wx4.m69699b(this.f29352c) != i) {
            throw nt1.m58785f();
        }
    }

    /* renamed from: a */
    public <T> T mo37017a(Class<T> cls, zy0 zy0) throws IOException {
        mo37016Z(3);
        return mo37012V(p63.m60498a().mo42385i(cls), zy0);
    }

    /* renamed from: a0 */
    public final void mo37018a0(int i) throws IOException {
        if ((i & 3) != 0) {
            throw nt1.m58788i();
        }
    }

    /* renamed from: b */
    public long mo37019b() throws IOException {
        mo37016Z(1);
        return this.f29351a.mo36428T();
    }

    /* renamed from: b0 */
    public final void mo37020b0(int i) throws IOException {
        if ((i & 7) != 0) {
            throw nt1.m58788i();
        }
    }

    /* renamed from: c */
    public long mo37021c() throws IOException {
        mo37016Z(1);
        return this.f29351a.mo36412B();
    }

    /* renamed from: d */
    public boolean mo37022d() {
        return this.f29351a.mo36444f0();
    }

    /* renamed from: e */
    public String mo37023e() throws IOException {
        mo37016Z(2);
        return this.f29351a.mo36431W();
    }

    /* renamed from: f */
    public void mo37024f(List<String> list) throws IOException {
        mo37014X(list, false);
    }

    /* renamed from: g */
    public void mo37025g(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof v92) {
            v92 v92 = (v92) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 1) {
                do {
                    v92.mo46036L1(this.f29351a.mo36412B());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
            } else if (b == 2) {
                int Z = this.f29351a.mo36434Z();
                mo37020b0(Z);
                int h = this.f29351a.mo36447h() + Z;
                do {
                    v92.mo46036L1(this.f29351a.mo36412B());
                } while (this.f29351a.mo36447h() < h);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f29351a.mo36412B()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
            } else if (b2 == 2) {
                int Z2 = this.f29351a.mo36434Z();
                mo37020b0(Z2);
                int h2 = this.f29351a.mo36447h() + Z2;
                do {
                    list.add(Long.valueOf(this.f29351a.mo36412B()));
                } while (this.f29351a.mo36447h() < h2);
            } else {
                throw nt1.m58785f();
            }
        }
    }

    /* renamed from: h */
    public void mo37026h(List<Float> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof w71) {
            w71 w71 = (w71) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 2) {
                int Z = this.f29351a.mo36434Z();
                mo37018a0(Z);
                int h = this.f29351a.mo36447h() + Z;
                do {
                    w71.mo46323b2(this.f29351a.mo36413C());
                } while (this.f29351a.mo36447h() < h);
            } else if (b == 5) {
                do {
                    w71.mo46323b2(this.f29351a.mo36413C());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 2) {
                int Z2 = this.f29351a.mo36434Z();
                mo37018a0(Z2);
                int h2 = this.f29351a.mo36447h() + Z2;
                do {
                    list.add(Float.valueOf(this.f29351a.mo36413C()));
                } while (this.f29351a.mo36447h() < h2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f29351a.mo36413C()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
            } else {
                throw nt1.m58785f();
            }
        }
    }

    /* renamed from: i */
    public boolean mo37027i() throws IOException {
        int i;
        if (this.f29351a.mo36449i() || (i = this.f29352c) == this.f29353d) {
            return false;
        }
        return this.f29351a.mo36446g0(i);
    }

    /* renamed from: j */
    public <T> T mo37028j(Class<T> cls, zy0 zy0) throws IOException {
        mo37016Z(2);
        return mo37013W(p63.m60498a().mo42385i(cls), zy0);
    }

    /* renamed from: k */
    public void mo37029k(List<Boolean> list) throws IOException {
        int i;
        int Y;
        int Y2;
        if (list instanceof C6126mn) {
            C6126mn mnVar = (C6126mn) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 0) {
                do {
                    mnVar.mo40703S0(this.f29351a.mo36456u());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
                return;
            } else if (b == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    mnVar.mo40703S0(this.f29351a.mo36456u());
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f29351a.mo36456u()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
                return;
            } else if (b2 == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    list.add(Boolean.valueOf(this.f29351a.mo36456u()));
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        }
        mo37015Y(i);
    }

    /* renamed from: l */
    public void mo37030l(List<Integer> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 2) {
                int Z = this.f29351a.mo36434Z();
                mo37018a0(Z);
                int h = this.f29351a.mo36447h() + Z;
                do {
                    as1.mo31124G0(this.f29351a.mo36411A());
                } while (this.f29351a.mo36447h() < h);
            } else if (b == 5) {
                do {
                    as1.mo31124G0(this.f29351a.mo36411A());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 2) {
                int Z2 = this.f29351a.mo36434Z();
                mo37018a0(Z2);
                int h2 = this.f29351a.mo36447h() + Z2;
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36411A()));
                } while (this.f29351a.mo36447h() < h2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36411A()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
            } else {
                throw nt1.m58785f();
            }
        }
    }

    /* renamed from: m */
    public int mo37031m() throws IOException {
        mo37016Z(5);
        return this.f29351a.mo36411A();
    }

    /* renamed from: n */
    public int mo37032n() throws IOException {
        mo37016Z(0);
        return this.f29351a.mo36434Z();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo37027i() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.onedelhi.secure.nt1("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo37033o(java.util.Map<K, V> r8, com.onedelhi.secure.oc2.C6267b<K, V> r9, com.onedelhi.secure.zy0 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.mo37016Z(r0)
            com.onedelhi.secure.g00 r1 = r7.f29351a
            int r1 = r1.mo36434Z()
            com.onedelhi.secure.g00 r2 = r7.f29351a
            int r1 = r2.mo36455t(r1)
            K r2 = r9.f32991a
            V r3 = r9.f32993b
        L_0x0014:
            int r4 = r7.mo36994C()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.onedelhi.secure.g00 r5 = r7.f29351a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo36449i()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo37027i()     // Catch:{ a -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.onedelhi.secure.nt1 r4 = new com.onedelhi.secure.nt1     // Catch:{ a -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x004f }
            throw r4     // Catch:{ a -> 0x004f }
        L_0x003a:
            com.onedelhi.secure.wx4$b r4 = r9.f32992b     // Catch:{ a -> 0x004f }
            V r5 = r9.f32993b     // Catch:{ a -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004f }
            java.lang.Object r3 = r7.mo37011U(r4, r5, r10)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.onedelhi.secure.wx4$b r4 = r9.f32990a     // Catch:{ a -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.mo37011U(r4, r5, r5)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo37027i()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.onedelhi.secure.nt1 r8 = new com.onedelhi.secure.nt1     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.onedelhi.secure.g00 r8 = r7.f29351a
            r8.mo36454s(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.onedelhi.secure.g00 r9 = r7.f29351a
            r9.mo36454s(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h00.mo37033o(java.util.Map, com.onedelhi.secure.oc2$b, com.onedelhi.secure.zy0):void");
    }

    /* renamed from: p */
    public <T> T mo37034p(xr3<T> xr3, zy0 zy0) throws IOException {
        mo37016Z(2);
        return mo37013W(xr3, zy0);
    }

    /* renamed from: q */
    public long mo37035q() throws IOException {
        mo37016Z(0);
        return this.f29351a.mo36436a0();
    }

    /* renamed from: r */
    public <T> void mo37036r(List<T> list, Class<T> cls, zy0 zy0) throws IOException {
        mo36997F(list, p63.m60498a().mo42385i(cls), zy0);
    }

    public double readDouble() throws IOException {
        mo37016Z(1);
        return this.f29351a.mo36460y();
    }

    public float readFloat() throws IOException {
        mo37016Z(5);
        return this.f29351a.mo36413C();
    }

    /* renamed from: s */
    public <T> void mo37039s(List<T> list, Class<T> cls, zy0 zy0) throws IOException {
        mo37003L(list, p63.m60498a().mo42385i(cls), zy0);
    }

    /* renamed from: t */
    public void mo37040t(List<Integer> list) throws IOException {
        int i;
        int Y;
        int Y2;
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 0) {
                do {
                    as1.mo31124G0(this.f29351a.mo36429U());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
                return;
            } else if (b == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    as1.mo31124G0(this.f29351a.mo36429U());
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36429U()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
                return;
            } else if (b2 == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36429U()));
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        }
        mo37015Y(i);
    }

    /* renamed from: u */
    public void mo37041u(List<Long> list) throws IOException {
        int i;
        int Y;
        int Y2;
        if (list instanceof v92) {
            v92 v92 = (v92) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 0) {
                do {
                    v92.mo46036L1(this.f29351a.mo36430V());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
                return;
            } else if (b == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    v92.mo46036L1(this.f29351a.mo36430V());
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f29351a.mo36430V()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
                return;
            } else if (b2 == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    list.add(Long.valueOf(this.f29351a.mo36430V()));
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        }
        mo37015Y(i);
    }

    /* renamed from: v */
    public void mo37042v(List<C5173er> list) throws IOException {
        int Y;
        if (wx4.m69699b(this.f29352c) == 2) {
            do {
                list.add(mo37007P());
                if (!this.f29351a.mo36449i()) {
                    Y = this.f29351a.mo36433Y();
                } else {
                    return;
                }
            } while (Y == this.f29352c);
            this.f29354e = Y;
            return;
        }
        throw nt1.m58785f();
    }

    /* renamed from: w */
    public void mo37043w(List<Double> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof do0) {
            do0 do0 = (do0) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 1) {
                do {
                    do0.mo34579V0(this.f29351a.mo36460y());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
            } else if (b == 2) {
                int Z = this.f29351a.mo36434Z();
                mo37020b0(Z);
                int h = this.f29351a.mo36447h() + Z;
                do {
                    do0.mo34579V0(this.f29351a.mo36460y());
                } while (this.f29351a.mo36447h() < h);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f29351a.mo36460y()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
            } else if (b2 == 2) {
                int Z2 = this.f29351a.mo36434Z();
                mo37020b0(Z2);
                int h2 = this.f29351a.mo36447h() + Z2;
                do {
                    list.add(Double.valueOf(this.f29351a.mo36460y()));
                } while (this.f29351a.mo36447h() < h2);
            } else {
                throw nt1.m58785f();
            }
        }
    }

    /* renamed from: x */
    public void mo37044x(List<Integer> list) throws IOException {
        int i;
        int Y;
        int Y2;
        if (list instanceof as1) {
            as1 as1 = (as1) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 0) {
                do {
                    as1.mo31124G0(this.f29351a.mo36434Z());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
                return;
            } else if (b == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    as1.mo31124G0(this.f29351a.mo36434Z());
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36434Z()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
                return;
            } else if (b2 == 2) {
                i = this.f29351a.mo36447h() + this.f29351a.mo36434Z();
                do {
                    list.add(Integer.valueOf(this.f29351a.mo36434Z()));
                } while (this.f29351a.mo36447h() < i);
            } else {
                throw nt1.m58785f();
            }
        }
        mo37015Y(i);
    }

    /* renamed from: y */
    public int mo37045y() {
        return this.f29352c;
    }

    /* renamed from: z */
    public void mo37046z(List<Long> list) throws IOException {
        int Y;
        int Y2;
        if (list instanceof v92) {
            v92 v92 = (v92) list;
            int b = wx4.m69699b(this.f29352c);
            if (b == 1) {
                do {
                    v92.mo46036L1(this.f29351a.mo36428T());
                    if (!this.f29351a.mo36449i()) {
                        Y2 = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y2 == this.f29352c);
                this.f29354e = Y2;
            } else if (b == 2) {
                int Z = this.f29351a.mo36434Z();
                mo37020b0(Z);
                int h = this.f29351a.mo36447h() + Z;
                do {
                    v92.mo46036L1(this.f29351a.mo36428T());
                } while (this.f29351a.mo36447h() < h);
            } else {
                throw nt1.m58785f();
            }
        } else {
            int b2 = wx4.m69699b(this.f29352c);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f29351a.mo36428T()));
                    if (!this.f29351a.mo36449i()) {
                        Y = this.f29351a.mo36433Y();
                    } else {
                        return;
                    }
                } while (Y == this.f29352c);
                this.f29354e = Y;
            } else if (b2 == 2) {
                int Z2 = this.f29351a.mo36434Z();
                mo37020b0(Z2);
                int h2 = this.f29351a.mo36447h() + Z2;
                do {
                    list.add(Long.valueOf(this.f29351a.mo36428T()));
                } while (this.f29351a.mo36447h() < h2);
            } else {
                throw nt1.m58785f();
            }
        }
    }
}
