package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.util.ArrayList;
import java.util.HashMap;

public class ih4 implements ak4 {

    /* renamed from: j */
    public static final int f13673j = 0;

    /* renamed from: k */
    public static final int f13674k = 1;

    /* renamed from: l */
    public static final int f13675l = 2;

    /* renamed from: m */
    public static final int f13676m = 0;

    /* renamed from: n */
    public static final int f13677n = 1;

    /* renamed from: o */
    public static final int f13678o = 2;

    /* renamed from: p */
    public static final int f13679p = 3;

    /* renamed from: q */
    public static final int f13680q = 4;

    /* renamed from: r */
    public static final int f13681r = 5;

    /* renamed from: s */
    public static final int f13682s = 6;

    /* renamed from: t */
    public static final int f13683t = -1;

    /* renamed from: u */
    public static final int f13684u = -2;

    /* renamed from: a */
    public float f13685a = 0.0f;

    /* renamed from: a */
    public ur0 f13686a = null;

    /* renamed from: a */
    public yj4 f13687a = new yj4();

    /* renamed from: a */
    public HashMap<Integer, HashMap<String, C2446a>> f13688a = new HashMap<>();

    /* renamed from: b */
    public String f13689b = null;

    /* renamed from: b */
    public HashMap<String, C2447b> f13690b = new HashMap<>();

    /* renamed from: g */
    public int f13691g = 0;

    /* renamed from: h */
    public int f13692h = 0;

    /* renamed from: i */
    public int f13693i = 400;

    /* renamed from: com.onedelhi.secure.ih4$a */
    public static class C2446a {

        /* renamed from: a */
        public float f13694a;

        /* renamed from: a */
        public int f13695a;

        /* renamed from: a */
        public String f13696a;

        /* renamed from: b */
        public float f13697b;

        /* renamed from: b */
        public int f13698b;

        public C2446a(String str, int i, int i2, float f, float f2) {
            this.f13696a = str;
            this.f13695a = i;
            this.f13698b = i2;
            this.f13694a = f;
            this.f13697b = f2;
        }
    }

    /* renamed from: com.onedelhi.secure.ih4$b */
    public static class C2447b {

        /* renamed from: a */
        public int f13699a = -1;

        /* renamed from: a */
        public ex4 f13700a = new ex4();

        /* renamed from: a */
        public ny1 f13701a = new ny1();

        /* renamed from: a */
        public ql2 f13702a = new ql2(this.f13700a);

        /* renamed from: a */
        public yk2 f13703a;

        /* renamed from: b */
        public int f13704b = -1;

        /* renamed from: b */
        public ex4 f13705b = new ex4();

        /* renamed from: b */
        public ql2 f13706b = new ql2(this.f13705b);

        /* renamed from: c */
        public ex4 f13707c = new ex4();

        /* renamed from: c */
        public ql2 f13708c = new ql2(this.f13707c);

        public C2447b() {
            yk2 yk2 = new yk2(this.f13702a);
            this.f13703a = yk2;
            yk2.mo27547Z(this.f13702a);
            this.f13703a.mo27545X(this.f13706b);
        }

        /* renamed from: a */
        public ex4 mo17800a(int i) {
            return i == 0 ? this.f13700a : i == 1 ? this.f13705b : this.f13707c;
        }

        /* renamed from: b */
        public void mo17801b(int i, int i2, float f, ih4 ih4) {
            this.f13699a = i2;
            this.f13704b = i;
            this.f13703a.mo27551d0(i, i2, 1.0f, System.nanoTime());
            ex4.m14421n(i, i2, this.f13707c, this.f13700a, this.f13705b, ih4, f);
            this.f13707c.f11757l = f;
            this.f13703a.mo27538Q(this.f13708c, f, System.nanoTime(), this.f13701a);
        }

        /* renamed from: c */
        public void mo17802c(yj4 yj4) {
            gl2 gl2 = new gl2();
            yj4.mo27517g(gl2);
            this.f13703a.mo27553f(gl2);
        }

        /* renamed from: d */
        public void mo17803d(yj4 yj4) {
            hl2 hl2 = new hl2();
            yj4.mo27517g(hl2);
            this.f13703a.mo27553f(hl2);
        }

        /* renamed from: e */
        public void mo17804e(yj4 yj4) {
            il2 il2 = new il2();
            yj4.mo27517g(il2);
            this.f13703a.mo27553f(il2);
        }

        /* renamed from: f */
        public void mo17805f(o60 o60, int i) {
            if (i == 0) {
                this.f13700a.mo15625C(o60);
                this.f13703a.mo27547Z(this.f13702a);
            } else if (i == 1) {
                this.f13705b.mo15625C(o60);
                this.f13703a.mo27545X(this.f13706b);
            }
            this.f13704b = -1;
        }
    }

    /* renamed from: E */
    public static bt1 m17559E(int i, String str) {
        switch (i) {
            case -1:
                return new ah4(str);
            case 0:
                return dh4.f27452a;
            case 1:
                return eh4.f27947a;
            case 2:
                return bh4.f26347a;
            case 3:
                return ch4.f26754a;
            case 4:
                return fh4.f28460a;
            case 5:
                return hh4.f29633a;
            case 6:
                return gh4.f29199a;
            default:
                return null;
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ float m17560Q(String str, float f) {
        return (float) ur0.m29534c(str).mo17398a((double) f);
    }

    /* renamed from: R */
    public static /* synthetic */ float m17561R(float f) {
        return (float) ur0.m29534c(ur0.f21502j).mo17398a((double) f);
    }

    /* renamed from: S */
    public static /* synthetic */ float m17562S(float f) {
        return (float) ur0.m29534c(ur0.f21501i).mo17398a((double) f);
    }

    /* renamed from: T */
    public static /* synthetic */ float m17563T(float f) {
        return (float) ur0.m29534c(ur0.f21500h).mo17398a((double) f);
    }

    /* renamed from: U */
    public static /* synthetic */ float m17564U(float f) {
        return (float) ur0.m29534c(ur0.f21503k).mo17398a((double) f);
    }

    /* renamed from: V */
    public static /* synthetic */ float m17565V(float f) {
        return (float) ur0.m29534c(ur0.f21504l).mo17398a((double) f);
    }

    /* renamed from: W */
    public static /* synthetic */ float m17566W(float f) {
        return (float) ur0.m29534c(ur0.f21505m).mo17398a((double) f);
    }

    /* renamed from: X */
    public static /* synthetic */ float m17567X(float f) {
        return (float) ur0.m29534c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").mo17398a((double) f);
    }

    /* renamed from: A */
    public ex4 mo17770A(String str) {
        C2447b bVar = this.f13690b.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f13705b;
    }

    /* renamed from: B */
    public ex4 mo17771B(o60 o60) {
        return mo17781M(o60.f17753a, (o60) null, 2).f13707c;
    }

    /* renamed from: C */
    public ex4 mo17772C(String str) {
        C2447b bVar = this.f13690b.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f13707c;
    }

    /* renamed from: D */
    public bt1 mo17773D() {
        return m17559E(this.f13691g, this.f13689b);
    }

    /* renamed from: F */
    public int mo17774F(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f13690b.get(str).f13703a.mo27557j(fArr, iArr, iArr2);
    }

    /* renamed from: G */
    public yk2 mo17775G(String str) {
        return mo17781M(str, (o60) null, 0).f13703a;
    }

    /* renamed from: H */
    public int mo17776H(ex4 ex4) {
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap hashMap = this.f13688a.get(Integer.valueOf(i2));
            if (!(hashMap == null || ((C2446a) hashMap.get(ex4.f11740a.f17753a)) == null)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: I */
    public float[] mo17777I(String str) {
        float[] fArr = new float[124];
        this.f13690b.get(str).f13703a.mo27558k(fArr, 62);
        return fArr;
    }

    /* renamed from: J */
    public ex4 mo17778J(o60 o60) {
        return mo17781M(o60.f17753a, (o60) null, 0).f13700a;
    }

    /* renamed from: K */
    public ex4 mo17779K(String str) {
        C2447b bVar = this.f13690b.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f13700a;
    }

    /* renamed from: L */
    public final C2447b mo17780L(String str) {
        return this.f13690b.get(str);
    }

    /* renamed from: M */
    public final C2447b mo17781M(String str, o60 o60, int i) {
        C2447b bVar = this.f13690b.get(str);
        if (bVar == null) {
            bVar = new C2447b();
            this.f13687a.mo27517g(bVar.f13703a);
            this.f13690b.put(str, bVar);
            if (o60 != null) {
                bVar.mo17805f(o60, i);
            }
        }
        return bVar;
    }

    /* renamed from: N */
    public boolean mo17782N() {
        return this.f13688a.size() > 0;
    }

    /* renamed from: O */
    public void mo17783O(int i, int i2, float f) {
        ur0 ur0 = this.f13686a;
        if (ur0 != null) {
            f = (float) ur0.mo17398a((double) f);
        }
        for (String str : this.f13690b.keySet()) {
            this.f13690b.get(str).mo17801b(i, i2, f, this);
        }
    }

    /* renamed from: P */
    public boolean mo17784P() {
        return this.f13690b.isEmpty();
    }

    /* renamed from: Y */
    public void mo17785Y(yj4 yj4) {
        yj4.mo27516f(this.f13687a);
        yj4.mo27517g(this);
    }

    /* renamed from: Z */
    public void mo17786Z(p60 p60, int i) {
        ArrayList<o60> l2 = p60.mo14933l2();
        int size = l2.size();
        for (int i2 = 0; i2 < size; i2++) {
            o60 o60 = l2.get(i2);
            mo17781M(o60.f17753a, (o60) null, i).mo17805f(o60, i);
        }
    }

    /* renamed from: a */
    public boolean mo13120a(int i, int i2) {
        return false;
    }

    /* renamed from: b */
    public int mo13121b(String str) {
        return 0;
    }

    /* renamed from: c */
    public boolean mo13122c(int i, float f) {
        if (i != 706) {
            return false;
        }
        this.f13685a = f;
        return false;
    }

    /* renamed from: d */
    public boolean mo13123d(int i, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean mo13124e(int i, String str) {
        if (i != 705) {
            return false;
        }
        this.f13689b = str;
        this.f13686a = ur0.m29534c(str);
        return false;
    }

    /* renamed from: n */
    public void mo17787n(int i, String str, String str2, int i2) {
        mo17781M(str, (o60) null, i).mo17800a(i).mo15628c(str2, i2);
    }

    /* renamed from: o */
    public void mo17788o(int i, String str, String str2, float f) {
        mo17781M(str, (o60) null, i).mo17800a(i).mo15629d(str2, f);
    }

    /* renamed from: p */
    public void mo17789p(String str, yj4 yj4) {
        mo17781M(str, (o60) null, 0).mo17802c(yj4);
    }

    /* renamed from: q */
    public void mo17790q(String str, yj4 yj4) {
        mo17781M(str, (o60) null, 0).mo17803d(yj4);
    }

    /* renamed from: r */
    public void mo17791r(String str, int i, int i2, float f, float f2) {
        yj4 yj4 = new yj4();
        yj4.mo27512b(ak4.C1714g.f9294j, 2);
        yj4.mo27512b(100, i);
        yj4.mo27511a(ak4.C1714g.f9287f, f);
        yj4.mo27511a(ak4.C1714g.f9289g, f2);
        mo17781M(str, (o60) null, 0).mo17804e(yj4);
        C2446a aVar = new C2446a(str, i, i2, f, f2);
        HashMap hashMap = this.f13688a.get(Integer.valueOf(i));
        if (hashMap == null) {
            hashMap = new HashMap();
            this.f13688a.put(Integer.valueOf(i), hashMap);
        }
        hashMap.put(str, aVar);
    }

    /* renamed from: s */
    public void mo17792s(String str, yj4 yj4) {
        mo17781M(str, (o60) null, 0).mo17804e(yj4);
    }

    /* renamed from: t */
    public void mo17793t() {
        this.f13690b.clear();
    }

    /* renamed from: u */
    public boolean mo17794u(String str) {
        return this.f13690b.containsKey(str);
    }

    /* renamed from: v */
    public void mo17795v(ex4 ex4, float[] fArr, float[] fArr2, float[] fArr3) {
        C2446a aVar;
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap hashMap = this.f13688a.get(Integer.valueOf(i2));
            if (!(hashMap == null || (aVar = (C2446a) hashMap.get(ex4.f11740a.f17753a)) == null)) {
                fArr[i] = aVar.f13694a;
                fArr2[i] = aVar.f13697b;
                fArr3[i] = (float) aVar.f13695a;
                i++;
            }
        }
    }

    /* renamed from: w */
    public C2446a mo17796w(String str, int i) {
        C2446a aVar;
        while (i <= 100) {
            HashMap hashMap = this.f13688a.get(Integer.valueOf(i));
            if (hashMap != null && (aVar = (C2446a) hashMap.get(str)) != null) {
                return aVar;
            }
            i++;
        }
        return null;
    }

    /* renamed from: x */
    public C2446a mo17797x(String str, int i) {
        C2446a aVar;
        while (i >= 0) {
            HashMap hashMap = this.f13688a.get(Integer.valueOf(i));
            if (hashMap != null && (aVar = (C2446a) hashMap.get(str)) != null) {
                return aVar;
            }
            i--;
        }
        return null;
    }

    /* renamed from: y */
    public int mo17798y() {
        return this.f13692h;
    }

    /* renamed from: z */
    public ex4 mo17799z(o60 o60) {
        return mo17781M(o60.f17753a, (o60) null, 1).f13705b;
    }
}
