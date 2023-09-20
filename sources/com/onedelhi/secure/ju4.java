package com.onedelhi.secure;

import android.view.View;

public class ju4 {

    /* renamed from: a */
    public int f14566a;

    /* renamed from: a */
    public final View f14567a;

    /* renamed from: a */
    public boolean f14568a = true;

    /* renamed from: b */
    public int f14569b;

    /* renamed from: b */
    public boolean f14570b = true;

    /* renamed from: c */
    public int f14571c;

    /* renamed from: d */
    public int f14572d;

    public ju4(View view) {
        this.f14567a = view;
    }

    /* renamed from: a */
    public void mo18667a() {
        View view = this.f14567a;
        jt4.m18953f1(view, this.f14571c - (view.getTop() - this.f14566a));
        View view2 = this.f14567a;
        jt4.m18949e1(view2, this.f14572d - (view2.getLeft() - this.f14569b));
    }

    /* renamed from: b */
    public int mo18668b() {
        return this.f14569b;
    }

    /* renamed from: c */
    public int mo18669c() {
        return this.f14566a;
    }

    /* renamed from: d */
    public int mo18670d() {
        return this.f14572d;
    }

    /* renamed from: e */
    public int mo18671e() {
        return this.f14571c;
    }

    /* renamed from: f */
    public boolean mo18672f() {
        return this.f14570b;
    }

    /* renamed from: g */
    public boolean mo18673g() {
        return this.f14568a;
    }

    /* renamed from: h */
    public void mo18674h() {
        this.f14566a = this.f14567a.getTop();
        this.f14569b = this.f14567a.getLeft();
    }

    /* renamed from: i */
    public void mo18675i(boolean z) {
        this.f14570b = z;
    }

    /* renamed from: j */
    public boolean mo18676j(int i) {
        if (!this.f14570b || this.f14572d == i) {
            return false;
        }
        this.f14572d = i;
        mo18667a();
        return true;
    }

    /* renamed from: k */
    public boolean mo18677k(int i) {
        if (!this.f14568a || this.f14571c == i) {
            return false;
        }
        this.f14571c = i;
        mo18667a();
        return true;
    }

    /* renamed from: l */
    public void mo18678l(boolean z) {
        this.f14568a = z;
    }
}
