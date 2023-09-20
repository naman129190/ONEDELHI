package com.onedelhi.secure;

import com.onedelhi.secure.qe1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public final class bz0 extends az0<qe1.C6552g> {

    /* renamed from: com.onedelhi.secure.bz0$a */
    public static /* synthetic */ class C4716a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26580a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.wx4$b[] r0 = com.onedelhi.secure.wx4.C7195b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26580a = r0
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f26580a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bz0.C4716a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public int mo31260a(Map.Entry<?, ?> entry) {
        return ((qe1.C6552g) entry.getKey()).mo35764j();
    }

    /* renamed from: b */
    public Object mo31261b(zy0 zy0, yh2 yh2, int i) {
        return zy0.mo48471c(yh2, i);
    }

    /* renamed from: c */
    public f21<qe1.C6552g> mo31262c(Object obj) {
        return ((qe1.C6549e) obj).extensions;
    }

    /* renamed from: d */
    public f21<qe1.C6552g> mo31263d(Object obj) {
        return ((qe1.C6549e) obj).mo43410gk();
    }

    /* renamed from: e */
    public boolean mo31264e(yh2 yh2) {
        return yh2 instanceof qe1.C6549e;
    }

    /* renamed from: f */
    public void mo31265f(Object obj) {
        mo31262c(obj).mo35721I();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016d, code lost:
        r1 = java.lang.Long.valueOf(r0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <UT, UB> UB mo31266g(com.onedelhi.secure.vf3 r5, java.lang.Object r6, com.onedelhi.secure.zy0 r7, com.onedelhi.secure.f21<com.onedelhi.secure.qe1.C6552g> r8, UB r9, com.onedelhi.secure.ao4<UT, UB> r10) throws java.io.IOException {
        /*
            r4 = this;
            com.onedelhi.secure.qe1$h r6 = (com.onedelhi.secure.qe1.C6553h) r6
            int r0 = r6.mo43428d()
            com.onedelhi.secure.qe1$g r1 = r6.f34080a
            boolean r1 = r1.mo35766m()
            if (r1 == 0) goto L_0x00d2
            com.onedelhi.secure.qe1$g r1 = r6.f34080a
            boolean r1 = r1.mo35763i()
            if (r1 == 0) goto L_0x00d2
            int[] r7 = com.onedelhi.secure.bz0.C4716a.f26580a
            com.onedelhi.secure.wx4$b r1 = r6.mo43426b()
            int r1 = r1.ordinal()
            r7 = r7[r1]
            switch(r7) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009f;
                case 6: goto L_0x0096;
                case 7: goto L_0x008d;
                case 8: goto L_0x0084;
                case 9: goto L_0x007b;
                case 10: goto L_0x0072;
                case 11: goto L_0x0069;
                case 12: goto L_0x0060;
                case 13: goto L_0x0056;
                case 14: goto L_0x0042;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Type cannot be packed: "
            r7.append(r8)
            com.onedelhi.secure.qe1$g r6 = r6.f34080a
            com.onedelhi.secure.wx4$b r6 = r6.mo35762h()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L_0x0042:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37001J(r7)
            com.onedelhi.secure.qe1$g r5 = r6.f34080a
            com.onedelhi.secure.vs1$d r5 = r5.mo35767n()
            java.lang.Object r9 = com.onedelhi.secure.gs3.m49718B(r0, r7, r5, r9, r10)
            goto L_0x00cb
        L_0x0056:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37041u(r7)
            goto L_0x00cb
        L_0x0060:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37040t(r7)
            goto L_0x00cb
        L_0x0069:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37046z(r7)
            goto L_0x00cb
        L_0x0072:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo36999H(r7)
            goto L_0x00cb
        L_0x007b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37044x(r7)
            goto L_0x00cb
        L_0x0084:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37029k(r7)
            goto L_0x00cb
        L_0x008d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37030l(r7)
            goto L_0x00cb
        L_0x0096:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37025g(r7)
            goto L_0x00cb
        L_0x009f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo36992A(r7)
            goto L_0x00cb
        L_0x00a8:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo36996E(r7)
            goto L_0x00cb
        L_0x00b1:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37009R(r7)
            goto L_0x00cb
        L_0x00ba:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37026h(r7)
            goto L_0x00cb
        L_0x00c3:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.mo37043w(r7)
        L_0x00cb:
            com.onedelhi.secure.qe1$g r5 = r6.f34080a
            r8.mo35724O(r5, r7)
            goto L_0x01b5
        L_0x00d2:
            r1 = 0
            com.onedelhi.secure.wx4$b r2 = r6.mo43426b()
            com.onedelhi.secure.wx4$b r3 = com.onedelhi.secure.wx4.C7195b.ENUM
            if (r2 != r3) goto L_0x00f0
            int r5 = r5.mo36998G()
            com.onedelhi.secure.qe1$g r7 = r6.f34080a
            com.onedelhi.secure.vs1$d r7 = r7.mo35767n()
            com.onedelhi.secure.vs1$c r7 = r7.mo32393a(r5)
            if (r7 != 0) goto L_0x015f
            java.lang.Object r5 = com.onedelhi.secure.gs3.m49738Q(r0, r5, r9, r10)
            return r5
        L_0x00f0:
            int[] r10 = com.onedelhi.secure.bz0.C4716a.f26580a
            com.onedelhi.secure.wx4$b r0 = r6.mo43426b()
            int r0 = r0.ordinal()
            r10 = r10[r0]
            switch(r10) {
                case 1: goto L_0x017b;
                case 2: goto L_0x0172;
                case 3: goto L_0x0169;
                case 4: goto L_0x0164;
                case 5: goto L_0x015b;
                case 6: goto L_0x0156;
                case 7: goto L_0x0151;
                case 8: goto L_0x0148;
                case 9: goto L_0x0143;
                case 10: goto L_0x013e;
                case 11: goto L_0x0139;
                case 12: goto L_0x0134;
                case 13: goto L_0x012f;
                case 14: goto L_0x0127;
                case 15: goto L_0x0122;
                case 16: goto L_0x011d;
                case 17: goto L_0x010f;
                case 18: goto L_0x0101;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            goto L_0x0183
        L_0x0101:
            com.onedelhi.secure.yh2 r10 = r6.mo43427c()
            java.lang.Class r10 = r10.getClass()
            java.lang.Object r1 = r5.mo37028j(r10, r7)
            goto L_0x0183
        L_0x010f:
            com.onedelhi.secure.yh2 r10 = r6.mo43427c()
            java.lang.Class r10 = r10.getClass()
            java.lang.Object r1 = r5.mo37017a(r10, r7)
            goto L_0x0183
        L_0x011d:
            java.lang.String r1 = r5.mo37023e()
            goto L_0x0183
        L_0x0122:
            com.onedelhi.secure.er r1 = r5.mo37007P()
            goto L_0x0183
        L_0x0127:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Shouldn't reach here."
            r5.<init>(r6)
            throw r5
        L_0x012f:
            long r0 = r5.mo37000I()
            goto L_0x016d
        L_0x0134:
            int r5 = r5.mo37004M()
            goto L_0x015f
        L_0x0139:
            long r0 = r5.mo37019b()
            goto L_0x016d
        L_0x013e:
            int r5 = r5.mo37010S()
            goto L_0x015f
        L_0x0143:
            int r5 = r5.mo37032n()
            goto L_0x015f
        L_0x0148:
            boolean r5 = r5.mo37006O()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            goto L_0x0183
        L_0x0151:
            int r5 = r5.mo37031m()
            goto L_0x015f
        L_0x0156:
            long r0 = r5.mo37021c()
            goto L_0x016d
        L_0x015b:
            int r5 = r5.mo36998G()
        L_0x015f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x0183
        L_0x0164:
            long r0 = r5.mo37035q()
            goto L_0x016d
        L_0x0169:
            long r0 = r5.mo37005N()
        L_0x016d:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x0183
        L_0x0172:
            float r5 = r5.readFloat()
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            goto L_0x0183
        L_0x017b:
            double r0 = r5.readDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0183:
            boolean r5 = r6.mo43429f()
            if (r5 == 0) goto L_0x018f
            com.onedelhi.secure.qe1$g r5 = r6.f34080a
            r8.mo35732h(r5, r1)
            goto L_0x01b5
        L_0x018f:
            int[] r5 = com.onedelhi.secure.bz0.C4716a.f26580a
            com.onedelhi.secure.wx4$b r7 = r6.mo43426b()
            int r7 = r7.ordinal()
            r5 = r5[r7]
            r7 = 17
            if (r5 == r7) goto L_0x01a4
            r7 = 18
            if (r5 == r7) goto L_0x01a4
            goto L_0x01b0
        L_0x01a4:
            com.onedelhi.secure.qe1$g r5 = r6.f34080a
            java.lang.Object r5 = r8.mo35739u(r5)
            if (r5 == 0) goto L_0x01b0
            java.lang.Object r1 = com.onedelhi.secure.vs1.m68450v(r5, r1)
        L_0x01b0:
            com.onedelhi.secure.qe1$g r5 = r6.f34080a
            r8.mo35724O(r5, r1)
        L_0x01b5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bz0.mo31266g(com.onedelhi.secure.vf3, java.lang.Object, com.onedelhi.secure.zy0, com.onedelhi.secure.f21, java.lang.Object, com.onedelhi.secure.ao4):java.lang.Object");
    }

    /* renamed from: h */
    public void mo31267h(vf3 vf3, Object obj, zy0 zy0, f21<qe1.C6552g> f21) throws IOException {
        qe1.C6553h hVar = (qe1.C6553h) obj;
        f21.mo35724O(hVar.f34080a, vf3.mo37028j(hVar.mo43427c().getClass(), zy0));
    }

    /* renamed from: i */
    public void mo31268i(C5173er erVar, Object obj, zy0 zy0, f21<qe1.C6552g> f21) throws IOException {
        qe1.C6553h hVar = (qe1.C6553h) obj;
        yh2 Ja = hVar.mo43427c().mo43350V8().mo43377Ja();
        C7055vk U = C7055vk.m68101U(ByteBuffer.wrap(erVar.mo35538d0()), true);
        p63.m60498a().mo42382f(Ja, U, zy0);
        f21.mo35724O(hVar.f34080a, Ja);
        if (U.mo36994C() != Integer.MAX_VALUE) {
            throw nt1.m58782c();
        }
    }

    /* renamed from: j */
    public void mo31269j(ty4 ty4, Map.Entry<?, ?> entry) throws IOException {
        qe1.C6552g gVar = (qe1.C6552g) entry.getKey();
        if (gVar.mo35766m()) {
            switch (C4716a.f26580a[gVar.mo35762h().ordinal()]) {
                case 1:
                    gs3.m49746Y(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 2:
                    gs3.m49761g0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 3:
                    gs3.m49773m0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 4:
                    gs3.m49727F0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 5:
                case 14:
                    gs3.m49769k0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 6:
                    gs3.m49757e0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 7:
                    gs3.m49753c0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 8:
                    gs3.m49742U(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 9:
                    gs3.m49723D0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 10:
                    gs3.m49785s0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 11:
                    gs3.m49789u0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 12:
                    gs3.m49793w0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 13:
                    gs3.m49797y0(gVar.mo35764j(), (List) entry.getValue(), ty4, gVar.mo35763i());
                    return;
                case 15:
                    gs3.m49744W(gVar.mo35764j(), (List) entry.getValue(), ty4);
                    return;
                case 16:
                    gs3.m49719B0(gVar.mo35764j(), (List) entry.getValue(), ty4);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        gs3.m49765i0(gVar.mo35764j(), (List) entry.getValue(), ty4, p63.m60498a().mo42385i(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        gs3.m49781q0(gVar.mo35764j(), (List) entry.getValue(), ty4, p63.m60498a().mo42385i(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C4716a.f26580a[gVar.mo35762h().ordinal()]) {
                case 1:
                    ty4.mo38315B(gVar.mo35764j(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    ty4.mo38317D(gVar.mo35764j(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    ty4.mo38347h(gVar.mo35764j(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    ty4.mo38314A(gVar.mo35764j(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    ty4.mo38359t(gVar.mo35764j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    ty4.mo38362w(gVar.mo35764j(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    ty4.mo38351l(gVar.mo35764j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    ty4.mo38342c(gVar.mo35764j(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    ty4.mo38354o(gVar.mo35764j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    ty4.mo38325L(gVar.mo35764j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    ty4.mo38343d(gVar.mo35764j(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    ty4.mo38348i(gVar.mo35764j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    ty4.mo38358s(gVar.mo35764j(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    ty4.mo38345f(gVar.mo35764j(), (C5173er) entry.getValue());
                    return;
                case 16:
                    ty4.mo38355p(gVar.mo35764j(), (String) entry.getValue());
                    return;
                case 17:
                    ty4.mo38341b(gVar.mo35764j(), entry.getValue(), p63.m60498a().mo42385i(entry.getValue().getClass()));
                    return;
                case 18:
                    ty4.mo38352m(gVar.mo35764j(), entry.getValue(), p63.m60498a().mo42385i(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: k */
    public void mo31270k(Object obj, f21<qe1.C6552g> f21) {
        ((qe1.C6549e) obj).extensions = f21;
    }
}
