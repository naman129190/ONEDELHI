package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.C0435e;

public class MotionEffect extends MotionHelper {

    /* renamed from: d */
    public static final String f1929d = "FadeMove";

    /* renamed from: u */
    public static final int f1930u = -1;

    /* renamed from: v */
    public static final int f1931v = 0;

    /* renamed from: w */
    public static final int f1932w = 1;

    /* renamed from: x */
    public static final int f1933x = 2;

    /* renamed from: y */
    public static final int f1934y = 3;

    /* renamed from: z */
    public static final int f1935z = -1;

    /* renamed from: b */
    public float f1936b = 0.1f;

    /* renamed from: e */
    public boolean f1937e = true;

    /* renamed from: o */
    public int f1938o = 49;

    /* renamed from: p */
    public int f1939p = 50;

    /* renamed from: q */
    public int f1940q = 0;

    /* renamed from: r */
    public int f1941r = 0;

    /* renamed from: s */
    public int f1942s = -1;

    /* renamed from: t */
    public int f1943t = -1;

    public MotionEffect(Context context) {
        super(context);
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2717J(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2717J(context, attributeSet);
    }

    /* renamed from: J */
    public final void mo2717J(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f1938o);
                    this.f1938o = i2;
                    this.f1938o = Math.max(Math.min(i2, 99), 0);
                } else if (index == C0435e.C0448m.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f1939p);
                    this.f1939p = i3;
                    this.f1939p = Math.max(Math.min(i3, 99), 0);
                } else if (index == C0435e.C0448m.MotionEffect_motionEffect_translationX) {
                    this.f1940q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1940q);
                } else if (index == C0435e.C0448m.MotionEffect_motionEffect_translationY) {
                    this.f1941r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1941r);
                } else if (index == C0435e.C0448m.MotionEffect_motionEffect_alpha) {
                    this.f1936b = obtainStyledAttributes.getFloat(index, this.f1936b);
                } else if (index == C0435e.C0448m.MotionEffect_motionEffect_move) {
                    this.f1943t = obtainStyledAttributes.getInt(index, this.f1943t);
                } else if (index == C0435e.C0448m.MotionEffect_motionEffect_strict) {
                    this.f1937e = obtainStyledAttributes.getBoolean(index, this.f1937e);
                } else if (index == C0435e.C0448m.MotionEffect_motionEffect_viewTransition) {
                    this.f1942s = obtainStyledAttributes.getResourceId(index, this.f1942s);
                }
            }
            int i4 = this.f1938o;
            int i5 = this.f1939p;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f1938o = i4 - 1;
                } else {
                    this.f1939p = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0189, code lost:
        if (r14 == 0.0f) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019d, code lost:
        if (r14 == 0.0f) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ad, code lost:
        if (r15 == 0.0f) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01bd, code lost:
        if (r15 == 0.0f) goto L_0x018c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2718e(androidx.constraintlayout.motion.widget.MotionLayout r22, java.util.HashMap<android.view.View, com.onedelhi.secure.cl2> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            android.view.ViewParent r2 = r21.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            android.view.View[] r2 = r0.mo3213w(r2)
            if (r2 != 0) goto L_0x002b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.onedelhi.secure.ve0.m30007f()
            r1.append(r2)
            java.lang.String r2 = " views = null"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FadeMove"
            android.util.Log.v(r2, r1)
            return
        L_0x002b:
            com.onedelhi.secure.my1 r3 = new com.onedelhi.secure.my1
            r3.<init>()
            com.onedelhi.secure.my1 r4 = new com.onedelhi.secure.my1
            r4.<init>()
            float r5 = r0.f1936b
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.String r6 = "alpha"
            r3.mo14442j(r6, r5)
            float r5 = r0.f1936b
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.mo14442j(r6, r5)
            int r5 = r0.f1938o
            r3.mo19937h(r5)
            int r5 = r0.f1939p
            r4.mo19937h(r5)
            com.onedelhi.secure.zy1 r5 = new com.onedelhi.secure.zy1
            r5.<init>()
            int r6 = r0.f1938o
            r5.mo19937h(r6)
            r6 = 0
            r5.mo28192z(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "percentX"
            r5.mo14442j(r8, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "percentY"
            r5.mo14442j(r9, r7)
            com.onedelhi.secure.zy1 r7 = new com.onedelhi.secure.zy1
            r7.<init>()
            int r10 = r0.f1939p
            r7.mo19937h(r10)
            r7.mo28192z(r6)
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.mo14442j(r8, r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7.mo14442j(r9, r8)
            int r8 = r0.f1940q
            r9 = 0
            if (r8 <= 0) goto L_0x00bc
            com.onedelhi.secure.my1 r8 = new com.onedelhi.secure.my1
            r8.<init>()
            com.onedelhi.secure.my1 r11 = new com.onedelhi.secure.my1
            r11.<init>()
            int r12 = r0.f1940q
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "translationX"
            r8.mo14442j(r13, r12)
            int r12 = r0.f1939p
            r8.mo19937h(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11.mo14442j(r13, r12)
            int r12 = r0.f1939p
            int r12 = r12 - r10
            r11.mo19937h(r12)
            goto L_0x00be
        L_0x00bc:
            r8 = r9
            r11 = r8
        L_0x00be:
            int r12 = r0.f1941r
            if (r12 <= 0) goto L_0x00ea
            com.onedelhi.secure.my1 r9 = new com.onedelhi.secure.my1
            r9.<init>()
            com.onedelhi.secure.my1 r12 = new com.onedelhi.secure.my1
            r12.<init>()
            int r13 = r0.f1941r
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "translationY"
            r9.mo14442j(r14, r13)
            int r13 = r0.f1939p
            r9.mo19937h(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12.mo14442j(r14, r13)
            int r13 = r0.f1939p
            int r13 = r13 - r10
            r12.mo19937h(r13)
            goto L_0x00eb
        L_0x00ea:
            r12 = r9
        L_0x00eb:
            int r13 = r0.f1943t
            r15 = -1
            r17 = 0
            if (r13 != r15) goto L_0x0157
            r13 = 4
            int[] r15 = new int[r13]
            r13 = 0
        L_0x00f6:
            int r14 = r2.length
            if (r13 >= r14) goto L_0x0143
            r14 = r2[r13]
            java.lang.Object r14 = r1.get(r14)
            com.onedelhi.secure.cl2 r14 = (com.onedelhi.secure.cl2) r14
            if (r14 != 0) goto L_0x0104
            goto L_0x0140
        L_0x0104:
            float r19 = r14.mo14244t()
            float r20 = r14.mo14203G()
            float r19 = r19 - r20
            float r20 = r14.mo14246u()
            float r14 = r14.mo14204H()
            float r20 = r20 - r14
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0121
            r14 = r15[r10]
            int r14 = r14 + r10
            r15[r10] = r14
        L_0x0121:
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x012a
            r14 = r15[r6]
            int r14 = r14 + r10
            r15[r6] = r14
        L_0x012a:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x0135
            r14 = 3
            r18 = r15[r14]
            int r18 = r18 + 1
            r15[r14] = r18
        L_0x0135:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0140
            r14 = 2
            r16 = r15[r14]
            int r16 = r16 + 1
            r15[r14] = r16
        L_0x0140:
            int r13 = r13 + 1
            goto L_0x00f6
        L_0x0143:
            r13 = r15[r6]
            r14 = r13
            r6 = 1
            r10 = 4
            r13 = 0
        L_0x0149:
            if (r6 >= r10) goto L_0x0157
            r10 = r15[r6]
            if (r14 >= r10) goto L_0x0153
            r10 = r15[r6]
            r13 = r6
            r14 = r10
        L_0x0153:
            int r6 = r6 + 1
            r10 = 4
            goto L_0x0149
        L_0x0157:
            r6 = 0
        L_0x0158:
            int r10 = r2.length
            if (r6 >= r10) goto L_0x01f6
            r10 = r2[r6]
            java.lang.Object r10 = r1.get(r10)
            com.onedelhi.secure.cl2 r10 = (com.onedelhi.secure.cl2) r10
            if (r10 != 0) goto L_0x016a
        L_0x0165:
            r1 = r22
            r15 = -1
            goto L_0x01f0
        L_0x016a:
            float r14 = r10.mo14244t()
            float r15 = r10.mo14203G()
            float r14 = r14 - r15
            float r15 = r10.mo14246u()
            float r20 = r10.mo14204H()
            float r15 = r15 - r20
            if (r13 != 0) goto L_0x0190
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x018e
            boolean r15 = r0.f1937e
            if (r15 == 0) goto L_0x018b
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x018e
        L_0x018b:
            r1 = 3
        L_0x018c:
            r14 = 0
            goto L_0x01c1
        L_0x018e:
            r1 = 3
            goto L_0x01c0
        L_0x0190:
            r1 = 1
            if (r13 != r1) goto L_0x01a0
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x018e
            boolean r15 = r0.f1937e
            if (r15 == 0) goto L_0x018b
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x018e
            goto L_0x018b
        L_0x01a0:
            r1 = 2
            if (r13 != r1) goto L_0x01b0
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x018e
            boolean r14 = r0.f1937e
            if (r14 == 0) goto L_0x018b
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x018e
            goto L_0x018b
        L_0x01b0:
            r1 = 3
            if (r13 != r1) goto L_0x01c0
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x01c0
            boolean r14 = r0.f1937e
            if (r14 == 0) goto L_0x018c
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x01c0
            goto L_0x018c
        L_0x01c0:
            r14 = 1
        L_0x01c1:
            if (r14 == 0) goto L_0x0165
            int r14 = r0.f1942s
            r15 = -1
            if (r14 != r15) goto L_0x01eb
            r10.mo14223a(r3)
            r10.mo14223a(r4)
            r10.mo14223a(r5)
            r10.mo14223a(r7)
            int r14 = r0.f1940q
            if (r14 <= 0) goto L_0x01de
            r10.mo14223a(r8)
            r10.mo14223a(r11)
        L_0x01de:
            int r14 = r0.f1941r
            if (r14 <= 0) goto L_0x01e8
            r10.mo14223a(r9)
            r10.mo14223a(r12)
        L_0x01e8:
            r1 = r22
            goto L_0x01f0
        L_0x01eb:
            r1 = r22
            r1.mo2766g0(r14, r10)
        L_0x01f0:
            int r6 = r6 + 1
            r1 = r23
            goto L_0x0158
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.mo2718e(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    /* renamed from: k */
    public boolean mo2719k() {
        return true;
    }
}
