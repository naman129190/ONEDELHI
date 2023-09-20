package com.onedelhi.secure;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0255i;
import androidx.appcompat.view.menu.C0265m;
import androidx.appcompat.widget.ActionBarContextView;
import com.onedelhi.secure.C3563t2;
import com.onedelhi.secure.hl3;
import java.lang.ref.WeakReference;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class l24 extends C3563t2 implements C0248e.C0249a {

    /* renamed from: a */
    public Context f15144a;

    /* renamed from: a */
    public C0248e f15145a;

    /* renamed from: a */
    public ActionBarContextView f15146a;

    /* renamed from: a */
    public C3563t2.C3564a f15147a;

    /* renamed from: a */
    public WeakReference<View> f15148a;

    /* renamed from: c */
    public boolean f15149c;

    /* renamed from: d */
    public boolean f15150d;

    public l24(Context context, ActionBarContextView actionBarContextView, C3563t2.C3564a aVar, boolean z) {
        this.f15144a = context;
        this.f15146a = actionBarContextView;
        this.f15147a = aVar;
        C0248e Z = new C0248e(actionBarContextView.getContext()).mo1309Z(1);
        this.f15145a = Z;
        Z.mo1307X(this);
        this.f15150d = z;
    }

    /* renamed from: a */
    public void mo1031a(@mr2 C0248e eVar) {
        mo1156k();
        this.f15146a.mo1537o();
    }

    /* renamed from: b */
    public boolean mo1033b(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
        return this.f15147a.mo1075b(this, menuItem);
    }

    /* renamed from: c */
    public void mo1150c() {
        if (!this.f15149c) {
            this.f15149c = true;
            this.f15147a.mo1077d(this);
        }
    }

    /* renamed from: d */
    public View mo1151d() {
        WeakReference<View> weakReference = this.f15148a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo1152e() {
        return this.f15145a;
    }

    /* renamed from: f */
    public MenuInflater mo1153f() {
        return new h74(this.f15146a.getContext());
    }

    /* renamed from: g */
    public CharSequence mo1154g() {
        return this.f15146a.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo1155i() {
        return this.f15146a.getTitle();
    }

    /* renamed from: k */
    public void mo1156k() {
        this.f15147a.mo1076c(this, this.f15145a);
    }

    /* renamed from: l */
    public boolean mo1157l() {
        return this.f15146a.mo1546s();
    }

    /* renamed from: m */
    public boolean mo19266m() {
        return this.f15150d;
    }

    /* renamed from: n */
    public void mo1158n(View view) {
        this.f15146a.setCustomView(view);
        this.f15148a = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: o */
    public void mo1159o(int i) {
        mo1160p(this.f15144a.getString(i));
    }

    /* renamed from: p */
    public void mo1160p(CharSequence charSequence) {
        this.f15146a.setSubtitle(charSequence);
    }

    /* renamed from: r */
    public void mo1161r(int i) {
        mo1162s(this.f15144a.getString(i));
    }

    /* renamed from: s */
    public void mo1162s(CharSequence charSequence) {
        this.f15146a.setTitle(charSequence);
    }

    /* renamed from: t */
    public void mo1163t(boolean z) {
        super.mo1163t(z);
        this.f15146a.setTitleOptional(z);
    }

    /* renamed from: u */
    public void mo19267u(C0248e eVar, boolean z) {
    }

    /* renamed from: v */
    public void mo19268v(C0265m mVar) {
    }

    /* renamed from: w */
    public boolean mo19269w(C0265m mVar) {
        if (!mVar.hasVisibleItems()) {
            return true;
        }
        new C0255i(this.f15146a.getContext(), mVar).mo1480l();
        return true;
    }
}
