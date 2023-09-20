package com.onedelhi.secure;

import android.view.View;
import android.view.ViewStub;
import androidx.databinding.ViewDataBinding;

public class fv4 {

    /* renamed from: a */
    public View f12351a;

    /* renamed from: a */
    public ViewStub.OnInflateListener f12352a;

    /* renamed from: a */
    public ViewStub f12353a;

    /* renamed from: a */
    public ViewDataBinding f12354a;

    /* renamed from: b */
    public ViewStub.OnInflateListener f12355b;

    /* renamed from: b */
    public ViewDataBinding f12356b;

    /* renamed from: com.onedelhi.secure.fv4$a */
    public class C2205a implements ViewStub.OnInflateListener {
        public C2205a() {
        }

        public void onInflate(ViewStub viewStub, View view) {
            View unused = fv4.this.f12351a = view;
            fv4 fv4 = fv4.this;
            ViewDataBinding unused2 = fv4.f12354a = ed0.m13688c(fv4.f12356b.f3395a, view, viewStub.getLayoutResource());
            ViewStub unused3 = fv4.this.f12353a = null;
            if (fv4.this.f12352a != null) {
                fv4.this.f12352a.onInflate(viewStub, view);
                ViewStub.OnInflateListener unused4 = fv4.this.f12352a = null;
            }
            fv4.this.f12356b.mo3919d0();
            fv4.this.f12356b.mo3935z();
        }
    }

    public fv4(@mr2 ViewStub viewStub) {
        C2205a aVar = new C2205a();
        this.f12355b = aVar;
        this.f12353a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    @ts2
    /* renamed from: g */
    public ViewDataBinding mo16190g() {
        return this.f12354a;
    }

    /* renamed from: h */
    public View mo16191h() {
        return this.f12351a;
    }

    @ts2
    /* renamed from: i */
    public ViewStub mo16192i() {
        return this.f12353a;
    }

    /* renamed from: j */
    public boolean mo16193j() {
        return this.f12351a != null;
    }

    /* renamed from: k */
    public void mo16194k(@mr2 ViewDataBinding viewDataBinding) {
        this.f12356b = viewDataBinding;
    }

    /* renamed from: l */
    public void mo16195l(@ts2 ViewStub.OnInflateListener onInflateListener) {
        if (this.f12353a != null) {
            this.f12352a = onInflateListener;
        }
    }
}
