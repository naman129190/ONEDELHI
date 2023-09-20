package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.onedelhi.secure.ju4;
import com.onedelhi.secure.mr2;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public int f7728a = 0;

    /* renamed from: a */
    public ju4 f7729a;

    /* renamed from: b */
    public int f7730b = 0;

    public ViewOffsetBehavior() {
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: G */
    public int mo10925G() {
        ju4 ju4 = this.f7729a;
        if (ju4 != null) {
            return ju4.mo18670d();
        }
        return 0;
    }

    /* renamed from: H */
    public int mo10926H() {
        ju4 ju4 = this.f7729a;
        if (ju4 != null) {
            return ju4.mo18671e();
        }
        return 0;
    }

    /* renamed from: I */
    public boolean mo10927I() {
        ju4 ju4 = this.f7729a;
        return ju4 != null && ju4.mo18672f();
    }

    /* renamed from: J */
    public boolean mo10928J() {
        ju4 ju4 = this.f7729a;
        return ju4 != null && ju4.mo18673g();
    }

    /* renamed from: K */
    public void mo11060K(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, int i) {
        coordinatorLayout.mo3583N(v, i);
    }

    /* renamed from: L */
    public void mo10929L(boolean z) {
        ju4 ju4 = this.f7729a;
        if (ju4 != null) {
            ju4.mo18675i(z);
        }
    }

    /* renamed from: M */
    public boolean mo10930M(int i) {
        ju4 ju4 = this.f7729a;
        if (ju4 != null) {
            return ju4.mo18676j(i);
        }
        this.f7730b = i;
        return false;
    }

    /* renamed from: N */
    public boolean mo10931N(int i) {
        ju4 ju4 = this.f7729a;
        if (ju4 != null) {
            return ju4.mo18677k(i);
        }
        this.f7728a = i;
        return false;
    }

    /* renamed from: O */
    public void mo10932O(boolean z) {
        ju4 ju4 = this.f7729a;
        if (ju4 != null) {
            ju4.mo18678l(z);
        }
    }

    /* renamed from: m */
    public boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, int i) {
        mo11060K(coordinatorLayout, v, i);
        if (this.f7729a == null) {
            this.f7729a = new ju4(v);
        }
        this.f7729a.mo18674h();
        this.f7729a.mo18667a();
        int i2 = this.f7728a;
        if (i2 != 0) {
            this.f7729a.mo18677k(i2);
            this.f7728a = 0;
        }
        int i3 = this.f7730b;
        if (i3 == 0) {
            return true;
        }
        this.f7729a.mo18676j(i3);
        this.f7730b = 0;
        return true;
    }
}
