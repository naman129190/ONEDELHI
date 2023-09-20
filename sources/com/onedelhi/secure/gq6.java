package com.onedelhi.secure;

import android.os.Bundle;
import android.text.TextUtils;

public final class gq6 implements er6 {

    /* renamed from: a */
    public final /* synthetic */ qq6 f12720a;

    public gq6(qq6 qq6) {
        this.f12720a = qq6;
    }

    /* renamed from: a */
    public final void mo13092a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            qq6 qq6 = this.f12720a;
            if (qq6.f19420a != null) {
                qq6.f19420a.mo15136e().mo12726r().mo25380b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f12720a.mo15135d().mo23065z(new lp6(this, str, "_err", bundle));
    }
}
