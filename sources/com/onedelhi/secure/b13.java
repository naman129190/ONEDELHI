package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/b13;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/un4;", "close", "Lcom/onedelhi/secure/to;", "upstream", "<init>", "(Lcom/onedelhi/secure/to;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class b13 implements x04 {

    /* renamed from: a */
    public final C6205no f26088a;

    /* renamed from: a */
    public final C6893to f26089a;

    /* renamed from: a */
    public ws3 f26090a;

    /* renamed from: b */
    public long f26091b;

    /* renamed from: b */
    public boolean f26092b;

    /* renamed from: n */
    public int f26093n;

    public b13(@vr2 C6893to toVar) {
        jt1.m53777p(toVar, "upstream");
        this.f26089a = toVar;
        C6205no e = toVar.mo31682e();
        this.f26088a = e;
        ws3 ws3 = e.f32655a;
        this.f26090a = ws3;
        this.f26093n = ws3 != null ? ws3.f37108a : -1;
    }

    public void close() {
        this.f26092b = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f37108a) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long read(@com.onedelhi.secure.vr2 com.onedelhi.secure.C6205no r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            com.onedelhi.secure.jt1.m53777p(r9, r0)
            r0 = 0
            r1 = 0
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x000f
            r5 = 1
            goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.f26092b
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x007b
            com.onedelhi.secure.ws3 r5 = r8.f26090a
            if (r5 == 0) goto L_0x002a
            com.onedelhi.secure.no r6 = r8.f26088a
            com.onedelhi.secure.ws3 r6 = r6.f32655a
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f26093n
            com.onedelhi.secure.jt1.m53774m(r6)
            int r6 = r6.f37108a
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 == 0) goto L_0x006f
            if (r4 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.onedelhi.secure.to r0 = r8.f26089a
            long r1 = r8.f26091b
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo31677T(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            com.onedelhi.secure.ws3 r0 = r8.f26090a
            if (r0 != 0) goto L_0x0053
            com.onedelhi.secure.no r0 = r8.f26088a
            com.onedelhi.secure.ws3 r0 = r0.f32655a
            if (r0 == 0) goto L_0x0053
            r8.f26090a = r0
            com.onedelhi.secure.jt1.m53774m(r0)
            int r0 = r0.f37108a
            r8.f26093n = r0
        L_0x0053:
            com.onedelhi.secure.no r0 = r8.f26088a
            long r0 = r0.mo41244V0()
            long r2 = r8.f26091b
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            com.onedelhi.secure.no r2 = r8.f26088a
            long r4 = r8.f26091b
            r3 = r9
            r6 = r10
            r2.mo41278m(r3, r4, r6)
            long r0 = r8.f26091b
            long r0 = r0 + r10
            r8.f26091b = r0
            return r10
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0087:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b13.read(com.onedelhi.secure.no, long):long");
    }

    @vr2
    public me4 timeout() {
        return this.f26089a.timeout();
    }
}
