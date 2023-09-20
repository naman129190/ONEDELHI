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

public class my1 extends ly1 {

    /* renamed from: A */
    public static final String f16904A = "KeyAttributes";

    /* renamed from: b */
    public static final boolean f16905b = false;

    /* renamed from: f */
    public static final int f16906f = 1;

    /* renamed from: z */
    public static final String f16907z = "KeyAttribute";

    /* renamed from: a */
    public float f16908a = Float.NaN;

    /* renamed from: a */
    public boolean f16909a = false;

    /* renamed from: b */
    public float f16910b = Float.NaN;

    /* renamed from: c */
    public float f16911c = Float.NaN;

    /* renamed from: d */
    public float f16912d = Float.NaN;

    /* renamed from: e */
    public float f16913e = Float.NaN;

    /* renamed from: e */
    public int f16914e = -1;

    /* renamed from: f */
    public float f16915f = Float.NaN;

    /* renamed from: g */
    public float f16916g = Float.NaN;

    /* renamed from: h */
    public float f16917h = Float.NaN;

    /* renamed from: i */
    public float f16918i = Float.NaN;

    /* renamed from: j */
    public float f16919j = Float.NaN;

    /* renamed from: k */
    public float f16920k = Float.NaN;

    /* renamed from: l */
    public float f16921l = Float.NaN;

    /* renamed from: m */
    public float f16922m = Float.NaN;

    /* renamed from: n */
    public float f16923n = Float.NaN;

    /* renamed from: y */
    public String f16924y;

    /* renamed from: com.onedelhi.secure.my1$a */
    public static class C2902a {

        /* renamed from: a */
        public static final int f16925a = 1;

        /* renamed from: a */
        public static SparseIntArray f16926a = null;

        /* renamed from: b */
        public static final int f16927b = 2;

        /* renamed from: c */
        public static final int f16928c = 4;

        /* renamed from: d */
        public static final int f16929d = 5;

        /* renamed from: e */
        public static final int f16930e = 6;

        /* renamed from: f */
        public static final int f16931f = 8;

        /* renamed from: g */
        public static final int f16932g = 7;

        /* renamed from: h */
        public static final int f16933h = 9;

        /* renamed from: i */
        public static final int f16934i = 10;

        /* renamed from: j */
        public static final int f16935j = 12;

        /* renamed from: k */
        public static final int f16936k = 13;

        /* renamed from: l */
        public static final int f16937l = 14;

        /* renamed from: m */
        public static final int f16938m = 15;

        /* renamed from: n */
        public static final int f16939n = 16;

        /* renamed from: o */
        public static final int f16940o = 17;

        /* renamed from: p */
        public static final int f16941p = 18;

        /* renamed from: q */
        public static final int f16942q = 19;

        /* renamed from: r */
        public static final int f16943r = 20;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16926a = sparseIntArray;
            sparseIntArray.append(C0435e.C0448m.KeyAttribute_android_alpha, 1);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_elevation, 2);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_rotation, 4);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_rotationX, 5);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_rotationY, 6);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_transformPivotX, 19);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_transformPivotY, 20);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_scaleX, 7);
            f16926a.append(C0435e.C0448m.KeyAttribute_transitionPathRotate, 8);
            f16926a.append(C0435e.C0448m.KeyAttribute_transitionEasing, 9);
            f16926a.append(C0435e.C0448m.KeyAttribute_motionTarget, 10);
            f16926a.append(C0435e.C0448m.KeyAttribute_framePosition, 12);
            f16926a.append(C0435e.C0448m.KeyAttribute_curveFit, 13);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_scaleY, 14);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_translationX, 15);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_translationY, 16);
            f16926a.append(C0435e.C0448m.KeyAttribute_android_translationZ, 17);
            f16926a.append(C0435e.C0448m.KeyAttribute_motionProgress, 18);
        }

        /* renamed from: a */
        public static void m22212a(my1 my1, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f16926a.get(index)) {
                    case 1:
                        float unused = my1.f16908a = typedArray.getFloat(index, my1.f16908a);
                        break;
                    case 2:
                        float unused2 = my1.f16910b = typedArray.getDimension(index, my1.f16910b);
                        break;
                    case 4:
                        float unused3 = my1.f16911c = typedArray.getFloat(index, my1.f16911c);
                        break;
                    case 5:
                        float unused4 = my1.f16912d = typedArray.getFloat(index, my1.f16912d);
                        break;
                    case 6:
                        float unused5 = my1.f16913e = typedArray.getFloat(index, my1.f16913e);
                        break;
                    case 7:
                        float unused6 = my1.f16918i = typedArray.getFloat(index, my1.f16918i);
                        break;
                    case 8:
                        float unused7 = my1.f16917h = typedArray.getFloat(index, my1.f16917h);
                        break;
                    case 9:
                        String unused8 = my1.f16924y = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f1969w) {
                            if (typedArray.peekValue(index).type != 3) {
                                my1.f15691b = typedArray.getResourceId(index, my1.f15691b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, my1.f15691b);
                            my1.f15691b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        my1.f15689a = typedArray.getString(index);
                        break;
                    case 12:
                        my1.f15688a = typedArray.getInt(index, my1.f15688a);
                        break;
                    case 13:
                        int unused9 = my1.f16914e = typedArray.getInteger(index, my1.f16914e);
                        break;
                    case 14:
                        float unused10 = my1.f16919j = typedArray.getFloat(index, my1.f16919j);
                        break;
                    case 15:
                        float unused11 = my1.f16920k = typedArray.getDimension(index, my1.f16920k);
                        break;
                    case 16:
                        float unused12 = my1.f16921l = typedArray.getDimension(index, my1.f16921l);
                        break;
                    case 17:
                        float unused13 = my1.f16922m = typedArray.getDimension(index, my1.f16922m);
                        break;
                    case 18:
                        float unused14 = my1.f16923n = typedArray.getFloat(index, my1.f16923n);
                        break;
                    case 19:
                        float unused15 = my1.f16915f = typedArray.getDimension(index, my1.f16915f);
                        break;
                    case 20:
                        float unused16 = my1.f16916g = typedArray.getDimension(index, my1.f16916g);
                        break;
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f16926a.get(index));
                        break;
                }
            }
        }
    }

    public my1() {
        this.f15692c = 1;
        this.f15690a = new HashMap<>();
    }

    /* renamed from: T */
    public int mo20808T() {
        return this.f16914e;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fe, code lost:
        r2.mo13827g(r1, r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14436a(java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b0
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r3 = r6.f15690a
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.C0419a) r1
            if (r1 == 0) goto L_0x0008
            com.onedelhi.secure.bv4$b r2 = (com.onedelhi.secure.bv4.C1807b) r2
            int r3 = r6.f15688a
            r2.mo13829n(r3, r1)
            goto L_0x0008
        L_0x003c:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00e2;
                case -1249320805: goto L_0x00d6;
                case -1225497657: goto L_0x00ca;
                case -1225497656: goto L_0x00be;
                case -1225497655: goto L_0x00b3;
                case -1001078227: goto L_0x00a8;
                case -908189618: goto L_0x009d;
                case -908189617: goto L_0x0094;
                case -760884510: goto L_0x0088;
                case -760884509: goto L_0x007b;
                case -40300674: goto L_0x006e;
                case -4379043: goto L_0x0061;
                case 37232917: goto L_0x0054;
                case 92909918: goto L_0x0047;
                default: goto L_0x0044;
            }
        L_0x0044:
            r4 = -1
            goto L_0x00ed
        L_0x0047:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0050
            goto L_0x0044
        L_0x0050:
            r4 = 13
            goto L_0x00ed
        L_0x0054:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005d
            goto L_0x0044
        L_0x005d:
            r4 = 12
            goto L_0x00ed
        L_0x0061:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x006a
            goto L_0x0044
        L_0x006a:
            r4 = 11
            goto L_0x00ed
        L_0x006e:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0077
            goto L_0x0044
        L_0x0077:
            r4 = 10
            goto L_0x00ed
        L_0x007b:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0084
            goto L_0x0044
        L_0x0084:
            r4 = 9
            goto L_0x00ed
        L_0x0088:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0091
            goto L_0x0044
        L_0x0091:
            r4 = 8
            goto L_0x00ed
        L_0x0094:
            java.lang.String r5 = "scaleY"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00ed
            goto L_0x0044
        L_0x009d:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00a6
            goto L_0x0044
        L_0x00a6:
            r4 = 6
            goto L_0x00ed
        L_0x00a8:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b1
            goto L_0x0044
        L_0x00b1:
            r4 = 5
            goto L_0x00ed
        L_0x00b3:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00bc
            goto L_0x0044
        L_0x00bc:
            r4 = 4
            goto L_0x00ed
        L_0x00be:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00c8
            goto L_0x0044
        L_0x00c8:
            r4 = 3
            goto L_0x00ed
        L_0x00ca:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d4
            goto L_0x0044
        L_0x00d4:
            r4 = 2
            goto L_0x00ed
        L_0x00d6:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00e0
            goto L_0x0044
        L_0x00e0:
            r4 = 1
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ec
            goto L_0x0044
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            switch(r4) {
                case 0: goto L_0x01a2;
                case 1: goto L_0x0194;
                case 2: goto L_0x0186;
                case 3: goto L_0x0178;
                case 4: goto L_0x016b;
                case 5: goto L_0x015e;
                case 6: goto L_0x0151;
                case 7: goto L_0x0144;
                case 8: goto L_0x0137;
                case 9: goto L_0x012a;
                case 10: goto L_0x011d;
                case 11: goto L_0x0110;
                case 12: goto L_0x0103;
                case 13: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x0008
        L_0x00f2:
            float r1 = r6.f16908a
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16908a
        L_0x00fe:
            r2.mo13827g(r1, r3)
            goto L_0x0008
        L_0x0103:
            float r1 = r6.f16917h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16917h
            goto L_0x00fe
        L_0x0110:
            float r1 = r6.f16910b
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16910b
            goto L_0x00fe
        L_0x011d:
            float r1 = r6.f16911c
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16911c
            goto L_0x00fe
        L_0x012a:
            float r1 = r6.f16913e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16916g
            goto L_0x00fe
        L_0x0137:
            float r1 = r6.f16912d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16915f
            goto L_0x00fe
        L_0x0144:
            float r1 = r6.f16919j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16919j
            goto L_0x00fe
        L_0x0151:
            float r1 = r6.f16918i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16918i
            goto L_0x00fe
        L_0x015e:
            float r1 = r6.f16923n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16923n
            goto L_0x00fe
        L_0x016b:
            float r1 = r6.f16922m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16922m
            goto L_0x00fe
        L_0x0178:
            float r1 = r6.f16921l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16921l
            goto L_0x00fe
        L_0x0186:
            float r1 = r6.f16920k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16920k
            goto L_0x00fe
        L_0x0194:
            float r1 = r6.f16913e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16913e
            goto L_0x00fe
        L_0x01a2:
            float r1 = r6.f16912d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f15688a
            float r3 = r6.f16912d
            goto L_0x00fe
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.my1.mo14436a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public ly1 clone() {
        return new my1().mo14438c(this);
    }

    /* renamed from: c */
    public ly1 mo14438c(ly1 ly1) {
        super.mo14438c(ly1);
        my1 my1 = (my1) ly1;
        this.f16914e = my1.f16914e;
        this.f16909a = my1.f16909a;
        this.f16908a = my1.f16908a;
        this.f16910b = my1.f16910b;
        this.f16911c = my1.f16911c;
        this.f16912d = my1.f16912d;
        this.f16913e = my1.f16913e;
        this.f16915f = my1.f16915f;
        this.f16916g = my1.f16916g;
        this.f16917h = my1.f16917h;
        this.f16918i = my1.f16918i;
        this.f16919j = my1.f16919j;
        this.f16920k = my1.f16920k;
        this.f16921l = my1.f16921l;
        this.f16922m = my1.f16922m;
        this.f16923n = my1.f16923n;
        return this;
    }

    /* renamed from: d */
    public void mo13346d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f16908a)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f16910b)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f16911c)) {
            hashSet.add(ly1.f15667d);
        }
        if (!Float.isNaN(this.f16912d)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f16913e)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f16915f)) {
            hashSet.add(ly1.f15670g);
        }
        if (!Float.isNaN(this.f16916g)) {
            hashSet.add(ly1.f15671h);
        }
        if (!Float.isNaN(this.f16920k)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f16921l)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f16922m)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f16917h)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f16918i)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f16919j)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f16923n)) {
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
        C2902a.m22212a(this, context.obtainStyledAttributes(attributeSet, C0435e.C0448m.KeyAttribute));
    }

    /* renamed from: i */
    public void mo14441i(HashMap<String, Integer> hashMap) {
        if (this.f16914e != -1) {
            if (!Float.isNaN(this.f16908a)) {
                hashMap.put("alpha", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16910b)) {
                hashMap.put("elevation", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16911c)) {
                hashMap.put(ly1.f15667d, Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16912d)) {
                hashMap.put("rotationX", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16913e)) {
                hashMap.put("rotationY", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16915f)) {
                hashMap.put(ly1.f15670g, Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16916g)) {
                hashMap.put(ly1.f15671h, Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16920k)) {
                hashMap.put("translationX", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16921l)) {
                hashMap.put("translationY", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16922m)) {
                hashMap.put("translationZ", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16917h)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16918i)) {
                hashMap.put("scaleX", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16919j)) {
                hashMap.put("scaleY", Integer.valueOf(this.f16914e));
            }
            if (!Float.isNaN(this.f16923n)) {
                hashMap.put("progress", Integer.valueOf(this.f16914e));
            }
            if (this.f15690a.size() > 0) {
                for (String str : this.f15690a.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f16914e));
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
            case -760884510:
                if (str.equals(ly1.f15670g)) {
                    c = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals(ly1.f15671h)) {
                    c = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(ly1.f15667d)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
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
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f16923n = mo19940m(obj);
                return;
            case 1:
                this.f16924y = obj.toString();
                return;
            case 2:
                this.f16912d = mo19940m(obj);
                return;
            case 3:
                this.f16913e = mo19940m(obj);
                return;
            case 4:
                this.f16920k = mo19940m(obj);
                return;
            case 5:
                this.f16921l = mo19940m(obj);
                return;
            case 6:
                this.f16922m = mo19940m(obj);
                return;
            case 7:
                this.f16918i = mo19940m(obj);
                return;
            case 8:
                this.f16919j = mo19940m(obj);
                return;
            case 9:
                this.f16915f = mo19940m(obj);
                return;
            case 10:
                this.f16916g = mo19940m(obj);
                return;
            case 11:
                this.f16911c = mo19940m(obj);
                return;
            case 12:
                this.f16910b = mo19940m(obj);
                return;
            case 13:
                this.f16917h = mo19940m(obj);
                return;
            case 14:
                this.f16908a = mo19940m(obj);
                return;
            case 15:
                this.f16914e = mo19941n(obj);
                return;
            case 16:
                this.f16909a = mo19939l(obj);
                return;
            default:
                return;
        }
    }
}
