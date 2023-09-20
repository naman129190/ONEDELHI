package com.onedelhi.secure;

import java.io.Closeable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0006\u001a\u00028\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000\"\u0004\b\u0001\u0010\u0002*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0001\u0002\u000f\n\u0005\b20\u0001\n\u0006\b\u0011(\u00050\u0001¨\u0006\f"}, d2 = {"Ljava/io/Closeable;", "T", "R", "Lkotlin/Function1;", "block", "Requires newer compiler version to be inlined correctly.", "b", "(Ljava/io/Closeable;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "", "cause", "Lcom/onedelhi/secure/un4;", "a", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "CloseableKt")
/* renamed from: com.onedelhi.secure.hz */
public final class C5630hz {
    @gz3(version = "1.1")
    @z73
    /* renamed from: a */
    public static final void m51313a(@ss2 Closeable closeable, @ss2 Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            pw0.m61687a(th, th2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (com.onedelhi.secure.o23.m58898a(1, 1, 0) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r3 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        m51313a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        throw r2;
     */
    @com.onedelhi.secure.xq1
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.io.Closeable, R> R m51314b(T r3, com.onedelhi.secure.ec1<? super T, ? extends R> r4) {
        /*
            java.lang.String r0 = "block"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            r0 = 0
            r1 = 1
            java.lang.Object r4 = r4.mo17094X(r3)     // Catch:{ all -> 0x0022 }
            com.onedelhi.secure.uq1.m67403d(r1)
            boolean r0 = com.onedelhi.secure.o23.m58898a(r1, r1, r0)
            if (r0 == 0) goto L_0x0019
            r0 = 0
            m51313a(r3, r0)
            goto L_0x001e
        L_0x0019:
            if (r3 == 0) goto L_0x001e
            r3.close()
        L_0x001e:
            com.onedelhi.secure.uq1.m67402c(r1)
            return r4
        L_0x0022:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            com.onedelhi.secure.uq1.m67403d(r1)
            boolean r0 = com.onedelhi.secure.o23.m58898a(r1, r1, r0)
            if (r0 != 0) goto L_0x0034
            if (r3 == 0) goto L_0x0037
            r3.close()     // Catch:{ all -> 0x0037 }
            goto L_0x0037
        L_0x0034:
            m51313a(r3, r4)
        L_0x0037:
            com.onedelhi.secure.uq1.m67402c(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5630hz.m51314b(java.io.Closeable, com.onedelhi.secure.ec1):java.lang.Object");
    }
}
