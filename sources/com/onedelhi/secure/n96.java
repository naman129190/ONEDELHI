package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class n96 extends FutureTask implements Comparable {

    /* renamed from: a */
    public final /* synthetic */ qa6 f17232a;

    /* renamed from: b */
    public final long f17233b;

    /* renamed from: b */
    public final String f17234b;

    /* renamed from: b */
    public final boolean f17235b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n96(qa6 qa6, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f17232a = qa6;
        Preconditions.checkNotNull(str);
        long andIncrement = qa6.f19043a.getAndIncrement();
        this.f17233b = andIncrement;
        this.f17234b = str;
        this.f17235b = z;
        if (andIncrement == Long.MAX_VALUE) {
            qa6.f11205a.mo15136e().mo12726r().mo25379a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n96(qa6 qa6, Callable callable, boolean z, String str) {
        super(callable);
        this.f17232a = qa6;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = qa6.f19043a.getAndIncrement();
        this.f17233b = andIncrement;
        this.f17234b = "Task exception on worker thread";
        this.f17235b = z;
        if (andIncrement == Long.MAX_VALUE) {
            qa6.f11205a.mo15136e().mo12726r().mo25379a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(@mr2 Object obj) {
        n96 n96 = (n96) obj;
        boolean z = this.f17235b;
        if (z != n96.f17235b) {
            return !z ? 1 : -1;
        }
        int i = (this.f17233b > n96.f17233b ? 1 : (this.f17233b == n96.f17233b ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.f17232a.f11205a.mo15136e().mo12728t().mo25380b("Two tasks share the same index. index", Long.valueOf(this.f17233b));
        return 0;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f17232a.f11205a.mo15136e().mo12726r().mo25380b(this.f17234b, th);
        if ((th instanceof h96) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
