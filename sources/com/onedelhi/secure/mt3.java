package com.onedelhi.secure;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.onedelhi.secure.hl3;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class mt3 {

    /* renamed from: d */
    public static final int f16284d = 1;

    /* renamed from: e */
    public static final int f16285e = 0;
    @mj1("mLock")

    /* renamed from: a */
    public int f16286a;

    /* renamed from: a */
    public Handler.Callback f16287a = new C2881a();
    @mj1("mLock")

    /* renamed from: a */
    public Handler f16288a;
    @mj1("mLock")

    /* renamed from: a */
    public HandlerThread f16289a;

    /* renamed from: a */
    public final Object f16290a = new Object();

    /* renamed from: a */
    public final String f16291a;

    /* renamed from: b */
    public final int f16292b;

    /* renamed from: c */
    public final int f16293c;

    /* renamed from: com.onedelhi.secure.mt3$a */
    public class C2881a implements Handler.Callback {
        public C2881a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                mt3.this.mo20614c();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                mt3.this.mo20615d((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.mt3$b */
    public class C2882b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Handler f16295a;

        /* renamed from: a */
        public final /* synthetic */ C2885d f16296a;

        /* renamed from: a */
        public final /* synthetic */ Callable f16298a;

        /* renamed from: com.onedelhi.secure.mt3$b$a */
        public class C2883a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Object f16300a;

            public C2883a(Object obj) {
                this.f16300a = obj;
            }

            public void run() {
                C2882b.this.f16296a.mo20623a(this.f16300a);
            }
        }

        public C2882b(Callable callable, Handler handler, C2885d dVar) {
            this.f16298a = callable;
            this.f16295a = handler;
            this.f16296a = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f16298a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f16295a.post(new C2883a(obj));
        }
    }

    /* renamed from: com.onedelhi.secure.mt3$c */
    public class C2884c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Callable f16302a;

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f16303a;

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f16304a;

        /* renamed from: a */
        public final /* synthetic */ Condition f16305a;

        /* renamed from: a */
        public final /* synthetic */ ReentrantLock f16306a;

        public C2884c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f16304a = atomicReference;
            this.f16302a = callable;
            this.f16306a = reentrantLock;
            this.f16303a = atomicBoolean;
            this.f16305a = condition;
        }

        public void run() {
            try {
                this.f16304a.set(this.f16302a.call());
            } catch (Exception unused) {
            }
            this.f16306a.lock();
            try {
                this.f16303a.set(false);
                this.f16305a.signal();
            } finally {
                this.f16306a.unlock();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.mt3$d */
    public interface C2885d<T> {
        /* renamed from: a */
        void mo20623a(T t);
    }

    public mt3(String str, int i, int i2) {
        this.f16291a = str;
        this.f16293c = i;
        this.f16292b = i2;
        this.f16286a = 0;
    }

    @hw4
    /* renamed from: a */
    public int mo20612a() {
        int i;
        synchronized (this.f16290a) {
            i = this.f16286a;
        }
        return i;
    }

    @hw4
    /* renamed from: b */
    public boolean mo20613b() {
        boolean z;
        synchronized (this.f16290a) {
            z = this.f16289a != null;
        }
        return z;
    }

    /* renamed from: c */
    public void mo20614c() {
        synchronized (this.f16290a) {
            if (!this.f16288a.hasMessages(1)) {
                this.f16289a.quit();
                this.f16289a = null;
                this.f16288a = null;
            }
        }
    }

    /* renamed from: d */
    public void mo20615d(Runnable runnable) {
        runnable.run();
        synchronized (this.f16290a) {
            this.f16288a.removeMessages(0);
            Handler handler = this.f16288a;
            handler.sendMessageDelayed(handler.obtainMessage(0), (long) this.f16292b);
        }
    }

    /* renamed from: e */
    public final void mo20616e(Runnable runnable) {
        synchronized (this.f16290a) {
            if (this.f16289a == null) {
                HandlerThread handlerThread = new HandlerThread(this.f16291a, this.f16293c);
                this.f16289a = handlerThread;
                handlerThread.start();
                this.f16288a = new Handler(this.f16289a.getLooper(), this.f16287a);
                this.f16286a++;
            }
            this.f16288a.removeMessages(0);
            Handler handler = this.f16288a;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* renamed from: f */
    public <T> void mo20617f(Callable<T> callable, C2885d<T> dVar) {
        mo20616e(new C2882b(callable, C1804bt.m12056a(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo20618g(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            com.onedelhi.secure.mt3$c r11 = new com.onedelhi.secure.mt3$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.mo20616e(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mt3.mo20618g(java.util.concurrent.Callable, int):java.lang.Object");
    }
}
