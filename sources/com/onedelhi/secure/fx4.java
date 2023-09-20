package com.onedelhi.secure;

import com.onedelhi.secure.o60;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class fx4 {

    /* renamed from: b */
    public static final boolean f12364b = false;

    /* renamed from: d */
    public static int f12365d;

    /* renamed from: a */
    public int f12366a;

    /* renamed from: a */
    public ArrayList<o60> f12367a = new ArrayList<>();

    /* renamed from: a */
    public boolean f12368a = false;

    /* renamed from: b */
    public int f12369b;

    /* renamed from: b */
    public ArrayList<C2207a> f12370b = null;

    /* renamed from: c */
    public int f12371c = -1;

    /* renamed from: com.onedelhi.secure.fx4$a */
    public class C2207a {

        /* renamed from: a */
        public int f12372a;

        /* renamed from: a */
        public WeakReference<o60> f12374a;

        /* renamed from: b */
        public int f12375b;

        /* renamed from: c */
        public int f12376c;

        /* renamed from: d */
        public int f12377d;

        /* renamed from: e */
        public int f12378e;

        /* renamed from: f */
        public int f12379f;

        public C2207a(o60 o60, p32 p32, int i) {
            this.f12374a = new WeakReference<>(o60);
            this.f12372a = p32.mo22260O(o60.f17748a);
            this.f12375b = p32.mo22260O(o60.f17765b);
            this.f12376c = p32.mo22260O(o60.f17775c);
            this.f12377d = p32.mo22260O(o60.f17781d);
            this.f12378e = p32.mo22260O(o60.f17785e);
            this.f12379f = i;
        }

        /* renamed from: a */
        public void mo16218a() {
            o60 o60 = (o60) this.f12374a.get();
            if (o60 != null) {
                o60.mo21732p1(this.f12372a, this.f12375b, this.f12376c, this.f12377d, this.f12378e, this.f12379f);
            }
        }
    }

    public fx4(int i) {
        int i2 = f12365d;
        f12365d = i2 + 1;
        this.f12366a = i2;
        this.f12369b = i;
    }

    /* renamed from: a */
    public boolean mo16200a(o60 o60) {
        if (this.f12367a.contains(o60)) {
            return false;
        }
        this.f12367a.add(o60);
        return true;
    }

    /* renamed from: b */
    public void mo16201b() {
        if (this.f12370b != null && this.f12368a) {
            for (int i = 0; i < this.f12370b.size(); i++) {
                this.f12370b.get(i).mo16218a();
            }
        }
    }

    /* renamed from: c */
    public void mo16202c(ArrayList<fx4> arrayList) {
        int size = this.f12367a.size();
        if (this.f12371c != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                fx4 fx4 = arrayList.get(i);
                if (this.f12371c == fx4.f12366a) {
                    mo16212m(this.f12369b, fx4);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: d */
    public void mo16203d() {
        this.f12367a.clear();
    }

    /* renamed from: e */
    public final boolean mo16204e(o60 o60) {
        return this.f12367a.contains(o60);
    }

    /* renamed from: f */
    public int mo16205f() {
        return this.f12366a;
    }

    /* renamed from: g */
    public int mo16206g() {
        return this.f12369b;
    }

    /* renamed from: h */
    public final String mo16207h() {
        int i = this.f12369b;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: i */
    public boolean mo16208i(fx4 fx4) {
        for (int i = 0; i < this.f12367a.size(); i++) {
            if (fx4.mo16204e(this.f12367a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo16209j() {
        return this.f12368a;
    }

    /* renamed from: k */
    public final int mo16210k(int i, o60 o60) {
        o60.C3032b z = o60.mo21759z(i);
        if (z == o60.C3032b.WRAP_CONTENT || z == o60.C3032b.MATCH_PARENT || z == o60.C3032b.FIXED) {
            return i == 0 ? o60.mo21723m0() : o60.mo21619D();
        }
        return -1;
    }

    /* renamed from: l */
    public int mo16211l(p32 p32, int i) {
        if (this.f12367a.size() == 0) {
            return 0;
        }
        return mo16216q(p32, this.f12367a, i);
    }

    /* renamed from: m */
    public void mo16212m(int i, fx4 fx4) {
        Iterator<o60> it = this.f12367a.iterator();
        while (it.hasNext()) {
            o60 next = it.next();
            fx4.mo16200a(next);
            int f = fx4.mo16205f();
            if (i == 0) {
                next.f17742I = f;
            } else {
                next.f17743J = f;
            }
        }
        this.f12371c = fx4.f12366a;
    }

    /* renamed from: n */
    public void mo16213n(boolean z) {
        this.f12368a = z;
    }

    /* renamed from: o */
    public void mo16214o(int i) {
        this.f12369b = i;
    }

    /* renamed from: p */
    public int mo16215p() {
        return this.f12367a.size();
    }

    /* renamed from: q */
    public final int mo16216q(p32 p32, ArrayList<o60> arrayList, int i) {
        int O;
        m60 m60;
        p60 p60 = (p60) arrayList.get(0).mo21666U();
        p32.mo22270Y();
        p60.mo15199g(p32, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo15199g(p32, false);
        }
        if (i == 0 && p60.f18400s0 > 0) {
            C3455rv.m27091b(p60, p32, arrayList, 0);
        }
        if (i == 1 && p60.f18401t0 > 0) {
            C3455rv.m27091b(p60, p32, arrayList, 1);
        }
        try {
            p32.mo22265T();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f12370b = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f12370b.add(new C2207a(arrayList.get(i3), p32, i));
        }
        if (i == 0) {
            O = p32.mo22260O(p60.f17748a);
            m60 = p60.f17775c;
        } else {
            O = p32.mo22260O(p60.f17765b);
            m60 = p60.f17781d;
        }
        int O2 = p32.mo22260O(m60);
        p32.mo22270Y();
        return O2 - O;
    }

    public String toString() {
        String str = mo16207h() + " [" + this.f12366a + "] <";
        Iterator<o60> it = this.f12367a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().mo21756y();
        }
        return str + " >";
    }
}
