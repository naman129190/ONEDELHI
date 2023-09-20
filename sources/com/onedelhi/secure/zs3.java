package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002R\u001a\u0010\n\u001a\u00020\t8\u0006XD¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/zs3;", "", "Lcom/onedelhi/secure/ws3;", "e", "segment", "Lcom/onedelhi/secure/un4;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "", "MAX_SIZE", "I", "c", "()I", "b", "byteCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
public final class zs3 {

    /* renamed from: a */
    public static final int f38416a = 65536;

    /* renamed from: a */
    public static final ws3 f38417a = new ws3(new byte[0], 0, 0, false, false);

    /* renamed from: a */
    public static final zs3 f38418a = new zs3();

    /* renamed from: a */
    public static final AtomicReference<ws3>[] f38419a;

    /* renamed from: b */
    public static final int f38420b;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f38420b = highestOneBit;
        AtomicReference<ws3>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f38419a = atomicReferenceArr;
    }

    @zw1
    /* renamed from: d */
    public static final void m74279d(@vr2 ws3 ws3) {
        AtomicReference<ws3> a;
        ws3 ws32;
        jt1.m53777p(ws3, "segment");
        if (!(ws3.f37109a == null && ws3.f37113b == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!ws3.f37110a && (ws32 = a.get()) != f38417a) {
            int i = ws32 != null ? ws32.f37112b : 0;
            if (i < f38416a) {
                ws3.f37109a = ws32;
                ws3.f37108a = 0;
                ws3.f37112b = i + 8192;
                if (!(a = f38418a.mo48436a()).compareAndSet(ws32, ws3)) {
                    ws3.f37109a = null;
                }
            }
        }
    }

    @zw1
    @vr2
    /* renamed from: e */
    public static final ws3 m74280e() {
        AtomicReference<ws3> a = f38418a.mo48436a();
        ws3 ws3 = f38417a;
        ws3 andSet = a.getAndSet(ws3);
        if (andSet == ws3) {
            return new ws3();
        }
        if (andSet == null) {
            a.set((Object) null);
            return new ws3();
        }
        a.set(andSet.f37109a);
        andSet.f37109a = null;
        andSet.f37112b = 0;
        return andSet;
    }

    /* renamed from: a */
    public final AtomicReference<ws3> mo48436a() {
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        return f38419a[(int) (currentThread.getId() & (((long) f38420b) - 1))];
    }

    /* renamed from: b */
    public final int mo48437b() {
        ws3 ws3 = mo48436a().get();
        if (ws3 != null) {
            return ws3.f37112b;
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo48438c() {
        return f38416a;
    }
}
