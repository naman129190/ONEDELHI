package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

public final class ja5 extends ix5 {

    /* renamed from: a */
    public final ri6 f14045a;

    /* renamed from: a */
    public final za6 f14046a;

    public ja5(@mr2 za6 za6) {
        super((ds5) null);
        Preconditions.checkNotNull(za6);
        this.f14046a = za6;
        this.f14045a = za6.mo27866I();
    }

    /* renamed from: A */
    public final String mo18185A() {
        return this.f14045a.mo23898X();
    }

    /* renamed from: D */
    public final String mo18186D() {
        return this.f14045a.mo23896V();
    }

    /* renamed from: a */
    public final long mo18187a() {
        return this.f14046a.mo27871N().mo16891t0();
    }

    /* renamed from: b */
    public final String mo18188b() {
        return this.f14045a.mo23897W();
    }

    /* renamed from: c */
    public final void mo18189c(String str, String str2, Bundle bundle) {
        this.f14046a.mo27866I().mo23904o(str, str2, bundle);
    }

    /* renamed from: d */
    public final void mo18190d(ue6 ue6) {
        this.f14045a.mo23882H(ue6);
    }

    /* renamed from: e */
    public final void mo18191e(xe6 xe6) {
        this.f14045a.mo23888N(xe6);
    }

    /* renamed from: f */
    public final void mo18192f(String str) {
        this.f14046a.mo27890y().mo18713m(str, this.f14046a.mo15133a().elapsedRealtime());
    }

    /* renamed from: g */
    public final String mo18193g() {
        return this.f14045a.mo23896V();
    }

    /* renamed from: h */
    public final void mo18194h(xe6 xe6) {
        this.f14045a.mo23913x(xe6);
    }

    /* renamed from: i */
    public final void mo18195i(String str, String str2, Bundle bundle, long j) {
        this.f14045a.mo23908s(str, str2, bundle, true, false, j);
    }

    /* renamed from: j */
    public final int mo18196j(String str) {
        this.f14045a.mo23891Q(str);
        return 25;
    }

    /* renamed from: k */
    public final void mo18197k(String str) {
        this.f14046a.mo27890y().mo18712l(str, this.f14046a.mo15133a().elapsedRealtime());
    }

    /* renamed from: l */
    public final Object mo18198l(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? this.f14045a.mo23892R() : this.f14045a.mo23894T() : this.f14045a.mo23893S() : this.f14045a.mo23895U() : this.f14045a.mo23899Y();
    }

    /* renamed from: m */
    public final void mo18199m(String str, String str2, Bundle bundle) {
        this.f14045a.mo23907r(str, str2, bundle);
    }

    /* renamed from: n */
    public final void mo18200n(Bundle bundle) {
        this.f14045a.mo23878D(bundle);
    }

    /* renamed from: o */
    public final List mo18201o(String str, String str2) {
        return this.f14045a.mo23900Z(str, str2);
    }

    /* renamed from: p */
    public final Map mo18202p(String str, String str2, boolean z) {
        return this.f14045a.mo23902b0(str, str2, z);
    }

    /* renamed from: q */
    public final Boolean mo17989q() {
        return this.f14045a.mo23892R();
    }

    /* renamed from: r */
    public final Double mo17990r() {
        return this.f14045a.mo23893S();
    }

    /* renamed from: s */
    public final Integer mo17991s() {
        return this.f14045a.mo23894T();
    }

    /* renamed from: t */
    public final Long mo17992t() {
        return this.f14045a.mo23895U();
    }

    /* renamed from: u */
    public final String mo17993u() {
        return this.f14045a.mo23899Y();
    }

    /* renamed from: v */
    public final Map mo17994v(boolean z) {
        List<wq6> a0 = this.f14045a.mo23901a0(z);
        C3042oa oaVar = new C3042oa(a0.size());
        for (wq6 wq6 : a0) {
            Object K2 = wq6.mo26660K2();
            if (K2 != null) {
                oaVar.put(wq6.f22256b, K2);
            }
        }
        return oaVar;
    }
}
