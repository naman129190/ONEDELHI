package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import javax.annotation.CheckForNull;

public final class ak6 extends vk6 {

    /* renamed from: a */
    public final /* synthetic */ vk6 f9346a;

    /* renamed from: o */
    public final transient int f9347o;

    /* renamed from: p */
    public final transient int f9348p;

    public ak6(vk6 vk6, int i, int i2) {
        this.f9346a = vk6;
        this.f9347o = i;
        this.f9348p = i2;
    }

    /* renamed from: e */
    public final int mo13136e() {
        return this.f9346a.mo13137f() + this.f9347o + this.f9348p;
    }

    /* renamed from: f */
    public final int mo13137f() {
        return this.f9346a.mo13137f() + this.f9347o;
    }

    public final Object get(int i) {
        ui6.m29377a(i, this.f9348p, FirebaseAnalytics.C4305d.f24955X);
        return this.f9346a.get(i + this.f9347o);
    }

    @CheckForNull
    /* renamed from: i */
    public final Object[] mo13139i() {
        return this.f9346a.mo13139i();
    }

    /* renamed from: j */
    public final vk6 mo13140j(int i, int i2) {
        ui6.m29379c(i, i2, this.f9348p);
        vk6 vk6 = this.f9346a;
        int i3 = this.f9347o;
        return vk6.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f9348p;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
