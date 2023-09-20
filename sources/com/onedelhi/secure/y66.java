package com.onedelhi.secure;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

public final class y66 {

    /* renamed from: a */
    public final /* synthetic */ q76 f22904a;

    /* renamed from: a */
    public final String f22905a;

    /* renamed from: a */
    public final boolean f22906a;

    /* renamed from: b */
    public boolean f22907b;

    /* renamed from: c */
    public boolean f22908c;

    public y66(q76 q76, String str, boolean z) {
        this.f22904a = q76;
        Preconditions.checkNotEmpty(str);
        this.f22905a = str;
        this.f22906a = z;
    }

    @ly4
    /* renamed from: a */
    public final void mo27237a(boolean z) {
        SharedPreferences.Editor edit = this.f22904a.mo22924o().edit();
        edit.putBoolean(this.f22905a, z);
        edit.apply();
        this.f22908c = z;
    }

    @ly4
    /* renamed from: b */
    public final boolean mo27238b() {
        if (!this.f22907b) {
            this.f22907b = true;
            this.f22908c = this.f22904a.mo22924o().getBoolean(this.f22905a, this.f22906a);
        }
        return this.f22908c;
    }
}
