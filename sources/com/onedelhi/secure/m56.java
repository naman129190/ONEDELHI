package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

@ly4
public final class m56 implements Runnable {

    /* renamed from: a */
    public final g56 f15904a;

    /* renamed from: a */
    public final Throwable f15905a;

    /* renamed from: a */
    public final Map f15906a;

    /* renamed from: a */
    public final byte[] f15907a;

    /* renamed from: b */
    public final String f15908b;

    /* renamed from: n */
    public final int f15909n;

    public /* synthetic */ m56(String str, g56 g56, int i, Throwable th, byte[] bArr, Map map, j56 j56) {
        Preconditions.checkNotNull(g56);
        this.f15904a = g56;
        this.f15909n = i;
        this.f15905a = th;
        this.f15907a = bArr;
        this.f15908b = str;
        this.f15906a = map;
    }

    public final void run() {
        this.f15904a.mo16137a(this.f15908b, this.f15909n, this.f15905a, this.f15907a, this.f15906a);
    }
}
