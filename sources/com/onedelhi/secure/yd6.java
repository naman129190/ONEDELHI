package com.onedelhi.secure;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class yd6 {

    /* renamed from: a */
    public long f22989a;

    /* renamed from: a */
    public final za6 f22990a;
    @ts2

    /* renamed from: a */
    public Boolean f22991a;

    /* renamed from: a */
    public final String f22992a;
    @ts2

    /* renamed from: a */
    public List f22993a;

    /* renamed from: a */
    public boolean f22994a;

    /* renamed from: b */
    public long f22995b;
    @ts2

    /* renamed from: b */
    public String f22996b;

    /* renamed from: b */
    public boolean f22997b;

    /* renamed from: c */
    public long f22998c;
    @ts2

    /* renamed from: c */
    public String f22999c;

    /* renamed from: c */
    public boolean f23000c;

    /* renamed from: d */
    public long f23001d;
    @ts2

    /* renamed from: d */
    public String f23002d;

    /* renamed from: d */
    public boolean f23003d;

    /* renamed from: e */
    public long f23004e;
    @ts2

    /* renamed from: e */
    public String f23005e;

    /* renamed from: f */
    public long f23006f;
    @ts2

    /* renamed from: f */
    public String f23007f;

    /* renamed from: g */
    public long f23008g;
    @ts2

    /* renamed from: g */
    public String f23009g;

    /* renamed from: h */
    public long f23010h;
    @ts2

    /* renamed from: h */
    public String f23011h;

    /* renamed from: i */
    public long f23012i;
    @ts2

    /* renamed from: i */
    public String f23013i;

    /* renamed from: j */
    public long f23014j;
    @ts2

    /* renamed from: j */
    public String f23015j;

    /* renamed from: k */
    public long f23016k;

    /* renamed from: l */
    public long f23017l;

    /* renamed from: m */
    public long f23018m;

    /* renamed from: n */
    public long f23019n;

    /* renamed from: o */
    public long f23020o;

    /* renamed from: p */
    public long f23021p;

    @ly4
    public yd6(za6 za6, String str) {
        Preconditions.checkNotNull(za6);
        Preconditions.checkNotEmpty(str);
        this.f22990a = za6;
        this.f22992a = str;
        za6.mo15135d().mo15139h();
    }

    @ly4
    /* renamed from: A */
    public final long mo27356A() {
        this.f22990a.mo15135d().mo15139h();
        return 0;
    }

    @ly4
    /* renamed from: B */
    public final void mo27357B(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f22998c != j;
        this.f22998c = j;
    }

    @ly4
    /* renamed from: C */
    public final void mo27358C(long j) {
        boolean z = true;
        Preconditions.checkArgument(j >= 0);
        this.f22990a.mo15135d().mo15139h();
        boolean z2 = this.f23003d;
        if (this.f22989a == j) {
            z = false;
        }
        this.f23003d = z | z2;
        this.f22989a = j;
    }

    @ly4
    /* renamed from: D */
    public final void mo27359D(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f22995b != j;
        this.f22995b = j;
    }

    @ly4
    /* renamed from: E */
    public final void mo27360E(boolean z) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f22994a != z;
        this.f22994a = z;
    }

    @ly4
    /* renamed from: F */
    public final void mo27361F(@ts2 Boolean bool) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= !da6.m13016a(this.f22991a, bool);
        this.f22991a = bool;
    }

    @ly4
    /* renamed from: G */
    public final void mo27362G(@ts2 String str) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= !da6.m13016a(this.f23002d, str);
        this.f23002d = str;
    }

    @ly4
    /* renamed from: H */
    public final void mo27363H(@ts2 List list) {
        this.f22990a.mo15135d().mo15139h();
        if (!da6.m13016a(this.f22993a, list)) {
            this.f23003d = true;
            this.f22993a = list != null ? new ArrayList(list) : null;
        }
    }

    @ly4
    /* renamed from: I */
    public final void mo27364I(@ts2 String str) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= !da6.m13016a(this.f23013i, str);
        this.f23013i = str;
    }

    @ly4
    /* renamed from: J */
    public final void mo27365J(boolean z) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23000c != z;
        this.f23000c = z;
    }

    @ly4
    /* renamed from: K */
    public final void mo27366K(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23010h != j;
        this.f23010h = j;
    }

    @ly4
    /* renamed from: L */
    public final boolean mo27367L() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22997b;
    }

    @ly4
    /* renamed from: M */
    public final boolean mo27368M() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22994a;
    }

    @ly4
    /* renamed from: N */
    public final boolean mo27369N() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23003d;
    }

    @ly4
    /* renamed from: O */
    public final boolean mo27370O() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23000c;
    }

    @ly4
    /* renamed from: P */
    public final long mo27371P() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23001d;
    }

    @ly4
    /* renamed from: Q */
    public final long mo27372Q() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23020o;
    }

    @ly4
    /* renamed from: R */
    public final long mo27373R() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23017l;
    }

    @ly4
    /* renamed from: S */
    public final long mo27374S() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23018m;
    }

    @ly4
    /* renamed from: T */
    public final long mo27375T() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23016k;
    }

    @ly4
    /* renamed from: U */
    public final long mo27376U() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23014j;
    }

    @ly4
    /* renamed from: V */
    public final long mo27377V() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23019n;
    }

    @ly4
    /* renamed from: W */
    public final long mo27378W() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23012i;
    }

    @ly4
    /* renamed from: X */
    public final long mo27379X() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23006f;
    }

    @ly4
    /* renamed from: Y */
    public final long mo27380Y() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23008g;
    }

    @ly4
    /* renamed from: Z */
    public final long mo27381Z() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23021p;
    }

    @ts2
    @ly4
    /* renamed from: a */
    public final String mo27382a() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23015j;
    }

    @ly4
    /* renamed from: a0 */
    public final long mo27383a0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23004e;
    }

    @ts2
    @ly4
    /* renamed from: b */
    public final String mo27384b() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23002d;
    }

    @ly4
    /* renamed from: b0 */
    public final long mo27385b0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22998c;
    }

    @ts2
    @ly4
    /* renamed from: c */
    public final String mo27386c() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23013i;
    }

    @ly4
    /* renamed from: c0 */
    public final long mo27387c0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22989a;
    }

    @ts2
    @ly4
    /* renamed from: d */
    public final List mo27388d() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22993a;
    }

    @ly4
    /* renamed from: d0 */
    public final long mo27389d0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22995b;
    }

    @ly4
    /* renamed from: e */
    public final void mo27390e() {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d = false;
    }

    @ly4
    /* renamed from: e0 */
    public final long mo27391e0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23010h;
    }

    @ly4
    /* renamed from: f */
    public final void mo27392f() {
        this.f22990a.mo15135d().mo15139h();
        long j = this.f22989a + 1;
        if (j > 2147483647L) {
            this.f22990a.mo15136e().mo12731w().mo25380b("Bundle index overflow. appId", a56.m10802z(this.f22992a));
            j = 0;
        }
        this.f23003d = true;
        this.f22989a = j;
    }

    @ts2
    @ly4
    /* renamed from: f0 */
    public final Boolean mo27393f0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22991a;
    }

    @ly4
    /* renamed from: g */
    public final void mo27394g(@ts2 String str) {
        this.f22990a.mo15135d().mo15139h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f23003d |= true ^ da6.m13016a(this.f23011h, str);
        this.f23011h = str;
    }

    @ts2
    @ly4
    /* renamed from: g0 */
    public final String mo27395g0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23011h;
    }

    @ly4
    /* renamed from: h */
    public final void mo27396h(boolean z) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f22997b != z;
        this.f22997b = z;
    }

    @ts2
    @ly4
    /* renamed from: h0 */
    public final String mo27397h0() {
        this.f22990a.mo15135d().mo15139h();
        String str = this.f23015j;
        mo27421z((String) null);
        return str;
    }

    @ly4
    /* renamed from: i */
    public final void mo27398i(@ts2 String str) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= !da6.m13016a(this.f22996b, str);
        this.f22996b = str;
    }

    @ly4
    /* renamed from: i0 */
    public final String mo27399i0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22992a;
    }

    @ly4
    /* renamed from: j */
    public final void mo27400j(@ts2 String str) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= !da6.m13016a(this.f23009g, str);
        this.f23009g = str;
    }

    @ts2
    @ly4
    /* renamed from: j0 */
    public final String mo27401j0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22996b;
    }

    @ly4
    /* renamed from: k */
    public final void mo27402k(@ts2 String str) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= !da6.m13016a(this.f23007f, str);
        this.f23007f = str;
    }

    @ts2
    @ly4
    /* renamed from: k0 */
    public final String mo27403k0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23009g;
    }

    @ly4
    /* renamed from: l */
    public final void mo27404l(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23001d != j;
        this.f23001d = j;
    }

    @ts2
    @ly4
    /* renamed from: l0 */
    public final String mo27405l0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23007f;
    }

    @ly4
    /* renamed from: m */
    public final void mo27406m(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23020o != j;
        this.f23020o = j;
    }

    @ts2
    @ly4
    /* renamed from: m0 */
    public final String mo27407m0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f23005e;
    }

    @ly4
    /* renamed from: n */
    public final void mo27408n(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23017l != j;
        this.f23017l = j;
    }

    @ts2
    @ly4
    /* renamed from: n0 */
    public final String mo27409n0() {
        this.f22990a.mo15135d().mo15139h();
        return this.f22999c;
    }

    @ly4
    /* renamed from: o */
    public final void mo27410o(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23018m != j;
        this.f23018m = j;
    }

    @ly4
    /* renamed from: p */
    public final void mo27411p(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23016k != j;
        this.f23016k = j;
    }

    @ly4
    /* renamed from: q */
    public final void mo27412q(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23014j != j;
        this.f23014j = j;
    }

    @ly4
    /* renamed from: r */
    public final void mo27413r(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23019n != j;
        this.f23019n = j;
    }

    @ly4
    /* renamed from: s */
    public final void mo27414s(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23012i != j;
        this.f23012i = j;
    }

    @ly4
    /* renamed from: t */
    public final void mo27415t(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23006f != j;
        this.f23006f = j;
    }

    @ly4
    /* renamed from: u */
    public final void mo27416u(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23008g != j;
        this.f23008g = j;
    }

    @ly4
    /* renamed from: v */
    public final void mo27417v(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23021p != j;
        this.f23021p = j;
    }

    @ly4
    /* renamed from: w */
    public final void mo27418w(@ts2 String str) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= !da6.m13016a(this.f23005e, str);
        this.f23005e = str;
    }

    @ly4
    /* renamed from: x */
    public final void mo27419x(@ts2 String str) {
        this.f22990a.mo15135d().mo15139h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f23003d |= true ^ da6.m13016a(this.f22999c, str);
        this.f22999c = str;
    }

    @ly4
    /* renamed from: y */
    public final void mo27420y(long j) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= this.f23004e != j;
        this.f23004e = j;
    }

    @ly4
    /* renamed from: z */
    public final void mo27421z(@ts2 String str) {
        this.f22990a.mo15135d().mo15139h();
        this.f23003d |= !da6.m13016a(this.f23015j, str);
        this.f23015j = str;
    }
}
