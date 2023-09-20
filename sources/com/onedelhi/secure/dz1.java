package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0419a;
import androidx.constraintlayout.widget.C0435e;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class dz1 extends ly1 {

    /* renamed from: B */
    public static final String f11008B = "KeyTrigger";

    /* renamed from: C */
    public static final String f11009C = "KeyTrigger";

    /* renamed from: D */
    public static final String f11010D = "viewTransitionOnCross";

    /* renamed from: E */
    public static final String f11011E = "viewTransitionOnPositiveCross";

    /* renamed from: F */
    public static final String f11012F = "viewTransitionOnNegativeCross";

    /* renamed from: G */
    public static final String f11013G = "postLayout";

    /* renamed from: H */
    public static final String f11014H = "triggerSlack";

    /* renamed from: I */
    public static final String f11015I = "triggerCollisionView";

    /* renamed from: J */
    public static final String f11016J = "triggerCollisionId";

    /* renamed from: K */
    public static final String f11017K = "triggerID";

    /* renamed from: L */
    public static final String f11018L = "positiveCross";

    /* renamed from: M */
    public static final String f11019M = "negativeCross";

    /* renamed from: N */
    public static final String f11020N = "triggerReceiver";

    /* renamed from: O */
    public static final String f11021O = "CROSS";

    /* renamed from: l */
    public static final int f11022l = 5;

    /* renamed from: A */
    public String f11023A;

    /* renamed from: a */
    public float f11024a;

    /* renamed from: a */
    public RectF f11025a;

    /* renamed from: a */
    public View f11026a;

    /* renamed from: a */
    public boolean f11027a;

    /* renamed from: b */
    public float f11028b;

    /* renamed from: b */
    public RectF f11029b;

    /* renamed from: b */
    public HashMap<String, Method> f11030b;

    /* renamed from: b */
    public boolean f11031b;

    /* renamed from: c */
    public float f11032c;

    /* renamed from: c */
    public boolean f11033c;

    /* renamed from: d */
    public boolean f11034d;

    /* renamed from: e */
    public int f11035e = -1;

    /* renamed from: f */
    public int f11036f;

    /* renamed from: g */
    public int f11037g;

    /* renamed from: h */
    public int f11038h;

    /* renamed from: i */
    public int f11039i;

    /* renamed from: j */
    public int f11040j;

    /* renamed from: k */
    public int f11041k;

    /* renamed from: y */
    public String f11042y = null;

    /* renamed from: z */
    public String f11043z;

    /* renamed from: com.onedelhi.secure.dz1$a */
    public static class C2014a {

        /* renamed from: a */
        public static final int f11044a = 1;

        /* renamed from: a */
        public static SparseIntArray f11045a = null;

        /* renamed from: b */
        public static final int f11046b = 2;

        /* renamed from: c */
        public static final int f11047c = 4;

        /* renamed from: d */
        public static final int f11048d = 5;

        /* renamed from: e */
        public static final int f11049e = 6;

        /* renamed from: f */
        public static final int f11050f = 7;

        /* renamed from: g */
        public static final int f11051g = 8;

        /* renamed from: h */
        public static final int f11052h = 9;

        /* renamed from: i */
        public static final int f11053i = 10;

        /* renamed from: j */
        public static final int f11054j = 11;

        /* renamed from: k */
        public static final int f11055k = 12;

        /* renamed from: l */
        public static final int f11056l = 13;

        /* renamed from: m */
        public static final int f11057m = 14;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11045a = sparseIntArray;
            sparseIntArray.append(C0435e.C0448m.KeyTrigger_framePosition, 8);
            f11045a.append(C0435e.C0448m.KeyTrigger_onCross, 4);
            f11045a.append(C0435e.C0448m.KeyTrigger_onNegativeCross, 1);
            f11045a.append(C0435e.C0448m.KeyTrigger_onPositiveCross, 2);
            f11045a.append(C0435e.C0448m.KeyTrigger_motionTarget, 7);
            f11045a.append(C0435e.C0448m.KeyTrigger_triggerId, 6);
            f11045a.append(C0435e.C0448m.KeyTrigger_triggerSlack, 5);
            f11045a.append(C0435e.C0448m.KeyTrigger_motion_triggerOnCollision, 9);
            f11045a.append(C0435e.C0448m.KeyTrigger_motion_postLayoutCollision, 10);
            f11045a.append(C0435e.C0448m.KeyTrigger_triggerReceiver, 11);
            f11045a.append(C0435e.C0448m.KeyTrigger_viewTransitionOnCross, 12);
            f11045a.append(C0435e.C0448m.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f11045a.append(C0435e.C0448m.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        /* renamed from: a */
        public static void m13472a(dz1 dz1, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f11045a.get(index)) {
                    case 1:
                        String unused = dz1.f11043z = typedArray.getString(index);
                        break;
                    case 2:
                        String unused2 = dz1.f11023A = typedArray.getString(index);
                        break;
                    case 4:
                        String unused3 = dz1.f11042y = typedArray.getString(index);
                        break;
                    case 5:
                        dz1.f11024a = typedArray.getFloat(index, dz1.f11024a);
                        break;
                    case 6:
                        int unused4 = dz1.f11037g = typedArray.getResourceId(index, dz1.f11037g);
                        break;
                    case 7:
                        if (!MotionLayout.f1969w) {
                            if (typedArray.peekValue(index).type != 3) {
                                dz1.f15691b = typedArray.getResourceId(index, dz1.f15691b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, dz1.f15691b);
                            dz1.f15691b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        dz1.f15689a = typedArray.getString(index);
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, dz1.f15688a);
                        dz1.f15688a = integer;
                        float unused5 = dz1.f11028b = (((float) integer) + 0.5f) / 100.0f;
                        break;
                    case 9:
                        int unused6 = dz1.f11038h = typedArray.getResourceId(index, dz1.f11038h);
                        break;
                    case 10:
                        boolean unused7 = dz1.f11034d = typedArray.getBoolean(index, dz1.f11034d);
                        break;
                    case 11:
                        int unused8 = dz1.f11036f = typedArray.getResourceId(index, dz1.f11036f);
                        break;
                    case 12:
                        dz1.f11041k = typedArray.getResourceId(index, dz1.f11041k);
                        break;
                    case 13:
                        dz1.f11039i = typedArray.getResourceId(index, dz1.f11039i);
                        break;
                    case 14:
                        dz1.f11040j = typedArray.getResourceId(index, dz1.f11040j);
                        break;
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f11045a.get(index));
                        break;
                }
            }
        }
    }

    public dz1() {
        int i = ly1.f15666d;
        this.f11036f = i;
        this.f11043z = null;
        this.f11023A = null;
        this.f11037g = i;
        this.f11038h = i;
        this.f11026a = null;
        this.f11024a = 0.1f;
        this.f11027a = true;
        this.f11031b = true;
        this.f11033c = true;
        this.f11028b = Float.NaN;
        this.f11034d = false;
        this.f11039i = i;
        this.f11040j = i;
        this.f11041k = i;
        this.f11025a = new RectF();
        this.f11029b = new RectF();
        this.f11030b = new HashMap<>();
        this.f15692c = 5;
        this.f15690a = new HashMap<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14950A(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.f11038h
            int r1 = com.onedelhi.secure.ly1.f15666d
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0062
            android.view.View r0 = r9.f11026a
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.f11038h
            android.view.View r0 = r0.findViewById(r1)
            r9.f11026a = r0
        L_0x001a:
            android.graphics.RectF r0 = r9.f11025a
            android.view.View r1 = r9.f11026a
            boolean r4 = r9.f11034d
            r9.mo14954E(r0, r1, r4)
            android.graphics.RectF r0 = r9.f11029b
            boolean r1 = r9.f11034d
            r9.mo14954E(r0, r11, r1)
            android.graphics.RectF r0 = r9.f11025a
            android.graphics.RectF r1 = r9.f11029b
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r9.f11027a
            if (r0 == 0) goto L_0x003c
            r9.f11027a = r2
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r9.f11033c
            if (r1 == 0) goto L_0x0045
            r9.f11033c = r2
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r9.f11031b = r3
            r4 = r1
            r1 = 0
            goto L_0x00e3
        L_0x004c:
            boolean r0 = r9.f11027a
            if (r0 != 0) goto L_0x0054
            r9.f11027a = r3
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            boolean r1 = r9.f11031b
            if (r1 == 0) goto L_0x005d
            r9.f11031b = r2
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            r9.f11033c = r3
            goto L_0x00e2
        L_0x0062:
            boolean r0 = r9.f11027a
            r1 = 0
            if (r0 == 0) goto L_0x0078
            float r0 = r9.f11028b
            float r4 = r10 - r0
            float r5 = r9.f11032c
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            r9.f11027a = r2
            r0 = 1
            goto L_0x0089
        L_0x0078:
            float r0 = r9.f11028b
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.f11024a
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r9.f11027a = r3
        L_0x0088:
            r0 = 0
        L_0x0089:
            boolean r4 = r9.f11031b
            if (r4 == 0) goto L_0x00a2
            float r4 = r9.f11028b
            float r5 = r10 - r4
            float r6 = r9.f11032c
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            r9.f11031b = r2
            r4 = 1
            goto L_0x00b3
        L_0x00a2:
            float r4 = r9.f11028b
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.f11024a
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b2
            r9.f11031b = r3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            boolean r5 = r9.f11033c
            if (r5 == 0) goto L_0x00d1
            float r5 = r9.f11028b
            float r6 = r10 - r5
            float r7 = r9.f11032c
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00cc
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cc
            r9.f11033c = r2
            r1 = 1
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x00e3
        L_0x00d1:
            float r1 = r9.f11028b
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.f11024a
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e1
            r9.f11033c = r3
        L_0x00e1:
            r1 = r4
        L_0x00e2:
            r4 = 0
        L_0x00e3:
            r9.f11032c = r10
            if (r1 != 0) goto L_0x00eb
            if (r0 != 0) goto L_0x00eb
            if (r4 == 0) goto L_0x00f6
        L_0x00eb:
            android.view.ViewParent r5 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r6 = r9.f11037g
            r5.mo2830x0(r6, r4, r10)
        L_0x00f6:
            int r10 = r9.f11036f
            int r5 = com.onedelhi.secure.ly1.f15666d
            if (r10 != r5) goto L_0x00fe
            r10 = r11
            goto L_0x010a
        L_0x00fe:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r5 = r9.f11036f
            android.view.View r10 = r10.findViewById(r5)
        L_0x010a:
            if (r1 == 0) goto L_0x0128
            java.lang.String r1 = r9.f11043z
            if (r1 == 0) goto L_0x0113
            r9.mo14951B(r1, r10)
        L_0x0113:
            int r1 = r9.f11039i
            int r5 = com.onedelhi.secure.ly1.f15666d
            if (r1 == r5) goto L_0x0128
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r5 = r9.f11039i
            android.view.View[] r6 = new android.view.View[r3]
            r6[r2] = r10
            r1.mo2787j1(r5, r6)
        L_0x0128:
            if (r4 == 0) goto L_0x0146
            java.lang.String r1 = r9.f11023A
            if (r1 == 0) goto L_0x0131
            r9.mo14951B(r1, r10)
        L_0x0131:
            int r1 = r9.f11040j
            int r4 = com.onedelhi.secure.ly1.f15666d
            if (r1 == r4) goto L_0x0146
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r4 = r9.f11040j
            android.view.View[] r5 = new android.view.View[r3]
            r5[r2] = r10
            r1.mo2787j1(r4, r5)
        L_0x0146:
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = r9.f11042y
            if (r0 == 0) goto L_0x014f
            r9.mo14951B(r0, r10)
        L_0x014f:
            int r0 = r9.f11041k
            int r1 = com.onedelhi.secure.ly1.f15666d
            if (r0 == r1) goto L_0x0164
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r0 = r9.f11041k
            android.view.View[] r1 = new android.view.View[r3]
            r1[r2] = r10
            r11.mo2787j1(r0, r1)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dz1.mo14950A(float, android.view.View):void");
    }

    /* renamed from: B */
    public final void mo14951B(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(".")) {
                mo14952C(str, view);
                return;
            }
            if (this.f11030b.containsKey(str)) {
                method = this.f11030b.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f11030b.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f11030b.put(str, (Object) null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + ve0.m30012k(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f11042y + "\"on class " + view.getClass().getSimpleName() + " " + ve0.m30012k(view));
            }
        }
    }

    /* renamed from: C */
    public final void mo14952C(String str, View view) {
        C0419a aVar;
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String next : this.f15690a.keySet()) {
            String lowerCase = next.toLowerCase(Locale.ROOT);
            if ((z || lowerCase.matches(str)) && (aVar = this.f15690a.get(next)) != null) {
                aVar.mo3304a(view);
            }
        }
    }

    /* renamed from: D */
    public int mo14953D() {
        return this.f11035e;
    }

    /* renamed from: E */
    public final void mo14954E(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* renamed from: a */
    public void mo14436a(HashMap<String, bv4> hashMap) {
    }

    /* renamed from: b */
    public ly1 clone() {
        return new dz1().mo14438c(this);
    }

    /* renamed from: c */
    public ly1 mo14438c(ly1 ly1) {
        super.mo14438c(ly1);
        dz1 dz1 = (dz1) ly1;
        this.f11035e = dz1.f11035e;
        this.f11042y = dz1.f11042y;
        this.f11036f = dz1.f11036f;
        this.f11043z = dz1.f11043z;
        this.f11023A = dz1.f11023A;
        this.f11037g = dz1.f11037g;
        this.f11038h = dz1.f11038h;
        this.f11026a = dz1.f11026a;
        this.f11024a = dz1.f11024a;
        this.f11027a = dz1.f11027a;
        this.f11031b = dz1.f11031b;
        this.f11033c = dz1.f11033c;
        this.f11028b = dz1.f11028b;
        this.f11032c = dz1.f11032c;
        this.f11034d = dz1.f11034d;
        this.f11025a = dz1.f11025a;
        this.f11029b = dz1.f11029b;
        this.f11030b = dz1.f11030b;
        return this;
    }

    /* renamed from: d */
    public void mo13346d(HashSet<String> hashSet) {
    }

    /* renamed from: f */
    public void mo14440f(Context context, AttributeSet attributeSet) {
        C2014a.m13472a(this, context.obtainStyledAttributes(attributeSet, C0435e.C0448m.KeyTrigger), context);
    }

    /* renamed from: j */
    public void mo14442j(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c = 0;
                    break;
                }
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c = 1;
                    break;
                }
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c = 2;
                    break;
                }
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c = 3;
                    break;
                }
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c = 4;
                    break;
                }
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c = 5;
                    break;
                }
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c = 6;
                    break;
                }
                break;
            case 64397344:
                if (str.equals("CROSS")) {
                    c = 7;
                    break;
                }
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c = 8;
                    break;
                }
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c = 9;
                    break;
                }
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c = 10;
                    break;
                }
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f11023A = obj.toString();
                return;
            case 1:
                this.f11040j = mo19941n(obj);
                return;
            case 2:
                this.f11038h = mo19941n(obj);
                return;
            case 3:
                this.f11037g = mo19941n(obj);
                return;
            case 4:
                this.f11043z = obj.toString();
                return;
            case 5:
                this.f11026a = (View) obj;
                return;
            case 6:
                this.f11039i = mo19941n(obj);
                return;
            case 7:
                this.f11042y = obj.toString();
                return;
            case 8:
                this.f11024a = mo19940m(obj);
                return;
            case 9:
                this.f11041k = mo19941n(obj);
                return;
            case 10:
                this.f11034d = mo19939l(obj);
                return;
            case 11:
                this.f11036f = mo19941n(obj);
                return;
            default:
                return;
        }
    }
}
