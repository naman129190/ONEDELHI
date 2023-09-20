package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.onedelhi.secure.j1 */
public final /* synthetic */ class C5759j1 {
    /* renamed from: a */
    public static /* synthetic */ boolean m52871a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
