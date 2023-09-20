package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u0005\u001a\u00028\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000\"\u0004\b\u0001\u0010\u0002*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006\u000b"}, d2 = {"Ljava/lang/AutoCloseable;", "T", "R", "Lkotlin/Function1;", "block", "b", "(Ljava/lang/AutoCloseable;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "", "cause", "Lcom/onedelhi/secure/un4;", "a", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 6, 0}, pn = "kotlin")
@uw1(name = "AutoCloseableKt")
/* renamed from: com.onedelhi.secure.jd */
public final class C5811jd {
    @gz3(version = "1.2")
    @z73
    /* renamed from: a */
    public static final void m53265a(@ss2 AutoCloseable autoCloseable, @ss2 Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                pw0.m61687a(th, th2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        m53265a(r2, r3);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    @com.onedelhi.secure.gz3(version = "1.2")
    @com.onedelhi.secure.xq1
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.lang.AutoCloseable, R> R m53266b(T r2, com.onedelhi.secure.ec1<? super T, ? extends R> r3) {
        /*
            java.lang.String r0 = "block"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            r0 = 1
            java.lang.Object r3 = r3.mo17094X(r2)     // Catch:{ all -> 0x0015 }
            com.onedelhi.secure.uq1.m67403d(r0)
            r1 = 0
            m53265a(r2, r1)
            com.onedelhi.secure.uq1.m67402c(r0)
            return r3
        L_0x0015:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r1 = move-exception
            com.onedelhi.secure.uq1.m67403d(r0)
            m53265a(r2, r3)
            com.onedelhi.secure.uq1.m67402c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5811jd.m53266b(java.lang.AutoCloseable, com.onedelhi.secure.ec1):java.lang.Object");
    }
}
