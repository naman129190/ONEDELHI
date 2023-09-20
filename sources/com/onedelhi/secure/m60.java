package com.onedelhi.secure;

import com.onedelhi.secure.v04;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class m60 {

    /* renamed from: b */
    public static final boolean f15911b = false;

    /* renamed from: d */
    public static final int f15912d = Integer.MIN_VALUE;

    /* renamed from: a */
    public int f15913a;

    /* renamed from: a */
    public final C2835b f15914a;

    /* renamed from: a */
    public m60 f15915a;

    /* renamed from: a */
    public final o60 f15916a;

    /* renamed from: a */
    public v04 f15917a;

    /* renamed from: a */
    public HashSet<m60> f15918a = null;

    /* renamed from: a */
    public boolean f15919a;

    /* renamed from: b */
    public int f15920b = 0;

    /* renamed from: c */
    public int f15921c = Integer.MIN_VALUE;

    /* renamed from: com.onedelhi.secure.m60$a */
    public static /* synthetic */ class C2834a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15922a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.m60$b[] r0 = com.onedelhi.secure.m60.C2835b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15922a = r0
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15922a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15922a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15922a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15922a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15922a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15922a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f15922a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f15922a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.m60$b r1 = com.onedelhi.secure.m60.C2835b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.m60.C2834a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.m60$b */
    public enum C2835b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public m60(o60 o60, C2835b bVar) {
        this.f15916a = o60;
        this.f15914a = bVar;
    }

    /* renamed from: A */
    public void mo20103A(int i) {
        this.f15913a = i;
        this.f15919a = true;
    }

    /* renamed from: B */
    public void mo20104B(int i) {
        if (mo20121p()) {
            this.f15921c = i;
        }
    }

    /* renamed from: C */
    public void mo20105C(int i) {
        if (mo20121p()) {
            this.f15920b = i;
        }
    }

    /* renamed from: a */
    public boolean mo20106a(m60 m60, int i) {
        return mo20107b(m60, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public boolean mo20107b(m60 m60, int i, int i2, boolean z) {
        if (m60 == null) {
            mo20130x();
            return true;
        } else if (!z && !mo20128v(m60)) {
            return false;
        } else {
            this.f15915a = m60;
            if (m60.f15918a == null) {
                m60.f15918a = new HashSet<>();
            }
            HashSet<m60> hashSet = this.f15915a.f15918a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f15920b = i;
            this.f15921c = i2;
            return true;
        }
    }

    /* renamed from: c */
    public void mo20108c(m60 m60, HashMap<o60, o60> hashMap) {
        m60 m602;
        HashSet<m60> hashSet;
        m60 m603 = this.f15915a;
        if (!(m603 == null || (hashSet = m603.f15918a) == null)) {
            hashSet.remove(this);
        }
        m60 m604 = m60.f15915a;
        if (m604 != null) {
            m602 = hashMap.get(m60.f15915a.f15916a).mo21327r(m604.mo20117l());
        } else {
            m602 = null;
        }
        this.f15915a = m602;
        m60 m605 = this.f15915a;
        if (m605 != null) {
            if (m605.f15918a == null) {
                m605.f15918a = new HashSet<>();
            }
            this.f15915a.f15918a.add(this);
        }
        this.f15920b = m60.f15920b;
        this.f15921c = m60.f15921c;
    }

    /* renamed from: d */
    public void mo20109d(int i, ArrayList<fx4> arrayList, fx4 fx4) {
        HashSet<m60> hashSet = this.f15918a;
        if (hashSet != null) {
            Iterator<m60> it = hashSet.iterator();
            while (it.hasNext()) {
                aj1.m11225a(it.next().f15916a, i, arrayList, fx4);
            }
        }
    }

    /* renamed from: e */
    public HashSet<m60> mo20110e() {
        return this.f15918a;
    }

    /* renamed from: f */
    public int mo20111f() {
        if (!this.f15919a) {
            return 0;
        }
        return this.f15913a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = r3.f15915a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo20112g() {
        /*
            r3 = this;
            com.onedelhi.secure.o60 r0 = r3.f15916a
            int r0 = r0.mo21720l0()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f15921c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x0021
            com.onedelhi.secure.m60 r0 = r3.f15915a
            if (r0 == 0) goto L_0x0021
            com.onedelhi.secure.o60 r0 = r0.f15916a
            int r0 = r0.mo21720l0()
            if (r0 != r1) goto L_0x0021
            int r0 = r3.f15921c
            return r0
        L_0x0021:
            int r0 = r3.f15920b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.m60.mo20112g():int");
    }

    /* renamed from: h */
    public final m60 mo20113h() {
        switch (C2834a.f15922a[this.f15914a.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f15916a.f17775c;
            case 3:
                return this.f15916a.f17748a;
            case 4:
                return this.f15916a.f17781d;
            case 5:
                return this.f15916a.f17765b;
            default:
                throw new AssertionError(this.f15914a.name());
        }
    }

    /* renamed from: i */
    public o60 mo20114i() {
        return this.f15916a;
    }

    /* renamed from: j */
    public v04 mo20115j() {
        return this.f15917a;
    }

    /* renamed from: k */
    public m60 mo20116k() {
        return this.f15915a;
    }

    /* renamed from: l */
    public C2835b mo20117l() {
        return this.f15914a;
    }

    /* renamed from: m */
    public boolean mo20118m() {
        HashSet<m60> hashSet = this.f15918a;
        if (hashSet == null) {
            return false;
        }
        Iterator<m60> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo20113h().mo20121p()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo20119n() {
        HashSet<m60> hashSet = this.f15918a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: o */
    public boolean mo20120o() {
        return this.f15919a;
    }

    /* renamed from: p */
    public boolean mo20121p() {
        return this.f15915a != null;
    }

    /* renamed from: q */
    public boolean mo20122q(o60 o60) {
        if (mo20124s(o60, new HashSet())) {
            return false;
        }
        o60 U = mo20114i().mo21666U();
        return U == o60 || o60.mo21666U() == U;
    }

    /* renamed from: r */
    public boolean mo20123r(o60 o60, m60 m60) {
        return mo20122q(o60);
    }

    /* renamed from: s */
    public final boolean mo20124s(o60 o60, HashSet<o60> hashSet) {
        if (hashSet.contains(o60)) {
            return false;
        }
        hashSet.add(o60);
        if (o60 == mo20114i()) {
            return true;
        }
        ArrayList<m60> s = o60.mo21738s();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            m60 m60 = s.get(i);
            if (m60.mo20127u(this) && m60.mo20121p() && mo20124s(m60.mo20116k().mo20114i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo20125t() {
        switch (C2834a.f15922a[this.f15914a.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f15914a.name());
        }
    }

    public String toString() {
        return this.f15916a.mo21756y() + ar4.f25981a + this.f15914a.toString();
    }

    /* renamed from: u */
    public boolean mo20127u(m60 m60) {
        C2835b l = m60.mo20117l();
        C2835b bVar = this.f15914a;
        if (l == bVar) {
            return true;
        }
        switch (C2834a.f15922a[bVar.ordinal()]) {
            case 1:
                return l != C2835b.BASELINE;
            case 2:
            case 3:
            case 7:
                return l == C2835b.LEFT || l == C2835b.RIGHT || l == C2835b.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return l == C2835b.TOP || l == C2835b.BOTTOM || l == C2835b.CENTER_Y || l == C2835b.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f15914a.name());
        }
    }

    /* renamed from: v */
    public boolean mo20128v(m60 m60) {
        boolean z = false;
        if (m60 == null) {
            return false;
        }
        C2835b l = m60.mo20117l();
        C2835b bVar = this.f15914a;
        if (l == bVar) {
            return bVar != C2835b.BASELINE || (m60.mo20114i().mo21734q0() && mo20114i().mo21734q0());
        }
        switch (C2834a.f15922a[bVar.ordinal()]) {
            case 1:
                return (l == C2835b.BASELINE || l == C2835b.CENTER_X || l == C2835b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = l == C2835b.LEFT || l == C2835b.RIGHT;
                if (!(m60.mo20114i() instanceof nj1)) {
                    return z2;
                }
                if (z2 || l == C2835b.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = l == C2835b.TOP || l == C2835b.BOTTOM;
                if (!(m60.mo20114i() instanceof nj1)) {
                    return z3;
                }
                if (z3 || l == C2835b.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
                return (l == C2835b.LEFT || l == C2835b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f15914a.name());
        }
    }

    /* renamed from: w */
    public boolean mo20129w() {
        switch (C2834a.f15922a[this.f15914a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f15914a.name());
        }
    }

    /* renamed from: x */
    public void mo20130x() {
        HashSet<m60> hashSet;
        m60 m60 = this.f15915a;
        if (!(m60 == null || (hashSet = m60.f15918a) == null)) {
            hashSet.remove(this);
            if (this.f15915a.f15918a.size() == 0) {
                this.f15915a.f15918a = null;
            }
        }
        this.f15918a = null;
        this.f15915a = null;
        this.f15920b = 0;
        this.f15921c = Integer.MIN_VALUE;
        this.f15919a = false;
        this.f15913a = 0;
    }

    /* renamed from: y */
    public void mo20131y() {
        this.f15919a = false;
        this.f15913a = 0;
    }

    /* renamed from: z */
    public void mo20132z(C1990ds dsVar) {
        v04 v04 = this.f15917a;
        if (v04 == null) {
            this.f15917a = new v04(v04.C3759b.UNRESTRICTED, (String) null);
        } else {
            v04.mo25827s();
        }
    }
}
