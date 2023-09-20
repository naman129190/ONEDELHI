package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/on4;", "T", "Lcom/onedelhi/secure/js3;", "Lcom/onedelhi/secure/b90;", "context", "", "oldValue", "Lcom/onedelhi/secure/un4;", "M1", "", "L1", "state", "F1", "Lcom/onedelhi/secure/b80;", "uCont", "<init>", "(Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/b80;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class on4<T> extends js3<T> {
    @vr2

    /* renamed from: a */
    public ThreadLocal<ey2<b90, Object>> f33147a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public on4(@com.onedelhi.secure.vr2 com.onedelhi.secure.b90 r3, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super T> r4) {
        /*
            r2 = this;
            com.onedelhi.secure.qn4 r0 = com.onedelhi.secure.qn4.f34316a
            com.onedelhi.secure.b90$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000c
            com.onedelhi.secure.b90 r3 = r3.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f33147a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.on4.<init>(com.onedelhi.secure.b90, com.onedelhi.secure.b80):void");
    }

    /* renamed from: F1 */
    public void mo38840F1(@ss2 Object obj) {
        ey2 ey2 = this.f33147a.get();
        on4<?> on4 = null;
        if (ey2 != null) {
            ub4.m66923a((b90) ey2.mo35665a(), ey2.mo35666b());
            this.f33147a.set(on4);
        }
        Object a = s20.m64133a(obj, this.f30926a);
        b80<T> b80 = this.f30926a;
        b90 f = b80.mo31187f();
        Object c = ub4.m66925c(f, on4);
        if (c != ub4.f36021a) {
            on4 = d90.m44811g(b80, f, c);
        }
        try {
            this.f30926a.mo31191m0(a);
            un4 un4 = un4.f36206a;
        } finally {
            if (on4 == null || on4.mo41920L1()) {
                ub4.m66923a(f, c);
            }
        }
    }

    /* renamed from: L1 */
    public final boolean mo41920L1() {
        if (this.f33147a.get() == null) {
            return false;
        }
        this.f33147a.set((Object) null);
        return true;
    }

    /* renamed from: M1 */
    public final void mo41921M1(@vr2 b90 b90, @ss2 Object obj) {
        this.f33147a.set(yi4.m71797a(b90, obj));
    }
}
