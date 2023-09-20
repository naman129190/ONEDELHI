package com.onedelhi.secure;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class i47<TResult> extends w94<TResult> {

    /* renamed from: a */
    public final n07 f13485a = new n07();
    @GuardedBy("mLock")

    /* renamed from: a */
    public Exception f13486a;

    /* renamed from: a */
    public final Object f13487a = new Object();
    @GuardedBy("mLock")

    /* renamed from: a */
    public boolean f13488a;
    @GuardedBy("mLock")
    @ts2

    /* renamed from: b */
    public Object f13489b;

    /* renamed from: b */
    public volatile boolean f13490b;

    /* renamed from: A */
    public final boolean mo17562A() {
        synchronized (this.f13487a) {
            if (this.f13488a) {
                return false;
            }
            this.f13488a = true;
            this.f13490b = true;
            this.f13485a.mo20835b(this);
            return true;
        }
    }

    /* renamed from: B */
    public final boolean mo17563B(@mr2 Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f13487a) {
            if (this.f13488a) {
                return false;
            }
            this.f13488a = true;
            this.f13486a = exc;
            this.f13485a.mo20835b(this);
            return true;
        }
    }

    /* renamed from: C */
    public final boolean mo17564C(@ts2 Object obj) {
        synchronized (this.f13487a) {
            if (this.f13488a) {
                return false;
            }
            this.f13488a = true;
            this.f13489b = obj;
            this.f13485a.mo20835b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: D */
    public final void mo17565D() {
        Preconditions.checkState(this.f13488a, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: E */
    public final void mo17566E() {
        if (this.f13490b) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    /* renamed from: F */
    public final void mo17567F() {
        if (this.f13488a) {
            throw dq0.m13267a(this);
        }
    }

    /* renamed from: G */
    public final void mo17568G() {
        synchronized (this.f13487a) {
            if (this.f13488a) {
                this.f13485a.mo20835b(this);
            }
        }
    }

    @mr2
    /* renamed from: a */
    public final w94<TResult> mo17569a(@mr2 Activity activity, @mr2 mu2 mu2) {
        ae6 ae6 = new ae6(ba4.f9784a, mu2);
        this.f13485a.mo20834a(ae6);
        s37.m27241a(activity).mo24190b(ae6);
        mo17568G();
        return this;
    }

    @mr2
    /* renamed from: b */
    public final w94<TResult> mo17570b(@mr2 mu2 mu2) {
        mo17571c(ba4.f9784a, mu2);
        return this;
    }

    @mr2
    /* renamed from: c */
    public final w94<TResult> mo17571c(@mr2 Executor executor, @mr2 mu2 mu2) {
        this.f13485a.mo20834a(new ae6(executor, mu2));
        mo17568G();
        return this;
    }

    @mr2
    /* renamed from: d */
    public final w94<TResult> mo17572d(@mr2 Activity activity, @mr2 nu2<TResult> nu2) {
        jk6 jk6 = new jk6(ba4.f9784a, nu2);
        this.f13485a.mo20834a(jk6);
        s37.m27241a(activity).mo24190b(jk6);
        mo17568G();
        return this;
    }

    @mr2
    /* renamed from: e */
    public final w94<TResult> mo17573e(@mr2 nu2<TResult> nu2) {
        this.f13485a.mo20834a(new jk6(ba4.f9784a, nu2));
        mo17568G();
        return this;
    }

    @mr2
    /* renamed from: f */
    public final w94<TResult> mo17574f(@mr2 Executor executor, @mr2 nu2<TResult> nu2) {
        this.f13485a.mo20834a(new jk6(executor, nu2));
        mo17568G();
        return this;
    }

    @mr2
    /* renamed from: g */
    public final w94<TResult> mo17575g(@mr2 Activity activity, @mr2 vu2 vu2) {
        vp6 vp6 = new vp6(ba4.f9784a, vu2);
        this.f13485a.mo20834a(vp6);
        s37.m27241a(activity).mo24190b(vp6);
        mo17568G();
        return this;
    }

    @mr2
    /* renamed from: h */
    public final w94<TResult> mo17576h(@mr2 vu2 vu2) {
        mo17577i(ba4.f9784a, vu2);
        return this;
    }

    @mr2
    /* renamed from: i */
    public final w94<TResult> mo17577i(@mr2 Executor executor, @mr2 vu2 vu2) {
        this.f13485a.mo20834a(new vp6(executor, vu2));
        mo17568G();
        return this;
    }

    @mr2
    /* renamed from: j */
    public final w94<TResult> mo17578j(@mr2 Activity activity, @mr2 gv2<? super TResult> gv2) {
        ut6 ut6 = new ut6(ba4.f9784a, gv2);
        this.f13485a.mo20834a(ut6);
        s37.m27241a(activity).mo24190b(ut6);
        mo17568G();
        return this;
    }

    @mr2
    /* renamed from: k */
    public final w94<TResult> mo17579k(@mr2 gv2<? super TResult> gv2) {
        mo17580l(ba4.f9784a, gv2);
        return this;
    }

    @mr2
    /* renamed from: l */
    public final w94<TResult> mo17580l(@mr2 Executor executor, @mr2 gv2<? super TResult> gv2) {
        this.f13485a.mo20834a(new ut6(executor, gv2));
        mo17568G();
        return this;
    }

    @mr2
    /* renamed from: m */
    public final <TContinuationResult> w94<TContinuationResult> mo17581m(@mr2 c80<TResult, TContinuationResult> c80) {
        return mo17582n(ba4.f9784a, c80);
    }

    @mr2
    /* renamed from: n */
    public final <TContinuationResult> w94<TContinuationResult> mo17582n(@mr2 Executor executor, @mr2 c80<TResult, TContinuationResult> c80) {
        i47 i47 = new i47();
        this.f13485a.mo20834a(new lx5(executor, c80, i47));
        mo17568G();
        return i47;
    }

    @mr2
    /* renamed from: o */
    public final <TContinuationResult> w94<TContinuationResult> mo17583o(@mr2 c80<TResult, w94<TContinuationResult>> c80) {
        return mo17584p(ba4.f9784a, c80);
    }

    @mr2
    /* renamed from: p */
    public final <TContinuationResult> w94<TContinuationResult> mo17584p(@mr2 Executor executor, @mr2 c80<TResult, w94<TContinuationResult>> c80) {
        i47 i47 = new i47();
        this.f13485a.mo20834a(new g66(executor, c80, i47));
        mo17568G();
        return i47;
    }

    @ts2
    /* renamed from: q */
    public final Exception mo17585q() {
        Exception exc;
        synchronized (this.f13487a) {
            exc = this.f13486a;
        }
        return exc;
    }

    /* renamed from: r */
    public final TResult mo17586r() {
        TResult tresult;
        synchronized (this.f13487a) {
            mo17565D();
            mo17566E();
            Exception exc = this.f13486a;
            if (exc == null) {
                tresult = this.f13489b;
            } else {
                throw new po3(exc);
            }
        }
        return tresult;
    }

    /* renamed from: s */
    public final <X extends Throwable> TResult mo17587s(@mr2 Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f13487a) {
            mo17565D();
            mo17566E();
            if (!cls.isInstance(this.f13486a)) {
                Exception exc = this.f13486a;
                if (exc == null) {
                    tresult = this.f13489b;
                } else {
                    throw new po3(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f13486a));
            }
        }
        return tresult;
    }

    /* renamed from: t */
    public final boolean mo17588t() {
        return this.f13490b;
    }

    /* renamed from: u */
    public final boolean mo17589u() {
        boolean z;
        synchronized (this.f13487a) {
            z = this.f13488a;
        }
        return z;
    }

    /* renamed from: v */
    public final boolean mo17590v() {
        boolean z;
        synchronized (this.f13487a) {
            z = false;
            if (this.f13488a && !this.f13490b && this.f13486a == null) {
                z = true;
            }
        }
        return z;
    }

    @mr2
    /* renamed from: w */
    public final <TContinuationResult> w94<TContinuationResult> mo17591w(@mr2 r64<TResult, TContinuationResult> r64) {
        Executor executor = ba4.f9784a;
        i47 i47 = new i47();
        this.f13485a.mo20834a(new dx6(executor, r64, i47));
        mo17568G();
        return i47;
    }

    @mr2
    /* renamed from: x */
    public final <TContinuationResult> w94<TContinuationResult> mo17592x(Executor executor, r64<TResult, TContinuationResult> r64) {
        i47 i47 = new i47();
        this.f13485a.mo20834a(new dx6(executor, r64, i47));
        mo17568G();
        return i47;
    }

    /* renamed from: y */
    public final void mo17593y(@mr2 Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f13487a) {
            mo17567F();
            this.f13488a = true;
            this.f13486a = exc;
        }
        this.f13485a.mo20835b(this);
    }

    /* renamed from: z */
    public final void mo17594z(@ts2 Object obj) {
        synchronized (this.f13487a) {
            mo17567F();
            this.f13488a = true;
            this.f13489b = obj;
        }
        this.f13485a.mo20835b(this);
    }
}
