package com.onedelhi.secure;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class tx0 {
    @mo1

    /* renamed from: a */
    public int f21164a = 0;
    @mr2

    /* renamed from: a */
    public final View f21165a;

    /* renamed from: a */
    public boolean f21166a = false;

    public tx0(sx0 sx0) {
        this.f21165a = (View) sx0;
    }

    /* renamed from: a */
    public final void mo25330a() {
        ViewParent parent = this.f21165a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo3608m(this.f21165a);
        }
    }

    @mo1
    /* renamed from: b */
    public int mo25331b() {
        return this.f21164a;
    }

    /* renamed from: c */
    public boolean mo25332c() {
        return this.f21166a;
    }

    /* renamed from: d */
    public void mo25333d(@mr2 Bundle bundle) {
        this.f21166a = bundle.getBoolean("expanded", false);
        this.f21164a = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f21166a) {
            mo25330a();
        }
    }

    @mr2
    /* renamed from: e */
    public Bundle mo25334e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f21166a);
        bundle.putInt("expandedComponentIdHint", this.f21164a);
        return bundle;
    }

    /* renamed from: f */
    public boolean mo25335f(boolean z) {
        if (this.f21166a == z) {
            return false;
        }
        this.f21166a = z;
        mo25330a();
        return true;
    }

    /* renamed from: g */
    public void mo25336g(@mo1 int i) {
        this.f21164a = i;
    }
}
