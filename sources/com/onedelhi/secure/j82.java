package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\fJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0014J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/j82;", "Lcom/onedelhi/secure/l82;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlin/Function1;", "Lcom/onedelhi/secure/un4;", "block", "a1", "", "c1", "S0", "d1", "()V", "", "b1", "()Z", "isEmpty", "Q0", "isRemoved", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class j82 extends l82 {
    /* renamed from: Q0 */
    public boolean mo38447Q0() {
        return false;
    }

    @ss2
    /* renamed from: S0 */
    public l82 mo38448S0() {
        return null;
    }

    /* renamed from: T0 */
    public /* bridge */ /* synthetic */ boolean mo38449T0() {
        return ((Boolean) mo38452c1()).booleanValue();
    }

    /* renamed from: a1 */
    public final /* synthetic */ <T extends l82> void mo38450a1(ec1<? super T, un4> ec1) {
        for (l82 l82 = (l82) mo39690L0(); !jt1.m53768g(l82, this); l82 = l82.mo39691M0()) {
            jt1.m53786y(3, mx0.f16794s2);
            if (l82 instanceof l82) {
                ec1.mo17094X(l82);
            }
        }
    }

    /* renamed from: b1 */
    public final boolean mo38451b1() {
        return mo39690L0() == this;
    }

    @vr2
    /* renamed from: c1 */
    public final Void mo38452c1() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    /* renamed from: d1 */
    public final void mo38453d1() {
        l82 l82 = (l82) mo39690L0();
        j82 j82 = this;
        while (!jt1.m53768g(l82, this)) {
            l82 M0 = l82.mo39691M0();
            l82.mo39701Z0(j82, M0);
            j82 = l82;
            l82 = M0;
        }
        mo39701Z0(j82, (l82) mo39690L0());
    }
}
