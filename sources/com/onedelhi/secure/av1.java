package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/av1;", "Lcom/onedelhi/secure/o20;", "Lcom/onedelhi/secure/fn0;", "Lcom/onedelhi/secure/qp1;", "Lcom/onedelhi/secure/un4;", "e", "", "toString", "Lcom/onedelhi/secure/bv1;", "job", "Lcom/onedelhi/secure/bv1;", "b1", "()Lcom/onedelhi/secure/bv1;", "c1", "(Lcom/onedelhi/secure/bv1;)V", "", "b", "()Z", "isActive", "Lcom/onedelhi/secure/hr2;", "j0", "()Lcom/onedelhi/secure/hr2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class av1 extends o20 implements fn0, qp1 {

    /* renamed from: a */
    public bv1 f26006a;

    /* renamed from: b */
    public boolean mo31211b() {
        return true;
    }

    @vr2
    /* renamed from: b1 */
    public final bv1 mo31212b1() {
        bv1 bv1 = this.f26006a;
        if (bv1 != null) {
            return bv1;
        }
        jt1.m53761S("job");
        return null;
    }

    /* renamed from: c1 */
    public final void mo31213c1(@vr2 bv1 bv1) {
        this.f26006a = bv1;
    }

    /* renamed from: e */
    public void mo30964e() {
        mo31212b1().mo32137s1(this);
    }

    @ss2
    /* renamed from: j0 */
    public hr2 mo31214j0() {
        return null;
    }

    @vr2
    public String toString() {
        return if0.m52224a(this) + '@' + if0.m52225b(this) + "[job@" + if0.m52225b(mo31212b1()) + ']';
    }
}
