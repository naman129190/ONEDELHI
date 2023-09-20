package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.widget.MenuPopupWindow;
import com.onedelhi.secure.ih2;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.za3;

/* renamed from: androidx.appcompat.view.menu.l */
public final class C0262l extends ih2 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0258j, View.OnKeyListener {

    /* renamed from: s */
    public static final int f1190s = za3.C4065j.abc_popup_menu_item_layout;

    /* renamed from: a */
    public final Context f1191a;

    /* renamed from: a */
    public final View.OnAttachStateChangeListener f1192a = new C0264b();

    /* renamed from: a */
    public View f1193a;

    /* renamed from: a */
    public final ViewTreeObserver.OnGlobalLayoutListener f1194a = new C0263a();

    /* renamed from: a */
    public ViewTreeObserver f1195a;

    /* renamed from: a */
    public PopupWindow.OnDismissListener f1196a;

    /* renamed from: a */
    public final C0247d f1197a;

    /* renamed from: a */
    public final C0248e f1198a;

    /* renamed from: a */
    public C0258j.C0259a f1199a;

    /* renamed from: a */
    public final MenuPopupWindow f1200a;

    /* renamed from: b */
    public View f1201b;

    /* renamed from: b */
    public final boolean f1202b;

    /* renamed from: c */
    public boolean f1203c;

    /* renamed from: d */
    public boolean f1204d;

    /* renamed from: e */
    public boolean f1205e;

    /* renamed from: n */
    public final int f1206n;

    /* renamed from: o */
    public final int f1207o;

    /* renamed from: p */
    public final int f1208p;

    /* renamed from: q */
    public int f1209q;

    /* renamed from: r */
    public int f1210r = 0;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    public class C0263a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0263a() {
        }

        public void onGlobalLayout() {
            if (C0262l.this.mo1238c() && !C0262l.this.f1200a.mo2031L()) {
                View view = C0262l.this.f1201b;
                if (view == null || !view.isShown()) {
                    C0262l.this.dismiss();
                } else {
                    C0262l.this.f1200a.mo1237a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    public class C0264b implements View.OnAttachStateChangeListener {
        public C0264b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0262l.this.f1195a;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0262l.this.f1195a = view.getViewTreeObserver();
                }
                C0262l lVar = C0262l.this;
                lVar.f1195a.removeGlobalOnLayoutListener(lVar.f1194a);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0262l(Context context, C0248e eVar, View view, int i, int i2, boolean z) {
        this.f1191a = context;
        this.f1198a = eVar;
        this.f1202b = z;
        this.f1197a = new C0247d(eVar, LayoutInflater.from(context), z, f1190s);
        this.f1207o = i;
        this.f1208p = i2;
        Resources resources = context.getResources();
        this.f1206n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(za3.C4060e.abc_config_prefDialogWidth));
        this.f1193a = view;
        this.f1200a = new MenuPopupWindow(context, (AttributeSet) null, i, i2);
        eVar.mo1323c(this, context);
    }

    /* renamed from: C */
    public final boolean mo1487C() {
        View view;
        if (mo1238c()) {
            return true;
        }
        if (this.f1203c || (view = this.f1193a) == null) {
            return false;
        }
        this.f1201b = view;
        this.f1200a.mo2052e0(this);
        this.f1200a.mo2053f0(this);
        this.f1200a.mo2051d0(true);
        View view2 = this.f1201b;
        boolean z = this.f1195a == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1195a = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1194a);
        }
        view2.addOnAttachStateChangeListener(this.f1192a);
        this.f1200a.mo2038S(view2);
        this.f1200a.mo2042W(this.f1210r);
        if (!this.f1204d) {
            this.f1209q = ih2.m17527r(this.f1197a, (ViewGroup) null, this.f1191a, this.f1206n);
            this.f1204d = true;
        }
        this.f1200a.mo2040U(this.f1209q);
        this.f1200a.mo2046a0(2);
        this.f1200a.mo2043X(mo17764q());
        this.f1200a.mo1237a();
        ListView l = this.f1200a.mo1241l();
        l.setOnKeyListener(this);
        if (this.f1205e && this.f1198a.mo1285A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1191a).inflate(za3.C4065j.abc_popup_menu_header_item_layout, l, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1198a.mo1285A());
            }
            frameLayout.setEnabled(false);
            l.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1200a.mo1884e(this.f1197a);
        this.f1200a.mo1237a();
        return true;
    }

    /* renamed from: a */
    public void mo1237a() {
        if (!mo1487C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public void mo1212b(C0248e eVar, boolean z) {
        if (eVar == this.f1198a) {
            dismiss();
            C0258j.C0259a aVar = this.f1199a;
            if (aVar != null) {
                aVar.mo1072b(eVar, z);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1238c() {
        return !this.f1203c && this.f1200a.mo1238c();
    }

    /* renamed from: d */
    public void mo1214d(boolean z) {
        this.f1204d = false;
        C0247d dVar = this.f1197a;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public void dismiss() {
        if (mo1238c()) {
            this.f1200a.dismiss();
        }
    }

    /* renamed from: e */
    public boolean mo1215e() {
        return false;
    }

    /* renamed from: h */
    public boolean mo1219h(C0265m mVar) {
        if (mVar.hasVisibleItems()) {
            C0255i iVar = new C0255i(this.f1191a, mVar, this.f1201b, this.f1202b, this.f1207o, this.f1208p);
            iVar.mo1380a(this.f1199a);
            iVar.mo1477i(ih2.m17525A(mVar));
            iVar.mo1479k(this.f1196a);
            this.f1196a = null;
            this.f1198a.mo1332f(false);
            int d = this.f1200a.mo2050d();
            int o = this.f1200a.mo2064o();
            if ((Gravity.getAbsoluteGravity(this.f1210r, jt4.m18928Z(this.f1193a)) & 7) == 5) {
                d += this.f1193a.getWidth();
            }
            if (iVar.mo1484p(d, o)) {
                C0258j.C0259a aVar = this.f1199a;
                if (aVar == null) {
                    return true;
                }
                aVar.mo1073c(mVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public Parcelable mo1240i() {
        return null;
    }

    /* renamed from: j */
    public void mo1220j(C0258j.C0259a aVar) {
        this.f1199a = aVar;
    }

    /* renamed from: l */
    public ListView mo1241l() {
        return this.f1200a.mo1241l();
    }

    /* renamed from: n */
    public void mo1242n(Parcelable parcelable) {
    }

    /* renamed from: o */
    public void mo1243o(C0248e eVar) {
    }

    public void onDismiss() {
        this.f1203c = true;
        this.f1198a.close();
        ViewTreeObserver viewTreeObserver = this.f1195a;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1195a = this.f1201b.getViewTreeObserver();
            }
            this.f1195a.removeGlobalOnLayoutListener(this.f1194a);
            this.f1195a = null;
        }
        this.f1201b.removeOnAttachStateChangeListener(this.f1192a);
        PopupWindow.OnDismissListener onDismissListener = this.f1196a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: s */
    public void mo1247s(View view) {
        this.f1193a = view;
    }

    /* renamed from: u */
    public void mo1248u(boolean z) {
        this.f1197a.mo1279e(z);
    }

    /* renamed from: v */
    public void mo1249v(int i) {
        this.f1210r = i;
    }

    /* renamed from: w */
    public void mo1250w(int i) {
        this.f1200a.mo2061m(i);
    }

    /* renamed from: x */
    public void mo1251x(PopupWindow.OnDismissListener onDismissListener) {
        this.f1196a = onDismissListener;
    }

    /* renamed from: y */
    public void mo1252y(boolean z) {
        this.f1205e = z;
    }

    /* renamed from: z */
    public void mo1253z(int i) {
        this.f1200a.mo2066q(i);
    }
}
