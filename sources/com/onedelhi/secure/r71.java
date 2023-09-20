package com.onedelhi.secure;

import com.onedelhi.secure.q71;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class r71 {

    /* renamed from: b */
    public static final int f19625b = 0;

    /* renamed from: b */
    public static final /* synthetic */ boolean f19626b = false;

    /* renamed from: c */
    public static final int f19627c = 1;

    /* renamed from: d */
    public static final int f19628d = 2;

    /* renamed from: e */
    public static final int f19629e = 3;

    /* renamed from: f */
    public static final int f19630f = 4;

    /* renamed from: g */
    public static final int f19631g = 7;

    /* renamed from: h */
    public static final int f19632h = 0;

    /* renamed from: i */
    public static final int f19633i = 1;

    /* renamed from: j */
    public static final int f19634j = 2;

    /* renamed from: k */
    public static final int f19635k = 3;

    /* renamed from: a */
    public final int f19636a;

    /* renamed from: a */
    public final sf3 f19637a;

    /* renamed from: a */
    public final ArrayList<C3378b> f19638a;

    /* renamed from: a */
    public Comparator<C3378b> f19639a;

    /* renamed from: a */
    public final HashMap<String, Integer> f19640a;

    /* renamed from: a */
    public boolean f19641a;

    /* renamed from: b */
    public final HashMap<String, Integer> f19642b;

    /* renamed from: com.onedelhi.secure.r71$a */
    public class C3377a implements Comparator<C3378b> {
        public C3377a() {
        }

        /* renamed from: a */
        public int compare(C3378b bVar, C3378b bVar2) {
            byte h;
            byte h2;
            int i = bVar.f19649c;
            int i2 = bVar2.f19649c;
            do {
                h = r71.this.f19637a.mo23158h(i);
                h2 = r71.this.f19637a.mo23158h(i2);
                if (h == 0) {
                    return h - h2;
                }
                i++;
                i2++;
            } while (h == h2);
            return h - h2;
        }
    }

    /* renamed from: com.onedelhi.secure.r71$b */
    public static class C3378b {

        /* renamed from: a */
        public static final /* synthetic */ boolean f19644a = false;

        /* renamed from: a */
        public final double f19645a;

        /* renamed from: a */
        public final int f19646a;

        /* renamed from: a */
        public long f19647a;

        /* renamed from: b */
        public final int f19648b;

        /* renamed from: c */
        public int f19649c;

        public C3378b(int i, int i2, int i3, double d) {
            this.f19649c = i;
            this.f19646a = i2;
            this.f19648b = i3;
            this.f19645a = d;
            this.f19647a = Long.MIN_VALUE;
        }

        public C3378b(int i, int i2, int i3, long j) {
            this.f19649c = i;
            this.f19646a = i2;
            this.f19648b = i3;
            this.f19647a = j;
            this.f19645a = Double.MIN_VALUE;
        }

        /* renamed from: f */
        public static C3378b m26429f(int i, int i2, int i3, int i4) {
            return new C3378b(i, i3, i4, (long) i2);
        }

        /* renamed from: g */
        public static C3378b m26430g(int i, boolean z) {
            return new C3378b(i, 26, 0, z ? 1 : 0);
        }

        /* renamed from: i */
        public static int m26431i(int i, int i2, long j, int i3, int i4) {
            if (q71.m25351j(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int E = r71.m26386E((long) ((int) (((long) ((m26439q(i3, i5) + i3) + (i4 * i5))) - j)));
                if ((1 << E) == ((long) i5)) {
                    return E;
                }
            }
            return 3;
        }

        /* renamed from: j */
        public static C3378b m26432j(int i, float f) {
            return new C3378b(i, 3, 2, (double) f);
        }

        /* renamed from: k */
        public static C3378b m26433k(int i, double d) {
            return new C3378b(i, 3, 3, d);
        }

        /* renamed from: l */
        public static C3378b m26434l(int i, int i2) {
            return new C3378b(i, 1, 1, (long) i2);
        }

        /* renamed from: m */
        public static C3378b m26435m(int i, int i2) {
            return new C3378b(i, 1, 2, (long) i2);
        }

        /* renamed from: n */
        public static C3378b m26436n(int i, long j) {
            return new C3378b(i, 1, 3, j);
        }

        /* renamed from: o */
        public static C3378b m26437o(int i, int i2) {
            return new C3378b(i, 1, 0, (long) i2);
        }

        /* renamed from: p */
        public static byte m26438p(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        /* renamed from: q */
        public static int m26439q(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        /* renamed from: u */
        public static C3378b m26440u(int i, int i2) {
            return new C3378b(i, 2, 1, (long) i2);
        }

        /* renamed from: v */
        public static C3378b m26441v(int i, int i2) {
            return new C3378b(i, 2, 2, (long) i2);
        }

        /* renamed from: w */
        public static C3378b m26442w(int i, long j) {
            return new C3378b(i, 2, 3, j);
        }

        /* renamed from: x */
        public static C3378b m26443x(int i, int i2) {
            return new C3378b(i, 2, 0, (long) i2);
        }

        /* renamed from: h */
        public final int mo23671h(int i, int i2) {
            return m26431i(this.f19646a, this.f19648b, this.f19647a, i, i2);
        }

        /* renamed from: r */
        public final byte mo23672r() {
            return mo23673s(0);
        }

        /* renamed from: s */
        public final byte mo23673s(int i) {
            return m26438p(mo23674t(i), this.f19646a);
        }

        /* renamed from: t */
        public final int mo23674t(int i) {
            return q71.m25351j(this.f19646a) ? Math.max(this.f19648b, i) : this.f19648b;
        }
    }

    public r71() {
        this(256);
    }

    public r71(int i) {
        this((sf3) new C3384ra(i), 1);
    }

    public r71(sf3 sf3, int i) {
        this.f19638a = new ArrayList<>();
        this.f19640a = new HashMap<>();
        this.f19642b = new HashMap<>();
        this.f19641a = false;
        this.f19639a = new C3377a();
        this.f19637a = sf3;
        this.f19636a = i;
    }

    public r71(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }

    @Deprecated
    public r71(ByteBuffer byteBuffer, int i) {
        this((sf3) new C3384ra(byteBuffer.array()), i);
    }

    /* renamed from: E */
    public static int m26386E(long j) {
        if (j <= ((long) q71.C3240j.m25411a((byte) -1))) {
            return 0;
        }
        if (j <= ((long) q71.C3240j.m25413c(-1))) {
            return 1;
        }
        return j <= q71.C3240j.m25412b(-1) ? 2 : 3;
    }

    /* renamed from: A */
    public final void mo23634A(String str, long j) {
        this.f19638a.add(C3378b.m26442w(mo23663u(str), j));
    }

    /* renamed from: B */
    public void mo23635B(BigInteger bigInteger) {
        mo23634A((String) null, bigInteger.longValue());
    }

    /* renamed from: C */
    public int mo23636C() {
        return this.f19638a.size();
    }

    /* renamed from: D */
    public int mo23637D() {
        return this.f19638a.size();
    }

    /* renamed from: F */
    public final void mo23638F(C3378b bVar, int i) {
        int i2 = bVar.f19646a;
        if (!(i2 == 0 || i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                mo23640H(bVar.f19645a, i);
                return;
            } else if (i2 != 26) {
                mo23642J(bVar.f19647a, i);
                return;
            }
        }
        mo23641I(bVar.f19647a, i);
    }

    /* renamed from: G */
    public final C3378b mo23639G(int i, byte[] bArr, int i2, boolean z) {
        int E = m26386E((long) bArr.length);
        mo23641I((long) bArr.length, mo23644b(E));
        int t = this.f19637a.mo23763t();
        this.f19637a.mo23749e(bArr, 0, bArr.length);
        if (z) {
            this.f19637a.mo23751g((byte) 0);
        }
        return C3378b.m26429f(i, t, i2, E);
    }

    /* renamed from: H */
    public final void mo23640H(double d, int i) {
        if (i == 4) {
            this.f19637a.mo23761r((float) d);
        } else if (i == 8) {
            this.f19637a.mo23756m(d);
        }
    }

    /* renamed from: I */
    public final void mo23641I(long j, int i) {
        if (i == 1) {
            this.f19637a.mo23751g((byte) ((int) j));
        } else if (i == 2) {
            this.f19637a.mo23762s((short) ((int) j));
        } else if (i == 4) {
            this.f19637a.mo23748b((int) j);
        } else if (i == 8) {
            this.f19637a.mo23753j(j);
        }
    }

    /* renamed from: J */
    public final void mo23642J(long j, int i) {
        mo23641I((long) ((int) (((long) this.f19637a.mo23763t()) - j)), i);
    }

    /* renamed from: K */
    public final C3378b mo23643K(int i, String str) {
        return mo23639G(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    /* renamed from: b */
    public final int mo23644b(int i) {
        int i2 = 1 << i;
        int a = C3378b.m26439q(this.f19637a.mo23763t(), i2);
        while (true) {
            int i3 = a - 1;
            if (a == 0) {
                return i2;
            }
            this.f19637a.mo23751g((byte) 0);
            a = i3;
        }
    }

    /* renamed from: c */
    public final C3378b mo23645c(int i, int i2) {
        long j = (long) i2;
        int max = Math.max(0, m26386E(j));
        int i3 = i;
        while (i3 < this.f19638a.size()) {
            i3++;
            max = Math.max(max, C3378b.m26431i(4, 0, (long) this.f19638a.get(i3).f19649c, this.f19637a.mo23763t(), i3));
        }
        int b = mo23644b(max);
        mo23641I(j, b);
        int t = this.f19637a.mo23763t();
        while (i < this.f19638a.size()) {
            int i4 = this.f19638a.get(i).f19649c;
            mo23642J((long) this.f19638a.get(i).f19649c, b);
            i++;
        }
        return new C3378b(-1, q71.m25358q(4, 0), max, (long) t);
    }

    /* renamed from: d */
    public final C3378b mo23646d(int i, int i2, int i3, boolean z, boolean z2, C3378b bVar) {
        int i4;
        int i5;
        C3378b bVar2 = bVar;
        int i6 = i3;
        long j = (long) i6;
        int max = Math.max(0, m26386E(j));
        if (bVar2 != null) {
            max = Math.max(max, bVar2.mo23671h(this.f19637a.mo23763t(), 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i7 = 4;
        int i8 = max;
        for (int i9 = i2; i9 < this.f19638a.size(); i9++) {
            i8 = Math.max(i8, this.f19638a.get(i9).mo23671h(this.f19637a.mo23763t(), i9 + i4));
            int i10 = i2;
            if (z && i9 == i10) {
                i7 = this.f19638a.get(i9).f19646a;
                if (!q71.m25353l(i7)) {
                    throw new q71.C3232b("TypedVector does not support this element type");
                }
            }
        }
        int i11 = i2;
        int b = mo23644b(i8);
        if (bVar2 != null) {
            mo23642J(bVar2.f19647a, b);
            mo23641I(1 << bVar2.f19648b, b);
        }
        if (!z2) {
            mo23641I(j, b);
        }
        int t = this.f19637a.mo23763t();
        for (int i12 = i11; i12 < this.f19638a.size(); i12++) {
            mo23638F(this.f19638a.get(i12), b);
        }
        if (!z) {
            while (i11 < this.f19638a.size()) {
                this.f19637a.mo23751g(this.f19638a.get(i11).mo23673s(i8));
                i11++;
            }
        }
        if (bVar2 != null) {
            i5 = 9;
        } else if (z) {
            if (!z2) {
                i6 = 0;
            }
            i5 = q71.m25358q(i7, i6);
        } else {
            i5 = 10;
        }
        return new C3378b(i, i5, i8, (long) t);
    }

    /* renamed from: e */
    public int mo23647e(String str, int i) {
        int u = mo23663u(str);
        ArrayList<C3378b> arrayList = this.f19638a;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.f19639a);
        int i2 = i;
        C3378b d = mo23646d(u, i2, this.f19638a.size() - i, false, false, mo23645c(i, this.f19638a.size() - i));
        while (this.f19638a.size() > i) {
            ArrayList<C3378b> arrayList2 = this.f19638a;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.f19638a.add(d);
        return (int) d.f19647a;
    }

    /* renamed from: f */
    public int mo23648f(String str, int i, boolean z, boolean z2) {
        C3378b d = mo23646d(mo23663u(str), i, this.f19638a.size() - i, z, z2, (C3378b) null);
        while (this.f19638a.size() > i) {
            ArrayList<C3378b> arrayList = this.f19638a;
            arrayList.remove(arrayList.size() - 1);
        }
        this.f19638a.add(d);
        return (int) d.f19647a;
    }

    /* renamed from: g */
    public ByteBuffer mo23649g() {
        int b = mo23644b(this.f19638a.get(0).mo23671h(this.f19637a.mo23763t(), 0));
        mo23638F(this.f19638a.get(0), b);
        this.f19637a.mo23751g(this.f19638a.get(0).mo23672r());
        this.f19637a.mo23751g((byte) b);
        this.f19641a = true;
        return ByteBuffer.wrap(this.f19637a.mo23159u(), 0, this.f19637a.mo23763t());
    }

    /* renamed from: h */
    public sf3 mo23650h() {
        return this.f19637a;
    }

    /* renamed from: i */
    public int mo23651i(String str, byte[] bArr) {
        C3378b G = mo23639G(mo23663u(str), bArr, 25, false);
        this.f19638a.add(G);
        return (int) G.f19647a;
    }

    /* renamed from: j */
    public int mo23652j(byte[] bArr) {
        return mo23651i((String) null, bArr);
    }

    /* renamed from: k */
    public void mo23653k(String str, boolean z) {
        this.f19638a.add(C3378b.m26430g(mo23663u(str), z));
    }

    /* renamed from: l */
    public void mo23654l(boolean z) {
        mo23653k((String) null, z);
    }

    /* renamed from: m */
    public void mo23655m(double d) {
        mo23657o((String) null, d);
    }

    /* renamed from: n */
    public void mo23656n(float f) {
        mo23658p((String) null, f);
    }

    /* renamed from: o */
    public void mo23657o(String str, double d) {
        this.f19638a.add(C3378b.m26433k(mo23663u(str), d));
    }

    /* renamed from: p */
    public void mo23658p(String str, float f) {
        this.f19638a.add(C3378b.m26432j(mo23663u(str), f));
    }

    /* renamed from: q */
    public void mo23659q(int i) {
        mo23661s((String) null, i);
    }

    /* renamed from: r */
    public void mo23660r(long j) {
        mo23662t((String) null, j);
    }

    /* renamed from: s */
    public void mo23661s(String str, int i) {
        mo23662t(str, (long) i);
    }

    /* renamed from: t */
    public void mo23662t(String str, long j) {
        ArrayList<C3378b> arrayList;
        C3378b n;
        int u = mo23663u(str);
        if (-128 <= j && j <= 127) {
            arrayList = this.f19638a;
            n = C3378b.m26437o(u, (int) j);
        } else if (-32768 <= j && j <= 32767) {
            arrayList = this.f19638a;
            n = C3378b.m26434l(u, (int) j);
        } else if (-2147483648L > j || j > 2147483647L) {
            arrayList = this.f19638a;
            n = C3378b.m26436n(u, j);
        } else {
            arrayList = this.f19638a;
            n = C3378b.m26435m(u, (int) j);
        }
        arrayList.add(n);
    }

    /* renamed from: u */
    public final int mo23663u(String str) {
        if (str == null) {
            return -1;
        }
        int t = this.f19637a.mo23763t();
        if ((this.f19636a & 1) != 0) {
            Integer num = this.f19640a.get(str);
            if (num != null) {
                return num.intValue();
            }
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f19637a.mo23749e(bytes, 0, bytes.length);
        } else {
            byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
            this.f19637a.mo23749e(bytes2, 0, bytes2.length);
        }
        this.f19637a.mo23751g((byte) 0);
        this.f19640a.put(str, Integer.valueOf(t));
        return t;
    }

    /* renamed from: v */
    public int mo23664v(String str) {
        return mo23665w((String) null, str);
    }

    /* renamed from: w */
    public int mo23665w(String str, String str2) {
        C3378b K;
        int u = mo23663u(str);
        if ((this.f19636a & 2) != 0) {
            Integer num = this.f19642b.get(str2);
            if (num == null) {
                K = mo23643K(u, str2);
                this.f19642b.put(str2, Integer.valueOf((int) K.f19647a));
            } else {
                this.f19638a.add(C3378b.m26429f(u, num.intValue(), 5, m26386E((long) str2.length())));
                return num.intValue();
            }
        } else {
            K = mo23643K(u, str2);
        }
        this.f19638a.add(K);
        return (int) K.f19647a;
    }

    /* renamed from: x */
    public void mo23666x(int i) {
        mo23668z((String) null, (long) i);
    }

    /* renamed from: y */
    public void mo23667y(long j) {
        mo23668z((String) null, j);
    }

    /* renamed from: z */
    public final void mo23668z(String str, long j) {
        int u = mo23663u(str);
        int E = m26386E(j);
        this.f19638a.add(E == 0 ? C3378b.m26443x(u, (int) j) : E == 1 ? C3378b.m26440u(u, (int) j) : E == 2 ? C3378b.m26441v(u, (int) j) : C3378b.m26442w(u, j));
    }
}
