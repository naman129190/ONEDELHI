package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0258j;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ih2;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.view.menu.i */
public class C0255i implements C0252g {

    /* renamed from: d */
    public static final int f1176d = 48;

    /* renamed from: a */
    public final int f1177a;

    /* renamed from: a */
    public final Context f1178a;

    /* renamed from: a */
    public View f1179a;

    /* renamed from: a */
    public PopupWindow.OnDismissListener f1180a;

    /* renamed from: a */
    public final C0248e f1181a;

    /* renamed from: a */
    public C0258j.C0259a f1182a;

    /* renamed from: a */
    public ih2 f1183a;

    /* renamed from: a */
    public final boolean f1184a;

    /* renamed from: b */
    public final int f1185b;

    /* renamed from: b */
    public final PopupWindow.OnDismissListener f1186b;

    /* renamed from: b */
    public boolean f1187b;

    /* renamed from: c */
    public int f1188c;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    public class C0256a implements PopupWindow.OnDismissListener {
        public C0256a() {
        }

        public void onDismiss() {
            C0255i.this.mo1475g();
        }
    }

    @sj3(17)
    /* renamed from: androidx.appcompat.view.menu.i$b */
    public static class C0257b {
        @pn0
        /* renamed from: a */
        public static void m1988a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0255i(@mr2 Context context, @mr2 C0248e eVar) {
        this(context, eVar, (View) null, false, za3.C4057b.popupMenuStyle, 0);
    }

    public C0255i(@mr2 Context context, @mr2 C0248e eVar, @mr2 View view) {
        this(context, eVar, view, false, za3.C4057b.popupMenuStyle, 0);
    }

    public C0255i(@mr2 Context context, @mr2 C0248e eVar, @mr2 View view, boolean z, @C3982yb int i) {
        this(context, eVar, view, z, i, 0);
    }

    public C0255i(@mr2 Context context, @mr2 C0248e eVar, @mr2 View view, boolean z, @C3982yb int i, @e64 int i2) {
        this.f1188c = ri1.f19869b;
        this.f1186b = new C0256a();
        this.f1178a = context;
        this.f1181a = eVar;
        this.f1179a = view;
        this.f1184a = z;
        this.f1177a = i;
        this.f1185b = i2;
    }

    /* renamed from: a */
    public void mo1380a(@ts2 C0258j.C0259a aVar) {
        this.f1182a = aVar;
        ih2 ih2 = this.f1183a;
        if (ih2 != null) {
            ih2.mo1220j(aVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.j, com.onedelhi.secure.ih2] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.onedelhi.secure.mr2
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.ih2 mo1470b() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1178a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.C0255i.C0257b.m1988a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1178a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.onedelhi.secure.za3.C4060e.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0042
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f1178a
            android.view.View r3 = r14.f1179a
            int r4 = r14.f1177a
            int r5 = r14.f1185b
            boolean r6 = r14.f1184a
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0054
        L_0x0042:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r8 = r14.f1178a
            androidx.appcompat.view.menu.e r9 = r14.f1181a
            android.view.View r10 = r14.f1179a
            int r11 = r14.f1177a
            int r12 = r14.f1185b
            boolean r13 = r14.f1184a
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0054:
            androidx.appcompat.view.menu.e r1 = r14.f1181a
            r0.mo1243o(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1186b
            r0.mo1251x(r1)
            android.view.View r1 = r14.f1179a
            r0.mo1247s(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f1182a
            r0.mo1220j(r1)
            boolean r1 = r14.f1187b
            r0.mo1248u(r1)
            int r1 = r14.f1188c
            r0.mo1249v(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0255i.mo1470b():com.onedelhi.secure.ih2");
    }

    /* renamed from: c */
    public int mo1471c() {
        return this.f1188c;
    }

    /* renamed from: d */
    public ListView mo1472d() {
        return mo1473e().mo1241l();
    }

    public void dismiss() {
        if (mo1474f()) {
            this.f1183a.dismiss();
        }
    }

    @mr2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: e */
    public ih2 mo1473e() {
        if (this.f1183a == null) {
            this.f1183a = mo1470b();
        }
        return this.f1183a;
    }

    /* renamed from: f */
    public boolean mo1474f() {
        ih2 ih2 = this.f1183a;
        return ih2 != null && ih2.mo1238c();
    }

    /* renamed from: g */
    public void mo1475g() {
        this.f1183a = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1180a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: h */
    public void mo1476h(@mr2 View view) {
        this.f1179a = view;
    }

    /* renamed from: i */
    public void mo1477i(boolean z) {
        this.f1187b = z;
        ih2 ih2 = this.f1183a;
        if (ih2 != null) {
            ih2.mo1248u(z);
        }
    }

    /* renamed from: j */
    public void mo1478j(int i) {
        this.f1188c = i;
    }

    /* renamed from: k */
    public void mo1479k(@ts2 PopupWindow.OnDismissListener onDismissListener) {
        this.f1180a = onDismissListener;
    }

    /* renamed from: l */
    public void mo1480l() {
        if (!mo1483o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public void mo1481m(int i, int i2) {
        if (!mo1484p(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: n */
    public final void mo1482n(int i, int i2, boolean z, boolean z2) {
        ih2 e = mo1473e();
        e.mo1252y(z2);
        if (z) {
            if ((ri1.m26762d(this.f1188c, jt4.m18928Z(this.f1179a)) & 7) == 5) {
                i -= this.f1179a.getWidth();
            }
            e.mo1250w(i);
            e.mo1253z(i2);
            int i3 = (int) ((this.f1178a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            e.mo17765t(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        e.mo1237a();
    }

    /* renamed from: o */
    public boolean mo1483o() {
        if (mo1474f()) {
            return true;
        }
        if (this.f1179a == null) {
            return false;
        }
        mo1482n(0, 0, false, false);
        return true;
    }

    /* renamed from: p */
    public boolean mo1484p(int i, int i2) {
        if (mo1474f()) {
            return true;
        }
        if (this.f1179a == null) {
            return false;
        }
        mo1482n(i, i2, true, true);
        return true;
    }
}
