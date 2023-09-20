package com.onedelhi.secure;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C1407a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

public final class b95 extends n85 {

    /* renamed from: a */
    public final Context f9767a;

    public b95(Context context) {
        this.f9767a = context;
    }

    /* renamed from: e4 */
    public final void mo13564e4() {
        mo13565k8();
        k85.m19555c(this.f9767a).mo18958d();
    }

    /* renamed from: k8 */
    public final void mo13565k8() {
        if (!UidVerifier.isGooglePlayServicesUid(this.f9767a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            throw new SecurityException("Calling UID " + callingUid + " is not Google Play services.");
        }
    }

    /* renamed from: r1 */
    public final void mo13566r1() {
        mo13565k8();
        b44 b = b44.m11561b(this.f9767a);
        GoogleSignInAccount c = b.mo13410c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f7303a;
        if (c != null) {
            googleSignInOptions = b.mo13411d();
        }
        wh1 d = C1407a.m8844d(this.f9767a, googleSignInOptions);
        if (c != null) {
            d.mo26535W();
        } else {
            d.mo26538h();
        }
    }
}
