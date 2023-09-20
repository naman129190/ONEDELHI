package com.onedelhi.secure;

import androidx.lifecycle.LiveData;
import com.onedelhi.secure.hl3;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@hl3({hl3.C2354a.f13188c})
public abstract class e40<T> {

    /* renamed from: a */
    public final LiveData<T> f11110a;
    @hw4

    /* renamed from: a */
    public final Runnable f11111a;

    /* renamed from: a */
    public final Executor f11112a;

    /* renamed from: a */
    public final AtomicBoolean f11113a;
    @hw4

    /* renamed from: b */
    public final Runnable f11114b;

    /* renamed from: b */
    public final AtomicBoolean f11115b;

    /* renamed from: com.onedelhi.secure.e40$a */
    public class C2029a extends LiveData<T> {
        public C2029a() {
        }

        /* renamed from: l */
        public void mo4928l() {
            e40 e40 = e40.this;
            e40.f11112a.execute(e40.f11111a);
        }
    }

    /* renamed from: com.onedelhi.secure.e40$b */
    public class C2030b implements Runnable {
        public C2030b() {
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        @com.onedelhi.secure.ly4
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
            L_0x0000:
                com.onedelhi.secure.e40 r0 = com.onedelhi.secure.e40.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f11115b
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x003b
                r0 = 0
                r3 = 0
            L_0x000e:
                com.onedelhi.secure.e40 r4 = com.onedelhi.secure.e40.this     // Catch:{ all -> 0x0032 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f11113a     // Catch:{ all -> 0x0032 }
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0032 }
                if (r4 == 0) goto L_0x0020
                com.onedelhi.secure.e40 r0 = com.onedelhi.secure.e40.this     // Catch:{ all -> 0x0032 }
                java.lang.Object r0 = r0.mo15033a()     // Catch:{ all -> 0x0032 }
                r3 = 1
                goto L_0x000e
            L_0x0020:
                if (r3 == 0) goto L_0x0029
                com.onedelhi.secure.e40 r2 = com.onedelhi.secure.e40.this     // Catch:{ all -> 0x0032 }
                androidx.lifecycle.LiveData<T> r2 = r2.f11110a     // Catch:{ all -> 0x0032 }
                r2.mo4930n(r0)     // Catch:{ all -> 0x0032 }
            L_0x0029:
                com.onedelhi.secure.e40 r0 = com.onedelhi.secure.e40.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f11115b
                r0.set(r1)
                r1 = r3
                goto L_0x003b
            L_0x0032:
                r0 = move-exception
                com.onedelhi.secure.e40 r2 = com.onedelhi.secure.e40.this
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f11115b
                r2.set(r1)
                throw r0
            L_0x003b:
                if (r1 == 0) goto L_0x0047
                com.onedelhi.secure.e40 r0 = com.onedelhi.secure.e40.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f11113a
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x0000
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e40.C2030b.run():void");
        }
    }

    /* renamed from: com.onedelhi.secure.e40$c */
    public class C2031c implements Runnable {
        public C2031c() {
        }

        @bc2
        public void run() {
            boolean h = e40.this.f11110a.mo4924h();
            if (e40.this.f11113a.compareAndSet(false, true) && h) {
                e40 e40 = e40.this;
                e40.f11112a.execute(e40.f11111a);
            }
        }
    }

    public e40() {
        this(C3480s9.m27322e());
    }

    public e40(@mr2 Executor executor) {
        this.f11113a = new AtomicBoolean(true);
        this.f11115b = new AtomicBoolean(false);
        this.f11111a = new C2030b();
        this.f11114b = new C2031c();
        this.f11112a = executor;
        this.f11110a = new C2029a();
    }

    @ly4
    /* renamed from: a */
    public abstract T mo15033a();

    @mr2
    /* renamed from: b */
    public LiveData<T> mo15034b() {
        return this.f11110a;
    }

    /* renamed from: c */
    public void mo15035c() {
        C3480s9.m27323f().mo12885b(this.f11114b);
    }
}
