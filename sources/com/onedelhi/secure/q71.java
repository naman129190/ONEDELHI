package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class q71 {

    /* renamed from: A */
    public static final int f18877A = 26;

    /* renamed from: B */
    public static final int f18878B = 36;

    /* renamed from: a */
    public static final int f18879a = 0;

    /* renamed from: a */
    public static final qf3 f18880a = new C3384ra(new byte[]{0}, 1);

    /* renamed from: a */
    public static final /* synthetic */ boolean f18881a = false;

    /* renamed from: b */
    public static final int f18882b = 1;

    /* renamed from: c */
    public static final int f18883c = 2;

    /* renamed from: d */
    public static final int f18884d = 3;

    /* renamed from: e */
    public static final int f18885e = 4;

    /* renamed from: f */
    public static final int f18886f = 5;

    /* renamed from: g */
    public static final int f18887g = 6;

    /* renamed from: h */
    public static final int f18888h = 7;

    /* renamed from: i */
    public static final int f18889i = 8;

    /* renamed from: j */
    public static final int f18890j = 9;

    /* renamed from: k */
    public static final int f18891k = 10;

    /* renamed from: l */
    public static final int f18892l = 11;

    /* renamed from: m */
    public static final int f18893m = 12;

    /* renamed from: n */
    public static final int f18894n = 13;

    /* renamed from: o */
    public static final int f18895o = 14;

    /* renamed from: p */
    public static final int f18896p = 15;

    /* renamed from: q */
    public static final int f18897q = 16;

    /* renamed from: r */
    public static final int f18898r = 17;

    /* renamed from: s */
    public static final int f18899s = 18;

    /* renamed from: t */
    public static final int f18900t = 19;

    /* renamed from: u */
    public static final int f18901u = 20;

    /* renamed from: v */
    public static final int f18902v = 21;

    /* renamed from: w */
    public static final int f18903w = 22;

    /* renamed from: x */
    public static final int f18904x = 23;

    /* renamed from: y */
    public static final int f18905y = 24;

    /* renamed from: z */
    public static final int f18906z = 25;

    /* renamed from: com.onedelhi.secure.q71$a */
    public static class C3231a extends C3238h {

        /* renamed from: a */
        public static final C3231a f18907a = new C3231a(q71.f18880a, 1, 1);

        /* renamed from: a */
        public static final /* synthetic */ boolean f18908a = false;

        public C3231a(qf3 qf3, int i, int i2) {
            super(qf3, i, i2);
        }

        /* renamed from: d */
        public static C3231a m25360d() {
            return f18907a;
        }

        /* renamed from: a */
        public StringBuilder mo22861a(StringBuilder sb) {
            sb.append(tk4.f35693a);
            sb.append(this.f18913a.mo23151c(this.f18912a, mo22862b()));
            sb.append(tk4.f35693a);
            return sb;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo22862b() {
            return super.mo22862b();
        }

        /* renamed from: c */
        public ByteBuffer mo22863c() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f18913a.mo23159u());
            wrap.position(this.f18912a);
            wrap.limit(this.f18912a + mo22862b());
            return wrap.asReadOnlyBuffer().slice();
        }

        /* renamed from: e */
        public byte mo22864e(int i) {
            return this.f18913a.mo23158h(this.f18912a + i);
        }

        /* renamed from: f */
        public byte[] mo22865f() {
            int b = mo22862b();
            byte[] bArr = new byte[b];
            for (int i = 0; i < b; i++) {
                bArr[i] = this.f18913a.mo23158h(this.f18912a + i);
            }
            return bArr;
        }

        public String toString() {
            return this.f18913a.mo23151c(this.f18912a, mo22862b());
        }
    }

    /* renamed from: com.onedelhi.secure.q71$b */
    public static class C3232b extends RuntimeException {
        public C3232b(String str) {
            super(str);
        }
    }

    /* renamed from: com.onedelhi.secure.q71$c */
    public static class C3233c extends C3236f {

        /* renamed from: a */
        public static final C3233c f18909a = new C3233c(q71.f18880a, 0, 0);

        public C3233c(qf3 qf3, int i, int i2) {
            super(qf3, i, i2);
        }

        /* renamed from: d */
        public static C3233c m25367d() {
            return f18909a;
        }

        /* renamed from: a */
        public StringBuilder mo22861a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        /* renamed from: c */
        public int mo22867c(byte[] bArr) {
            byte h;
            byte b;
            int i = this.f18912a;
            int i2 = 0;
            do {
                h = this.f18913a.mo23158h(i);
                b = bArr[i2];
                if (h == 0) {
                    return h - b;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return h - b;
                }
            } while (h == b);
            return h - b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3233c)) {
                return false;
            }
            C3233c cVar = (C3233c) obj;
            return cVar.f18912a == this.f18912a && cVar.f18914b == this.f18914b;
        }

        public int hashCode() {
            return this.f18912a ^ this.f18914b;
        }

        public String toString() {
            int i = this.f18912a;
            while (this.f18913a.mo23158h(i) != 0) {
                i++;
            }
            int i2 = this.f18912a;
            return this.f18913a.mo23151c(i2, i - i2);
        }
    }

    /* renamed from: com.onedelhi.secure.q71$d */
    public static class C3234d {

        /* renamed from: a */
        public final C3239i f18910a;

        public C3234d(C3239i iVar) {
            this.f18910a = iVar;
        }

        /* renamed from: a */
        public C3233c mo22870a(int i) {
            if (i >= mo22871b()) {
                return C3233c.f18909a;
            }
            C3239i iVar = this.f18910a;
            C3239i iVar2 = this.f18910a;
            qf3 qf3 = iVar2.f18913a;
            return new C3233c(qf3, q71.m25350i(qf3, iVar.f18912a + (i * iVar.f18914b), iVar2.f18914b), 1);
        }

        /* renamed from: b */
        public int mo22871b() {
            return this.f18910a.mo22862b();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < this.f18910a.mo22862b(); i++) {
                this.f18910a.mo22904d(i).mo22903z(sb);
                if (i != this.f18910a.mo22862b() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.onedelhi.secure.q71$e */
    public static class C3235e extends C3241k {

        /* renamed from: a */
        public static final C3235e f18911a = new C3235e(q71.f18880a, 1, 1);

        public C3235e(qf3 qf3, int i, int i2) {
            super(qf3, i, i2);
        }

        /* renamed from: g */
        public static C3235e m25372g() {
            return f18911a;
        }

        /* renamed from: a */
        public StringBuilder mo22861a(StringBuilder sb) {
            sb.append("{ ");
            C3234d j = mo22876j();
            int b = mo22862b();
            C3241k k = mo22877k();
            for (int i = 0; i < b; i++) {
                sb.append(tk4.f35693a);
                sb.append(j.mo22870a(i).toString());
                sb.append("\" : ");
                sb.append(k.mo22904d(i).toString());
                if (i != b - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        /* renamed from: f */
        public final int mo22873f(C3234d dVar, byte[] bArr) {
            int b = dVar.mo22871b() - 1;
            int i = 0;
            while (i <= b) {
                int i2 = (i + b) >>> 1;
                int c = dVar.mo22870a(i2).mo22867c(bArr);
                if (c < 0) {
                    i = i2 + 1;
                } else if (c <= 0) {
                    return i2;
                } else {
                    b = i2 - 1;
                }
            }
            return -(i + 1);
        }

        /* renamed from: h */
        public C3237g mo22874h(String str) {
            return mo22875i(str.getBytes(StandardCharsets.UTF_8));
        }

        /* renamed from: i */
        public C3237g mo22875i(byte[] bArr) {
            C3234d j = mo22876j();
            int b = j.mo22871b();
            int f = mo22873f(j, bArr);
            return (f < 0 || f >= b) ? C3237g.f18915a : mo22904d(f);
        }

        /* renamed from: j */
        public C3234d mo22876j() {
            int i = this.f18912a - (this.f18914b * 3);
            qf3 qf3 = this.f18913a;
            int c = q71.m25350i(qf3, i, this.f18914b);
            qf3 qf32 = this.f18913a;
            int i2 = this.f18914b;
            return new C3234d(new C3239i(qf3, c, q71.m25355n(qf32, i + i2, i2), 4));
        }

        /* renamed from: k */
        public C3241k mo22877k() {
            return new C3241k(this.f18913a, this.f18912a, this.f18914b);
        }
    }

    /* renamed from: com.onedelhi.secure.q71$f */
    public static abstract class C3236f {

        /* renamed from: a */
        public int f18912a;

        /* renamed from: a */
        public qf3 f18913a;

        /* renamed from: b */
        public int f18914b;

        public C3236f(qf3 qf3, int i, int i2) {
            this.f18913a = qf3;
            this.f18912a = i;
            this.f18914b = i2;
        }

        /* renamed from: a */
        public abstract StringBuilder mo22861a(StringBuilder sb);

        public String toString() {
            return mo22861a(new StringBuilder(128)).toString();
        }
    }

    /* renamed from: com.onedelhi.secure.q71$g */
    public static class C3237g {

        /* renamed from: a */
        public static final C3237g f18915a = new C3237g(q71.f18880a, 0, 1, 0);

        /* renamed from: a */
        public int f18916a;

        /* renamed from: a */
        public qf3 f18917a;

        /* renamed from: b */
        public int f18918b;

        /* renamed from: c */
        public int f18919c;

        /* renamed from: d */
        public int f18920d;

        public C3237g(qf3 qf3, int i, int i2, int i3) {
            this(qf3, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public C3237g(qf3 qf3, int i, int i2, int i3, int i4) {
            this.f18917a = qf3;
            this.f18916a = i;
            this.f18918b = i2;
            this.f18919c = i3;
            this.f18920d = i4;
        }

        /* renamed from: b */
        public C3231a mo22878b() {
            if (!mo22889m() && !mo22899v()) {
                return C3231a.m25360d();
            }
            qf3 qf3 = this.f18917a;
            return new C3231a(qf3, q71.m25350i(qf3, this.f18916a, this.f18918b), this.f18919c);
        }

        /* renamed from: c */
        public boolean mo22879c() {
            return mo22890n() ? this.f18917a.mo23158h(this.f18916a) != 0 : mo22886j() != 0;
        }

        /* renamed from: d */
        public double mo22880d() {
            int i = this.f18920d;
            if (i == 3) {
                return q71.m25354m(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i == 1) {
                return (double) q71.m25355n(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i != 2) {
                if (i == 5) {
                    return Double.parseDouble(mo22885i());
                }
                if (i == 6) {
                    qf3 qf3 = this.f18917a;
                    return (double) q71.m25355n(qf3, q71.m25350i(qf3, this.f18916a, this.f18918b), this.f18919c);
                } else if (i == 7) {
                    qf3 qf32 = this.f18917a;
                    return (double) q71.m25357p(qf32, q71.m25350i(qf32, this.f18916a, this.f18918b), this.f18919c);
                } else if (i == 8) {
                    qf3 qf33 = this.f18917a;
                    return q71.m25354m(qf33, q71.m25350i(qf33, this.f18916a, this.f18918b), this.f18919c);
                } else if (i == 10) {
                    return (double) mo22887k().mo22862b();
                } else {
                    if (i != 26) {
                        return 0.0d;
                    }
                }
            }
            return (double) q71.m25357p(this.f18917a, this.f18916a, this.f18918b);
        }

        /* renamed from: e */
        public int mo22881e() {
            qf3 qf3;
            int i;
            int i2 = this.f18920d;
            if (i2 == 1) {
                return q71.m25355n(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i2 == 2) {
                qf3 = this.f18917a;
                i = this.f18916a;
            } else if (i2 == 3) {
                return (int) q71.m25354m(this.f18917a, this.f18916a, this.f18918b);
            } else {
                if (i2 == 5) {
                    return Integer.parseInt(mo22885i());
                }
                if (i2 == 6) {
                    qf3 qf32 = this.f18917a;
                    return q71.m25355n(qf32, q71.m25350i(qf32, this.f18916a, this.f18918b), this.f18919c);
                } else if (i2 == 7) {
                    qf3 = this.f18917a;
                    i = q71.m25350i(qf3, this.f18916a, this.f18918b);
                } else if (i2 == 8) {
                    qf3 qf33 = this.f18917a;
                    return (int) q71.m25354m(qf33, q71.m25350i(qf33, this.f18916a, this.f18918b), this.f18919c);
                } else if (i2 == 10) {
                    return mo22887k().mo22862b();
                } else {
                    if (i2 != 26) {
                        return 0;
                    }
                    return q71.m25355n(this.f18917a, this.f18916a, this.f18918b);
                }
            }
            return (int) q71.m25357p(qf3, i, this.f18918b);
        }

        /* renamed from: f */
        public C3233c mo22882f() {
            if (!mo22894r()) {
                return C3233c.m25367d();
            }
            qf3 qf3 = this.f18917a;
            return new C3233c(qf3, q71.m25350i(qf3, this.f18916a, this.f18918b), this.f18919c);
        }

        /* renamed from: g */
        public long mo22883g() {
            int i = this.f18920d;
            if (i == 1) {
                return q71.m25356o(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i == 2) {
                return q71.m25357p(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i == 3) {
                return (long) q71.m25354m(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(mo22885i());
                } catch (NumberFormatException unused) {
                    return 0;
                }
            } else if (i == 6) {
                qf3 qf3 = this.f18917a;
                return q71.m25356o(qf3, q71.m25350i(qf3, this.f18916a, this.f18918b), this.f18919c);
            } else if (i == 7) {
                qf3 qf32 = this.f18917a;
                return q71.m25357p(qf32, q71.m25350i(qf32, this.f18916a, this.f18918b), this.f18918b);
            } else if (i == 8) {
                qf3 qf33 = this.f18917a;
                return (long) q71.m25354m(qf33, q71.m25350i(qf33, this.f18916a, this.f18918b), this.f18919c);
            } else if (i == 10) {
                return (long) mo22887k().mo22862b();
            } else {
                if (i != 26) {
                    return 0;
                }
                return (long) q71.m25355n(this.f18917a, this.f18916a, this.f18918b);
            }
        }

        /* renamed from: h */
        public C3235e mo22884h() {
            if (!mo22895s()) {
                return C3235e.m25372g();
            }
            qf3 qf3 = this.f18917a;
            return new C3235e(qf3, q71.m25350i(qf3, this.f18916a, this.f18918b), this.f18919c);
        }

        /* renamed from: i */
        public String mo22885i() {
            if (mo22899v()) {
                int c = q71.m25350i(this.f18917a, this.f18916a, this.f18918b);
                qf3 qf3 = this.f18917a;
                int i = this.f18919c;
                return this.f18917a.mo23151c(c, (int) q71.m25357p(qf3, c - i, i));
            } else if (!mo22894r()) {
                return "";
            } else {
                int c2 = q71.m25350i(this.f18917a, this.f18916a, this.f18919c);
                int i2 = c2;
                while (this.f18917a.mo23158h(i2) != 0) {
                    i2++;
                }
                return this.f18917a.mo23151c(c2, i2 - c2);
            }
        }

        /* renamed from: j */
        public long mo22886j() {
            int i = this.f18920d;
            if (i == 2) {
                return q71.m25357p(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i == 1) {
                return q71.m25356o(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i == 3) {
                return (long) q71.m25354m(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i == 10) {
                return (long) mo22887k().mo22862b();
            }
            if (i == 26) {
                return (long) q71.m25355n(this.f18917a, this.f18916a, this.f18918b);
            }
            if (i == 5) {
                return Long.parseLong(mo22885i());
            }
            if (i == 6) {
                qf3 qf3 = this.f18917a;
                return q71.m25356o(qf3, q71.m25350i(qf3, this.f18916a, this.f18918b), this.f18919c);
            } else if (i == 7) {
                qf3 qf32 = this.f18917a;
                return q71.m25357p(qf32, q71.m25350i(qf32, this.f18916a, this.f18918b), this.f18919c);
            } else if (i != 8) {
                return 0;
            } else {
                qf3 qf33 = this.f18917a;
                return (long) q71.m25354m(qf33, q71.m25350i(qf33, this.f18916a, this.f18918b), this.f18918b);
            }
        }

        /* renamed from: k */
        public C3241k mo22887k() {
            if (mo22902y()) {
                qf3 qf3 = this.f18917a;
                return new C3241k(qf3, q71.m25350i(qf3, this.f18916a, this.f18918b), this.f18919c);
            }
            int i = this.f18920d;
            if (i == 15) {
                qf3 qf32 = this.f18917a;
                return new C3239i(qf32, q71.m25350i(qf32, this.f18916a, this.f18918b), this.f18919c, 4);
            } else if (!q71.m25352k(i)) {
                return C3241k.m25414c();
            } else {
                qf3 qf33 = this.f18917a;
                return new C3239i(qf33, q71.m25350i(qf33, this.f18916a, this.f18918b), this.f18919c, q71.m25359r(this.f18920d));
            }
        }

        /* renamed from: l */
        public int mo22888l() {
            return this.f18920d;
        }

        /* renamed from: m */
        public boolean mo22889m() {
            return this.f18920d == 25;
        }

        /* renamed from: n */
        public boolean mo22890n() {
            return this.f18920d == 26;
        }

        /* renamed from: o */
        public boolean mo22891o() {
            int i = this.f18920d;
            return i == 3 || i == 8;
        }

        /* renamed from: p */
        public boolean mo22892p() {
            int i = this.f18920d;
            return i == 1 || i == 6;
        }

        /* renamed from: q */
        public boolean mo22893q() {
            return mo22892p() || mo22901x();
        }

        /* renamed from: r */
        public boolean mo22894r() {
            return this.f18920d == 4;
        }

        /* renamed from: s */
        public boolean mo22895s() {
            return this.f18920d == 9;
        }

        /* renamed from: t */
        public boolean mo22896t() {
            return this.f18920d == 0;
        }

        public String toString() {
            return mo22903z(new StringBuilder(128)).toString();
        }

        /* renamed from: u */
        public boolean mo22898u() {
            return mo22893q() || mo22891o();
        }

        /* renamed from: v */
        public boolean mo22899v() {
            return this.f18920d == 5;
        }

        /* renamed from: w */
        public boolean mo22900w() {
            return q71.m25352k(this.f18920d);
        }

        /* renamed from: x */
        public boolean mo22901x() {
            int i = this.f18920d;
            return i == 2 || i == 7;
        }

        /* renamed from: y */
        public boolean mo22902y() {
            int i = this.f18920d;
            return i == 10 || i == 9;
        }

        /* renamed from: z */
        public StringBuilder mo22903z(StringBuilder sb) {
            int i = this.f18920d;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(mo22883g());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(mo22886j());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(mo22880d());
                        return sb;
                    case 4:
                        C3233c f = mo22882f();
                        sb.append(tk4.f35693a);
                        StringBuilder a = f.mo22861a(sb);
                        a.append(tk4.f35693a);
                        return a;
                    case 5:
                        sb.append(tk4.f35693a);
                        sb.append(mo22885i());
                        sb.append(tk4.f35693a);
                        return sb;
                    case 9:
                        return mo22884h().mo22861a(sb);
                    case 10:
                        return mo22887k().mo22861a(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new C3232b("not_implemented:" + this.f18920d);
                    case 25:
                        return mo22878b().mo22861a(sb);
                    case 26:
                        sb.append(mo22879c());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(mo22887k());
            return sb;
        }
    }

    /* renamed from: com.onedelhi.secure.q71$h */
    public static abstract class C3238h extends C3236f {

        /* renamed from: c */
        public final int f18921c;

        public C3238h(qf3 qf3, int i, int i2) {
            super(qf3, i, i2);
            this.f18921c = q71.m25355n(this.f18913a, i - i2, i2);
        }

        /* renamed from: b */
        public int mo22862b() {
            return this.f18921c;
        }
    }

    /* renamed from: com.onedelhi.secure.q71$i */
    public static class C3239i extends C3241k {

        /* renamed from: a */
        public static final C3239i f18922a = new C3239i(q71.f18880a, 1, 1, 1);

        /* renamed from: d */
        public final int f18923d;

        public C3239i(qf3 qf3, int i, int i2, int i3) {
            super(qf3, i, i2);
            this.f18923d = i3;
        }

        /* renamed from: f */
        public static C3239i m25407f() {
            return f18922a;
        }

        /* renamed from: d */
        public C3237g mo22904d(int i) {
            if (i >= mo22862b()) {
                return C3237g.f18915a;
            }
            return new C3237g(this.f18913a, this.f18912a + (i * this.f18914b), this.f18914b, 1, this.f18923d);
        }

        /* renamed from: g */
        public int mo22905g() {
            return this.f18923d;
        }

        /* renamed from: h */
        public boolean mo22906h() {
            return this == f18922a;
        }
    }

    /* renamed from: com.onedelhi.secure.q71$j */
    public static class C3240j {
        /* renamed from: a */
        public static int m25411a(byte b) {
            return b & 255;
        }

        /* renamed from: b */
        public static long m25412b(int i) {
            return ((long) i) & ZipConstants.ZIP64_MAGIC;
        }

        /* renamed from: c */
        public static int m25413c(short s) {
            return s & xm4.f37547c;
        }
    }

    /* renamed from: com.onedelhi.secure.q71$k */
    public static class C3241k extends C3238h {

        /* renamed from: a */
        public static final C3241k f18924a = new C3241k(q71.f18880a, 1, 1);

        public C3241k(qf3 qf3, int i, int i2) {
            super(qf3, i, i2);
        }

        /* renamed from: c */
        public static C3241k m25414c() {
            return f18924a;
        }

        /* renamed from: a */
        public StringBuilder mo22861a(StringBuilder sb) {
            sb.append("[ ");
            int b = mo22862b();
            for (int i = 0; i < b; i++) {
                mo22904d(i).mo22903z(sb);
                if (i != b - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo22862b() {
            return super.mo22862b();
        }

        /* renamed from: d */
        public C3237g mo22904d(int i) {
            long b = (long) mo22862b();
            long j = (long) i;
            if (j >= b) {
                return C3237g.f18915a;
            }
            int a = C3240j.m25411a(this.f18913a.mo23158h((int) (((long) this.f18912a) + (b * ((long) this.f18914b)) + j)));
            return new C3237g(this.f18913a, this.f18912a + (i * this.f18914b), this.f18914b, a);
        }

        /* renamed from: e */
        public boolean mo22907e() {
            return this == f18924a;
        }

        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    /* renamed from: g */
    public static C3237g m25348g(qf3 qf3) {
        int a = qf3.mo23150a() - 1;
        byte h = qf3.mo23158h(a);
        int i = a - 1;
        return new C3237g(qf3, i - h, h, C3240j.m25411a(qf3.mo23158h(i)));
    }

    @Deprecated
    /* renamed from: h */
    public static C3237g m25349h(ByteBuffer byteBuffer) {
        return m25348g(byteBuffer.hasArray() ? new C3384ra(byteBuffer.array(), byteBuffer.limit()) : new C3533sq(byteBuffer));
    }

    /* renamed from: i */
    public static int m25350i(qf3 qf3, int i, int i2) {
        return (int) (((long) i) - m25357p(qf3, i, i2));
    }

    /* renamed from: j */
    public static boolean m25351j(int i) {
        return i <= 3 || i == 26;
    }

    /* renamed from: k */
    public static boolean m25352k(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    /* renamed from: l */
    public static boolean m25353l(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    /* renamed from: m */
    public static double m25354m(qf3 qf3, int i, int i2) {
        if (i2 == 4) {
            return (double) qf3.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return qf3.getDouble(i);
    }

    /* renamed from: n */
    public static int m25355n(qf3 qf3, int i, int i2) {
        return (int) m25356o(qf3, i, i2);
    }

    /* renamed from: o */
    public static long m25356o(qf3 qf3, int i, int i2) {
        int h;
        if (i2 == 1) {
            h = qf3.mo23158h(i);
        } else if (i2 == 2) {
            h = qf3.getShort(i);
        } else if (i2 == 4) {
            h = qf3.getInt(i);
        } else if (i2 != 8) {
            return -1;
        } else {
            return qf3.getLong(i);
        }
        return (long) h;
    }

    /* renamed from: p */
    public static long m25357p(qf3 qf3, int i, int i2) {
        if (i2 == 1) {
            return (long) C3240j.m25411a(qf3.mo23158h(i));
        }
        if (i2 == 2) {
            return (long) C3240j.m25413c(qf3.getShort(i));
        }
        if (i2 == 4) {
            return C3240j.m25412b(qf3.getInt(i));
        }
        if (i2 != 8) {
            return -1;
        }
        return qf3.getLong(i);
    }

    /* renamed from: q */
    public static int m25358q(int i, int i2) {
        if (i2 == 0) {
            return (i - 1) + 11;
        }
        if (i2 == 2) {
            return (i - 1) + 16;
        }
        if (i2 == 3) {
            return (i - 1) + 19;
        }
        if (i2 != 4) {
            return 0;
        }
        return (i - 1) + 22;
    }

    /* renamed from: r */
    public static int m25359r(int i) {
        return (i - 11) + 1;
    }
}
