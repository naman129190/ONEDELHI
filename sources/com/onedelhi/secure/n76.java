package com.onedelhi.secure;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

public final class n76 {

    /* renamed from: a */
    public final /* synthetic */ q76 f17222a;

    /* renamed from: a */
    public final String f17223a;

    /* renamed from: a */
    public boolean f17224a;

    /* renamed from: b */
    public String f17225b;

    public n76(q76 q76, String str, String str2) {
        this.f17222a = q76;
        Preconditions.checkNotEmpty(str);
        this.f17223a = str;
    }

    @ly4
    /* renamed from: a */
    public final String mo20989a() {
        if (!this.f17224a) {
            this.f17224a = true;
            this.f17225b = this.f17222a.mo22924o().getString(this.f17223a, (String) null);
        }
        return this.f17225b;
    }

    @ly4
    /* renamed from: b */
    public final void mo20990b(String str) {
        SharedPreferences.Editor edit = this.f17222a.mo22924o().edit();
        edit.putString(this.f17223a, str);
        edit.apply();
        this.f17225b = str;
    }
}
