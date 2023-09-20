package com.onedelhi.secure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class kl2 extends fl2 {

    /* renamed from: A */
    public static final int f14965A = 310;

    /* renamed from: A */
    public static final String f14966A = "negativeCross";

    /* renamed from: B */
    public static final int f14967B = 311;

    /* renamed from: B */
    public static final String f14968B = "triggerReceiver";

    /* renamed from: C */
    public static final int f14969C = 312;

    /* renamed from: C */
    public static final String f14970C = "CROSS";

    /* renamed from: D */
    public static final int f14971D = 5;

    /* renamed from: q */
    public static final String f14972q = "KeyTrigger";

    /* renamed from: r */
    public static final int f14973r = 301;

    /* renamed from: r */
    public static final String f14974r = "viewTransitionOnCross";

    /* renamed from: s */
    public static final int f14975s = 302;

    /* renamed from: s */
    public static final String f14976s = "viewTransitionOnPositiveCross";

    /* renamed from: t */
    public static final int f14977t = 303;

    /* renamed from: t */
    public static final String f14978t = "viewTransitionOnNegativeCross";

    /* renamed from: u */
    public static final int f14979u = 304;

    /* renamed from: u */
    public static final String f14980u = "postLayout";

    /* renamed from: v */
    public static final int f14981v = 305;

    /* renamed from: v */
    public static final String f14982v = "triggerSlack";

    /* renamed from: w */
    public static final int f14983w = 306;

    /* renamed from: w */
    public static final String f14984w = "triggerCollisionView";

    /* renamed from: x */
    public static final int f14985x = 307;

    /* renamed from: x */
    public static final String f14986x = "triggerCollisionId";

    /* renamed from: y */
    public static final int f14987y = 308;

    /* renamed from: y */
    public static final String f14988y = "triggerID";

    /* renamed from: z */
    public static final int f14989z = 309;

    /* renamed from: z */
    public static final String f14990z = "positiveCross";

    /* renamed from: a */
    public float f14991a;

    /* renamed from: a */
    public e81 f14992a;

    /* renamed from: a */
    public boolean f14993a;

    /* renamed from: b */
    public float f14994b;

    /* renamed from: b */
    public e81 f14995b;

    /* renamed from: b */
    public boolean f14996b;

    /* renamed from: c */
    public float f14997c;

    /* renamed from: c */
    public boolean f14998c;

    /* renamed from: d */
    public boolean f14999d;

    /* renamed from: k */
    public int f15000k = -1;

    /* renamed from: l */
    public int f15001l;

    /* renamed from: m */
    public int f15002m;

    /* renamed from: n */
    public int f15003n;

    /* renamed from: n */
    public String f15004n = null;

    /* renamed from: o */
    public int f15005o;

    /* renamed from: o */
    public String f15006o;

    /* renamed from: p */
    public int f15007p;

    /* renamed from: p */
    public String f15008p;

    /* renamed from: q */
    public int f15009q;

    public kl2() {
        int i = fl2.f12135j;
        this.f15001l = i;
        this.f15006o = null;
        this.f15008p = null;
        this.f15002m = i;
        this.f15003n = i;
        this.f14991a = 0.1f;
        this.f14993a = true;
        this.f14996b = true;
        this.f14998c = true;
        this.f14994b = Float.NaN;
        this.f14999d = false;
        this.f15005o = i;
        this.f15007p = i;
        this.f15009q = i;
        this.f14992a = new e81();
        this.f14995b = new e81();
        this.f12144i = 5;
        this.f12140a = new HashMap<>();
    }

    /* renamed from: a */
    public boolean mo13120a(int i, int i2) {
        if (i == 307) {
            this.f15003n = i2;
            return true;
        } else if (i == 308) {
            this.f15002m = mo16056u(Integer.valueOf(i2));
            return true;
        } else if (i != 311) {
            switch (i) {
                case 301:
                    this.f15009q = i2;
                    return true;
                case 302:
                    this.f15007p = i2;
                    return true;
                case 303:
                    this.f15005o = i2;
                    return true;
                default:
                    return super.mo13120a(i, i2);
            }
        } else {
            this.f15001l = i2;
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo13121b(java.lang.String r3) {
        /*
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1594793529: goto L_0x0082;
                case -966421266: goto L_0x0077;
                case -786670827: goto L_0x006c;
                case -648752941: goto L_0x0061;
                case -638126837: goto L_0x0056;
                case -76025313: goto L_0x004b;
                case -9754574: goto L_0x0040;
                case 364489912: goto L_0x0035;
                case 1301930599: goto L_0x0028;
                case 1401391082: goto L_0x001b;
                case 1535404999: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3 = -1
            goto L_0x008c
        L_0x000e:
            java.lang.String r0 = "triggerReceiver"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0017
            goto L_0x000b
        L_0x0017:
            r3 = 10
            goto L_0x008c
        L_0x001b:
            java.lang.String r0 = "postLayout"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0024
            goto L_0x000b
        L_0x0024:
            r3 = 9
            goto L_0x008c
        L_0x0028:
            java.lang.String r0 = "viewTransitionOnCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0031
            goto L_0x000b
        L_0x0031:
            r3 = 8
            goto L_0x008c
        L_0x0035:
            java.lang.String r0 = "triggerSlack"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x003e
            goto L_0x000b
        L_0x003e:
            r3 = 7
            goto L_0x008c
        L_0x0040:
            java.lang.String r0 = "viewTransitionOnNegativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0049
            goto L_0x000b
        L_0x0049:
            r3 = 6
            goto L_0x008c
        L_0x004b:
            java.lang.String r0 = "triggerCollisionView"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0054
            goto L_0x000b
        L_0x0054:
            r3 = 5
            goto L_0x008c
        L_0x0056:
            java.lang.String r0 = "negativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x005f
            goto L_0x000b
        L_0x005f:
            r3 = 4
            goto L_0x008c
        L_0x0061:
            java.lang.String r0 = "triggerID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x006a
            goto L_0x000b
        L_0x006a:
            r3 = 3
            goto L_0x008c
        L_0x006c:
            java.lang.String r0 = "triggerCollisionId"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0075
            goto L_0x000b
        L_0x0075:
            r3 = 2
            goto L_0x008c
        L_0x0077:
            java.lang.String r0 = "viewTransitionOnPositiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0080
            goto L_0x000b
        L_0x0080:
            r3 = 1
            goto L_0x008c
        L_0x0082:
            java.lang.String r0 = "positiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x008b
            goto L_0x000b
        L_0x008b:
            r3 = 0
        L_0x008c:
            switch(r3) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00a2;
                case 5: goto L_0x009f;
                case 6: goto L_0x009c;
                case 7: goto L_0x0099;
                case 8: goto L_0x0096;
                case 9: goto L_0x0093;
                case 10: goto L_0x0090;
                default: goto L_0x008f;
            }
        L_0x008f:
            return r1
        L_0x0090:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L_0x0093:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L_0x0096:
            r3 = 301(0x12d, float:4.22E-43)
            return r3
        L_0x0099:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L_0x009c:
            r3 = 303(0x12f, float:4.25E-43)
            return r3
        L_0x009f:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        L_0x00a2:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        L_0x00a5:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        L_0x00a8:
            r3 = 307(0x133, float:4.3E-43)
            return r3
        L_0x00ab:
            r3 = 302(0x12e, float:4.23E-43)
            return r3
        L_0x00ae:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.kl2.mo13121b(java.lang.String):int");
    }

    /* renamed from: c */
    public boolean mo13122c(int i, float f) {
        if (i != 305) {
            return super.mo13122c(i, f);
        }
        this.f14991a = f;
        return true;
    }

    /* renamed from: d */
    public boolean mo13123d(int i, boolean z) {
        if (i != 304) {
            return super.mo13123d(i, z);
        }
        this.f14999d = z;
        return true;
    }

    /* renamed from: e */
    public boolean mo13124e(int i, String str) {
        if (i == 309) {
            this.f15008p = str;
            return true;
        } else if (i == 310) {
            this.f15006o = str;
            return true;
        } else if (i != 312) {
            return super.mo13124e(i, str);
        } else {
            this.f15004n = str;
            return true;
        }
    }

    /* renamed from: f */
    public void mo16041f(HashMap<String, x14> hashMap) {
    }

    /* renamed from: g */
    public fl2 clone() {
        return new kl2().mo16043h(this);
    }

    /* renamed from: i */
    public void mo16044i(HashSet<String> hashSet) {
    }

    /* renamed from: v */
    public void mo19149v(float f, ql2 ql2) {
    }

    /* renamed from: w */
    public kl2 mo16043h(fl2 fl2) {
        super.mo16043h(fl2);
        kl2 kl2 = (kl2) fl2;
        this.f15000k = kl2.f15000k;
        this.f15004n = kl2.f15004n;
        this.f15001l = kl2.f15001l;
        this.f15006o = kl2.f15006o;
        this.f15008p = kl2.f15008p;
        this.f15002m = kl2.f15002m;
        this.f15003n = kl2.f15003n;
        this.f14991a = kl2.f14991a;
        this.f14993a = kl2.f14993a;
        this.f14996b = kl2.f14996b;
        this.f14998c = kl2.f14998c;
        this.f14994b = kl2.f14994b;
        this.f14997c = kl2.f14997c;
        this.f14999d = kl2.f14999d;
        this.f14992a = kl2.f14992a;
        this.f14995b = kl2.f14995b;
        return this;
    }

    /* renamed from: x */
    public final void mo19151x(String str, ql2 ql2) {
        qc0 qc0;
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String next : this.f12140a.keySet()) {
            String lowerCase = next.toLowerCase(Locale.ROOT);
            if ((z || lowerCase.matches(str)) && (qc0 = this.f12140a.get(next)) != null) {
                qc0.mo23075a(ql2);
            }
        }
    }
}
