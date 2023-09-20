package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class kq6 {

    /* renamed from: a */
    public long f15045a;

    /* renamed from: a */
    public final /* synthetic */ qq6 f15046a;

    /* renamed from: a */
    public ya6 f15047a;

    /* renamed from: a */
    public List f15048a;

    /* renamed from: b */
    public List f15049b;

    public /* synthetic */ kq6(qq6 qq6, iq6 iq6) {
        this.f15046a = qq6;
    }

    /* renamed from: b */
    public static final long m19994b(x86 x86) {
        return ((x86.mo26817E() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo19176a(long j, x86 x86) {
        Preconditions.checkNotNull(x86);
        if (this.f15049b == null) {
            this.f15049b = new ArrayList();
        }
        if (this.f15048a == null) {
            this.f15048a = new ArrayList();
        }
        if (!this.f15049b.isEmpty() && m19994b((x86) this.f15049b.get(0)) != m19994b(x86)) {
            return false;
        }
        long b = this.f15045a + ((long) x86.mo18536b());
        this.f15046a.mo23368U();
        if (b >= ((long) Math.max(0, ((Integer) n36.f17061i.mo18887a((Object) null)).intValue()))) {
            return false;
        }
        this.f15045a = b;
        this.f15049b.add(x86);
        this.f15048a.add(Long.valueOf(j));
        int size = this.f15049b.size();
        this.f15046a.mo23368U();
        return size < Math.max(1, ((Integer) n36.f17063j.mo18887a((Object) null)).intValue());
    }
}
