package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class s86 extends mb2 {

    /* renamed from: a */
    public final /* synthetic */ b96 f20256a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s86(b96 b96, int i) {
        super(20);
        this.f20256a = b96;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20263a(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return b96.m11726s(this.f20256a, str);
    }
}
