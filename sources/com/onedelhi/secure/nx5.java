package com.onedelhi.secure;

import android.os.Bundle;
import com.onedelhi.secure.C1767b9;

public final class nx5 implements C1767b9.C1770c {

    /* renamed from: a */
    public final /* synthetic */ k26 f32849a;

    public nx5(k26 k26) {
        this.f32849a = k26;
    }

    /* renamed from: a */
    public final void mo10736a(String str, String str2, Bundle bundle, long j) {
        if (this.f32849a.f31094a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i = is5.f30448a;
            String a = le6.m20590a(str2);
            if (a != null) {
                str2 = a;
            }
            bundle2.putString("events", str2);
            this.f32849a.f31091a.mo31408a(2, bundle2);
        }
    }
}
