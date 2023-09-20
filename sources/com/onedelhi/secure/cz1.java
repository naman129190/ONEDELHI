package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0435e;
import java.util.HashMap;
import java.util.HashSet;

public class cz1 extends ly1 {

    /* renamed from: A */
    public static final String f10526A = "KeyTimeCycle";

    /* renamed from: B */
    public static final String f10527B = "KeyTimeCycle";

    /* renamed from: C */
    public static final String f10528C = "wavePeriod";

    /* renamed from: D */
    public static final String f10529D = "waveOffset";

    /* renamed from: E */
    public static final String f10530E = "waveShape";

    /* renamed from: g */
    public static final int f10531g = 0;

    /* renamed from: h */
    public static final int f10532h = 1;

    /* renamed from: i */
    public static final int f10533i = 2;

    /* renamed from: j */
    public static final int f10534j = 3;

    /* renamed from: k */
    public static final int f10535k = 4;

    /* renamed from: l */
    public static final int f10536l = 5;

    /* renamed from: m */
    public static final int f10537m = 6;

    /* renamed from: n */
    public static final int f10538n = 3;

    /* renamed from: a */
    public float f10539a = Float.NaN;

    /* renamed from: b */
    public float f10540b = Float.NaN;

    /* renamed from: c */
    public float f10541c = Float.NaN;

    /* renamed from: d */
    public float f10542d = Float.NaN;

    /* renamed from: e */
    public float f10543e = Float.NaN;

    /* renamed from: e */
    public int f10544e = -1;

    /* renamed from: f */
    public float f10545f = Float.NaN;

    /* renamed from: f */
    public int f10546f = 0;

    /* renamed from: g */
    public float f10547g = Float.NaN;

    /* renamed from: h */
    public float f10548h = Float.NaN;

    /* renamed from: i */
    public float f10549i = Float.NaN;

    /* renamed from: j */
    public float f10550j = Float.NaN;

    /* renamed from: k */
    public float f10551k = Float.NaN;

    /* renamed from: l */
    public float f10552l = Float.NaN;

    /* renamed from: m */
    public float f10553m = Float.NaN;

    /* renamed from: n */
    public float f10554n = 0.0f;

    /* renamed from: y */
    public String f10555y;

    /* renamed from: z */
    public String f10556z = null;

    /* renamed from: com.onedelhi.secure.cz1$a */
    public static class C1929a {

        /* renamed from: a */
        public static final int f10557a = 1;

        /* renamed from: a */
        public static SparseIntArray f10558a = null;

        /* renamed from: b */
        public static final int f10559b = 2;

        /* renamed from: c */
        public static final int f10560c = 4;

        /* renamed from: d */
        public static final int f10561d = 5;

        /* renamed from: e */
        public static final int f10562e = 6;

        /* renamed from: f */
        public static final int f10563f = 8;

        /* renamed from: g */
        public static final int f10564g = 7;

        /* renamed from: h */
        public static final int f10565h = 9;

        /* renamed from: i */
        public static final int f10566i = 10;

        /* renamed from: j */
        public static final int f10567j = 12;

        /* renamed from: k */
        public static final int f10568k = 13;

        /* renamed from: l */
        public static final int f10569l = 14;

        /* renamed from: m */
        public static final int f10570m = 15;

        /* renamed from: n */
        public static final int f10571n = 16;

        /* renamed from: o */
        public static final int f10572o = 17;

        /* renamed from: p */
        public static final int f10573p = 18;

        /* renamed from: q */
        public static final int f10574q = 19;

        /* renamed from: r */
        public static final int f10575r = 20;

        /* renamed from: s */
        public static final int f10576s = 21;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f10558a = sparseIntArray;
            sparseIntArray.append(C0435e.C0448m.KeyTimeCycle_android_alpha, 1);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_android_elevation, 2);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_android_rotation, 4);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_android_rotationX, 5);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_android_rotationY, 6);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_android_scaleX, 7);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_transitionPathRotate, 8);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_transitionEasing, 9);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_motionTarget, 10);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_framePosition, 12);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_curveFit, 13);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_android_scaleY, 14);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_android_translationX, 15);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_android_translationY, 16);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_android_translationZ, 17);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_motionProgress, 18);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_wavePeriod, 20);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_waveOffset, 21);
            f10558a.append(C0435e.C0448m.KeyTimeCycle_waveShape, 19);
        }

        /* renamed from: a */
        public static void m12859a(cz1 cz1, TypedArray typedArray) {
            int i;
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                switch (f10558a.get(index)) {
                    case 1:
                        float unused = cz1.f10539a = typedArray.getFloat(index, cz1.f10539a);
                        break;
                    case 2:
                        float unused2 = cz1.f10540b = typedArray.getDimension(index, cz1.f10540b);
                        break;
                    case 4:
                        float unused3 = cz1.f10541c = typedArray.getFloat(index, cz1.f10541c);
                        break;
                    case 5:
                        float unused4 = cz1.f10542d = typedArray.getFloat(index, cz1.f10542d);
                        break;
                    case 6:
                        float unused5 = cz1.f10543e = typedArray.getFloat(index, cz1.f10543e);
                        break;
                    case 7:
                        float unused6 = cz1.f10547g = typedArray.getFloat(index, cz1.f10547g);
                        break;
                    case 8:
                        float unused7 = cz1.f10545f = typedArray.getFloat(index, cz1.f10545f);
                        break;
                    case 9:
                        String unused8 = cz1.f10555y = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f1969w) {
                            if (typedArray.peekValue(index).type != 3) {
                                cz1.f15691b = typedArray.getResourceId(index, cz1.f15691b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, cz1.f15691b);
                            cz1.f15691b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        cz1.f15689a = typedArray.getString(index);
                        break;
                    case 12:
                        cz1.f15688a = typedArray.getInt(index, cz1.f15688a);
                        break;
                    case 13:
                        int unused9 = cz1.f10544e = typedArray.getInteger(index, cz1.f10544e);
                        break;
                    case 14:
                        float unused10 = cz1.f10548h = typedArray.getFloat(index, cz1.f10548h);
                        break;
                    case 15:
                        float unused11 = cz1.f10549i = typedArray.getDimension(index, cz1.f10549i);
                        break;
                    case 16:
                        float unused12 = cz1.f10550j = typedArray.getDimension(index, cz1.f10550j);
                        break;
                    case 17:
                        float unused13 = cz1.f10551k = typedArray.getDimension(index, cz1.f10551k);
                        break;
                    case 18:
                        float unused14 = cz1.f10552l = typedArray.getFloat(index, cz1.f10552l);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            String unused15 = cz1.f10556z = typedArray.getString(index);
                            i = 7;
                        } else {
                            i = typedArray.getInt(index, cz1.f10546f);
                        }
                        int unused16 = cz1.f10546f = i;
                        break;
                    case 20:
                        float unused17 = cz1.f10553m = typedArray.getFloat(index, cz1.f10553m);
                        break;
                    case 21:
                        float unused18 = cz1.f10554n = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, cz1.f10554n) : typedArray.getFloat(index, cz1.f10554n);
                        break;
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f10558a.get(index));
                        break;
                }
            }
        }
    }

    public cz1() {
        this.f15692c = 3;
        this.f15690a = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        r3.mo17458c(r4, r5, r10.f10553m, r10.f10546f, r10.f10554n);
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14435W(java.util.HashMap<java.lang.String, com.onedelhi.secure.hv4> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01a1
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            com.onedelhi.secure.hv4 r3 = (com.onedelhi.secure.hv4) r3
            if (r3 != 0) goto L_0x001e
            goto L_0x0008
        L_0x001e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r10.f15690a
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.C0419a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            com.onedelhi.secure.hv4$b r4 = (com.onedelhi.secure.hv4.C2368b) r4
            int r5 = r10.f15688a
            float r7 = r10.f10553m
            int r8 = r10.f10546f
            float r9 = r10.f10554n
            r4.mo17460k(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0045:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00ce;
                case -1249320805: goto L_0x00c3;
                case -1225497657: goto L_0x00b8;
                case -1225497656: goto L_0x00ad;
                case -1225497655: goto L_0x00a2;
                case -1001078227: goto L_0x0097;
                case -908189618: goto L_0x008c;
                case -908189617: goto L_0x0083;
                case -40300674: goto L_0x0077;
                case -4379043: goto L_0x006a;
                case 37232917: goto L_0x005d;
                case 92909918: goto L_0x0050;
                default: goto L_0x004d;
            }
        L_0x004d:
            r4 = -1
            goto L_0x00d9
        L_0x0050:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0059
            goto L_0x004d
        L_0x0059:
            r4 = 11
            goto L_0x00d9
        L_0x005d:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0066
            goto L_0x004d
        L_0x0066:
            r4 = 10
            goto L_0x00d9
        L_0x006a:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0073
            goto L_0x004d
        L_0x0073:
            r4 = 9
            goto L_0x00d9
        L_0x0077:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0080
            goto L_0x004d
        L_0x0080:
            r4 = 8
            goto L_0x00d9
        L_0x0083:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00d9
            goto L_0x004d
        L_0x008c:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0095
            goto L_0x004d
        L_0x0095:
            r4 = 6
            goto L_0x00d9
        L_0x0097:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a0
            goto L_0x004d
        L_0x00a0:
            r4 = 5
            goto L_0x00d9
        L_0x00a2:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ab
            goto L_0x004d
        L_0x00ab:
            r4 = 4
            goto L_0x00d9
        L_0x00ad:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b6
            goto L_0x004d
        L_0x00b6:
            r4 = 3
            goto L_0x00d9
        L_0x00b8:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c1
            goto L_0x004d
        L_0x00c1:
            r4 = 2
            goto L_0x00d9
        L_0x00c3:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00cc
            goto L_0x004d
        L_0x00cc:
            r4 = 1
            goto L_0x00d9
        L_0x00ce:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d8
            goto L_0x004d
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            switch(r4) {
                case 0: goto L_0x0193;
                case 1: goto L_0x0185;
                case 2: goto L_0x0178;
                case 3: goto L_0x016b;
                case 4: goto L_0x015e;
                case 5: goto L_0x0151;
                case 6: goto L_0x0144;
                case 7: goto L_0x0137;
                case 8: goto L_0x012a;
                case 9: goto L_0x011d;
                case 10: goto L_0x0110;
                case 11: goto L_0x00f9;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x00f9:
            float r1 = r10.f10539a
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10539a
        L_0x0105:
            float r6 = r10.f10553m
            int r7 = r10.f10546f
            float r8 = r10.f10554n
            r3.mo17458c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0110:
            float r1 = r10.f10545f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10545f
            goto L_0x0105
        L_0x011d:
            float r1 = r10.f10540b
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10540b
            goto L_0x0105
        L_0x012a:
            float r1 = r10.f10541c
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10541c
            goto L_0x0105
        L_0x0137:
            float r1 = r10.f10548h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10548h
            goto L_0x0105
        L_0x0144:
            float r1 = r10.f10547g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10547g
            goto L_0x0105
        L_0x0151:
            float r1 = r10.f10552l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10552l
            goto L_0x0105
        L_0x015e:
            float r1 = r10.f10551k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10551k
            goto L_0x0105
        L_0x016b:
            float r1 = r10.f10550j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10550j
            goto L_0x0105
        L_0x0178:
            float r1 = r10.f10549i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10549i
            goto L_0x0105
        L_0x0185:
            float r1 = r10.f10543e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10543e
            goto L_0x0105
        L_0x0193:
            float r1 = r10.f10542d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f15688a
            float r5 = r10.f10542d
            goto L_0x0105
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cz1.mo14435W(java.util.HashMap):void");
    }

    /* renamed from: a */
    public void mo14436a(HashMap<String, bv4> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public ly1 clone() {
        return new cz1().mo14438c(this);
    }

    /* renamed from: c */
    public ly1 mo14438c(ly1 ly1) {
        super.mo14438c(ly1);
        cz1 cz1 = (cz1) ly1;
        this.f10555y = cz1.f10555y;
        this.f10544e = cz1.f10544e;
        this.f10546f = cz1.f10546f;
        this.f10553m = cz1.f10553m;
        this.f10554n = cz1.f10554n;
        this.f10552l = cz1.f10552l;
        this.f10539a = cz1.f10539a;
        this.f10540b = cz1.f10540b;
        this.f10541c = cz1.f10541c;
        this.f10545f = cz1.f10545f;
        this.f10542d = cz1.f10542d;
        this.f10543e = cz1.f10543e;
        this.f10547g = cz1.f10547g;
        this.f10548h = cz1.f10548h;
        this.f10549i = cz1.f10549i;
        this.f10550j = cz1.f10550j;
        this.f10551k = cz1.f10551k;
        return this;
    }

    /* renamed from: d */
    public void mo13346d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f10539a)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f10540b)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f10541c)) {
            hashSet.add(ly1.f15667d);
        }
        if (!Float.isNaN(this.f10542d)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f10543e)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f10549i)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f10550j)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f10551k)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f10545f)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f10547g)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f10548h)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f10552l)) {
            hashSet.add("progress");
        }
        if (this.f15690a.size() > 0) {
            for (String str : this.f15690a.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: f */
    public void mo14440f(Context context, AttributeSet attributeSet) {
        C1929a.m12859a(this, context.obtainStyledAttributes(attributeSet, C0435e.C0448m.KeyTimeCycle));
    }

    /* renamed from: i */
    public void mo14441i(HashMap<String, Integer> hashMap) {
        if (this.f10544e != -1) {
            if (!Float.isNaN(this.f10539a)) {
                hashMap.put("alpha", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10540b)) {
                hashMap.put("elevation", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10541c)) {
                hashMap.put(ly1.f15667d, Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10542d)) {
                hashMap.put("rotationX", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10543e)) {
                hashMap.put("rotationY", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10549i)) {
                hashMap.put("translationX", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10550j)) {
                hashMap.put("translationY", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10551k)) {
                hashMap.put("translationZ", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10545f)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10547g)) {
                hashMap.put("scaleX", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10547g)) {
                hashMap.put("scaleY", Integer.valueOf(this.f10544e));
            }
            if (!Float.isNaN(this.f10552l)) {
                hashMap.put("progress", Integer.valueOf(this.f10544e));
            }
            if (this.f15690a.size() > 0) {
                for (String str : this.f15690a.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f10544e));
                }
            }
        }
    }

    /* renamed from: j */
    public void mo14442j(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals(ly1.f15685v)) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 8;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(ly1.f15667d)) {
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
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 13;
                    break;
                }
                break;
            case 184161818:
                if (str.equals("wavePeriod")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f10552l = mo19940m(obj);
                return;
            case 1:
                this.f10555y = obj.toString();
                return;
            case 2:
                this.f10542d = mo19940m(obj);
                return;
            case 3:
                this.f10543e = mo19940m(obj);
                return;
            case 4:
                this.f10549i = mo19940m(obj);
                return;
            case 5:
                this.f10550j = mo19940m(obj);
                return;
            case 6:
                this.f10551k = mo19940m(obj);
                return;
            case 7:
                this.f10547g = mo19940m(obj);
                return;
            case 8:
                this.f10548h = mo19940m(obj);
                return;
            case 9:
                this.f10541c = mo19940m(obj);
                return;
            case 10:
                this.f10540b = mo19940m(obj);
                return;
            case 11:
                this.f10545f = mo19940m(obj);
                return;
            case 12:
                this.f10539a = mo19940m(obj);
                return;
            case 13:
                this.f10554n = mo19940m(obj);
                return;
            case 14:
                this.f10553m = mo19940m(obj);
                return;
            case 15:
                this.f10544e = mo19941n(obj);
                return;
            case 16:
                if (obj instanceof Integer) {
                    this.f10546f = mo19941n(obj);
                    return;
                }
                this.f10546f = 7;
                this.f10556z = obj.toString();
                return;
            default:
                return;
        }
    }
}
