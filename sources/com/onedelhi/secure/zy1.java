package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0435e;
import java.util.HashMap;

public class zy1 extends az1 {

    /* renamed from: A */
    public static final String f23944A = "KeyPosition";

    /* renamed from: B */
    public static final String f23945B = "transitionEasing";

    /* renamed from: C */
    public static final String f23946C = "drawPath";

    /* renamed from: D */
    public static final String f23947D = "percentWidth";

    /* renamed from: E */
    public static final String f23948E = "percentHeight";

    /* renamed from: F */
    public static final String f23949F = "sizePercent";

    /* renamed from: G */
    public static final String f23950G = "percentX";

    /* renamed from: H */
    public static final String f23951H = "percentY";

    /* renamed from: i */
    public static final int f23952i = 2;

    /* renamed from: j */
    public static final int f23953j = 1;

    /* renamed from: k */
    public static final int f23954k = 0;

    /* renamed from: l */
    public static final int f23955l = 2;

    /* renamed from: z */
    public static final String f23956z = "KeyPosition";

    /* renamed from: b */
    public float f23957b = Float.NaN;

    /* renamed from: c */
    public float f23958c = Float.NaN;

    /* renamed from: d */
    public float f23959d = Float.NaN;

    /* renamed from: e */
    public float f23960e = Float.NaN;

    /* renamed from: f */
    public float f23961f = Float.NaN;

    /* renamed from: f */
    public int f23962f = ly1.f15666d;

    /* renamed from: g */
    public float f23963g = Float.NaN;

    /* renamed from: g */
    public int f23964g = 0;

    /* renamed from: h */
    public float f23965h = Float.NaN;

    /* renamed from: h */
    public int f23966h = 0;

    /* renamed from: i */
    public float f23967i = Float.NaN;

    /* renamed from: y */
    public String f23968y = null;

    /* renamed from: com.onedelhi.secure.zy1$a */
    public static class C4145a {

        /* renamed from: a */
        public static final int f23969a = 1;

        /* renamed from: a */
        public static SparseIntArray f23970a = null;

        /* renamed from: b */
        public static final int f23971b = 2;

        /* renamed from: c */
        public static final int f23972c = 3;

        /* renamed from: d */
        public static final int f23973d = 4;

        /* renamed from: e */
        public static final int f23974e = 5;

        /* renamed from: f */
        public static final int f23975f = 6;

        /* renamed from: g */
        public static final int f23976g = 7;

        /* renamed from: h */
        public static final int f23977h = 8;

        /* renamed from: i */
        public static final int f23978i = 9;

        /* renamed from: j */
        public static final int f23979j = 10;

        /* renamed from: k */
        public static final int f23980k = 11;

        /* renamed from: l */
        public static final int f23981l = 12;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f23970a = sparseIntArray;
            sparseIntArray.append(C0435e.C0448m.KeyPosition_motionTarget, 1);
            f23970a.append(C0435e.C0448m.KeyPosition_framePosition, 2);
            f23970a.append(C0435e.C0448m.KeyPosition_transitionEasing, 3);
            f23970a.append(C0435e.C0448m.KeyPosition_curveFit, 4);
            f23970a.append(C0435e.C0448m.KeyPosition_drawPath, 5);
            f23970a.append(C0435e.C0448m.KeyPosition_percentX, 6);
            f23970a.append(C0435e.C0448m.KeyPosition_percentY, 7);
            f23970a.append(C0435e.C0448m.KeyPosition_keyPositionType, 9);
            f23970a.append(C0435e.C0448m.KeyPosition_sizePercent, 8);
            f23970a.append(C0435e.C0448m.KeyPosition_percentWidth, 11);
            f23970a.append(C0435e.C0448m.KeyPosition_percentHeight, 12);
            f23970a.append(C0435e.C0448m.KeyPosition_pathMotionArc, 10);
        }

        /* renamed from: b */
        public static void m33555b(zy1 zy1, TypedArray typedArray) {
            float f;
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f23970a.get(index)) {
                    case 1:
                        if (MotionLayout.f1969w) {
                            int resourceId = typedArray.getResourceId(index, zy1.f15691b);
                            zy1.f15691b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type != 3) {
                            zy1.f15691b = typedArray.getResourceId(index, zy1.f15691b);
                            continue;
                        }
                        zy1.f15689a = typedArray.getString(index);
                        break;
                    case 2:
                        zy1.f15688a = typedArray.getInt(index, zy1.f15688a);
                        continue;
                    case 3:
                        zy1.f23968y = typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : ur0.f21493a[typedArray.getInteger(index, 0)];
                        continue;
                    case 4:
                        zy1.f9584e = typedArray.getInteger(index, zy1.f9584e);
                        continue;
                    case 5:
                        zy1.f23964g = typedArray.getInt(index, zy1.f23964g);
                        continue;
                    case 6:
                        zy1.f23959d = typedArray.getFloat(index, zy1.f23959d);
                        continue;
                    case 7:
                        zy1.f23960e = typedArray.getFloat(index, zy1.f23960e);
                        continue;
                    case 8:
                        f = typedArray.getFloat(index, zy1.f23958c);
                        zy1.f23957b = f;
                        break;
                    case 9:
                        zy1.f23966h = typedArray.getInt(index, zy1.f23966h);
                        continue;
                    case 10:
                        zy1.f23962f = typedArray.getInt(index, zy1.f23962f);
                        continue;
                    case 11:
                        zy1.f23957b = typedArray.getFloat(index, zy1.f23957b);
                        continue;
                    case 12:
                        f = typedArray.getFloat(index, zy1.f23958c);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f23970a.get(index));
                        continue;
                }
                zy1.f23958c = f;
            }
            if (zy1.f15688a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public zy1() {
        this.f15692c = 2;
    }

    /* renamed from: a */
    public void mo14436a(HashMap<String, bv4> hashMap) {
    }

    /* renamed from: b */
    public ly1 clone() {
        return new zy1().mo14438c(this);
    }

    /* renamed from: c */
    public ly1 mo14438c(ly1 ly1) {
        super.mo14438c(ly1);
        zy1 zy1 = (zy1) ly1;
        this.f23968y = zy1.f23968y;
        this.f23962f = zy1.f23962f;
        this.f23964g = zy1.f23964g;
        this.f23957b = zy1.f23957b;
        this.f23958c = Float.NaN;
        this.f23959d = zy1.f23959d;
        this.f23960e = zy1.f23960e;
        this.f23961f = zy1.f23961f;
        this.f23963g = zy1.f23963g;
        this.f23965h = zy1.f23965h;
        this.f23967i = zy1.f23967i;
        return this;
    }

    /* renamed from: f */
    public void mo14440f(Context context, AttributeSet attributeSet) {
        C4145a.m33555b(this, context.obtainStyledAttributes(attributeSet, C0435e.C0448m.KeyPosition));
    }

    /* renamed from: j */
    public void mo14442j(String str, Object obj) {
        float f;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f23968y = obj.toString();
                return;
            case 1:
                this.f23957b = mo19940m(obj);
                return;
            case 2:
                f = mo19940m(obj);
                break;
            case 3:
                this.f23964g = mo19941n(obj);
                return;
            case 4:
                f = mo19940m(obj);
                this.f23957b = f;
                break;
            case 5:
                this.f23959d = mo19940m(obj);
                return;
            case 6:
                this.f23960e = mo19940m(obj);
                return;
            default:
                return;
        }
        this.f23958c = f;
    }

    /* renamed from: o */
    public void mo13347o(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.f23966h;
        if (i3 == 1) {
            mo28187u(f, f2, f3, f4);
        } else if (i3 != 2) {
            mo28186t(f, f2, f3, f4);
        } else {
            mo28188v(i, i2);
        }
    }

    /* renamed from: p */
    public float mo13348p() {
        return this.f23965h;
    }

    /* renamed from: q */
    public float mo13349q() {
        return this.f23967i;
    }

    /* renamed from: r */
    public boolean mo13350r(int i, int i2, RectF rectF, RectF rectF2, float f, float f2) {
        mo13347o(i, i2, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(f - this.f23965h) < 20.0f && Math.abs(f2 - this.f23967i) < 20.0f;
    }

    /* renamed from: s */
    public void mo13351s(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.f23966h;
        if (i == 1) {
            mo28190x(rectF, rectF2, f, f2, strArr, fArr);
        } else if (i != 2) {
            mo28189w(rectF, rectF2, f, f2, strArr, fArr);
        } else {
            mo28191y(view, rectF, rectF2, f, f2, strArr, fArr);
        }
    }

    /* renamed from: t */
    public final void mo28186t(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = 0.0f;
        float f8 = Float.isNaN(this.f23959d) ? 0.0f : this.f23959d;
        float f9 = Float.isNaN(this.f23963g) ? 0.0f : this.f23963g;
        float f10 = Float.isNaN(this.f23960e) ? 0.0f : this.f23960e;
        if (!Float.isNaN(this.f23961f)) {
            f7 = this.f23961f;
        }
        this.f23965h = (float) ((int) (f + (f8 * f5) + (f7 * f6)));
        this.f23967i = (float) ((int) (f2 + (f5 * f9) + (f6 * f10)));
    }

    /* renamed from: u */
    public final void mo28187u(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.f23959d;
        float f8 = this.f23960e;
        this.f23965h = f + (f5 * f7) + ((-f6) * f8);
        this.f23967i = f2 + (f6 * f7) + (f5 * f8);
    }

    /* renamed from: v */
    public final void mo28188v(int i, int i2) {
        float f = this.f23959d;
        float f2 = (float) 0;
        this.f23965h = (((float) (i - 0)) * f) + f2;
        this.f23967i = (((float) (i2 - 0)) * f) + f2;
    }

    /* renamed from: w */
    public void mo28189w(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        if (strArr[0] != null) {
            float f3 = (f - centerX) / centerX2;
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f3;
                fArr[1] = (f2 - centerY) / centerY2;
                return;
            }
            fArr[1] = f3;
            fArr[0] = (f2 - centerY) / centerY2;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = (f - centerX) / centerX2;
        strArr[1] = "percentY";
        fArr[1] = (f2 - centerY) / centerY2;
    }

    /* renamed from: x */
    public void mo28190x(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot((double) centerX2, (double) centerY2);
        if (((double) hypot) < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = centerX2 / hypot;
        float f4 = centerY2 / hypot;
        float f5 = f2 - centerY;
        float f6 = f - centerX;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
        if (strArr[0] == null) {
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f8;
            fArr[1] = f7;
        } else if ("percentX".equals(strArr[0])) {
            fArr[0] = f8;
            fArr[1] = f7;
        }
    }

    /* renamed from: y */
    public void mo28191y(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        if (strArr[0] != null) {
            float f3 = f / ((float) width);
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f3;
                fArr[1] = f2 / ((float) height);
                return;
            }
            fArr[1] = f3;
            fArr[0] = f2 / ((float) height);
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = f / ((float) width);
        strArr[1] = "percentY";
        fArr[1] = f2 / ((float) height);
    }

    /* renamed from: z */
    public void mo28192z(int i) {
        this.f23966h = i;
    }
}
