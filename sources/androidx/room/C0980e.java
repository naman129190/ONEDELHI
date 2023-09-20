package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.C0967c;
import com.onedelhi.secure.C3480s9;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pt1;
import com.onedelhi.secure.ym3;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.e */
public class C0980e<T> extends LiveData<T> {

    /* renamed from: a */
    public final C0967c.C0970c f5303a;

    /* renamed from: a */
    public final pt1 f5304a;

    /* renamed from: a */
    public final ym3 f5305a;

    /* renamed from: a */
    public final Callable<T> f5306a;

    /* renamed from: a */
    public final AtomicBoolean f5307a = new AtomicBoolean(true);

    /* renamed from: b */
    public final Runnable f5308b = new C0981a();

    /* renamed from: b */
    public final AtomicBoolean f5309b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Runnable f5310c = new C0982b();

    /* renamed from: c */
    public final AtomicBoolean f5311c = new AtomicBoolean(false);

    /* renamed from: d */
    public final boolean f5312d;

    /* renamed from: androidx.room.e$a */
    public class C0981a implements Runnable {
        public C0981a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0025  */
        @com.onedelhi.secure.ly4
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.e r0 = androidx.room.C0980e.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f5311c
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x001b
                androidx.room.e r0 = androidx.room.C0980e.this
                com.onedelhi.secure.ym3 r0 = r0.f5305a
                androidx.room.c r0 = r0.getInvalidationTracker()
                androidx.room.e r3 = androidx.room.C0980e.this
                androidx.room.c$c r3 = r3.f5303a
                r0.mo6616b(r3)
            L_0x001b:
                androidx.room.e r0 = androidx.room.C0980e.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f5309b
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x005c
                r0 = 0
                r3 = 0
            L_0x0027:
                androidx.room.e r4 = androidx.room.C0980e.this     // Catch:{ all -> 0x0053 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f5307a     // Catch:{ all -> 0x0053 }
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0053 }
                if (r4 == 0) goto L_0x0044
                androidx.room.e r0 = androidx.room.C0980e.this     // Catch:{ Exception -> 0x003b }
                java.util.concurrent.Callable<T> r0 = r0.f5306a     // Catch:{ Exception -> 0x003b }
                java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x003b }
                r3 = 1
                goto L_0x0027
            L_0x003b:
                r0 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "Exception while computing database live data."
                r2.<init>(r3, r0)     // Catch:{ all -> 0x0053 }
                throw r2     // Catch:{ all -> 0x0053 }
            L_0x0044:
                if (r3 == 0) goto L_0x004b
                androidx.room.e r4 = androidx.room.C0980e.this     // Catch:{ all -> 0x0053 }
                r4.mo4930n(r0)     // Catch:{ all -> 0x0053 }
            L_0x004b:
                androidx.room.e r0 = androidx.room.C0980e.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f5309b
                r0.set(r1)
                goto L_0x005d
            L_0x0053:
                r0 = move-exception
                androidx.room.e r2 = androidx.room.C0980e.this
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f5309b
                r2.set(r1)
                throw r0
            L_0x005c:
                r3 = 0
            L_0x005d:
                if (r3 == 0) goto L_0x0069
                androidx.room.e r0 = androidx.room.C0980e.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f5307a
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x001b
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0980e.C0981a.run():void");
        }
    }

    /* renamed from: androidx.room.e$b */
    public class C0982b implements Runnable {
        public C0982b() {
        }

        @bc2
        public void run() {
            boolean h = C0980e.this.mo4924h();
            if (C0980e.this.f5307a.compareAndSet(false, true) && h) {
                C0980e.this.mo6651s().execute(C0980e.this.f5308b);
            }
        }
    }

    /* renamed from: androidx.room.e$c */
    public class C0983c extends C0967c.C0970c {
        public C0983c(String[] strArr) {
            super(strArr);
        }

        /* renamed from: b */
        public void mo6642b(@mr2 Set<String> set) {
            C3480s9.m27323f().mo12885b(C0980e.this.f5310c);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public C0980e(ym3 ym3, pt1 pt1, boolean z, Callable<T> callable, String[] strArr) {
        this.f5305a = ym3;
        this.f5312d = z;
        this.f5306a = callable;
        this.f5304a = pt1;
        this.f5303a = new C0983c(strArr);
    }

    /* renamed from: l */
    public void mo4928l() {
        super.mo4928l();
        this.f5304a.mo22634b(this);
        mo6651s().execute(this.f5308b);
    }

    /* renamed from: m */
    public void mo4929m() {
        super.mo4929m();
        this.f5304a.mo22635c(this);
    }

    /* renamed from: s */
    public Executor mo6651s() {
        return this.f5312d ? this.f5305a.getTransactionExecutor() : this.f5305a.getQueryExecutor();
    }
}
