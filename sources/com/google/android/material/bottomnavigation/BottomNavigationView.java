package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;

public class BottomNavigationView extends NavigationBarView {

    /* renamed from: s */
    public static final int f7840s = 5;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public class C1495a implements pv4.C6478e {
        public C1495a() {
        }

        @mr2
        /* renamed from: a */
        public sx4 mo11179a(View view, @mr2 sx4 sx4, @mr2 pv4.C6479f fVar) {
            fVar.f33795d += sx4.mo24602o();
            boolean z = true;
            if (jt4.m18928Z(view) != 1) {
                z = false;
            }
            int p = sx4.mo24603p();
            int q = sx4.mo24604q();
            fVar.f33792a += z ? q : p;
            int i = fVar.f33794c;
            if (!z) {
                p = q;
            }
            fVar.f33794c = i + p;
            fVar.mo42928a(view);
            return sx4;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C1496b extends NavigationBarView.C4159c {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface C1497c extends NavigationBarView.C4160d {
    }

    public BottomNavigationView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomNavigationView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.bottomNavigationStyle);
    }

    public BottomNavigationView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, fd3.C2164n.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        af4 l = ob4.m59196l(context2, attributeSet, fd3.C2165o.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(l.mo13030a(fd3.C2165o.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i3 = fd3.C2165o.BottomNavigationView_android_minHeight;
        if (l.mo13026C(i3)) {
            setMinimumHeight(l.mo13036g(i3, 0));
        }
        l.mo13029I();
        if (mo11211n()) {
            mo11207j(context2);
        }
        mo11208k();
    }

    @mr2
    @hl3({hl3.C2354a.f13187b})
    /* renamed from: d */
    public NavigationBarMenuView mo11205d(@mr2 Context context) {
        return new BottomNavigationMenuView(context);
    }

    public int getMaxItemCount() {
        return 5;
    }

    /* renamed from: j */
    public final void mo11207j(@mr2 Context context) {
        View view = new View(context);
        view.setBackgroundColor(r70.m26353f(context, fd3.C2155e.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(fd3.C2156f.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: k */
    public final void mo11208k() {
        pv4.m61664d(this, new C1495a());
    }

    /* renamed from: l */
    public boolean mo11209l() {
        return ((BottomNavigationMenuView) getMenuView()).mo11204t();
    }

    /* renamed from: m */
    public final int mo11210m(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    /* renamed from: n */
    public final boolean mo11211n() {
        return false;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, mo11210m(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.mo11204t() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo1214d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@ts2 C1496b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@ts2 C1497c cVar) {
        setOnItemSelectedListener(cVar);
    }
}
