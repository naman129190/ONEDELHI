package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/fc4;", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/iy2;", "name", "cause", "Lcom/onedelhi/secure/un4;", "Lkotlinx/coroutines/CompletionHandler;", "d", "()V", "a", "c", "(Ljava/lang/Throwable;)V", "", "state", "", "b", "(I)Ljava/lang/Void;", "Lcom/onedelhi/secure/ru1;", "job", "<init>", "(Lcom/onedelhi/secure/ru1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class fc4 implements ec1<Throwable, un4> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28258a = AtomicIntegerFieldUpdater.newUpdater(fc4.class, "_state");
    @vr2
    private volatile /* synthetic */ int _state = 0;
    @ss2

    /* renamed from: a */
    public fn0 f28259a;
    @vr2

    /* renamed from: a */
    public final ru1 f28260a;

    /* renamed from: a */
    public final Thread f28261a = Thread.currentThread();

    public fc4(@vr2 ru1 ru1) {
        this.f28260a = ru1;
    }

    /* renamed from: X */
    public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
        mo35846c((Throwable) obj);
        return un4.f36206a;
    }

    /* renamed from: a */
    public final void mo35844a() {
        while (true) {
            int i = this._state;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        mo35845b(i);
                        throw new b02();
                    }
                }
            } else if (f28258a.compareAndSet(this, i, 1)) {
                fn0 fn0 = this.f28259a;
                if (fn0 != null) {
                    fn0.mo30964e();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: b */
    public final Void mo35845b(int i) {
        throw new IllegalStateException(jt1.m53745C("Illegal state ", Integer.valueOf(i)).toString());
    }

    /* renamed from: c */
    public void mo35846c(@ss2 Throwable th) {
        int i;
        do {
            i = this._state;
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    mo35845b(i);
                    throw new b02();
                }
                return;
            }
        } while (!f28258a.compareAndSet(this, i, 2));
        this.f28261a.interrupt();
        this._state = 3;
    }

    /* renamed from: d */
    public final void mo35847d() {
        int i;
        this.f28259a = this.f28260a.mo32119j0(true, true, this);
        do {
            i = this._state;
            if (i != 0) {
                if (i != 2 && i != 3) {
                    mo35845b(i);
                    throw new b02();
                }
                return;
            }
        } while (!f28258a.compareAndSet(this, i, 0));
    }
}
