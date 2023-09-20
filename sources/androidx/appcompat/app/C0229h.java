package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0255i;
import androidx.appcompat.view.menu.C0265m;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0657l;
import androidx.fragment.app.FragmentActivity;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3222q2;
import com.onedelhi.secure.C3563t2;
import com.onedelhi.secure.h74;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.lg0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.vu4;
import com.onedelhi.secure.wu4;
import com.onedelhi.secure.xu4;
import com.onedelhi.secure.yu4;
import com.onedelhi.secure.za3;
import com.onedelhi.secure.zu4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.app.h */
public class C0229h extends ActionBar implements ActionBarOverlayLayout.C0271d {

    /* renamed from: a */
    public static final long f942a = 100;

    /* renamed from: a */
    public static final Interpolator f943a = new AccelerateInterpolator();

    /* renamed from: a */
    public static final String f944a = "WindowDecorActionBar";

    /* renamed from: b */
    public static final long f945b = 200;

    /* renamed from: b */
    public static final Interpolator f946b = new DecelerateInterpolator();

    /* renamed from: k */
    public static final int f947k = -1;

    /* renamed from: a */
    public Activity f948a;

    /* renamed from: a */
    public Context f949a;

    /* renamed from: a */
    public View f950a;

    /* renamed from: a */
    public C0233d f951a;

    /* renamed from: a */
    public C0234e f952a;

    /* renamed from: a */
    public ActionBarContainer f953a;

    /* renamed from: a */
    public ActionBarContextView f954a;

    /* renamed from: a */
    public ActionBarOverlayLayout f955a;

    /* renamed from: a */
    public ScrollingTabContainerView f956a;

    /* renamed from: a */
    public lg0 f957a;

    /* renamed from: a */
    public C3563t2.C3564a f958a;

    /* renamed from: a */
    public C3563t2 f959a;

    /* renamed from: a */
    public wu4 f960a;

    /* renamed from: a */
    public final xu4 f961a = new C0230a();

    /* renamed from: a */
    public final zu4 f962a = new C0232c();

    /* renamed from: a */
    public ArrayList<C0234e> f963a = new ArrayList<>();

    /* renamed from: a */
    public boolean f964a;

    /* renamed from: b */
    public Context f965b;

    /* renamed from: b */
    public final xu4 f966b = new C0231b();

    /* renamed from: b */
    public ArrayList<ActionBar.C0161c> f967b = new ArrayList<>();

    /* renamed from: b */
    public boolean f968b;

    /* renamed from: c */
    public boolean f969c;

    /* renamed from: d */
    public boolean f970d = true;

    /* renamed from: e */
    public boolean f971e;

    /* renamed from: f */
    public boolean f972f;

    /* renamed from: g */
    public boolean f973g;

    /* renamed from: h */
    public boolean f974h = true;

    /* renamed from: i */
    public int f975i = -1;

    /* renamed from: i */
    public boolean f976i;

    /* renamed from: j */
    public int f977j = 0;

    /* renamed from: j */
    public boolean f978j;

    /* renamed from: androidx.appcompat.app.h$a */
    public class C0230a extends yu4 {
        public C0230a() {
        }

        /* renamed from: a */
        public void mo1068a(View view) {
            View view2;
            C0229h hVar = C0229h.this;
            if (hVar.f970d && (view2 = hVar.f950a) != null) {
                view2.setTranslationY(0.0f);
                C0229h.this.f953a.setTranslationY(0.0f);
            }
            C0229h.this.f953a.setVisibility(8);
            C0229h.this.f953a.setTransitioning(false);
            C0229h hVar2 = C0229h.this;
            hVar2.f960a = null;
            hVar2.mo1129H0();
            ActionBarOverlayLayout actionBarOverlayLayout = C0229h.this.f955a;
            if (actionBarOverlayLayout != null) {
                jt4.m19017v1(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$b */
    public class C0231b extends yu4 {
        public C0231b() {
        }

        /* renamed from: a */
        public void mo1068a(View view) {
            C0229h hVar = C0229h.this;
            hVar.f960a = null;
            hVar.f953a.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.h$c */
    public class C0232c implements zu4 {
        public C0232c() {
        }

        /* renamed from: a */
        public void mo1149a(View view) {
            ((View) C0229h.this.f953a.getParent()).invalidate();
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: androidx.appcompat.app.h$d */
    public class C0233d extends C3563t2 implements C0248e.C0249a {

        /* renamed from: a */
        public final Context f982a;

        /* renamed from: a */
        public final C0248e f984a;

        /* renamed from: a */
        public C3563t2.C3564a f985a;

        /* renamed from: a */
        public WeakReference<View> f986a;

        public C0233d(Context context, C3563t2.C3564a aVar) {
            this.f982a = context;
            this.f985a = aVar;
            C0248e Z = new C0248e(context).mo1309Z(1);
            this.f984a = Z;
            Z.mo1307X(this);
        }

        /* renamed from: a */
        public void mo1031a(@mr2 C0248e eVar) {
            if (this.f985a != null) {
                mo1156k();
                C0229h.this.f954a.mo1537o();
            }
        }

        /* renamed from: b */
        public boolean mo1033b(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
            C3563t2.C3564a aVar = this.f985a;
            if (aVar != null) {
                return aVar.mo1075b(this, menuItem);
            }
            return false;
        }

        /* renamed from: c */
        public void mo1150c() {
            C0229h hVar = C0229h.this;
            if (hVar.f951a == this) {
                if (!C0229h.m1638F0(hVar.f971e, hVar.f972f, false)) {
                    C0229h hVar2 = C0229h.this;
                    hVar2.f959a = this;
                    hVar2.f958a = this.f985a;
                } else {
                    this.f985a.mo1077d(this);
                }
                this.f985a = null;
                C0229h.this.mo1127E0(false);
                C0229h.this.f954a.mo1543p();
                C0229h hVar3 = C0229h.this;
                hVar3.f955a.setHideOnContentScrollEnabled(hVar3.f978j);
                C0229h.this.f951a = null;
            }
        }

        /* renamed from: d */
        public View mo1151d() {
            WeakReference<View> weakReference = this.f986a;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo1152e() {
            return this.f984a;
        }

        /* renamed from: f */
        public MenuInflater mo1153f() {
            return new h74(this.f982a);
        }

        /* renamed from: g */
        public CharSequence mo1154g() {
            return C0229h.this.f954a.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo1155i() {
            return C0229h.this.f954a.getTitle();
        }

        /* renamed from: k */
        public void mo1156k() {
            if (C0229h.this.f951a == this) {
                this.f984a.mo1351m0();
                try {
                    this.f985a.mo1076c(this, this.f984a);
                } finally {
                    this.f984a.mo1349l0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo1157l() {
            return C0229h.this.f954a.mo1546s();
        }

        /* renamed from: n */
        public void mo1158n(View view) {
            C0229h.this.f954a.setCustomView(view);
            this.f986a = new WeakReference<>(view);
        }

        /* renamed from: o */
        public void mo1159o(int i) {
            mo1160p(C0229h.this.f949a.getResources().getString(i));
        }

        /* renamed from: p */
        public void mo1160p(CharSequence charSequence) {
            C0229h.this.f954a.setSubtitle(charSequence);
        }

        /* renamed from: r */
        public void mo1161r(int i) {
            mo1162s(C0229h.this.f949a.getResources().getString(i));
        }

        /* renamed from: s */
        public void mo1162s(CharSequence charSequence) {
            C0229h.this.f954a.setTitle(charSequence);
        }

        /* renamed from: t */
        public void mo1163t(boolean z) {
            super.mo1163t(z);
            C0229h.this.f954a.setTitleOptional(z);
        }

        /* renamed from: u */
        public boolean mo1164u() {
            this.f984a.mo1351m0();
            try {
                return this.f985a.mo1074a(this, this.f984a);
            } finally {
                this.f984a.mo1349l0();
            }
        }

        /* renamed from: v */
        public void mo1165v(C0248e eVar, boolean z) {
        }

        /* renamed from: w */
        public void mo1166w(C0265m mVar) {
        }

        /* renamed from: x */
        public boolean mo1167x(C0265m mVar) {
            if (this.f985a == null) {
                return false;
            }
            if (!mVar.hasVisibleItems()) {
                return true;
            }
            new C0255i(C0229h.this.mo696A(), mVar).mo1480l();
            return true;
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: androidx.appcompat.app.h$e */
    public class C0234e extends ActionBar.C0163e {

        /* renamed from: a */
        public Drawable f987a;

        /* renamed from: a */
        public View f988a;

        /* renamed from: a */
        public ActionBar.C0164f f989a;

        /* renamed from: a */
        public CharSequence f991a;

        /* renamed from: a */
        public Object f992a;

        /* renamed from: b */
        public int f993b = -1;

        /* renamed from: b */
        public CharSequence f994b;

        public C0234e() {
        }

        /* renamed from: a */
        public CharSequence mo774a() {
            return this.f994b;
        }

        /* renamed from: b */
        public View mo775b() {
            return this.f988a;
        }

        /* renamed from: c */
        public Drawable mo776c() {
            return this.f987a;
        }

        /* renamed from: d */
        public int mo777d() {
            return this.f993b;
        }

        /* renamed from: e */
        public Object mo778e() {
            return this.f992a;
        }

        /* renamed from: f */
        public CharSequence mo779f() {
            return this.f991a;
        }

        /* renamed from: g */
        public void mo780g() {
            C0229h.this.mo718S(this);
        }

        /* renamed from: h */
        public ActionBar.C0163e mo781h(int i) {
            return mo782i(C0229h.this.f949a.getResources().getText(i));
        }

        /* renamed from: i */
        public ActionBar.C0163e mo782i(CharSequence charSequence) {
            this.f994b = charSequence;
            int i = this.f993b;
            if (i >= 0) {
                C0229h.this.f956a.mo2116m(i);
            }
            return this;
        }

        /* renamed from: j */
        public ActionBar.C0163e mo783j(int i) {
            return mo784k(LayoutInflater.from(C0229h.this.mo696A()).inflate(i, (ViewGroup) null));
        }

        /* renamed from: k */
        public ActionBar.C0163e mo784k(View view) {
            this.f988a = view;
            int i = this.f993b;
            if (i >= 0) {
                C0229h.this.f956a.mo2116m(i);
            }
            return this;
        }

        /* renamed from: l */
        public ActionBar.C0163e mo785l(int i) {
            return mo786m(C3129p8.m24529b(C0229h.this.f949a, i));
        }

        /* renamed from: m */
        public ActionBar.C0163e mo786m(Drawable drawable) {
            this.f987a = drawable;
            int i = this.f993b;
            if (i >= 0) {
                C0229h.this.f956a.mo2116m(i);
            }
            return this;
        }

        /* renamed from: n */
        public ActionBar.C0163e mo787n(ActionBar.C0164f fVar) {
            this.f989a = fVar;
            return this;
        }

        /* renamed from: o */
        public ActionBar.C0163e mo788o(Object obj) {
            this.f992a = obj;
            return this;
        }

        /* renamed from: p */
        public ActionBar.C0163e mo789p(int i) {
            return mo790q(C0229h.this.f949a.getResources().getText(i));
        }

        /* renamed from: q */
        public ActionBar.C0163e mo790q(CharSequence charSequence) {
            this.f991a = charSequence;
            int i = this.f993b;
            if (i >= 0) {
                C0229h.this.f956a.mo2116m(i);
            }
            return this;
        }

        /* renamed from: r */
        public ActionBar.C0164f mo1168r() {
            return this.f989a;
        }

        /* renamed from: s */
        public void mo1169s(int i) {
            this.f993b = i;
        }
    }

    public C0229h(Activity activity, boolean z) {
        this.f948a = activity;
        View decorView = activity.getWindow().getDecorView();
        mo1138Q0(decorView);
        if (!z) {
            this.f950a = decorView.findViewById(16908290);
        }
    }

    public C0229h(Dialog dialog) {
        mo1138Q0(dialog.getWindow().getDecorView());
    }

    @hl3({hl3.C2354a.f13188c})
    public C0229h(View view) {
        mo1138Q0(view);
    }

    /* renamed from: F0 */
    public static boolean m1638F0(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: A */
    public Context mo696A() {
        if (this.f965b == null) {
            TypedValue typedValue = new TypedValue();
            this.f949a.getTheme().resolveAttribute(za3.C4057b.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f965b = new ContextThemeWrapper(this.f949a, i);
            } else {
                this.f965b = this.f949a;
            }
        }
        return this.f965b;
    }

    /* renamed from: A0 */
    public void mo697A0(CharSequence charSequence) {
        this.f957a.setTitle(charSequence);
    }

    /* renamed from: B */
    public CharSequence mo698B() {
        return this.f957a.getTitle();
    }

    /* renamed from: B0 */
    public void mo699B0(CharSequence charSequence) {
        this.f957a.setWindowTitle(charSequence);
    }

    /* renamed from: C */
    public void mo700C() {
        if (!this.f971e) {
            this.f971e = true;
            mo1142U0(false);
        }
    }

    /* renamed from: C0 */
    public void mo701C0() {
        if (this.f971e) {
            this.f971e = false;
            mo1142U0(false);
        }
    }

    /* renamed from: D0 */
    public C3563t2 mo703D0(C3563t2.C3564a aVar) {
        C0233d dVar = this.f951a;
        if (dVar != null) {
            dVar.mo1150c();
        }
        this.f955a.setHideOnContentScrollEnabled(false);
        this.f954a.mo1554t();
        C0233d dVar2 = new C0233d(this.f954a.getContext(), aVar);
        if (!dVar2.mo1164u()) {
            return null;
        }
        this.f951a = dVar2;
        dVar2.mo1156k();
        this.f954a.mo1544q(dVar2);
        mo1127E0(true);
        return dVar2;
    }

    /* renamed from: E */
    public boolean mo704E() {
        return this.f955a.mo1623y();
    }

    /* renamed from: E0 */
    public void mo1127E0(boolean z) {
        vu4 vu4;
        vu4 vu42;
        if (z) {
            mo1141T0();
        } else {
            mo1137P0();
        }
        if (mo1140S0()) {
            if (z) {
                vu4 = this.f957a.mo2546D(4, 100);
                vu42 = this.f954a.mo1536n(0, 200);
            } else {
                vu42 = this.f957a.mo2546D(0, 200);
                vu4 = this.f954a.mo1536n(8, 100);
            }
            wu4 wu4 = new wu4();
            wu4.mo26693d(vu4, vu42);
            wu4.mo26697h();
        } else if (z) {
            this.f957a.setVisibility(4);
            this.f954a.setVisibility(0);
        } else {
            this.f957a.setVisibility(0);
            this.f954a.setVisibility(8);
        }
    }

    /* renamed from: F */
    public boolean mo705F() {
        int r = mo754r();
        return this.f974h && (r == 0 || mo756s() < r);
    }

    /* renamed from: G */
    public boolean mo706G() {
        lg0 lg0 = this.f957a;
        return lg0 != null && lg0.mo2601v();
    }

    /* renamed from: G0 */
    public final void mo1128G0() {
        if (this.f952a != null) {
            mo718S((ActionBar.C0163e) null);
        }
        this.f963a.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.f956a;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.mo2114k();
        }
        this.f975i = -1;
    }

    /* renamed from: H */
    public ActionBar.C0163e mo707H() {
        return new C0234e();
    }

    /* renamed from: H0 */
    public void mo1129H0() {
        C3563t2.C3564a aVar = this.f958a;
        if (aVar != null) {
            aVar.mo1077d(this.f959a);
            this.f959a = null;
            this.f958a = null;
        }
    }

    /* renamed from: I */
    public void mo708I(Configuration configuration) {
        mo1139R0(C3222q2.m25257b(this.f949a).mo22811g());
    }

    /* renamed from: I0 */
    public final void mo1130I0(ActionBar.C0163e eVar, int i) {
        C0234e eVar2 = (C0234e) eVar;
        if (eVar2.mo1168r() != null) {
            eVar2.mo1169s(i);
            this.f963a.add(i, eVar2);
            int size = this.f963a.size();
            while (true) {
                i++;
                if (i < size) {
                    this.f963a.get(i).mo1169s(i);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    /* renamed from: J0 */
    public void mo1131J0(boolean z) {
        View view;
        wu4 wu4 = this.f960a;
        if (wu4 != null) {
            wu4.mo26690a();
        }
        if (this.f977j != 0 || (!this.f976i && !z)) {
            this.f961a.mo1068a((View) null);
            return;
        }
        this.f953a.setAlpha(1.0f);
        this.f953a.setTransitioning(true);
        wu4 wu42 = new wu4();
        float f = (float) (-this.f953a.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f953a.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        vu4 B = jt4.m18955g(this.f953a).mo26341B(f);
        B.mo26375x(this.f962a);
        wu42.mo26692c(B);
        if (this.f970d && (view = this.f950a) != null) {
            wu42.mo26692c(jt4.m18955g(view).mo26341B(f));
        }
        wu42.mo26695f(f943a);
        wu42.mo26694e(250);
        wu42.mo26696g(this.f961a);
        this.f960a = wu42;
        wu42.mo26697h();
    }

    /* renamed from: K */
    public boolean mo710K(int i, KeyEvent keyEvent) {
        Menu e;
        C0233d dVar = this.f951a;
        if (dVar == null || (e = dVar.mo1152e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: K0 */
    public void mo1132K0(boolean z) {
        View view;
        View view2;
        wu4 wu4 = this.f960a;
        if (wu4 != null) {
            wu4.mo26690a();
        }
        this.f953a.setVisibility(0);
        if (this.f977j != 0 || (!this.f976i && !z)) {
            this.f953a.setAlpha(1.0f);
            this.f953a.setTranslationY(0.0f);
            if (this.f970d && (view = this.f950a) != null) {
                view.setTranslationY(0.0f);
            }
            this.f966b.mo1068a((View) null);
        } else {
            this.f953a.setTranslationY(0.0f);
            float f = (float) (-this.f953a.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f953a.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f953a.setTranslationY(f);
            wu4 wu42 = new wu4();
            vu4 B = jt4.m18955g(this.f953a).mo26341B(0.0f);
            B.mo26375x(this.f962a);
            wu42.mo26692c(B);
            if (this.f970d && (view2 = this.f950a) != null) {
                view2.setTranslationY(f);
                wu42.mo26692c(jt4.m18955g(this.f950a).mo26341B(0.0f));
            }
            wu42.mo26695f(f946b);
            wu42.mo26694e(250);
            wu42.mo26696g(this.f966b);
            this.f960a = wu42;
            wu42.mo26697h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f955a;
        if (actionBarOverlayLayout != null) {
            jt4.m19017v1(actionBarOverlayLayout);
        }
    }

    /* renamed from: L0 */
    public final void mo1133L0() {
        if (this.f956a == null) {
            ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.f949a);
            if (this.f969c) {
                scrollingTabContainerView.setVisibility(0);
                this.f957a.mo2604y(scrollingTabContainerView);
            } else {
                if (mo760u() == 2) {
                    scrollingTabContainerView.setVisibility(0);
                    ActionBarOverlayLayout actionBarOverlayLayout = this.f955a;
                    if (actionBarOverlayLayout != null) {
                        jt4.m19017v1(actionBarOverlayLayout);
                    }
                } else {
                    scrollingTabContainerView.setVisibility(8);
                }
                this.f953a.setTabContainer(scrollingTabContainerView);
            }
            this.f956a = scrollingTabContainerView;
        }
    }

    /* renamed from: M0 */
    public final lg0 mo1134M0(View view) {
        if (view instanceof lg0) {
            return (lg0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: N */
    public void mo713N() {
        mo1128G0();
    }

    /* renamed from: N0 */
    public boolean mo1135N0() {
        return this.f957a.mo2573e();
    }

    /* renamed from: O */
    public void mo714O(ActionBar.C0161c cVar) {
        this.f967b.remove(cVar);
    }

    /* renamed from: O0 */
    public boolean mo1136O0() {
        return this.f957a.mo2574f();
    }

    /* renamed from: P */
    public void mo715P(ActionBar.C0163e eVar) {
        mo716Q(eVar.mo777d());
    }

    /* renamed from: P0 */
    public final void mo1137P0() {
        if (this.f973g) {
            this.f973g = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f955a;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            mo1142U0(false);
        }
    }

    /* renamed from: Q */
    public void mo716Q(int i) {
        if (this.f956a != null) {
            C0234e eVar = this.f952a;
            int d = eVar != null ? eVar.mo777d() : this.f975i;
            this.f956a.mo2115l(i);
            C0234e remove = this.f963a.remove(i);
            if (remove != null) {
                remove.mo1169s(-1);
            }
            int size = this.f963a.size();
            for (int i2 = i; i2 < size; i2++) {
                this.f963a.get(i2).mo1169s(i2);
            }
            if (d == i) {
                mo718S(this.f963a.isEmpty() ? null : this.f963a.get(Math.max(0, i - 1)));
            }
        }
    }

    /* renamed from: Q0 */
    public final void mo1138Q0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(za3.C4062g.decor_content_parent);
        this.f955a = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f957a = mo1134M0(view.findViewById(za3.C4062g.action_bar));
        this.f954a = (ActionBarContextView) view.findViewById(za3.C4062g.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(za3.C4062g.action_bar_container);
        this.f953a = actionBarContainer;
        lg0 lg0 = this.f957a;
        if (lg0 == null || this.f954a == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f949a = lg0.mo2569a();
        boolean z = (this.f957a.mo2561S() & 4) != 0;
        if (z) {
            this.f964a = true;
        }
        C3222q2 b = C3222q2.m25257b(this.f949a);
        mo745m0(b.mo22806a() || z);
        mo1139R0(b.mo22811g());
        TypedArray obtainStyledAttributes = this.f949a.obtainStyledAttributes((AttributeSet) null, za3.C4068m.ActionBar, za3.C4057b.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(za3.C4068m.ActionBar_hideOnContentScroll, false)) {
            mo735h0(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(za3.C4068m.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo731f0((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: R */
    public boolean mo717R() {
        ViewGroup r = this.f957a.mo2588r();
        if (r == null || r.hasFocus()) {
            return false;
        }
        r.requestFocus();
        return true;
    }

    /* renamed from: R0 */
    public final void mo1139R0(boolean z) {
        this.f969c = z;
        if (!z) {
            this.f957a.mo2604y((ScrollingTabContainerView) null);
            this.f953a.setTabContainer(this.f956a);
        } else {
            this.f953a.setTabContainer((ScrollingTabContainerView) null);
            this.f957a.mo2604y(this.f956a);
        }
        boolean z2 = true;
        boolean z3 = mo760u() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f956a;
        if (scrollingTabContainerView != null) {
            if (z3) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f955a;
                if (actionBarOverlayLayout != null) {
                    jt4.m19017v1(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f957a.mo2559Q(!this.f969c && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f955a;
        if (this.f969c || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: S */
    public void mo718S(ActionBar.C0163e eVar) {
        int i = -1;
        if (mo760u() != 2) {
            if (eVar != null) {
                i = eVar.mo777d();
            }
            this.f975i = i;
            return;
        }
        C0657l w = (!(this.f948a instanceof FragmentActivity) || this.f957a.mo2588r().isInEditMode()) ? null : ((FragmentActivity) this.f948a).mo4464v0().mo4611r().mo4872w();
        C0234e eVar2 = this.f952a;
        if (eVar2 != eVar) {
            ScrollingTabContainerView scrollingTabContainerView = this.f956a;
            if (eVar != null) {
                i = eVar.mo777d();
            }
            scrollingTabContainerView.setTabSelected(i);
            C0234e eVar3 = this.f952a;
            if (eVar3 != null) {
                eVar3.mo1168r().mo792b(this.f952a, w);
            }
            C0234e eVar4 = (C0234e) eVar;
            this.f952a = eVar4;
            if (eVar4 != null) {
                eVar4.mo1168r().mo791a(this.f952a, w);
            }
        } else if (eVar2 != null) {
            eVar2.mo1168r().mo793c(this.f952a, w);
            this.f956a.mo2106c(eVar.mo777d());
        }
        if (w != null && !w.mo4708A()) {
            w.mo4726q();
        }
    }

    /* renamed from: S0 */
    public final boolean mo1140S0() {
        return jt4.m18914U0(this.f953a);
    }

    /* renamed from: T */
    public void mo719T(Drawable drawable) {
        this.f953a.setPrimaryBackground(drawable);
    }

    /* renamed from: T0 */
    public final void mo1141T0() {
        if (!this.f973g) {
            this.f973g = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f955a;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            mo1142U0(false);
        }
    }

    /* renamed from: U */
    public void mo720U(int i) {
        mo721V(LayoutInflater.from(mo696A()).inflate(i, this.f957a.mo2588r(), false));
    }

    /* renamed from: U0 */
    public final void mo1142U0(boolean z) {
        if (m1638F0(this.f971e, this.f972f, this.f973g)) {
            if (!this.f974h) {
                this.f974h = true;
                mo1132K0(z);
            }
        } else if (this.f974h) {
            this.f974h = false;
            mo1131J0(z);
        }
    }

    /* renamed from: V */
    public void mo721V(View view) {
        this.f957a.mo2549G(view);
    }

    /* renamed from: W */
    public void mo722W(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f957a.mo2549G(view);
    }

    /* renamed from: X */
    public void mo723X(boolean z) {
        if (!this.f964a) {
            mo724Y(z);
        }
    }

    /* renamed from: Y */
    public void mo724Y(boolean z) {
        mo726a0(z ? 4 : 0, 4);
    }

    /* renamed from: Z */
    public void mo725Z(int i) {
        if ((i & 4) != 0) {
            this.f964a = true;
        }
        this.f957a.mo2562T(i);
    }

    /* renamed from: a */
    public void mo1143a() {
    }

    /* renamed from: a0 */
    public void mo726a0(int i, int i2) {
        int S = this.f957a.mo2561S();
        if ((i2 & 4) != 0) {
            this.f964a = true;
        }
        this.f957a.mo2562T((i & i2) | ((~i2) & S));
    }

    /* renamed from: b */
    public void mo1144b(int i) {
        this.f977j = i;
    }

    /* renamed from: b0 */
    public void mo727b0(boolean z) {
        mo726a0(z ? 16 : 0, 16);
    }

    /* renamed from: c */
    public void mo1145c(boolean z) {
        this.f970d = z;
    }

    /* renamed from: c0 */
    public void mo728c0(boolean z) {
        mo726a0(z ? 2 : 0, 2);
    }

    /* renamed from: d */
    public void mo1146d() {
        wu4 wu4 = this.f960a;
        if (wu4 != null) {
            wu4.mo26690a();
            this.f960a = null;
        }
    }

    /* renamed from: d0 */
    public void mo729d0(boolean z) {
        mo726a0(z ? 8 : 0, 8);
    }

    /* renamed from: e */
    public void mo1147e() {
        if (!this.f972f) {
            this.f972f = true;
            mo1142U0(true);
        }
    }

    /* renamed from: e0 */
    public void mo730e0(boolean z) {
        mo726a0(z ? 1 : 0, 1);
    }

    /* renamed from: f */
    public void mo1148f() {
        if (this.f972f) {
            this.f972f = false;
            mo1142U0(true);
        }
    }

    /* renamed from: f0 */
    public void mo731f0(float f) {
        jt4.m18894N1(this.f953a, f);
    }

    /* renamed from: g */
    public void mo732g(ActionBar.C0161c cVar) {
        this.f967b.add(cVar);
    }

    /* renamed from: g0 */
    public void mo733g0(int i) {
        if (i == 0 || this.f955a.mo1624z()) {
            this.f955a.setActionBarHideOffset(i);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
    }

    /* renamed from: h */
    public void mo734h(ActionBar.C0163e eVar) {
        mo740k(eVar, this.f963a.isEmpty());
    }

    /* renamed from: h0 */
    public void mo735h0(boolean z) {
        if (!z || this.f955a.mo1624z()) {
            this.f978j = z;
            this.f955a.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: i */
    public void mo736i(ActionBar.C0163e eVar, int i) {
        mo738j(eVar, i, this.f963a.isEmpty());
    }

    /* renamed from: i0 */
    public void mo737i0(int i) {
        this.f957a.mo2582l(i);
    }

    /* renamed from: j */
    public void mo738j(ActionBar.C0163e eVar, int i, boolean z) {
        mo1133L0();
        this.f956a.mo2104a(eVar, i, z);
        mo1130I0(eVar, i);
        if (z) {
            mo718S(eVar);
        }
    }

    /* renamed from: j0 */
    public void mo739j0(CharSequence charSequence) {
        this.f957a.mo2547E(charSequence);
    }

    /* renamed from: k */
    public void mo740k(ActionBar.C0163e eVar, boolean z) {
        mo1133L0();
        this.f956a.mo2105b(eVar, z);
        mo1130I0(eVar, this.f963a.size());
        if (z) {
            mo718S(eVar);
        }
    }

    /* renamed from: k0 */
    public void mo741k0(int i) {
        this.f957a.mo2552J(i);
    }

    /* renamed from: l0 */
    public void mo743l0(Drawable drawable) {
        this.f957a.mo2587q(drawable);
    }

    /* renamed from: m */
    public boolean mo744m() {
        lg0 lg0 = this.f957a;
        if (lg0 == null || !lg0.mo2580j()) {
            return false;
        }
        this.f957a.mo2603x();
        return true;
    }

    /* renamed from: m0 */
    public void mo745m0(boolean z) {
        this.f957a.mo2600u(z);
    }

    /* renamed from: n */
    public void mo746n(boolean z) {
        if (z != this.f968b) {
            this.f968b = z;
            int size = this.f967b.size();
            for (int i = 0; i < size; i++) {
                this.f967b.get(i).mo772a(z);
            }
        }
    }

    /* renamed from: n0 */
    public void mo747n0(int i) {
        this.f957a.setIcon(i);
    }

    /* renamed from: o */
    public View mo748o() {
        return this.f957a.mo2602w();
    }

    /* renamed from: o0 */
    public void mo749o0(Drawable drawable) {
        this.f957a.setIcon(drawable);
    }

    /* renamed from: p */
    public int mo750p() {
        return this.f957a.mo2561S();
    }

    /* renamed from: p0 */
    public void mo751p0(SpinnerAdapter spinnerAdapter, ActionBar.C0162d dVar) {
        this.f957a.mo2599t(spinnerAdapter, new C0222f(dVar));
    }

    /* renamed from: q */
    public float mo752q() {
        return jt4.m18904R(this.f953a);
    }

    /* renamed from: q0 */
    public void mo753q0(int i) {
        this.f957a.setLogo(i);
    }

    /* renamed from: r */
    public int mo754r() {
        return this.f953a.getHeight();
    }

    /* renamed from: r0 */
    public void mo755r0(Drawable drawable) {
        this.f957a.mo2548F(drawable);
    }

    /* renamed from: s */
    public int mo756s() {
        return this.f955a.getActionBarHideOffset();
    }

    /* renamed from: s0 */
    public void mo757s0(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int K = this.f957a.mo2553K();
        if (K == 2) {
            this.f975i = mo762v();
            mo718S((ActionBar.C0163e) null);
            this.f956a.setVisibility(8);
        }
        if (!(K == i || this.f969c || (actionBarOverlayLayout = this.f955a) == null)) {
            jt4.m19017v1(actionBarOverlayLayout);
        }
        this.f957a.mo2589s(i);
        boolean z = false;
        if (i == 2) {
            mo1133L0();
            this.f956a.setVisibility(0);
            int i2 = this.f975i;
            if (i2 != -1) {
                mo759t0(i2);
                this.f975i = -1;
            }
        }
        this.f957a.mo2559Q(i == 2 && !this.f969c);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f955a;
        if (i == 2 && !this.f969c) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    /* renamed from: t */
    public int mo758t() {
        int K = this.f957a.mo2553K();
        if (K == 1) {
            return this.f957a.mo2585o();
        }
        if (K != 2) {
            return 0;
        }
        return this.f963a.size();
    }

    /* renamed from: t0 */
    public void mo759t0(int i) {
        int K = this.f957a.mo2553K();
        if (K == 1) {
            this.f957a.mo2583m(i);
        } else if (K == 2) {
            mo718S(this.f963a.get(i));
        } else {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    /* renamed from: u */
    public int mo760u() {
        return this.f957a.mo2553K();
    }

    /* renamed from: u0 */
    public void mo761u0(boolean z) {
        wu4 wu4;
        this.f976i = z;
        if (!z && (wu4 = this.f960a) != null) {
            wu4.mo26690a();
        }
    }

    /* renamed from: v */
    public int mo762v() {
        C0234e eVar;
        int K = this.f957a.mo2553K();
        if (K == 1) {
            return this.f957a.mo2551I();
        }
        if (K == 2 && (eVar = this.f952a) != null) {
            return eVar.mo777d();
        }
        return -1;
    }

    /* renamed from: v0 */
    public void mo763v0(Drawable drawable) {
    }

    /* renamed from: w */
    public ActionBar.C0163e mo764w() {
        return this.f952a;
    }

    /* renamed from: w0 */
    public void mo765w0(Drawable drawable) {
        this.f953a.setStackedBackground(drawable);
    }

    /* renamed from: x */
    public CharSequence mo766x() {
        return this.f957a.mo2543A();
    }

    /* renamed from: x0 */
    public void mo767x0(int i) {
        mo769y0(this.f949a.getString(i));
    }

    /* renamed from: y */
    public ActionBar.C0163e mo768y(int i) {
        return this.f963a.get(i);
    }

    /* renamed from: y0 */
    public void mo769y0(CharSequence charSequence) {
        this.f957a.mo2581k(charSequence);
    }

    /* renamed from: z */
    public int mo770z() {
        return this.f963a.size();
    }

    /* renamed from: z0 */
    public void mo771z0(int i) {
        mo697A0(this.f949a.getString(i));
    }
}
