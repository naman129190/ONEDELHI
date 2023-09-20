package com.onedelhi.secure;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0255i;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;

public class o33 {

    /* renamed from: a */
    public final Context f17678a;

    /* renamed from: a */
    public View.OnTouchListener f17679a;

    /* renamed from: a */
    public final View f17680a;

    /* renamed from: a */
    public final C0248e f17681a;

    /* renamed from: a */
    public final C0255i f17682a;

    /* renamed from: a */
    public C3027d f17683a;

    /* renamed from: a */
    public C3028e f17684a;

    /* renamed from: com.onedelhi.secure.o33$a */
    public class C3024a implements C0248e.C0249a {
        public C3024a() {
        }

        /* renamed from: a */
        public void mo1031a(@mr2 C0248e eVar) {
        }

        /* renamed from: b */
        public boolean mo1033b(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
            C3028e eVar2 = o33.this.f17684a;
            if (eVar2 != null) {
                return eVar2.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.o33$b */
    public class C3025b implements PopupWindow.OnDismissListener {
        public C3025b() {
        }

        public void onDismiss() {
            o33 o33 = o33.this;
            C3027d dVar = o33.f17683a;
            if (dVar != null) {
                dVar.mo21593a(o33);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.o33$c */
    public class C3026c extends la1 {
        public C3026c(View view) {
            super(view);
        }

        /* renamed from: b */
        public my3 mo1194b() {
            return o33.this.f17682a.mo1473e();
        }

        /* renamed from: c */
        public boolean mo1195c() {
            o33.this.mo21591l();
            return true;
        }

        /* renamed from: d */
        public boolean mo1687d() {
            o33.this.mo21580a();
            return true;
        }
    }

    /* renamed from: com.onedelhi.secure.o33$d */
    public interface C3027d {
        /* renamed from: a */
        void mo21593a(o33 o33);
    }

    /* renamed from: com.onedelhi.secure.o33$e */
    public interface C3028e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public o33(@mr2 Context context, @mr2 View view) {
        this(context, view, 0);
    }

    public o33(@mr2 Context context, @mr2 View view, int i) {
        this(context, view, i, za3.C4057b.popupMenuStyle, 0);
    }

    public o33(@mr2 Context context, @mr2 View view, int i, @C3982yb int i2, @e64 int i3) {
        this.f17678a = context;
        this.f17680a = view;
        C0248e eVar = new C0248e(context);
        this.f17681a = eVar;
        eVar.mo1307X(new C3024a());
        C0255i iVar = new C0255i(context, eVar, view, false, i2, i3);
        this.f17682a = iVar;
        iVar.mo1478j(i);
        iVar.mo1479k(new C3025b());
    }

    /* renamed from: a */
    public void mo21580a() {
        this.f17682a.dismiss();
    }

    @mr2
    /* renamed from: b */
    public View.OnTouchListener mo21581b() {
        if (this.f17679a == null) {
            this.f17679a = new C3026c(this.f17680a);
        }
        return this.f17679a;
    }

    /* renamed from: c */
    public int mo21582c() {
        return this.f17682a.mo1471c();
    }

    @mr2
    /* renamed from: d */
    public Menu mo21583d() {
        return this.f17681a;
    }

    @mr2
    /* renamed from: e */
    public MenuInflater mo21584e() {
        return new h74(this.f17678a);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public ListView mo21585f() {
        if (!this.f17682a.mo1474f()) {
            return null;
        }
        return this.f17682a.mo1472d();
    }

    /* renamed from: g */
    public void mo21586g(@lh2 int i) {
        mo21584e().inflate(i, this.f17681a);
    }

    /* renamed from: h */
    public void mo21587h(boolean z) {
        this.f17682a.mo1477i(z);
    }

    /* renamed from: i */
    public void mo21588i(int i) {
        this.f17682a.mo1478j(i);
    }

    /* renamed from: j */
    public void mo21589j(@ts2 C3027d dVar) {
        this.f17683a = dVar;
    }

    /* renamed from: k */
    public void mo21590k(@ts2 C3028e eVar) {
        this.f17684a = eVar;
    }

    /* renamed from: l */
    public void mo21591l() {
        this.f17682a.mo1480l();
    }
}
