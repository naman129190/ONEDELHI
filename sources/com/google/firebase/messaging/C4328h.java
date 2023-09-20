package com.google.firebase.messaging;

import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.w94;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.h */
public class C4328h {
    @mj1("this")

    /* renamed from: a */
    public final Map<String, w94<String>> f25201a = new C3042oa();

    /* renamed from: a */
    public final Executor f25202a;

    /* renamed from: com.google.firebase.messaging.h$a */
    public interface C4329a {
        /* renamed from: a */
        w94<String> mo29820a();
    }

    public C4328h(Executor executor) {
        this.f25202a = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ w94 m34873c(String str, w94 w94) throws Exception {
        synchronized (this) {
            this.f25201a.remove(str);
        }
        return w94;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.onedelhi.secure.w94<java.lang.String> mo29819b(java.lang.String r4, com.google.firebase.messaging.C4328h.C4329a r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, com.onedelhi.secure.w94<java.lang.String>> r0 = r3.f25201a     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0060 }
            com.onedelhi.secure.w94 r0 = (com.onedelhi.secure.w94) r0     // Catch:{ all -> 0x0060 }
            r1 = 3
            if (r0 == 0) goto L_0x002c
            java.lang.String r5 = "FirebaseMessaging"
            boolean r5 = android.util.Log.isLoggable(r5, r1)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x002a
            java.lang.String r5 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Joining ongoing request for: "
            r1.append(r2)     // Catch:{ all -> 0x0060 }
            r1.append(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.d(r5, r4)     // Catch:{ all -> 0x0060 }
        L_0x002a:
            monitor-exit(r3)
            return r0
        L_0x002c:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Making new request for: "
            r1.append(r2)     // Catch:{ all -> 0x0060 }
            r1.append(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x0060 }
        L_0x004a:
            com.onedelhi.secure.w94 r5 = r5.mo29820a()     // Catch:{ all -> 0x0060 }
            java.util.concurrent.Executor r0 = r3.f25202a     // Catch:{ all -> 0x0060 }
            com.onedelhi.secure.wi3 r1 = new com.onedelhi.secure.wi3     // Catch:{ all -> 0x0060 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0060 }
            com.onedelhi.secure.w94 r5 = r5.mo17584p(r0, r1)     // Catch:{ all -> 0x0060 }
            java.util.Map<java.lang.String, com.onedelhi.secure.w94<java.lang.String>> r0 = r3.f25201a     // Catch:{ all -> 0x0060 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0060 }
            monitor-exit(r3)
            return r5
        L_0x0060:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C4328h.mo29819b(java.lang.String, com.google.firebase.messaging.h$a):com.onedelhi.secure.w94");
    }
}
