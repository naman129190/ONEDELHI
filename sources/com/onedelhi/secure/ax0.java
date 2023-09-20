package com.onedelhi.secure;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public interface ax0 {
    /* renamed from: a */
    void mo31242a(@e20 String str, @e20 String str2, bc4 bc4, Runnable runnable);

    /* renamed from: b */
    ExecutorService mo31243b(bc4 bc4);

    /* renamed from: c */
    ExecutorService mo31244c(ThreadFactory threadFactory, bc4 bc4);

    /* renamed from: d */
    ExecutorService mo31245d(bc4 bc4);

    /* renamed from: e */
    Future<?> mo31246e(@e20 String str, @e20 String str2, bc4 bc4, Runnable runnable);

    /* renamed from: f */
    ExecutorService mo31247f(int i, ThreadFactory threadFactory, bc4 bc4);

    /* renamed from: g */
    ScheduledExecutorService mo31248g(int i, bc4 bc4);

    /* renamed from: h */
    ScheduledExecutorService mo31249h(int i, ThreadFactory threadFactory, bc4 bc4);

    /* renamed from: i */
    ExecutorService mo31250i(int i, bc4 bc4);

    /* renamed from: j */
    ExecutorService mo31251j(ThreadFactory threadFactory, bc4 bc4);
}
