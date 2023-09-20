package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.widget.Toolbar;
import com.onedelhi.secure.C3110p2;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3353r2;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.lg0;
import com.onedelhi.secure.vu4;
import com.onedelhi.secure.yu4;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.widget.e */
public class C0372e implements lg0 {

    /* renamed from: a */
    public static final long f1816a = 200;

    /* renamed from: a */
    public static final String f1817a = "ToolbarWidgetWrapper";

    /* renamed from: d */
    public static final int f1818d = 3;

    /* renamed from: a */
    public int f1819a;

    /* renamed from: a */
    public Drawable f1820a;

    /* renamed from: a */
    public View f1821a;

    /* renamed from: a */
    public Window.Callback f1822a;

    /* renamed from: a */
    public Spinner f1823a;

    /* renamed from: a */
    public Toolbar f1824a;

    /* renamed from: a */
    public C0348a f1825a;

    /* renamed from: a */
    public CharSequence f1826a;

    /* renamed from: a */
    public boolean f1827a;

    /* renamed from: b */
    public int f1828b;

    /* renamed from: b */
    public Drawable f1829b;

    /* renamed from: b */
    public View f1830b;

    /* renamed from: b */
    public CharSequence f1831b;

    /* renamed from: b */
    public boolean f1832b;

    /* renamed from: c */
    public int f1833c;

    /* renamed from: c */
    public Drawable f1834c;

    /* renamed from: c */
    public CharSequence f1835c;

    /* renamed from: d */
    public Drawable f1836d;

    /* renamed from: androidx.appcompat.widget.e$a */
    public class C0373a implements View.OnClickListener {

        /* renamed from: a */
        public final C3353r2 f1838a;

        public C0373a() {
            this.f1838a = new C3353r2(C0372e.this.f1824a.getContext(), 0, C3110p2.f18293d, 0, 0, C0372e.this.f1826a);
        }

        public void onClick(View view) {
            C0372e eVar = C0372e.this;
            Window.Callback callback = eVar.f1822a;
            if (callback != null && eVar.f1832b) {
                callback.onMenuItemSelected(0, this.f1838a);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.e$b */
    public class C0374b extends yu4 {

        /* renamed from: a */
        public final /* synthetic */ int f1839a;

        /* renamed from: a */
        public boolean f1841a = false;

        public C0374b(int i) {
            this.f1839a = i;
        }

        /* renamed from: a */
        public void mo1068a(View view) {
            if (!this.f1841a) {
                C0372e.this.f1824a.setVisibility(this.f1839a);
            }
        }

        /* renamed from: b */
        public void mo1069b(View view) {
            C0372e.this.f1824a.setVisibility(0);
        }

        /* renamed from: c */
        public void mo2607c(View view) {
            this.f1841a = true;
        }
    }

    public C0372e(Toolbar toolbar, boolean z) {
        this(toolbar, z, za3.C4066k.abc_action_bar_up_description, za3.C4061f.abc_ic_ab_back_material);
    }

    public C0372e(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1828b = 0;
        this.f1833c = 0;
        this.f1824a = toolbar;
        this.f1826a = toolbar.getTitle();
        this.f1831b = toolbar.getSubtitle();
        this.f1827a = this.f1826a != null;
        this.f1834c = toolbar.getNavigationIcon();
        af4 G = af4.m11110G(toolbar.getContext(), (AttributeSet) null, za3.C4068m.ActionBar, za3.C4057b.actionBarStyle, 0);
        this.f1836d = G.mo13037h(za3.C4068m.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence x = G.mo13053x(za3.C4068m.ActionBar_title);
            if (!TextUtils.isEmpty(x)) {
                setTitle(x);
            }
            CharSequence x2 = G.mo13053x(za3.C4068m.ActionBar_subtitle);
            if (!TextUtils.isEmpty(x2)) {
                mo2581k(x2);
            }
            Drawable h = G.mo13037h(za3.C4068m.ActionBar_logo);
            if (h != null) {
                mo2548F(h);
            }
            Drawable h2 = G.mo13037h(za3.C4068m.ActionBar_icon);
            if (h2 != null) {
                setIcon(h2);
            }
            if (this.f1834c == null && (drawable = this.f1836d) != null) {
                mo2587q(drawable);
            }
            mo2562T(G.mo13044o(za3.C4068m.ActionBar_displayOptions, 0));
            int u = G.mo13050u(za3.C4068m.ActionBar_customNavigationLayout, 0);
            if (u != 0) {
                mo2549G(LayoutInflater.from(this.f1824a.getContext()).inflate(u, this.f1824a, false));
                mo2562T(this.f1819a | 16);
            }
            int q = G.mo13046q(za3.C4068m.ActionBar_height, 0);
            if (q > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1824a.getLayoutParams();
                layoutParams.height = q;
                this.f1824a.setLayoutParams(layoutParams);
            }
            int f = G.mo13035f(za3.C4068m.ActionBar_contentInsetStart, -1);
            int f2 = G.mo13035f(za3.C4068m.ActionBar_contentInsetEnd, -1);
            if (f >= 0 || f2 >= 0) {
                this.f1824a.setContentInsetsRelative(Math.max(f, 0), Math.max(f2, 0));
            }
            int u2 = G.mo13050u(za3.C4068m.ActionBar_titleTextStyle, 0);
            if (u2 != 0) {
                Toolbar toolbar2 = this.f1824a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), u2);
            }
            int u3 = G.mo13050u(za3.C4068m.ActionBar_subtitleTextStyle, 0);
            if (u3 != 0) {
                Toolbar toolbar3 = this.f1824a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), u3);
            }
            int u4 = G.mo13050u(za3.C4068m.ActionBar_popupTheme, 0);
            if (u4 != 0) {
                this.f1824a.setPopupTheme(u4);
            }
        } else {
            this.f1819a = mo2563U();
        }
        G.mo13029I();
        mo2555M(i);
        this.f1835c = this.f1824a.getNavigationContentDescription();
        this.f1824a.setNavigationOnClickListener(new C0373a());
    }

    /* renamed from: A */
    public CharSequence mo2543A() {
        return this.f1824a.getSubtitle();
    }

    /* renamed from: B */
    public boolean mo2544B() {
        return this.f1821a != null;
    }

    /* renamed from: C */
    public void mo2545C(SparseArray<Parcelable> sparseArray) {
        this.f1824a.restoreHierarchyState(sparseArray);
    }

    /* renamed from: D */
    public vu4 mo2546D(int i, long j) {
        return jt4.m18955g(this.f1824a).mo26354b(i == 0 ? 1.0f : 0.0f).mo26370s(j).mo26372u(new C0374b(i));
    }

    /* renamed from: E */
    public void mo2547E(CharSequence charSequence) {
        this.f1835c = charSequence;
        mo2566X();
    }

    /* renamed from: F */
    public void mo2548F(Drawable drawable) {
        this.f1829b = drawable;
        mo2568Z();
    }

    /* renamed from: G */
    public void mo2549G(View view) {
        View view2 = this.f1830b;
        if (!(view2 == null || (this.f1819a & 16) == 0)) {
            this.f1824a.removeView(view2);
        }
        this.f1830b = view;
        if (view != null && (this.f1819a & 16) != 0) {
            this.f1824a.addView(view);
        }
    }

    /* renamed from: H */
    public void mo2550H(int i) {
        vu4 D = mo2546D(i, 200);
        if (D != null) {
            D.mo26376y();
        }
    }

    /* renamed from: I */
    public int mo2551I() {
        Spinner spinner = this.f1823a;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    /* renamed from: J */
    public void mo2552J(int i) {
        mo2587q(i != 0 ? C3129p8.m24529b(mo2569a(), i) : null);
    }

    /* renamed from: K */
    public int mo2553K() {
        return this.f1828b;
    }

    /* renamed from: L */
    public void mo2554L(SparseArray<Parcelable> sparseArray) {
        this.f1824a.saveHierarchyState(sparseArray);
    }

    /* renamed from: M */
    public void mo2555M(int i) {
        if (i != this.f1833c) {
            this.f1833c = i;
            if (TextUtils.isEmpty(this.f1824a.getNavigationContentDescription())) {
                mo2582l(this.f1833c);
            }
        }
    }

    /* renamed from: N */
    public void mo2556N(C0258j.C0259a aVar, C0248e.C0249a aVar2) {
        this.f1824a.setMenuCallbacks(aVar, aVar2);
    }

    /* renamed from: O */
    public void mo2557O() {
        Log.i(f1817a, "Progress display unsupported");
    }

    /* renamed from: P */
    public void mo2558P(Drawable drawable) {
        if (this.f1836d != drawable) {
            this.f1836d = drawable;
            mo2567Y();
        }
    }

    /* renamed from: Q */
    public void mo2559Q(boolean z) {
        this.f1824a.setCollapsible(z);
    }

    /* renamed from: R */
    public int mo2560R() {
        return this.f1824a.getVisibility();
    }

    /* renamed from: S */
    public int mo2561S() {
        return this.f1819a;
    }

    /* renamed from: T */
    public void mo2562T(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1819a ^ i;
        this.f1819a = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo2566X();
                }
                mo2567Y();
            }
            if ((i2 & 3) != 0) {
                mo2568Z();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1824a.setTitle(this.f1826a);
                    toolbar = this.f1824a;
                    charSequence = this.f1831b;
                } else {
                    charSequence = null;
                    this.f1824a.setTitle((CharSequence) null);
                    toolbar = this.f1824a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f1830b) != null) {
                if ((i & 16) != 0) {
                    this.f1824a.addView(view);
                } else {
                    this.f1824a.removeView(view);
                }
            }
        }
    }

    /* renamed from: U */
    public final int mo2563U() {
        if (this.f1824a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1836d = this.f1824a.getNavigationIcon();
        return 15;
    }

    /* renamed from: V */
    public final void mo2564V() {
        if (this.f1823a == null) {
            this.f1823a = new AppCompatSpinner(mo2569a(), (AttributeSet) null, za3.C4057b.actionDropDownStyle);
            this.f1823a.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    /* renamed from: W */
    public final void mo2565W(CharSequence charSequence) {
        this.f1826a = charSequence;
        if ((this.f1819a & 8) != 0) {
            this.f1824a.setTitle(charSequence);
            if (this.f1827a) {
                jt4.m18861E1(this.f1824a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: X */
    public final void mo2566X() {
        if ((this.f1819a & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1835c)) {
            this.f1824a.setNavigationContentDescription(this.f1833c);
        } else {
            this.f1824a.setNavigationContentDescription(this.f1835c);
        }
    }

    /* renamed from: Y */
    public final void mo2567Y() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1819a & 4) != 0) {
            toolbar = this.f1824a;
            drawable = this.f1834c;
            if (drawable == null) {
                drawable = this.f1836d;
            }
        } else {
            toolbar = this.f1824a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: Z */
    public final void mo2568Z() {
        Drawable drawable;
        int i = this.f1819a;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1829b) == null) {
            drawable = this.f1820a;
        }
        this.f1824a.setLogo(drawable);
    }

    /* renamed from: a */
    public Context mo2569a() {
        return this.f1824a.getContext();
    }

    /* renamed from: b */
    public void mo2570b(Drawable drawable) {
        jt4.m18877I1(this.f1824a, drawable);
    }

    /* renamed from: c */
    public boolean mo2571c() {
        return this.f1824a.mo2334B();
    }

    /* renamed from: d */
    public boolean mo2572d() {
        return this.f1824a.mo2448w();
    }

    /* renamed from: e */
    public boolean mo2573e() {
        return this.f1820a != null;
    }

    /* renamed from: f */
    public boolean mo2574f() {
        return this.f1829b != null;
    }

    /* renamed from: g */
    public boolean mo2575g() {
        return this.f1824a.mo2349d();
    }

    public int getHeight() {
        return this.f1824a.getHeight();
    }

    public CharSequence getTitle() {
        return this.f1824a.getTitle();
    }

    /* renamed from: h */
    public boolean mo2578h() {
        return this.f1824a.mo2344M();
    }

    /* renamed from: i */
    public boolean mo2579i() {
        return this.f1824a.mo2451z();
    }

    /* renamed from: j */
    public boolean mo2580j() {
        return this.f1824a.mo2447v();
    }

    /* renamed from: k */
    public void mo2581k(CharSequence charSequence) {
        this.f1831b = charSequence;
        if ((this.f1819a & 8) != 0) {
            this.f1824a.setSubtitle(charSequence);
        }
    }

    /* renamed from: l */
    public void mo2582l(int i) {
        mo2547E(i == 0 ? null : mo2569a().getString(i));
    }

    /* renamed from: m */
    public void mo2583m(int i) {
        Spinner spinner = this.f1823a;
        if (spinner != null) {
            spinner.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    /* renamed from: n */
    public void mo2584n() {
        Log.i(f1817a, "Progress display unsupported");
    }

    /* renamed from: o */
    public int mo2585o() {
        Spinner spinner = this.f1823a;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    /* renamed from: p */
    public void mo2586p() {
        this.f1824a.mo2351f();
    }

    /* renamed from: q */
    public void mo2587q(Drawable drawable) {
        this.f1834c = drawable;
        mo2567Y();
    }

    /* renamed from: r */
    public ViewGroup mo2588r() {
        return this.f1824a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2589s(int r5) {
        /*
            r4 = this;
            int r0 = r4.f1828b
            if (r5 == r0) goto L_0x0071
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x001a
            if (r0 == r1) goto L_0x000b
            goto L_0x002b
        L_0x000b:
            android.view.View r0 = r4.f1821a
            if (r0 == 0) goto L_0x002b
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.f1824a
            if (r0 != r3) goto L_0x002b
            android.view.View r0 = r4.f1821a
            goto L_0x0028
        L_0x001a:
            android.widget.Spinner r0 = r4.f1823a
            if (r0 == 0) goto L_0x002b
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.f1824a
            if (r0 != r3) goto L_0x002b
            android.widget.Spinner r0 = r4.f1823a
        L_0x0028:
            r3.removeView(r0)
        L_0x002b:
            r4.f1828b = r5
            if (r5 == 0) goto L_0x0071
            r0 = 0
            if (r5 == r2) goto L_0x0067
            if (r5 != r1) goto L_0x0050
            android.view.View r5 = r4.f1821a
            if (r5 == 0) goto L_0x0071
            androidx.appcompat.widget.Toolbar r1 = r4.f1824a
            r1.addView(r5, r0)
            android.view.View r5 = r4.f1821a
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r5 = (androidx.appcompat.widget.Toolbar.LayoutParams) r5
            r0 = -2
            r5.width = r0
            r5.height = r0
            r0 = 8388691(0x800053, float:1.175506E-38)
            r5.f652a = r0
            goto L_0x0071
        L_0x0050:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid navigation mode "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0067:
            r4.mo2564V()
            androidx.appcompat.widget.Toolbar r5 = r4.f1824a
            android.widget.Spinner r1 = r4.f1823a
            r5.addView(r1, r0)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0372e.mo2589s(int):void");
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C3129p8.m24529b(mo2569a(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1820a = drawable;
        mo2568Z();
    }

    public void setLogo(int i) {
        mo2548F(i != 0 ? C3129p8.m24529b(mo2569a(), i) : null);
    }

    public void setMenu(Menu menu, C0258j.C0259a aVar) {
        if (this.f1825a == null) {
            C0348a aVar2 = new C0348a(this.f1824a.getContext());
            this.f1825a = aVar2;
            aVar2.mo1228s(za3.C4062g.action_menu_presenter);
        }
        this.f1825a.mo1220j(aVar);
        this.f1824a.setMenu((C0248e) menu, this.f1825a);
    }

    public void setMenuPrepared() {
        this.f1832b = true;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1827a = true;
        mo2565W(charSequence);
    }

    public void setVisibility(int i) {
        this.f1824a.setVisibility(i);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1822a = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1827a) {
            mo2565W(charSequence);
        }
    }

    /* renamed from: t */
    public void mo2599t(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        mo2564V();
        this.f1823a.setAdapter(spinnerAdapter);
        this.f1823a.setOnItemSelectedListener(onItemSelectedListener);
    }

    /* renamed from: u */
    public void mo2600u(boolean z) {
    }

    /* renamed from: v */
    public boolean mo2601v() {
        return this.f1824a.mo2335C();
    }

    /* renamed from: w */
    public View mo2602w() {
        return this.f1830b;
    }

    /* renamed from: x */
    public void mo2603x() {
        this.f1824a.mo2350e();
    }

    /* renamed from: y */
    public void mo2604y(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.f1821a;
        if (view != null && view.getParent() == (toolbar = this.f1824a)) {
            toolbar.removeView(this.f1821a);
        }
        this.f1821a = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f1828b == 2) {
            this.f1824a.addView(scrollingTabContainerView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1821a.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f652a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    /* renamed from: z */
    public Menu mo2605z() {
        return this.f1824a.getMenu();
    }
}
