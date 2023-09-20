package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import javax.annotation.CheckForNull;

public final class td5 extends ee5 {

    /* renamed from: a */
    public final /* synthetic */ ee5 f20758a;

    /* renamed from: n */
    public final transient int f20759n;

    /* renamed from: o */
    public final transient int f20760o;

    public td5(ee5 ee5, int i, int i2) {
        this.f20758a = ee5;
        this.f20759n = i;
        this.f20760o = i2;
    }

    /* renamed from: e */
    public final int mo13057e() {
        return this.f20758a.mo13058f() + this.f20759n + this.f20760o;
    }

    /* renamed from: f */
    public final int mo13058f() {
        return this.f20758a.mo13058f() + this.f20759n;
    }

    public final Object get(int i) {
        z17.m32798a(i, this.f20760o, FirebaseAnalytics.C4305d.f24955X);
        return this.f20758a.get(i + this.f20759n);
    }

    /* renamed from: j */
    public final boolean mo13060j() {
        return true;
    }

    @CheckForNull
    /* renamed from: k */
    public final Object[] mo13061k() {
        return this.f20758a.mo13061k();
    }

    /* renamed from: l */
    public final ee5 mo15153l(int i, int i2) {
        z17.m32800c(i, i2, this.f20760o);
        ee5 ee5 = this.f20758a;
        int i3 = this.f20759n;
        return ee5.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f20760o;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
