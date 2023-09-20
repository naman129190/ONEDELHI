package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/xb2;", "Lcom/onedelhi/secure/e90;", "", "toString", "", "parallelism", "V0", "f1", "c1", "()Lcom/onedelhi/secure/xb2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class xb2 extends e90 {
    @vr2
    /* renamed from: V0 */
    public e90 mo34864V0(int i) {
        g32.m49063a(i);
        return this;
    }

    @vr2
    /* renamed from: c1 */
    public abstract xb2 mo31905c1();

    @zs1
    @ss2
    /* renamed from: f1 */
    public final String mo47121f1() {
        xb2 xb2;
        xb2 e = wm0.m69462e();
        if (this == e) {
            return "Dispatchers.Main";
        }
        try {
            xb2 = e.mo31905c1();
        } catch (UnsupportedOperationException unused) {
            xb2 = null;
        }
        if (this == xb2) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @vr2
    public String toString() {
        String f1 = mo47121f1();
        if (f1 != null) {
            return f1;
        }
        return if0.m52224a(this) + '@' + if0.m52225b(this);
    }
}
