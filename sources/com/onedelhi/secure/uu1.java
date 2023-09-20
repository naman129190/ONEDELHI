package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0003R\u0014\u0010\u000b\u001a\u00020\u00038PX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u00038\u0010X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/uu1;", "Lcom/onedelhi/secure/bv1;", "Lcom/onedelhi/secure/j20;", "", "C0", "", "exception", "g", "F1", "Q0", "()Z", "onCancelComplete", "handlesException", "Z", "P0", "Lcom/onedelhi/secure/ru1;", "parent", "<init>", "(Lcom/onedelhi/secure/ru1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class uu1 extends bv1 implements j20 {

    /* renamed from: b */
    public final boolean f36291b = mo45796F1();

    public uu1(@ss2 ru1 ru1) {
        super(true);
        mo32095W0(ru1);
    }

    /* renamed from: C0 */
    public boolean mo38382C0() {
        return mo32110e1(un4.f36206a);
    }

    /* renamed from: F1 */
    public final boolean mo45796F1() {
        bv1 b1;
        C6904tx S0 = mo32091S0();
        C6984ux uxVar = S0 instanceof C6984ux ? (C6984ux) S0 : null;
        bv1 b12 = uxVar == null ? null : uxVar.mo31212b1();
        if (b12 == null) {
            return false;
        }
        while (!b12.mo32088P0()) {
            C6904tx S02 = b12.mo32091S0();
            C6984ux uxVar2 = S02 instanceof C6984ux ? (C6984ux) S02 : null;
            if (uxVar2 == null) {
                b1 = null;
                continue;
            } else {
                b1 = uxVar2.mo31212b1();
                continue;
            }
            if (b12 == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P0 */
    public boolean mo32088P0() {
        return this.f36291b;
    }

    /* renamed from: Q0 */
    public boolean mo32089Q0() {
        return true;
    }

    /* renamed from: g */
    public boolean mo38383g(@vr2 Throwable th) {
        return mo32110e1(new m20(th, false, 2, (wg0) null));
    }
}
