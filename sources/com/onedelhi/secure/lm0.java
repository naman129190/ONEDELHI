package com.onedelhi.secure;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class lm0 {

    /* renamed from: a */
    public final C2770b f15499a = new C2770b();

    /* renamed from: a */
    public final Map<String, C2769a> f15500a = new HashMap();

    /* renamed from: com.onedelhi.secure.lm0$a */
    public static class C2769a {

        /* renamed from: a */
        public int f15501a;

        /* renamed from: a */
        public final Lock f15502a = new ReentrantLock();
    }

    /* renamed from: com.onedelhi.secure.lm0$b */
    public static class C2770b {

        /* renamed from: a */
        public static final int f15503a = 10;

        /* renamed from: a */
        public final Queue<C2769a> f15504a = new ArrayDeque();

        /* renamed from: a */
        public C2769a mo19713a() {
            C2769a poll;
            synchronized (this.f15504a) {
                poll = this.f15504a.poll();
            }
            return poll == null ? new C2769a() : poll;
        }

        /* renamed from: b */
        public void mo19714b(C2769a aVar) {
            synchronized (this.f15504a) {
                if (this.f15504a.size() < 10) {
                    this.f15504a.offer(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19711a(String str) {
        C2769a aVar;
        synchronized (this) {
            aVar = this.f15500a.get(str);
            if (aVar == null) {
                aVar = this.f15499a.mo19713a();
                this.f15500a.put(str, aVar);
            }
            aVar.f15501a++;
        }
        aVar.f15502a.lock();
    }

    /* renamed from: b */
    public void mo19712b(String str) {
        C2769a aVar;
        synchronized (this) {
            aVar = (C2769a) g43.m15509d(this.f15500a.get(str));
            int i = aVar.f15501a;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f15501a = i2;
                if (i2 == 0) {
                    C2769a remove = this.f15500a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f15499a.mo19714b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f15501a);
            }
        }
        aVar.f15502a.unlock();
    }
}
