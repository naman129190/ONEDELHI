package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.view.menu.C0260k;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.rv4;
import com.onedelhi.secure.ts2;

public class ActionMenuView extends LinearLayoutCompat implements C0248e.C0250b, C0260k {

    /* renamed from: L */
    public static final int f1276L = 56;

    /* renamed from: M */
    public static final int f1277M = 4;

    /* renamed from: c */
    public static final String f1278c = "ActionMenuView";

    /* renamed from: H */
    public int f1279H;

    /* renamed from: I */
    public int f1280I;

    /* renamed from: J */
    public int f1281J;

    /* renamed from: K */
    public int f1282K;

    /* renamed from: a */
    public Context f1283a;

    /* renamed from: a */
    public C0248e.C0249a f1284a;

    /* renamed from: a */
    public C0248e f1285a;

    /* renamed from: a */
    public C0258j.C0259a f1286a;

    /* renamed from: a */
    public C0275d f1287a;

    /* renamed from: a */
    public C0348a f1288a;

    /* renamed from: d */
    public boolean f1289d;

    /* renamed from: e */
    public boolean f1290e;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public int f1291a;
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1292a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1293b;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public boolean f1294b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f1295c;

        /* renamed from: d */
        public boolean f1296d;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1292a = false;
        }

        public LayoutParams(int i, int i2, boolean z) {
            super(i, i2);
            this.f1292a = z;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f1292a = layoutParams.f1292a;
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0272a {
        /* renamed from: a */
        boolean mo1170a();

        /* renamed from: e */
        boolean mo1173e();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0273b implements C0258j.C0259a {
        /* renamed from: b */
        public void mo1072b(@mr2 C0248e eVar, boolean z) {
        }

        /* renamed from: c */
        public boolean mo1073c(@mr2 C0248e eVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public class C0274c implements C0248e.C0249a {
        public C0274c() {
        }

        /* renamed from: a */
        public void mo1031a(@mr2 C0248e eVar) {
            C0248e.C0249a aVar = ActionMenuView.this.f1284a;
            if (aVar != null) {
                aVar.mo1031a(eVar);
            }
        }

        /* renamed from: b */
        public boolean mo1033b(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
            C0275d dVar = ActionMenuView.this.f1287a;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface C0275d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1281J = (int) (56.0f * f);
        this.f1282K = (int) (f * 4.0f);
        this.f1283a = context;
        this.f1279H = 0;
    }

    /* renamed from: O */
    public static int m2091O(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo1177h();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f1292a || !z2) {
            z = false;
        }
        layoutParams.f1294b = z;
        layoutParams.f1291a = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: E */
    public void mo1629E() {
        C0348a aVar = this.f1288a;
        if (aVar != null) {
            aVar.mo2474B();
        }
    }

    /* renamed from: F */
    public LayoutParams mo1650n() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* renamed from: G */
    public LayoutParams mo1651o(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: H */
    public LayoutParams mo1656p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo1650n();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.gravity <= 0) {
            layoutParams2.gravity = 16;
        }
        return layoutParams2;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: I */
    public LayoutParams mo1633I() {
        LayoutParams F = mo1650n();
        F.f1292a = true;
        return F;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: J */
    public boolean mo1634J(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0272a)) {
            z = false | ((C0272a) childAt).mo1170a();
        }
        return (i <= 0 || !(childAt2 instanceof C0272a)) ? z : z | ((C0272a) childAt2).mo1173e();
    }

    /* renamed from: K */
    public boolean mo1635K() {
        C0348a aVar = this.f1288a;
        return aVar != null && aVar.mo2477E();
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: L */
    public boolean mo1636L() {
        C0348a aVar = this.f1288a;
        return aVar != null && aVar.mo2479G();
    }

    /* renamed from: M */
    public boolean mo1637M() {
        C0348a aVar = this.f1288a;
        return aVar != null && aVar.mo2480H();
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: N */
    public boolean mo1638N() {
        return this.f1289d;
    }

    /* renamed from: P */
    public final void mo1639P(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f1281J;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z6) {
                    int i19 = this.f1282K;
                    i6 = i18;
                    z4 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z4 = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f1296d = z4;
                layoutParams.f1293b = z4 ? 1 : 0;
                layoutParams.f1291a = z4;
                layoutParams.f1294b = z4;
                layoutParams.leftMargin = z4;
                layoutParams.rightMargin = z4;
                layoutParams.f1295c = z6 && ((ActionMenuItemView) childAt).mo1177h();
                int O = m2091O(childAt, i11, layoutParams.f1292a ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, O);
                if (layoutParams.f1294b) {
                    i16++;
                }
                if (layoutParams.f1292a) {
                    z5 = true;
                }
                i9 -= O;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (O == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z9 = z8;
                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (layoutParams2.f1294b) {
                        int i26 = layoutParams2.f1291a;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z8 = z9;
                }
                z = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (layoutParams3.f1291a == i27) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !layoutParams3.f1295c || i9 != 1) {
                            z3 = z7;
                        } else {
                            int i31 = this.f1282K;
                            z3 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        layoutParams3.f1291a++;
                        layoutParams3.f1296d = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z7 = z3;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z10 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f1295c) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((LayoutParams) getChildAt(i32).getLayoutParams()).f1295c) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f1293b = i33;
                        layoutParams4.f1296d = true;
                        if (i34 == 0 && !layoutParams4.f1295c) {
                            layoutParams4.leftMargin = (-i33) / 2;
                        }
                    } else if (layoutParams4.f1292a) {
                        layoutParams4.f1293b = i33;
                        layoutParams4.f1296d = true;
                        layoutParams4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            layoutParams4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            layoutParams4.rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f1296d) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f1291a * i11) + layoutParams5.f1293b, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: Q */
    public C0248e mo1640Q() {
        return this.f1285a;
    }

    /* renamed from: R */
    public boolean mo1641R() {
        C0348a aVar = this.f1288a;
        return aVar != null && aVar.mo2489Q();
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: a */
    public boolean mo1197a(C0253h hVar) {
        return this.f1285a.mo1298O(hVar, 0);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: g */
    public void mo1198g(C0248e eVar) {
        this.f1285a = eVar;
    }

    public Menu getMenu() {
        if (this.f1285a == null) {
            Context context = getContext();
            C0248e eVar = new C0248e(context);
            this.f1285a = eVar;
            eVar.mo1307X(new C0274c());
            C0348a aVar = new C0348a(context);
            this.f1288a = aVar;
            aVar.mo2487O(true);
            C0348a aVar2 = this.f1288a;
            C0258j.C0259a aVar3 = this.f1286a;
            if (aVar3 == null) {
                aVar3 = new C0273b();
            }
            aVar2.mo1220j(aVar3);
            this.f1285a.mo1323c(this.f1288a, this.f1283a);
            this.f1288a.mo2485M(this);
        }
        return this.f1285a;
    }

    @ts2
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1288a.mo2476D();
    }

    public int getPopupTheme() {
        return this.f1279H;
    }

    @hl3({hl3.C2354a.f13188c})
    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0348a aVar = this.f1288a;
        if (aVar != null) {
            aVar.mo1214d(false);
            if (this.f1288a.mo2480H()) {
                this.f1288a.mo2477E();
                this.f1288a.mo2489Q();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1629E();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f1290e) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = rv4.m27093b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1292a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1634J(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + layoutParams.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    mo1634J(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1292a) {
                    int i17 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1292a) {
                int i20 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        C0248e eVar;
        boolean z = this.f1290e;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1290e = z2;
        if (z != z2) {
            this.f1280I = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1290e || (eVar = this.f1285a) == null || size == this.f1280I)) {
            this.f1280I = size;
            eVar.mo1297N(true);
        }
        int childCount = getChildCount();
        if (!this.f1290e || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        mo1639P(i, i2);
    }

    @hl3({hl3.C2354a.f13188c})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1288a.mo2483K(z);
    }

    @hl3({hl3.C2354a.f13188c})
    public void setMenuCallbacks(C0258j.C0259a aVar, C0248e.C0249a aVar2) {
        this.f1286a = aVar;
        this.f1284a = aVar2;
    }

    public void setOnMenuItemClickListener(C0275d dVar) {
        this.f1287a = dVar;
    }

    public void setOverflowIcon(@ts2 Drawable drawable) {
        getMenu();
        this.f1288a.mo2486N(drawable);
    }

    @hl3({hl3.C2354a.f13188c})
    public void setOverflowReserved(boolean z) {
        this.f1289d = z;
    }

    public void setPopupTheme(@e64 int i) {
        if (this.f1279H != i) {
            this.f1279H = i;
            if (i == 0) {
                this.f1283a = getContext();
            } else {
                this.f1283a = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @hl3({hl3.C2354a.f13185a})
    public void setPresenter(C0348a aVar) {
        this.f1288a = aVar;
        aVar.mo2485M(this);
    }
}
