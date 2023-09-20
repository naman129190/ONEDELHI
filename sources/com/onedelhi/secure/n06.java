package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import javax.annotation.CheckForNull;

public final class n06 extends r06 {

    /* renamed from: a */
    public final /* synthetic */ r06 f16964a;

    /* renamed from: n */
    public final transient int f16965n;

    /* renamed from: o */
    public final transient int f16966o;

    public n06(r06 r06, int i, int i2) {
        this.f16964a = r06;
        this.f16965n = i;
        this.f16966o = i2;
    }

    /* renamed from: e */
    public final int mo15673e() {
        return this.f16964a.mo15674f() + this.f16965n + this.f16966o;
    }

    /* renamed from: f */
    public final int mo15674f() {
        return this.f16964a.mo15674f() + this.f16965n;
    }

    public final Object get(int i) {
        tz5.m29033a(i, this.f16966o, FirebaseAnalytics.C4305d.f24955X);
        return this.f16964a.get(i + this.f16965n);
    }

    /* renamed from: j */
    public final boolean mo15678j() {
        return true;
    }

    @CheckForNull
    /* renamed from: k */
    public final Object[] mo15679k() {
        return this.f16964a.mo15679k();
    }

    /* renamed from: l */
    public final r06 mo20831l(int i, int i2) {
        tz5.m29035c(i, i2, this.f16966o);
        r06 r06 = this.f16964a;
        int i3 = this.f16965n;
        return r06.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f16966o;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
