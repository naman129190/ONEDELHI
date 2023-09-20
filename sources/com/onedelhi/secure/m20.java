package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/m20;", "", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "a", "handled", "", "cause", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class m20 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31974a = AtomicIntegerFieldUpdater.newUpdater(m20.class, "_handled");
    @vr2
    private volatile /* synthetic */ int _handled;
    @rw1
    @vr2

    /* renamed from: a */
    public final Throwable f31975a;

    public m20(@vr2 Throwable th, boolean z) {
        this.f31975a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m20(Throwable th, boolean z, int i, wg0 wg0) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo40422a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo40423b() {
        return f31974a.compareAndSet(this, 0, 1);
    }

    @vr2
    public String toString() {
        return if0.m52224a(this) + '[' + this.f31975a + ']';
    }
}
