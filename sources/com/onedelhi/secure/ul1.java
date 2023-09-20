package com.onedelhi.secure;

import com.onedelhi.secure.gx4;
import com.onedelhi.secure.m60;
import com.onedelhi.secure.o60;
import com.onedelhi.secure.wj0;
import java.util.List;

public class ul1 extends gx4 {

    /* renamed from: a */
    public static int[] f21427a = new int[2];

    /* renamed from: com.onedelhi.secure.ul1$a */
    public static /* synthetic */ class C3723a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21428a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.gx4$b[] r0 = com.onedelhi.secure.gx4.C2288b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21428a = r0
                com.onedelhi.secure.gx4$b r1 = com.onedelhi.secure.gx4.C2288b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21428a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.gx4$b r1 = com.onedelhi.secure.gx4.C2288b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21428a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.gx4$b r1 = com.onedelhi.secure.gx4.C2288b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ul1.C3723a.<clinit>():void");
        }
    }

    public ul1(o60 o60) {
        super(o60);
        this.f12808a.f22145a = wj0.C3842a.LEFT;
        this.f12811b.f22145a = wj0.C3842a.RIGHT;
        this.f12810b = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0299, code lost:
        if (r14 != 1) goto L_0x02ee;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13813a(com.onedelhi.secure.sj0 r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = com.onedelhi.secure.ul1.C3723a.f21428a
            com.onedelhi.secure.gx4$b r1 = r8.f12804a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            com.onedelhi.secure.o60 r0 = r8.f12807a
            com.onedelhi.secure.m60 r1 = r0.f17748a
            com.onedelhi.secure.m60 r0 = r0.f17775c
            r3 = r17
            r8.mo17015q(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo17016r(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo17017s(r17)
        L_0x002e:
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            boolean r0 = r0.f22152c
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02ee
            com.onedelhi.secure.o60$b r0 = r8.f12806a
            com.onedelhi.secure.o60$b r3 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02ee
            com.onedelhi.secure.o60 r0 = r8.f12807a
            int r3 = r0.f17788f
            if (r3 == r1) goto L_0x02d3
            if (r3 == r2) goto L_0x0046
            goto L_0x02ee
        L_0x0046:
            int r1 = r0.f17792g
            r3 = -1
            if (r1 == 0) goto L_0x0081
            if (r1 != r2) goto L_0x004e
            goto L_0x0081
        L_0x004e:
            int r0 = r0.mo21613B()
            if (r0 == r3) goto L_0x0069
            if (r0 == 0) goto L_0x005a
            if (r0 == r9) goto L_0x0069
            r0 = 0
            goto L_0x007a
        L_0x005a:
            com.onedelhi.secure.o60 r0 = r8.f12807a
            com.onedelhi.secure.bt4 r1 = r0.f17746a
            com.onedelhi.secure.cl0 r1 = r1.f12803a
            int r1 = r1.f22148b
            float r1 = (float) r1
            float r0 = r0.mo21610A()
            float r1 = r1 / r0
            goto L_0x0078
        L_0x0069:
            com.onedelhi.secure.o60 r0 = r8.f12807a
            com.onedelhi.secure.bt4 r1 = r0.f17746a
            com.onedelhi.secure.cl0 r1 = r1.f12803a
            int r1 = r1.f22148b
            float r1 = (float) r1
            float r0 = r0.mo21610A()
            float r1 = r1 * r0
        L_0x0078:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x007a:
            com.onedelhi.secure.cl0 r1 = r8.f12803a
            r1.mo14196e(r0)
            goto L_0x02ee
        L_0x0081:
            com.onedelhi.secure.bt4 r1 = r0.f17746a
            com.onedelhi.secure.wj0 r12 = r1.f12808a
            com.onedelhi.secure.wj0 r13 = r1.f12811b
            com.onedelhi.secure.m60 r1 = r0.f17748a
            com.onedelhi.secure.m60 r1 = r1.f15915a
            if (r1 == 0) goto L_0x008f
            r1 = 1
            goto L_0x0090
        L_0x008f:
            r1 = 0
        L_0x0090:
            com.onedelhi.secure.m60 r2 = r0.f17765b
            com.onedelhi.secure.m60 r2 = r2.f15915a
            if (r2 == 0) goto L_0x0098
            r2 = 1
            goto L_0x0099
        L_0x0098:
            r2 = 0
        L_0x0099:
            com.onedelhi.secure.m60 r4 = r0.f17775c
            com.onedelhi.secure.m60 r4 = r4.f15915a
            if (r4 == 0) goto L_0x00a1
            r4 = 1
            goto L_0x00a2
        L_0x00a1:
            r4 = 0
        L_0x00a2:
            com.onedelhi.secure.m60 r5 = r0.f17781d
            com.onedelhi.secure.m60 r5 = r5.f15915a
            if (r5 == 0) goto L_0x00aa
            r5 = 1
            goto L_0x00ab
        L_0x00aa:
            r5 = 0
        L_0x00ab:
            int r14 = r0.mo21613B()
            if (r1 == 0) goto L_0x01ef
            if (r2 == 0) goto L_0x01ef
            if (r4 == 0) goto L_0x01ef
            if (r5 == 0) goto L_0x01ef
            com.onedelhi.secure.o60 r0 = r8.f12807a
            float r15 = r0.mo21610A()
            boolean r0 = r12.f22152c
            if (r0 == 0) goto L_0x0120
            boolean r0 = r13.f22152c
            if (r0 == 0) goto L_0x0120
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            boolean r1 = r0.f22150b
            if (r1 == 0) goto L_0x011f
            com.onedelhi.secure.wj0 r1 = r8.f12811b
            boolean r1 = r1.f22150b
            if (r1 != 0) goto L_0x00d2
            goto L_0x011f
        L_0x00d2:
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            int r0 = r0.f22148b
            com.onedelhi.secure.wj0 r1 = r8.f12808a
            int r1 = r1.f22141a
            int r2 = r0 + r1
            com.onedelhi.secure.wj0 r0 = r8.f12811b
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            int r0 = r0.f22148b
            com.onedelhi.secure.wj0 r1 = r8.f12811b
            int r1 = r1.f22141a
            int r3 = r0 - r1
            int r0 = r12.f22148b
            int r1 = r12.f22141a
            int r4 = r0 + r1
            int r0 = r13.f22148b
            int r1 = r13.f22141a
            int r5 = r0 - r1
            int[] r1 = f21427a
            r0 = r16
            r6 = r15
            r7 = r14
            r0.mo25660u(r1, r2, r3, r4, r5, r6, r7)
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            int[] r1 = f21427a
            r1 = r1[r10]
            r0.mo14196e(r1)
            com.onedelhi.secure.o60 r0 = r8.f12807a
            com.onedelhi.secure.bt4 r0 = r0.f17746a
            com.onedelhi.secure.cl0 r0 = r0.f12803a
            int[] r1 = f21427a
            r1 = r1[r9]
            r0.mo14196e(r1)
        L_0x011f:
            return
        L_0x0120:
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            boolean r1 = r0.f22152c
            if (r1 == 0) goto L_0x017d
            com.onedelhi.secure.wj0 r1 = r8.f12811b
            boolean r2 = r1.f22152c
            if (r2 == 0) goto L_0x017d
            boolean r2 = r12.f22150b
            if (r2 == 0) goto L_0x017c
            boolean r2 = r13.f22150b
            if (r2 != 0) goto L_0x0135
            goto L_0x017c
        L_0x0135:
            int r2 = r0.f22148b
            int r0 = r0.f22141a
            int r2 = r2 + r0
            int r0 = r1.f22148b
            int r1 = r1.f22141a
            int r3 = r0 - r1
            java.util.List<com.onedelhi.secure.wj0> r0 = r12.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            int r0 = r0.f22148b
            int r1 = r12.f22141a
            int r4 = r0 + r1
            java.util.List<com.onedelhi.secure.wj0> r0 = r13.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            int r0 = r0.f22148b
            int r1 = r13.f22141a
            int r5 = r0 - r1
            int[] r1 = f21427a
            r0 = r16
            r6 = r15
            r7 = r14
            r0.mo25660u(r1, r2, r3, r4, r5, r6, r7)
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            int[] r1 = f21427a
            r1 = r1[r10]
            r0.mo14196e(r1)
            com.onedelhi.secure.o60 r0 = r8.f12807a
            com.onedelhi.secure.bt4 r0 = r0.f17746a
            com.onedelhi.secure.cl0 r0 = r0.f12803a
            int[] r1 = f21427a
            r1 = r1[r9]
            r0.mo14196e(r1)
            goto L_0x017d
        L_0x017c:
            return
        L_0x017d:
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            boolean r1 = r0.f22150b
            if (r1 == 0) goto L_0x01ee
            com.onedelhi.secure.wj0 r1 = r8.f12811b
            boolean r1 = r1.f22150b
            if (r1 == 0) goto L_0x01ee
            boolean r1 = r12.f22150b
            if (r1 == 0) goto L_0x01ee
            boolean r1 = r13.f22150b
            if (r1 != 0) goto L_0x0192
            goto L_0x01ee
        L_0x0192:
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            int r0 = r0.f22148b
            com.onedelhi.secure.wj0 r1 = r8.f12808a
            int r1 = r1.f22141a
            int r2 = r0 + r1
            com.onedelhi.secure.wj0 r0 = r8.f12811b
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            int r0 = r0.f22148b
            com.onedelhi.secure.wj0 r1 = r8.f12811b
            int r1 = r1.f22141a
            int r3 = r0 - r1
            java.util.List<com.onedelhi.secure.wj0> r0 = r12.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            int r0 = r0.f22148b
            int r1 = r12.f22141a
            int r4 = r0 + r1
            java.util.List<com.onedelhi.secure.wj0> r0 = r13.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            int r0 = r0.f22148b
            int r1 = r13.f22141a
            int r5 = r0 - r1
            int[] r1 = f21427a
            r0 = r16
            r6 = r15
            r7 = r14
            r0.mo25660u(r1, r2, r3, r4, r5, r6, r7)
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            int[] r1 = f21427a
            r1 = r1[r10]
            r0.mo14196e(r1)
            com.onedelhi.secure.o60 r0 = r8.f12807a
            com.onedelhi.secure.bt4 r0 = r0.f17746a
            com.onedelhi.secure.cl0 r0 = r0.f12803a
            int[] r1 = f21427a
            r1 = r1[r9]
            goto L_0x02ce
        L_0x01ee:
            return
        L_0x01ef:
            if (r1 == 0) goto L_0x0268
            if (r4 == 0) goto L_0x0268
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            boolean r0 = r0.f22150b
            if (r0 == 0) goto L_0x0267
            com.onedelhi.secure.wj0 r0 = r8.f12811b
            boolean r0 = r0.f22150b
            if (r0 != 0) goto L_0x0200
            goto L_0x0267
        L_0x0200:
            com.onedelhi.secure.o60 r0 = r8.f12807a
            float r0 = r0.mo21610A()
            com.onedelhi.secure.wj0 r1 = r8.f12808a
            java.util.List<com.onedelhi.secure.wj0> r1 = r1.f22149b
            java.lang.Object r1 = r1.get(r10)
            com.onedelhi.secure.wj0 r1 = (com.onedelhi.secure.wj0) r1
            int r1 = r1.f22148b
            com.onedelhi.secure.wj0 r2 = r8.f12808a
            int r2 = r2.f22141a
            int r1 = r1 + r2
            com.onedelhi.secure.wj0 r2 = r8.f12811b
            java.util.List<com.onedelhi.secure.wj0> r2 = r2.f22149b
            java.lang.Object r2 = r2.get(r10)
            com.onedelhi.secure.wj0 r2 = (com.onedelhi.secure.wj0) r2
            int r2 = r2.f22148b
            com.onedelhi.secure.wj0 r4 = r8.f12811b
            int r4 = r4.f22141a
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0243
            if (r14 == 0) goto L_0x0243
            if (r14 == r9) goto L_0x0230
            goto L_0x02ee
        L_0x0230:
            int r2 = r2 - r1
            int r1 = r8.mo17007g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo17007g(r2, r9)
            if (r2 == r3) goto L_0x0257
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x0255
        L_0x0243:
            int r2 = r2 - r1
            int r1 = r8.mo17007g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo17007g(r2, r9)
            if (r2 == r3) goto L_0x0257
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x0255:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0257:
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            r0.mo14196e(r1)
            com.onedelhi.secure.o60 r0 = r8.f12807a
            com.onedelhi.secure.bt4 r0 = r0.f17746a
            com.onedelhi.secure.cl0 r0 = r0.f12803a
            r0.mo14196e(r3)
            goto L_0x02ee
        L_0x0267:
            return
        L_0x0268:
            if (r2 == 0) goto L_0x02ee
            if (r5 == 0) goto L_0x02ee
            boolean r0 = r12.f22150b
            if (r0 == 0) goto L_0x02d2
            boolean r0 = r13.f22150b
            if (r0 != 0) goto L_0x0275
            goto L_0x02d2
        L_0x0275:
            com.onedelhi.secure.o60 r0 = r8.f12807a
            float r0 = r0.mo21610A()
            java.util.List<com.onedelhi.secure.wj0> r1 = r12.f22149b
            java.lang.Object r1 = r1.get(r10)
            com.onedelhi.secure.wj0 r1 = (com.onedelhi.secure.wj0) r1
            int r1 = r1.f22148b
            int r2 = r12.f22141a
            int r1 = r1 + r2
            java.util.List<com.onedelhi.secure.wj0> r2 = r13.f22149b
            java.lang.Object r2 = r2.get(r10)
            com.onedelhi.secure.wj0 r2 = (com.onedelhi.secure.wj0) r2
            int r2 = r2.f22148b
            int r4 = r13.f22141a
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02af
            if (r14 == 0) goto L_0x029c
            if (r14 == r9) goto L_0x02af
            goto L_0x02ee
        L_0x029c:
            int r2 = r2 - r1
            int r1 = r8.mo17007g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo17007g(r2, r10)
            if (r2 == r3) goto L_0x02c3
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x02c1
        L_0x02af:
            int r2 = r2 - r1
            int r1 = r8.mo17007g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo17007g(r2, r10)
            if (r2 == r3) goto L_0x02c3
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x02c1:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02c3:
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            r0.mo14196e(r3)
            com.onedelhi.secure.o60 r0 = r8.f12807a
            com.onedelhi.secure.bt4 r0 = r0.f17746a
            com.onedelhi.secure.cl0 r0 = r0.f12803a
        L_0x02ce:
            r0.mo14196e(r1)
            goto L_0x02ee
        L_0x02d2:
            return
        L_0x02d3:
            com.onedelhi.secure.o60 r0 = r0.mo21666U()
            if (r0 == 0) goto L_0x02ee
            com.onedelhi.secure.ul1 r0 = r0.f17750a
            com.onedelhi.secure.cl0 r0 = r0.f12803a
            boolean r1 = r0.f22152c
            if (r1 == 0) goto L_0x02ee
            com.onedelhi.secure.o60 r1 = r8.f12807a
            float r1 = r1.f17744a
            int r0 = r0.f22148b
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            goto L_0x007a
        L_0x02ee:
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            boolean r1 = r0.f22150b
            if (r1 == 0) goto L_0x0410
            com.onedelhi.secure.wj0 r1 = r8.f12811b
            boolean r2 = r1.f22150b
            if (r2 != 0) goto L_0x02fc
            goto L_0x0410
        L_0x02fc:
            boolean r0 = r0.f22152c
            if (r0 == 0) goto L_0x030b
            boolean r0 = r1.f22152c
            if (r0 == 0) goto L_0x030b
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            boolean r0 = r0.f22152c
            if (r0 == 0) goto L_0x030b
            return
        L_0x030b:
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            boolean r0 = r0.f22152c
            if (r0 != 0) goto L_0x0355
            com.onedelhi.secure.o60$b r0 = r8.f12806a
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0355
            com.onedelhi.secure.o60 r0 = r8.f12807a
            int r1 = r0.f17788f
            if (r1 != 0) goto L_0x0355
            boolean r0 = r0.mo21614B0()
            if (r0 != 0) goto L_0x0355
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            com.onedelhi.secure.wj0 r1 = r8.f12811b
            java.util.List<com.onedelhi.secure.wj0> r1 = r1.f22149b
            java.lang.Object r1 = r1.get(r10)
            com.onedelhi.secure.wj0 r1 = (com.onedelhi.secure.wj0) r1
            int r0 = r0.f22148b
            com.onedelhi.secure.wj0 r2 = r8.f12808a
            int r3 = r2.f22141a
            int r0 = r0 + r3
            int r1 = r1.f22148b
            com.onedelhi.secure.wj0 r3 = r8.f12811b
            int r3 = r3.f22141a
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo14196e(r0)
            com.onedelhi.secure.wj0 r0 = r8.f12811b
            r0.mo14196e(r1)
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            r0.mo14196e(r3)
            return
        L_0x0355:
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            boolean r0 = r0.f22152c
            if (r0 != 0) goto L_0x03b9
            com.onedelhi.secure.o60$b r0 = r8.f12806a
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03b9
            int r0 = r8.f12802a
            if (r0 != r9) goto L_0x03b9
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b9
            com.onedelhi.secure.wj0 r0 = r8.f12811b
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b9
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            com.onedelhi.secure.wj0 r1 = r8.f12811b
            java.util.List<com.onedelhi.secure.wj0> r1 = r1.f22149b
            java.lang.Object r1 = r1.get(r10)
            com.onedelhi.secure.wj0 r1 = (com.onedelhi.secure.wj0) r1
            int r0 = r0.f22148b
            com.onedelhi.secure.wj0 r2 = r8.f12808a
            int r2 = r2.f22141a
            int r0 = r0 + r2
            int r1 = r1.f22148b
            com.onedelhi.secure.wj0 r2 = r8.f12811b
            int r2 = r2.f22141a
            int r1 = r1 + r2
            int r1 = r1 - r0
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            int r0 = r0.f10315d
            int r0 = java.lang.Math.min(r1, r0)
            com.onedelhi.secure.o60 r1 = r8.f12807a
            int r2 = r1.f17798i
            int r1 = r1.f17795h
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03b4
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03b4:
            com.onedelhi.secure.cl0 r1 = r8.f12803a
            r1.mo14196e(r0)
        L_0x03b9:
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            boolean r0 = r0.f22152c
            if (r0 != 0) goto L_0x03c0
            return
        L_0x03c0:
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            java.util.List<com.onedelhi.secure.wj0> r0 = r0.f22149b
            java.lang.Object r0 = r0.get(r10)
            com.onedelhi.secure.wj0 r0 = (com.onedelhi.secure.wj0) r0
            com.onedelhi.secure.wj0 r1 = r8.f12811b
            java.util.List<com.onedelhi.secure.wj0> r1 = r1.f22149b
            java.lang.Object r1 = r1.get(r10)
            com.onedelhi.secure.wj0 r1 = (com.onedelhi.secure.wj0) r1
            int r2 = r0.f22148b
            com.onedelhi.secure.wj0 r3 = r8.f12808a
            int r3 = r3.f22141a
            int r2 = r2 + r3
            int r3 = r1.f22148b
            com.onedelhi.secure.wj0 r4 = r8.f12811b
            int r4 = r4.f22141a
            int r3 = r3 + r4
            com.onedelhi.secure.o60 r4 = r8.f12807a
            float r4 = r4.mo21622E()
            if (r0 != r1) goto L_0x03f0
            int r2 = r0.f22148b
            int r3 = r1.f22148b
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x03f0:
            int r3 = r3 - r2
            com.onedelhi.secure.cl0 r0 = r8.f12803a
            int r0 = r0.f22148b
            int r3 = r3 - r0
            com.onedelhi.secure.wj0 r0 = r8.f12808a
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo14196e(r1)
            com.onedelhi.secure.wj0 r0 = r8.f12811b
            com.onedelhi.secure.wj0 r1 = r8.f12808a
            int r1 = r1.f22148b
            com.onedelhi.secure.cl0 r2 = r8.f12803a
            int r2 = r2.f22148b
            int r1 = r1 + r2
            r0.mo14196e(r1)
        L_0x0410:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ul1.mo13813a(com.onedelhi.secure.sj0):void");
    }

    /* renamed from: d */
    public void mo13814d() {
        m60 m60;
        wj0 wj0;
        int i;
        wj0 wj02;
        wj0 wj03;
        Object obj;
        List list;
        wj0 wj04;
        int i2;
        wj0 wj05;
        wj0 wj06;
        int i3;
        wj0 wj07;
        wj0 wj08;
        o60 U;
        o60 U2;
        o60 o60 = this.f12807a;
        if (o60.f17755a) {
            this.f12803a.mo14196e(o60.mo21723m0());
        }
        if (!this.f12803a.f22152c) {
            o60.C3032b H = this.f12807a.mo21630H();
            this.f12806a = H;
            if (H != o60.C3032b.MATCH_CONSTRAINT) {
                o60.C3032b bVar = o60.C3032b.MATCH_PARENT;
                if (H == bVar && (U2 = this.f12807a.mo21666U()) != null && (U2.mo21630H() == o60.C3032b.FIXED || U2.mo21630H() == bVar)) {
                    int m0 = (U2.mo21723m0() - this.f12807a.f17748a.mo20112g()) - this.f12807a.f17775c.mo20112g();
                    mo17005b(this.f12808a, U2.f17750a.f12808a, this.f12807a.f17748a.mo20112g());
                    mo17005b(this.f12811b, U2.f17750a.f12811b, -this.f12807a.f17775c.mo20112g());
                    this.f12803a.mo14196e(m0);
                    return;
                } else if (this.f12806a == o60.C3032b.FIXED) {
                    this.f12803a.mo14196e(this.f12807a.mo21723m0());
                }
            }
        } else {
            o60.C3032b bVar2 = this.f12806a;
            o60.C3032b bVar3 = o60.C3032b.MATCH_PARENT;
            if (bVar2 == bVar3 && (U = this.f12807a.mo21666U()) != null && (U.mo21630H() == o60.C3032b.FIXED || U.mo21630H() == bVar3)) {
                mo17005b(this.f12808a, U.f17750a.f12808a, this.f12807a.f17748a.mo20112g());
                mo17005b(this.f12811b, U.f17750a.f12811b, -this.f12807a.f17775c.mo20112g());
                return;
            }
        }
        cl0 cl0 = this.f12803a;
        if (cl0.f22152c) {
            o60 o602 = this.f12807a;
            if (o602.f17755a) {
                m60[] m60Arr = o602.f17759a;
                if (m60Arr[0].f15915a == null || m60Arr[1].f15915a == null) {
                    if (m60Arr[0].f15915a != null) {
                        wj08 = mo17008h(m60Arr[0]);
                        if (wj08 != null) {
                            wj07 = this.f12808a;
                            i3 = this.f12807a.f17759a[0].mo20112g();
                        } else {
                            return;
                        }
                    } else if (m60Arr[1].f15915a != null) {
                        wj0 h = mo17008h(m60Arr[1]);
                        if (h != null) {
                            mo17005b(this.f12811b, h, -this.f12807a.f17759a[1].mo20112g());
                            wj06 = this.f12808a;
                            wj05 = this.f12811b;
                            i2 = -this.f12803a.f22148b;
                            mo17005b(wj06, wj05, i2);
                            return;
                        }
                        return;
                    } else if (!(o602 instanceof jl1) && o602.mo21666U() != null && this.f12807a.mo21327r(m60.C2835b.CENTER).f15915a == null) {
                        wj08 = this.f12807a.mo21666U().f17750a.f12808a;
                        wj07 = this.f12808a;
                        i3 = this.f12807a.mo21728o0();
                    } else {
                        return;
                    }
                    mo17005b(wj07, wj08, i3);
                    wj06 = this.f12811b;
                    wj05 = this.f12808a;
                    i2 = this.f12803a.f22148b;
                    mo17005b(wj06, wj05, i2);
                    return;
                } else if (o602.mo21614B0()) {
                    this.f12808a.f22141a = this.f12807a.f17759a[0].mo20112g();
                    wj0 = this.f12811b;
                    m60 = this.f12807a.f17759a[1];
                    wj0.f22141a = -m60.mo20112g();
                } else {
                    wj0 h2 = mo17008h(this.f12807a.f17759a[0]);
                    if (h2 != null) {
                        mo17005b(this.f12808a, h2, this.f12807a.f17759a[0].mo20112g());
                    }
                    wj0 h3 = mo17008h(this.f12807a.f17759a[1]);
                    if (h3 != null) {
                        mo17005b(this.f12811b, h3, -this.f12807a.f17759a[1].mo20112g());
                    }
                    this.f12808a.f22147a = true;
                    this.f12811b.f22147a = true;
                    return;
                }
            }
        }
        if (this.f12806a == o60.C3032b.MATCH_CONSTRAINT) {
            o60 o603 = this.f12807a;
            int i4 = o603.f17788f;
            if (i4 == 2) {
                o60 U3 = o603.mo21666U();
                if (U3 != null) {
                    cl0 cl02 = U3.f17746a.f12803a;
                    this.f12803a.f22149b.add(cl02);
                    cl02.f22146a.add(this.f12803a);
                    cl0 cl03 = this.f12803a;
                    cl03.f22147a = true;
                    cl03.f22146a.add(this.f12808a);
                    list = this.f12803a.f22146a;
                    obj = this.f12811b;
                }
            } else if (i4 == 3) {
                if (o603.f17792g == 3) {
                    this.f12808a.f22144a = this;
                    this.f12811b.f22144a = this;
                    bt4 bt4 = o603.f17746a;
                    bt4.f12808a.f22144a = this;
                    bt4.f12811b.f22144a = this;
                    cl0.f22144a = this;
                    if (o603.mo21620D0()) {
                        this.f12803a.f22149b.add(this.f12807a.f17746a.f12803a);
                        this.f12807a.f17746a.f12803a.f22146a.add(this.f12803a);
                        bt4 bt42 = this.f12807a.f17746a;
                        bt42.f12803a.f22144a = this;
                        this.f12803a.f22149b.add(bt42.f12808a);
                        this.f12803a.f22149b.add(this.f12807a.f17746a.f12811b);
                        this.f12807a.f17746a.f12808a.f22146a.add(this.f12803a);
                        list = this.f12807a.f17746a.f12811b.f22146a;
                        obj = this.f12803a;
                    } else if (this.f12807a.mo21614B0()) {
                        this.f12807a.f17746a.f12803a.f22149b.add(this.f12803a);
                        list = this.f12803a.f22146a;
                        obj = this.f12807a.f17746a.f12803a;
                    } else {
                        wj04 = this.f12807a.f17746a.f12803a;
                    }
                } else {
                    cl0 cl04 = o603.f17746a.f12803a;
                    cl0.f22149b.add(cl04);
                    cl04.f22146a.add(this.f12803a);
                    this.f12807a.f17746a.f12808a.f22146a.add(this.f12803a);
                    this.f12807a.f17746a.f12811b.f22146a.add(this.f12803a);
                    cl0 cl05 = this.f12803a;
                    cl05.f22147a = true;
                    cl05.f22146a.add(this.f12808a);
                    this.f12803a.f22146a.add(this.f12811b);
                    this.f12808a.f22149b.add(this.f12803a);
                    wj04 = this.f12811b;
                }
                list = wj04.f22149b;
                obj = this.f12803a;
            }
            list.add(obj);
        }
        o60 o604 = this.f12807a;
        m60[] m60Arr2 = o604.f17759a;
        if (m60Arr2[0].f15915a == null || m60Arr2[1].f15915a == null) {
            if (m60Arr2[0].f15915a != null) {
                wj03 = mo17008h(m60Arr2[0]);
                if (wj03 != null) {
                    wj02 = this.f12808a;
                    i = this.f12807a.f17759a[0].mo20112g();
                } else {
                    return;
                }
            } else if (m60Arr2[1].f15915a != null) {
                wj0 h4 = mo17008h(m60Arr2[1]);
                if (h4 != null) {
                    mo17005b(this.f12811b, h4, -this.f12807a.f17759a[1].mo20112g());
                    mo17006c(this.f12808a, this.f12811b, -1, this.f12803a);
                    return;
                }
                return;
            } else if (!(o604 instanceof jl1) && o604.mo21666U() != null) {
                wj03 = this.f12807a.mo21666U().f17750a.f12808a;
                wj02 = this.f12808a;
                i = this.f12807a.mo21728o0();
            } else {
                return;
            }
            mo17005b(wj02, wj03, i);
            mo17006c(this.f12811b, this.f12808a, 1, this.f12803a);
        } else if (o604.mo21614B0()) {
            this.f12808a.f22141a = this.f12807a.f17759a[0].mo20112g();
            wj0 = this.f12811b;
            m60 = this.f12807a.f17759a[1];
            wj0.f22141a = -m60.mo20112g();
        } else {
            wj0 h5 = mo17008h(this.f12807a.f17759a[0]);
            wj0 h6 = mo17008h(this.f12807a.f17759a[1]);
            if (h5 != null) {
                h5.mo26584b(this);
            }
            if (h6 != null) {
                h6.mo26584b(this);
            }
            this.f12804a = gx4.C2288b.CENTER;
        }
    }

    /* renamed from: e */
    public void mo13815e() {
        wj0 wj0 = this.f12808a;
        if (wj0.f22152c) {
            this.f12807a.mo21702f2(wj0.f22148b);
        }
    }

    /* renamed from: f */
    public void mo13816f() {
        this.f12805a = null;
        this.f12808a.mo26585c();
        this.f12811b.mo26585c();
        this.f12803a.mo26585c();
        this.f12809a = false;
    }

    /* renamed from: n */
    public void mo13817n() {
        this.f12809a = false;
        this.f12808a.mo26585c();
        this.f12808a.f22152c = false;
        this.f12811b.mo26585c();
        this.f12811b.f22152c = false;
        this.f12803a.f22152c = false;
    }

    /* renamed from: p */
    public boolean mo13818p() {
        return this.f12806a != o60.C3032b.MATCH_CONSTRAINT || this.f12807a.f17788f == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f12807a.mo21756y();
    }

    /* renamed from: u */
    public final void mo25660u(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }
}
