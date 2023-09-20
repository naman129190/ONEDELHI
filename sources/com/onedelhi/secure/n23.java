package com.onedelhi.secure;

import java.lang.reflect.Method;
import java.util.regex.MatchResult;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/n23;", "", "", "cause", "exception", "Lcom/onedelhi/secure/un4;", "a", "", "d", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lcom/onedelhi/secure/zd2;", "c", "Lcom/onedelhi/secure/me3;", "b", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public class n23 {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/onedelhi/secure/n23$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.n23$a */
    public static final class C6164a {
        @vr2

        /* renamed from: a */
        public static final C6164a f32344a = new C6164a();
        @rw1
        @ss2

        /* renamed from: a */
        public static final Method f32345a;
        @rw1
        @ss2

        /* renamed from: b */
        public static final Method f32346b;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                com.onedelhi.secure.n23$a r0 = new com.onedelhi.secure.n23$a
                r0.<init>()
                f32344a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                com.onedelhi.secure.jt1.m53776o(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = com.onedelhi.secure.jt1.m53768g(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                com.onedelhi.secure.jt1.m53776o(r7, r8)
                java.lang.Object r7 = com.onedelhi.secure.C4478ab.m36978au(r7)
                boolean r7 = com.onedelhi.secure.jt1.m53768g(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = 0
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f32345a = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = com.onedelhi.secure.jt1.m53768g(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f32346b = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.n23.C6164a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo37549a(@vr2 Throwable th, @vr2 Throwable th2) {
        jt1.m53777p(th, "cause");
        jt1.m53777p(th2, "exception");
        Method method = C6164a.f32345a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    @vr2
    /* renamed from: b */
    public me3 mo38244b() {
        return new zz0();
    }

    @ss2
    /* renamed from: c */
    public zd2 mo38245c(@vr2 MatchResult matchResult, @vr2 String str) {
        jt1.m53777p(matchResult, "matchResult");
        jt1.m53777p(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r3 = com.onedelhi.secure.C7458za.m72983t((java.lang.Throwable[]) (r3 = r0.invoke(r3, new java.lang.Object[0])));
     */
    @com.onedelhi.secure.vr2
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.Throwable> mo37550d(@com.onedelhi.secure.vr2 java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "exception"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.reflect.Method r0 = com.onedelhi.secure.n23.C6164a.f32346b
            if (r0 == 0) goto L_0x001a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L_0x001a
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = com.onedelhi.secure.C7458za.m72983t(r3)
            if (r3 != 0) goto L_0x001e
        L_0x001a:
            java.util.List r3 = com.onedelhi.secure.s00.m64037F()
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.n23.mo37550d(java.lang.Throwable):java.util.List");
    }
}
