package com.onedelhi.secure;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.onedelhi.secure.wv1;

public class i70 {

    /* renamed from: a */
    public static wv1.C3876a f13505a = wv1.C3876a.m31144a("ty", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (r2.equals(com.onedelhi.secure.C5421gf.f29147a) == false) goto L_0x0034;
     */
    @com.onedelhi.secure.ts2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.h70 m17253a(com.onedelhi.secure.wv1 r7, com.onedelhi.secure.la2 r8) throws java.io.IOException {
        /*
            r7.mo17965c()
            r0 = 2
            r1 = 2
        L_0x0005:
            boolean r2 = r7.mo17970h()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0028
            com.onedelhi.secure.wv1$a r2 = f13505a
            int r2 = r7.mo17956M(r2)
            if (r2 == 0) goto L_0x0023
            if (r2 == r3) goto L_0x001e
            r7.mo17962X()
            r7.mo17963Y()
            goto L_0x0005
        L_0x001e:
            int r1 = r7.mo17976p()
            goto L_0x0005
        L_0x0023:
            java.lang.String r2 = r7.mo17951A()
            goto L_0x0029
        L_0x0028:
            r2 = r4
        L_0x0029:
            if (r2 != 0) goto L_0x002c
            return r4
        L_0x002c:
            r5 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case 3239: goto L_0x00c4;
                case 3270: goto L_0x00b8;
                case 3295: goto L_0x00ae;
                case 3307: goto L_0x00a3;
                case 3308: goto L_0x0098;
                case 3488: goto L_0x008d;
                case 3633: goto L_0x0082;
                case 3646: goto L_0x0077;
                case 3669: goto L_0x006b;
                case 3679: goto L_0x005e;
                case 3681: goto L_0x0051;
                case 3705: goto L_0x0044;
                case 3710: goto L_0x0037;
                default: goto L_0x0034;
            }
        L_0x0034:
            r0 = -1
            goto L_0x00cf
        L_0x0037:
            java.lang.String r0 = "tr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0040
            goto L_0x0034
        L_0x0040:
            r0 = 12
            goto L_0x00cf
        L_0x0044:
            java.lang.String r0 = "tm"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0034
        L_0x004d:
            r0 = 11
            goto L_0x00cf
        L_0x0051:
            java.lang.String r0 = "st"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x0034
        L_0x005a:
            r0 = 10
            goto L_0x00cf
        L_0x005e:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x0034
        L_0x0067:
            r0 = 9
            goto L_0x00cf
        L_0x006b:
            java.lang.String r0 = "sh"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0074
            goto L_0x0034
        L_0x0074:
            r0 = 8
            goto L_0x00cf
        L_0x0077:
            java.lang.String r0 = "rp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0080
            goto L_0x0034
        L_0x0080:
            r0 = 7
            goto L_0x00cf
        L_0x0082:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x008b
            goto L_0x0034
        L_0x008b:
            r0 = 6
            goto L_0x00cf
        L_0x008d:
            java.lang.String r0 = "mm"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0096
            goto L_0x0034
        L_0x0096:
            r0 = 5
            goto L_0x00cf
        L_0x0098:
            java.lang.String r0 = "gs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a1
            goto L_0x0034
        L_0x00a1:
            r0 = 4
            goto L_0x00cf
        L_0x00a3:
            java.lang.String r0 = "gr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ac
            goto L_0x0034
        L_0x00ac:
            r0 = 3
            goto L_0x00cf
        L_0x00ae:
            java.lang.String r3 = "gf"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00cf
            goto L_0x0034
        L_0x00b8:
            java.lang.String r0 = "fl"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00c2
            goto L_0x0034
        L_0x00c2:
            r0 = 1
            goto L_0x00cf
        L_0x00c4:
            java.lang.String r0 = "el"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ce
            goto L_0x0034
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            switch(r0) {
                case 0: goto L_0x0128;
                case 1: goto L_0x0123;
                case 2: goto L_0x011e;
                case 3: goto L_0x0119;
                case 4: goto L_0x0114;
                case 5: goto L_0x010a;
                case 6: goto L_0x0105;
                case 7: goto L_0x0100;
                case 8: goto L_0x00fb;
                case 9: goto L_0x00f6;
                case 10: goto L_0x00f1;
                case 11: goto L_0x00ec;
                case 12: goto L_0x00e7;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unknown shape type "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.onedelhi.secure.p92.m24544e(r8)
            goto L_0x012c
        L_0x00e7:
            com.onedelhi.secure.v6 r4 = com.onedelhi.secure.C3833w6.m30692g(r7, r8)
            goto L_0x012c
        L_0x00ec:
            com.onedelhi.secure.lx3 r4 = com.onedelhi.secure.mx3.m22171a(r7, r8)
            goto L_0x012c
        L_0x00f1:
            com.onedelhi.secure.jx3 r4 = com.onedelhi.secure.kx3.m20071a(r7, r8)
            goto L_0x012c
        L_0x00f6:
            com.onedelhi.secure.i33 r4 = com.onedelhi.secure.j33.m18097a(r7, r8)
            goto L_0x012c
        L_0x00fb:
            com.onedelhi.secure.gx3 r4 = com.onedelhi.secure.ix3.m17959a(r7, r8)
            goto L_0x012c
        L_0x0100:
            com.onedelhi.secure.li3 r4 = com.onedelhi.secure.ni3.m22858a(r7, r8)
            goto L_0x012c
        L_0x0105:
            com.onedelhi.secure.sg3 r4 = com.onedelhi.secure.tg3.m28429a(r7, r8)
            goto L_0x012c
        L_0x010a:
            com.onedelhi.secure.nh2 r4 = com.onedelhi.secure.ph2.m24721a(r7)
            java.lang.String r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r8.mo19372a(r0)
            goto L_0x012c
        L_0x0114:
            com.onedelhi.secure.li1 r4 = com.onedelhi.secure.ni1.m22829a(r7, r8)
            goto L_0x012c
        L_0x0119:
            com.onedelhi.secure.bx3 r4 = com.onedelhi.secure.cx3.m12787a(r7, r8)
            goto L_0x012c
        L_0x011e:
            com.onedelhi.secure.ii1 r4 = com.onedelhi.secure.ki1.m19812a(r7, r8)
            goto L_0x012c
        L_0x0123:
            com.onedelhi.secure.zw3 r4 = com.onedelhi.secure.ax3.m11459a(r7, r8)
            goto L_0x012c
        L_0x0128:
            com.onedelhi.secure.dy r4 = com.onedelhi.secure.C2105ey.m14454a(r7, r8, r1)
        L_0x012c:
            boolean r8 = r7.mo17970h()
            if (r8 == 0) goto L_0x0136
            r7.mo17963Y()
            goto L_0x012c
        L_0x0136:
            r7.mo17969g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.i70.m17253a(com.onedelhi.secure.wv1, com.onedelhi.secure.la2):com.onedelhi.secure.h70");
    }
}
