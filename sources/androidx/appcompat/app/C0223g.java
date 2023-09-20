package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.C0193e;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.widget.C0372e;
import androidx.appcompat.widget.Toolbar;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.lg0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.g */
public class C0223g extends ActionBar {

    /* renamed from: a */
    public final Window.Callback f927a;

    /* renamed from: a */
    public final C0193e.C0203i f928a;

    /* renamed from: a */
    public final Toolbar.C0344e f929a;

    /* renamed from: a */
    public final lg0 f930a;

    /* renamed from: a */
    public final Runnable f931a = new C0224a();

    /* renamed from: a */
    public ArrayList<ActionBar.C0161c> f932a = new ArrayList<>();

    /* renamed from: a */
    public boolean f933a;

    /* renamed from: b */
    public boolean f934b;

    /* renamed from: c */
    public boolean f935c;

    /* renamed from: androidx.appcompat.app.g$a */
    public class C0224a implements Runnable {
        public C0224a() {
        }

        public void run() {
            C0223g.this.mo1124F0();
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    public class C0225b implements Toolbar.C0344e {
        public C0225b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0223g.this.f927a.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.g$c */
    public final class C0226c implements C0258j.C0259a {

        /* renamed from: b */
        public boolean f939b;

        public C0226c() {
        }

        /* renamed from: b */
        public void mo1072b(@mr2 C0248e eVar, boolean z) {
            if (!this.f939b) {
                this.f939b = true;
                C0223g.this.f930a.mo2586p();
                C0223g.this.f927a.onPanelClosed(108, eVar);
                this.f939b = false;
            }
        }

        /* renamed from: c */
        public boolean mo1073c(@mr2 C0248e eVar) {
            C0223g.this.f927a.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.g$d */
    public final class C0227d implements C0248e.C0249a {
        public C0227d() {
        }

        /* renamed from: a */
        public void mo1031a(@mr2 C0248e eVar) {
            if (C0223g.this.f930a.mo2571c()) {
                C0223g.this.f927a.onPanelClosed(108, eVar);
            } else if (C0223g.this.f927a.onPreparePanel(0, (View) null, eVar)) {
                C0223g.this.f927a.onMenuOpened(108, eVar);
            }
        }

        /* renamed from: b */
        public boolean mo1033b(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.app.g$e */
    public class C0228e implements C0193e.C0203i {
        public C0228e() {
        }

        /* renamed from: a */
        public boolean mo1070a(int i) {
            if (i != 0) {
                return false;
            }
            C0223g gVar = C0223g.this;
            if (gVar.f933a) {
                return false;
            }
            gVar.f930a.setMenuPrepared();
            C0223g.this.f933a = true;
            return false;
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0223g.this.f930a.mo2569a());
            }
            return null;
        }
    }

    public C0223g(@mr2 Toolbar toolbar, @ts2 CharSequence charSequence, @mr2 Window.Callback callback) {
        C0225b bVar = new C0225b();
        this.f929a = bVar;
        k43.m19455l(toolbar);
        C0372e eVar = new C0372e(toolbar, false);
        this.f930a = eVar;
        this.f927a = (Window.Callback) k43.m19455l(callback);
        eVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        eVar.setWindowTitle(charSequence);
        this.f928a = new C0228e();
    }

    /* renamed from: A */
    public Context mo696A() {
        return this.f930a.mo2569a();
    }

    /* renamed from: A0 */
    public void mo697A0(CharSequence charSequence) {
        this.f930a.setTitle(charSequence);
    }

    /* renamed from: B */
    public CharSequence mo698B() {
        return this.f930a.getTitle();
    }

    /* renamed from: B0 */
    public void mo699B0(CharSequence charSequence) {
        this.f930a.setWindowTitle(charSequence);
    }

    /* renamed from: C */
    public void mo700C() {
        this.f930a.setVisibility(8);
    }

    /* renamed from: C0 */
    public void mo701C0() {
        this.f930a.setVisibility(0);
    }

    /* renamed from: D */
    public boolean mo702D() {
        this.f930a.mo2588r().removeCallbacks(this.f931a);
        jt4.m18993p1(this.f930a.mo2588r(), this.f931a);
        return true;
    }

    /* renamed from: E0 */
    public final Menu mo1123E0() {
        if (!this.f934b) {
            this.f930a.mo2556N(new C0226c(), new C0227d());
            this.f934b = true;
        }
        return this.f930a.mo2605z();
    }

    /* renamed from: F */
    public boolean mo705F() {
        return this.f930a.mo2560R() == 0;
    }

    /* renamed from: F0 */
    public void mo1124F0() {
        Menu E0 = mo1123E0();
        C0248e eVar = E0 instanceof C0248e ? (C0248e) E0 : null;
        if (eVar != null) {
            eVar.mo1351m0();
        }
        try {
            E0.clear();
            if (!this.f927a.onCreatePanelMenu(0, E0) || !this.f927a.onPreparePanel(0, (View) null, E0)) {
                E0.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.mo1349l0();
            }
        }
    }

    /* renamed from: G */
    public boolean mo706G() {
        return super.mo706G();
    }

    /* renamed from: H */
    public ActionBar.C0163e mo707H() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: I */
    public void mo708I(Configuration configuration) {
        super.mo708I(configuration);
    }

    /* renamed from: J */
    public void mo709J() {
        this.f930a.mo2588r().removeCallbacks(this.f931a);
    }

    /* renamed from: K */
    public boolean mo710K(int i, KeyEvent keyEvent) {
        Menu E0 = mo1123E0();
        if (E0 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        E0.setQwertyMode(z);
        return E0.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: L */
    public boolean mo711L(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo712M();
        }
        return true;
    }

    /* renamed from: M */
    public boolean mo712M() {
        return this.f930a.mo2578h();
    }

    /* renamed from: N */
    public void mo713N() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: O */
    public void mo714O(ActionBar.C0161c cVar) {
        this.f932a.remove(cVar);
    }

    /* renamed from: P */
    public void mo715P(ActionBar.C0163e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: Q */
    public void mo716Q(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: R */
    public boolean mo717R() {
        ViewGroup r = this.f930a.mo2588r();
        if (r == null || r.hasFocus()) {
            return false;
        }
        r.requestFocus();
        return true;
    }

    /* renamed from: S */
    public void mo718S(ActionBar.C0163e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: T */
    public void mo719T(@ts2 Drawable drawable) {
        this.f930a.mo2570b(drawable);
    }

    /* renamed from: U */
    public void mo720U(int i) {
        mo721V(LayoutInflater.from(this.f930a.mo2569a()).inflate(i, this.f930a.mo2588r(), false));
    }

    /* renamed from: V */
    public void mo721V(View view) {
        mo722W(view, new ActionBar.LayoutParams(-2, -2));
    }

    /* renamed from: W */
    public void mo722W(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.f930a.mo2549G(view);
    }

    /* renamed from: X */
    public void mo723X(boolean z) {
    }

    /* renamed from: Y */
    public void mo724Y(boolean z) {
        mo726a0(z ? 4 : 0, 4);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: Z */
    public void mo725Z(int i) {
        mo726a0(i, -1);
    }

    /* renamed from: a0 */
    public void mo726a0(int i, int i2) {
        this.f930a.mo2562T((i & i2) | ((~i2) & this.f930a.mo2561S()));
    }

    /* renamed from: b0 */
    public void mo727b0(boolean z) {
        mo726a0(z ? 16 : 0, 16);
    }

    /* renamed from: c0 */
    public void mo728c0(boolean z) {
        mo726a0(z ? 2 : 0, 2);
    }

    /* renamed from: d0 */
    public void mo729d0(boolean z) {
        mo726a0(z ? 8 : 0, 8);
    }

    /* renamed from: e0 */
    public void mo730e0(boolean z) {
        mo726a0(z ? 1 : 0, 1);
    }

    /* renamed from: f0 */
    public void mo731f0(float f) {
        jt4.m18894N1(this.f930a.mo2588r(), f);
    }

    /* renamed from: g */
    public void mo732g(ActionBar.C0161c cVar) {
        this.f932a.add(cVar);
    }

    /* renamed from: h */
    public void mo734h(ActionBar.C0163e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: i */
    public void mo736i(ActionBar.C0163e eVar, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: i0 */
    public void mo737i0(int i) {
        this.f930a.mo2582l(i);
    }

    /* renamed from: j */
    public void mo738j(ActionBar.C0163e eVar, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: j0 */
    public void mo739j0(CharSequence charSequence) {
        this.f930a.mo2547E(charSequence);
    }

    /* renamed from: k */
    public void mo740k(ActionBar.C0163e eVar, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: k0 */
    public void mo741k0(int i) {
        this.f930a.mo2552J(i);
    }

    /* renamed from: l */
    public boolean mo742l() {
        return this.f930a.mo2572d();
    }

    /* renamed from: l0 */
    public void mo743l0(Drawable drawable) {
        this.f930a.mo2587q(drawable);
    }

    /* renamed from: m */
    public boolean mo744m() {
        if (!this.f930a.mo2580j()) {
            return false;
        }
        this.f930a.mo2603x();
        return true;
    }

    /* renamed from: m0 */
    public void mo745m0(boolean z) {
    }

    /* renamed from: n */
    public void mo746n(boolean z) {
        if (z != this.f935c) {
            this.f935c = z;
            int size = this.f932a.size();
            for (int i = 0; i < size; i++) {
                this.f932a.get(i).mo772a(z);
            }
        }
    }

    /* renamed from: n0 */
    public void mo747n0(int i) {
        this.f930a.setIcon(i);
    }

    /* renamed from: o */
    public View mo748o() {
        return this.f930a.mo2602w();
    }

    /* renamed from: o0 */
    public void mo749o0(Drawable drawable) {
        this.f930a.setIcon(drawable);
    }

    /* renamed from: p */
    public int mo750p() {
        return this.f930a.mo2561S();
    }

    /* renamed from: p0 */
    public void mo751p0(SpinnerAdapter spinnerAdapter, ActionBar.C0162d dVar) {
        this.f930a.mo2599t(spinnerAdapter, new C0222f(dVar));
    }

    /* renamed from: q */
    public float mo752q() {
        return jt4.m18904R(this.f930a.mo2588r());
    }

    /* renamed from: q0 */
    public void mo753q0(int i) {
        this.f930a.setLogo(i);
    }

    /* renamed from: r */
    public int mo754r() {
        return this.f930a.getHeight();
    }

    /* renamed from: r0 */
    public void mo755r0(Drawable drawable) {
        this.f930a.mo2548F(drawable);
    }

    /* renamed from: s0 */
    public void mo757s0(int i) {
        if (i != 2) {
            this.f930a.mo2589s(i);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    /* renamed from: t */
    public int mo758t() {
        return 0;
    }

    /* renamed from: t0 */
    public void mo759t0(int i) {
        if (this.f930a.mo2553K() == 1) {
            this.f930a.mo2583m(i);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    /* renamed from: u */
    public int mo760u() {
        return 0;
    }

    /* renamed from: u0 */
    public void mo761u0(boolean z) {
    }

    /* renamed from: v */
    public int mo762v() {
        return -1;
    }

    /* renamed from: v0 */
    public void mo763v0(Drawable drawable) {
    }

    /* renamed from: w */
    public ActionBar.C0163e mo764w() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: w0 */
    public void mo765w0(Drawable drawable) {
    }

    /* renamed from: x */
    public CharSequence mo766x() {
        return this.f930a.mo2543A();
    }

    /* renamed from: x0 */
    public void mo767x0(int i) {
        lg0 lg0 = this.f930a;
        lg0.mo2581k(i != 0 ? lg0.mo2569a().getText(i) : null);
    }

    /* renamed from: y */
    public ActionBar.C0163e mo768y(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: y0 */
    public void mo769y0(CharSequence charSequence) {
        this.f930a.mo2581k(charSequence);
    }

    /* renamed from: z */
    public int mo770z() {
        return 0;
    }

    /* renamed from: z0 */
    public void mo771z0(int i) {
        lg0 lg0 = this.f930a;
        lg0.setTitle(i != 0 ? lg0.mo2569a().getText(i) : null);
    }
}
