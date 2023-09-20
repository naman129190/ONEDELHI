package com.onedelhi.secure;

import android.os.CancellationSignal;

/* renamed from: com.onedelhi.secure.qu */
public final class C3345qu {

    /* renamed from: a */
    public C3347b f19461a;

    /* renamed from: a */
    public Object f19462a;

    /* renamed from: a */
    public boolean f19463a;

    /* renamed from: b */
    public boolean f19464b;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.qu$a */
    public static class C3346a {
        @pn0
        /* renamed from: a */
        public static void m26169a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        @pn0
        /* renamed from: b */
        public static CancellationSignal m26170b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: com.onedelhi.secure.qu$b */
    public interface C3347b {
        void onCancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        com.onedelhi.secure.C3345qu.C3346a.m26169a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.f19464b = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.f19464b = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0031, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23439a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f19463a     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            r0 = 1
            r3.f19463a = r0     // Catch:{ all -> 0x0036 }
            r3.f19464b = r0     // Catch:{ all -> 0x0036 }
            com.onedelhi.secure.qu$b r0 = r3.f19461a     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r3.f19462a     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.onCancel()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0020
        L_0x001a:
            if (r1 == 0) goto L_0x002b
            com.onedelhi.secure.C3345qu.C3346a.m26169a(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x002b
        L_0x0020:
            monitor-enter(r3)
            r3.f19464b = r2     // Catch:{ all -> 0x0028 }
            r3.notifyAll()     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            monitor-enter(r3)
            r3.f19464b = r2     // Catch:{ all -> 0x0033 }
            r3.notifyAll()     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3345qu.mo23439a():void");
    }

    @ts2
    /* renamed from: b */
    public Object mo23440b() {
        Object obj;
        synchronized (this) {
            if (this.f19462a == null) {
                CancellationSignal b = C3346a.m26170b();
                this.f19462a = b;
                if (this.f19463a) {
                    C3346a.m26169a(b);
                }
            }
            obj = this.f19462a;
        }
        return obj;
    }

    /* renamed from: c */
    public boolean mo23441c() {
        boolean z;
        synchronized (this) {
            z = this.f19463a;
        }
        return z;
    }

    /* renamed from: d */
    public void mo23442d(@ts2 C3347b bVar) {
        synchronized (this) {
            mo23444f();
            if (this.f19461a != bVar) {
                this.f19461a = bVar;
                if (this.f19463a) {
                    if (bVar != null) {
                        bVar.onCancel();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo23443e() {
        if (mo23441c()) {
            throw new fw2();
        }
    }

    /* renamed from: f */
    public final void mo23444f() {
        while (this.f19464b) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
