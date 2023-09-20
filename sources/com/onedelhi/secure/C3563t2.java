package com.onedelhi.secure;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.onedelhi.secure.hl3;

/* renamed from: com.onedelhi.secure.t2 */
public abstract class C3563t2 {

    /* renamed from: a */
    public Object f20626a;

    /* renamed from: b */
    public boolean f20627b;

    /* renamed from: com.onedelhi.secure.t2$a */
    public interface C3564a {
        /* renamed from: a */
        boolean mo1074a(C3563t2 t2Var, Menu menu);

        /* renamed from: b */
        boolean mo1075b(C3563t2 t2Var, MenuItem menuItem);

        /* renamed from: c */
        boolean mo1076c(C3563t2 t2Var, Menu menu);

        /* renamed from: d */
        void mo1077d(C3563t2 t2Var);
    }

    /* renamed from: c */
    public abstract void mo1150c();

    /* renamed from: d */
    public abstract View mo1151d();

    /* renamed from: e */
    public abstract Menu mo1152e();

    /* renamed from: f */
    public abstract MenuInflater mo1153f();

    /* renamed from: g */
    public abstract CharSequence mo1154g();

    /* renamed from: h */
    public Object mo24685h() {
        return this.f20626a;
    }

    /* renamed from: i */
    public abstract CharSequence mo1155i();

    /* renamed from: j */
    public boolean mo24686j() {
        return this.f20627b;
    }

    /* renamed from: k */
    public abstract void mo1156k();

    /* renamed from: l */
    public boolean mo1157l() {
        return false;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public boolean mo19266m() {
        return true;
    }

    /* renamed from: n */
    public abstract void mo1158n(View view);

    /* renamed from: o */
    public abstract void mo1159o(int i);

    /* renamed from: p */
    public abstract void mo1160p(CharSequence charSequence);

    /* renamed from: q */
    public void mo24687q(Object obj) {
        this.f20626a = obj;
    }

    /* renamed from: r */
    public abstract void mo1161r(int i);

    /* renamed from: s */
    public abstract void mo1162s(CharSequence charSequence);

    /* renamed from: t */
    public void mo1163t(boolean z) {
        this.f20627b = z;
    }
}
