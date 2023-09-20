package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/yt3;", "", "", "a", "()J", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class yt3 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicLongFieldUpdater f38054a = AtomicLongFieldUpdater.newUpdater(yt3.class, "number");
    @vr2
    private volatile /* synthetic */ long number = 1;

    /* renamed from: a */
    public final long mo47937a() {
        return f38054a.incrementAndGet(this);
    }
}
