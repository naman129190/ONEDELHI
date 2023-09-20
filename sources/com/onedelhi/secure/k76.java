package com.onedelhi.secure;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;

public final class k76 {

    /* renamed from: a */
    public final long f14778a;

    /* renamed from: a */
    public final /* synthetic */ q76 f14779a;

    /* renamed from: a */
    public final String f14780a;

    /* renamed from: b */
    public final String f14781b;

    /* renamed from: c */
    public final String f14782c;

    public /* synthetic */ k76(q76 q76, String str, long j, h76 h76) {
        this.f14779a = q76;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j > 0);
        this.f14780a = "health_monitor:start";
        this.f14781b = "health_monitor:count";
        this.f14782c = "health_monitor:value";
        this.f14778a = j;
    }

    @ly4
    /* renamed from: a */
    public final Pair mo18943a() {
        long j;
        this.f14779a.mo15139h();
        this.f14779a.mo15139h();
        long c = mo18945c();
        if (c == 0) {
            mo18946d();
            j = 0;
        } else {
            j = Math.abs(c - this.f14779a.f11205a.mo15133a().currentTimeMillis());
        }
        long j2 = this.f14778a;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            mo18946d();
            return null;
        }
        String string = this.f14779a.mo22924o().getString(this.f14782c, (String) null);
        long j3 = this.f14779a.mo22924o().getLong(this.f14781b, 0);
        mo18946d();
        return (string == null || j3 <= 0) ? q76.f18939a : new Pair(string, Long.valueOf(j3));
    }

    @ly4
    /* renamed from: b */
    public final void mo18944b(String str, long j) {
        this.f14779a.mo15139h();
        if (mo18945c() == 0) {
            mo18946d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f14779a.mo22924o().getLong(this.f14781b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f14779a.mo22924o().edit();
            edit.putString(this.f14782c, str);
            edit.putLong(this.f14781b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f14779a.mo22924o().edit();
        if ((this.f14779a.f11205a.mo27871N().mo16892u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f14782c, str);
        }
        edit2.putLong(this.f14781b, j3);
        edit2.apply();
    }

    @ly4
    /* renamed from: c */
    public final long mo18945c() {
        return this.f14779a.mo22924o().getLong(this.f14780a, 0);
    }

    @ly4
    /* renamed from: d */
    public final void mo18946d() {
        this.f14779a.mo15139h();
        long currentTimeMillis = this.f14779a.f11205a.mo15133a().currentTimeMillis();
        SharedPreferences.Editor edit = this.f14779a.mo22924o().edit();
        edit.remove(this.f14781b);
        edit.remove(this.f14782c);
        edit.putLong(this.f14780a, currentTimeMillis);
        edit.apply();
    }
}
