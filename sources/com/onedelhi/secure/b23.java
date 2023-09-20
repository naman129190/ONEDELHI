package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.CheckPhonePeAvailabilityCallback;
import com.phonepe.intent.sdk.api.PhonePe;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class b23 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CheckPhonePeAvailabilityCallback f26111a;

    /* renamed from: a */
    public final /* synthetic */ Long f26112a;

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f26113a;

    /* renamed from: b */
    public final /* synthetic */ long f26114b;

    public /* synthetic */ b23(AtomicBoolean atomicBoolean, long j, Long l, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) {
        this.f26113a = atomicBoolean;
        this.f26114b = j;
        this.f26112a = l;
        this.f26111a = checkPhonePeAvailabilityCallback;
    }

    public final void run() {
        PhonePe.irjuc(this.f26113a, this.f26114b, this.f26112a, this.f26111a);
    }
}
