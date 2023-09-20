package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import javax.annotation.CheckForNull;

public final class mi5 extends ui5 {

    /* renamed from: a */
    public final /* synthetic */ ui5 f16122a;

    /* renamed from: o */
    public final transient int f16123o;

    /* renamed from: p */
    public final transient int f16124p;

    public mi5(ui5 ui5, int i, int i2) {
        this.f16122a = ui5;
        this.f16123o = i;
        this.f16124p = i2;
    }

    /* renamed from: e */
    public final int mo13127e() {
        return this.f16122a.mo13128f() + this.f16123o + this.f16124p;
    }

    /* renamed from: f */
    public final int mo13128f() {
        return this.f16122a.mo13128f() + this.f16123o;
    }

    public final Object get(int i) {
        pg5.m24693a(i, this.f16124p, FirebaseAnalytics.C4305d.f24955X);
        return this.f16122a.get(i + this.f16123o);
    }

    @CheckForNull
    /* renamed from: i */
    public final Object[] mo13131i() {
        return this.f16122a.mo13131i();
    }

    /* renamed from: j */
    public final ui5 mo20421j(int i, int i2) {
        pg5.m24697e(i, i2, this.f16124p);
        ui5 ui5 = this.f16122a;
        int i3 = this.f16123o;
        return ui5.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f16124p;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
