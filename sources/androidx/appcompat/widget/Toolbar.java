package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.view.menu.C0260k;
import androidx.appcompat.view.menu.C0265m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.ah2;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dh2;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.h74;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.io3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.kh2;
import com.onedelhi.secure.l00;
import com.onedelhi.secure.ld2;
import com.onedelhi.secure.lf4;
import com.onedelhi.secure.lg0;
import com.onedelhi.secure.lh2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.of4;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.rv4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Toolbar extends ViewGroup implements ah2 {

    /* renamed from: b */
    public static final String f1678b = "Toolbar";

    /* renamed from: a */
    public Context f1679a;

    /* renamed from: a */
    public ColorStateList f1680a;

    /* renamed from: a */
    public Drawable f1681a;

    /* renamed from: a */
    public View f1682a;

    /* renamed from: a */
    public ImageButton f1683a;

    /* renamed from: a */
    public ImageView f1684a;

    /* renamed from: a */
    public TextView f1685a;

    /* renamed from: a */
    public C0248e.C0249a f1686a;

    /* renamed from: a */
    public C0258j.C0259a f1687a;

    /* renamed from: a */
    public final ActionMenuView.C0275d f1688a;

    /* renamed from: a */
    public ActionMenuView f1689a;

    /* renamed from: a */
    public C0343d f1690a;

    /* renamed from: a */
    public C0344e f1691a;

    /* renamed from: a */
    public C0348a f1692a;

    /* renamed from: a */
    public C0372e f1693a;

    /* renamed from: a */
    public final dh2 f1694a;

    /* renamed from: a */
    public io3 f1695a;

    /* renamed from: a */
    public CharSequence f1696a;

    /* renamed from: a */
    public final Runnable f1697a;

    /* renamed from: a */
    public final ArrayList<View> f1698a;

    /* renamed from: a */
    public final int[] f1699a;

    /* renamed from: b */
    public ColorStateList f1700b;

    /* renamed from: b */
    public ImageButton f1701b;

    /* renamed from: b */
    public TextView f1702b;

    /* renamed from: b */
    public CharSequence f1703b;

    /* renamed from: b */
    public final ArrayList<View> f1704b;

    /* renamed from: b */
    public boolean f1705b;

    /* renamed from: c */
    public CharSequence f1706c;

    /* renamed from: c */
    public ArrayList<MenuItem> f1707c;

    /* renamed from: c */
    public boolean f1708c;

    /* renamed from: d */
    public boolean f1709d;

    /* renamed from: n */
    public int f1710n;

    /* renamed from: o */
    public int f1711o;

    /* renamed from: p */
    public int f1712p;

    /* renamed from: q */
    public int f1713q;

    /* renamed from: r */
    public int f1714r;

    /* renamed from: s */
    public int f1715s;

    /* renamed from: t */
    public int f1716t;

    /* renamed from: u */
    public int f1717u;

    /* renamed from: v */
    public int f1718v;

    /* renamed from: w */
    public int f1719w;

    /* renamed from: x */
    public int f1720x;

    /* renamed from: y */
    public int f1721y;

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: c */
        public static final int f1722c = 0;

        /* renamed from: d */
        public static final int f1723d = 1;

        /* renamed from: e */
        public static final int f1724e = 2;

        /* renamed from: b */
        public int f1725b;

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1725b = 0;
            this.f652a = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.f1725b = 0;
            this.f652a = i3;
        }

        public LayoutParams(@mr2 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1725b = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1725b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.f1725b = 0;
            mo2452a(marginLayoutParams);
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1725b = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1725b = 0;
            this.f1725b = layoutParams.f1725b;
        }

        /* renamed from: a */
        public void mo2452a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0340a implements ActionMenuView.C0275d {
        public C0340a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1694a.mo14663j(menuItem)) {
                return true;
            }
            C0344e eVar = Toolbar.this.f1691a;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C0341b implements Runnable {
        public C0341b() {
        }

        public void run() {
            Toolbar.this.mo2344M();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0342c implements View.OnClickListener {
        public C0342c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo2350e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0343d implements C0258j {

        /* renamed from: a */
        public C0248e f1729a;

        /* renamed from: a */
        public C0253h f1730a;

        public C0343d() {
        }

        /* renamed from: b */
        public void mo1212b(C0248e eVar, boolean z) {
        }

        /* renamed from: d */
        public void mo1214d(boolean z) {
            if (this.f1730a != null) {
                C0248e eVar = this.f1729a;
                boolean z2 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1729a.getItem(i) == this.f1730a) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1221k(this.f1729a, this.f1730a);
                }
            }
        }

        /* renamed from: e */
        public boolean mo1215e() {
            return false;
        }

        /* renamed from: f */
        public C0260k mo1216f(ViewGroup viewGroup) {
            return null;
        }

        /* renamed from: g */
        public void mo1217g(Context context, C0248e eVar) {
            C0253h hVar;
            C0248e eVar2 = this.f1729a;
            if (!(eVar2 == null || (hVar = this.f1730a) == null)) {
                eVar2.mo1335g(hVar);
            }
            this.f1729a = eVar;
        }

        public int getId() {
            return 0;
        }

        /* renamed from: h */
        public boolean mo1219h(C0265m mVar) {
            return false;
        }

        /* renamed from: i */
        public Parcelable mo1240i() {
            return null;
        }

        /* renamed from: j */
        public void mo1220j(C0258j.C0259a aVar) {
        }

        /* renamed from: k */
        public boolean mo1221k(C0248e eVar, C0253h hVar) {
            View view = Toolbar.this.f1682a;
            if (view instanceof l00) {
                ((l00) view).mo2170e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1682a);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1701b);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1682a = null;
            toolbar3.mo2345a();
            this.f1730a = null;
            Toolbar.this.requestLayout();
            hVar.mo1464v(false);
            return true;
        }

        /* renamed from: m */
        public boolean mo1223m(C0248e eVar, C0253h hVar) {
            Toolbar.this.mo2352g();
            ViewParent parent = Toolbar.this.f1701b.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1701b);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1701b);
            }
            Toolbar.this.f1682a = hVar.getActionView();
            this.f1730a = hVar;
            ViewParent parent2 = Toolbar.this.f1682a.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1682a);
                }
                LayoutParams m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f652a = 8388611 | (toolbar4.f1713q & 112);
                m.f1725b = 2;
                toolbar4.f1682a.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1682a);
            }
            Toolbar.this.mo2341J();
            Toolbar.this.requestLayout();
            hVar.mo1464v(true);
            View view = Toolbar.this.f1682a;
            if (view instanceof l00) {
                ((l00) view).mo2166c();
            }
            return true;
        }

        /* renamed from: n */
        public void mo1242n(Parcelable parcelable) {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public interface C0344e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public static class C0345f extends C2015e0 {
        public static final Parcelable.Creator<C0345f> CREATOR = new C0346a();

        /* renamed from: b */
        public boolean f1732b;

        /* renamed from: n */
        public int f1733n;

        /* renamed from: androidx.appcompat.widget.Toolbar$f$a */
        public class C0346a implements Parcelable.ClassLoaderCreator<C0345f> {
            /* renamed from: a */
            public C0345f createFromParcel(Parcel parcel) {
                return new C0345f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0345f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0345f(parcel, classLoader);
            }

            /* renamed from: c */
            public C0345f[] newArray(int i) {
                return new C0345f[i];
            }
        }

        public C0345f(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public C0345f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1733n = parcel.readInt();
            this.f1732b = parcel.readInt() != 0;
        }

        public C0345f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1733n);
            parcel.writeInt(this.f1732b ? 1 : 0);
        }
    }

    public Toolbar(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.toolbarStyle);
    }

    public Toolbar(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1721y = 8388627;
        this.f1698a = new ArrayList<>();
        this.f1704b = new ArrayList<>();
        this.f1699a = new int[2];
        this.f1694a = new dh2(new lf4(this));
        this.f1707c = new ArrayList<>();
        this.f1688a = new C0340a();
        this.f1697a = new C0341b();
        Context context2 = getContext();
        int[] iArr = za3.C4068m.Toolbar;
        af4 G = af4.m11110G(context2, attributeSet, iArr, i, 0);
        jt4.m19033z1(this, context, iArr, attributeSet, G.mo13025B(), i, 0);
        this.f1711o = G.mo13050u(za3.C4068m.Toolbar_titleTextAppearance, 0);
        this.f1712p = G.mo13050u(za3.C4068m.Toolbar_subtitleTextAppearance, 0);
        this.f1721y = G.mo13045p(za3.C4068m.Toolbar_android_gravity, this.f1721y);
        this.f1713q = G.mo13045p(za3.C4068m.Toolbar_buttonGravity, 48);
        int f = G.mo13035f(za3.C4068m.Toolbar_titleMargin, 0);
        int i2 = za3.C4068m.Toolbar_titleMargins;
        f = G.mo13026C(i2) ? G.mo13035f(i2, f) : f;
        this.f1718v = f;
        this.f1717u = f;
        this.f1716t = f;
        this.f1715s = f;
        int f2 = G.mo13035f(za3.C4068m.Toolbar_titleMarginStart, -1);
        if (f2 >= 0) {
            this.f1715s = f2;
        }
        int f3 = G.mo13035f(za3.C4068m.Toolbar_titleMarginEnd, -1);
        if (f3 >= 0) {
            this.f1716t = f3;
        }
        int f4 = G.mo13035f(za3.C4068m.Toolbar_titleMarginTop, -1);
        if (f4 >= 0) {
            this.f1717u = f4;
        }
        int f5 = G.mo13035f(za3.C4068m.Toolbar_titleMarginBottom, -1);
        if (f5 >= 0) {
            this.f1718v = f5;
        }
        this.f1714r = G.mo13036g(za3.C4068m.Toolbar_maxButtonHeight, -1);
        int f6 = G.mo13035f(za3.C4068m.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int f7 = G.mo13035f(za3.C4068m.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int g = G.mo13036g(za3.C4068m.Toolbar_contentInsetLeft, 0);
        int g2 = G.mo13036g(za3.C4068m.Toolbar_contentInsetRight, 0);
        mo2387h();
        this.f1695a.mo17898e(g, g2);
        if (!(f6 == Integer.MIN_VALUE && f7 == Integer.MIN_VALUE)) {
            this.f1695a.mo17900g(f6, f7);
        }
        this.f1719w = G.mo13035f(za3.C4068m.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1720x = G.mo13035f(za3.C4068m.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1681a = G.mo13037h(za3.C4068m.Toolbar_collapseIcon);
        this.f1696a = G.mo13053x(za3.C4068m.Toolbar_collapseContentDescription);
        CharSequence x = G.mo13053x(za3.C4068m.Toolbar_title);
        if (!TextUtils.isEmpty(x)) {
            setTitle(x);
        }
        CharSequence x2 = G.mo13053x(za3.C4068m.Toolbar_subtitle);
        if (!TextUtils.isEmpty(x2)) {
            setSubtitle(x2);
        }
        this.f1679a = getContext();
        setPopupTheme(G.mo13050u(za3.C4068m.Toolbar_popupTheme, 0));
        Drawable h = G.mo13037h(za3.C4068m.Toolbar_navigationIcon);
        if (h != null) {
            setNavigationIcon(h);
        }
        CharSequence x3 = G.mo13053x(za3.C4068m.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(x3)) {
            setNavigationContentDescription(x3);
        }
        Drawable h2 = G.mo13037h(za3.C4068m.Toolbar_logo);
        if (h2 != null) {
            setLogo(h2);
        }
        CharSequence x4 = G.mo13053x(za3.C4068m.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(x4)) {
            setLogoDescription(x4);
        }
        int i3 = za3.C4068m.Toolbar_titleTextColor;
        if (G.mo13026C(i3)) {
            setTitleTextColor(G.mo13033d(i3));
        }
        int i4 = za3.C4068m.Toolbar_subtitleTextColor;
        if (G.mo13026C(i4)) {
            setSubtitleTextColor(G.mo13033d(i4));
        }
        int i5 = za3.C4068m.Toolbar_menu;
        if (G.mo13026C(i5)) {
            mo2449x(G.mo13050u(i5, 0));
        }
        G.mo13029I();
    }

    /* renamed from: I */
    private void m2402I() {
        removeCallbacks(this.f1697a);
        post(this.f1697a);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h74(getContext());
    }

    @bc2
    @SuppressLint({"LambdaLast"})
    /* renamed from: A */
    public void mo613A(@mr2 kh2 kh2, @mr2 a32 a32, @mr2 C0690e.C0693c cVar) {
        this.f1694a.mo14660e(kh2, a32, cVar);
    }

    /* renamed from: B */
    public boolean mo2334B() {
        ActionMenuView actionMenuView = this.f1689a;
        return actionMenuView != null && actionMenuView.mo1637M();
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: C */
    public boolean mo2335C() {
        Layout layout;
        TextView textView = this.f1685a;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final int mo2336D(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = mo2404q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    /* renamed from: E */
    public final int mo2337E(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = mo2404q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* renamed from: F */
    public final int mo2338F(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: G */
    public final void mo2339G(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: H */
    public final void mo2340H() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1694a.mo14661h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1707c = currentMenuItems2;
        this.f1694a.mo14664k(menu);
    }

    /* renamed from: J */
    public void mo2341J() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f1725b == 2 || childAt == this.f1689a)) {
                removeViewAt(childCount);
                this.f1704b.add(childAt);
            }
        }
    }

    /* renamed from: K */
    public final boolean mo2342K() {
        if (!this.f1709d) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo2343L(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public final boolean mo2343L(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: M */
    public boolean mo2344M() {
        ActionMenuView actionMenuView = this.f1689a;
        return actionMenuView != null && actionMenuView.mo1641R();
    }

    @bc2
    /* renamed from: P */
    public void mo617P(@mr2 kh2 kh2) {
        this.f1694a.mo14658c(kh2);
    }

    @bc2
    /* renamed from: Q */
    public void mo618Q(@mr2 kh2 kh2, @mr2 a32 a32) {
        this.f1694a.mo14659d(kh2, a32);
    }

    @bc2
    /* renamed from: S */
    public void mo619S() {
        Iterator<MenuItem> it = this.f1707c.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        mo2340H();
    }

    @bc2
    /* renamed from: W */
    public void mo622W(@mr2 kh2 kh2) {
        this.f1694a.mo14665l(kh2);
    }

    /* renamed from: a */
    public void mo2345a() {
        for (int size = this.f1704b.size() - 1; size >= 0; size--) {
            addView(this.f1704b.get(size));
        }
        this.f1704b.clear();
    }

    /* renamed from: b */
    public final void mo2346b(List<View> list, int i) {
        boolean z = jt4.m18928Z(this) == 1;
        int childCount = getChildCount();
        int d = ri1.m26762d(i, jt4.m18928Z(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1725b == 0 && mo2343L(childAt) && mo2403p(layoutParams.f652a) == d) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1725b == 0 && mo2343L(childAt2) && mo2403p(layoutParams2.f652a) == d) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    public final void mo2347c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams m = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        m.f1725b = 1;
        if (!z || this.f1682a == null) {
            addView(view, m);
            return;
        }
        view.setLayoutParams(m);
        this.f1704b.add(view);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1689a;
     */
    @com.onedelhi.secure.hl3({com.onedelhi.secure.hl3.C2354a.f13188c})
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2349d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1689a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo1638N()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo2349d():boolean");
    }

    /* renamed from: e */
    public void mo2350e() {
        C0343d dVar = this.f1690a;
        C0253h hVar = dVar == null ? null : dVar.f1730a;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo2351f() {
        ActionMenuView actionMenuView = this.f1689a;
        if (actionMenuView != null) {
            actionMenuView.mo1629E();
        }
    }

    /* renamed from: g */
    public void mo2352g() {
        if (this.f1701b == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, za3.C4057b.toolbarNavigationButtonStyle);
            this.f1701b = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1681a);
            this.f1701b.setContentDescription(this.f1696a);
            LayoutParams m = generateDefaultLayoutParams();
            m.f652a = 8388611 | (this.f1713q & 112);
            m.f1725b = 2;
            this.f1701b.setLayoutParams(m);
            this.f1701b.setOnClickListener(new C0342c());
        }
    }

    @ts2
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1701b;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @ts2
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1701b;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        io3 io3 = this.f1695a;
        if (io3 != null) {
            return io3.mo17894a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1720x;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        io3 io3 = this.f1695a;
        if (io3 != null) {
            return io3.mo17895b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        io3 io3 = this.f1695a;
        if (io3 != null) {
            return io3.mo17896c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        io3 io3 = this.f1695a;
        if (io3 != null) {
            return io3.mo17897d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1719w;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo1640Q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1689a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.e r0 = r0.mo1640Q()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1720x
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return jt4.m18928Z(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return jt4.m18928Z(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1719w, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1684a;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1684a;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo2389j();
        return this.f1689a.getMenu();
    }

    @ts2
    @hl3({hl3.C2354a.f13190e})
    public View getNavButtonView() {
        return this.f1683a;
    }

    @ts2
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1683a;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @ts2
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1683a;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0348a getOuterActionMenuPresenter() {
        return this.f1692a;
    }

    @ts2
    public Drawable getOverflowIcon() {
        mo2389j();
        return this.f1689a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1679a;
    }

    @e64
    public int getPopupTheme() {
        return this.f1710n;
    }

    public CharSequence getSubtitle() {
        return this.f1706c;
    }

    @ts2
    @hl3({hl3.C2354a.f13190e})
    public final TextView getSubtitleTextView() {
        return this.f1702b;
    }

    public CharSequence getTitle() {
        return this.f1703b;
    }

    public int getTitleMarginBottom() {
        return this.f1718v;
    }

    public int getTitleMarginEnd() {
        return this.f1716t;
    }

    public int getTitleMarginStart() {
        return this.f1715s;
    }

    public int getTitleMarginTop() {
        return this.f1717u;
    }

    @ts2
    @hl3({hl3.C2354a.f13190e})
    public final TextView getTitleTextView() {
        return this.f1685a;
    }

    @hl3({hl3.C2354a.f13188c})
    public lg0 getWrapper() {
        if (this.f1693a == null) {
            this.f1693a = new C0372e(this, true);
        }
        return this.f1693a;
    }

    /* renamed from: h */
    public final void mo2387h() {
        if (this.f1695a == null) {
            this.f1695a = new io3();
        }
    }

    /* renamed from: i */
    public final void mo2388i() {
        if (this.f1684a == null) {
            this.f1684a = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    public final void mo2389j() {
        mo2390k();
        if (this.f1689a.mo1640Q() == null) {
            C0248e eVar = (C0248e) this.f1689a.getMenu();
            if (this.f1690a == null) {
                this.f1690a = new C0343d();
            }
            this.f1689a.setExpandedActionViewsExclusive(true);
            eVar.mo1323c(this.f1690a, this.f1679a);
        }
    }

    /* renamed from: k */
    public final void mo2390k() {
        if (this.f1689a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1689a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1710n);
            this.f1689a.setOnMenuItemClickListener(this.f1688a);
            this.f1689a.setMenuCallbacks(this.f1687a, this.f1686a);
            LayoutParams m = generateDefaultLayoutParams();
            m.f652a = 8388613 | (this.f1713q & 112);
            this.f1689a.setLayoutParams(m);
            mo2347c(this.f1689a, false);
        }
    }

    /* renamed from: l */
    public final void mo2391l() {
        if (this.f1683a == null) {
            this.f1683a = new AppCompatImageButton(getContext(), (AttributeSet) null, za3.C4057b.toolbarNavigationButtonStyle);
            LayoutParams m = generateDefaultLayoutParams();
            m.f652a = 8388611 | (this.f1713q & 112);
            this.f1683a.setLayoutParams(m);
        }
    }

    /* renamed from: m */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: n */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: o */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1697a);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1708c = false;
        }
        if (!this.f1708c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1708c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1708c = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f0 A[LOOP:2: B:117:0x02ee->B:118:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = com.onedelhi.secure.jt4.m18928Z(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1699a
            r11[r2] = r3
            r11[r3] = r3
            int r12 = com.onedelhi.secure.jt4.m18948e0(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1683a
            boolean r13 = r0.mo2343L(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f1683a
            if (r1 == 0) goto L_0x004e
            int r13 = r0.mo2337E(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.mo2336D(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f1701b
            boolean r15 = r0.mo2343L(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f1701b
            if (r1 == 0) goto L_0x0066
            int r14 = r0.mo2337E(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.mo2336D(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1689a
            boolean r15 = r0.mo2343L(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1689a
            if (r1 == 0) goto L_0x007b
            int r13 = r0.mo2336D(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.mo2337E(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1682a
            boolean r13 = r0.mo2343L(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f1682a
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.mo2337E(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.mo2336D(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f1684a
            boolean r13 = r0.mo2343L(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f1684a
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.mo2337E(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.mo2336D(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f1685a
            boolean r13 = r0.mo2343L(r13)
            android.widget.TextView r14 = r0.f1702b
            boolean r14 = r0.mo2343L(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f1685a
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r15 = (androidx.appcompat.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1685a
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f1702b
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1702b
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r18 = r6
            r22 = r12
        L_0x011e:
            r1 = 0
            goto L_0x0286
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f1685a
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f1702b
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f1702b
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f1685a
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f1685a
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0152
            android.widget.TextView r15 = r0.f1702b
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0152
        L_0x014f:
            r17 = 1
            goto L_0x0154
        L_0x0152:
            r17 = 0
        L_0x0154:
            int r15 = r0.f1721y
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019c
            r6 = 80
            if (r15 == r6) goto L_0x018e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1717u
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0177
            int r6 = r15 + r12
            goto L_0x018c
        L_0x0177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1718v
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018c:
            int r8 = r8 + r6
            goto L_0x01ab
        L_0x018e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1718v
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ab
        L_0x019c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1717u
            int r8 = r2 + r3
        L_0x01ab:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.f1715s
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f1685a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f1685a
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1685a
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1685a
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1716t
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0211
            android.widget.TextView r1 = r0.f1702b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1702b
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1702b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1702b
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1716t
            int r1 = r10 - r1
            goto L_0x0212
        L_0x0211:
            r1 = r10
        L_0x0212:
            if (r17 == 0) goto L_0x0219
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0219:
            r2 = r24
            goto L_0x011e
        L_0x021d:
            if (r17 == 0) goto L_0x0223
            int r7 = r0.f1715s
            r1 = 0
            goto L_0x0225
        L_0x0223:
            r1 = 0
            r7 = 0
        L_0x0225:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x025a
            android.widget.TextView r3 = r0.f1685a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            android.widget.TextView r4 = r0.f1685a
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1685a
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1685a
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1716t
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x025b
        L_0x025a:
            r4 = r2
        L_0x025b:
            if (r14 == 0) goto L_0x027f
            android.widget.TextView r3 = r0.f1702b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1702b
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f1702b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1702b
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f1716t
            int r3 = r3 + r5
            goto L_0x0280
        L_0x027f:
            r3 = r2
        L_0x0280:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0286:
            java.util.ArrayList<android.view.View> r3 = r0.f1698a
            r4 = 3
            r0.mo2346b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1698a
            int r3 = r3.size()
            r7 = 0
        L_0x0293:
            if (r7 >= r3) goto L_0x02a6
            java.util.ArrayList<android.view.View> r4 = r0.f1698a
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.mo2336D(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x0293
        L_0x02a6:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f1698a
            r4 = 5
            r0.mo2346b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1698a
            int r3 = r3.size()
            r7 = 0
        L_0x02b5:
            if (r7 >= r3) goto L_0x02c6
            java.util.ArrayList<android.view.View> r4 = r0.f1698a
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.mo2337E(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02b5
        L_0x02c6:
            java.util.ArrayList<android.view.View> r3 = r0.f1698a
            r4 = 1
            r0.mo2346b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1698a
            int r3 = r0.mo2446u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02e1
            goto L_0x02e8
        L_0x02e1:
            if (r3 <= r10) goto L_0x02e7
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02e8
        L_0x02e7:
            r2 = r6
        L_0x02e8:
            java.util.ArrayList<android.view.View> r3 = r0.f1698a
            int r3 = r3.size()
        L_0x02ee:
            if (r1 >= r3) goto L_0x02ff
            java.util.ArrayList<android.view.View> r4 = r0.f1698a
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.mo2336D(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02ee
        L_0x02ff:
            java.util.ArrayList<android.view.View> r1 = r0.f1698a
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1699a;
        char b = rv4.m27093b(this);
        int i10 = 0;
        char c = b ^ 1;
        if (mo2343L(this.f1683a)) {
            mo2339G(this.f1683a, i, 0, i2, 0, this.f1714r);
            i5 = this.f1683a.getMeasuredWidth() + mo2406s(this.f1683a);
            i4 = Math.max(0, this.f1683a.getMeasuredHeight() + mo2445t(this.f1683a));
            i3 = View.combineMeasuredStates(0, this.f1683a.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (mo2343L(this.f1701b)) {
            mo2339G(this.f1701b, i, 0, i2, 0, this.f1714r);
            i5 = this.f1701b.getMeasuredWidth() + mo2406s(this.f1701b);
            i4 = Math.max(i4, this.f1701b.getMeasuredHeight() + mo2445t(this.f1701b));
            i3 = View.combineMeasuredStates(i3, this.f1701b.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[b] = Math.max(0, currentContentInsetStart - i5);
        if (mo2343L(this.f1689a)) {
            mo2339G(this.f1689a, i, max, i2, 0, this.f1714r);
            i6 = this.f1689a.getMeasuredWidth() + mo2406s(this.f1689a);
            i4 = Math.max(i4, this.f1689a.getMeasuredHeight() + mo2445t(this.f1689a));
            i3 = View.combineMeasuredStates(i3, this.f1689a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (mo2343L(this.f1682a)) {
            max2 += mo2338F(this.f1682a, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1682a.getMeasuredHeight() + mo2445t(this.f1682a));
            i3 = View.combineMeasuredStates(i3, this.f1682a.getMeasuredState());
        }
        if (mo2343L(this.f1684a)) {
            max2 += mo2338F(this.f1684a, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1684a.getMeasuredHeight() + mo2445t(this.f1684a));
            i3 = View.combineMeasuredStates(i3, this.f1684a.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((LayoutParams) childAt.getLayoutParams()).f1725b == 0 && mo2343L(childAt)) {
                max2 += mo2338F(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + mo2445t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1717u + this.f1718v;
        int i13 = this.f1715s + this.f1716t;
        if (mo2343L(this.f1685a)) {
            mo2338F(this.f1685a, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1685a.getMeasuredWidth() + mo2406s(this.f1685a);
            i7 = this.f1685a.getMeasuredHeight() + mo2445t(this.f1685a);
            i9 = View.combineMeasuredStates(i3, this.f1685a.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (mo2343L(this.f1702b)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, mo2338F(this.f1702b, i, max2 + i13, i2, i14, iArr));
            i7 += this.f1702b.getMeasuredHeight() + mo2445t(this.f1702b);
            i9 = View.combineMeasuredStates(i9, this.f1702b.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!mo2342K()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0345f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0345f fVar = (C0345f) parcelable;
        super.onRestoreInstanceState(fVar.mo14959a());
        ActionMenuView actionMenuView = this.f1689a;
        C0248e Q = actionMenuView != null ? actionMenuView.mo1640Q() : null;
        int i = fVar.f1733n;
        if (!(i == 0 || this.f1690a == null || Q == null || (findItem = Q.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (fVar.f1732b) {
            m2402I();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        mo2387h();
        io3 io3 = this.f1695a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        io3.mo17899f(z);
    }

    public Parcelable onSaveInstanceState() {
        C0253h hVar;
        C0345f fVar = new C0345f(super.onSaveInstanceState());
        C0343d dVar = this.f1690a;
        if (!(dVar == null || (hVar = dVar.f1730a) == null)) {
            fVar.f1733n = hVar.getItemId();
        }
        fVar.f1732b = mo2334B();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1705b = false;
        }
        if (!this.f1705b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1705b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1705b = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int mo2403p(int i) {
        int Z = jt4.m18928Z(this);
        int d = ri1.m26762d(i, Z) & 7;
        return (d == 1 || d == 3 || d == 5) ? d : Z == 1 ? 5 : 3;
    }

    /* renamed from: q */
    public final int mo2404q(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = mo2405r(layoutParams.f652a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = layoutParams.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = layoutParams.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    public final int mo2405r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1721y & 112;
    }

    /* renamed from: s */
    public final int mo2406s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return ld2.m20479c(marginLayoutParams) + ld2.m20478b(marginLayoutParams);
    }

    public void setCollapseContentDescription(@e54 int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(@ts2 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo2352g();
        }
        ImageButton imageButton = this.f1701b;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@dp0 int i) {
        setCollapseIcon(C3129p8.m24529b(getContext(), i));
    }

    public void setCollapseIcon(@ts2 Drawable drawable) {
        if (drawable != null) {
            mo2352g();
            this.f1701b.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1701b;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1681a);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setCollapsible(boolean z) {
        this.f1709d = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1720x) {
            this.f1720x = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1719w) {
            this.f1719w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        mo2387h();
        this.f1695a.mo17898e(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        mo2387h();
        this.f1695a.mo17900g(i, i2);
    }

    public void setLogo(@dp0 int i) {
        setLogo(C3129p8.m24529b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            mo2388i();
            if (!mo2450y(this.f1684a)) {
                mo2347c(this.f1684a, true);
            }
        } else {
            ImageView imageView = this.f1684a;
            if (imageView != null && mo2450y(imageView)) {
                removeView(this.f1684a);
                this.f1704b.remove(this.f1684a);
            }
        }
        ImageView imageView2 = this.f1684a;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(@e54 int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo2388i();
        }
        ImageView imageView = this.f1684a;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    @hl3({hl3.C2354a.f13185a})
    public void setMenu(C0248e eVar, C0348a aVar) {
        if (eVar != null || this.f1689a != null) {
            mo2390k();
            C0248e Q = this.f1689a.mo1640Q();
            if (Q != eVar) {
                if (Q != null) {
                    Q.mo1302S(this.f1692a);
                    Q.mo1302S(this.f1690a);
                }
                if (this.f1690a == null) {
                    this.f1690a = new C0343d();
                }
                aVar.mo2483K(true);
                if (eVar != null) {
                    eVar.mo1323c(aVar, this.f1679a);
                    eVar.mo1323c(this.f1690a, this.f1679a);
                } else {
                    aVar.mo1217g(this.f1679a, (C0248e) null);
                    this.f1690a.mo1217g(this.f1679a, (C0248e) null);
                    aVar.mo1214d(true);
                    this.f1690a.mo1214d(true);
                }
                this.f1689a.setPopupTheme(this.f1710n);
                this.f1689a.setPresenter(aVar);
                this.f1692a = aVar;
            }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setMenuCallbacks(C0258j.C0259a aVar, C0248e.C0249a aVar2) {
        this.f1687a = aVar;
        this.f1686a = aVar2;
        ActionMenuView actionMenuView = this.f1689a;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(@e54 int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(@ts2 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo2391l();
        }
        ImageButton imageButton = this.f1683a;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            of4.m23742a(this.f1683a, charSequence);
        }
    }

    public void setNavigationIcon(@dp0 int i) {
        setNavigationIcon(C3129p8.m24529b(getContext(), i));
    }

    public void setNavigationIcon(@ts2 Drawable drawable) {
        if (drawable != null) {
            mo2391l();
            if (!mo2450y(this.f1683a)) {
                mo2347c(this.f1683a, true);
            }
        } else {
            ImageButton imageButton = this.f1683a;
            if (imageButton != null && mo2450y(imageButton)) {
                removeView(this.f1683a);
                this.f1704b.remove(this.f1683a);
            }
        }
        ImageButton imageButton2 = this.f1683a;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mo2391l();
        this.f1683a.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0344e eVar) {
        this.f1691a = eVar;
    }

    public void setOverflowIcon(@ts2 Drawable drawable) {
        mo2389j();
        this.f1689a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@e64 int i) {
        if (this.f1710n != i) {
            this.f1710n = i;
            if (i == 0) {
                this.f1679a = getContext();
            } else {
                this.f1679a = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@e54 int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1702b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1702b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1702b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1712p;
                if (i != 0) {
                    this.f1702b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1700b;
                if (colorStateList != null) {
                    this.f1702b.setTextColor(colorStateList);
                }
            }
            if (!mo2450y(this.f1702b)) {
                mo2347c(this.f1702b, true);
            }
        } else {
            TextView textView = this.f1702b;
            if (textView != null && mo2450y(textView)) {
                removeView(this.f1702b);
                this.f1704b.remove(this.f1702b);
            }
        }
        TextView textView2 = this.f1702b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1706c = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, @e64 int i) {
        this.f1712p = i;
        TextView textView = this.f1702b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(@d10 int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(@mr2 ColorStateList colorStateList) {
        this.f1700b = colorStateList;
        TextView textView = this.f1702b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(@e54 int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1685a == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1685a = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1685a.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1711o;
                if (i != 0) {
                    this.f1685a.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1680a;
                if (colorStateList != null) {
                    this.f1685a.setTextColor(colorStateList);
                }
            }
            if (!mo2450y(this.f1685a)) {
                mo2347c(this.f1685a, true);
            }
        } else {
            TextView textView = this.f1685a;
            if (textView != null && mo2450y(textView)) {
                removeView(this.f1685a);
                this.f1704b.remove(this.f1685a);
            }
        }
        TextView textView2 = this.f1685a;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1703b = charSequence;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.f1715s = i;
        this.f1717u = i2;
        this.f1716t = i3;
        this.f1718v = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.f1718v = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1716t = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1715s = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1717u = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @e64 int i) {
        this.f1711o = i;
        TextView textView = this.f1685a;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(@d10 int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(@mr2 ColorStateList colorStateList) {
        this.f1680a = colorStateList;
        TextView textView = this.f1685a;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: t */
    public final int mo2445t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    public final int mo2446u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i5 = layoutParams.leftMargin - i;
            int i6 = layoutParams.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: v */
    public boolean mo2447v() {
        C0343d dVar = this.f1690a;
        return (dVar == null || dVar.f1730a == null) ? false : true;
    }

    /* renamed from: w */
    public boolean mo2448w() {
        ActionMenuView actionMenuView = this.f1689a;
        return actionMenuView != null && actionMenuView.mo1635K();
    }

    /* renamed from: x */
    public void mo2449x(@lh2 int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: y */
    public final boolean mo2450y(View view) {
        return view.getParent() == this || this.f1704b.contains(view);
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: z */
    public boolean mo2451z() {
        ActionMenuView actionMenuView = this.f1689a;
        return actionMenuView != null && actionMenuView.mo1636L();
    }
}
