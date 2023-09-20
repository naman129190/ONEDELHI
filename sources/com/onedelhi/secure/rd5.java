package com.onedelhi.secure;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

public final class rd5<T> implements fd5<T> {

    /* renamed from: a */
    public final int f19787a;

    /* renamed from: a */
    public final i47 f19788a;
    @GuardedBy("mLock")

    /* renamed from: a */
    public Exception f19789a;

    /* renamed from: a */
    public final Object f19790a = new Object();
    @GuardedBy("mLock")

    /* renamed from: a */
    public boolean f19791a;
    @GuardedBy("mLock")

    /* renamed from: b */
    public int f19792b;
    @GuardedBy("mLock")

    /* renamed from: c */
    public int f19793c;
    @GuardedBy("mLock")

    /* renamed from: d */
    public int f19794d;

    public rd5(int i, i47 i47) {
        this.f19787a = i;
        this.f19788a = i47;
    }

    /* renamed from: a */
    public final void mo7740a(T t) {
        synchronized (this.f19790a) {
            this.f19792b++;
            mo23820d();
        }
    }

    /* renamed from: b */
    public final void mo14940b() {
        synchronized (this.f19790a) {
            this.f19794d++;
            this.f19791a = true;
            mo23820d();
        }
    }

    /* renamed from: c */
    public final void mo7919c(@mr2 Exception exc) {
        synchronized (this.f19790a) {
            this.f19793c++;
            this.f19789a = exc;
            mo23820d();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: d */
    public final void mo23820d() {
        if (this.f19792b + this.f19793c + this.f19794d != this.f19787a) {
            return;
        }
        if (this.f19789a != null) {
            i47 i47 = this.f19788a;
            int i = this.f19793c;
            int i2 = this.f19787a;
            i47.mo17593y(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f19789a));
        } else if (this.f19791a) {
            this.f19788a.mo17562A();
        } else {
            this.f19788a.mo17594z((Object) null);
        }
    }
}
