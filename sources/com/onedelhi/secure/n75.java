package com.onedelhi.secure;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public final class n75 extends f75 {

    /* renamed from: a */
    public final /* synthetic */ q75 f17221a;

    public n75(q75 q75) {
        this.f17221a = q75;
    }

    /* renamed from: k2 */
    public final void mo15878k2(Status status, Credential credential) {
        this.f17221a.setResult(new j75(status, credential));
    }

    /* renamed from: m0 */
    public final void mo14070m0(Status status) {
        this.f17221a.setResult(new j75(status, (Credential) null));
    }
}
