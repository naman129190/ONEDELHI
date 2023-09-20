package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0017\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\b\"\u001a\u0010\u0006\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\n\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t\"\u001a\u0010\f\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u001a\u0010\u000f\u001a\u00020\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/un4;", "f", "Lkotlin/Function0;", "", "value", "a", "ASSERTIONS_ENABLED", "Z", "b", "()Z", "DEBUG", "d", "RECOVER_STACK_TRACES", "e", "Ljava/util/concurrent/atomic/AtomicLong;", "COROUTINE_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "c", "()Ljava/util/concurrent/atomic/AtomicLong;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class bf0 {
    @vr2

    /* renamed from: a */
    public static final String f26269a = "kotlinx.coroutines.debug";
    @vr2

    /* renamed from: a */
    public static final AtomicLong f26270a = new AtomicLong(0);

    /* renamed from: a */
    public static final boolean f26271a = false;
    @vr2

    /* renamed from: b */
    public static final String f26272b = "kotlinx.coroutines.stacktrace.recovery";

    /* renamed from: b */
    public static final boolean f26273b;
    @vr2

    /* renamed from: c */
    public static final String f26274c = "auto";

    /* renamed from: c */
    public static final boolean f26275c;
    @vr2

    /* renamed from: d */
    public static final String f26276d = "on";
    @vr2

    /* renamed from: e */
    public static final String f26277e = "off";

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r0.equals(f26276d) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.equals("") != false) goto L_0x0041;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = com.onedelhi.secure.g94.m49185d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0063
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x0039
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x0030
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0027
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0043
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0063
        L_0x0027:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0063
        L_0x0030:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0041
        L_0x0039:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
        L_0x0041:
            r0 = 1
            goto L_0x0064
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0063:
            r0 = 0
        L_0x0064:
            f26273b = r0
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = com.onedelhi.secure.g94.m49186e(r0, r1)
            if (r0 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            f26275c = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            f26270a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bf0.<clinit>():void");
    }

    @xq1
    /* renamed from: a */
    public static final void m39710a(cc1<Boolean> cc1) {
    }

    /* renamed from: b */
    public static final boolean m39711b() {
        return f26271a;
    }

    @vr2
    /* renamed from: c */
    public static final AtomicLong m39712c() {
        return f26270a;
    }

    /* renamed from: d */
    public static final boolean m39713d() {
        return f26273b;
    }

    /* renamed from: e */
    public static final boolean m39714e() {
        return f26275c;
    }

    /* renamed from: f */
    public static final void m39715f() {
        f26270a.set(0);
    }
}
