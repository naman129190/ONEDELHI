package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

public final class iu3 implements Executor {

    /* renamed from: a */
    public static final Logger f30459a = Logger.getLogger(iu3.class.getName());

    /* renamed from: a */
    public final C5747b f30460a = new C5747b(this, (C5746a) null);
    @mj1("queue")

    /* renamed from: a */
    public C5748c f30461a = C5748c.IDLE;
    @mj1("queue")

    /* renamed from: a */
    public final Deque<Runnable> f30462a = new ArrayDeque();

    /* renamed from: a */
    public final Executor f30463a;
    @mj1("queue")

    /* renamed from: b */
    public long f30464b = 0;

    /* renamed from: com.onedelhi.secure.iu3$a */
    public class C5746a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f30466a;

        public C5746a(Runnable runnable) {
            this.f30466a = runnable;
        }

        public void run() {
            this.f30466a.run();
        }

        public String toString() {
            return this.f30466a.toString();
        }
    }

    /* renamed from: com.onedelhi.secure.iu3$b */
    public final class C5747b implements Runnable {
        @CheckForNull

        /* renamed from: a */
        public Runnable f30468a;

        public C5747b() {
        }

        public /* synthetic */ C5747b(iu3 iu3, C5746a aVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.f30468a.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r4 = com.onedelhi.secure.iu3.m52686e();
            r5 = java.util.logging.Level.SEVERE;
            r4.log(r5, "Exception while executing runnable " + r8.f30468a, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r1 == false) goto L_?;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38250a() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
            L_0x0002:
                com.onedelhi.secure.iu3 r2 = com.onedelhi.secure.iu3.this     // Catch:{ all -> 0x0082 }
                java.util.Deque r2 = r2.f30462a     // Catch:{ all -> 0x0082 }
                monitor-enter(r2)     // Catch:{ all -> 0x0082 }
                if (r0 != 0) goto L_0x002b
                com.onedelhi.secure.iu3 r0 = com.onedelhi.secure.iu3.this     // Catch:{ all -> 0x007f }
                com.onedelhi.secure.iu3$c r0 = r0.f30461a     // Catch:{ all -> 0x007f }
                com.onedelhi.secure.iu3$c r3 = com.onedelhi.secure.iu3.C5748c.RUNNING     // Catch:{ all -> 0x007f }
                if (r0 != r3) goto L_0x0020
                monitor-exit(r2)     // Catch:{ all -> 0x007f }
                if (r1 == 0) goto L_0x001f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001f:
                return
            L_0x0020:
                com.onedelhi.secure.iu3 r0 = com.onedelhi.secure.iu3.this     // Catch:{ all -> 0x007f }
                com.onedelhi.secure.iu3.m52685d(r0)     // Catch:{ all -> 0x007f }
                com.onedelhi.secure.iu3 r0 = com.onedelhi.secure.iu3.this     // Catch:{ all -> 0x007f }
                com.onedelhi.secure.iu3.C5748c unused = r0.f30461a = r3     // Catch:{ all -> 0x007f }
                r0 = 1
            L_0x002b:
                com.onedelhi.secure.iu3 r3 = com.onedelhi.secure.iu3.this     // Catch:{ all -> 0x007f }
                java.util.Deque r3 = r3.f30462a     // Catch:{ all -> 0x007f }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x007f }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x007f }
                r8.f30468a = r3     // Catch:{ all -> 0x007f }
                if (r3 != 0) goto L_0x004d
                com.onedelhi.secure.iu3 r0 = com.onedelhi.secure.iu3.this     // Catch:{ all -> 0x007f }
                com.onedelhi.secure.iu3$c r3 = com.onedelhi.secure.iu3.C5748c.IDLE     // Catch:{ all -> 0x007f }
                com.onedelhi.secure.iu3.C5748c unused = r0.f30461a = r3     // Catch:{ all -> 0x007f }
                monitor-exit(r2)     // Catch:{ all -> 0x007f }
                if (r1 == 0) goto L_0x004c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x004c:
                return
            L_0x004d:
                monitor-exit(r2)     // Catch:{ all -> 0x007f }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0082 }
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f30468a     // Catch:{ RuntimeException -> 0x005e }
                r3.run()     // Catch:{ RuntimeException -> 0x005e }
            L_0x0059:
                r8.f30468a = r2     // Catch:{ all -> 0x0082 }
                goto L_0x0002
            L_0x005c:
                r0 = move-exception
                goto L_0x007c
            L_0x005e:
                r3 = move-exception
                java.util.logging.Logger r4 = com.onedelhi.secure.iu3.f30459a     // Catch:{ all -> 0x005c }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x005c }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
                r6.<init>()     // Catch:{ all -> 0x005c }
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch:{ all -> 0x005c }
                java.lang.Runnable r7 = r8.f30468a     // Catch:{ all -> 0x005c }
                r6.append(r7)     // Catch:{ all -> 0x005c }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x005c }
                r4.log(r5, r6, r3)     // Catch:{ all -> 0x005c }
                goto L_0x0059
            L_0x007c:
                r8.f30468a = r2     // Catch:{ all -> 0x0082 }
                throw r0     // Catch:{ all -> 0x0082 }
            L_0x007f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x007f }
                throw r0     // Catch:{ all -> 0x0082 }
            L_0x0082:
                r0 = move-exception
                if (r1 == 0) goto L_0x008c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x008c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iu3.C5747b.mo38250a():void");
        }

        public void run() {
            try {
                mo38250a();
            } catch (Error e) {
                synchronized (iu3.this.f30462a) {
                    C5748c unused = iu3.this.f30461a = C5748c.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f30468a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + iu3.this.f30461a + "}";
        }
    }

    /* renamed from: com.onedelhi.secure.iu3$c */
    public enum C5748c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public iu3(Executor executor) {
        this.f30463a = (Executor) Preconditions.checkNotNull(executor);
    }

    /* renamed from: d */
    public static /* synthetic */ long m52685d(iu3 iu3) {
        long j = iu3.f30464b;
        iu3.f30464b = 1 + j;
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r8.f30463a.execute(r8.f30460a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r8.f30461a == r9) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r6 = r8.f30462a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r8.f30464b != r3) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r8.f30461a != r9) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r8.f30461a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        monitor-enter(r8.f30462a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3 = r8.f30461a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r3 == com.onedelhi.secure.iu3.C5748c.f30469a) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0064, code lost:
        if ((r9 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006a, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute(java.lang.Runnable r9) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            java.util.Deque<java.lang.Runnable> r0 = r8.f30462a
            monitor-enter(r0)
            com.onedelhi.secure.iu3$c r1 = r8.f30461a     // Catch:{ all -> 0x0075 }
            com.onedelhi.secure.iu3$c r2 = com.onedelhi.secure.iu3.C5748c.RUNNING     // Catch:{ all -> 0x0075 }
            if (r1 == r2) goto L_0x006e
            com.onedelhi.secure.iu3$c r2 = com.onedelhi.secure.iu3.C5748c.QUEUED     // Catch:{ all -> 0x0075 }
            if (r1 != r2) goto L_0x0011
            goto L_0x006e
        L_0x0011:
            long r3 = r8.f30464b     // Catch:{ all -> 0x0075 }
            com.onedelhi.secure.iu3$a r1 = new com.onedelhi.secure.iu3$a     // Catch:{ all -> 0x0075 }
            r1.<init>(r9)     // Catch:{ all -> 0x0075 }
            java.util.Deque<java.lang.Runnable> r9 = r8.f30462a     // Catch:{ all -> 0x0075 }
            r9.add(r1)     // Catch:{ all -> 0x0075 }
            com.onedelhi.secure.iu3$c r9 = com.onedelhi.secure.iu3.C5748c.QUEUING     // Catch:{ all -> 0x0075 }
            r8.f30461a = r9     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            r0 = 1
            r5 = 0
            java.util.concurrent.Executor r6 = r8.f30463a     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            com.onedelhi.secure.iu3$b r7 = r8.f30460a     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            r6.execute(r7)     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            com.onedelhi.secure.iu3$c r1 = r8.f30461a
            if (r1 == r9) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0034
            return
        L_0x0034:
            java.util.Deque<java.lang.Runnable> r6 = r8.f30462a
            monitor-enter(r6)
            long r0 = r8.f30464b     // Catch:{ all -> 0x0045 }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0043
            com.onedelhi.secure.iu3$c r0 = r8.f30461a     // Catch:{ all -> 0x0045 }
            if (r0 != r9) goto L_0x0043
            r8.f30461a = r2     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r9 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            throw r9
        L_0x0048:
            r9 = move-exception
            goto L_0x004b
        L_0x004a:
            r9 = move-exception
        L_0x004b:
            java.util.Deque<java.lang.Runnable> r2 = r8.f30462a
            monitor-enter(r2)
            com.onedelhi.secure.iu3$c r3 = r8.f30461a     // Catch:{ all -> 0x006b }
            com.onedelhi.secure.iu3$c r4 = com.onedelhi.secure.iu3.C5748c.IDLE     // Catch:{ all -> 0x006b }
            if (r3 == r4) goto L_0x0058
            com.onedelhi.secure.iu3$c r4 = com.onedelhi.secure.iu3.C5748c.QUEUING     // Catch:{ all -> 0x006b }
            if (r3 != r4) goto L_0x0061
        L_0x0058:
            java.util.Deque<java.lang.Runnable> r3 = r8.f30462a     // Catch:{ all -> 0x006b }
            boolean r1 = r3.removeLastOccurrence(r1)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            boolean r1 = r9 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x006a
            if (r0 != 0) goto L_0x006a
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            return
        L_0x006a:
            throw r9     // Catch:{ all -> 0x006b }
        L_0x006b:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            throw r9
        L_0x006e:
            java.util.Deque<java.lang.Runnable> r1 = r8.f30462a     // Catch:{ all -> 0x0075 }
            r1.add(r9)     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iu3.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + to1.f35745h + this.f30463a + "}";
    }
}
