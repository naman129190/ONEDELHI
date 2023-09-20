package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0419a;
import androidx.constraintlayout.widget.C0435e;
import java.util.HashMap;
import java.util.HashSet;

public class oy1 extends ly1 {

    /* renamed from: A */
    public static final String f18197A = "KeyCycle";

    /* renamed from: B */
    public static final String f18198B = "KeyCycle";

    /* renamed from: C */
    public static final String f18199C = "wavePeriod";

    /* renamed from: D */
    public static final String f18200D = "waveOffset";

    /* renamed from: E */
    public static final String f18201E = "wavePhase";

    /* renamed from: F */
    public static final String f18202F = "waveShape";

    /* renamed from: h */
    public static final int f18203h = 0;

    /* renamed from: i */
    public static final int f18204i = 1;

    /* renamed from: j */
    public static final int f18205j = 2;

    /* renamed from: k */
    public static final int f18206k = 3;

    /* renamed from: l */
    public static final int f18207l = 4;

    /* renamed from: m */
    public static final int f18208m = 5;

    /* renamed from: n */
    public static final int f18209n = 6;

    /* renamed from: o */
    public static final int f18210o = 4;

    /* renamed from: a */
    public float f18211a = Float.NaN;

    /* renamed from: b */
    public float f18212b = 0.0f;

    /* renamed from: c */
    public float f18213c = 0.0f;

    /* renamed from: d */
    public float f18214d = Float.NaN;

    /* renamed from: e */
    public float f18215e = Float.NaN;

    /* renamed from: e */
    public int f18216e = 0;

    /* renamed from: f */
    public float f18217f = Float.NaN;

    /* renamed from: f */
    public int f18218f = -1;

    /* renamed from: g */
    public float f18219g = Float.NaN;

    /* renamed from: g */
    public int f18220g = -1;

    /* renamed from: h */
    public float f18221h = Float.NaN;

    /* renamed from: i */
    public float f18222i = Float.NaN;

    /* renamed from: j */
    public float f18223j = Float.NaN;

    /* renamed from: k */
    public float f18224k = Float.NaN;

    /* renamed from: l */
    public float f18225l = Float.NaN;

    /* renamed from: m */
    public float f18226m = Float.NaN;

    /* renamed from: n */
    public float f18227n = Float.NaN;

    /* renamed from: o */
    public float f18228o = Float.NaN;

    /* renamed from: y */
    public String f18229y = null;

    /* renamed from: z */
    public String f18230z = null;

    /* renamed from: com.onedelhi.secure.oy1$a */
    public static class C3105a {

        /* renamed from: a */
        public static final int f18231a = 1;

        /* renamed from: a */
        public static SparseIntArray f18232a = null;

        /* renamed from: b */
        public static final int f18233b = 2;

        /* renamed from: c */
        public static final int f18234c = 3;

        /* renamed from: d */
        public static final int f18235d = 4;

        /* renamed from: e */
        public static final int f18236e = 5;

        /* renamed from: f */
        public static final int f18237f = 6;

        /* renamed from: g */
        public static final int f18238g = 7;

        /* renamed from: h */
        public static final int f18239h = 8;

        /* renamed from: i */
        public static final int f18240i = 9;

        /* renamed from: j */
        public static final int f18241j = 10;

        /* renamed from: k */
        public static final int f18242k = 11;

        /* renamed from: l */
        public static final int f18243l = 12;

        /* renamed from: m */
        public static final int f18244m = 13;

        /* renamed from: n */
        public static final int f18245n = 14;

        /* renamed from: o */
        public static final int f18246o = 15;

        /* renamed from: p */
        public static final int f18247p = 16;

        /* renamed from: q */
        public static final int f18248q = 17;

        /* renamed from: r */
        public static final int f18249r = 18;

        /* renamed from: s */
        public static final int f18250s = 19;

        /* renamed from: t */
        public static final int f18251t = 20;

        /* renamed from: u */
        public static final int f18252u = 21;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18232a = sparseIntArray;
            sparseIntArray.append(C0435e.C0448m.KeyCycle_motionTarget, 1);
            f18232a.append(C0435e.C0448m.KeyCycle_framePosition, 2);
            f18232a.append(C0435e.C0448m.KeyCycle_transitionEasing, 3);
            f18232a.append(C0435e.C0448m.KeyCycle_curveFit, 4);
            f18232a.append(C0435e.C0448m.KeyCycle_waveShape, 5);
            f18232a.append(C0435e.C0448m.KeyCycle_wavePeriod, 6);
            f18232a.append(C0435e.C0448m.KeyCycle_waveOffset, 7);
            f18232a.append(C0435e.C0448m.KeyCycle_waveVariesBy, 8);
            f18232a.append(C0435e.C0448m.KeyCycle_android_alpha, 9);
            f18232a.append(C0435e.C0448m.KeyCycle_android_elevation, 10);
            f18232a.append(C0435e.C0448m.KeyCycle_android_rotation, 11);
            f18232a.append(C0435e.C0448m.KeyCycle_android_rotationX, 12);
            f18232a.append(C0435e.C0448m.KeyCycle_android_rotationY, 13);
            f18232a.append(C0435e.C0448m.KeyCycle_transitionPathRotate, 14);
            f18232a.append(C0435e.C0448m.KeyCycle_android_scaleX, 15);
            f18232a.append(C0435e.C0448m.KeyCycle_android_scaleY, 16);
            f18232a.append(C0435e.C0448m.KeyCycle_android_translationX, 17);
            f18232a.append(C0435e.C0448m.KeyCycle_android_translationY, 18);
            f18232a.append(C0435e.C0448m.KeyCycle_android_translationZ, 19);
            f18232a.append(C0435e.C0448m.KeyCycle_motionProgress, 20);
            f18232a.append(C0435e.C0448m.KeyCycle_wavePhase, 21);
        }

        /* renamed from: b */
        public static void m24269b(oy1 oy1, TypedArray typedArray) {
            int i;
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                switch (f18232a.get(index)) {
                    case 1:
                        if (!MotionLayout.f1969w) {
                            if (typedArray.peekValue(index).type != 3) {
                                oy1.f15691b = typedArray.getResourceId(index, oy1.f15691b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, oy1.f15691b);
                            oy1.f15691b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        oy1.f15689a = typedArray.getString(index);
                        break;
                    case 2:
                        oy1.f15688a = typedArray.getInt(index, oy1.f15688a);
                        break;
                    case 3:
                        String unused = oy1.f18229y = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = oy1.f18216e = typedArray.getInteger(index, oy1.f18216e);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            String unused3 = oy1.f18230z = typedArray.getString(index);
                            i = 7;
                        } else {
                            i = typedArray.getInt(index, oy1.f18218f);
                        }
                        int unused4 = oy1.f18218f = i;
                        break;
                    case 6:
                        float unused5 = oy1.f18211a = typedArray.getFloat(index, oy1.f18211a);
                        break;
                    case 7:
                        float unused6 = oy1.f18212b = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, oy1.f18212b) : typedArray.getFloat(index, oy1.f18212b);
                        break;
                    case 8:
                        int unused7 = oy1.f18220g = typedArray.getInt(index, oy1.f18220g);
                        break;
                    case 9:
                        float unused8 = oy1.f18215e = typedArray.getFloat(index, oy1.f18215e);
                        break;
                    case 10:
                        float unused9 = oy1.f18217f = typedArray.getDimension(index, oy1.f18217f);
                        break;
                    case 11:
                        float unused10 = oy1.f18219g = typedArray.getFloat(index, oy1.f18219g);
                        break;
                    case 12:
                        float unused11 = oy1.f18222i = typedArray.getFloat(index, oy1.f18222i);
                        break;
                    case 13:
                        float unused12 = oy1.f18223j = typedArray.getFloat(index, oy1.f18223j);
                        break;
                    case 14:
                        float unused13 = oy1.f18221h = typedArray.getFloat(index, oy1.f18221h);
                        break;
                    case 15:
                        float unused14 = oy1.f18224k = typedArray.getFloat(index, oy1.f18224k);
                        break;
                    case 16:
                        float unused15 = oy1.f18225l = typedArray.getFloat(index, oy1.f18225l);
                        break;
                    case 17:
                        float unused16 = oy1.f18226m = typedArray.getDimension(index, oy1.f18226m);
                        break;
                    case 18:
                        float unused17 = oy1.f18227n = typedArray.getDimension(index, oy1.f18227n);
                        break;
                    case 19:
                        float unused18 = oy1.f18228o = typedArray.getDimension(index, oy1.f18228o);
                        break;
                    case 20:
                        float unused19 = oy1.f18214d = typedArray.getFloat(index, oy1.f18214d);
                        break;
                    case 21:
                        float unused20 = oy1.f18213c = typedArray.getFloat(index, oy1.f18213c) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f18232a.get(index));
                        break;
                }
            }
        }
    }

    public oy1() {
        this.f15692c = 4;
        this.f15690a = new HashMap<>();
    }

    /* renamed from: a */
    public void mo14436a(HashMap<String, bv4> hashMap) {
        int i;
        float f;
        ve0.m30015n("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String next : hashMap.keySet()) {
            x14 x14 = hashMap.get(next);
            if (x14 != null) {
                next.hashCode();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (next.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (next.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (next.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (next.equals(ly1.f15667d)) {
                            c = 8;
                            break;
                        }
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c = 13;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        i = this.f15688a;
                        f = this.f18222i;
                        break;
                    case 1:
                        i = this.f15688a;
                        f = this.f18223j;
                        break;
                    case 2:
                        i = this.f15688a;
                        f = this.f18226m;
                        break;
                    case 3:
                        i = this.f15688a;
                        f = this.f18227n;
                        break;
                    case 4:
                        i = this.f15688a;
                        f = this.f18228o;
                        break;
                    case 5:
                        i = this.f15688a;
                        f = this.f18214d;
                        break;
                    case 6:
                        i = this.f15688a;
                        f = this.f18224k;
                        break;
                    case 7:
                        i = this.f15688a;
                        f = this.f18225l;
                        break;
                    case 8:
                        i = this.f15688a;
                        f = this.f18219g;
                        break;
                    case 9:
                        i = this.f15688a;
                        f = this.f18217f;
                        break;
                    case 10:
                        i = this.f15688a;
                        f = this.f18221h;
                        break;
                    case 11:
                        i = this.f15688a;
                        f = this.f18215e;
                        break;
                    case 12:
                        i = this.f15688a;
                        f = this.f18212b;
                        break;
                    case 13:
                        i = this.f15688a;
                        f = this.f18213c;
                        break;
                    default:
                        if (!next.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + next);
                            break;
                        } else {
                            continue;
                        }
                }
                x14.mo13827g(i, f);
            }
        }
    }

    /* renamed from: a0 */
    public void mo22174a0(HashMap<String, ku4> hashMap) {
        ku4 ku4;
        ku4 ku42;
        HashMap<String, ku4> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM")) {
                C0419a aVar = this.f15690a.get(next.substring(7));
                if (!(aVar == null || aVar.mo3311j() != C0419a.C0421b.FLOAT_TYPE || (ku42 = hashMap2.get(next)) == null)) {
                    ku42.mo22767g(this.f15688a, this.f18218f, this.f18230z, this.f18220g, this.f18211a, this.f18212b, this.f18213c, aVar.mo3312k(), aVar);
                }
            } else {
                float b0 = mo22175b0(next);
                if (!Float.isNaN(b0) && (ku4 = hashMap2.get(next)) != null) {
                    ku4.mo22766f(this.f15688a, this.f18218f, this.f18230z, this.f18220g, this.f18211a, this.f18212b, this.f18213c, b0);
                }
            }
        }
    }

    /* renamed from: b */
    public ly1 clone() {
        return new oy1().mo14438c(this);
    }

    /* renamed from: b0 */
    public float mo22175b0(String str) {
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
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(ly1.f15667d)) {
                    c = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 12;
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f18222i;
            case 1:
                return this.f18223j;
            case 2:
                return this.f18226m;
            case 3:
                return this.f18227n;
            case 4:
                return this.f18228o;
            case 5:
                return this.f18214d;
            case 6:
                return this.f18224k;
            case 7:
                return this.f18225l;
            case 8:
                return this.f18219g;
            case 9:
                return this.f18217f;
            case 10:
                return this.f18221h;
            case 11:
                return this.f18215e;
            case 12:
                return this.f18212b;
            case 13:
                return this.f18213c;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    /* renamed from: c */
    public ly1 mo14438c(ly1 ly1) {
        super.mo14438c(ly1);
        oy1 oy1 = (oy1) ly1;
        this.f18229y = oy1.f18229y;
        this.f18216e = oy1.f18216e;
        this.f18218f = oy1.f18218f;
        this.f18230z = oy1.f18230z;
        this.f18211a = oy1.f18211a;
        this.f18212b = oy1.f18212b;
        this.f18213c = oy1.f18213c;
        this.f18214d = oy1.f18214d;
        this.f18220g = oy1.f18220g;
        this.f18215e = oy1.f18215e;
        this.f18217f = oy1.f18217f;
        this.f18219g = oy1.f18219g;
        this.f18221h = oy1.f18221h;
        this.f18222i = oy1.f18222i;
        this.f18223j = oy1.f18223j;
        this.f18224k = oy1.f18224k;
        this.f18225l = oy1.f18225l;
        this.f18226m = oy1.f18226m;
        this.f18227n = oy1.f18227n;
        this.f18228o = oy1.f18228o;
        return this;
    }

    /* renamed from: d */
    public void mo13346d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f18215e)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f18217f)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f18219g)) {
            hashSet.add(ly1.f15667d);
        }
        if (!Float.isNaN(this.f18222i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f18223j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f18224k)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f18225l)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f18221h)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f18226m)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f18227n)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f18228o)) {
            hashSet.add("translationZ");
        }
        if (this.f15690a.size() > 0) {
            for (String str : this.f15690a.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: f */
    public void mo14440f(Context context, AttributeSet attributeSet) {
        C3105a.m24269b(this, context.obtainStyledAttributes(attributeSet, C0435e.C0448m.KeyCycle));
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
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = 16;
                    break;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f18214d = mo19940m(obj);
                return;
            case 1:
                this.f18229y = obj.toString();
                return;
            case 2:
                this.f18222i = mo19940m(obj);
                return;
            case 3:
                this.f18223j = mo19940m(obj);
                return;
            case 4:
                this.f18226m = mo19940m(obj);
                return;
            case 5:
                this.f18227n = mo19940m(obj);
                return;
            case 6:
                this.f18228o = mo19940m(obj);
                return;
            case 7:
                this.f18224k = mo19940m(obj);
                return;
            case 8:
                this.f18225l = mo19940m(obj);
                return;
            case 9:
                this.f18219g = mo19940m(obj);
                return;
            case 10:
                this.f18217f = mo19940m(obj);
                return;
            case 11:
                this.f18221h = mo19940m(obj);
                return;
            case 12:
                this.f18215e = mo19940m(obj);
                return;
            case 13:
                this.f18212b = mo19940m(obj);
                return;
            case 14:
                this.f18211a = mo19940m(obj);
                return;
            case 15:
                this.f18216e = mo19941n(obj);
                return;
            case 16:
                this.f18213c = mo19940m(obj);
                return;
            case 17:
                if (obj instanceof Integer) {
                    this.f18218f = mo19941n(obj);
                    return;
                }
                this.f18218f = 7;
                this.f18230z = obj.toString();
                return;
            default:
                return;
        }
    }
}
