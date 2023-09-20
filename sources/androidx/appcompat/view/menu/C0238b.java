package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.widget.MenuPopupWindow;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.fh2;
import com.onedelhi.secure.ih2;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.appcompat.view.menu.b */
public final class C0238b extends ih2 implements C0258j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: v */
    public static final int f1040v = za3.C4065j.abc_cascading_menu_item_layout;

    /* renamed from: w */
    public static final int f1041w = 0;

    /* renamed from: x */
    public static final int f1042x = 1;

    /* renamed from: y */
    public static final int f1043y = 200;

    /* renamed from: a */
    public final Context f1044a;

    /* renamed from: a */
    public final Handler f1045a;

    /* renamed from: a */
    public final View.OnAttachStateChangeListener f1046a = new C0240b();

    /* renamed from: a */
    public View f1047a;

    /* renamed from: a */
    public final ViewTreeObserver.OnGlobalLayoutListener f1048a = new C0239a();

    /* renamed from: a */
    public ViewTreeObserver f1049a;

    /* renamed from: a */
    public PopupWindow.OnDismissListener f1050a;

    /* renamed from: a */
    public C0258j.C0259a f1051a;

    /* renamed from: a */
    public final fh2 f1052a = new C0241c();

    /* renamed from: a */
    public final List<C0248e> f1053a = new ArrayList();

    /* renamed from: b */
    public View f1054b;

    /* renamed from: b */
    public final List<C0243d> f1055b = new ArrayList();

    /* renamed from: b */
    public final boolean f1056b;

    /* renamed from: c */
    public boolean f1057c;

    /* renamed from: d */
    public boolean f1058d;

    /* renamed from: e */
    public boolean f1059e;

    /* renamed from: f */
    public boolean f1060f;

    /* renamed from: g */
    public boolean f1061g;

    /* renamed from: n */
    public final int f1062n;

    /* renamed from: o */
    public final int f1063o;

    /* renamed from: p */
    public final int f1064p;

    /* renamed from: q */
    public int f1065q = 0;

    /* renamed from: r */
    public int f1066r = 0;

    /* renamed from: s */
    public int f1067s;

    /* renamed from: t */
    public int f1068t;

    /* renamed from: u */
    public int f1069u;

    /* renamed from: androidx.appcompat.view.menu.b$a */
    public class C0239a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0239a() {
        }

        public void onGlobalLayout() {
            if (C0238b.this.mo1238c() && C0238b.this.f1055b.size() > 0 && !C0238b.this.f1055b.get(0).f1079a.mo2031L()) {
                View view = C0238b.this.f1054b;
                if (view == null || !view.isShown()) {
                    C0238b.this.dismiss();
                    return;
                }
                for (C0243d dVar : C0238b.this.f1055b) {
                    dVar.f1079a.mo1237a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    public class C0240b implements View.OnAttachStateChangeListener {
        public C0240b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0238b.this.f1049a;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0238b.this.f1049a = view.getViewTreeObserver();
                }
                C0238b bVar = C0238b.this;
                bVar.f1049a.removeGlobalOnLayoutListener(bVar.f1048a);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    public class C0241c implements fh2 {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        public class C0242a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ MenuItem f1073a;

            /* renamed from: a */
            public final /* synthetic */ C0243d f1075a;

            /* renamed from: a */
            public final /* synthetic */ C0248e f1076a;

            public C0242a(C0243d dVar, MenuItem menuItem, C0248e eVar) {
                this.f1075a = dVar;
                this.f1073a = menuItem;
                this.f1076a = eVar;
            }

            public void run() {
                C0243d dVar = this.f1075a;
                if (dVar != null) {
                    C0238b.this.f1061g = true;
                    dVar.f1078a.mo1332f(false);
                    C0238b.this.f1061g = false;
                }
                if (this.f1073a.isEnabled() && this.f1073a.hasSubMenu()) {
                    this.f1076a.mo1298O(this.f1073a, 4);
                }
            }
        }

        public C0241c() {
        }

        /* renamed from: k */
        public void mo1257k(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
            C0243d dVar = null;
            C0238b.this.f1045a.removeCallbacksAndMessages((Object) null);
            int size = C0238b.this.f1055b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == C0238b.this.f1055b.get(i).f1078a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0238b.this.f1055b.size()) {
                    dVar = C0238b.this.f1055b.get(i2);
                }
                C0238b.this.f1045a.postAtTime(new C0242a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: p */
        public void mo1258p(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
            C0238b.this.f1045a.removeCallbacksAndMessages(eVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    public static class C0243d {

        /* renamed from: a */
        public final int f1077a;

        /* renamed from: a */
        public final C0248e f1078a;

        /* renamed from: a */
        public final MenuPopupWindow f1079a;

        public C0243d(@mr2 MenuPopupWindow menuPopupWindow, @mr2 C0248e eVar, int i) {
            this.f1079a = menuPopupWindow;
            this.f1078a = eVar;
            this.f1077a = i;
        }

        /* renamed from: a */
        public ListView mo1260a() {
            return this.f1079a.mo1241l();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.view.menu.b$e */
    public @interface C0244e {
    }

    public C0238b(@mr2 Context context, @mr2 View view, @C3982yb int i, @e64 int i2, boolean z) {
        this.f1044a = context;
        this.f1047a = view;
        this.f1063o = i;
        this.f1064p = i2;
        this.f1056b = z;
        this.f1059e = false;
        this.f1067s = mo1234G();
        Resources resources = context.getResources();
        this.f1062n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(za3.C4060e.abc_config_prefDialogWidth));
        this.f1045a = new Handler();
    }

    /* renamed from: C */
    public final MenuPopupWindow mo1230C() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f1044a, (AttributeSet) null, this.f1063o, this.f1064p);
        menuPopupWindow.mo2089r0(this.f1052a);
        menuPopupWindow.mo2053f0(this);
        menuPopupWindow.mo2052e0(this);
        menuPopupWindow.mo2038S(this.f1047a);
        menuPopupWindow.mo2042W(this.f1066r);
        menuPopupWindow.mo2051d0(true);
        menuPopupWindow.mo2046a0(2);
        return menuPopupWindow;
    }

    /* renamed from: D */
    public final int mo1231D(@mr2 C0248e eVar) {
        int size = this.f1055b.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.f1055b.get(i).f1078a) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E */
    public final MenuItem mo1232E(@mr2 C0248e eVar, @mr2 C0248e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @ts2
    /* renamed from: F */
    public final View mo1233F(@mr2 C0243d dVar, @mr2 C0248e eVar) {
        int i;
        C0247d dVar2;
        int firstVisiblePosition;
        MenuItem E = mo1232E(dVar.f1078a, eVar);
        if (E == null) {
            return null;
        }
        ListView a = dVar.mo1260a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (C0247d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (C0247d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (E == dVar2.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: G */
    public final int mo1234G() {
        return jt4.m18928Z(this.f1047a) == 1 ? 0 : 1;
    }

    /* renamed from: H */
    public final int mo1235H(int i) {
        List<C0243d> list = this.f1055b;
        ListView a = list.get(list.size() - 1).mo1260a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1054b.getWindowVisibleDisplayFrame(rect);
        return this.f1067s == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: I */
    public final void mo1236I(@mr2 C0248e eVar) {
        View view;
        C0243d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1044a);
        C0247d dVar2 = new C0247d(eVar, from, this.f1056b, f1040v);
        if (!mo1238c() && this.f1059e) {
            dVar2.mo1279e(true);
        } else if (mo1238c()) {
            dVar2.mo1279e(ih2.m17525A(eVar));
        }
        int r = ih2.m17527r(dVar2, (ViewGroup) null, this.f1044a, this.f1062n);
        MenuPopupWindow C = mo1230C();
        C.mo1884e(dVar2);
        C.mo2040U(r);
        C.mo2042W(this.f1066r);
        if (this.f1055b.size() > 0) {
            List<C0243d> list = this.f1055b;
            dVar = list.get(list.size() - 1);
            view = mo1233F(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            C.mo2090s0(false);
            C.mo2087p0((Object) null);
            int H = mo1235H(r);
            boolean z = H == 1;
            this.f1067s = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C.mo2038S(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1047a.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1066r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1047a.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1066r & 5) != 5) {
                if (z) {
                    r = view.getWidth();
                }
                i3 = i - r;
                C.mo2061m(i3);
                C.mo2056h0(true);
                C.mo2066q(i2);
            } else if (!z) {
                r = view.getWidth();
                i3 = i - r;
                C.mo2061m(i3);
                C.mo2056h0(true);
                C.mo2066q(i2);
            }
            i3 = i + r;
            C.mo2061m(i3);
            C.mo2056h0(true);
            C.mo2066q(i2);
        } else {
            if (this.f1057c) {
                C.mo2061m(this.f1068t);
            }
            if (this.f1058d) {
                C.mo2066q(this.f1069u);
            }
            C.mo2043X(mo17764q());
        }
        this.f1055b.add(new C0243d(C, eVar, this.f1067s));
        C.mo1237a();
        ListView l = C.mo1241l();
        l.setOnKeyListener(this);
        if (dVar == null && this.f1060f && eVar.mo1285A() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(za3.C4065j.abc_popup_menu_header_item_layout, l, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.mo1285A());
            l.addHeaderView(frameLayout, (Object) null, false);
            C.mo1237a();
        }
    }

    /* renamed from: a */
    public void mo1237a() {
        if (!mo1238c()) {
            for (C0248e I : this.f1053a) {
                mo1236I(I);
            }
            this.f1053a.clear();
            View view = this.f1047a;
            this.f1054b = view;
            if (view != null) {
                boolean z = this.f1049a == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f1049a = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1048a);
                }
                this.f1054b.addOnAttachStateChangeListener(this.f1046a);
            }
        }
    }

    /* renamed from: b */
    public void mo1212b(C0248e eVar, boolean z) {
        int D = mo1231D(eVar);
        if (D >= 0) {
            int i = D + 1;
            if (i < this.f1055b.size()) {
                this.f1055b.get(i).f1078a.mo1332f(false);
            }
            C0243d remove = this.f1055b.remove(D);
            remove.f1078a.mo1302S(this);
            if (this.f1061g) {
                remove.f1079a.mo2088q0((Object) null);
                remove.f1079a.mo2039T(0);
            }
            remove.f1079a.dismiss();
            int size = this.f1055b.size();
            this.f1067s = size > 0 ? this.f1055b.get(size - 1).f1077a : mo1234G();
            if (size == 0) {
                dismiss();
                C0258j.C0259a aVar = this.f1051a;
                if (aVar != null) {
                    aVar.mo1072b(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1049a;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1049a.removeGlobalOnLayoutListener(this.f1048a);
                    }
                    this.f1049a = null;
                }
                this.f1054b.removeOnAttachStateChangeListener(this.f1046a);
                this.f1050a.onDismiss();
            } else if (z) {
                this.f1055b.get(0).f1078a.mo1332f(false);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1238c() {
        return this.f1055b.size() > 0 && this.f1055b.get(0).f1079a.mo1238c();
    }

    /* renamed from: d */
    public void mo1214d(boolean z) {
        for (C0243d a : this.f1055b) {
            ih2.m17526B(a.mo1260a().getAdapter()).notifyDataSetChanged();
        }
    }

    public void dismiss() {
        int size = this.f1055b.size();
        if (size > 0) {
            C0243d[] dVarArr = (C0243d[]) this.f1055b.toArray(new C0243d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0243d dVar = dVarArr[i];
                if (dVar.f1079a.mo1238c()) {
                    dVar.f1079a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo1215e() {
        return false;
    }

    /* renamed from: h */
    public boolean mo1219h(C0265m mVar) {
        for (C0243d next : this.f1055b) {
            if (mVar == next.f1078a) {
                next.mo1260a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        mo1243o(mVar);
        C0258j.C0259a aVar = this.f1051a;
        if (aVar != null) {
            aVar.mo1073c(mVar);
        }
        return true;
    }

    /* renamed from: i */
    public Parcelable mo1240i() {
        return null;
    }

    /* renamed from: j */
    public void mo1220j(C0258j.C0259a aVar) {
        this.f1051a = aVar;
    }

    /* renamed from: l */
    public ListView mo1241l() {
        if (this.f1055b.isEmpty()) {
            return null;
        }
        List<C0243d> list = this.f1055b;
        return list.get(list.size() - 1).mo1260a();
    }

    /* renamed from: n */
    public void mo1242n(Parcelable parcelable) {
    }

    /* renamed from: o */
    public void mo1243o(C0248e eVar) {
        eVar.mo1323c(this, this.f1044a);
        if (mo1238c()) {
            mo1236I(eVar);
        } else {
            this.f1053a.add(eVar);
        }
    }

    public void onDismiss() {
        C0243d dVar;
        int size = this.f1055b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1055b.get(i);
            if (!dVar.f1079a.mo1238c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f1078a.mo1332f(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public boolean mo1246p() {
        return false;
    }

    /* renamed from: s */
    public void mo1247s(@mr2 View view) {
        if (this.f1047a != view) {
            this.f1047a = view;
            this.f1066r = ri1.m26762d(this.f1065q, jt4.m18928Z(view));
        }
    }

    /* renamed from: u */
    public void mo1248u(boolean z) {
        this.f1059e = z;
    }

    /* renamed from: v */
    public void mo1249v(int i) {
        if (this.f1065q != i) {
            this.f1065q = i;
            this.f1066r = ri1.m26762d(i, jt4.m18928Z(this.f1047a));
        }
    }

    /* renamed from: w */
    public void mo1250w(int i) {
        this.f1057c = true;
        this.f1068t = i;
    }

    /* renamed from: x */
    public void mo1251x(PopupWindow.OnDismissListener onDismissListener) {
        this.f1050a = onDismissListener;
    }

    /* renamed from: y */
    public void mo1252y(boolean z) {
        this.f1060f = z;
    }

    /* renamed from: z */
    public void mo1253z(int i) {
        this.f1058d = true;
        this.f1069u = i;
    }
}
