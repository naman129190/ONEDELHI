package com.onedelhi.secure;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

public final class e76 {

    /* renamed from: a */
    public final long f11134a;

    /* renamed from: a */
    public final /* synthetic */ q76 f11135a;

    /* renamed from: a */
    public final String f11136a;

    /* renamed from: a */
    public boolean f11137a;

    /* renamed from: b */
    public long f11138b;

    public e76(q76 q76, String str, long j) {
        this.f11135a = q76;
        Preconditions.checkNotEmpty(str);
        this.f11136a = str;
        this.f11134a = j;
    }

    @ly4
    /* renamed from: a */
    public final long mo15075a() {
        if (!this.f11137a) {
            this.f11137a = true;
            this.f11138b = this.f11135a.mo22924o().getLong(this.f11136a, this.f11134a);
        }
        return this.f11138b;
    }

    @ly4
    /* renamed from: b */
    public final void mo15076b(long j) {
        SharedPreferences.Editor edit = this.f11135a.mo22924o().edit();
        edit.putLong(this.f11136a, j);
        edit.apply();
        this.f11138b = j;
    }
}
