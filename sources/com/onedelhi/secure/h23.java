package com.onedelhi.secure;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b0\u00101J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0004J&\u0010\u000f\u001a\u00020\u0004*\u00020\u00022\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\b\rH\bR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b'\u0010\u0007R\u0017\u0010(\u001a\u00020\b8G¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\nR\u001a\u0010,\u001a\u00020+8\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/onedelhi/secure/h23;", "", "Lcom/onedelhi/secure/oz3;", "sink", "Lcom/onedelhi/secure/un4;", "e", "a", "()Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/x04;", "b", "()Lcom/onedelhi/secure/x04;", "d", "Lkotlin/Function1;", "Lcom/onedelhi/secure/wy0;", "block", "f", "Lcom/onedelhi/secure/no;", "buffer", "Lcom/onedelhi/secure/no;", "g", "()Lcom/onedelhi/secure/no;", "", "canceled", "Z", "h", "()Z", "m", "(Z)V", "sinkClosed", "k", "o", "sourceClosed", "l", "p", "foldedSink", "Lcom/onedelhi/secure/oz3;", "i", "n", "(Lcom/onedelhi/secure/oz3;)V", "q", "source", "Lcom/onedelhi/secure/x04;", "r", "", "maxBufferSize", "J", "j", "()J", "<init>", "(J)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class h23 {

    /* renamed from: a */
    public final long f29391a;
    @vr2

    /* renamed from: a */
    public final C6205no f29392a = new C6205no();
    @ss2

    /* renamed from: a */
    public oz3 f29393a;
    @vr2

    /* renamed from: a */
    public final x04 f29394a;

    /* renamed from: a */
    public boolean f29395a;
    @vr2

    /* renamed from: b */
    public final oz3 f29396b;

    /* renamed from: b */
    public boolean f29397b;

    /* renamed from: c */
    public boolean f29398c;

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"com/onedelhi/secure/h23$a", "Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "close", "Lcom/onedelhi/secure/me4;", "timeout", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.h23$a */
    public static final class C5474a implements oz3 {

        /* renamed from: a */
        public final /* synthetic */ h23 f29399a;

        /* renamed from: a */
        public final me4 f29400a = new me4();

        public C5474a(h23 h23) {
            this.f29399a = h23;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
            r0 = r12.f29399a;
            r2 = r1.timeout();
            r0 = r0.mo37161q().timeout();
            r3 = r2.mo40563j();
            r5 = com.onedelhi.secure.me4.f32089a.mo40565a(r0.mo40563j(), r2.mo40563j());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r2.mo40562i(r5, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
            if (r2.mo40559f() == false) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
            r5 = r2.mo40557d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
            if (r0.mo40559f() == false) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
            r2.mo40558e(java.lang.Math.min(r2.mo40557d(), r0.mo40557d()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
            r2.mo40562i(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
            if (r0.mo40559f() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
            r2.mo40558e(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
            r2.mo40562i(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
            if (r0.mo40559f() != false) goto L_0x00b2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
            r2.mo40558e(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
            if (r0.mo40559f() == false) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
            r2.mo40558e(r0.mo40557d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
            r2.mo40562i(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
            if (r0.mo40559f() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
            r2.mo40554a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d3, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
            r2.mo40562i(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
            if (r0.mo40559f() != false) goto L_0x00df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00df, code lost:
            r2.mo40554a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e2, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r12 = this;
                com.onedelhi.secure.h23 r0 = r12.f29399a
                com.onedelhi.secure.no r0 = r0.mo37151g()
                monitor-enter(r0)
                com.onedelhi.secure.h23 r1 = r12.f29399a     // Catch:{ all -> 0x00ec }
                boolean r1 = r1.mo37155k()     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x0011
                monitor-exit(r0)
                return
            L_0x0011:
                com.onedelhi.secure.h23 r1 = r12.f29399a     // Catch:{ all -> 0x00ec }
                com.onedelhi.secure.oz3 r1 = r1.mo37153i()     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x001a
                goto L_0x004d
            L_0x001a:
                com.onedelhi.secure.h23 r1 = r12.f29399a     // Catch:{ all -> 0x00ec }
                boolean r1 = r1.mo37156l()     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x003b
                com.onedelhi.secure.h23 r1 = r12.f29399a     // Catch:{ all -> 0x00ec }
                com.onedelhi.secure.no r1 = r1.mo37151g()     // Catch:{ all -> 0x00ec }
                long r1 = r1.mo41244V0()     // Catch:{ all -> 0x00ec }
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x0033
                goto L_0x003b
            L_0x0033:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00ec }
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch:{ all -> 0x00ec }
                throw r1     // Catch:{ all -> 0x00ec }
            L_0x003b:
                com.onedelhi.secure.h23 r1 = r12.f29399a     // Catch:{ all -> 0x00ec }
                r2 = 1
                r1.mo37159o(r2)     // Catch:{ all -> 0x00ec }
                com.onedelhi.secure.h23 r1 = r12.f29399a     // Catch:{ all -> 0x00ec }
                com.onedelhi.secure.no r1 = r1.mo37151g()     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x00e4
                r1.notifyAll()     // Catch:{ all -> 0x00ec }
                r1 = 0
            L_0x004d:
                com.onedelhi.secure.un4 r2 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00ec }
                monitor-exit(r0)
                if (r1 == 0) goto L_0x00e3
                com.onedelhi.secure.h23 r0 = r12.f29399a
                com.onedelhi.secure.me4 r2 = r1.timeout()
                com.onedelhi.secure.oz3 r0 = r0.mo37161q()
                com.onedelhi.secure.me4 r0 = r0.timeout()
                long r3 = r2.mo40563j()
                com.onedelhi.secure.me4$b r5 = com.onedelhi.secure.me4.f32089a
                long r6 = r0.mo40563j()
                long r8 = r2.mo40563j()
                long r5 = r5.mo40565a(r6, r8)
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                r2.mo40562i(r5, r7)
                boolean r5 = r2.mo40559f()
                if (r5 == 0) goto L_0x00b6
                long r5 = r2.mo40557d()
                boolean r8 = r0.mo40559f()
                if (r8 == 0) goto L_0x0096
                long r8 = r2.mo40557d()
                long r10 = r0.mo40557d()
                long r8 = java.lang.Math.min(r8, r10)
                r2.mo40558e(r8)
            L_0x0096:
                r1.close()     // Catch:{ all -> 0x00a6 }
                r2.mo40562i(r3, r7)
                boolean r0 = r0.mo40559f()
                if (r0 == 0) goto L_0x00e3
                r2.mo40558e(r5)
                goto L_0x00e3
            L_0x00a6:
                r1 = move-exception
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                r2.mo40562i(r3, r7)
                boolean r0 = r0.mo40559f()
                if (r0 == 0) goto L_0x00b5
                r2.mo40558e(r5)
            L_0x00b5:
                throw r1
            L_0x00b6:
                boolean r5 = r0.mo40559f()
                if (r5 == 0) goto L_0x00c3
                long r5 = r0.mo40557d()
                r2.mo40558e(r5)
            L_0x00c3:
                r1.close()     // Catch:{ all -> 0x00d3 }
                r2.mo40562i(r3, r7)
                boolean r0 = r0.mo40559f()
                if (r0 == 0) goto L_0x00e3
                r2.mo40554a()
                goto L_0x00e3
            L_0x00d3:
                r1 = move-exception
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
                r2.mo40562i(r3, r5)
                boolean r0 = r0.mo40559f()
                if (r0 == 0) goto L_0x00e2
                r2.mo40554a()
            L_0x00e2:
                throw r1
            L_0x00e3:
                return
            L_0x00e4:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x00ec }
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
                r1.<init>(r2)     // Catch:{ all -> 0x00ec }
                throw r1     // Catch:{ all -> 0x00ec }
            L_0x00ec:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h23.C5474a.close():void");
        }

        public void flush() {
            oz3 i;
            synchronized (this.f29399a.mo37151g()) {
                if (!(!this.f29399a.mo37155k())) {
                    throw new IllegalStateException("closed".toString());
                } else if (!this.f29399a.mo37152h()) {
                    i = this.f29399a.mo37153i();
                    if (i == null) {
                        if (this.f29399a.mo37156l()) {
                            if (this.f29399a.mo37151g().mo41244V0() > 0) {
                                throw new IOException("source is closed");
                            }
                        }
                        i = null;
                    }
                    un4 un4 = un4.f36206a;
                } else {
                    throw new IOException("canceled");
                }
            }
            if (i != null) {
                h23 h23 = this.f29399a;
                me4 timeout = i.timeout();
                me4 timeout2 = h23.mo37161q().timeout();
                long j = timeout.mo40563j();
                long a = me4.f32089a.mo40565a(timeout2.mo40563j(), timeout.mo40563j());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout.mo40562i(a, timeUnit);
                if (timeout.mo40559f()) {
                    long d = timeout.mo40557d();
                    if (timeout2.mo40559f()) {
                        timeout.mo40558e(Math.min(timeout.mo40557d(), timeout2.mo40557d()));
                    }
                    try {
                        i.flush();
                        timeout.mo40562i(j, timeUnit);
                        if (timeout2.mo40559f()) {
                            timeout.mo40558e(d);
                        }
                    } catch (Throwable th) {
                        timeout.mo40562i(j, TimeUnit.NANOSECONDS);
                        if (timeout2.mo40559f()) {
                            timeout.mo40558e(d);
                        }
                        throw th;
                    }
                } else {
                    if (timeout2.mo40559f()) {
                        timeout.mo40558e(timeout2.mo40557d());
                    }
                    try {
                        i.flush();
                        timeout.mo40562i(j, timeUnit);
                        if (timeout2.mo40559f()) {
                            timeout.mo40554a();
                        }
                    } catch (Throwable th2) {
                        timeout.mo40562i(j, TimeUnit.NANOSECONDS);
                        if (timeout2.mo40559f()) {
                            timeout.mo40554a();
                        }
                        throw th2;
                    }
                }
            }
        }

        @vr2
        public me4 timeout() {
            return this.f29400a;
        }

        public void write(@vr2 C6205no noVar, long j) {
            oz3 oz3;
            jt1.m53777p(noVar, "source");
            synchronized (this.f29399a.mo37151g()) {
                if (!(!this.f29399a.mo37155k())) {
                    throw new IllegalStateException("closed".toString());
                } else if (!this.f29399a.mo37152h()) {
                    while (true) {
                        if (j <= 0) {
                            oz3 = null;
                            break;
                        }
                        oz3 = this.f29399a.mo37153i();
                        if (oz3 != null) {
                            break;
                        } else if (!this.f29399a.mo37156l()) {
                            long j2 = this.f29399a.mo37154j() - this.f29399a.mo37151g().mo41244V0();
                            if (j2 == 0) {
                                this.f29400a.mo40564k(this.f29399a.mo37151g());
                                if (this.f29399a.mo37152h()) {
                                    throw new IOException("canceled");
                                }
                            } else {
                                long min = Math.min(j2, j);
                                this.f29399a.mo37151g().write(noVar, min);
                                j -= min;
                                C6205no g = this.f29399a.mo37151g();
                                if (g != null) {
                                    g.notifyAll();
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                            }
                        } else {
                            throw new IOException("source is closed");
                        }
                    }
                    un4 un4 = un4.f36206a;
                } else {
                    throw new IOException("canceled");
                }
            }
            if (oz3 != null) {
                h23 h23 = this.f29399a;
                me4 timeout = oz3.timeout();
                me4 timeout2 = h23.mo37161q().timeout();
                long j3 = timeout.mo40563j();
                long a = me4.f32089a.mo40565a(timeout2.mo40563j(), timeout.mo40563j());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout.mo40562i(a, timeUnit);
                if (timeout.mo40559f()) {
                    long d = timeout.mo40557d();
                    if (timeout2.mo40559f()) {
                        timeout.mo40558e(Math.min(timeout.mo40557d(), timeout2.mo40557d()));
                    }
                    try {
                        oz3.write(noVar, j);
                        timeout.mo40562i(j3, timeUnit);
                        if (timeout2.mo40559f()) {
                            timeout.mo40558e(d);
                        }
                    } catch (Throwable th) {
                        timeout.mo40562i(j3, TimeUnit.NANOSECONDS);
                        if (timeout2.mo40559f()) {
                            timeout.mo40558e(d);
                        }
                        throw th;
                    }
                } else {
                    if (timeout2.mo40559f()) {
                        timeout.mo40558e(timeout2.mo40557d());
                    }
                    try {
                        oz3.write(noVar, j);
                        timeout.mo40562i(j3, timeUnit);
                        if (timeout2.mo40559f()) {
                            timeout.mo40554a();
                        }
                    } catch (Throwable th2) {
                        timeout.mo40562i(j3, TimeUnit.NANOSECONDS);
                        if (timeout2.mo40559f()) {
                            timeout.mo40554a();
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/onedelhi/secure/h23$b", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/un4;", "close", "Lcom/onedelhi/secure/me4;", "timeout", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.h23$b */
    public static final class C5475b implements x04 {

        /* renamed from: a */
        public final /* synthetic */ h23 f29401a;

        /* renamed from: a */
        public final me4 f29402a = new me4();

        public C5475b(h23 h23) {
            this.f29401a = h23;
        }

        public void close() {
            synchronized (this.f29401a.mo37151g()) {
                this.f29401a.mo37160p(true);
                C6205no g = this.f29401a.mo37151g();
                if (g != null) {
                    g.notifyAll();
                    un4 un4 = un4.f36206a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
        }

        public long read(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "sink");
            synchronized (this.f29401a.mo37151g()) {
                if (!(!this.f29401a.mo37156l())) {
                    throw new IllegalStateException("closed".toString());
                } else if (!this.f29401a.mo37152h()) {
                    while (this.f29401a.mo37151g().mo41244V0() == 0) {
                        if (this.f29401a.mo37155k()) {
                            return -1;
                        }
                        this.f29402a.mo40564k(this.f29401a.mo37151g());
                        if (this.f29401a.mo37152h()) {
                            throw new IOException("canceled");
                        }
                    }
                    long read = this.f29401a.mo37151g().read(noVar, j);
                    C6205no g = this.f29401a.mo37151g();
                    if (g != null) {
                        g.notifyAll();
                        return read;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                } else {
                    throw new IOException("canceled");
                }
            }
        }

        @vr2
        public me4 timeout() {
            return this.f29402a;
        }
    }

    public h23(long j) {
        this.f29391a = j;
        if (j >= 1) {
            this.f29396b = new C5474a(this);
            this.f29394a = new C5475b(this);
            return;
        }
        throw new IllegalArgumentException(("maxBufferSize < 1: " + j).toString());
    }

    @uw1(name = "-deprecated_sink")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "sink", imports = {}))
    /* renamed from: a */
    public final oz3 mo37146a() {
        return this.f29396b;
    }

    @uw1(name = "-deprecated_source")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "source", imports = {}))
    /* renamed from: b */
    public final x04 mo37147b() {
        return this.f29394a;
    }

    /* renamed from: d */
    public final void mo37148d() {
        synchronized (this.f29392a) {
            this.f29395a = true;
            this.f29392a.mo41255c();
            C6205no noVar = this.f29392a;
            if (noVar != null) {
                noVar.notifyAll();
                un4 un4 = un4.f36206a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8.write(r3, r3.mo41244V0());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r1 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r8.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        monitor-enter(r7.f29392a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r7.f29398c = true;
        r1 = r7.f29392a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r1 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        r1.notifyAll();
        r1 = com.onedelhi.secure.un4.f36206a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        throw r8;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37149e(@com.onedelhi.secure.vr2 com.onedelhi.secure.oz3 r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "sink"
            com.onedelhi.secure.jt1.m53777p(r8, r0)
        L_0x0005:
            com.onedelhi.secure.no r0 = r7.f29392a
            monitor-enter(r0)
            com.onedelhi.secure.oz3 r1 = r7.f29393a     // Catch:{ all -> 0x0089 }
            r2 = 1
            if (r1 != 0) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x007d
            boolean r1 = r7.f29395a     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0073
            com.onedelhi.secure.no r1 = r7.f29392a     // Catch:{ all -> 0x0089 }
            boolean r1 = r1.mo31685f2()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0024
            r7.f29398c = r2     // Catch:{ all -> 0x0089 }
            r7.f29393a = r8     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)
            return
        L_0x0024:
            boolean r1 = r7.f29397b     // Catch:{ all -> 0x0089 }
            com.onedelhi.secure.no r3 = new com.onedelhi.secure.no     // Catch:{ all -> 0x0089 }
            r3.<init>()     // Catch:{ all -> 0x0089 }
            com.onedelhi.secure.no r4 = r7.f29392a     // Catch:{ all -> 0x0089 }
            long r5 = r4.mo41244V0()     // Catch:{ all -> 0x0089 }
            r3.write(r4, r5)     // Catch:{ all -> 0x0089 }
            com.onedelhi.secure.no r4 = r7.f29392a     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x006b
            r4.notifyAll()     // Catch:{ all -> 0x0089 }
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)
            long r4 = r3.mo41244V0()     // Catch:{ all -> 0x004f }
            r8.write(r3, r4)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004b
            r8.close()     // Catch:{ all -> 0x004f }
            goto L_0x0005
        L_0x004b:
            r8.flush()     // Catch:{ all -> 0x004f }
            goto L_0x0005
        L_0x004f:
            r8 = move-exception
            com.onedelhi.secure.no r0 = r7.f29392a
            monitor-enter(r0)
            r7.f29398c = r2     // Catch:{ all -> 0x0068 }
            com.onedelhi.secure.no r1 = r7.f29392a     // Catch:{ all -> 0x0068 }
            if (r1 != 0) goto L_0x0061
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            r8.<init>(r1)     // Catch:{ all -> 0x0068 }
            throw r8     // Catch:{ all -> 0x0068 }
        L_0x0061:
            r1.notifyAll()     // Catch:{ all -> 0x0068 }
            com.onedelhi.secure.un4 r1 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)
            throw r8
        L_0x0068:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x006b:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            r8.<init>(r1)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x0073:
            r7.f29393a = r8     // Catch:{ all -> 0x0089 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "canceled"
            r8.<init>(r1)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x007d:
            java.lang.String r8 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0089 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0089 }
            r1.<init>(r8)     // Catch:{ all -> 0x0089 }
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h23.mo37149e(com.onedelhi.secure.oz3):void");
    }

    /* renamed from: f */
    public final void mo37150f(oz3 oz3, ec1<? super oz3, un4> ec1) {
        me4 timeout = oz3.timeout();
        me4 timeout2 = mo37161q().timeout();
        long j = timeout.mo40563j();
        long a = me4.f32089a.mo40565a(timeout2.mo40563j(), timeout.mo40563j());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.mo40562i(a, timeUnit);
        if (timeout.mo40559f()) {
            long d = timeout.mo40557d();
            if (timeout2.mo40559f()) {
                timeout.mo40558e(Math.min(timeout.mo40557d(), timeout2.mo40557d()));
            }
            try {
                ec1.mo17094X(oz3);
                uq1.m67403d(1);
                timeout.mo40562i(j, timeUnit);
                if (timeout2.mo40559f()) {
                    timeout.mo40558e(d);
                }
            } catch (Throwable th) {
                uq1.m67403d(1);
                timeout.mo40562i(j, TimeUnit.NANOSECONDS);
                if (timeout2.mo40559f()) {
                    timeout.mo40558e(d);
                }
                uq1.m67402c(1);
                throw th;
            }
        } else {
            if (timeout2.mo40559f()) {
                timeout.mo40558e(timeout2.mo40557d());
            }
            try {
                ec1.mo17094X(oz3);
                uq1.m67403d(1);
                timeout.mo40562i(j, timeUnit);
                if (timeout2.mo40559f()) {
                    timeout.mo40554a();
                }
            } catch (Throwable th2) {
                uq1.m67403d(1);
                timeout.mo40562i(j, TimeUnit.NANOSECONDS);
                if (timeout2.mo40559f()) {
                    timeout.mo40554a();
                }
                uq1.m67402c(1);
                throw th2;
            }
        }
        uq1.m67402c(1);
    }

    @vr2
    /* renamed from: g */
    public final C6205no mo37151g() {
        return this.f29392a;
    }

    /* renamed from: h */
    public final boolean mo37152h() {
        return this.f29395a;
    }

    @ss2
    /* renamed from: i */
    public final oz3 mo37153i() {
        return this.f29393a;
    }

    /* renamed from: j */
    public final long mo37154j() {
        return this.f29391a;
    }

    /* renamed from: k */
    public final boolean mo37155k() {
        return this.f29397b;
    }

    /* renamed from: l */
    public final boolean mo37156l() {
        return this.f29398c;
    }

    /* renamed from: m */
    public final void mo37157m(boolean z) {
        this.f29395a = z;
    }

    /* renamed from: n */
    public final void mo37158n(@ss2 oz3 oz3) {
        this.f29393a = oz3;
    }

    /* renamed from: o */
    public final void mo37159o(boolean z) {
        this.f29397b = z;
    }

    /* renamed from: p */
    public final void mo37160p(boolean z) {
        this.f29398c = z;
    }

    @uw1(name = "sink")
    @vr2
    /* renamed from: q */
    public final oz3 mo37161q() {
        return this.f29396b;
    }

    @uw1(name = "source")
    @vr2
    /* renamed from: r */
    public final x04 mo37162r() {
        return this.f29394a;
    }
}
