package com.onedelhi.secure;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/uw4;", "Lcom/onedelhi/secure/sb0;", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "a", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class uw4 extends sb0 {
    @vr2

    /* renamed from: a */
    public static final uw4 f36329a = new uw4();
    @vr2

    /* renamed from: a */
    public static final WeakHashMap<Class<? extends Throwable>, ec1<Throwable, Throwable>> f36330a = new WeakHashMap<>();
    @vr2

    /* renamed from: a */
    public static final ReentrantReadWriteLock f36331a = new ReentrantReadWriteLock();

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @com.onedelhi.secure.vr2
    /* renamed from: a */
    public com.onedelhi.secure.ec1<java.lang.Throwable, java.lang.Throwable> mo42972a(@com.onedelhi.secure.vr2 java.lang.Class<? extends java.lang.Throwable> r7) {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f36331a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, com.onedelhi.secure.ec1<java.lang.Throwable, java.lang.Throwable>> r2 = f36330a     // Catch:{ all -> 0x006e }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x006e }
            com.onedelhi.secure.ec1 r2 = (com.onedelhi.secure.ec1) r2     // Catch:{ all -> 0x006e }
            r1.unlock()
            if (r2 != 0) goto L_0x006d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0026
            int r2 = r0.getReadHoldCount()
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r4 >= r2) goto L_0x0030
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x0028
        L_0x0030:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, com.onedelhi.secure.ec1<java.lang.Throwable, java.lang.Throwable>> r4 = f36330a     // Catch:{ all -> 0x0060 }
            java.lang.Object r5 = r4.get(r7)     // Catch:{ all -> 0x0060 }
            com.onedelhi.secure.ec1 r5 = (com.onedelhi.secure.ec1) r5     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x0054
            com.onedelhi.secure.ec1 r5 = com.onedelhi.secure.lw0.m56603b(r7)     // Catch:{ all -> 0x0060 }
            r4.put(r7, r5)     // Catch:{ all -> 0x0060 }
        L_0x0048:
            if (r3 >= r2) goto L_0x0050
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0048
        L_0x0050:
            r0.unlock()
            return r5
        L_0x0054:
            if (r3 >= r2) goto L_0x005c
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0054
        L_0x005c:
            r0.unlock()
            return r5
        L_0x0060:
            r7 = move-exception
        L_0x0061:
            if (r3 >= r2) goto L_0x0069
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0061
        L_0x0069:
            r0.unlock()
            throw r7
        L_0x006d:
            return r2
        L_0x006e:
            r7 = move-exception
            r1.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.uw4.mo42972a(java.lang.Class):com.onedelhi.secure.ec1");
    }
}
