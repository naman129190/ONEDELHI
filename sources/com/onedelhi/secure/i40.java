package com.onedelhi.secure;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000H\u0000\u001a,\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00060\u0005j\u0002`\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\b¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000bH\b\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000*\f\b\u0000\u0010\u0013\"\u00020\u00052\u00020\u0005¨\u0006\u0014"}, d2 = {"E", "", "Lkotlinx/coroutines/internal/SubscribersList;", "d", "T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "Lkotlin/Function0;", "action", "e", "(Ljava/util/concurrent/locks/ReentrantLock;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "", "expectedSize", "", "b", "Ljava/util/concurrent/Executor;", "executor", "", "c", "ReentrantLock", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class i40 {
    @ss2

    /* renamed from: a */
    public static final Method f30075a;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f30075a = method;
    }

    /* renamed from: a */
    public static /* synthetic */ void m51784a() {
    }

    @vr2
    /* renamed from: b */
    public static final <E> Set<E> m51785b(int i) {
        return Collections.newSetFromMap(new IdentityHashMap(i));
    }

    /* renamed from: c */
    public static final boolean m51786c(@vr2 Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f30075a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @vr2
    /* renamed from: d */
    public static final <E> List<E> m51787d() {
        return new CopyOnWriteArrayList();
    }

    /* renamed from: e */
    public static final <T> T m51788e(@vr2 ReentrantLock reentrantLock, @vr2 cc1<? extends T> cc1) {
        reentrantLock.lock();
        try {
            return cc1.invoke();
        } finally {
            uq1.m67403d(1);
            reentrantLock.unlock();
            uq1.m67402c(1);
        }
    }
}
