package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.onedelhi.secure.C2063ej;
import com.onedelhi.secure.ml1;
import com.onedelhi.secure.o60;
import com.onedelhi.secure.p60;

public class Barrier extends ConstraintHelper {

    /* renamed from: q */
    public static final int f2450q = 0;

    /* renamed from: r */
    public static final int f2451r = 2;

    /* renamed from: s */
    public static final int f2452s = 1;

    /* renamed from: t */
    public static final int f2453t = 3;

    /* renamed from: u */
    public static final int f2454u = 5;

    /* renamed from: v */
    public static final int f2455v = 6;

    /* renamed from: a */
    public C2063ej f2456a;

    /* renamed from: o */
    public int f2457o;

    /* renamed from: p */
    public int f2458p;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* renamed from: B */
    public void mo2674B(o60 o60, boolean z) {
        mo3185K(o60, this.f2457o, z);
    }

    @Deprecated
    /* renamed from: J */
    public boolean mo3184J() {
        return this.f2456a.mo15204o2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r6 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 == 6) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3185K(com.onedelhi.secure.o60 r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f2458p = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L_0x0012
            int r6 = r3.f2457o
            if (r6 != r2) goto L_0x000f
        L_0x000c:
            r3.f2458p = r5
            goto L_0x001c
        L_0x000f:
            if (r6 != r1) goto L_0x001c
            goto L_0x0016
        L_0x0012:
            int r6 = r3.f2457o
            if (r6 != r2) goto L_0x0019
        L_0x0016:
            r3.f2458p = r0
            goto L_0x001c
        L_0x0019:
            if (r6 != r1) goto L_0x001c
            goto L_0x000c
        L_0x001c:
            boolean r5 = r4 instanceof com.onedelhi.secure.C2063ej
            if (r5 == 0) goto L_0x0027
            com.onedelhi.secure.ej r4 = (com.onedelhi.secure.C2063ej) r4
            int r5 = r3.f2458p
            r4.mo15211u2(r5)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.mo3185K(com.onedelhi.secure.o60, int, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.f2456a.mo15204o2();
    }

    public int getMargin() {
        return this.f2456a.mo15206q2();
    }

    public int getType() {
        return this.f2457o;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2456a.mo15209t2(z);
    }

    public void setDpMargin(int i) {
        C2063ej ejVar = this.f2456a;
        ejVar.mo15212v2((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f2456a.mo15212v2(i);
    }

    public void setType(int i) {
        this.f2457o = i;
    }

    /* renamed from: y */
    public void mo2673y(AttributeSet attributeSet) {
        super.mo2673y(attributeSet);
        this.f2456a = new C2063ej();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2456a.mo15209t2(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_barrierMargin) {
                    this.f2456a.mo15212v2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2460a = this.f2456a;
        mo3196I();
    }

    /* renamed from: z */
    public void mo2701z(C0426d.C0427a aVar, ml1 ml1, ConstraintLayout.LayoutParams layoutParams, SparseArray<o60> sparseArray) {
        super.mo2701z(aVar, ml1, layoutParams, sparseArray);
        if (ml1 instanceof C2063ej) {
            C2063ej ejVar = (C2063ej) ml1;
            mo3185K(ejVar, aVar.f2904a.f3017U, ((p60) ml1.mo21666U()).mo22332O2());
            ejVar.mo15209t2(aVar.f2904a.f3045g);
            ejVar.mo15212v2(aVar.f2904a.f3018V);
        }
    }
}
