package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import com.onedelhi.secure.dw4;
import com.onedelhi.secure.l81;
import com.onedelhi.secure.ml1;
import com.onedelhi.secure.o60;

public class Flow extends VirtualLayout {

    /* renamed from: A */
    public static final int f1893A = 1;

    /* renamed from: B */
    public static final int f1894B = 2;

    /* renamed from: C */
    public static final int f1895C = 3;

    /* renamed from: d */
    public static final String f1896d = "Flow";

    /* renamed from: o */
    public static final int f1897o = 0;

    /* renamed from: p */
    public static final int f1898p = 1;

    /* renamed from: q */
    public static final int f1899q = 0;

    /* renamed from: r */
    public static final int f1900r = 1;

    /* renamed from: s */
    public static final int f1901s = 2;

    /* renamed from: t */
    public static final int f1902t = 0;

    /* renamed from: u */
    public static final int f1903u = 1;

    /* renamed from: v */
    public static final int f1904v = 2;

    /* renamed from: w */
    public static final int f1905w = 0;

    /* renamed from: x */
    public static final int f1906x = 1;

    /* renamed from: y */
    public static final int f1907y = 2;

    /* renamed from: z */
    public static final int f1908z = 0;

    /* renamed from: a */
    public l81 f1909a;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: B */
    public void mo2674B(o60 o60, boolean z) {
        this.f1909a.mo14909m2(z);
    }

    /* renamed from: J */
    public void mo2675J(dw4 dw4, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (dw4 != null) {
            dw4.mo14918v2(mode, size, mode2, size2);
            setMeasuredDimension(dw4.mo14913q2(), dw4.mo14912p2());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo2675J(this.f1909a, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1909a.mo19306k3(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1909a.mo19307l3(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1909a.mo19308m3(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1909a.mo19309n3(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1909a.mo19310o3(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1909a.mo19311p3(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1909a.mo19312q3(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1909a.mo19313r3(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f1909a.mo19314s3(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f1909a.mo19315t3(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f1909a.mo19316u3(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f1909a.mo19317v3(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1909a.mo19318w3(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1909a.mo19319x3(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f1909a.mo14901B2(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1909a.mo14902C2(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1909a.mo14904E2(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1909a.mo14905F2(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1909a.mo14907H2(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1909a.mo19320y3(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1909a.mo19321z3(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1909a.mo19295A3(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1909a.mo19296B3(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1909a.mo19297C3(i);
        requestLayout();
    }

    /* renamed from: y */
    public void mo2673y(AttributeSet attributeSet) {
        super.mo2673y(attributeSet);
        this.f1909a = new l81();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ConstraintLayout_Layout_android_orientation) {
                    this.f1909a.mo19319x3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_padding) {
                    this.f1909a.mo14901B2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_paddingStart) {
                    this.f1909a.mo14906G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f1909a.mo14903D2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f1909a.mo14904E2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_paddingTop) {
                    this.f1909a.mo14907H2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_paddingRight) {
                    this.f1909a.mo14905F2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f1909a.mo14902C2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f1909a.mo19297C3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f1909a.mo19313r3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f1909a.mo19296B3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f1909a.mo19307l3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f1909a.mo19315t3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f1909a.mo19309n3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f1909a.mo19317v3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f1909a.mo19311p3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f1909a.mo19306k3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f1909a.mo19314s3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f1909a.mo19308m3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f1909a.mo19316u3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f1909a.mo19321z3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f1909a.mo19310o3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f1909a.mo19320y3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f1909a.mo19312q3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f1909a.mo19295A3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f1909a.mo19318w3(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2460a = this.f1909a;
        mo3196I();
    }

    /* renamed from: z */
    public void mo2701z(C0426d.C0427a aVar, ml1 ml1, ConstraintLayout.LayoutParams layoutParams, SparseArray<o60> sparseArray) {
        super.mo2701z(aVar, ml1, layoutParams, sparseArray);
        if (ml1 instanceof l81) {
            l81 l81 = (l81) ml1;
            int i = layoutParams.f2538M;
            if (i != -1) {
                l81.mo19319x3(i);
            }
        }
    }
}
