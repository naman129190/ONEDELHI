package com.onedelhi.secure;

import androidx.appcompat.widget.SearchView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.onedelhi.secure.wv1;

public class kx3 {

    /* renamed from: a */
    public static wv1.C3876a f15103a = wv1.C3876a.m31144a(SearchView.f1546d, "c", "w", "o", "lc", "lj", "ml", "hd", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG);

    /* renamed from: b */
    public static final wv1.C3876a f15104b = wv1.C3876a.m31144a(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "v");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.jx3 m20071a(com.onedelhi.secure.wv1 r18, com.onedelhi.secure.la2 r19) throws java.io.IOException {
        /*
            r0 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1 = 0
            r4 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0012:
            boolean r13 = r18.mo17970h()
            if (r13 == 0) goto L_0x00fc
            com.onedelhi.secure.wv1$a r13 = f15103a
            int r13 = r0.mo17956M(r13)
            r14 = 1
            switch(r13) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00be;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00ad;
                case 8: goto L_0x0028;
                default: goto L_0x0022;
            }
        L_0x0022:
            r2 = r19
            r18.mo17963Y()
            goto L_0x0012
        L_0x0028:
            r18.mo17964b()
        L_0x002b:
            boolean r13 = r18.mo17970h()
            if (r13 == 0) goto L_0x0099
            r18.mo17965c()
            r13 = 0
            r15 = 0
        L_0x0036:
            boolean r16 = r18.mo17970h()
            if (r16 == 0) goto L_0x0057
            com.onedelhi.secure.wv1$a r2 = f15104b
            int r2 = r0.mo17956M(r2)
            if (r2 == 0) goto L_0x0052
            if (r2 == r14) goto L_0x004d
            r18.mo17962X()
            r18.mo17963Y()
            goto L_0x0036
        L_0x004d:
            com.onedelhi.secure.j6 r15 = com.onedelhi.secure.C3976y6.m31968e(r18, r19)
            goto L_0x0036
        L_0x0052:
            java.lang.String r13 = r18.mo17951A()
            goto L_0x0036
        L_0x0057:
            r18.mo17969g()
            r13.hashCode()
            int r17 = r13.hashCode()
            switch(r17) {
                case 100: goto L_0x007c;
                case 103: goto L_0x0071;
                case 111: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            r2 = -1
            goto L_0x0086
        L_0x0066:
            java.lang.String r2 = "o"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x006f
            goto L_0x0064
        L_0x006f:
            r2 = 2
            goto L_0x0086
        L_0x0071:
            java.lang.String r2 = "g"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x007a
            goto L_0x0064
        L_0x007a:
            r2 = 1
            goto L_0x0086
        L_0x007c:
            java.lang.String r2 = "d"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0085
            goto L_0x0064
        L_0x0085:
            r2 = 0
        L_0x0086:
            switch(r2) {
                case 0: goto L_0x0090;
                case 1: goto L_0x0090;
                case 2: goto L_0x008c;
                default: goto L_0x0089;
            }
        L_0x0089:
            r2 = r19
            goto L_0x002b
        L_0x008c:
            r2 = r19
            r5 = r15
            goto L_0x002b
        L_0x0090:
            r2 = r19
            r2.mo19395w(r14)
            r3.add(r15)
            goto L_0x002b
        L_0x0099:
            r2 = r19
            r18.mo17967d()
            int r13 = r3.size()
            if (r13 != r14) goto L_0x0012
            java.lang.Object r13 = r3.get(r1)
            r3.add(r13)
            goto L_0x0012
        L_0x00ad:
            r2 = r19
            boolean r12 = r18.mo17972l()
            goto L_0x0012
        L_0x00b5:
            r2 = r19
            double r13 = r18.mo17974m()
            float r11 = (float) r13
            goto L_0x0012
        L_0x00be:
            r2 = r19
            com.onedelhi.secure.jx3$c[] r10 = com.onedelhi.secure.jx3.C2581c.values()
            int r13 = r18.mo17976p()
            int r13 = r13 - r14
            r10 = r10[r13]
            goto L_0x0012
        L_0x00cd:
            r2 = r19
            com.onedelhi.secure.jx3$b[] r9 = com.onedelhi.secure.jx3.C2580b.values()
            int r13 = r18.mo17976p()
            int r13 = r13 - r14
            r9 = r9[r13]
            goto L_0x0012
        L_0x00dc:
            r2 = r19
            com.onedelhi.secure.l6 r7 = com.onedelhi.secure.C3976y6.m31971h(r18, r19)
            goto L_0x0012
        L_0x00e4:
            r2 = r19
            com.onedelhi.secure.j6 r8 = com.onedelhi.secure.C3976y6.m31968e(r18, r19)
            goto L_0x0012
        L_0x00ec:
            r2 = r19
            com.onedelhi.secure.i6 r6 = com.onedelhi.secure.C3976y6.m31966c(r18, r19)
            goto L_0x0012
        L_0x00f4:
            r2 = r19
            java.lang.String r4 = r18.mo17951A()
            goto L_0x0012
        L_0x00fc:
            com.onedelhi.secure.jx3 r13 = new com.onedelhi.secure.jx3
            r0 = r13
            r1 = r4
            r2 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.kx3.m20071a(com.onedelhi.secure.wv1, com.onedelhi.secure.la2):com.onedelhi.secure.jx3");
    }
}
