package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

public class CircularFlow extends VirtualLayout {

    /* renamed from: a */
    public static float f1880a = 0.0f;

    /* renamed from: f */
    public static final String f1881f = "CircularFlow";

    /* renamed from: r */
    public static int f1882r;

    /* renamed from: a */
    public ConstraintLayout f1883a;

    /* renamed from: a */
    public Float f1884a;

    /* renamed from: a */
    public Integer f1885a;

    /* renamed from: a */
    public float[] f1886a;

    /* renamed from: b */
    public int[] f1887b;

    /* renamed from: d */
    public String f1888d;

    /* renamed from: e */
    public String f1889e;

    /* renamed from: o */
    public int f1890o;

    /* renamed from: p */
    public int f1891p;

    /* renamed from: q */
    public int f1892q;

    public CircularFlow(Context context) {
        super(context);
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: Q */
    public static float[] m2636Q(float[] fArr, int i) {
        float[] fArr2 = new float[(fArr.length - 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (i3 != i) {
                fArr2[i2] = fArr[i3];
                i2++;
            }
        }
        return fArr2;
    }

    /* renamed from: R */
    public static int[] m2637R(int[] iArr, int i) {
        int[] iArr2 = new int[(iArr.length - 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != i) {
                iArr2[i2] = iArr[i3];
                i2++;
            }
        }
        return iArr2;
    }

    private void setAngles(String str) {
        if (str != null) {
            int i = 0;
            this.f1892q = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo2659K(str.substring(i).trim());
                    return;
                } else {
                    mo2659K(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    private void setRadius(String str) {
        if (str != null) {
            int i = 0;
            this.f1891p = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo2660L(str.substring(i).trim());
                    return;
                } else {
                    mo2660L(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: A */
    public int mo2658A(View view) {
        int A = super.mo2658A(view);
        if (A == -1) {
            return A;
        }
        C0426d dVar = new C0426d();
        dVar.mo3397H(this.f1883a);
        dVar.mo3392F(view.getId(), 8);
        dVar.mo3473r(this.f1883a);
        float[] fArr = this.f1886a;
        if (A < fArr.length) {
            this.f1886a = mo2664P(fArr, A);
            this.f1892q--;
        }
        int[] iArr = this.f1887b;
        if (A < iArr.length) {
            this.f1887b = mo2665S(iArr, A);
            this.f1891p--;
        }
        mo2662N();
        return A;
    }

    /* renamed from: K */
    public final void mo2659K(String str) {
        float[] fArr;
        if (str != null && str.length() != 0 && this.f2459a != null && (fArr = this.f1886a) != null) {
            if (this.f1892q + 1 > fArr.length) {
                this.f1886a = Arrays.copyOf(fArr, fArr.length + 1);
            }
            this.f1886a[this.f1892q] = (float) Integer.parseInt(str);
            this.f1892q++;
        }
    }

    /* renamed from: L */
    public final void mo2660L(String str) {
        int[] iArr;
        if (str != null && str.length() != 0 && this.f2459a != null && (iArr = this.f1887b) != null) {
            if (this.f1891p + 1 > iArr.length) {
                this.f1887b = Arrays.copyOf(iArr, iArr.length + 1);
            }
            this.f1887b[this.f1891p] = (int) (((float) Integer.parseInt(str)) * this.f2459a.getResources().getDisplayMetrics().density);
            this.f1891p++;
        }
    }

    /* renamed from: M */
    public void mo2661M(View view, int i, float f) {
        if (!mo3205s(view.getId())) {
            mo3201o(view);
            this.f1892q++;
            float[] angles = getAngles();
            this.f1886a = angles;
            angles[this.f1892q - 1] = f;
            this.f1891p++;
            int[] radius = getRadius();
            this.f1887b = radius;
            radius[this.f1891p - 1] = (int) (((float) i) * this.f2459a.getResources().getDisplayMetrics().density);
            mo2662N();
        }
    }

    /* renamed from: N */
    public final void mo2662N() {
        this.f1883a = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f2467n; i++) {
            View t = this.f1883a.mo3248t(this.f2462a[i]);
            if (t != null) {
                int i2 = f1882r;
                float f = f1880a;
                int[] iArr = this.f1887b;
                if (iArr == null || i >= iArr.length) {
                    Integer num = this.f1885a;
                    if (num == null || num.intValue() == -1) {
                        Log.e(f1881f, "Added radius to view with id: " + this.f2461a.get(Integer.valueOf(t.getId())));
                    } else {
                        this.f1891p++;
                        if (this.f1887b == null) {
                            this.f1887b = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f1887b = radius;
                        radius[this.f1891p - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.f1886a;
                if (fArr == null || i >= fArr.length) {
                    Float f2 = this.f1884a;
                    if (f2 == null || f2.floatValue() == -1.0f) {
                        Log.e(f1881f, "Added angle to view with id: " + this.f2461a.get(Integer.valueOf(t.getId())));
                    } else {
                        this.f1892q++;
                        if (this.f1886a == null) {
                            this.f1886a = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f1886a = angles;
                        angles[this.f1892q - 1] = f;
                    }
                } else {
                    f = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) t.getLayoutParams();
                layoutParams.f2553b = f;
                layoutParams.f2588n = this.f1890o;
                layoutParams.f2589o = i2;
                t.setLayoutParams(layoutParams);
            }
        }
        mo3203p();
    }

    /* renamed from: O */
    public boolean mo2663O(View view) {
        return mo3205s(view.getId()) && mo3214x(view.getId()) != -1;
    }

    /* renamed from: P */
    public final float[] mo2664P(float[] fArr, int i) {
        return (fArr == null || i < 0 || i >= this.f1892q) ? fArr : m2636Q(fArr, i);
    }

    /* renamed from: S */
    public final int[] mo2665S(int[] iArr, int i) {
        return (iArr == null || i < 0 || i >= this.f1891p) ? iArr : m2637R(iArr, i);
    }

    /* renamed from: T */
    public void mo2666T(View view, float f) {
        if (!mo2663O(view)) {
            Log.e(f1881f, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int x = mo3214x(view.getId());
        if (x <= this.f1886a.length) {
            float[] angles = getAngles();
            this.f1886a = angles;
            angles[x] = f;
            mo2662N();
        }
    }

    /* renamed from: U */
    public void mo2667U(View view, int i) {
        if (!mo2663O(view)) {
            Log.e(f1881f, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int x = mo3214x(view.getId());
        if (x <= this.f1887b.length) {
            int[] radius = getRadius();
            this.f1887b = radius;
            radius[x] = (int) (((float) i) * this.f2459a.getResources().getDisplayMetrics().density);
            mo2662N();
        }
    }

    /* renamed from: V */
    public void mo2668V(View view, int i, float f) {
        if (!mo2663O(view)) {
            Log.e(f1881f, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int x = mo3214x(view.getId());
        if (getAngles().length > x) {
            float[] angles = getAngles();
            this.f1886a = angles;
            angles[x] = f;
        }
        if (getRadius().length > x) {
            int[] radius = getRadius();
            this.f1887b = radius;
            radius[x] = (int) (((float) i) * this.f2459a.getResources().getDisplayMetrics().density);
        }
        mo2662N();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f1886a, this.f1892q);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f1887b, this.f1891p);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1888d;
        if (str != null) {
            this.f1886a = new float[1];
            setAngles(str);
        }
        String str2 = this.f1889e;
        if (str2 != null) {
            this.f1887b = new int[1];
            setRadius(str2);
        }
        Float f = this.f1884a;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f1885a;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        mo2662N();
    }

    public void setDefaultAngle(float f) {
        f1880a = f;
    }

    public void setDefaultRadius(int i) {
        f1882r = i;
    }

    /* renamed from: y */
    public void mo2673y(AttributeSet attributeSet) {
        super.mo2673y(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f1890o = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1888d = string;
                    setAngles(string);
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1889e = string2;
                    setRadius(string2);
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f1880a));
                    this.f1884a = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f1882r));
                    this.f1885a = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
