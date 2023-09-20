package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.onedelhi.secure.j62;

public final class h95 implements j62.C2476a {

    /* renamed from: a */
    public final /* synthetic */ SignInHubActivity f13003a;

    public /* synthetic */ h95(SignInHubActivity signInHubActivity, f95 f95) {
        this.f13003a = signInHubActivity;
    }

    /* renamed from: a */
    public final i62 mo17156a(int i, Bundle bundle) {
        return new a75(this.f13003a, GoogleApiClient.getAllClients());
    }

    /* renamed from: b */
    public final void mo17157b(i62 i62) {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo17158c(i62 i62, Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = this.f13003a;
        signInHubActivity.setResult(signInHubActivity.f7341o, signInHubActivity.f7337a);
        this.f13003a.finish();
    }
}
