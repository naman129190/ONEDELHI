package com.onedelhi.secure;

import android.graphics.Rect;
import java.util.List;

public class zm0 {

    /* renamed from: a */
    public static final String f38371a = "zm0";

    /* renamed from: a */
    public int f38372a;

    /* renamed from: a */
    public pz3 f38373a;

    /* renamed from: a */
    public v43 f38374a = new d71();

    /* renamed from: a */
    public boolean f38375a = false;

    public zm0(int i) {
        this.f38372a = i;
    }

    public zm0(int i, pz3 pz3) {
        this.f38372a = i;
        this.f38373a = pz3;
    }

    /* renamed from: a */
    public pz3 mo48321a(List<pz3> list, boolean z) {
        return this.f38374a.mo42357b(list, mo48322b(z));
    }

    /* renamed from: b */
    public pz3 mo48322b(boolean z) {
        pz3 pz3 = this.f38373a;
        if (pz3 == null) {
            return null;
        }
        return z ? pz3.mo42987e() : pz3;
    }

    /* renamed from: c */
    public v43 mo48323c() {
        return this.f38374a;
    }

    /* renamed from: d */
    public int mo48324d() {
        return this.f38372a;
    }

    /* renamed from: e */
    public pz3 mo48325e() {
        return this.f38373a;
    }

    /* renamed from: f */
    public Rect mo48326f(pz3 pz3) {
        return this.f38374a.mo34242d(pz3, this.f38373a);
    }

    /* renamed from: g */
    public void mo48327g(v43 v43) {
        this.f38374a = v43;
    }
}
