package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;

public class hl2 extends fl2 {

    /* renamed from: m */
    public static final int f13152m = 0;

    /* renamed from: n */
    public static final int f13153n = 1;

    /* renamed from: o */
    public static final int f13154o = 2;

    /* renamed from: p */
    public static final int f13155p = 3;

    /* renamed from: p */
    public static final String f13156p = "KeyCycle";

    /* renamed from: q */
    public static final int f13157q = 4;

    /* renamed from: q */
    public static final String f13158q = "KeyCycle";

    /* renamed from: r */
    public static final int f13159r = 5;

    /* renamed from: r */
    public static final String f13160r = "wavePeriod";

    /* renamed from: s */
    public static final int f13161s = 6;

    /* renamed from: s */
    public static final String f13162s = "waveOffset";

    /* renamed from: t */
    public static final int f13163t = 4;

    /* renamed from: t */
    public static final String f13164t = "wavePhase";

    /* renamed from: u */
    public static final String f13165u = "waveShape";

    /* renamed from: a */
    public float f13166a = Float.NaN;

    /* renamed from: b */
    public float f13167b = 0.0f;

    /* renamed from: c */
    public float f13168c = 0.0f;

    /* renamed from: d */
    public float f13169d = Float.NaN;

    /* renamed from: e */
    public float f13170e = Float.NaN;

    /* renamed from: f */
    public float f13171f = Float.NaN;

    /* renamed from: g */
    public float f13172g = Float.NaN;

    /* renamed from: h */
    public float f13173h = Float.NaN;

    /* renamed from: i */
    public float f13174i = Float.NaN;

    /* renamed from: j */
    public float f13175j = Float.NaN;

    /* renamed from: k */
    public float f13176k = Float.NaN;

    /* renamed from: k */
    public int f13177k = 0;

    /* renamed from: l */
    public float f13178l = Float.NaN;

    /* renamed from: l */
    public int f13179l = -1;

    /* renamed from: m */
    public float f13180m = Float.NaN;

    /* renamed from: n */
    public float f13181n = Float.NaN;

    /* renamed from: n */
    public String f13182n = null;

    /* renamed from: o */
    public float f13183o = Float.NaN;

    /* renamed from: o */
    public String f13184o = null;

    public hl2() {
        this.f12144i = 4;
        this.f12140a = new HashMap<>();
    }

    /* renamed from: a */
    public boolean mo13120a(int i, int i2) {
        if (i == 401) {
            this.f13177k = i2;
            return true;
        } else if (i == 421) {
            this.f13179l = i2;
            return true;
        } else if (mo13122c(i, (float) i2)) {
            return true;
        } else {
            return super.mo13120a(i, i2);
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
                case -1581616630: goto L_0x010f;
                case -1310311125: goto L_0x0103;
                case -1249320806: goto L_0x00f7;
                case -1249320805: goto L_0x00eb;
                case -1249320804: goto L_0x00df;
                case -1225497657: goto L_0x00d3;
                case -1225497656: goto L_0x00c7;
                case -1225497655: goto L_0x00bb;
                case -1019779949: goto L_0x00ad;
                case -1001078227: goto L_0x009f;
                case -991726143: goto L_0x0091;
                case -987906986: goto L_0x0083;
                case -987906985: goto L_0x0076;
                case -908189618: goto L_0x0069;
                case -908189617: goto L_0x005c;
                case 92909918: goto L_0x004f;
                case 106629499: goto L_0x0042;
                case 579057826: goto L_0x0035;
                case 803192288: goto L_0x0028;
                case 1532805160: goto L_0x001b;
                case 1941332754: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3 = -1
            goto L_0x011a
        L_0x000e:
            java.lang.String r0 = "visibility"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0017
            goto L_0x000b
        L_0x0017:
            r3 = 20
            goto L_0x011a
        L_0x001b:
            java.lang.String r0 = "waveShape"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0024
            goto L_0x000b
        L_0x0024:
            r3 = 19
            goto L_0x011a
        L_0x0028:
            java.lang.String r0 = "pathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0031
            goto L_0x000b
        L_0x0031:
            r3 = 18
            goto L_0x011a
        L_0x0035:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x003e
            goto L_0x000b
        L_0x003e:
            r3 = 17
            goto L_0x011a
        L_0x0042:
            java.lang.String r0 = "phase"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x004b
            goto L_0x000b
        L_0x004b:
            r3 = 16
            goto L_0x011a
        L_0x004f:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0058
            goto L_0x000b
        L_0x0058:
            r3 = 15
            goto L_0x011a
        L_0x005c:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0065
            goto L_0x000b
        L_0x0065:
            r3 = 14
            goto L_0x011a
        L_0x0069:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0072
            goto L_0x000b
        L_0x0072:
            r3 = 13
            goto L_0x011a
        L_0x0076:
            java.lang.String r0 = "pivotY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x007f
            goto L_0x000b
        L_0x007f:
            r3 = 12
            goto L_0x011a
        L_0x0083:
            java.lang.String r0 = "pivotX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x008d
            goto L_0x000b
        L_0x008d:
            r3 = 11
            goto L_0x011a
        L_0x0091:
            java.lang.String r0 = "period"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x009b
            goto L_0x000b
        L_0x009b:
            r3 = 10
            goto L_0x011a
        L_0x009f:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00a9
            goto L_0x000b
        L_0x00a9:
            r3 = 9
            goto L_0x011a
        L_0x00ad:
            java.lang.String r0 = "offset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00b7
            goto L_0x000b
        L_0x00b7:
            r3 = 8
            goto L_0x011a
        L_0x00bb:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00c5
            goto L_0x000b
        L_0x00c5:
            r3 = 7
            goto L_0x011a
        L_0x00c7:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00d1
            goto L_0x000b
        L_0x00d1:
            r3 = 6
            goto L_0x011a
        L_0x00d3:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00dd
            goto L_0x000b
        L_0x00dd:
            r3 = 5
            goto L_0x011a
        L_0x00df:
            java.lang.String r0 = "rotationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00e9
            goto L_0x000b
        L_0x00e9:
            r3 = 4
            goto L_0x011a
        L_0x00eb:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00f5
            goto L_0x000b
        L_0x00f5:
            r3 = 3
            goto L_0x011a
        L_0x00f7:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0101
            goto L_0x000b
        L_0x0101:
            r3 = 2
            goto L_0x011a
        L_0x0103:
            java.lang.String r0 = "easing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x010d
            goto L_0x000b
        L_0x010d:
            r3 = 1
            goto L_0x011a
        L_0x010f:
            java.lang.String r0 = "customWave"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0119
            goto L_0x000b
        L_0x0119:
            r3 = 0
        L_0x011a:
            switch(r3) {
                case 0: goto L_0x015a;
                case 1: goto L_0x0157;
                case 2: goto L_0x0154;
                case 3: goto L_0x0151;
                case 4: goto L_0x014e;
                case 5: goto L_0x014b;
                case 6: goto L_0x0148;
                case 7: goto L_0x0145;
                case 8: goto L_0x0142;
                case 9: goto L_0x013f;
                case 10: goto L_0x013c;
                case 11: goto L_0x0139;
                case 12: goto L_0x0136;
                case 13: goto L_0x0133;
                case 14: goto L_0x0130;
                case 15: goto L_0x012d;
                case 16: goto L_0x012a;
                case 17: goto L_0x0127;
                case 18: goto L_0x0124;
                case 19: goto L_0x0121;
                case 20: goto L_0x011e;
                default: goto L_0x011d;
            }
        L_0x011d:
            return r1
        L_0x011e:
            r3 = 402(0x192, float:5.63E-43)
            return r3
        L_0x0121:
            r3 = 421(0x1a5, float:5.9E-43)
            return r3
        L_0x0124:
            r3 = 416(0x1a0, float:5.83E-43)
            return r3
        L_0x0127:
            r3 = 401(0x191, float:5.62E-43)
            return r3
        L_0x012a:
            r3 = 425(0x1a9, float:5.96E-43)
            return r3
        L_0x012d:
            r3 = 403(0x193, float:5.65E-43)
            return r3
        L_0x0130:
            r3 = 312(0x138, float:4.37E-43)
            return r3
        L_0x0133:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L_0x0136:
            r3 = 314(0x13a, float:4.4E-43)
            return r3
        L_0x0139:
            r3 = 313(0x139, float:4.39E-43)
            return r3
        L_0x013c:
            r3 = 423(0x1a7, float:5.93E-43)
            return r3
        L_0x013f:
            r3 = 315(0x13b, float:4.41E-43)
            return r3
        L_0x0142:
            r3 = 424(0x1a8, float:5.94E-43)
            return r3
        L_0x0145:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        L_0x0148:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L_0x014b:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L_0x014e:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        L_0x0151:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        L_0x0154:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        L_0x0157:
            r3 = 420(0x1a4, float:5.89E-43)
            return r3
        L_0x015a:
            r3 = 422(0x1a6, float:5.91E-43)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.hl2.mo13121b(java.lang.String):int");
    }

    /* renamed from: c */
    public boolean mo13122c(int i, float f) {
        if (i == 315) {
            this.f13169d = f;
            return true;
        } else if (i == 403) {
            this.f13170e = f;
            return true;
        } else if (i != 416) {
            switch (i) {
                case 304:
                    this.f13180m = f;
                    return true;
                case 305:
                    this.f13181n = f;
                    return true;
                case 306:
                    this.f13183o = f;
                    return true;
                case 307:
                    this.f13171f = f;
                    return true;
                case 308:
                    this.f13174i = f;
                    return true;
                case 309:
                    this.f13175j = f;
                    return true;
                case 310:
                    this.f13172g = f;
                    return true;
                case 311:
                    this.f13176k = f;
                    return true;
                case 312:
                    this.f13178l = f;
                    return true;
                default:
                    switch (i) {
                        case ak4.C1710c.f9212t:
                            this.f13166a = f;
                            return true;
                        case ak4.C1710c.f9214u:
                            this.f13167b = f;
                            return true;
                        case ak4.C1710c.f9216v:
                            this.f13168c = f;
                            return true;
                        default:
                            return super.mo13122c(i, f);
                    }
            }
        } else {
            this.f13173h = f;
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo13124e(int i, String str) {
        if (i == 420) {
            this.f13182n = str;
            return true;
        } else if (i != 422) {
            return super.mo13124e(i, str);
        } else {
            this.f13184o = str;
            return true;
        }
    }

    /* renamed from: f */
    public void mo16041f(HashMap<String, x14> hashMap) {
    }

    /* renamed from: g */
    public fl2 clone() {
        return null;
    }

    /* renamed from: i */
    public void mo16044i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f13170e)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f13171f)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f13172g)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f13174i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f13175j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f13176k)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f13178l)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f13173h)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f13180m)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f13181n)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f13183o)) {
            hashSet.add("translationZ");
        }
        if (this.f12140a.size() > 0) {
            for (String str : this.f12140a.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: v */
    public void mo17333v(HashMap<String, py1> hashMap) {
        py1 py1;
        py1 py12;
        HashMap<String, py1> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM")) {
                qc0 qc0 = this.f12140a.get(next.substring(7));
                if (!(qc0 == null || qc0.mo23085m() != 901 || (py12 = hashMap2.get(next)) == null)) {
                    py12.mo22767g(this.f12142g, this.f13179l, this.f13184o, -1, this.f13166a, this.f13167b, this.f13168c, qc0.mo23086n(), qc0);
                }
            } else {
                float x = mo17335x(next);
                if (!Float.isNaN(x) && (py1 = hashMap2.get(next)) != null) {
                    py1.mo22766f(this.f12142g, this.f13179l, this.f13184o, -1, this.f13166a, this.f13167b, this.f13168c, x);
                }
            }
        }
    }

    /* renamed from: w */
    public void mo17334w() {
        PrintStream printStream = System.out;
        printStream.println("MotionKeyCycle{mWaveShape=" + this.f13179l + ", mWavePeriod=" + this.f13166a + ", mWaveOffset=" + this.f13167b + ", mWavePhase=" + this.f13168c + ", mRotation=" + this.f13172g + '}');
    }

    /* renamed from: x */
    public float mo17335x(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 5;
                    break;
                }
                break;
            case -1019779949:
                if (str.equals(ak4.C1710c.f9217v)) {
                    c = 6;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 8;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
            case 106629499:
                if (str.equals(ak4.C1710c.f9218w)) {
                    c = 12;
                    break;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f13174i;
            case 1:
                return this.f13175j;
            case 2:
                return this.f13172g;
            case 3:
                return this.f13180m;
            case 4:
                return this.f13181n;
            case 5:
                return this.f13183o;
            case 6:
                return this.f13167b;
            case 7:
                return this.f13169d;
            case 8:
                return this.f13176k;
            case 9:
                return this.f13178l;
            case 10:
                return this.f13171f;
            case 11:
                return this.f13170e;
            case 12:
                return this.f13168c;
            case 13:
                return this.f13173h;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: y */
    public void mo17336y() {
        HashSet hashSet = new HashSet();
        mo16044i(hashSet);
        xq4.m31631c(" ------------- " + this.f12142g + " -------------");
        xq4.m31631c("MotionKeyCycle{Shape=" + this.f13179l + ", Period=" + this.f13166a + ", Offset=" + this.f13167b + ", Phase=" + this.f13168c + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            zj4.m33181a(strArr[i]);
            xq4.m31631c(strArr[i] + ar4.f25981a + mo17335x(strArr[i]));
        }
    }
}
