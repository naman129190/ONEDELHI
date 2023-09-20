package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;

public class gl2 extends fl2 {

    /* renamed from: a */
    public static final boolean f12638a = false;

    /* renamed from: m */
    public static final int f12639m = 1;

    /* renamed from: o */
    public static final String f12640o = "KeyAttribute";

    /* renamed from: p */
    public static final String f12641p = "KeyAttributes";

    /* renamed from: a */
    public float f12642a = Float.NaN;

    /* renamed from: b */
    public float f12643b = Float.NaN;

    /* renamed from: c */
    public float f12644c = Float.NaN;

    /* renamed from: d */
    public float f12645d = Float.NaN;

    /* renamed from: e */
    public float f12646e = Float.NaN;

    /* renamed from: f */
    public float f12647f = Float.NaN;

    /* renamed from: g */
    public float f12648g = Float.NaN;

    /* renamed from: h */
    public float f12649h = Float.NaN;

    /* renamed from: i */
    public float f12650i = Float.NaN;

    /* renamed from: j */
    public float f12651j = Float.NaN;

    /* renamed from: k */
    public float f12652k = Float.NaN;

    /* renamed from: k */
    public int f12653k = -1;

    /* renamed from: l */
    public float f12654l = Float.NaN;

    /* renamed from: l */
    public int f12655l = 0;

    /* renamed from: m */
    public float f12656m = Float.NaN;

    /* renamed from: n */
    public float f12657n = Float.NaN;

    /* renamed from: n */
    public String f12658n;

    public gl2() {
        this.f12144i = 1;
        this.f12140a = new HashMap<>();
    }

    /* renamed from: a */
    public boolean mo13120a(int i, int i2) {
        if (i == 100) {
            this.f12142g = i2;
            return true;
        } else if (i == 301) {
            this.f12653k = i2;
            return true;
        } else if (i == 302) {
            this.f12655l = i2;
            return true;
        } else if (!mo13120a(i, i2)) {
            return super.mo13120a(i, i2);
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public int mo13121b(String str) {
        return zj4.m33181a(str);
    }

    /* renamed from: c */
    public boolean mo13122c(int i, float f) {
        if (i != 100) {
            switch (i) {
                case 303:
                    this.f12642a = f;
                    return true;
                case 304:
                    this.f12652k = f;
                    return true;
                case 305:
                    this.f12654l = f;
                    return true;
                case 306:
                    this.f12656m = f;
                    return true;
                case 307:
                    this.f12643b = f;
                    return true;
                case 308:
                    this.f12645d = f;
                    return true;
                case 309:
                    this.f12646e = f;
                    return true;
                case 310:
                    this.f12644c = f;
                    return true;
                case 311:
                    this.f12650i = f;
                    return true;
                case 312:
                    this.f12651j = f;
                    return true;
                case 313:
                    this.f12647f = f;
                    return true;
                case 314:
                    this.f12648g = f;
                    return true;
                case 315:
                    this.f12657n = f;
                    return true;
                case ak4.C1708a.f9147p:
                    break;
                default:
                    return super.mo13122c(i, f);
            }
        }
        this.f12649h = f;
        return true;
    }

    /* renamed from: e */
    public boolean mo13124e(int i, String str) {
        if (i == 101) {
            this.f12141b = str;
            return true;
        } else if (i != 317) {
            return super.mo13124e(i, str);
        } else {
            this.f12658n = str;
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r1.equals("pivotX") == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r2.mo13827g(r1, r3);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16041f(java.util.HashMap<java.lang.String, com.onedelhi.secure.x14> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            com.onedelhi.secure.x14 r2 = (com.onedelhi.secure.x14) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003c
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r3 = r6.f12140a
            java.lang.Object r1 = r3.get(r1)
            com.onedelhi.secure.qc0 r1 = (com.onedelhi.secure.qc0) r1
            if (r1 == 0) goto L_0x0008
            com.onedelhi.secure.x14$c r2 = (com.onedelhi.secure.x14.C3889c) r2
            int r3 = r6.f12142g
            r2.mo26756k(r3, r1)
            goto L_0x0008
        L_0x003c:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00e2;
                case -1249320805: goto L_0x00d6;
                case -1249320804: goto L_0x00ca;
                case -1225497657: goto L_0x00be;
                case -1225497656: goto L_0x00b3;
                case -1225497655: goto L_0x00a8;
                case -1001078227: goto L_0x009d;
                case -987906986: goto L_0x0094;
                case -987906985: goto L_0x0088;
                case -908189618: goto L_0x007b;
                case -908189617: goto L_0x006e;
                case -4379043: goto L_0x0061;
                case 92909918: goto L_0x0054;
                case 803192288: goto L_0x0047;
                default: goto L_0x0044;
            }
        L_0x0044:
            r4 = -1
            goto L_0x00ed
        L_0x0047:
            java.lang.String r4 = "pathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0050
            goto L_0x0044
        L_0x0050:
            r4 = 13
            goto L_0x00ed
        L_0x0054:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005d
            goto L_0x0044
        L_0x005d:
            r4 = 12
            goto L_0x00ed
        L_0x0061:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x006a
            goto L_0x0044
        L_0x006a:
            r4 = 11
            goto L_0x00ed
        L_0x006e:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0077
            goto L_0x0044
        L_0x0077:
            r4 = 10
            goto L_0x00ed
        L_0x007b:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0084
            goto L_0x0044
        L_0x0084:
            r4 = 9
            goto L_0x00ed
        L_0x0088:
            java.lang.String r4 = "pivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0091
            goto L_0x0044
        L_0x0091:
            r4 = 8
            goto L_0x00ed
        L_0x0094:
            java.lang.String r5 = "pivotX"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00ed
            goto L_0x0044
        L_0x009d:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a6
            goto L_0x0044
        L_0x00a6:
            r4 = 6
            goto L_0x00ed
        L_0x00a8:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b1
            goto L_0x0044
        L_0x00b1:
            r4 = 5
            goto L_0x00ed
        L_0x00b3:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00bc
            goto L_0x0044
        L_0x00bc:
            r4 = 4
            goto L_0x00ed
        L_0x00be:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c8
            goto L_0x0044
        L_0x00c8:
            r4 = 3
            goto L_0x00ed
        L_0x00ca:
            java.lang.String r4 = "rotationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d4
            goto L_0x0044
        L_0x00d4:
            r4 = 2
            goto L_0x00ed
        L_0x00d6:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00e0
            goto L_0x0044
        L_0x00e0:
            r4 = 1
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ec
            goto L_0x0044
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            switch(r4) {
                case 0: goto L_0x01b7;
                case 1: goto L_0x01a9;
                case 2: goto L_0x019b;
                case 3: goto L_0x018e;
                case 4: goto L_0x0181;
                case 5: goto L_0x0174;
                case 6: goto L_0x0167;
                case 7: goto L_0x015a;
                case 8: goto L_0x014d;
                case 9: goto L_0x0140;
                case 10: goto L_0x0133;
                case 11: goto L_0x0126;
                case 12: goto L_0x0115;
                case 13: goto L_0x0108;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "not supported by KeyAttributes "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            goto L_0x0008
        L_0x0108:
            float r1 = r6.f12649h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12649h
            goto L_0x0121
        L_0x0115:
            float r1 = r6.f12642a
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12642a
        L_0x0121:
            r2.mo13827g(r1, r3)
            goto L_0x0008
        L_0x0126:
            float r1 = r6.f12643b
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12643b
            goto L_0x0121
        L_0x0133:
            float r1 = r6.f12651j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12651j
            goto L_0x0121
        L_0x0140:
            float r1 = r6.f12650i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12650i
            goto L_0x0121
        L_0x014d:
            float r1 = r6.f12646e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12648g
            goto L_0x0121
        L_0x015a:
            float r1 = r6.f12645d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12647f
            goto L_0x0121
        L_0x0167:
            float r1 = r6.f12657n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12657n
            goto L_0x0121
        L_0x0174:
            float r1 = r6.f12656m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12656m
            goto L_0x0121
        L_0x0181:
            float r1 = r6.f12654l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12654l
            goto L_0x0121
        L_0x018e:
            float r1 = r6.f12652k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12652k
            goto L_0x0121
        L_0x019b:
            float r1 = r6.f12644c
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12644c
            goto L_0x0121
        L_0x01a9:
            float r1 = r6.f12646e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12646e
            goto L_0x0121
        L_0x01b7:
            float r1 = r6.f12645d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f12142g
            float r3 = r6.f12645d
            goto L_0x0121
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gl2.mo16041f(java.util.HashMap):void");
    }

    /* renamed from: g */
    public fl2 clone() {
        return null;
    }

    /* renamed from: i */
    public void mo16044i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f12642a)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f12643b)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f12644c)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f12645d)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f12646e)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f12647f)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f12648g)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f12652k)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f12654l)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f12656m)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f12649h)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f12650i)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f12651j)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f12657n)) {
            hashSet.add("progress");
        }
        if (this.f12140a.size() > 0) {
            for (String str : this.f12140a.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: q */
    public void mo16052q(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.f12642a)) {
            hashMap.put("alpha", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12643b)) {
            hashMap.put("elevation", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12644c)) {
            hashMap.put("rotationZ", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12645d)) {
            hashMap.put("rotationX", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12646e)) {
            hashMap.put("rotationY", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12647f)) {
            hashMap.put("pivotX", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12648g)) {
            hashMap.put("pivotY", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12652k)) {
            hashMap.put("translationX", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12654l)) {
            hashMap.put("translationY", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12656m)) {
            hashMap.put("translationZ", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12649h)) {
            hashMap.put("pathRotate", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12650i)) {
            hashMap.put("scaleX", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12651j)) {
            hashMap.put("scaleY", Integer.valueOf(this.f12653k));
        }
        if (!Float.isNaN(this.f12657n)) {
            hashMap.put("progress", Integer.valueOf(this.f12653k));
        }
        if (this.f12140a.size() > 0) {
            for (String str : this.f12140a.keySet()) {
                hashMap.put("CUSTOM," + str, Integer.valueOf(this.f12653k));
            }
        }
    }

    /* renamed from: v */
    public int mo16708v() {
        return this.f12653k;
    }

    /* renamed from: w */
    public final float mo16709w(int i) {
        if (i == 100) {
            return (float) this.f12142g;
        }
        switch (i) {
            case 303:
                return this.f12642a;
            case 304:
                return this.f12652k;
            case 305:
                return this.f12654l;
            case 306:
                return this.f12656m;
            case 307:
                return this.f12643b;
            case 308:
                return this.f12645d;
            case 309:
                return this.f12646e;
            case 310:
                return this.f12644c;
            case 311:
                return this.f12650i;
            case 312:
                return this.f12651j;
            case 313:
                return this.f12647f;
            case 314:
                return this.f12648g;
            case 315:
                return this.f12657n;
            case ak4.C1708a.f9147p:
                return this.f12649h;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: x */
    public void mo16710x() {
        HashSet hashSet = new HashSet();
        mo16044i(hashSet);
        PrintStream printStream = System.out;
        printStream.println(" ------------- " + this.f12142g + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            int a = zj4.m33181a(strArr[i]);
            PrintStream printStream2 = System.out;
            printStream2.println(strArr[i] + ar4.f25981a + mo16709w(a));
        }
    }
}
