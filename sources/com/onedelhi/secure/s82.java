package com.onedelhi.secure;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\t\u0010\b\u0002\u0007\n\u0005\b20\u0001¨\u0006\n"}, d2 = {"T", "Ljava/util/concurrent/locks/Lock;", "Lkotlin/Function0;", "action", "b", "(Ljava/util/concurrent/locks/Lock;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "a", "(Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "c", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "LocksKt")
public final class s82 {
    @xq1
    /* renamed from: a */
    public static final <T> T m64411a(ReentrantReadWriteLock reentrantReadWriteLock, cc1<? extends T> cc1) {
        jt1.m53777p(reentrantReadWriteLock, "<this>");
        jt1.m53777p(cc1, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return cc1.invoke();
        } finally {
            uq1.m67403d(1);
            readLock.unlock();
            uq1.m67402c(1);
        }
    }

    @xq1
    /* renamed from: b */
    public static final <T> T m64412b(Lock lock, cc1<? extends T> cc1) {
        jt1.m53777p(lock, "<this>");
        jt1.m53777p(cc1, "action");
        lock.lock();
        try {
            return cc1.invoke();
        } finally {
            uq1.m67403d(1);
            lock.unlock();
            uq1.m67402c(1);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @com.onedelhi.secure.xq1
    /* renamed from: c */
    public static final <T> T m64413c(java.util.concurrent.locks.ReentrantReadWriteLock r4, com.onedelhi.secure.cc1<? extends T> r5) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            java.lang.String r0 = "action"
            com.onedelhi.secure.jt1.m53777p(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()
            int r1 = r4.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L_0x001a
            int r1 = r4.getReadHoldCount()
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x0024
            r0.unlock()
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0024:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.lock()
            r3 = 1
            java.lang.Object r5 = r5.invoke()     // Catch:{ all -> 0x0042 }
            com.onedelhi.secure.uq1.m67403d(r3)
        L_0x0033:
            if (r2 >= r1) goto L_0x003b
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0033
        L_0x003b:
            r4.unlock()
            com.onedelhi.secure.uq1.m67402c(r3)
            return r5
        L_0x0042:
            r5 = move-exception
            com.onedelhi.secure.uq1.m67403d(r3)
        L_0x0046:
            if (r2 >= r1) goto L_0x004e
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0046
        L_0x004e:
            r4.unlock()
            com.onedelhi.secure.uq1.m67402c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.s82.m64413c(java.util.concurrent.locks.ReentrantReadWriteLock, com.onedelhi.secure.cc1):java.lang.Object");
    }
}
