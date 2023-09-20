package com.onedelhi.secure;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.C0419a;
import androidx.constraintlayout.widget.C0426d;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class zk2 implements Comparable<zk2> {

    /* renamed from: a */
    public static String[] f23755a = {"position", "x", "y", yz1.f38148j, "height", "pathRotate"};

    /* renamed from: b */
    public static final String f23756b = "MotionPaths";

    /* renamed from: c */
    public static final boolean f23757c = false;

    /* renamed from: s */
    public static final int f23758s = 1;

    /* renamed from: t */
    public static final int f23759t = 2;

    /* renamed from: a */
    public float f23760a = 1.0f;

    /* renamed from: a */
    public ur0 f23761a;

    /* renamed from: a */
    public LinkedHashMap<String, C0419a> f23762a = new LinkedHashMap<>();

    /* renamed from: a */
    public double[] f23763a = new double[18];

    /* renamed from: b */
    public float f23764b = 0.0f;

    /* renamed from: b */
    public boolean f23765b = false;

    /* renamed from: b */
    public double[] f23766b = new double[18];

    /* renamed from: c */
    public float f23767c = 0.0f;

    /* renamed from: d */
    public float f23768d = 0.0f;

    /* renamed from: e */
    public float f23769e = 0.0f;

    /* renamed from: f */
    public float f23770f = 1.0f;

    /* renamed from: g */
    public float f23771g = 1.0f;

    /* renamed from: h */
    public float f23772h = Float.NaN;

    /* renamed from: i */
    public float f23773i = Float.NaN;

    /* renamed from: j */
    public float f23774j = 0.0f;

    /* renamed from: k */
    public float f23775k = 0.0f;

    /* renamed from: l */
    public float f23776l = 0.0f;

    /* renamed from: m */
    public float f23777m;

    /* renamed from: n */
    public float f23778n;

    /* renamed from: n */
    public int f23779n = 0;

    /* renamed from: o */
    public float f23780o;

    /* renamed from: o */
    public int f23781o;

    /* renamed from: p */
    public float f23782p;

    /* renamed from: p */
    public int f23783p = 0;

    /* renamed from: q */
    public float f23784q;

    /* renamed from: q */
    public int f23785q = -1;

    /* renamed from: r */
    public float f23786r = Float.NaN;

    /* renamed from: r */
    public int f23787r = 0;

    /* renamed from: s */
    public float f23788s = Float.NaN;

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        r2.mo13827g(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0167, code lost:
        r2.mo13827g(r9, r6);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28014a(java.util.HashMap<java.lang.String, com.onedelhi.secure.bv4> r8, int r9) {
        /*
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01f2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            com.onedelhi.secure.bv4 r2 = (com.onedelhi.secure.bv4) r2
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto L_0x00c9;
                case -1249320805: goto L_0x00be;
                case -1225497657: goto L_0x00b3;
                case -1225497656: goto L_0x00a8;
                case -1225497655: goto L_0x009d;
                case -1001078227: goto L_0x0092;
                case -908189618: goto L_0x0087;
                case -908189617: goto L_0x007c;
                case -760884510: goto L_0x006e;
                case -760884509: goto L_0x0060;
                case -40300674: goto L_0x0052;
                case -4379043: goto L_0x0044;
                case 37232917: goto L_0x0036;
                case 92909918: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00d3
        L_0x0028:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0032
            goto L_0x00d3
        L_0x0032:
            r3 = 13
            goto L_0x00d3
        L_0x0036:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0040
            goto L_0x00d3
        L_0x0040:
            r3 = 12
            goto L_0x00d3
        L_0x0044:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x00d3
        L_0x004e:
            r3 = 11
            goto L_0x00d3
        L_0x0052:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005c
            goto L_0x00d3
        L_0x005c:
            r3 = 10
            goto L_0x00d3
        L_0x0060:
            java.lang.String r4 = "transformPivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x006a
            goto L_0x00d3
        L_0x006a:
            r3 = 9
            goto L_0x00d3
        L_0x006e:
            java.lang.String r4 = "transformPivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0078
            goto L_0x00d3
        L_0x0078:
            r3 = 8
            goto L_0x00d3
        L_0x007c:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0085
            goto L_0x00d3
        L_0x0085:
            r3 = 7
            goto L_0x00d3
        L_0x0087:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0090
            goto L_0x00d3
        L_0x0090:
            r3 = 6
            goto L_0x00d3
        L_0x0092:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x009b
            goto L_0x00d3
        L_0x009b:
            r3 = 5
            goto L_0x00d3
        L_0x009d:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a6
            goto L_0x00d3
        L_0x00a6:
            r3 = 4
            goto L_0x00d3
        L_0x00a8:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b1
            goto L_0x00d3
        L_0x00b1:
            r3 = 3
            goto L_0x00d3
        L_0x00b3:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00bc
            goto L_0x00d3
        L_0x00bc:
            r3 = 2
            goto L_0x00d3
        L_0x00be:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c7
            goto L_0x00d3
        L_0x00c7:
            r3 = 1
            goto L_0x00d3
        L_0x00c9:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L_0x01e4;
                case 1: goto L_0x01d8;
                case 2: goto L_0x01cc;
                case 3: goto L_0x01c0;
                case 4: goto L_0x01b4;
                case 5: goto L_0x01a8;
                case 6: goto L_0x019c;
                case 7: goto L_0x0190;
                case 8: goto L_0x0184;
                case 9: goto L_0x0178;
                case 10: goto L_0x016c;
                case 11: goto L_0x015c;
                case 12: goto L_0x0150;
                case 13: goto L_0x0140;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r4 = "MotionPaths"
            if (r3 == 0) goto L_0x012e
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r5 = r7.f23762a
            boolean r5 = r5.containsKey(r3)
            if (r5 == 0) goto L_0x0008
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r5 = r7.f23762a
            java.lang.Object r3 = r5.get(r3)
            androidx.constraintlayout.widget.a r3 = (androidx.constraintlayout.widget.C0419a) r3
            boolean r5 = r2 instanceof com.onedelhi.secure.bv4.C1807b
            if (r5 == 0) goto L_0x0106
            com.onedelhi.secure.bv4$b r2 = (com.onedelhi.secure.bv4.C1807b) r2
            r2.mo13829n(r9, r3)
            goto L_0x0008
        L_0x0106:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = " ViewSpline not a CustomSet frame = "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r1 = ", value"
            r5.append(r1)
            float r1 = r3.mo3312k()
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
        L_0x0129:
            android.util.Log.e(r4, r1)
            goto L_0x0008
        L_0x012e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x0129
        L_0x0140:
            float r1 = r7.f23760a
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            float r4 = r7.f23760a
        L_0x014b:
            r2.mo13827g(r9, r4)
            goto L_0x0008
        L_0x0150:
            float r1 = r7.f23786r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0159
            goto L_0x0167
        L_0x0159:
            float r6 = r7.f23786r
            goto L_0x0167
        L_0x015c:
            float r1 = r7.f23764b
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            float r6 = r7.f23764b
        L_0x0167:
            r2.mo13827g(r9, r6)
            goto L_0x0008
        L_0x016c:
            float r1 = r7.f23767c
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0175
            goto L_0x0167
        L_0x0175:
            float r6 = r7.f23767c
            goto L_0x0167
        L_0x0178:
            float r1 = r7.f23773i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0181
            goto L_0x0167
        L_0x0181:
            float r6 = r7.f23773i
            goto L_0x0167
        L_0x0184:
            float r1 = r7.f23772h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x018d
            goto L_0x0167
        L_0x018d:
            float r6 = r7.f23772h
            goto L_0x0167
        L_0x0190:
            float r1 = r7.f23771g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0199
            goto L_0x014b
        L_0x0199:
            float r4 = r7.f23771g
            goto L_0x014b
        L_0x019c:
            float r1 = r7.f23770f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01a5
            goto L_0x014b
        L_0x01a5:
            float r4 = r7.f23770f
            goto L_0x014b
        L_0x01a8:
            float r1 = r7.f23788s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01b1
            goto L_0x0167
        L_0x01b1:
            float r6 = r7.f23788s
            goto L_0x0167
        L_0x01b4:
            float r1 = r7.f23776l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01bd
            goto L_0x0167
        L_0x01bd:
            float r6 = r7.f23776l
            goto L_0x0167
        L_0x01c0:
            float r1 = r7.f23775k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01c9
            goto L_0x0167
        L_0x01c9:
            float r6 = r7.f23775k
            goto L_0x0167
        L_0x01cc:
            float r1 = r7.f23774j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01d5
            goto L_0x0167
        L_0x01d5:
            float r6 = r7.f23774j
            goto L_0x0167
        L_0x01d8:
            float r1 = r7.f23769e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01e1
            goto L_0x0167
        L_0x01e1:
            float r6 = r7.f23769e
            goto L_0x0167
        L_0x01e4:
            float r1 = r7.f23768d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01ee
            goto L_0x0167
        L_0x01ee:
            float r6 = r7.f23768d
            goto L_0x0167
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zk2.mo28014a(java.util.HashMap, int):void");
    }

    /* renamed from: b */
    public void mo28015b(View view) {
        this.f23781o = view.getVisibility();
        this.f23760a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f23765b = false;
        this.f23764b = view.getElevation();
        this.f23767c = view.getRotation();
        this.f23768d = view.getRotationX();
        this.f23769e = view.getRotationY();
        this.f23770f = view.getScaleX();
        this.f23771g = view.getScaleY();
        this.f23772h = view.getPivotX();
        this.f23773i = view.getPivotY();
        this.f23774j = view.getTranslationX();
        this.f23775k = view.getTranslationY();
        this.f23776l = view.getTranslationZ();
    }

    /* renamed from: e */
    public void mo28017e(C0426d.C0427a aVar) {
        C0426d.C0431d dVar = aVar.f2906a;
        int i = dVar.f3098b;
        this.f23779n = i;
        int i2 = dVar.f3095a;
        this.f23781o = i2;
        this.f23760a = (i2 == 0 || i != 0) ? dVar.f3094a : 0.0f;
        C0426d.C0432e eVar = aVar.f2907a;
        this.f23765b = eVar.f3116b;
        this.f23764b = eVar.f3125k;
        this.f23767c = eVar.f3112a;
        this.f23768d = eVar.f3115b;
        this.f23769e = eVar.f3117c;
        this.f23770f = eVar.f3118d;
        this.f23771g = eVar.f3119e;
        this.f23772h = eVar.f3120f;
        this.f23773i = eVar.f3121g;
        this.f23774j = eVar.f3122h;
        this.f23775k = eVar.f3123i;
        this.f23776l = eVar.f3124j;
        this.f23761a = ur0.m29534c(aVar.f2905a.f3082a);
        C0426d.C0430c cVar = aVar.f2905a;
        this.f23786r = cVar.f3084b;
        this.f23783p = cVar.f3089d;
        this.f23785q = cVar.f3081a;
        this.f23788s = aVar.f2906a.f3097b;
        for (String next : aVar.f2909a.keySet()) {
            C0419a aVar2 = aVar.f2909a.get(next);
            if (aVar2.mo3315n()) {
                this.f23762a.put(next, aVar2);
            }
        }
    }

    /* renamed from: g */
    public int compareTo(zk2 zk2) {
        return Float.compare(this.f23777m, zk2.f23777m);
    }

    /* renamed from: l */
    public final boolean mo28019l(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: q */
    public void mo28020q(zk2 zk2, HashSet<String> hashSet) {
        if (mo28019l(this.f23760a, zk2.f23760a)) {
            hashSet.add("alpha");
        }
        if (mo28019l(this.f23764b, zk2.f23764b)) {
            hashSet.add("elevation");
        }
        int i = this.f23781o;
        int i2 = zk2.f23781o;
        if (i != i2 && this.f23779n == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (mo28019l(this.f23767c, zk2.f23767c)) {
            hashSet.add(ly1.f15667d);
        }
        if (!Float.isNaN(this.f23786r) || !Float.isNaN(zk2.f23786r)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f23788s) || !Float.isNaN(zk2.f23788s)) {
            hashSet.add("progress");
        }
        if (mo28019l(this.f23768d, zk2.f23768d)) {
            hashSet.add("rotationX");
        }
        if (mo28019l(this.f23769e, zk2.f23769e)) {
            hashSet.add("rotationY");
        }
        if (mo28019l(this.f23772h, zk2.f23772h)) {
            hashSet.add(ly1.f15670g);
        }
        if (mo28019l(this.f23773i, zk2.f23773i)) {
            hashSet.add(ly1.f15671h);
        }
        if (mo28019l(this.f23770f, zk2.f23770f)) {
            hashSet.add("scaleX");
        }
        if (mo28019l(this.f23771g, zk2.f23771g)) {
            hashSet.add("scaleY");
        }
        if (mo28019l(this.f23774j, zk2.f23774j)) {
            hashSet.add("translationX");
        }
        if (mo28019l(this.f23775k, zk2.f23775k)) {
            hashSet.add("translationY");
        }
        if (mo28019l(this.f23776l, zk2.f23776l)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: r */
    public void mo28021r(zk2 zk2, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | mo28019l(this.f23777m, zk2.f23777m);
        zArr[1] = zArr[1] | mo28019l(this.f23778n, zk2.f23778n);
        zArr[2] = zArr[2] | mo28019l(this.f23780o, zk2.f23780o);
        zArr[3] = zArr[3] | mo28019l(this.f23782p, zk2.f23782p);
        zArr[4] = mo28019l(this.f23784q, zk2.f23784q) | zArr[4];
    }

    /* renamed from: s */
    public void mo28022s(double[] dArr, int[] iArr) {
        float[] fArr = {this.f23777m, this.f23778n, this.f23780o, this.f23782p, this.f23784q, this.f23760a, this.f23764b, this.f23767c, this.f23768d, this.f23769e, this.f23770f, this.f23771g, this.f23772h, this.f23773i, this.f23774j, this.f23775k, this.f23776l, this.f23786r};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 18) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* renamed from: t */
    public int mo28023t(String str, double[] dArr, int i) {
        C0419a aVar = this.f23762a.get(str);
        if (aVar.mo3317p() == 1) {
            dArr[i] = (double) aVar.mo3312k();
            return 1;
        }
        int p = aVar.mo3317p();
        float[] fArr = new float[p];
        aVar.mo3313l(fArr);
        int i2 = 0;
        while (i2 < p) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return p;
    }

    /* renamed from: u */
    public int mo28024u(String str) {
        return this.f23762a.get(str).mo3317p();
    }

    /* renamed from: v */
    public boolean mo28025v(String str) {
        return this.f23762a.containsKey(str);
    }

    /* renamed from: w */
    public void mo28026w(float f, float f2, float f3, float f4) {
        this.f23778n = f;
        this.f23780o = f2;
        this.f23782p = f3;
        this.f23784q = f4;
    }

    /* renamed from: x */
    public void mo28027x(Rect rect, View view, int i, float f) {
        float f2;
        mo28026w((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        mo28015b(view);
        this.f23772h = Float.NaN;
        this.f23773i = Float.NaN;
        if (i == 1) {
            f2 = f - 90.0f;
        } else if (i == 2) {
            f2 = f + 90.0f;
        } else {
            return;
        }
        this.f23767c = f2;
    }

    /* renamed from: y */
    public void mo28028y(Rect rect, C0426d dVar, int i, int i2) {
        float f;
        mo28026w((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        mo28017e(dVar.mo3471q0(i2));
        float f2 = 90.0f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            f = this.f23767c + 90.0f;
            this.f23767c = f;
            if (f > 180.0f) {
                f2 = 360.0f;
                this.f23767c = f - f2;
            }
            return;
        }
        f = this.f23767c;
        this.f23767c = f - f2;
    }

    /* renamed from: z */
    public void mo28029z(View view) {
        mo28026w(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        mo28015b(view);
    }
}
