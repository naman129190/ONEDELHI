package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "Lcom/onedelhi/secure/un4;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class g32 {
    /* renamed from: a */
    public static final void m49063a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(jt1.m53745C("Expected positive parallelism level, but got ", Integer.valueOf(i)).toString());
        }
    }
}
