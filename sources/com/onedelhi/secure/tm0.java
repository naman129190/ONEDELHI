package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168 X \u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/onedelhi/secure/tm0;", "T", "Lcom/onedelhi/secure/u94;", "Lkotlinx/coroutines/SchedulerTask;", "", "m", "()Ljava/lang/Object;", "takenState", "", "cause", "Lcom/onedelhi/secure/un4;", "e", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "l", "Lcom/onedelhi/secure/b80;", "g", "()Lcom/onedelhi/secure/b80;", "delegate", "", "resumeMode", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class tm0<T> extends u94 {
    @rw1

    /* renamed from: n */
    public int f35730n;

    public tm0(int i) {
        this.f35730n = i;
    }

    /* renamed from: e */
    public void mo38895e(@ss2 Object obj, @vr2 Throwable th) {
    }

    @vr2
    /* renamed from: g */
    public abstract b80<T> mo38896g();

    @ss2
    /* renamed from: h */
    public Throwable mo38897h(@ss2 Object obj) {
        m20 m20 = obj instanceof m20 ? (m20) obj : null;
        if (m20 == null) {
            return null;
        }
        return m20.f31975a;
    }

    /* renamed from: k */
    public <T> T mo38898k(@ss2 Object obj) {
        return obj;
    }

    /* renamed from: l */
    public final void mo45182l(@ss2 Throwable th, @ss2 Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                pw0.m61687a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            jt1.m53774m(th);
            h90.m50304b(mo38896g().mo31187f(), new r90("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    @ss2
    /* renamed from: m */
    public abstract Object mo38899m();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r4.mo41920L1() != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r4.mo41920L1() != false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.onedelhi.secure.y94 r0 = r10.f36015a
            com.onedelhi.secure.b80 r1 = r10.mo38896g()     // Catch:{ all -> 0x00ab }
            com.onedelhi.secure.qm0 r1 = (com.onedelhi.secure.qm0) r1     // Catch:{ all -> 0x00ab }
            com.onedelhi.secure.b80<T> r2 = r1.f34310a     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r1.f34313b     // Catch:{ all -> 0x00ab }
            com.onedelhi.secure.b90 r3 = r2.mo31187f()     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = com.onedelhi.secure.ub4.m66925c(r3, r1)     // Catch:{ all -> 0x00ab }
            com.onedelhi.secure.l84 r4 = com.onedelhi.secure.ub4.f36021a     // Catch:{ all -> 0x00ab }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            com.onedelhi.secure.on4 r4 = com.onedelhi.secure.d90.m44811g(r2, r3, r1)     // Catch:{ all -> 0x00ab }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            com.onedelhi.secure.b90 r6 = r2.mo31187f()     // Catch:{ all -> 0x009e }
            java.lang.Object r7 = r10.mo38899m()     // Catch:{ all -> 0x009e }
            java.lang.Throwable r8 = r10.mo38897h(r7)     // Catch:{ all -> 0x009e }
            if (r8 != 0) goto L_0x003e
            int r9 = r10.f35730n     // Catch:{ all -> 0x009e }
            boolean r9 = com.onedelhi.secure.um0.m67131c(r9)     // Catch:{ all -> 0x009e }
            if (r9 == 0) goto L_0x003e
            com.onedelhi.secure.ru1$b r9 = com.onedelhi.secure.ru1.f34751a     // Catch:{ all -> 0x009e }
            com.onedelhi.secure.b90$b r6 = r6.get(r9)     // Catch:{ all -> 0x009e }
            com.onedelhi.secure.ru1 r6 = (com.onedelhi.secure.ru1) r6     // Catch:{ all -> 0x009e }
            goto L_0x003f
        L_0x003e:
            r6 = r5
        L_0x003f:
            if (r6 == 0) goto L_0x005c
            boolean r9 = r6.mo32103b()     // Catch:{ all -> 0x009e }
            if (r9 != 0) goto L_0x005c
            java.util.concurrent.CancellationException r6 = r6.mo32113h()     // Catch:{ all -> 0x009e }
            r10.mo38895e(r7, r6)     // Catch:{ all -> 0x009e }
            com.onedelhi.secure.nl3$a r7 = com.onedelhi.secure.nl3.f32575a     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = com.onedelhi.secure.pl3.m61423a(r6)     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = com.onedelhi.secure.nl3.m58187b(r6)     // Catch:{ all -> 0x009e }
        L_0x0058:
            r2.mo31191m0(r6)     // Catch:{ all -> 0x009e }
            goto L_0x0074
        L_0x005c:
            if (r8 == 0) goto L_0x0069
            com.onedelhi.secure.nl3$a r6 = com.onedelhi.secure.nl3.f32575a     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = com.onedelhi.secure.pl3.m61423a(r8)     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = com.onedelhi.secure.nl3.m58187b(r6)     // Catch:{ all -> 0x009e }
            goto L_0x0058
        L_0x0069:
            java.lang.Object r6 = r10.mo38898k(r7)     // Catch:{ all -> 0x009e }
            com.onedelhi.secure.nl3$a r7 = com.onedelhi.secure.nl3.f32575a     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = com.onedelhi.secure.nl3.m58187b(r6)     // Catch:{ all -> 0x009e }
            goto L_0x0058
        L_0x0074:
            com.onedelhi.secure.un4 r2 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x007e
            boolean r4 = r4.mo41920L1()     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x0081
        L_0x007e:
            com.onedelhi.secure.ub4.m66923a(r3, r1)     // Catch:{ all -> 0x00ab }
        L_0x0081:
            com.onedelhi.secure.nl3$a r1 = com.onedelhi.secure.nl3.f32575a     // Catch:{ all -> 0x008b }
            r0.mo37164N0()     // Catch:{ all -> 0x008b }
            java.lang.Object r0 = com.onedelhi.secure.nl3.m58187b(r2)     // Catch:{ all -> 0x008b }
            goto L_0x0096
        L_0x008b:
            r0 = move-exception
            com.onedelhi.secure.nl3$a r1 = com.onedelhi.secure.nl3.f32575a
            java.lang.Object r0 = com.onedelhi.secure.pl3.m61423a(r0)
            java.lang.Object r0 = com.onedelhi.secure.nl3.m58187b(r0)
        L_0x0096:
            java.lang.Throwable r0 = com.onedelhi.secure.nl3.m58190e(r0)
            r10.mo45182l(r5, r0)
            goto L_0x00ca
        L_0x009e:
            r2 = move-exception
            if (r4 == 0) goto L_0x00a7
            boolean r4 = r4.mo41920L1()     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x00aa
        L_0x00a7:
            com.onedelhi.secure.ub4.m66923a(r3, r1)     // Catch:{ all -> 0x00ab }
        L_0x00aa:
            throw r2     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            com.onedelhi.secure.nl3$a r2 = com.onedelhi.secure.nl3.f32575a     // Catch:{ all -> 0x00b8 }
            r0.mo37164N0()     // Catch:{ all -> 0x00b8 }
            com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = com.onedelhi.secure.nl3.m58187b(r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00c3
        L_0x00b8:
            r0 = move-exception
            com.onedelhi.secure.nl3$a r2 = com.onedelhi.secure.nl3.f32575a
            java.lang.Object r0 = com.onedelhi.secure.pl3.m61423a(r0)
            java.lang.Object r0 = com.onedelhi.secure.nl3.m58187b(r0)
        L_0x00c3:
            java.lang.Throwable r0 = com.onedelhi.secure.nl3.m58190e(r0)
            r10.mo45182l(r1, r0)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.tm0.run():void");
    }
}
