package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zb5 {

    /* renamed from: a */
    public mb5 f23564a;

    /* renamed from: a */
    public final List f23565a;

    /* renamed from: b */
    public mb5 f23566b;

    public zb5() {
        this.f23564a = new mb5("", 0, (Map) null);
        this.f23566b = new mb5("", 0, (Map) null);
        this.f23565a = new ArrayList();
    }

    public zb5(mb5 mb5) {
        this.f23564a = mb5;
        this.f23566b = mb5.clone();
        this.f23565a = new ArrayList();
    }

    /* renamed from: a */
    public final mb5 mo27900a() {
        return this.f23564a;
    }

    /* renamed from: b */
    public final mb5 mo27901b() {
        return this.f23566b;
    }

    /* renamed from: c */
    public final List mo27902c() {
        return this.f23565a;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zb5 zb5 = new zb5(this.f23564a.clone());
        for (mb5 b : this.f23565a) {
            zb5.f23565a.add(b.clone());
        }
        return zb5;
    }

    /* renamed from: d */
    public final void mo27904d(mb5 mb5) {
        this.f23564a = mb5;
        this.f23566b = mb5.clone();
        this.f23565a.clear();
    }

    /* renamed from: e */
    public final void mo27905e(String str, long j, Map map) {
        this.f23565a.add(new mb5(str, j, map));
    }

    /* renamed from: f */
    public final void mo27906f(mb5 mb5) {
        this.f23566b = mb5;
    }
}
