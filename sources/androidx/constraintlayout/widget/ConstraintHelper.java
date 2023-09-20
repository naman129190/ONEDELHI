package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.onedelhi.secure.jl1;
import com.onedelhi.secure.ml1;
import com.onedelhi.secure.o60;
import com.onedelhi.secure.p60;
import com.onedelhi.secure.vf4;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    public Context f2459a;

    /* renamed from: a */
    public jl1 f2460a;

    /* renamed from: a */
    public HashMap<Integer, String> f2461a = new HashMap<>();

    /* renamed from: a */
    public int[] f2462a = new int[32];

    /* renamed from: a */
    public View[] f2463a = null;

    /* renamed from: b */
    public String f2464b;

    /* renamed from: b */
    public boolean f2465b = false;

    /* renamed from: c */
    public String f2466c;

    /* renamed from: n */
    public int f2467n;

    public ConstraintHelper(Context context) {
        super(context);
        this.f2459a = context;
        mo2673y((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2459a = context;
        mo2673y(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2459a = context;
        mo2673y(attributeSet);
    }

    /* renamed from: A */
    public int mo2658A(View view) {
        int i;
        int id = view.getId();
        int i2 = -1;
        if (id == -1) {
            return -1;
        }
        this.f2464b = null;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f2467n) {
                break;
            } else if (this.f2462a[i3] == id) {
                int i4 = i3;
                while (true) {
                    i = this.f2467n;
                    if (i4 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.f2462a;
                    int i5 = i4 + 1;
                    iArr[i4] = iArr[i5];
                    i4 = i5;
                }
                this.f2462a[i - 1] = 0;
                this.f2467n = i - 1;
                i2 = i3;
            } else {
                i3++;
            }
        }
        requestLayout();
        return i2;
    }

    /* renamed from: B */
    public void mo2674B(o60 o60, boolean z) {
    }

    /* renamed from: C */
    public void mo3193C(ConstraintLayout constraintLayout) {
    }

    /* renamed from: D */
    public void mo2702D(ConstraintLayout constraintLayout) {
    }

    /* renamed from: E */
    public void mo3194E(ConstraintLayout constraintLayout) {
    }

    /* renamed from: F */
    public void mo2703F(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f2461a.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3195G(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f2464b
            r5.setIds(r0)
        L_0x000b:
            com.onedelhi.secure.jl1 r0 = r5.f2460a
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo18468a()
            r0 = 0
        L_0x0014:
            int r1 = r5.f2467n
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f2462a
            r1 = r1[r0]
            android.view.View r2 = r6.mo3248t(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f2461a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.mo3211u(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f2462a
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f2461a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.mo3248t(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            com.onedelhi.secure.jl1 r1 = r5.f2460a
            com.onedelhi.secure.o60 r2 = r6.mo3249u(r2)
            r1.mo18469b(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            com.onedelhi.secure.jl1 r0 = r5.f2460a
            com.onedelhi.secure.p60 r6 = r6.f2482a
            r0.mo14908c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.mo3195G(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* renamed from: H */
    public void mo2720H(p60 p60, jl1 jl1, SparseArray<o60> sparseArray) {
        jl1.mo18468a();
        for (int i = 0; i < this.f2467n; i++) {
            jl1.mo18469b(sparseArray.get(this.f2462a[i]));
        }
    }

    /* renamed from: I */
    public void mo3196I() {
        if (this.f2460a != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f2550a = (o60) this.f2460a;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2462a, this.f2467n);
    }

    /* renamed from: l */
    public final void mo3198l(String str) {
        if (str != null && str.length() != 0 && this.f2459a != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int v = mo3212v(trim);
            if (v != 0) {
                this.f2461a.put(Integer.valueOf(v), trim);
                mo3199m(v);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* renamed from: m */
    public final void mo3199m(int i) {
        if (i != getId()) {
            int i2 = this.f2467n + 1;
            int[] iArr = this.f2462a;
            if (i2 > iArr.length) {
                this.f2462a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2462a;
            int i3 = this.f2467n;
            iArr2[i3] = i;
            this.f2467n = i3 + 1;
        }
    }

    /* renamed from: n */
    public final void mo3200n(String str) {
        if (str != null && str.length() != 0 && this.f2459a != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).f2555b)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        mo3199m(childAt.getId());
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void mo3201o(View view) {
        if (view != this) {
            if (view.getId() == -1) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
            } else if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
            } else {
                this.f2464b = null;
                mo3199m(view.getId());
                requestLayout();
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2464b;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2466c;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        if (this.f2465b) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void mo3203p() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo3204q((ConstraintLayout) parent);
        }
    }

    /* renamed from: q */
    public void mo3204q(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2467n; i++) {
            View t = constraintLayout.mo3248t(this.f2462a[i]);
            if (t != null) {
                t.setVisibility(visibility);
                if (elevation > 0.0f) {
                    t.setTranslationZ(t.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: r */
    public void mo2707r(ConstraintLayout constraintLayout) {
    }

    /* renamed from: s */
    public boolean mo3205s(int i) {
        for (int i2 : this.f2462a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public void setIds(String str) {
        this.f2464b = str;
        if (str != null) {
            int i = 0;
            this.f2467n = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo3198l(str.substring(i));
                    return;
                } else {
                    mo3198l(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2466c = str;
        if (str != null) {
            int i = 0;
            this.f2467n = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo3200n(str.substring(i));
                    return;
                } else {
                    mo3200n(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2464b = null;
        this.f2467n = 0;
        for (int m : iArr) {
            mo3199m(m);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f2464b == null) {
            mo3199m(i);
        }
    }

    /* renamed from: t */
    public final int[] mo3210t(View view, String str) {
        String[] split = str.split(vf4.f36537c);
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String trim : split) {
            int v = mo3212v(trim.trim());
            if (v != 0) {
                iArr[i] = v;
                i++;
            }
        }
        return i != split.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    /* renamed from: u */
    public final int mo3211u(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2459a.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: v */
    public final int mo3212v(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object q = constraintLayout.mo3236q(0, str);
            if (q instanceof Integer) {
                i = ((Integer) q).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = mo3211u(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0435e.C0442g.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f2459a.getResources().getIdentifier(str, "id", this.f2459a.getPackageName()) : i;
    }

    /* renamed from: w */
    public View[] mo3213w(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2463a;
        if (viewArr == null || viewArr.length != this.f2467n) {
            this.f2463a = new View[this.f2467n];
        }
        for (int i = 0; i < this.f2467n; i++) {
            this.f2463a[i] = constraintLayout.mo3248t(this.f2462a[i]);
        }
        return this.f2463a;
    }

    /* renamed from: x */
    public int mo3214x(int i) {
        int i2 = -1;
        for (int i3 : this.f2462a) {
            i2++;
            if (i3 == i) {
                return i2;
            }
        }
        return i2;
    }

    /* renamed from: y */
    public void mo2673y(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2464b = string;
                    setIds(string);
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2466c = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: z */
    public void mo2701z(C0426d.C0427a aVar, ml1 ml1, ConstraintLayout.LayoutParams layoutParams, SparseArray<o60> sparseArray) {
        C0426d.C0429b bVar = aVar.f2904a;
        int[] iArr = bVar.f3025a;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f3028b;
            if (str != null) {
                if (str.length() > 0) {
                    C0426d.C0429b bVar2 = aVar.f2904a;
                    bVar2.f3025a = mo3210t(this, bVar2.f3028b);
                } else {
                    aVar.f2904a.f3025a = null;
                }
            }
        }
        if (ml1 != null) {
            ml1.mo18468a();
            if (aVar.f2904a.f3025a != null) {
                int i = 0;
                while (true) {
                    int[] iArr2 = aVar.f2904a.f3025a;
                    if (i < iArr2.length) {
                        o60 o60 = sparseArray.get(iArr2[i]);
                        if (o60 != null) {
                            ml1.mo18469b(o60);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
