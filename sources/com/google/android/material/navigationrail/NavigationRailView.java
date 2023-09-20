package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarView;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;

public class NavigationRailView extends NavigationBarView {

    /* renamed from: t */
    public static final int f24176t = 49;

    /* renamed from: u */
    public static final int f24177u = 7;

    /* renamed from: v */
    public static final int f24178v = 49;

    /* renamed from: w */
    public static final int f24179w = -1;
    @ts2

    /* renamed from: a */
    public View f24180a;
    @ts2

    /* renamed from: a */
    public Boolean f24181a;
    @ts2

    /* renamed from: b */
    public Boolean f24182b;

    /* renamed from: s */
    public final int f24183s;

    /* renamed from: com.google.android.material.navigationrail.NavigationRailView$a */
    public class C4168a implements pv4.C6478e {
        public C4168a() {
        }

        @mr2
        /* renamed from: a */
        public sx4 mo11179a(View view, @mr2 sx4 sx4, @mr2 pv4.C6479f fVar) {
            NavigationRailView navigationRailView = NavigationRailView.this;
            if (navigationRailView.mo28553t(navigationRailView.f24181a)) {
                fVar.f33793b += sx4.mo24592f(sx4.C3559m.m28015i()).f12723b;
            }
            NavigationRailView navigationRailView2 = NavigationRailView.this;
            if (navigationRailView2.mo28553t(navigationRailView2.f24182b)) {
                fVar.f33795d += sx4.mo24592f(sx4.C3559m.m28015i()).f12725d;
            }
            boolean z = true;
            if (jt4.m18928Z(view) != 1) {
                z = false;
            }
            int p = sx4.mo24603p();
            int q = sx4.mo24604q();
            int i = fVar.f33792a;
            if (z) {
                p = q;
            }
            fVar.f33792a = i + p;
            fVar.mo42928a(view);
            return sx4;
        }
    }

    public NavigationRailView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationRailView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.navigationRailStyle);
    }

    public NavigationRailView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, fd3.C2164n.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f24181a = null;
        this.f24182b = null;
        this.f24183s = getResources().getDimensionPixelSize(fd3.C2156f.mtrl_navigation_rail_margin);
        af4 l = ob4.m59196l(getContext(), attributeSet, fd3.C2165o.NavigationRailView, i, i2, new int[0]);
        int u = l.mo13050u(fd3.C2165o.NavigationRailView_headerLayout, 0);
        if (u != 0) {
            mo28542m(u);
        }
        setMenuGravity(l.mo13044o(fd3.C2165o.NavigationRailView_menuGravity, 49));
        int i3 = fd3.C2165o.NavigationRailView_itemMinHeight;
        if (l.mo13026C(i3)) {
            setItemMinimumHeight(l.mo13036g(i3, -1));
        }
        int i4 = fd3.C2165o.NavigationRailView_paddingTopSystemWindowInsets;
        if (l.mo13026C(i4)) {
            this.f24181a = Boolean.valueOf(l.mo13030a(i4, false));
        }
        int i5 = fd3.C2165o.NavigationRailView_paddingBottomSystemWindowInsets;
        if (l.mo13026C(i5)) {
            this.f24182b = Boolean.valueOf(l.mo13030a(i5, false));
        }
        l.mo13029I();
        mo28544o();
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    @ts2
    public View getHeaderView() {
        return this.f24180a;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* renamed from: m */
    public void mo28542m(@s12 int i) {
        mo28543n(LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    /* renamed from: n */
    public void mo28543n(@mr2 View view) {
        mo28550s();
        this.f24180a = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f24183s;
        addView(view, 0, layoutParams);
    }

    /* renamed from: o */
    public final void mo28544o() {
        pv4.m61664d(this, new C4168a());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (mo28548q()) {
            int bottom = this.f24180a.getBottom() + this.f24183s;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.mo28534t()) {
            i5 = this.f24183s;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    public void onMeasure(int i, int i2) {
        int r = mo28549r(i);
        super.onMeasure(r, i2);
        if (mo28548q()) {
            measureChild(getNavigationRailMenuView(), r, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f24180a.getMeasuredHeight()) - this.f24183s, Integer.MIN_VALUE));
        }
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: p */
    public NavigationRailMenuView mo11205d(@mr2 Context context) {
        return new NavigationRailMenuView(context);
    }

    /* renamed from: q */
    public final boolean mo28548q() {
        View view = this.f24180a;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: r */
    public final int mo28549r(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* renamed from: s */
    public void mo28550s() {
        View view = this.f24180a;
        if (view != null) {
            removeView(view);
            this.f24180a = null;
        }
    }

    public void setItemMinimumHeight(@e83 int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    /* renamed from: t */
    public final boolean mo28553t(Boolean bool) {
        return bool != null ? bool.booleanValue() : jt4.m18913U(this);
    }
}
