package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8@X\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lcom/onedelhi/secure/iy4;", "", "Lcom/onedelhi/secure/u94;", "h", "()Lcom/onedelhi/secure/u94;", "task", "", "fair", "a", "(Lcom/onedelhi/secure/u94;Z)Lcom/onedelhi/secure/u94;", "victim", "", "l", "(Lcom/onedelhi/secure/iy4;)J", "k", "Lcom/onedelhi/secure/kh1;", "globalQueue", "Lcom/onedelhi/secure/un4;", "g", "(Lcom/onedelhi/secure/kh1;)V", "c", "(Lcom/onedelhi/secure/u94;)Lcom/onedelhi/secure/u94;", "blockingOnly", "m", "(Lcom/onedelhi/secure/iy4;Z)J", "queue", "j", "(Lcom/onedelhi/secure/kh1;)Z", "i", "d", "(Lcom/onedelhi/secure/u94;)V", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class iy4 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30501a;

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30502a;

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30503b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30504c;
    @vr2

    /* renamed from: a */
    public final AtomicReferenceArray<u94> f30505a = new AtomicReferenceArray<>(128);
    @vr2
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    @vr2
    private volatile /* synthetic */ int consumerIndex = 0;
    @vr2
    private volatile /* synthetic */ Object lastScheduledTask = null;
    @vr2
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<iy4> cls = iy4.class;
        f30502a = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f30501a = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f30503b = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f30504c = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ u94 m52742b(iy4 iy4, u94 u94, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return iy4.mo38277a(u94, z);
    }

    @ss2
    /* renamed from: a */
    public final u94 mo38277a(@vr2 u94 u94, boolean z) {
        if (z) {
            return mo38278c(u94);
        }
        u94 u942 = (u94) f30502a.getAndSet(this, u94);
        if (u942 == null) {
            return null;
        }
        return mo38278c(u942);
    }

    /* renamed from: c */
    public final u94 mo38278c(u94 u94) {
        boolean z = true;
        if (u94.f36015a.mo37167q0() != 1) {
            z = false;
        }
        if (z) {
            f30504c.incrementAndGet(this);
        }
        if (mo38280e() == 127) {
            return u94;
        }
        int i = this.producerIndex & 127;
        while (this.f30505a.get(i) != null) {
            Thread.yield();
        }
        this.f30505a.lazySet(i, u94);
        f30501a.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    public final void mo38279d(u94 u94) {
        if (u94 != null) {
            boolean z = true;
            if (u94.f36015a.mo37167q0() != 1) {
                z = false;
            }
            if (z) {
                f30504c.decrementAndGet(this);
            }
        }
    }

    /* renamed from: e */
    public final int mo38280e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo38281f() {
        return this.lastScheduledTask != null ? mo38280e() + 1 : mo38280e();
    }

    /* renamed from: g */
    public final void mo38282g(@vr2 kh1 kh1) {
        u94 u94 = (u94) f30502a.getAndSet(this, (Object) null);
        if (u94 != null) {
            kh1.mo41001a(u94);
        }
        do {
        } while (mo38285j(kh1));
    }

    @ss2
    /* renamed from: h */
    public final u94 mo38283h() {
        u94 u94 = (u94) f30502a.getAndSet(this, (Object) null);
        return u94 == null ? mo38284i() : u94;
    }

    /* renamed from: i */
    public final u94 mo38284i() {
        u94 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f30503b.compareAndSet(this, i, i + 1) && (andSet = this.f30505a.getAndSet(i2, (Object) null)) != null) {
                mo38279d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo38285j(kh1 kh1) {
        u94 i = mo38284i();
        if (i == null) {
            return false;
        }
        kh1.mo41001a(i);
        return true;
    }

    /* renamed from: k */
    public final long mo38286k(@vr2 iy4 iy4) {
        int i = iy4.consumerIndex;
        int i2 = iy4.producerIndex;
        AtomicReferenceArray<u94> atomicReferenceArray = iy4.f30505a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (iy4.blockingTasksInBuffer == 0) {
                break;
            }
            u94 u94 = atomicReferenceArray.get(i3);
            if (u94 != null) {
                if (u94.f36015a.mo37167q0() != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i3, u94, (Object) null)) {
                    f30504c.decrementAndGet(iy4);
                    m52742b(this, u94, false, 2, (Object) null);
                    return -1;
                }
            }
            i++;
        }
        return mo38288m(iy4, true);
    }

    /* renamed from: l */
    public final long mo38287l(@vr2 iy4 iy4) {
        u94 i = iy4.mo38284i();
        if (i == null) {
            return mo38288m(iy4, false);
        }
        m52742b(this, i, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: m */
    public final long mo38288m(iy4 iy4, boolean z) {
        u94 u94;
        do {
            u94 = (u94) iy4.lastScheduledTask;
            if (u94 == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (u94.f36015a.mo37167q0() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = ia4.f30237a.mo36152a() - u94.f36016b;
            long j = ia4.f30236a;
            if (a < j) {
                return j - a;
            }
        } while (!C5759j1.m52871a(f30502a, iy4, u94, (Object) null));
        m52742b(this, u94, false, 2, (Object) null);
        return -1;
    }
}
