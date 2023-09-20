package com.onedelhi.secure;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0019\u0010\u0004\u001a\u00020\u0001*\u00020\u00008À\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/u94;", "", "a", "(Lcom/onedelhi/secure/u94;)Z", "isBlocking", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class ia4 {
    @rw1

    /* renamed from: a */
    public static final int f30235a = i94.m51958d("kotlinx.coroutines.scheduler.core.pool.size", df3.m45198n(g94.m49182a(), 2), 1, 0, 8, (Object) null);
    @rw1

    /* renamed from: a */
    public static final long f30236a = i94.m51959e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);
    @rw1
    @vr2

    /* renamed from: a */
    public static sr3 f30237a = fn2.f28609a;
    @rw1
    @vr2

    /* renamed from: a */
    public static final y94 f30238a = new z94(0);
    @vr2

    /* renamed from: a */
    public static final String f30239a = "DefaultDispatcher";
    @rw1

    /* renamed from: b */
    public static final int f30240b = i94.m51958d("kotlinx.coroutines.scheduler.max.pool.size", k90.f31145v, 0, k90.f31145v, 4, (Object) null);
    @rw1

    /* renamed from: b */
    public static final long f30241b = TimeUnit.SECONDS.toNanos(i94.m51959e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));
    @rw1
    @vr2

    /* renamed from: b */
    public static final y94 f30242b = new z94(1);

    /* renamed from: c */
    public static final int f30243c = 0;

    /* renamed from: d */
    public static final int f30244d = 1;

    /* renamed from: a */
    public static final boolean m51977a(@vr2 u94 u94) {
        return u94.f36015a.mo37167q0() == 1;
    }
}
