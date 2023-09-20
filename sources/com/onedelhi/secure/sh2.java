package com.onedelhi.secure;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0014\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/sh2;", "Ljava/io/Closeable;", "Lcom/onedelhi/secure/no;", "buffer", "Lcom/onedelhi/secure/un4;", "a", "close", "Lcom/onedelhi/secure/fr;", "suffix", "", "b", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class sh2 implements Closeable {

    /* renamed from: a */
    public final di0 f35076a;

    /* renamed from: a */
    public final C6205no f35077a;

    /* renamed from: a */
    public final Deflater f35078a;

    /* renamed from: b */
    public final boolean f35079b;

    public sh2(boolean z) {
        this.f35079b = z;
        C6205no noVar = new C6205no();
        this.f35077a = noVar;
        Deflater deflater = new Deflater(-1, true);
        this.f35078a = deflater;
        this.f35076a = new di0((oz3) noVar, deflater);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44353a(@com.onedelhi.secure.vr2 com.onedelhi.secure.C6205no r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "buffer"
            com.onedelhi.secure.jt1.m53777p(r8, r0)
            com.onedelhi.secure.no r0 = r7.f35077a
            long r0 = r0.mo41244V0()
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0068
            boolean r0 = r7.f35079b
            if (r0 == 0) goto L_0x0021
            java.util.zip.Deflater r0 = r7.f35078a
            r0.reset()
        L_0x0021:
            com.onedelhi.secure.di0 r0 = r7.f35076a
            long r4 = r8.mo41244V0()
            r0.write(r8, r4)
            com.onedelhi.secure.di0 r0 = r7.f35076a
            r0.flush()
            com.onedelhi.secure.no r0 = r7.f35077a
            com.onedelhi.secure.fr r1 = com.onedelhi.secure.th2.f35626a
            boolean r0 = r7.mo44354b(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.onedelhi.secure.no r0 = r7.f35077a
            long r0 = r0.mo41244V0()
            r3 = 4
            long r3 = (long) r3
            long r0 = r0 - r3
            com.onedelhi.secure.no r3 = r7.f35077a
            r4 = 0
            com.onedelhi.secure.no$a r2 = com.onedelhi.secure.C6205no.m58321u0(r3, r4, r2, r4)
            r2.mo41301c(r0)     // Catch:{ all -> 0x0052 }
            com.onedelhi.secure.C5630hz.m51313a(r2, r4)
            goto L_0x005e
        L_0x0052:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r2, r8)
            throw r0
        L_0x0059:
            com.onedelhi.secure.no r0 = r7.f35077a
            r0.mo41230L0(r3)
        L_0x005e:
            com.onedelhi.secure.no r0 = r7.f35077a
            long r1 = r0.mo41244V0()
            r8.write(r0, r1)
            return
        L_0x0068:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sh2.mo44353a(com.onedelhi.secure.no):void");
    }

    /* renamed from: b */
    public final boolean mo44354b(C6205no noVar, C5301fr frVar) {
        return noVar.mo31676O(noVar.mo41244V0() - ((long) frVar.mo36274j0()), frVar);
    }

    public void close() throws IOException {
        this.f35076a.close();
    }
}
